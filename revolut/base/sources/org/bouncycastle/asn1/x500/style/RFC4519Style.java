package org.bouncycastle.asn1.x500.style;

import ch.qos.logback.core.CoreConstants;
import java.util.Hashtable;
import okl.m;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: classes14.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f228217c;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f228218cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f228219l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;

    /* JADX INFO: renamed from: sn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f228220sn;

    /* JADX INFO: renamed from: st, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f228221st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;

    /* JADX INFO: renamed from: uid, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f228222uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierV = m.v("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierV;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV2 = m.v("2.5.4.6");
        f228217c = aSN1ObjectIdentifierV2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV3 = m.v("2.5.4.3");
        f228218cn = aSN1ObjectIdentifierV3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV4 = m.v("0.9.2342.19200300.100.1.25");
        dc = aSN1ObjectIdentifierV4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV5 = m.v("2.5.4.13");
        description = aSN1ObjectIdentifierV5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV6 = m.v("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierV6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV7 = m.v("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierV7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV8 = m.v("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierV8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV9 = m.v("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierV9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV10 = m.v("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierV10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV11 = m.v("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierV11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV12 = m.v("2.5.4.42");
        givenName = aSN1ObjectIdentifierV12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV13 = m.v("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierV13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV14 = m.v("2.5.4.43");
        initials = aSN1ObjectIdentifierV14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV15 = m.v("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierV15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV16 = m.v("2.5.4.7");
        f228219l = aSN1ObjectIdentifierV16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV17 = m.v("2.5.4.31");
        member = aSN1ObjectIdentifierV17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV18 = m.v("2.5.4.41");
        name = aSN1ObjectIdentifierV18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV19 = m.v("2.5.4.10");
        o = aSN1ObjectIdentifierV19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV20 = m.v("2.5.4.11");
        ou = aSN1ObjectIdentifierV20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV21 = m.v("2.5.4.32");
        owner = aSN1ObjectIdentifierV21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV22 = m.v("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierV22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV23 = m.v("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierV23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV24 = m.v("2.5.4.17");
        postalCode = aSN1ObjectIdentifierV24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV25 = m.v("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierV25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV26 = m.v("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierV26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV27 = m.v("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierV27;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV28 = m.v("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierV28;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV29 = m.v("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierV29;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV30 = m.v("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierV30;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV31 = m.v("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierV31;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV32 = m.v("2.5.4.4");
        f228220sn = aSN1ObjectIdentifierV32;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV33 = m.v("2.5.4.8");
        f228221st = aSN1ObjectIdentifierV33;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV34 = m.v("2.5.4.9");
        street = aSN1ObjectIdentifierV34;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV35 = m.v("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierV35;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV36 = m.v("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierV36;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV37 = m.v("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierV37;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV38 = m.v("2.5.4.12");
        title = aSN1ObjectIdentifierV38;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV39 = m.v("0.9.2342.19200300.100.1.1");
        f228222uid = aSN1ObjectIdentifierV39;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV40 = m.v("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierV40;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV41 = m.v("2.5.4.35");
        userPassword = aSN1ObjectIdentifierV41;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV42 = m.v("2.5.4.24");
        x121Address = aSN1ObjectIdentifierV42;
        ASN1ObjectIdentifier aSN1ObjectIdentifierV43 = m.v("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierV43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierV, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierV2, "c");
        hashtable.put(aSN1ObjectIdentifierV3, "cn");
        hashtable.put(aSN1ObjectIdentifierV4, "dc");
        hashtable.put(aSN1ObjectIdentifierV5, "description");
        hashtable.put(aSN1ObjectIdentifierV6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierV7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierV8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierV9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierV10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierV11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierV12, "givenName");
        hashtable.put(aSN1ObjectIdentifierV13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierV14, "initials");
        hashtable.put(aSN1ObjectIdentifierV15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierV16, "l");
        hashtable.put(aSN1ObjectIdentifierV17, "member");
        hashtable.put(aSN1ObjectIdentifierV18, "name");
        hashtable.put(aSN1ObjectIdentifierV19, "o");
        hashtable.put(aSN1ObjectIdentifierV20, "ou");
        hashtable.put(aSN1ObjectIdentifierV21, "owner");
        hashtable.put(aSN1ObjectIdentifierV22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierV23, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierV24, "postalCode");
        hashtable.put(aSN1ObjectIdentifierV25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierV26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierV27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierV28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierV29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierV30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierV31, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierV32, "sn");
        hashtable.put(aSN1ObjectIdentifierV33, "st");
        hashtable.put(aSN1ObjectIdentifierV34, "street");
        hashtable.put(aSN1ObjectIdentifierV35, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierV36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierV37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierV38, "title");
        hashtable.put(aSN1ObjectIdentifierV39, "uid");
        hashtable.put(aSN1ObjectIdentifierV40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierV41, "userPassword");
        hashtable.put(aSN1ObjectIdentifierV42, "x121Address");
        hashtable.put(aSN1ObjectIdentifierV43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierV);
        hashtable2.put("c", aSN1ObjectIdentifierV2);
        hashtable2.put("cn", aSN1ObjectIdentifierV3);
        hashtable2.put("dc", aSN1ObjectIdentifierV4);
        hashtable2.put("description", aSN1ObjectIdentifierV5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierV6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierV7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierV8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierV9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierV10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierV11);
        hashtable2.put("givenname", aSN1ObjectIdentifierV12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierV13);
        hashtable2.put("initials", aSN1ObjectIdentifierV14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierV15);
        hashtable2.put("l", aSN1ObjectIdentifierV16);
        hashtable2.put("member", aSN1ObjectIdentifierV17);
        hashtable2.put("name", aSN1ObjectIdentifierV18);
        hashtable2.put("o", aSN1ObjectIdentifierV19);
        hashtable2.put("ou", aSN1ObjectIdentifierV20);
        hashtable2.put("owner", aSN1ObjectIdentifierV21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierV22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierV23);
        hashtable2.put("postalcode", aSN1ObjectIdentifierV24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierV25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierV26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierV27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierV28);
        hashtable2.put("searchguide", aSN1ObjectIdentifierV29);
        hashtable2.put("seealso", aSN1ObjectIdentifierV30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierV31);
        hashtable2.put("sn", aSN1ObjectIdentifierV32);
        hashtable2.put("st", aSN1ObjectIdentifierV33);
        hashtable2.put("street", aSN1ObjectIdentifierV34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierV35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierV36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierV37);
        hashtable2.put("title", aSN1ObjectIdentifierV38);
        hashtable2.put("uid", aSN1ObjectIdentifierV39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierV40);
        hashtable2.put("userpassword", aSN1ObjectIdentifierV41);
        hashtable2.put("x121address", aSN1ObjectIdentifierV42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierV43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f228217c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rdnArrRDNsFromString.length];
        for (int i = 0; i != rdnArrRDNsFromString.length; i++) {
            rdnArr[(r0 - i) - 1] = rdnArrRDNsFromString[i];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuilder sb6 = new StringBuilder();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
            IETFUtils.appendRDN(sb6, rDNs[length], this.defaultSymbols);
        }
        return sb6.toString();
    }
}
