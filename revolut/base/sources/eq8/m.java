package eq8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate.Model f128396a;

    public m(FullScreenStateDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f128396a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f128396a, ((m) obj2).f128396a);
    }

    public final int hashCode() {
        return this.f128396a.hashCode();
    }
}
