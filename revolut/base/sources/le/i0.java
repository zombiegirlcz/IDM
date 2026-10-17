package le;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f194286b;

    public i0(String str, byte[] bArr) {
        this.f194285a = str;
        this.f194286b = bArr;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof s1) {
            s1 s1Var = (s1) obj2;
            i0 i0Var = (i0) s1Var;
            if (this.f194285a.equals(i0Var.f194285a)) {
                if (Arrays.equals(this.f194286b, s1Var instanceof i0 ? ((i0) s1Var).f194286b : i0Var.f194286b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f194285a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f194286b);
    }

    public final String toString() {
        return "File{filename=" + this.f194285a + ", contents=" + Arrays.toString(this.f194286b) + "}";
    }
}
