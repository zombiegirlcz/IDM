package ba4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f13901a;

    public i(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f13901a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f13901a, ((i) obj2).f13901a);
    }

    public final int hashCode() {
        return this.f13901a.hashCode();
    }
}
