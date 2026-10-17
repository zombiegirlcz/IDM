package bcj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircleActionButtonsBarDelegate f14456a;

    public g(CircleActionButtonsBarDelegate circleActionButtonsBarDelegate) {
        Intrinsics.checkNotNullParameter(circleActionButtonsBarDelegate, "circleActionButtonsBarDelegate");
        this.f14456a = circleActionButtonsBarDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f14456a, ((g) obj2).f14456a);
    }

    public final int hashCode() {
        return this.f14456a.hashCode();
    }
}
