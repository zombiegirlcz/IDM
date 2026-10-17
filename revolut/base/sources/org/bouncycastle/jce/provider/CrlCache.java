package org.bouncycastle.jce.provider;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes14.dex */
class CrlCache {
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<PKIXCRLStore>> cache = Collections.synchronizedMap(new WeakHashMap());

    public static class LocalCRLStore<T extends CRL> implements PKIXCRLStore, Iterable<CRL> {
        private Collection<CRL> _local;

        public LocalCRLStore(Store<CRL> store) {
            this._local = new ArrayList(store.getMatches(null));
        }

        @Override // org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Store
        public Collection getMatches(Selector selector) {
            if (selector == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl2 : this._local) {
                if (selector.match(crl2)) {
                    arrayList.add(crl2);
                }
            }
            return arrayList;
        }

        @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    public static synchronized PKIXCRLStore getCrl(CertificateFactory certificateFactory, Date date, URI uri2) throws IOException, CRLException {
        try {
            WeakReference<PKIXCRLStore> weakReference = cache.get(uri2);
            PKIXCRLStore pKIXCRLStore = weakReference != null ? weakReference.get() : null;
            if (pKIXCRLStore != null) {
                Iterator it8 = pKIXCRLStore.getMatches(null).iterator();
                while (it8.hasNext()) {
                    Date nextUpdate = ((X509CRL) it8.next()).getNextUpdate();
                    if (nextUpdate == null || !nextUpdate.before(date)) {
                    }
                }
                return pKIXCRLStore;
            }
            LocalCRLStore localCRLStore = new LocalCRLStore(new CollectionStore(uri2.getScheme().equals("ldap") ? getCrlsFromLDAP(certificateFactory, uri2) : getCrls(certificateFactory, uri2)));
            cache.put(uri2, new WeakReference<>(localCRLStore));
            return localCRLStore;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private static Collection getCrls(CertificateFactory certificateFactory, URI uri2) throws IOException, CRLException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uri2.toURL().openConnection());
        uRLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
        uRLConnection.setReadTimeout(DEFAULT_TIMEOUT);
        InputStream inputStream = uRLConnection.getInputStream();
        Collection<? extends CRL> collectionGenerateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return collectionGenerateCRLs;
    }

    private static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri2) throws IOException, CRLException {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri2.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException("no CRL returned from: " + uri2);
        } catch (NamingException e) {
            throw new CRLException("issue connecting to: " + uri2.toString(), e);
        }
    }
}
