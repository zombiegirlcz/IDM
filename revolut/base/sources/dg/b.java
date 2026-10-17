package dg;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f114554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f114555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f114556c;
    public String d;
    public long e;
    public byte f;

    public final c a() {
        if (this.f == 1 && this.f114554a != null && this.f114555b != null && this.f114556c != null && this.d != null) {
            return new c(this.e, this.f114554a, this.f114555b, this.f114556c, this.d);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f114554a == null) {
            sb6.append(" rolloutId");
        }
        if (this.f114555b == null) {
            sb6.append(" variantId");
        }
        if (this.f114556c == null) {
            sb6.append(" parameterKey");
        }
        if (this.d == null) {
            sb6.append(" parameterValue");
        }
        if ((1 & this.f) == 0) {
            sb6.append(" templateVersion");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
