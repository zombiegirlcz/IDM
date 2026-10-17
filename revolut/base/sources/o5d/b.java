package o5d;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionDelegate f222421a;

    public b(SwipeToActionDelegate swipeToActionRowDelegate) {
        Intrinsics.checkNotNullParameter(swipeToActionRowDelegate, "swipeToActionRowDelegate");
        this.f222421a = swipeToActionRowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f222421a, ((b) obj2).f222421a);
    }

    public final int hashCode() {
        return this.f222421a.hashCode();
    }
}
