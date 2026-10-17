package le;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f194412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f194414c;
    public long d;
    public int e;
    public byte f;

    public final y0 a() {
        String str;
        if (this.f == 7 && (str = this.f194413b) != null) {
            return new y0(this.e, this.f194412a, this.d, str, this.f194414c);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb6.append(" pc");
        }
        if (this.f194413b == null) {
            sb6.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb6.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb6.append(" importance");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
