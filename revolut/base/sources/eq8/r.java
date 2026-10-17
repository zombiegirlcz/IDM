package eq8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f128401a;

    public r(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f128401a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f128401a, ((r) obj2).f128401a);
    }

    public final int hashCode() {
        return this.f128401a.hashCode();
    }
}
