package zb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f320775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f320776c;
    public final long d;
    public final long e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f320777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f320778h;
    public final byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f320779j;

    public i(String str, Integer num, m mVar, long j2, long j3, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f320774a = str;
        this.f320775b = num;
        this.f320776c = mVar;
        this.d = j2;
        this.e = j3;
        this.f = map;
        this.f320777g = num2;
        this.f320778h = str2;
        this.i = bArr;
        this.f320779j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f320774a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f320768a = str;
        hVar.f320769b = this.f320775b;
        hVar.f320771g = this.f320777g;
        hVar.f320772h = this.f320778h;
        hVar.i = this.i;
        hVar.f320773j = this.f320779j;
        m mVar = this.f320776c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f320770c = mVar;
        hVar.d = Long.valueOf(this.d);
        hVar.e = Long.valueOf(this.e);
        hVar.f = new HashMap(this.f);
        return hVar;
    }

    public final boolean equals(Object obj2) {
        Integer num;
        Integer num2;
        String str;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof i) {
            i iVar = (i) obj2;
            String str2 = iVar.f320778h;
            Integer num3 = iVar.f320777g;
            Integer num4 = iVar.f320775b;
            if (this.f320774a.equals(iVar.f320774a) && ((num = this.f320775b) != null ? num.equals(num4) : num4 == null) && this.f320776c.equals(iVar.f320776c) && this.d == iVar.d && this.e == iVar.e && this.f.equals(iVar.f) && ((num2 = this.f320777g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f320778h) != null ? str.equals(str2) : str2 == null)) {
                boolean z = iVar instanceof i;
                if (Arrays.equals(this.i, z ? iVar.i : iVar.i)) {
                    if (Arrays.equals(this.f320779j, z ? iVar.f320779j : iVar.f320779j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f320774a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f320775b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f320776c.hashCode()) * 1000003;
        long j2 = this.d;
        int i = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.e;
        int iHashCode3 = (((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.f320777g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f320778h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.f320779j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f320774a + ", code=" + this.f320775b + ", encodedPayload=" + this.f320776c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.f320777g + ", pseudonymousId=" + this.f320778h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f320779j) + "}";
    }
}
