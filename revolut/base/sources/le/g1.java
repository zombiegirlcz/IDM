package le;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194274b;

    public g1(String str, String str2) {
        this.f194273a = str;
        this.f194274b = str2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof h2) {
            g1 g1Var = (g1) ((h2) obj2);
            if (this.f194273a.equals(g1Var.f194273a) && this.f194274b.equals(g1Var.f194274b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f194273a.hashCode() ^ 1000003) * 1000003) ^ this.f194274b.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("RolloutVariant{rolloutId=");
        sb6.append(this.f194273a);
        sb6.append(", variantId=");
        return v0.a.i(sb6, this.f194274b, "}");
    }
}
