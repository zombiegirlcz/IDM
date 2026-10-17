package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10406b;

    public l5(float f, float f4) {
        this.f10405a = f;
        this.f10406b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj2;
        return Float.compare(2.0f, 2.0f) == 0 && Float.compare(2.0f, 2.0f) == 0 && Float.compare(this.f10405a, l5Var.f10405a) == 0 && Float.compare(this.f10406b, l5Var.f10406b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10406b) + m72.b.b(this.f10405a, m72.b.b(2.0f, Float.hashCode(2.0f) * 31, 31), 31);
    }
}
