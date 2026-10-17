package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultXMSSOid implements XMSSOid {
    private static final Map<String, DefaultXMSSOid> oidLookupTable;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private final int f228889oid;
    private final String stringRepresentation;

    static {
        HashMap map = new HashMap();
        map.put(createKey("SHA-256", 32, 16, 67, 10), new DefaultXMSSOid(1, "XMSS_SHA2_10_256"));
        map.put(createKey("SHA-256", 32, 16, 67, 16), new DefaultXMSSOid(2, "XMSS_SHA2_16_256"));
        map.put(createKey("SHA-256", 32, 16, 67, 20), new DefaultXMSSOid(3, "XMSS_SHA2_20_256"));
        map.put(createKey("SHA-512", 64, 16, ISO781611.CREATION_DATE_AND_TIME_TAG, 10), new DefaultXMSSOid(4, "XMSS_SHA2_10_512"));
        map.put(createKey("SHA-512", 64, 16, ISO781611.CREATION_DATE_AND_TIME_TAG, 16), new DefaultXMSSOid(5, "XMSS_SHA2_16_512"));
        map.put(createKey("SHA-512", 64, 16, ISO781611.CREATION_DATE_AND_TIME_TAG, 20), new DefaultXMSSOid(6, "XMSS_SHA2_20_512"));
        map.put(createKey("SHAKE128", 32, 16, 67, 10), new DefaultXMSSOid(7, "XMSS_SHAKE_10_256"));
        map.put(createKey("SHAKE128", 32, 16, 67, 16), new DefaultXMSSOid(8, "XMSS_SHAKE_16_256"));
        map.put(createKey("SHAKE128", 32, 16, 67, 20), new DefaultXMSSOid(9, "XMSS_SHAKE_20_256"));
        map.put(createKey("SHAKE256", 64, 16, ISO781611.CREATION_DATE_AND_TIME_TAG, 10), new DefaultXMSSOid(10, "XMSS_SHAKE_10_512"));
        map.put(createKey("SHAKE256", 64, 16, ISO781611.CREATION_DATE_AND_TIME_TAG, 16), new DefaultXMSSOid(11, "XMSS_SHAKE_16_512"));
        map.put(createKey("SHAKE256", 64, 16, ISO781611.CREATION_DATE_AND_TIME_TAG, 20), new DefaultXMSSOid(12, "XMSS_SHAKE_20_512"));
        oidLookupTable = Collections.unmodifiableMap(map);
    }

    private DefaultXMSSOid(int i, String str) {
        this.f228889oid = i;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i, int i2, int i3, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i5;
    }

    public static DefaultXMSSOid lookup(String str, int i, int i2, int i3, int i5) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i, i2, i3, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public int getOid() {
        return this.f228889oid;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public String toString() {
        return this.stringRepresentation;
    }
}
