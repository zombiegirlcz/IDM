package org.bouncycastle.asn1.x509;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.IETFUtils;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public class PKIXNameConstraintValidator implements NameConstraintValidator {
    private Set permittedSubtreesDN;
    private Set permittedSubtreesDNS;
    private Set permittedSubtreesEmail;
    private Set permittedSubtreesIP;
    private Set permittedSubtreesOtherName;
    private Set permittedSubtreesURI;
    private Set excludedSubtreesDN = new HashSet();
    private Set excludedSubtreesDNS = new HashSet();
    private Set excludedSubtreesEmail = new HashSet();
    private Set excludedSubtreesURI = new HashSet();
    private Set excludedSubtreesIP = new HashSet();
    private Set excludedSubtreesOtherName = new HashSet();

    private static void addLine(StringBuilder sb6, String str) {
        sb6.append(str);
        sb6.append(Strings.lineSeparator());
    }

    private static void checkExcludedDN(Set set, ASN1Sequence aSN1Sequence) throws NameConstraintValidatorException {
        if (isDNConstrained(set, aSN1Sequence)) {
            throw new NameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
        }
    }

    private static void checkExcludedDNS(Set set, String str) throws NameConstraintValidatorException {
        if (isDNSConstrained(set, str)) {
            throw new NameConstraintValidatorException("DNS is from an excluded subtree.");
        }
    }

    private static void checkExcludedIP(Set set, byte[] bArr) throws NameConstraintValidatorException {
        if (isIPConstrained(set, bArr)) {
            throw new NameConstraintValidatorException("IP is from an excluded subtree.");
        }
    }

    private static void checkExcludedOtherName(Set set, OtherName otherName) throws NameConstraintValidatorException {
        if (isOtherNameConstrained(set, otherName)) {
            throw new NameConstraintValidatorException("OtherName is from an excluded subtree.");
        }
    }

    private static void checkExcludedURI(Set set, String str) throws NameConstraintValidatorException {
        if (isURIConstrained(set, str)) {
            throw new NameConstraintValidatorException("URI is from an excluded subtree.");
        }
    }

    private static void checkPermittedDN(Set set, ASN1Sequence aSN1Sequence) throws NameConstraintValidatorException {
        if (set != null) {
            if ((!set.isEmpty() || aSN1Sequence.size() != 0) && !isDNConstrained(set, aSN1Sequence)) {
                throw new NameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
            }
        }
    }

    private static void checkPermittedDNS(Set set, String str) throws NameConstraintValidatorException {
        if (set != null) {
            if ((str.length() != 0 || set.size() != 0) && !isDNSConstrained(set, str)) {
                throw new NameConstraintValidatorException("DNS is not from a permitted subtree.");
            }
        }
    }

    private static void checkPermittedIP(Set set, byte[] bArr) throws NameConstraintValidatorException {
        if (set != null) {
            if ((bArr.length != 0 || set.size() != 0) && !isIPConstrained(set, bArr)) {
                throw new NameConstraintValidatorException("IP is not from a permitted subtree.");
            }
        }
    }

    private static void checkPermittedOtherName(Set set, OtherName otherName) throws NameConstraintValidatorException {
        if (set != null && !isOtherNameConstrained(set, otherName)) {
            throw new NameConstraintValidatorException("Subject OtherName is not from a permitted subtree.");
        }
    }

    private static void checkPermittedURI(Set set, String str) throws NameConstraintValidatorException {
        if (set != null) {
            if ((str.length() != 0 || set.size() != 0) && !isURIConstrained(set, str)) {
                throw new NameConstraintValidatorException("URI is not from a permitted subtree.");
            }
        }
    }

    private static boolean collectionsAreEqual(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj2 : collection) {
            Iterator it8 = collection2.iterator();
            while (it8.hasNext()) {
                if (equals(obj2, it8.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private static int compareTo(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
            int i3 = bArr2[i] & UnsignedBytes.MAX_VALUE;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return 0;
    }

    private static String extractHostFromURL(String str) {
        String strSubstring = str.substring(str.indexOf(58) + 1);
        int iIndexOf = strSubstring.indexOf("//");
        if (iIndexOf != -1) {
            strSubstring = strSubstring.substring(iIndexOf + 2);
        }
        int iLastIndexOf = strSubstring.lastIndexOf(58);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        String strSubstring2 = strSubstring.substring(strSubstring.indexOf(58) + 1);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(64) + 1);
        int iIndexOf2 = strSubstring3.indexOf(47);
        return iIndexOf2 != -1 ? strSubstring3.substring(0, iIndexOf2) : strSubstring3;
    }

    private static byte[][] extractIPsAndSubnetMasks(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private static String extractNameAsString(ASN1Encodable aSN1Encodable) {
        return ASN1IA5String.getInstance(aSN1Encodable).getString();
    }

    private static int hashCollection(Collection collection) {
        int iHashCode = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj2 : collection) {
            iHashCode = (obj2 instanceof byte[] ? Arrays.hashCode((byte[]) obj2) : obj2.hashCode()) + iHashCode;
        }
        return iHashCode;
    }

    private static Set intersectDN(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(((GeneralSubtree) it8.next()).getBase().getName());
            if (set != null) {
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) it9.next();
                    if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                        hashSet.add(aSN1Sequence);
                    } else if (withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                        hashSet.add(aSN1Sequence2);
                    }
                }
            } else if (aSN1Sequence != null) {
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private static Set intersectDNS(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            String strExtractNameAsString = extractNameAsString((GeneralSubtree) it8.next());
            if (set == null) {
                hashSet.add(strExtractNameAsString);
            } else {
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    String str = (String) it9.next();
                    if (isDNSConstrained(strExtractNameAsString, str)) {
                        hashSet.add(str);
                    } else if (withinDomain(strExtractNameAsString, str)) {
                        hashSet.add(strExtractNameAsString);
                    }
                }
            }
        }
        return hashSet;
    }

    private static Set intersectEmail(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            String strExtractNameAsString = extractNameAsString((GeneralSubtree) it8.next());
            if (set == null) {
                hashSet.add(strExtractNameAsString);
            } else {
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    intersectEmail(strExtractNameAsString, (String) it9.next(), hashSet);
                }
            }
        }
        return hashSet;
    }

    private static Set intersectIP(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            byte[] octets = ASN1OctetString.getInstance(((GeneralSubtree) it8.next()).getBase().getName()).getOctets();
            if (set == null) {
                hashSet.add(octets);
            } else {
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    byte[] bArrIntersectIPRange = intersectIPRange((byte[]) it9.next(), octets);
                    if (bArrIntersectIPRange != null) {
                        hashSet.add(bArrIntersectIPRange);
                    }
                }
            }
        }
        return hashSet;
    }

    private static byte[] intersectIPRange(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return null;
        }
        byte[][] bArrExtractIPsAndSubnetMasks = extractIPsAndSubnetMasks(bArr, bArr2);
        byte[] bArr3 = bArrExtractIPsAndSubnetMasks[0];
        byte[] bArr4 = bArrExtractIPsAndSubnetMasks[1];
        byte[] bArr5 = bArrExtractIPsAndSubnetMasks[2];
        byte[] bArr6 = bArrExtractIPsAndSubnetMasks[3];
        byte[][] bArrMinMaxIPs = minMaxIPs(bArr3, bArr4, bArr5, bArr6);
        byte[] bArr7 = bArrMinMaxIPs[0];
        byte[] bArr8 = bArrMinMaxIPs[1];
        byte[] bArr9 = bArrMinMaxIPs[2];
        if (compareTo(max(bArr7, bArr9), min(bArr8, bArrMinMaxIPs[3])) == 1) {
            return null;
        }
        return ipWithSubnetMask(or(bArr7, bArr9), or(bArr4, bArr6));
    }

    private static Set intersectOtherName(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            OtherName otherName = OtherName.getInstance(((GeneralSubtree) it8.next()).getBase().getName());
            if (otherName != null) {
                if (set == null) {
                    hashSet.add(otherName);
                } else {
                    Iterator it9 = set.iterator();
                    while (it9.hasNext()) {
                        intersectOtherName(otherName, OtherName.getInstance(it9.next()), hashSet);
                    }
                }
            }
        }
        return hashSet;
    }

    private static Set intersectURI(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            String strExtractNameAsString = extractNameAsString((GeneralSubtree) it8.next());
            if (set == null) {
                hashSet.add(strExtractNameAsString);
            } else {
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    intersectURI((String) it9.next(), strExtractNameAsString, hashSet);
                }
            }
        }
        return hashSet;
    }

    private static byte[] ipWithSubnetMask(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }

    private static boolean isDNConstrained(Set set, ASN1Sequence aSN1Sequence) {
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it8.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDNSConstrained(String str, String str2) {
        return str2.equalsIgnoreCase(str) || withinDomain(str2, str);
    }

    private static boolean isEmailConstrained(String str, String str2) {
        int iIndexOf = str.indexOf(64);
        if (iIndexOf > 0) {
            return str2.equalsIgnoreCase(str);
        }
        String strSubstring = str2.substring(str2.indexOf(64) + 1);
        return iIndexOf == 0 ? strSubstring.equalsIgnoreCase(str.substring(1)) : str.startsWith(".") ? withinDomain(strSubstring, str) : strSubstring.equalsIgnoreCase(str);
    }

    private static boolean isIPConstrained(Set set, byte[] bArr) {
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (isIPConstrained((byte[]) it8.next(), bArr)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isOtherNameConstrained(Set set, OtherName otherName) {
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (isOtherNameConstrained(OtherName.getInstance(it8.next()), otherName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isURIConstrained(String str, String str2) {
        String strExtractHostFromURL = extractHostFromURL(str2);
        return str.startsWith(".") ? withinDomain(strExtractHostFromURL, str) : strExtractHostFromURL.equalsIgnoreCase(str);
    }

    private static byte[] max(byte[] bArr, byte[] bArr2) {
        return compareTo(bArr, bArr2) > 0 ? bArr : bArr2;
    }

    private static byte[] min(byte[] bArr, byte[] bArr2) {
        return compareTo(bArr, bArr2) < 0 ? bArr : bArr2;
    }

    private static byte[][] minMaxIPs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr5[i] = (byte) (bArr[i] & bArr2[i]);
            byte b4 = bArr[i];
            byte b5 = bArr2[i];
            bArr6[i] = (byte) ((b4 & b5) | (~b5));
            bArr7[i] = (byte) (bArr3[i] & bArr4[i]);
            byte b7 = bArr3[i];
            byte b13 = bArr4[i];
            bArr8[i] = (byte) ((b7 & b13) | (~b13));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static byte[] or(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] | bArr2[i]);
        }
        return bArr3;
    }

    private static String stringifyIP(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < bArr.length / 2; i++) {
            if (sb6.length() > 0) {
                sb6.append(".");
            }
            sb6.append(Integer.toString(bArr[i] & UnsignedBytes.MAX_VALUE));
        }
        sb6.append("/");
        boolean z = true;
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            if (z) {
                z = false;
            } else {
                sb6.append(".");
            }
            sb6.append(Integer.toString(bArr[length] & UnsignedBytes.MAX_VALUE));
        }
        return sb6.toString();
    }

    private static String stringifyIPCollection(Set set) {
        StringBuilder sbS = a.s("[");
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (sbS.length() > 1) {
                sbS.append(",");
            }
            sbS.append(stringifyIP((byte[]) it8.next()));
        }
        sbS.append("]");
        return sbS.toString();
    }

    private static String stringifyOtherNameCollection(Set set) {
        StringBuilder sbS = a.s("[");
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (sbS.length() > 1) {
                sbS.append(",");
            }
            OtherName otherName = OtherName.getInstance(it8.next());
            sbS.append(otherName.getTypeID().getId());
            sbS.append(":");
            try {
                sbS.append(Hex.toHexString(otherName.getValue().toASN1Primitive().getEncoded()));
            } catch (IOException e) {
                sbS.append(e.toString());
            }
        }
        sbS.append("]");
        return sbS.toString();
    }

    private static Set unionDN(Set set, ASN1Sequence aSN1Sequence) {
        if (set.isEmpty()) {
            if (aSN1Sequence != null) {
                set.add(aSN1Sequence);
            }
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(it8.next());
            if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                hashSet.add(aSN1Sequence2);
            } else {
                if (!withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                    hashSet.add(aSN1Sequence2);
                }
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private static Set unionDNS(Set set, String str) {
        if (set.isEmpty()) {
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            String str2 = (String) it8.next();
            if (!isDNSConstrained(str, str2)) {
                boolean zWithinDomain = withinDomain(str, str2);
                hashSet.add(str2);
                if (zWithinDomain) {
                }
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    private static Set unionEmail(Set set, String str) {
        if (set.isEmpty()) {
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            unionEmail((String) it8.next(), str, hashSet);
        }
        return hashSet;
    }

    private static Set unionIP(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr != null) {
                set.add(bArr);
            }
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            hashSet.addAll(unionIPRange((byte[]) it8.next(), bArr));
        }
        return hashSet;
    }

    private static Set unionIPRange(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        boolean zAreEqual = Arrays.areEqual(bArr, bArr2);
        hashSet.add(bArr);
        if (zAreEqual) {
            return hashSet;
        }
        hashSet.add(bArr2);
        return hashSet;
    }

    private static Set unionOtherName(Set set, OtherName otherName) {
        HashSet hashSet = set != null ? new HashSet(set) : new HashSet();
        hashSet.add(otherName);
        return hashSet;
    }

    private static Set unionURI(Set set, String str) {
        if (set.isEmpty()) {
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            unionURI((String) it8.next(), str, hashSet);
        }
        return hashSet;
    }

    private static boolean withinDNSubtree(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
        if (aSN1Sequence2.size() < 1 || aSN1Sequence2.size() > aSN1Sequence.size()) {
            return false;
        }
        RDN rdn = RDN.getInstance(aSN1Sequence2.getObjectAt(0));
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= aSN1Sequence.size()) {
                i = i2;
                break;
            }
            if (IETFUtils.rDNAreEqual(rdn, RDN.getInstance(aSN1Sequence.getObjectAt(i)))) {
                break;
            }
            i2 = i;
            i++;
        }
        if (aSN1Sequence2.size() > aSN1Sequence.size() - i) {
            return false;
        }
        for (int i3 = 0; i3 < aSN1Sequence2.size(); i3++) {
            RDN rdn2 = RDN.getInstance(aSN1Sequence2.getObjectAt(i3));
            RDN rdn3 = RDN.getInstance(aSN1Sequence.getObjectAt(i + i3));
            if (rdn2.size() != rdn3.size() || !rdn2.getFirst().getType().equals((ASN1Primitive) rdn3.getFirst().getType())) {
                return false;
            }
            if (rdn2.size() == 1 && rdn2.getFirst().getType().equals((ASN1Primitive) RFC4519Style.serialNumber)) {
                if (!rdn3.getFirst().getValue().toString().startsWith(rdn2.getFirst().getValue().toString())) {
                    return false;
                }
            } else if (!IETFUtils.rDNAreEqual(rdn2, rdn3)) {
                return false;
            }
        }
        return true;
    }

    private static boolean withinDomain(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] strArrSplit = Strings.split(str2, CoreConstants.DOT);
        String[] strArrSplit2 = Strings.split(str, CoreConstants.DOT);
        if (strArrSplit2.length <= strArrSplit.length) {
            return false;
        }
        int length = strArrSplit2.length - strArrSplit.length;
        if (strArrSplit2[length - 1].equals("")) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].equalsIgnoreCase(strArrSplit2[length + i])) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        GeneralName base = generalSubtree.getBase();
        ASN1Encodable name = base.getName();
        int tagNo = base.getTagNo();
        if (tagNo == 0) {
            this.excludedSubtreesOtherName = unionOtherName(this.excludedSubtreesOtherName, OtherName.getInstance(name));
            return;
        }
        if (tagNo == 1) {
            this.excludedSubtreesEmail = unionEmail(this.excludedSubtreesEmail, extractNameAsString(name));
            return;
        }
        if (tagNo == 2) {
            this.excludedSubtreesDNS = unionDNS(this.excludedSubtreesDNS, extractNameAsString(name));
            return;
        }
        if (tagNo == 4) {
            this.excludedSubtreesDN = unionDN(this.excludedSubtreesDN, ASN1Sequence.getInstance(name));
            return;
        }
        if (tagNo == 6) {
            this.excludedSubtreesURI = unionURI(this.excludedSubtreesURI, extractNameAsString(name));
        } else if (tagNo == 7) {
            this.excludedSubtreesIP = unionIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(name).getOctets());
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + base.getTagNo());
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkExcluded(GeneralName generalName) throws NameConstraintValidatorException {
        ASN1Encodable name = generalName.getName();
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            checkExcludedOtherName(this.excludedSubtreesOtherName, OtherName.getInstance(name));
            return;
        }
        if (tagNo == 1) {
            checkExcludedEmail(extractNameAsString(name));
            return;
        }
        if (tagNo == 2) {
            checkExcludedDNS(this.excludedSubtreesDNS, extractNameAsString(name));
            return;
        }
        if (tagNo == 4) {
            checkExcludedDN(X500Name.getInstance(name));
        } else if (tagNo == 6) {
            checkExcludedURI(this.excludedSubtreesURI, extractNameAsString(name));
        } else {
            if (tagNo != 7) {
                return;
            }
            checkExcludedIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(name).getOctets());
        }
    }

    public void checkExcludedEmail(String str) throws NameConstraintValidatorException {
        checkExcludedEmail(this.excludedSubtreesEmail, str);
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkPermitted(GeneralName generalName) throws NameConstraintValidatorException {
        ASN1Encodable name = generalName.getName();
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            checkPermittedOtherName(this.permittedSubtreesOtherName, OtherName.getInstance(name));
            return;
        }
        if (tagNo == 1) {
            checkPermittedEmail(extractNameAsString(name));
            return;
        }
        if (tagNo == 2) {
            checkPermittedDNS(this.permittedSubtreesDNS, extractNameAsString(name));
            return;
        }
        if (tagNo == 4) {
            checkPermittedDN(X500Name.getInstance(name));
        } else if (tagNo == 6) {
            checkPermittedURI(this.permittedSubtreesURI, extractNameAsString(name));
        } else {
            if (tagNo != 7) {
                return;
            }
            checkPermittedIP(this.permittedSubtreesIP, ASN1OctetString.getInstance(name).getOctets());
        }
    }

    public void checkPermittedEmail(String str) throws NameConstraintValidatorException {
        checkPermittedEmail(this.permittedSubtreesEmail, str);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof PKIXNameConstraintValidator)) {
            return false;
        }
        PKIXNameConstraintValidator pKIXNameConstraintValidator = (PKIXNameConstraintValidator) obj2;
        return collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesDN, this.excludedSubtreesDN) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesDNS, this.excludedSubtreesDNS) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesEmail, this.excludedSubtreesEmail) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesIP, this.excludedSubtreesIP) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesURI, this.excludedSubtreesURI) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesOtherName, this.excludedSubtreesOtherName) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesDN, this.permittedSubtreesDN) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesDNS, this.permittedSubtreesDNS) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesEmail, this.permittedSubtreesEmail) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesIP, this.permittedSubtreesIP) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesURI, this.permittedSubtreesURI) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesOtherName, this.permittedSubtreesOtherName);
    }

    public int hashCode() {
        return hashCollection(this.excludedSubtreesDN) + hashCollection(this.excludedSubtreesDNS) + hashCollection(this.excludedSubtreesEmail) + hashCollection(this.excludedSubtreesIP) + hashCollection(this.excludedSubtreesURI) + hashCollection(this.excludedSubtreesOtherName) + hashCollection(this.permittedSubtreesDN) + hashCollection(this.permittedSubtreesDNS) + hashCollection(this.permittedSubtreesEmail) + hashCollection(this.permittedSubtreesIP) + hashCollection(this.permittedSubtreesURI) + hashCollection(this.permittedSubtreesOtherName);
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectEmptyPermittedSubtree(int i) {
        if (i == 0) {
            this.permittedSubtreesOtherName = new HashSet();
            return;
        }
        if (i == 1) {
            this.permittedSubtreesEmail = new HashSet();
            return;
        }
        if (i == 2) {
            this.permittedSubtreesDNS = new HashSet();
            return;
        }
        if (i == 4) {
            this.permittedSubtreesDN = new HashSet();
        } else if (i == 6) {
            this.permittedSubtreesURI = new HashSet();
        } else {
            if (i != 7) {
                throw new IllegalStateException(d.n("Unknown tag encountered: ", i));
            }
            this.permittedSubtreesIP = new HashSet();
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        intersectPermittedSubtree(new GeneralSubtree[]{generalSubtree});
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        addLine(sb6, "permitted:");
        if (this.permittedSubtreesDN != null) {
            addLine(sb6, "DN:");
            addLine(sb6, this.permittedSubtreesDN.toString());
        }
        if (this.permittedSubtreesDNS != null) {
            addLine(sb6, "DNS:");
            addLine(sb6, this.permittedSubtreesDNS.toString());
        }
        if (this.permittedSubtreesEmail != null) {
            addLine(sb6, "Email:");
            addLine(sb6, this.permittedSubtreesEmail.toString());
        }
        if (this.permittedSubtreesURI != null) {
            addLine(sb6, "URI:");
            addLine(sb6, this.permittedSubtreesURI.toString());
        }
        if (this.permittedSubtreesIP != null) {
            addLine(sb6, "IP:");
            addLine(sb6, stringifyIPCollection(this.permittedSubtreesIP));
        }
        if (this.permittedSubtreesOtherName != null) {
            addLine(sb6, "OtherName:");
            addLine(sb6, stringifyOtherNameCollection(this.permittedSubtreesOtherName));
        }
        addLine(sb6, "excluded:");
        if (!this.excludedSubtreesDN.isEmpty()) {
            addLine(sb6, "DN:");
            addLine(sb6, this.excludedSubtreesDN.toString());
        }
        if (!this.excludedSubtreesDNS.isEmpty()) {
            addLine(sb6, "DNS:");
            addLine(sb6, this.excludedSubtreesDNS.toString());
        }
        if (!this.excludedSubtreesEmail.isEmpty()) {
            addLine(sb6, "Email:");
            addLine(sb6, this.excludedSubtreesEmail.toString());
        }
        if (!this.excludedSubtreesURI.isEmpty()) {
            addLine(sb6, "URI:");
            addLine(sb6, this.excludedSubtreesURI.toString());
        }
        if (!this.excludedSubtreesIP.isEmpty()) {
            addLine(sb6, "IP:");
            addLine(sb6, stringifyIPCollection(this.excludedSubtreesIP));
        }
        if (!this.excludedSubtreesOtherName.isEmpty()) {
            addLine(sb6, "OtherName:");
            addLine(sb6, stringifyOtherNameCollection(this.excludedSubtreesOtherName));
        }
        return sb6.toString();
    }

    private static void checkExcludedEmail(Set set, String str) throws NameConstraintValidatorException {
        if (isEmailConstrained(set, str)) {
            throw new NameConstraintValidatorException("Email address is from an excluded subtree.");
        }
    }

    private static void checkPermittedEmail(Set set, String str) throws NameConstraintValidatorException {
        if (set != null) {
            if ((str.length() != 0 || set.size() != 0) && !isEmailConstrained(set, str)) {
                throw new NameConstraintValidatorException("Subject email address is not from a permitted subtree.");
            }
        }
    }

    private static boolean equals(Object obj2, Object obj3) {
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 == null || obj3 == null) {
            return false;
        }
        return ((obj2 instanceof byte[]) && (obj3 instanceof byte[])) ? Arrays.areEqual((byte[]) obj2, (byte[]) obj3) : obj2.equals(obj3);
    }

    private static String extractNameAsString(GeneralSubtree generalSubtree) {
        return extractNameAsString(generalSubtree.getBase().getName());
    }

    private static void intersectEmail(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (strSubstring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (!str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(str, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (withinDomain(str2.substring(str2.indexOf(64) + 1), str)) {
                set.add(str2);
            }
        } else if (!str2.startsWith(".")) {
            if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (isDNSConstrained(str2, str)) {
            set.add(str);
        } else if (withinDomain(str2, str)) {
            set.add(str2);
        }
    }

    private static void intersectOtherName(OtherName otherName, OtherName otherName2, Set set) {
        if (otherName.equals(otherName2)) {
            set.add(otherName);
        }
    }

    private static void intersectURI(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (strSubstring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (!str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(str, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (withinDomain(str2.substring(str2.indexOf(64) + 1), str)) {
                set.add(str2);
            }
        } else if (!str2.startsWith(".")) {
            if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (isDNSConstrained(str2, str)) {
            set.add(str);
        } else if (withinDomain(str2, str)) {
            set.add(str2);
        }
    }

    private static boolean isDNSConstrained(Set set, String str) {
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (isDNSConstrained((String) it8.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEmailConstrained(Set set, String str) {
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (isEmailConstrained((String) it8.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIPConstrained(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length != bArr.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr2[i] & bArr3[i]);
        }
        return Arrays.areEqual(bArr4, bArr5);
    }

    private static boolean isOtherNameConstrained(OtherName otherName, OtherName otherName2) {
        return otherName.equals(otherName2);
    }

    private static boolean isURIConstrained(Set set, String str) {
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (isURIConstrained((String) it8.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private static void unionEmail(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str2);
                    return;
                }
            } else if (strSubstring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            }
        } else {
            if (str.startsWith(".")) {
                if (str2.indexOf(64) != -1) {
                    boolean zWithinDomain = withinDomain(str2.substring(str2.indexOf(64) + 1), str);
                    set.add(str);
                    if (zWithinDomain) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (!str2.startsWith(".")) {
                    boolean zWithinDomain2 = withinDomain(str2, str);
                    set.add(str);
                    if (zWithinDomain2) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (isDNSConstrained(str2, str)) {
                    set.add(str2);
                    return;
                }
                boolean zWithinDomain3 = withinDomain(str2, str);
                set.add(str);
                if (zWithinDomain3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase2 = str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str);
                set.add(str);
                if (zEqualsIgnoreCase2) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (!str2.startsWith(".")) {
                boolean zEqualsIgnoreCase3 = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
        }
        set.add(str);
        set.add(str2);
    }

    private static void unionURI(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str2);
                    return;
                }
            } else if (strSubstring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            }
        } else {
            if (str.startsWith(".")) {
                if (str2.indexOf(64) != -1) {
                    boolean zWithinDomain = withinDomain(str2.substring(str2.indexOf(64) + 1), str);
                    set.add(str);
                    if (zWithinDomain) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (!str2.startsWith(".")) {
                    boolean zWithinDomain2 = withinDomain(str2, str);
                    set.add(str);
                    if (zWithinDomain2) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (isDNSConstrained(str2, str)) {
                    set.add(str2);
                    return;
                }
                boolean zWithinDomain3 = withinDomain(str2, str);
                set.add(str);
                if (zWithinDomain3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase2 = str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str);
                set.add(str);
                if (zEqualsIgnoreCase2) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (!str2.startsWith(".")) {
                boolean zEqualsIgnoreCase3 = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
        }
        set.add(str);
        set.add(str2);
    }

    public void checkExcludedDN(X500Name x500Name) throws NameConstraintValidatorException {
        checkExcludedDN(this.excludedSubtreesDN, ASN1Sequence.getInstance(x500Name));
    }

    public void checkPermittedDN(X500Name x500Name) throws NameConstraintValidatorException {
        checkPermittedDN(this.permittedSubtreesDN, ASN1Sequence.getInstance(x500Name));
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        HashMap map = new HashMap();
        for (int i = 0; i != generalSubtreeArr.length; i++) {
            GeneralSubtree generalSubtree = generalSubtreeArr[i];
            Integer numValueOf = Integers.valueOf(generalSubtree.getBase().getTagNo());
            Set hashSet = (Set) map.get(numValueOf);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(numValueOf, hashSet);
            }
            hashSet.add(generalSubtree);
        }
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            Set set = (Set) entry.getValue();
            if (iIntValue == 0) {
                this.permittedSubtreesOtherName = intersectOtherName(this.permittedSubtreesOtherName, set);
            } else if (iIntValue == 1) {
                this.permittedSubtreesEmail = intersectEmail(this.permittedSubtreesEmail, set);
            } else if (iIntValue == 2) {
                this.permittedSubtreesDNS = intersectDNS(this.permittedSubtreesDNS, set);
            } else if (iIntValue == 4) {
                this.permittedSubtreesDN = intersectDN(this.permittedSubtreesDN, set);
            } else if (iIntValue == 6) {
                this.permittedSubtreesURI = intersectURI(this.permittedSubtreesURI, set);
            } else {
                if (iIntValue != 7) {
                    throw new IllegalStateException(d.n("Unknown tag encountered: ", iIntValue));
                }
                this.permittedSubtreesIP = intersectIP(this.permittedSubtreesIP, set);
            }
        }
    }
}
