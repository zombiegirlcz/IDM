package b9;

/* JADX INFO: loaded from: classes16.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13311c;
    public float d;

    public b0(float f, float f4, float f5, float f6) {
        this.f13309a = f;
        this.f13310b = f4;
        this.f13311c = f5;
        this.d = f6;
    }

    public final float a() {
        return this.f13309a + this.f13311c;
    }

    public final float b() {
        return this.f13310b + this.d;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("[");
        sb6.append(this.f13309a);
        sb6.append(" ");
        sb6.append(this.f13310b);
        sb6.append(" ");
        sb6.append(this.f13311c);
        sb6.append(" ");
        return ehe.n.t(this.d, "]", sb6);
    }

    public b0(b0 b0Var) {
        this.f13309a = b0Var.f13309a;
        this.f13310b = b0Var.f13310b;
        this.f13311c = b0Var.f13311c;
        this.d = b0Var.d;
    }
}
