package j8l;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f172236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172237c;

    public j(dj0.d fromAmount, dj0.d toAmount, String str) {
        Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
        Intrinsics.checkNotNullParameter(toAmount, "toAmount");
        this.f172235a = fromAmount;
        this.f172236b = toAmount;
        this.f172237c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f172235a, jVar.f172235a) && Intrinsics.f(this.f172236b, jVar.f172236b) && Intrinsics.f(this.f172237c, jVar.f172237c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f172235a.hashCode() * 31, 31, this.f172236b);
        String str = this.f172237c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
