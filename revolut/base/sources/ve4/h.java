package ve4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f288116a;

    public h(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f288116a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f288116a, ((h) obj2).f288116a);
    }

    public final int hashCode() {
        return this.f288116a.hashCode();
    }
}
