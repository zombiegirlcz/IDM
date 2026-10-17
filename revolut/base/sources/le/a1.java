package le;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194199c;
    public final boolean d;

    public a1(String str, int i, int i2, boolean z) {
        this.f194197a = str;
        this.f194198b = i;
        this.f194199c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof d2) {
            a1 a1Var = (a1) ((d2) obj2);
            if (this.f194197a.equals(a1Var.f194197a) && this.f194198b == a1Var.f194198b && this.f194199c == a1Var.f194199c && this.d == a1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f194197a.hashCode() ^ 1000003) * 1000003) ^ this.f194198b) * 1000003) ^ this.f194199c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ProcessDetails{processName=");
        sb6.append(this.f194197a);
        sb6.append(", pid=");
        sb6.append(this.f194198b);
        sb6.append(", importance=");
        sb6.append(this.f194199c);
        sb6.append(", defaultProcess=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.d, "}");
    }
}
