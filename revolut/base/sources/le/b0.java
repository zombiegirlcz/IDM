package le;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194208c;
    public String d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f194209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f194210h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n2 f194211j;
    public t1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q1 f194212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f194213m;

    public final c0 a() {
        if (this.f194213m == 1 && this.f194206a != null && this.f194207b != null && this.d != null && this.f194210h != null && this.i != null) {
            return new c0(this.f194206a, this.f194207b, this.f194208c, this.d, this.e, this.f, this.f194209g, this.f194210h, this.i, this.f194211j, this.k, this.f194212l);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f194206a == null) {
            sb6.append(" sdkVersion");
        }
        if (this.f194207b == null) {
            sb6.append(" gmpAppId");
        }
        if ((1 & this.f194213m) == 0) {
            sb6.append(" platform");
        }
        if (this.d == null) {
            sb6.append(" installationUuid");
        }
        if (this.f194210h == null) {
            sb6.append(" buildVersion");
        }
        if (this.i == null) {
            sb6.append(" displayVersion");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
