package eq8;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f128397a;

    public n(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f128397a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f128397a, ((n) obj2).f128397a);
    }

    public final int hashCode() {
        return this.f128397a.hashCode();
    }
}
