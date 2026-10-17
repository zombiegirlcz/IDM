package rp0;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f256088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f256089b;

    public h0(float f, float f4) {
        this.f256088a = f;
        this.f256089b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Float.compare(this.f256088a, h0Var.f256088a) == 0 && Float.compare(this.f256089b, h0Var.f256089b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f256089b) + (Float.hashCode(this.f256088a) * 31);
    }
}
