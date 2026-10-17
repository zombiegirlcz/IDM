package wwf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300654a;

    public g(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f300654a = ids;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f300654a, ((g) obj2).f300654a);
    }

    public final int hashCode() {
        return this.f300654a.hashCode();
    }
}
