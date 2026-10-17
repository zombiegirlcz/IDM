package le;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194342c;
    public long d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f194343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f194344h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f194345j;

    public final o0 a() {
        String str;
        String str2;
        String str3;
        if (this.f194345j == 63 && (str = this.f194341b) != null && (str2 = this.f194344h) != null && (str3 = this.i) != null) {
            return new o0(this.f194340a, str, this.f194342c, this.d, this.e, this.f, this.f194343g, str2, str3);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((this.f194345j & 1) == 0) {
            sb6.append(" arch");
        }
        if (this.f194341b == null) {
            sb6.append(" model");
        }
        if ((this.f194345j & 2) == 0) {
            sb6.append(" cores");
        }
        if ((this.f194345j & 4) == 0) {
            sb6.append(" ram");
        }
        if ((this.f194345j & 8) == 0) {
            sb6.append(" diskSpace");
        }
        if ((this.f194345j & 16) == 0) {
            sb6.append(" simulator");
        }
        if ((this.f194345j & 32) == 0) {
            sb6.append(" state");
        }
        if (this.f194344h == null) {
            sb6.append(" manufacturer");
        }
        if (this.i == null) {
            sb6.append(" modelClass");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
