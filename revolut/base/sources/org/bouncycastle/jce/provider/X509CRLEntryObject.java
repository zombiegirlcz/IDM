package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class X509CRLEntryObject extends X509CRLEntry {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TBSCertList.CRLEntry f228645c;
    private X500Name certificateIssuer;
    private int hashValue;
    private boolean isHashValueSet;

    public X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry) {
        this.f228645c = cRLEntry;
        this.certificateIssuer = null;
    }

    private Set getExtensionOIDs(boolean z) {
        Extensions extensions = this.f228645c.getExtensions();
        if (extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (z == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    private X500Name loadCertificateIssuer(boolean z, X500Name x500Name) {
        GeneralName[] names;
        int i;
        if (!z) {
            return null;
        }
        ASN1OctetString extensionValue = Extensions.getExtensionValue(this.f228645c.getExtensions(), Extension.certificateIssuer);
        if (extensionValue == null) {
            return x500Name;
        }
        try {
            names = GeneralNames.getInstance(extensionValue.getOctets()).getNames();
        } catch (Exception unused) {
        }
        for (i = 0; i < names.length; i++) {
            if (names[i].getTagNo() == 4) {
                return X500Name.getInstance(names[i].getName());
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return obj2 instanceof X509CRLEntryObject ? this.f228645c.equals(((X509CRLEntryObject) obj2).f228645c) : super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f228645c.getEncoded("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return X509SignatureUtil.getExtensionValue(this.f228645c.getExtensions(), str);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.f228645c.getRevocationDate().getDate();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.f228645c.getUserCertificate().getValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.f228645c.getExtensions() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions = this.f228645c.getExtensions();
        return extensions != null && extensions.hasAnyCriticalExtensions();
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.isHashValueSet) {
            this.hashValue = super.hashCode();
            this.isHashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object generalNames;
        StringBuilder sb6 = new StringBuilder("      userCertificate: ");
        String strLineSeparator = Strings.lineSeparator();
        sb6.append(getSerialNumber());
        sb6.append(strLineSeparator);
        sb6.append("       revocationDate: ");
        sb6.append(getRevocationDate());
        sb6.append(strLineSeparator);
        sb6.append("       certificateIssuer: ");
        sb6.append(getCertificateIssuer());
        sb6.append(strLineSeparator);
        Extensions extensions = this.f228645c.getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            if (enumerationOids.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    sb6.append(str);
                    while (true) {
                        sb6.append(strLineSeparator);
                        while (enumerationOids.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                            Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                            if (extension.getExtnValue() != null) {
                                ASN1InputStream aSN1InputStream = new ASN1InputStream(extension.getExtnValue().getOctets());
                                sb6.append("                       critical(");
                                sb6.append(extension.isCritical());
                                sb6.append(") ");
                                try {
                                    if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.reasonCode)) {
                                        generalNames = CRLReason.getInstance(ASN1Enumerated.getInstance(aSN1InputStream.readObject()));
                                    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) Extension.certificateIssuer)) {
                                        sb6.append("Certificate issuer: ");
                                        generalNames = GeneralNames.getInstance(aSN1InputStream.readObject());
                                    } else {
                                        sb6.append(aSN1ObjectIdentifier.getId());
                                        sb6.append(" value = ");
                                        sb6.append(ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                                        sb6.append(strLineSeparator);
                                    }
                                    sb6.append(generalNames);
                                    sb6.append(strLineSeparator);
                                } catch (Exception unused) {
                                    sb6.append(aSN1ObjectIdentifier.getId());
                                    str = " value = *****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return sb6.toString();
    }

    public X509CRLEntryObject(TBSCertList.CRLEntry cRLEntry, boolean z, X500Name x500Name) {
        this.f228645c = cRLEntry;
        this.certificateIssuer = loadCertificateIssuer(z, x500Name);
    }
}
