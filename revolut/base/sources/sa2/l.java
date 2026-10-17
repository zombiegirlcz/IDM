package sa2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f261277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f261278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f261279c;

    public l(int i, int i2, String descriptionArg) {
        Intrinsics.checkNotNullParameter(descriptionArg, "descriptionArg");
        this.f261277a = i;
        this.f261278b = i2;
        this.f261279c = descriptionArg;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f261277a == lVar.f261277a && this.f261278b == lVar.f261278b && Intrinsics.f(this.f261279c, lVar.f261279c);
    }

    public final int hashCode() {
        return this.f261279c.hashCode() + j6.a.b(this.f261278b, Integer.hashCode(this.f261277a) * 31, 31);
    }
}
