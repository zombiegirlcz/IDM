package he3;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f151570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151571b;

    public r(Map items, List rates) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f151570a = items;
        this.f151571b = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f151570a, rVar.f151570a) && Intrinsics.f(this.f151571b, rVar.f151571b);
    }

    public final int hashCode() {
        return this.f151571b.hashCode() + (this.f151570a.hashCode() * 31);
    }
}
