package le;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f194371c;
    public final f2 d;
    public final g2 e;
    public final j2 f;

    public q0(long j2, String str, e2 e2Var, f2 f2Var, g2 g2Var, j2 j2Var) {
        this.f194369a = j2;
        this.f194370b = str;
        this.f194371c = e2Var;
        this.d = f2Var;
        this.e = g2Var;
        this.f = j2Var;
    }

    public final p0 a() {
        p0 p0Var = new p0();
        p0Var.f194362a = this.f194369a;
        p0Var.f194363b = this.f194370b;
        p0Var.f194364c = this.f194371c;
        p0Var.d = this.d;
        p0Var.e = this.e;
        p0Var.f = this.f;
        p0Var.f194365g = (byte) 1;
        return p0Var;
    }

    public final boolean equals(Object obj2) {
        g2 g2Var;
        j2 j2Var;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof k2) {
            q0 q0Var = (q0) ((k2) obj2);
            j2 j2Var2 = q0Var.f;
            g2 g2Var2 = q0Var.e;
            if (this.f194369a == q0Var.f194369a && this.f194370b.equals(q0Var.f194370b) && this.f194371c.equals(q0Var.f194371c) && this.d.equals(q0Var.d) && ((g2Var = this.e) != null ? g2Var.equals(g2Var2) : g2Var2 == null) && ((j2Var = this.f) != null ? j2Var.equals(j2Var2) : j2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f194369a;
        int iHashCode = (((((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ this.f194370b.hashCode()) * 1000003) ^ this.f194371c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        g2 g2Var = this.e;
        int iHashCode2 = (iHashCode ^ (g2Var == null ? 0 : g2Var.hashCode())) * 1000003;
        j2 j2Var = this.f;
        return iHashCode2 ^ (j2Var != null ? j2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f194369a + ", type=" + this.f194370b + ", app=" + this.f194371c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
