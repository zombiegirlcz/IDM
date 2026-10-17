package le;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f194348c;
    public final long d;
    public final boolean e;
    public final int f;

    public n1(int i, int i2, long j2, long j3, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f194346a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f194347b = i2;
        this.f194348c = j2;
        this.d = j3;
        this.e = z;
        this.f = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        if (this.f194346a != n1Var.f194346a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f194347b != n1Var.f194347b || this.f194348c != n1Var.f194348c || this.d != n1Var.d || this.e != n1Var.e || this.f != n1Var.f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f194346a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f194347b) * 1000003;
        long j2 = this.f194348c;
        int i = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.d;
        return ((((((((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("DeviceData{arch=");
        sb6.append(this.f194346a);
        sb6.append(", model=");
        sb6.append(Build.MODEL);
        sb6.append(", availableProcessors=");
        sb6.append(this.f194347b);
        sb6.append(", totalRam=");
        sb6.append(this.f194348c);
        sb6.append(", diskSpace=");
        sb6.append(this.d);
        sb6.append(", isEmulator=");
        sb6.append(this.e);
        sb6.append(", state=");
        sb6.append(this.f);
        sb6.append(", manufacturer=");
        sb6.append(Build.MANUFACTURER);
        sb6.append(", modelClass=");
        return v0.a.i(sb6, Build.PRODUCT, "}");
    }
}
