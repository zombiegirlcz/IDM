package le;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f194424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194425c;
    public boolean d;
    public byte e;

    public final a1 a() {
        String str;
        if (this.e == 7 && (str = this.f194423a) != null) {
            return new a1(str, this.f194424b, this.f194425c, this.d);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f194423a == null) {
            sb6.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb6.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb6.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb6.append(" defaultProcess");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
