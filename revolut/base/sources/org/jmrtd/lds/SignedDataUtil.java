package org.jmrtd.lds;

import j6.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okl.m;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerIdentifier;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.jmrtd.Util;

/* JADX INFO: loaded from: classes14.dex */
public final class SignedDataUtil {
    public static final String PKCS1_RSA_OID = "1.2.840.113549.1.1.1";
    public static final String PKCS1_SHA256_WITH_RSA_OID = "1.2.840.113549.1.1.11";
    public static final String PKCS1_SHA1_WITH_RSA_OID = "1.2.840.113549.1.1.5";
    public static final String X9_SHA512_WITH_ECDSA_OID = "1.2.840.10045.4.3.4";
    public static final String IEEE_P1363_SHA1_OID = "1.3.14.3.2.26";
    public static final String PKCS1_SHA512_WITH_RSA_OID = "1.2.840.113549.1.1.13";
    public static final String PKCS1_MD2_WITH_RSA_OID = "1.2.840.113549.1.1.2";
    public static final String PKCS1_MGF1 = "1.2.840.113549.1.1.8";
    public static final String RFC_3369_CONTENT_TYPE_OID = "1.2.840.113549.1.9.3";
    public static final String RFC_3369_MESSAGE_DIGEST_OID = "1.2.840.113549.1.9.4";
    public static final String X9_SHA224_WITH_ECDSA_OID = "1.2.840.10045.4.3.1";
    public static final String PKCS1_SHA384_WITH_RSA_OID = "1.2.840.113549.1.1.12";
    public static final String RFC_3369_SIGNED_DATA_OID = "1.2.840.113549.1.7.2";
    public static final String PKCS1_MD4_WITH_RSA_OID = "1.2.840.113549.1.1.3";
    public static final String X9_SHA256_WITH_ECDSA_OID = "1.2.840.10045.4.3.2";
    public static final String PKCS1_SHA224_WITH_RSA_OID = "1.2.840.113549.1.1.14";
    public static final String PKCS1_MD5_WITH_RSA_OID = "1.2.840.113549.1.1.4";
    public static final String PKCS1_RSASSA_PSS_OID = "1.2.840.113549.1.1.10";
    public static final String X9_SHA1_WITH_ECDSA_OID = "1.2.840.10045.4.1";
    public static final String X9_SHA384_WITH_ECDSA_OID = "1.2.840.10045.4.3.3";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");

    private SignedDataUtil() {
    }

    private static void checkEContent(Collection<Attribute> collection, String str, byte[] bArr) throws SignatureException, NoSuchAlgorithmException {
        for (Attribute attribute : collection) {
            if ("1.2.840.113549.1.9.4".equals(attribute.getAttrType().getId())) {
                ASN1Set attrValues = attribute.getAttrValues();
                if (attrValues.size() != 1) {
                    LOGGER.warning("Expected only one attribute value in signedAttribute message digest in eContent!");
                }
                byte[] octets = ((ASN1OctetString) attrValues.getObjectAt(0)).getOctets();
                if (octets == null) {
                    LOGGER.warning("Error extracting signedAttribute message digest in eContent!");
                }
                if (!Arrays.equals(octets, MessageDigest.getInstance(str).digest(bArr))) {
                    throw new SignatureException("Error checking signedAttribute message digest in eContent!");
                }
            }
        }
    }

    public static ASN1Set createAuthenticatedAttributes(String str, String str2, ContentInfo contentInfo) throws GeneralSecurityException {
        if ("SHA256".equals(str)) {
            str = "SHA-256";
        }
        DEROctetString dEROctetString = new DEROctetString(Util.getMessageDigest(str).digest(((ASN1OctetString) contentInfo.getContent()).getOctets()));
        return new DLSet(new ASN1Object[]{new Attribute(new ASN1ObjectIdentifier("1.2.840.113549.1.9.3"), createSingletonSet(new ASN1ObjectIdentifier(str2))).toASN1Primitive(), new Attribute(new ASN1ObjectIdentifier("1.2.840.113549.1.9.4"), createSingletonSet(dEROctetString)).toASN1Primitive()});
    }

    public static ASN1Sequence createCertificate(X509Certificate x509Certificate) throws CertificateException {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Cannot encode null certificate");
        }
        try {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(x509Certificate.getEncoded());
            try {
                ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1InputStream.readObject();
                try {
                    return aSN1Sequence;
                } catch (IOException e) {
                    return aSN1Sequence;
                }
            } finally {
                try {
                    aSN1InputStream.close();
                } catch (IOException e2) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e2);
                }
            }
        } catch (IOException e4) {
            throw new CertificateException("Could not construct certificate byte stream", e4);
        }
    }

    public static ASN1Sequence createDigestAlgorithms(String str) throws NoSuchAlgorithmException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(lookupOIDByMnemonic(str));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        return new DLSequence(aSN1EncodableVector);
    }

    public static SignedData createSignedData(String str, String str2, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) throws GeneralSecurityException {
        return createSignedData(str, str2, null, str3, contentInfo, bArr, x509Certificate);
    }

    public static SignerInfo createSignerInfo(String str, String str2, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) throws GeneralSecurityException {
        return createSignerInfo(str, str2, null, str3, contentInfo, bArr, x509Certificate);
    }

    private static ASN1Set createSingletonSet(ASN1Object aSN1Object) {
        return new DLSet(new ASN1Encodable[]{aSN1Object});
    }

    public static X509Certificate decodeCertificate(Certificate certificate) throws GeneralSecurityException, IOException {
        return (X509Certificate) CertificateFactory.getInstance("X.509", Util.getBouncyCastleProvider()).generateCertificate(new ByteArrayInputStream(certificate.getEncoded("DER")));
    }

    private static List<Attribute> getAttributes(ASN1Set aSN1Set) {
        ArrayList list = Collections.list(aSN1Set.getObjects());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Attribute.getInstance((ASN1Sequence) it8.next()));
        }
        return arrayList;
    }

    public static List<X509Certificate> getCertificates(SignedData signedData) {
        ASN1Set certificates = signedData.getCertificates();
        int size = certificates == null ? 0 : certificates.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                try {
                    arrayList.add(decodeCertificate(Certificate.getInstance(certificates.getObjectAt(i))));
                } catch (Exception e) {
                    LOGGER.log(Level.WARNING, "Exception in decoding certificate", (Throwable) e);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.asn1.ASN1Primitive getContent(org.bouncycastle.asn1.cms.SignedData r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Exception closing input stream"
            org.bouncycastle.asn1.cms.ContentInfo r6 = r6.getEncapContentInfo()
            org.bouncycastle.asn1.ASN1Encodable r6 = r6.getContent()
            org.bouncycastle.asn1.ASN1OctetString r6 = (org.bouncycastle.asn1.ASN1OctetString) r6
            r1 = 0
            org.bouncycastle.asn1.ASN1InputStream r2 = new org.bouncycastle.asn1.ASN1InputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            byte[] r6 = r6.getOctets()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            org.bouncycastle.asn1.ASN1Primitive r6 = r2.readObject()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r2.close()     // Catch: java.io.IOException -> L23
            return r6
        L23:
            r1 = move-exception
            java.util.logging.Logger r2 = org.jmrtd.lds.SignedDataUtil.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r2.log(r3, r0, r1)
            return r6
        L2c:
            r6 = move-exception
            r1 = r2
            goto L4d
        L2f:
            r6 = move-exception
            goto L35
        L31:
            r6 = move-exception
            goto L4d
        L33:
            r6 = move-exception
            r2 = r1
        L35:
            java.util.logging.Logger r3 = org.jmrtd.lds.SignedDataUtil.LOGGER     // Catch: java.lang.Throwable -> L2c
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "Unexpected exception"
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L44
            goto L4c
        L44:
            r6 = move-exception
            java.util.logging.Logger r2 = org.jmrtd.lds.SignedDataUtil.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r2.log(r3, r0, r6)
        L4c:
            return r1
        L4d:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L53
            goto L5b
        L53:
            r1 = move-exception
            java.util.logging.Logger r2 = org.jmrtd.lds.SignedDataUtil.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r2.log(r3, r0, r1)
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.SignedDataUtil.getContent(org.bouncycastle.asn1.cms.SignedData):org.bouncycastle.asn1.ASN1Primitive");
    }

    public static String getDigestEncryptionAlgorithm(SignedData signedData) {
        try {
            String id10 = getSignerInfo(signedData).getDigestEncryptionAlgorithm().getAlgorithm().getId();
            if (id10 != null) {
                return lookupMnemonicByOID(id10);
            }
            LOGGER.warning("Could not determine digest encryption algorithm OID");
            return null;
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.WARNING, "No such algorithm", (Throwable) e);
            return null;
        }
    }

    private static AlgorithmIdentifier getDigestEncryptionAlgorithmObject(String str, AlgorithmParameterSpec algorithmParameterSpec) throws GeneralSecurityException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(lookupOIDByMnemonic(str));
        if (algorithmParameterSpec == null) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier);
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(str);
            algorithmParameters.init(algorithmParameterSpec);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, ASN1Primitive.fromByteArray(algorithmParameters.getEncoded()));
        } catch (IOException e) {
            throw new InvalidAlgorithmParameterException("Unable to encode parameters object", e);
        }
    }

    public static AlgorithmParameterSpec getDigestEncryptionAlgorithmParams(SignedData signedData) {
        try {
            AlgorithmIdentifier digestEncryptionAlgorithm = getSignerInfo(signedData).getDigestEncryptionAlgorithm();
            if (!"1.2.840.113549.1.1.10".equals(digestEncryptionAlgorithm.getAlgorithm().getId())) {
                return null;
            }
            ASN1Encodable parameters = digestEncryptionAlgorithm.getParameters();
            if (parameters == null) {
                LOGGER.warning("Cannot get RSASSA/PSS parameters");
                return null;
            }
            RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
            if (rSASSAPSSparams != null) {
                return toAlgorithmParameterSpec(rSASSAPSSparams);
            }
            LOGGER.warning("Cannot get RSASSA/PSS parameters");
            return null;
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Cannot get RSASSA/PSS parameters", (Throwable) e);
            return null;
        }
    }

    public static byte[] getEContent(SignedData signedData) throws SignatureException {
        SignerInfo signerInfo = getSignerInfo(signedData);
        ASN1Set authenticatedAttributes = signerInfo.getAuthenticatedAttributes();
        byte[] octets = ((ASN1OctetString) signedData.getEncapContentInfo().getContent()).getOctets();
        if (authenticatedAttributes.size() == 0) {
            return octets;
        }
        String id10 = signerInfo.getDigestAlgorithm().getAlgorithm().getId();
        try {
            byte[] encoded = authenticatedAttributes.getEncoded("DER");
            checkEContent(getAttributes(authenticatedAttributes), id10, octets);
            return encoded;
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    public static byte[] getEncryptedDigest(SignedData signedData) {
        return getSignerInfo(signedData).getEncryptedDigest().getOctets();
    }

    public static IssuerAndSerialNumber getIssuerAndSerialNumber(SignedData signedData) {
        ASN1Encodable id10 = getSignerInfo(signedData).getSID().getId();
        if (!(id10 instanceof ASN1Sequence) && !(id10 instanceof IssuerAndSerialNumber)) {
            return null;
        }
        IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(id10);
        return new IssuerAndSerialNumber(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
    }

    public static ASN1Object getObjectFromTaggedObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IOException("Was expecting an ASN1TaggedObject, found " + aSN1Encodable.getClass().getCanonicalName());
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
        int tagClass = aSN1TaggedObject.getTagClass();
        if (tagClass != 128) {
            throw new IOException(a.n(tagClass, new StringBuilder("Was expecting CONTEXT_SPECIFIC tag class in ASN1 tagged object, found ")));
        }
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        throw new IOException(a.n(tagNo, new StringBuilder("Was expecting tag 0, found ")));
    }

    public static List<ASN1Primitive> getObjectsFromOctetString(ASN1OctetString aSN1OctetString) {
        ArrayList arrayList = new ArrayList();
        ASN1InputStream aSN1InputStream = new ASN1InputStream(new ByteArrayInputStream(aSN1OctetString.getOctets()));
        while (true) {
            try {
                ASN1Primitive object = aSN1InputStream.readObject();
                if (object == null) {
                    aSN1InputStream.close();
                    return arrayList;
                }
                arrayList.add(object);
            } catch (IOException e) {
                LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
                return arrayList;
            }
        }
    }

    public static SignerInfo getSignerInfo(SignedData signedData) {
        ASN1Set signerInfos = signedData.getSignerInfos();
        if (signerInfos == null || signerInfos.size() <= 0) {
            throw new IllegalArgumentException("No signer info in signed data");
        }
        if (signerInfos.size() > 1) {
            LOGGER.warning("Found " + signerInfos.size() + " signerInfos");
        }
        return SignerInfo.getInstance(signerInfos.getObjectAt(0));
    }

    public static String getSignerInfoDigestAlgorithm(SignedData signedData) {
        try {
            return lookupMnemonicByOID(getSignerInfo(signedData).getDigestAlgorithm().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.WARNING, "No such algorithm" + e);
            return null;
        }
    }

    public static byte[] getSubjectKeyIdentifier(SignedData signedData) {
        ASN1Encodable id10;
        SignerIdentifier sid2 = getSignerInfo(signedData).getSID();
        if (sid2 == null || (id10 = sid2.getId()) == null || !(id10 instanceof ASN1OctetString)) {
            return null;
        }
        return ((ASN1OctetString) id10).getOctets();
    }

    public static String lookupMnemonicByOID(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return null;
        }
        if (str.equals(X509ObjectIdentifiers.organization.getId())) {
            return "O";
        }
        if (str.equals(X509ObjectIdentifiers.organizationalUnitName.getId())) {
            return "OU";
        }
        if (str.equals(X509ObjectIdentifiers.commonName.getId())) {
            return "CN";
        }
        if (str.equals(X509ObjectIdentifiers.countryName.getId())) {
            return "C";
        }
        if (str.equals(X509ObjectIdentifiers.stateOrProvinceName.getId())) {
            return "ST";
        }
        if (str.equals(X509ObjectIdentifiers.localityName.getId())) {
            return "L";
        }
        if (str.equals(X509ObjectIdentifiers.id_SHA1.getId())) {
            return "SHA-1";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha224.getId())) {
            return "SHA-224";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha256.getId())) {
            return "SHA-256";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha384.getId())) {
            return "SHA-384";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha512.getId())) {
            return "SHA-512";
        }
        if (str.equals("1.2.840.10045.4.1")) {
            return "SHA1withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.1")) {
            return "SHA224withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.2")) {
            return "SHA256withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.3")) {
            return "SHA384withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.4")) {
            return "SHA512withECDSA";
        }
        if (str.equals("1.2.840.113549.1.1.1")) {
            return "RSA";
        }
        if (str.equals("1.2.840.113549.1.1.2")) {
            return "MD2withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.3")) {
            return "MD4withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.4")) {
            return "MD5withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.5")) {
            return "SHA1withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.11")) {
            return "SHA256withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.12")) {
            return "SHA384withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.13")) {
            return "SHA512withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.14")) {
            return "SHA224withRSA";
        }
        if (str.equals("1.3.14.3.2.26")) {
            return "SHA-1";
        }
        if (str.equals("1.2.840.113549.1.1.10")) {
            return "SSAwithRSA/PSS";
        }
        if (str.equals("1.2.840.113549.1.1.8")) {
            return "MGF1";
        }
        throw new NoSuchAlgorithmException("Unknown OID ".concat(str));
    }

    public static String lookupOIDByMnemonic(String str) throws NoSuchAlgorithmException {
        if ("O".equals(str)) {
            return X509ObjectIdentifiers.organization.getId();
        }
        if ("OU".equals(str)) {
            return X509ObjectIdentifiers.organizationalUnitName.getId();
        }
        if ("CN".equals(str)) {
            return X509ObjectIdentifiers.commonName.getId();
        }
        if ("C".equals(str)) {
            return X509ObjectIdentifiers.countryName.getId();
        }
        if ("ST".equals(str)) {
            return X509ObjectIdentifiers.stateOrProvinceName.getId();
        }
        if ("L".equals(str)) {
            return X509ObjectIdentifiers.localityName.getId();
        }
        if ("SHA-1".equalsIgnoreCase(str) || "SHA1".equalsIgnoreCase(str)) {
            return X509ObjectIdentifiers.id_SHA1.getId();
        }
        if ("SHA-224".equalsIgnoreCase(str) || "SHA224".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha224.getId();
        }
        if ("SHA-256".equalsIgnoreCase(str) || "SHA256".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha256.getId();
        }
        if ("SHA-384".equalsIgnoreCase(str) || "SHA384".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha384.getId();
        }
        if ("SHA-512".equalsIgnoreCase(str) || "SHA512".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha512.getId();
        }
        if ("RSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.1";
        }
        if ("MD2withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.2";
        }
        if ("MD4withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.3";
        }
        if ("MD5withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.4";
        }
        if ("SHA1withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.5";
        }
        if ("SHA256withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.11";
        }
        if ("SHA384withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.12";
        }
        if ("SHA512withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.13";
        }
        if ("SHA224withRSA".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.14";
        }
        if ("SHA1withECDSA".equalsIgnoreCase(str)) {
            return "1.2.840.10045.4.1";
        }
        if ("SHA224withECDSA".equalsIgnoreCase(str)) {
            return "1.2.840.10045.4.3.1";
        }
        if ("SHA256withECDSA".equalsIgnoreCase(str)) {
            return "1.2.840.10045.4.3.2";
        }
        if ("SHA384withECDSA".equalsIgnoreCase(str)) {
            return "1.2.840.10045.4.3.3";
        }
        if ("SHA512withECDSA".equalsIgnoreCase(str)) {
            return "1.2.840.10045.4.3.4";
        }
        if ("SAwithRSA/PSS".equalsIgnoreCase(str) || "SSAwithRSA/PSS".equalsIgnoreCase(str) || "RSASSA-PSS".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.10";
        }
        if ("MGF1".equalsIgnoreCase(str) || "SHA256withRSAandMGF1".equalsIgnoreCase(str) || "SHA512withRSAandMGF1".equalsIgnoreCase(str)) {
            return "1.2.840.113549.1.1.8";
        }
        throw new NoSuchAlgorithmException(a.q("Unknown name ", str));
    }

    public static SignedData readSignedData(InputStream inputStream) throws IOException {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(new ASN1InputStream(inputStream, true).readObject());
        if (aSN1Sequence.size() != 2) {
            throw new IOException(m.n(aSN1Sequence, new StringBuilder("Was expecting a DER sequence of length 2, found a DER sequence of length ")));
        }
        String id10 = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
        if (!"1.2.840.113549.1.7.2".equals(id10)) {
            throw new IOException(a.q("Was expecting signed-data content type OID (1.2.840.113549.1.7.2), found ", id10));
        }
        ASN1Object objectFromTaggedObject = getObjectFromTaggedObject(aSN1Sequence.getObjectAt(1));
        if (objectFromTaggedObject instanceof ASN1Sequence) {
            return SignedData.getInstance(objectFromTaggedObject);
        }
        throw new IOException("Was expecting an ASN.1 sequence as content");
    }

    public static byte[] signData(String str, String str2, String str3, ContentInfo contentInfo, PrivateKey privateKey, String str4) {
        return signData(str, str2, null, str3, contentInfo, privateKey, str4);
    }

    private static AlgorithmParameterSpec toAlgorithmParameterSpec(RSASSAPSSparams rSASSAPSSparams) throws NoSuchAlgorithmException {
        if (rSASSAPSSparams == null) {
            return null;
        }
        String id10 = rSASSAPSSparams.getHashAlgorithm().getAlgorithm().getId();
        AlgorithmIdentifier maskGenAlgorithm = rSASSAPSSparams.getMaskGenAlgorithm();
        String id11 = maskGenAlgorithm.getAlgorithm().getId();
        String strLookupMnemonicByOID = lookupMnemonicByOID(id10);
        String strLookupMnemonicByOID2 = lookupMnemonicByOID(id11);
        int iIntValue = rSASSAPSSparams.getSaltLength().intValue();
        int iIntValue2 = rSASSAPSSparams.getTrailerField().intValue();
        if (strLookupMnemonicByOID != null && strLookupMnemonicByOID2 != null && iIntValue >= 0 && iIntValue2 >= 0) {
            return new PSSParameterSpec(strLookupMnemonicByOID, strLookupMnemonicByOID2, toMaskGenAlgorithmParameterSpec(maskGenAlgorithm), iIntValue, iIntValue2);
        }
        LOGGER.warning("Cannot get RSASSA/PSS parameters");
        return null;
    }

    private static AlgorithmParameterSpec toMaskGenAlgorithmParameterSpec(AlgorithmIdentifier algorithmIdentifier) {
        try {
            ASN1Encodable parameters = algorithmIdentifier.getParameters();
            if (parameters != null) {
                return new MGF1ParameterSpec(lookupMnemonicByOID(AlgorithmIdentifier.getInstance(parameters).getAlgorithm().getId()));
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
        }
        return new MGF1ParameterSpec("SHA-1");
    }

    public static void writeData(SignedData signedData, OutputStream outputStream) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier("1.2.840.113549.1.7.2"));
        aSN1EncodableVector.add(new DERTaggedObject(0, signedData));
        outputStream.write(new DLSequence(aSN1EncodableVector).getEncoded("DER"));
    }

    public static SignedData createSignedData(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) throws GeneralSecurityException {
        return new SignedData(createSingletonSet(createDigestAlgorithms(str)), contentInfo, createSingletonSet(createCertificate(x509Certificate)), null, createSingletonSet(createSignerInfo(str, str2, algorithmParameterSpec, str3, contentInfo, bArr, x509Certificate).toASN1Primitive()));
    }

    public static SignerInfo createSignerInfo(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) throws GeneralSecurityException {
        if (bArr == null) {
            throw new IllegalArgumentException("Encrypted digest cannot be null");
        }
        return new SignerInfo(new SignerIdentifier(new IssuerAndSerialNumber(X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber())), new AlgorithmIdentifier(new ASN1ObjectIdentifier(lookupOIDByMnemonic(str))), createAuthenticatedAttributes(str, str3, contentInfo), getDigestEncryptionAlgorithmObject(str2, algorithmParameterSpec), new DEROctetString(bArr), (ASN1Set) null);
    }

    public static byte[] signData(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3, ContentInfo contentInfo, PrivateKey privateKey, String str4) {
        try {
            byte[] encoded = createAuthenticatedAttributes(str, str3, contentInfo).getEncoded("DER");
            Signature signature = str4 != null ? Signature.getInstance(str2, str4) : Signature.getInstance(str2);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.initSign(privateKey);
            signature.update(encoded);
            return signature.sign();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
            return null;
        }
    }
}
