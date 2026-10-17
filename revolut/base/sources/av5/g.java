package av5;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9918a;

    public g(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f9918a = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f9918a, ((g) obj2).f9918a);
    }

    public final int hashCode() {
        return this.f9918a.hashCode();
    }
}
