package org.bouncycastle.asn1.cmc;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class CMCStatus extends ASN1Object {
    public static final CMCStatus confirmRequired;
    public static final CMCStatus failed;
    public static final CMCStatus noSupport;
    public static final CMCStatus partial;
    public static final CMCStatus pending;
    public static final CMCStatus popRequired;
    private static Map range;
    public static final CMCStatus success;
    private final ASN1Integer value;

    static {
        CMCStatus cMCStatus = new CMCStatus(ASN1Integer.valueOf(0));
        success = cMCStatus;
        CMCStatus cMCStatus2 = new CMCStatus(ASN1Integer.valueOf(2));
        failed = cMCStatus2;
        CMCStatus cMCStatus3 = new CMCStatus(ASN1Integer.valueOf(3));
        pending = cMCStatus3;
        CMCStatus cMCStatus4 = new CMCStatus(ASN1Integer.valueOf(4));
        noSupport = cMCStatus4;
        CMCStatus cMCStatus5 = new CMCStatus(ASN1Integer.valueOf(5));
        confirmRequired = cMCStatus5;
        CMCStatus cMCStatus6 = new CMCStatus(ASN1Integer.valueOf(6));
        popRequired = cMCStatus6;
        CMCStatus cMCStatus7 = new CMCStatus(ASN1Integer.valueOf(7));
        partial = cMCStatus7;
        HashMap map = new HashMap();
        range = map;
        map.put(cMCStatus.value, cMCStatus);
        range.put(cMCStatus2.value, cMCStatus2);
        range.put(cMCStatus3.value, cMCStatus3);
        range.put(cMCStatus4.value, cMCStatus4);
        range.put(cMCStatus5.value, cMCStatus5);
        range.put(cMCStatus6.value, cMCStatus6);
        range.put(cMCStatus7.value, cMCStatus7);
    }

    private CMCStatus(ASN1Integer aSN1Integer) {
        this.value = aSN1Integer;
    }

    public static CMCStatus getInstance(Object obj2) {
        if (obj2 instanceof CMCStatus) {
            return (CMCStatus) obj2;
        }
        if (obj2 == null) {
            return null;
        }
        CMCStatus cMCStatus = (CMCStatus) range.get(ASN1Integer.getInstance(obj2));
        if (cMCStatus != null) {
            return cMCStatus;
        }
        throw new IllegalArgumentException(a.g(obj2, "unknown object in getInstance(): "));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }
}
