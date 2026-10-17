package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10631b;

    public y6(float f, float f4) {
        this.f10630a = f;
        this.f10631b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj2;
        return Float.compare(this.f10630a, y6Var.f10630a) == 0 && Float.compare(this.f10631b, y6Var.f10631b) == 0;
    }

    public final int hashCode() {
        return m72.b.b(this.f10631b, Float.hashCode(this.f10630a) * 31, 31);
    }
}
