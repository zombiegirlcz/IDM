package urb;

import aii.r;
import k4l.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f282263a;

    public a(p orderPlacementResult) {
        Intrinsics.checkNotNullParameter(orderPlacementResult, "orderPlacementResult");
        this.f282263a = orderPlacementResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f282263a, ((a) obj2).f282263a);
    }

    public final int hashCode() {
        return this.f282263a.hashCode();
    }
}
