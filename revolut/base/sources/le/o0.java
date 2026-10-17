package le;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194354c;
    public final long d;
    public final long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f194355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f194356h;
    public final String i;

    public o0(int i, String str, int i2, long j2, long j3, boolean z, int i3, String str2, String str3) {
        this.f194352a = i;
        this.f194353b = str;
        this.f194354c = i2;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.f194355g = i3;
        this.f194356h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof w1) {
            o0 o0Var = (o0) ((w1) obj2);
            if (this.f194352a == o0Var.f194352a && this.f194353b.equals(o0Var.f194353b) && this.f194354c == o0Var.f194354c && this.d == o0Var.d && this.e == o0Var.e && this.f == o0Var.f && this.f194355g == o0Var.f194355g && this.f194356h.equals(o0Var.f194356h) && this.i.equals(o0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f194352a ^ 1000003) * 1000003) ^ this.f194353b.hashCode()) * 1000003) ^ this.f194354c) * 1000003;
        long j2 = this.d;
        int i = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.e;
        return ((((((((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f194355g) * 1000003) ^ this.f194356h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Device{arch=");
        sb6.append(this.f194352a);
        sb6.append(", model=");
        sb6.append(this.f194353b);
        sb6.append(", cores=");
        sb6.append(this.f194354c);
        sb6.append(", ram=");
        sb6.append(this.d);
        sb6.append(", diskSpace=");
        sb6.append(this.e);
        sb6.append(", simulator=");
        sb6.append(this.f);
        sb6.append(", state=");
        sb6.append(this.f194355g);
        sb6.append(", manufacturer=");
        sb6.append(this.f194356h);
        sb6.append(", modelClass=");
        return v0.a.i(sb6, this.i, "}");
    }
}
