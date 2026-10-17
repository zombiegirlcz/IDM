package eii;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate.Model f126646a;

    public b(CellDetailsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f126646a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f126646a, ((b) obj2).f126646a);
    }

    public final int hashCode() {
        return this.f126646a.hashCode();
    }
}
