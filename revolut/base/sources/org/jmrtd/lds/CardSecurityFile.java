package org.jmrtd.lds;

import a0.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;

/* JADX INFO: loaded from: classes14.dex */
public class CardSecurityFile implements Serializable {
    private static final String CONTENT_TYPE_OID = "0.4.0.127.0.7.3.2.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3535507558193769952L;
    private X509Certificate certificate;
    private String digestAlgorithm;
    private String digestEncryptionAlgorithm;
    private byte[] encryptedDigest;
    private Set<SecurityInfo> securityInfos;

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate) {
        this(str, str2, collection, privateKey, x509Certificate, null);
    }

    private static ContentInfo toContentInfo(String str, Collection<SecurityInfo> collection) {
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            Iterator<SecurityInfo> it8 = collection.iterator();
            while (it8.hasNext()) {
                aSN1EncodableVector.add(it8.next().getDERObject());
            }
            return new ContentInfo(new ASN1ObjectIdentifier(str), new DEROctetString(new DLSet(aSN1EncodableVector)));
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Error creating signedData", (Throwable) e);
            throw new IllegalArgumentException("Error DER encoding the security infos");
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == null || !obj2.getClass().equals(getClass())) {
            return false;
        }
        CardSecurityFile cardSecurityFile = (CardSecurityFile) obj2;
        Set<SecurityInfo> set = this.securityInfos;
        if (set == null) {
            return cardSecurityFile.securityInfos == null;
        }
        Set<SecurityInfo> set2 = cardSecurityFile.securityInfos;
        return set2 == null ? set == null : set.equals(set2);
    }

    @Deprecated
    public Collection<ChipAuthenticationInfo> getChipAuthenticationInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ChipAuthenticationInfo) {
                arrayList.add((ChipAuthenticationInfo) securityInfo);
            }
        }
        return arrayList;
    }

    @Deprecated
    public Collection<ChipAuthenticationPublicKeyInfo> getChipAuthenticationPublicKeyInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ChipAuthenticationPublicKeyInfo) {
                arrayList.add((ChipAuthenticationPublicKeyInfo) securityInfo);
            }
        }
        return arrayList;
    }

    public String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public String getDigestEncryptionAlgorithm() {
        return this.digestEncryptionAlgorithm;
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                writeContent(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    return byteArray;
                } catch (IOException unused) {
                    return byteArray;
                }
            } catch (IOException e) {
                LOGGER.log(Level.WARNING, "Exception while encoding", (Throwable) e);
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (IOException unused2) {
                    LOGGER.log(Level.FINE, "Error closing stream");
                    return null;
                }
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
                LOGGER.log(Level.FINE, "Error closing stream");
            }
        }
    }

    public byte[] getEncryptedDigest() {
        byte[] bArr = this.encryptedDigest;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Deprecated
    public Collection<PACEInfo> getPACEInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof PACEInfo) {
                arrayList.add((PACEInfo) securityInfo);
            }
        }
        return arrayList;
    }

    public Collection<SecurityInfo> getSecurityInfos() {
        return Collections.unmodifiableCollection(this.securityInfos);
    }

    public int hashCode() {
        return (this.securityInfos.hashCode() * 3) + 63;
    }

    public void readContent(InputStream inputStream) throws IOException {
        SignedData signedData = SignedDataUtil.readSignedData(inputStream);
        this.digestAlgorithm = SignedDataUtil.getSignerInfoDigestAlgorithm(signedData);
        this.digestEncryptionAlgorithm = SignedDataUtil.getDigestEncryptionAlgorithm(signedData);
        List<X509Certificate> certificates = SignedDataUtil.getCertificates(signedData);
        this.certificate = (certificates == null || certificates.isEmpty()) ? null : (X509Certificate) d.e(1, certificates);
        this.securityInfos = getSecurityInfos(signedData);
        this.encryptedDigest = SignedDataUtil.getEncryptedDigest(signedData);
    }

    public String toString() {
        return "CardSecurityFile [" + this.securityInfos.toString() + "]";
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        try {
            SignedDataUtil.writeData(SignedDataUtil.createSignedData(this.digestAlgorithm, this.digestEncryptionAlgorithm, "0.4.0.127.0.7.3.2.1", toContentInfo("0.4.0.127.0.7.3.2.1", this.securityInfos), this.encryptedDigest, this.certificate), outputStream);
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("Unsupported algorithm", e);
        } catch (CertificateException e2) {
            throw new IOException("Certificate exception during SignedData creation", e2);
        } catch (GeneralSecurityException e4) {
            throw new IOException("General security exception", e4);
        }
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate, String str3) {
        this(str, str2, collection, (byte[]) null, x509Certificate);
        this.encryptedDigest = SignedDataUtil.signData(str, str2, "0.4.0.127.0.7.3.2.1", toContentInfo("0.4.0.127.0.7.3.2.1", collection), privateKey, str3);
    }

    private static Set<SecurityInfo> getSecurityInfos(SignedData signedData) throws Throwable {
        ASN1Primitive content = SignedDataUtil.getContent(signedData);
        if (!(content instanceof ASN1Set)) {
            throw new IOException("Was expecting an ASN1Set, found " + content.getClass());
        }
        ASN1Set aSN1Set = (ASN1Set) content;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aSN1Set.size(); i++) {
            try {
                SecurityInfo securityInfo = SecurityInfo.getInstance(aSN1Set.getObjectAt(i));
                if (securityInfo == null) {
                    LOGGER.log(Level.WARNING, "Could not parse, skipping security info");
                } else {
                    hashSet.add(securityInfo);
                }
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Exception while parsing, skipping security info", (Throwable) e);
            }
        }
        return hashSet;
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, byte[] bArr, X509Certificate x509Certificate) {
        if (collection == null) {
            throw new IllegalArgumentException("Null securityInfos");
        }
        if (x509Certificate != null) {
            this.digestAlgorithm = str;
            this.digestEncryptionAlgorithm = str2;
            this.securityInfos = new HashSet(collection);
            this.encryptedDigest = bArr;
            this.certificate = x509Certificate;
            return;
        }
        throw new IllegalArgumentException("Null certificate");
    }

    public CardSecurityFile(InputStream inputStream) throws IOException {
        readContent(inputStream);
    }
}
