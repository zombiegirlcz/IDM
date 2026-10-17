package rpb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f256336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f256337b;

    public q(int i, List moneyBoxes) {
        Intrinsics.checkNotNullParameter(moneyBoxes, "moneyBoxes");
        this.f256336a = i;
        this.f256337b = moneyBoxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f256336a == qVar.f256336a && Intrinsics.f(this.f256337b, qVar.f256337b);
    }

    public final int hashCode() {
        return this.f256337b.hashCode() + (Integer.hashCode(this.f256336a) * 31);
    }
}
