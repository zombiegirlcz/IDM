package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f322295c;

    public j0(String str, String str2, String str3) {
        this.f322293a = str;
        this.f322294b = str2;
        this.f322295c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f322293a, j0Var.f322293a) && Intrinsics.f(this.f322294b, j0Var.f322294b) && Intrinsics.f(this.f322295c, j0Var.f322295c);
    }

    public final int hashCode() {
        String str = this.f322293a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f322294b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f322295c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
