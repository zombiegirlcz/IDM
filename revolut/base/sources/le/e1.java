package le;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1 f194254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f194256c;
    public long d;
    public byte e;

    public final f1 a() {
        g1 g1Var;
        String str;
        String str2;
        if (this.e == 1 && (g1Var = this.f194254a) != null && (str = this.f194255b) != null && (str2 = this.f194256c) != null) {
            return new f1(g1Var, str, str2, this.d);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f194254a == null) {
            sb6.append(" rolloutVariant");
        }
        if (this.f194255b == null) {
            sb6.append(" parameterKey");
        }
        if (this.f194256c == null) {
            sb6.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb6.append(" templateVersion");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
