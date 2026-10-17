package yb;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f312136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f312137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f312138c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f312139g;

    public u(long j2, long j3, o oVar, Integer num, String str, ArrayList arrayList, k0 k0Var) {
        this.f312136a = j2;
        this.f312137b = j3;
        this.f312138c = oVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.f312139g = k0Var;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        u uVar = (u) ((g0) obj2);
        k0 k0Var = uVar.f312139g;
        ArrayList arrayList = uVar.f;
        String str = uVar.e;
        Integer num = uVar.d;
        o oVar = uVar.f312138c;
        if (this.f312136a != uVar.f312136a || this.f312137b != uVar.f312137b || !this.f312138c.equals(oVar)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(arrayList)) {
            return false;
        }
        k0 k0Var2 = this.f312139g;
        return k0Var2 == null ? k0Var == null : k0Var2.equals(k0Var);
    }

    public final int hashCode() {
        long j2 = this.f312136a;
        long j3 = this.f312137b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f312138c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        k0 k0Var = this.f312139g;
        return iHashCode3 ^ (k0Var != null ? k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f312136a + ", requestUptimeMs=" + this.f312137b + ", clientInfo=" + this.f312138c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.f312139g + "}";
    }
}
