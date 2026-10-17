package fb7;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f133488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f133489b;

    public l(ArrayList balances, Map sortedAccountIdsByProductSubSpace) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(sortedAccountIdsByProductSubSpace, "sortedAccountIdsByProductSubSpace");
        this.f133488a = balances;
        this.f133489b = sortedAccountIdsByProductSubSpace;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f133488a.equals(lVar.f133488a) && Intrinsics.f(this.f133489b, lVar.f133489b);
    }

    public final int hashCode() {
        return this.f133489b.hashCode() + (this.f133488a.hashCode() * 31);
    }
}
