package et0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f129095b;

    public q(List list, Function0 function0) {
        this.f129094a = list;
        this.f129095b = function0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f129094a, qVar.f129094a) && Intrinsics.f(this.f129095b, qVar.f129095b);
    }

    public final int hashCode() {
        List list = this.f129094a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Function0 function0 = this.f129095b;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }
}
