package le;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f194214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f194215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f194216c;
    public int d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f194217g;

    public final c1 a() {
        if (this.f194217g == 31) {
            return new c1(this.f194214a, this.f194215b, this.f194216c, this.d, this.e, this.f);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((this.f194217g & 1) == 0) {
            sb6.append(" batteryVelocity");
        }
        if ((this.f194217g & 2) == 0) {
            sb6.append(" proximityOn");
        }
        if ((this.f194217g & 4) == 0) {
            sb6.append(" orientation");
        }
        if ((this.f194217g & 8) == 0) {
            sb6.append(" ramUsed");
        }
        if ((this.f194217g & 16) == 0) {
            sb6.append(" diskUsed");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
