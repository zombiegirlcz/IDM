package org.bouncycastle.asn1.cmc;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class CMCFailInfo extends ASN1Object {
    public static final CMCFailInfo authDataFail;
    public static final CMCFailInfo badAlg;
    public static final CMCFailInfo badCertId;
    public static final CMCFailInfo badIdentity;
    public static final CMCFailInfo badMessageCheck;
    public static final CMCFailInfo badRequest;
    public static final CMCFailInfo badTime;
    public static final CMCFailInfo internalCAError;
    public static final CMCFailInfo mustArchiveKeys;
    public static final CMCFailInfo noKeyReuse;
    public static final CMCFailInfo popFailed;
    public static final CMCFailInfo popRequired;
    private static Map range;
    public static final CMCFailInfo tryLater;
    public static final CMCFailInfo unsupportedExt;
    private final ASN1Integer value;

    static {
        CMCFailInfo cMCFailInfo = new CMCFailInfo(ASN1Integer.valueOf(0));
        badAlg = cMCFailInfo;
        CMCFailInfo cMCFailInfo2 = new CMCFailInfo(ASN1Integer.valueOf(1));
        badMessageCheck = cMCFailInfo2;
        CMCFailInfo cMCFailInfo3 = new CMCFailInfo(ASN1Integer.valueOf(2));
        badRequest = cMCFailInfo3;
        CMCFailInfo cMCFailInfo4 = new CMCFailInfo(ASN1Integer.valueOf(3));
        badTime = cMCFailInfo4;
        CMCFailInfo cMCFailInfo5 = new CMCFailInfo(ASN1Integer.valueOf(4));
        badCertId = cMCFailInfo5;
        CMCFailInfo cMCFailInfo6 = new CMCFailInfo(ASN1Integer.valueOf(5));
        unsupportedExt = cMCFailInfo6;
        CMCFailInfo cMCFailInfo7 = new CMCFailInfo(ASN1Integer.valueOf(6));
        mustArchiveKeys = cMCFailInfo7;
        CMCFailInfo cMCFailInfo8 = new CMCFailInfo(ASN1Integer.valueOf(7));
        badIdentity = cMCFailInfo8;
        CMCFailInfo cMCFailInfo9 = new CMCFailInfo(ASN1Integer.valueOf(8));
        popRequired = cMCFailInfo9;
        CMCFailInfo cMCFailInfo10 = new CMCFailInfo(ASN1Integer.valueOf(9));
        popFailed = cMCFailInfo10;
        CMCFailInfo cMCFailInfo11 = new CMCFailInfo(ASN1Integer.valueOf(10));
        noKeyReuse = cMCFailInfo11;
        CMCFailInfo cMCFailInfo12 = new CMCFailInfo(ASN1Integer.valueOf(11));
        internalCAError = cMCFailInfo12;
        CMCFailInfo cMCFailInfo13 = new CMCFailInfo(ASN1Integer.valueOf(12));
        tryLater = cMCFailInfo13;
        CMCFailInfo cMCFailInfo14 = new CMCFailInfo(ASN1Integer.valueOf(13));
        authDataFail = cMCFailInfo14;
        HashMap map = new HashMap();
        range = map;
        map.put(cMCFailInfo.value, cMCFailInfo);
        range.put(cMCFailInfo2.value, cMCFailInfo2);
        range.put(cMCFailInfo3.value, cMCFailInfo3);
        range.put(cMCFailInfo4.value, cMCFailInfo4);
        range.put(cMCFailInfo5.value, cMCFailInfo5);
        range.put(cMCFailInfo9.value, cMCFailInfo9);
        range.put(cMCFailInfo6.value, cMCFailInfo6);
        range.put(cMCFailInfo7.value, cMCFailInfo7);
        range.put(cMCFailInfo8.value, cMCFailInfo8);
        range.put(cMCFailInfo9.value, cMCFailInfo9);
        range.put(cMCFailInfo10.value, cMCFailInfo10);
        range.put(cMCFailInfo5.value, cMCFailInfo5);
        range.put(cMCFailInfo9.value, cMCFailInfo9);
        range.put(cMCFailInfo11.value, cMCFailInfo11);
        range.put(cMCFailInfo12.value, cMCFailInfo12);
        range.put(cMCFailInfo13.value, cMCFailInfo13);
        range.put(cMCFailInfo14.value, cMCFailInfo14);
    }

    private CMCFailInfo(ASN1Integer aSN1Integer) {
        this.value = aSN1Integer;
    }

    public static CMCFailInfo getInstance(Object obj2) {
        if (obj2 instanceof CMCFailInfo) {
            return (CMCFailInfo) obj2;
        }
        if (obj2 == null) {
            return null;
        }
        CMCFailInfo cMCFailInfo = (CMCFailInfo) range.get(ASN1Integer.getInstance(obj2));
        if (cMCFailInfo != null) {
            return cMCFailInfo;
        }
        throw new IllegalArgumentException(a.g(obj2, "unknown object in getInstance(): "));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }
}
