package org.bouncycastle.jce.provider;

import a10.b;
import j6.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStore;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertificate;

/* JADX INFO: loaded from: classes14.dex */
class CertPathValidatorUtilities {
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    protected static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    protected static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    protected static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    protected static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    protected static final String KEY_USAGE = Extension.keyUsage.getId();
    protected static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    protected static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    protected static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    protected static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    protected static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    protected static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    protected static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    protected static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String REASON_CODE = Extension.reasonCode.getId();
    static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    public static void checkCRLCriticalExtensions(X509CRL x509crl, String str) throws AnnotatedException {
        int size;
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException(str);
        }
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null || (size = criticalExtensionOIDs.size()) <= 0) {
            return;
        }
        if (criticalExtensionOIDs.contains(ISSUING_DISTRIBUTION_POINT)) {
            size--;
        }
        if (criticalExtensionOIDs.contains(DELTA_CRL_INDICATOR)) {
            size--;
        }
        if (size > 0) {
            throw new AnnotatedException(str);
        }
    }

    public static void checkCRLEntryCriticalExtensions(X509CRLEntry x509CRLEntry, String str) throws AnnotatedException {
        if (x509CRLEntry.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException(str);
        }
    }

    public static void checkCRLsNotEmpty(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, Set set, Object obj2) throws RecoverableCertPathValidatorException {
        if (set.isEmpty()) {
            if (obj2 instanceof X509AttributeCertificate) {
                throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + ((X509AttributeCertificate) obj2).getIssuer().getPrincipals()[0] + "\"", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + RFC4519Style.INSTANCE.toString(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj2)) + "\"", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }

    public static void findCertificates(Set set, PKIXCertStoreSelector pKIXCertStoreSelector, List list) throws AnnotatedException {
        for (Object obj2 : list) {
            if (obj2 instanceof Store) {
                try {
                    set.addAll(((Store) obj2).getMatches(pKIXCertStoreSelector));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    set.addAll(PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (CertStore) obj2));
                } catch (CertStoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<PKIXCertStore> list2) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, list);
                findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, list2);
                return linkedHashSet;
            } catch (AnnotatedException e) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e);
            }
        } catch (Exception e2) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static Collection findTargets(PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters) throws CertPathBuilderException {
        PKIXExtendedParameters baseParameters = pKIXExtendedBuilderParameters.getBaseParameters();
        PKIXCertStoreSelector targetConstraints = baseParameters.getTargetConstraints();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            findCertificates(linkedHashSet, targetConstraints, baseParameters.getCertificateStores());
            findCertificates(linkedHashSet, targetConstraints, baseParameters.getCertStores());
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            Certificate certificate = targetConstraints.getCertificate();
            if (certificate != null) {
                return Collections.singleton(certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (AnnotatedException e) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e);
        }
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, null);
    }

    public static PKIXPolicyNode findValidPolicy(Iterator it8, String str) {
        while (it8.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) it8.next();
            if (str.equals(pKIXPolicyNode.getValidPolicy())) {
                return pKIXPolicyNode;
            }
        }
        return null;
    }

    public static List<PKIXCertStore> getAdditionalStoresFromAltNames(byte[] bArr, Map<GeneralName, PKIXCertStore> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        GeneralName[] names = GeneralNames.getInstance(ASN1OctetString.getInstance(bArr).getOctets()).getNames();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != names.length; i++) {
            PKIXCertStore pKIXCertStore = map.get(names[i]);
            if (pKIXCertStore != null) {
                arrayList.add(pKIXCertStore);
            }
        }
        return arrayList;
    }

    public static List<PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(CRLDistPoint cRLDistPoint, PKIXExtendedParameters pKIXExtendedParameters, Date date, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        if (cRLDistPoint == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            ArrayList arrayList = new ArrayList();
            Map<GeneralName, PKIXCRLStore> namedCRLStoreMap = pKIXExtendedParameters.getNamedCRLStoreMap();
            if (!namedCRLStoreMap.isEmpty()) {
                for (DistributionPoint distributionPoint : distributionPoints) {
                    DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                    if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            PKIXCRLStore pKIXCRLStore = namedCRLStoreMap.get(generalName);
                            if (pKIXCRLStore != null) {
                                arrayList.add(pKIXCRLStore);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && Properties.isOverrideSet("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    CertificateFactory certificateFactoryCreateCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                    for (DistributionPoint distributionPoint3 : distributionPoints) {
                        DistributionPointName distributionPoint4 = distributionPoint3.getDistributionPoint();
                        if (distributionPoint4 != null && distributionPoint4.getType() == 0) {
                            GeneralName[] names = GeneralNames.getInstance(distributionPoint4.getName()).getNames();
                            int i = 0;
                            while (true) {
                                if (i < names.length) {
                                    GeneralName generalName2 = names[i];
                                    if (generalName2.getTagNo() == 6) {
                                        try {
                                            PKIXCRLStore crl2 = CrlCache.getCrl(certificateFactoryCreateCertificateFactory, date, new URI(((ASN1String) generalName2.getName()).getString()));
                                            if (crl2 != null) {
                                                arrayList.add(crl2);
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                            i++;
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    throw new AnnotatedException(b.r(e, new StringBuilder("cannot create certificate factory: ")), e);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            throw new AnnotatedException("Distribution points could not be read.", e2);
        }
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm();
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    public static void getCRLIssuersFromDistributionPoint(DistributionPoint distributionPoint, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        if (distributionPoint.getCRLIssuer() != null) {
            GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
            for (int i = 0; i < names.length; i++) {
                if (names[i].getTagNo() == 4) {
                    try {
                        arrayList.add(X500Name.getInstance(names[i].getName().toASN1Primitive().getEncoded()));
                    } catch (IOException e) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                    }
                }
            }
        } else {
            if (distributionPoint.getDistributionPoint() == null) {
                throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            }
            Iterator it8 = collection.iterator();
            while (it8.hasNext()) {
                arrayList.add(it8.next());
            }
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((X500Name) it9.next()).getEncoded());
            } catch (IOException e2) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e2);
            }
        }
    }

    public static void getCertStatus(Date date, X509CRL x509crl, Object obj2, CertStatus certStatus) throws AnnotatedException {
        X509CRLEntry revokedCertificate;
        ASN1Enumerated aSN1Enumerated;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj2));
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!PrincipalUtils.getEncodedIssuerPrincipal(obj2).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : PrincipalUtils.getX500Name(certificateIssuer))) {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj2).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj2))) == null) {
                return;
            }
            if (revokedCertificate.hasExtensions()) {
                checkCRLEntryCriticalExtensions(revokedCertificate, "CRL entry has unsupported critical extensions.");
                try {
                    aSN1Enumerated = ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, REASON_CODE));
                } catch (Exception e) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                }
            } else {
                aSN1Enumerated = null;
            }
            int iIntValueExact = aSN1Enumerated == null ? 0 : aSN1Enumerated.intValueExact();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || iIntValueExact == 0 || iIntValueExact == 1 || iIntValueExact == 2 || iIntValueExact == 10) {
                certStatus.setCertStatus(iIntValueExact);
                certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
            }
        } catch (CRLException e2) {
            throw new AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    public static Set getCompleteCRLs(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, DistributionPoint distributionPoint, Object obj2, PKIXExtendedParameters pKIXExtendedParameters, Date date) throws AnnotatedException, RecoverableCertPathValidatorException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj2));
            getCRLIssuersFromDistributionPoint(distributionPoint, hashSet, x509CRLSelector);
            if (obj2 instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj2);
            }
            Set setFindCRLs = PKIXCRLUtil.findCRLs(new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build(), date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            checkCRLsNotEmpty(pKIXCertRevocationCheckerParameters, setFindCRLs, obj2);
            return setFindCRLs;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e);
        }
    }

    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<PKIXCRLStore> list2, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                ASN1Primitive extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger positiveValue = extensionValue != null ? ASN1Integer.getInstance(extensionValue).getPositiveValue() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLSelector.setMinCRLNumber(positiveValue != null ? positiveValue.add(BigInteger.valueOf(1L)) : null);
                    PKIXCRLStoreSelector.Builder builder = new PKIXCRLStoreSelector.Builder(x509CRLSelector);
                    builder.setIssuingDistributionPoint(extensionValue2);
                    builder.setIssuingDistributionPointEnabled(true);
                    builder.setMaxBaseCRLNumber(positiveValue);
                    builder.setDeltaCRLIndicatorEnabled(true);
                    PKIXCRLStoreSelector<? extends CRL> pKIXCRLStoreSelectorBuild = builder.build();
                    Set deltaCRLs = getDeltaCRLs(PKIXCRLUtil.findCRLs(pKIXCRLStoreSelectorBuild, date, list, list2));
                    if (!deltaCRLs.isEmpty() || !Properties.isOverrideSet("org.bouncycastle.x509.enableCRLDP")) {
                        return deltaCRLs;
                    }
                    try {
                        CertificateFactory certificateFactoryCreateCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                        for (DistributionPoint distributionPoint : CRLDistPoint.getInstance(extensionValue2).getDistributionPoints()) {
                            DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                            if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                                GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                                int i = 0;
                                while (true) {
                                    if (i < names.length) {
                                        GeneralName generalName = names[i];
                                        if (generalName.getTagNo() == 6) {
                                            try {
                                                PKIXCRLStore crl2 = CrlCache.getCrl(certificateFactoryCreateCertificateFactory, date, new URI(((ASN1String) generalName.getName()).getString()));
                                                if (crl2 != null) {
                                                    deltaCRLs = getDeltaCRLs(PKIXCRLUtil.findCRLs(pKIXCRLStoreSelectorBuild, date, Collections.EMPTY_LIST, Collections.singletonList(crl2)));
                                                }
                                            } catch (Exception unused) {
                                                continue;
                                                i++;
                                            }
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                        return deltaCRLs;
                    } catch (Exception e) {
                        throw new AnnotatedException(b.r(e, new StringBuilder("cannot create certificate factory: ")), e);
                    }
                } catch (Exception e2) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e2);
                }
            } catch (Exception e4) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e4);
            }
        } catch (IOException e5) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e5);
        }
    }

    public static ASN1Primitive getExtensionValue(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    public static PublicKey getNextWorkingKey(List list, int i, JcaJceHelper jcaJceHelper) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i >= list.size()) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            dSAPublicKey = (DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return jcaJceHelper.createKeyFactory("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static ASN1Primitive getObject(String str, byte[] bArr) throws AnnotatedException {
        try {
            return ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(bArr).getOctets());
        } catch (Exception e) {
            throw new AnnotatedException(a.q("exception processing extension ", str), e);
        }
    }

    public static final Set getQualifierSet(ASN1Sequence aSN1Sequence) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (aSN1Sequence != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream);
            Enumeration objects = aSN1Sequence.getObjects();
            while (objects.hasMoreElements()) {
                try {
                    aSN1OutputStreamCreate.writeObject((ASN1Encodable) objects.nextElement());
                    hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                } catch (IOException e) {
                    throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj2) {
        return ((X509Certificate) obj2).getSerialNumber();
    }

    public static Date getValidCertDateFromValidityModel(Date date, int i, CertPath certPath, int i2) throws AnnotatedException {
        if (1 != i || i2 <= 0) {
            return date;
        }
        int i3 = i2 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i3);
        if (i3 == 0) {
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
                ASN1GeneralizedTime aSN1GeneralizedTime = extensionValue != null ? ASN1GeneralizedTime.getInstance(ASN1Primitive.fromByteArray(extensionValue)) : null;
                if (aSN1GeneralizedTime != null) {
                    try {
                        return aSN1GeneralizedTime.getDate();
                    } catch (ParseException e) {
                        throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e);
                    }
                }
            } catch (IOException unused) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return x509Certificate.getNotBefore();
    }

    public static Date getValidityDate(PKIXExtendedParameters pKIXExtendedParameters, Date date) {
        Date validityDate = pKIXExtendedParameters.getValidityDate();
        return validityDate == null ? date : validityDate;
    }

    public static boolean hasCriticalExtension(X509CRL x509crl, String str) {
        return hasCriticalExtension(x509crl.getCriticalExtensionOIDs(), str);
    }

    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        return hasCriticalExtension(x509crl, DELTA_CRL_INDICATOR);
    }

    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, str) != null;
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean processCertD1i(int i, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i2);
            if (pKIXPolicyNode.getExpectedPolicies().contains(aSN1ObjectIdentifier.getId())) {
                HashSet hashSet = new HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    public static void processCertD1ii(int i, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        PKIXPolicyNode pKIXPolicyNodeFindValidPolicy = findValidPolicy(listArr[i - 1].iterator(), "2.5.29.32.0");
        if (pKIXPolicyNodeFindValidPolicy != null) {
            String id10 = aSN1ObjectIdentifier.getId();
            HashSet hashSet = new HashSet();
            hashSet.add(id10);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNodeFindValidPolicy, set, id10, false);
            pKIXPolicyNodeFindValidPolicy.addChild(pKIXPolicyNode);
            listArr[i].add(pKIXPolicyNode);
        }
    }

    public static PKIXPolicyNode removeChildlessPolicyNodes(PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i) {
        if (pKIXPolicyNode == null) {
            return null;
        }
        while (true) {
            i--;
            if (i < 0) {
                return pKIXPolicyNode;
            }
            List list = listArr[i];
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(size);
                    if (!pKIXPolicyNode2.hasChildren()) {
                        list.remove(size);
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                        if (pKIXPolicyNode3 == null) {
                            return null;
                        }
                        pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
                    }
                }
            }
        }
    }

    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        if (pKIXPolicyNode == null) {
            return null;
        }
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (List list : listArr) {
            list.clear();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[PHI: r5
      0x003c: PHI (r5v5 org.bouncycastle.asn1.x500.X500Name) = 
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v2 org.bouncycastle.asn1.x500.X500Name)
      (r5v2 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
     binds: [B:13:0x0042, B:15:0x0048, B:17:0x004e, B:34:0x003c, B:21:0x006a, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate r8, java.util.Set r9, java.lang.String r10) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            java.security.cert.X509CertSelector r0 = new java.security.cert.X509CertSelector
            r0.<init>()
            javax.security.auth.x500.X500Principal r1 = r8.getIssuerX500Principal()
            r0.setSubject(r1)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L15:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L7a
            if (r3 != 0) goto L7a
            java.lang.Object r3 = r9.next()
            java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3
            java.security.cert.X509Certificate r7 = r3.getTrustedCert()
            if (r7 == 0) goto L3e
            java.security.cert.X509Certificate r7 = r3.getTrustedCert()
            boolean r7 = r0.match(r7)
            if (r7 == 0) goto L3c
            java.security.cert.X509Certificate r6 = r3.getTrustedCert()
            java.security.PublicKey r6 = r6.getPublicKey()
            goto L70
        L3c:
            r3 = r2
            goto L70
        L3e:
            javax.security.auth.x500.X500Principal r7 = r3.getCA()
            if (r7 == 0) goto L3c
            java.lang.String r7 = r3.getCAName()
            if (r7 == 0) goto L3c
            java.security.PublicKey r7 = r3.getCAPublicKey()
            if (r7 == 0) goto L3c
            if (r5 != 0) goto L5a
            byte[] r5 = r1.getEncoded()
            org.bouncycastle.asn1.x500.X500Name r5 = org.bouncycastle.asn1.x500.X500Name.getInstance(r5)
        L5a:
            javax.security.auth.x500.X500Principal r7 = r3.getCA()     // Catch: java.lang.IllegalArgumentException -> L3c
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.IllegalArgumentException -> L3c
            org.bouncycastle.asn1.x500.X500Name r7 = org.bouncycastle.asn1.x500.X500Name.getInstance(r7)     // Catch: java.lang.IllegalArgumentException -> L3c
            boolean r7 = r5.equals(r7)     // Catch: java.lang.IllegalArgumentException -> L3c
            if (r7 == 0) goto L3c
            java.security.PublicKey r6 = r3.getCAPublicKey()     // Catch: java.lang.IllegalArgumentException -> L3c
        L70:
            if (r6 == 0) goto L15
            verifyX509Certificate(r8, r6, r10)     // Catch: java.lang.Exception -> L76
            goto L15
        L76:
            r4 = move-exception
            r3 = r2
            r6 = r3
            goto L15
        L7a:
            if (r3 != 0) goto L87
            if (r4 != 0) goto L7f
            goto L87
        L7f:
            org.bouncycastle.jce.provider.AnnotatedException r8 = new org.bouncycastle.jce.provider.AnnotatedException
            java.lang.String r9 = "TrustAnchor found but certificate validation failed."
            r8.<init>(r9, r4)
            throw r8
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    public static boolean hasCriticalExtension(X509Certificate x509Certificate, String str) {
        return hasCriticalExtension(x509Certificate.getCriticalExtensionOIDs(), str);
    }

    private static boolean hasCriticalExtension(Set set, String str) {
        return set != null && set.contains(str);
    }

    private static Set getDeltaCRLs(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            X509CRL x509crl = (X509CRL) it8.next();
            if (isDeltaCRL(x509crl)) {
                hashSet.add(x509crl);
            }
        }
        return hashSet;
    }
}
