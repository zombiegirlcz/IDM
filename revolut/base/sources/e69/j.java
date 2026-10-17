package e69;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate.Model f122945a;

    public j(CellDetailsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f122945a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f122945a, ((j) obj2).f122945a);
    }

    public final int hashCode() {
        return this.f122945a.hashCode();
    }
}
