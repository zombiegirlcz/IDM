package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194316c;
    public final long d;
    public final Long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v1 f194317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2 f194318h;
    public final l2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f194319j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f194320l;

    public k0(String str, String str2, String str3, long j2, Long l2, boolean z, v1 v1Var, m2 m2Var, l2 l2Var, w1 w1Var, List list, int i) {
        this.f194314a = str;
        this.f194315b = str2;
        this.f194316c = str3;
        this.d = j2;
        this.e = l2;
        this.f = z;
        this.f194317g = v1Var;
        this.f194318h = m2Var;
        this.i = l2Var;
        this.f194319j = w1Var;
        this.k = list;
        this.f194320l = i;
    }

    @Override // le.n2
    public final j0 a() {
        j0 j0Var = new j0();
        j0Var.f194298a = this.f194314a;
        j0Var.f194299b = this.f194315b;
        j0Var.f194300c = this.f194316c;
        j0Var.d = this.d;
        j0Var.e = this.e;
        j0Var.f = this.f;
        j0Var.f194301g = this.f194317g;
        j0Var.f194302h = this.f194318h;
        j0Var.i = this.i;
        j0Var.f194303j = this.f194319j;
        j0Var.k = this.k;
        j0Var.f194304l = this.f194320l;
        j0Var.f194305m = (byte) 7;
        return j0Var;
    }

    public final boolean equals(Object obj2) {
        String str;
        Long l2;
        m2 m2Var;
        l2 l2Var;
        w1 w1Var;
        List list;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof n2) {
            k0 k0Var = (k0) ((n2) obj2);
            List list2 = k0Var.k;
            w1 w1Var2 = k0Var.f194319j;
            l2 l2Var2 = k0Var.i;
            m2 m2Var2 = k0Var.f194318h;
            Long l3 = k0Var.e;
            String str2 = k0Var.f194316c;
            if (this.f194314a.equals(k0Var.f194314a) && this.f194315b.equals(k0Var.f194315b) && ((str = this.f194316c) != null ? str.equals(str2) : str2 == null) && this.d == k0Var.d && ((l2 = this.e) != null ? l2.equals(l3) : l3 == null) && this.f == k0Var.f && this.f194317g.equals(k0Var.f194317g) && ((m2Var = this.f194318h) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((l2Var = this.i) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((w1Var = this.f194319j) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((list = this.k) != null ? list.equals(list2) : list2 == null) && this.f194320l == k0Var.f194320l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f194314a.hashCode() ^ 1000003) * 1000003) ^ this.f194315b.hashCode()) * 1000003;
        String str = this.f194316c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l2 = this.e;
        int iHashCode3 = (((((i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f194317g.hashCode()) * 1000003;
        m2 m2Var = this.f194318h;
        int iHashCode4 = (iHashCode3 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        l2 l2Var = this.i;
        int iHashCode5 = (iHashCode4 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        w1 w1Var = this.f194319j;
        int iHashCode6 = (iHashCode5 ^ (w1Var == null ? 0 : w1Var.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f194320l;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Session{generator=");
        sb6.append(this.f194314a);
        sb6.append(", identifier=");
        sb6.append(this.f194315b);
        sb6.append(", appQualitySessionId=");
        sb6.append(this.f194316c);
        sb6.append(", startedAt=");
        sb6.append(this.d);
        sb6.append(", endedAt=");
        sb6.append(this.e);
        sb6.append(", crashed=");
        sb6.append(this.f);
        sb6.append(", app=");
        sb6.append(this.f194317g);
        sb6.append(", user=");
        sb6.append(this.f194318h);
        sb6.append(", os=");
        sb6.append(this.i);
        sb6.append(", device=");
        sb6.append(this.f194319j);
        sb6.append(", events=");
        sb6.append(this.k);
        sb6.append(", generatorType=");
        return j6.a.v(sb6, "}", this.f194320l);
    }
}
