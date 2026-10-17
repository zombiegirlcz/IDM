package ms0;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f208447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f208448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208449c;

    public u1(float f, float f4, int i) {
        this.f208447a = f;
        this.f208448b = f4;
        this.f208449c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Float.compare(this.f208447a, u1Var.f208447a) == 0 && Float.compare(this.f208448b, u1Var.f208448b) == 0 && this.f208449c == u1Var.f208449c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208449c) + m72.b.b(this.f208448b, Float.hashCode(this.f208447a) * 31, 31);
    }
}
