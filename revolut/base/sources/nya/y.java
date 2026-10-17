package nya;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f220767a;

    public y(zhm.f0 items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220767a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220767a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f220767a, ((y) obj2).f220767a);
    }

    public final int hashCode() {
        return this.f220767a.hashCode();
    }
}
