package le;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f194289c;
    public boolean d;
    public byte e;

    public final j1 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.f194288b) != null && (str2 = this.f194289c) != null) {
            return new j1(this.f194287a, str, this.d, str2);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb6.append(" platform");
        }
        if (this.f194288b == null) {
            sb6.append(" version");
        }
        if (this.f194289c == null) {
            sb6.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb6.append(" jailbroken");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
