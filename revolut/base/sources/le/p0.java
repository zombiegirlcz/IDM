package le;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f194362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e2 f194364c;
    public f2 d;
    public g2 e;
    public j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f194365g;

    public final q0 a() {
        String str;
        e2 e2Var;
        f2 f2Var;
        if (this.f194365g == 1 && (str = this.f194363b) != null && (e2Var = this.f194364c) != null && (f2Var = this.d) != null) {
            return new q0(this.f194362a, str, e2Var, f2Var, this.e, this.f);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((1 & this.f194365g) == 0) {
            sb6.append(" timestamp");
        }
        if (this.f194363b == null) {
            sb6.append(" type");
        }
        if (this.f194364c == null) {
            sb6.append(" app");
        }
        if (this.d == null) {
            sb6.append(" device");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
