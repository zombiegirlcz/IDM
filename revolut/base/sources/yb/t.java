package yb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f312131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f312132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f312133c;
    public final long d;
    public final byte[] e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f312134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f312135h;
    public final c0 i;

    public t(long j2, Integer num, b0 b0Var, long j3, byte[] bArr, String str, long j5, j0 j0Var, c0 c0Var) {
        this.f312131a = j2;
        this.f312132b = num;
        this.f312133c = b0Var;
        this.d = j3;
        this.e = bArr;
        this.f = str;
        this.f312134g = j5;
        this.f312135h = j0Var;
        this.i = c0Var;
    }

    public final boolean equals(Object obj2) {
        Integer num;
        b0 b0Var;
        String str;
        j0 j0Var;
        c0 c0Var;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof f0) {
            f0 f0Var = (f0) obj2;
            t tVar = (t) f0Var;
            c0 c0Var2 = tVar.i;
            j0 j0Var2 = tVar.f312135h;
            String str2 = tVar.f;
            b0 b0Var2 = tVar.f312133c;
            Integer num2 = tVar.f312132b;
            if (this.f312131a == tVar.f312131a && ((num = this.f312132b) != null ? num.equals(num2) : num2 == null) && ((b0Var = this.f312133c) != null ? b0Var.equals(b0Var2) : b0Var2 == null) && this.d == tVar.d) {
                if (Arrays.equals(this.e, f0Var instanceof t ? ((t) f0Var).e : tVar.e) && ((str = this.f) != null ? str.equals(str2) : str2 == null) && this.f312134g == tVar.f312134g && ((j0Var = this.f312135h) != null ? j0Var.equals(j0Var2) : j0Var2 == null) && ((c0Var = this.i) != null ? c0Var.equals(c0Var2) : c0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f312131a;
        int i = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f312132b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        b0 b0Var = this.f312133c;
        int iHashCode2 = (iHashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        long j3 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j5 = this.f312134g;
        int i2 = (iHashCode4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        j0 j0Var = this.f312135h;
        int iHashCode5 = (i2 ^ (j0Var == null ? 0 : j0Var.hashCode())) * 1000003;
        c0 c0Var = this.i;
        return iHashCode5 ^ (c0Var != null ? c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f312131a + ", eventCode=" + this.f312132b + ", complianceData=" + this.f312133c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.f312134g + ", networkConnectionInfo=" + this.f312135h + ", experimentIds=" + this.i + "}";
    }
}
