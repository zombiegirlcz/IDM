package defpackage;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes15.dex */
public final class q implements X509TrustManager {
    public static q d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f241050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManager f241051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X509Certificate[] f241052c;

    public q() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        ArrayList arrayList = new ArrayList();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        X509TrustManager x509TrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        this.f241050a = x509TrustManager;
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        trustManagerFactory.init(keyStore);
        this.f241051b = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        for (X509Certificate x509Certificate : acceptedIssuers) {
            arrayList.add(x509Certificate);
        }
        for (X509Certificate x509Certificate2 : this.f241051b.getAcceptedIssuers()) {
            arrayList.add(x509Certificate2);
        }
        this.f241052c = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.f241050a.checkClientTrusted(x509CertificateArr, str);
        } catch (Exception unused) {
        }
        this.f241051b.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.f241050a.checkServerTrusted(x509CertificateArr, str);
        } catch (Exception unused) {
            this.f241051b.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f241052c;
    }
}
