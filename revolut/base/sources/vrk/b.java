package vrk;

import cel.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f291610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f291611b;

    public b(int i, k quarter) {
        Intrinsics.checkNotNullParameter(quarter, "quarter");
        this.f291610a = i;
        this.f291611b = quarter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f291610a == bVar.f291610a && this.f291611b == bVar.f291611b;
    }

    public final int hashCode() {
        return this.f291611b.hashCode() + (Integer.hashCode(this.f291610a) * 31);
    }
}
