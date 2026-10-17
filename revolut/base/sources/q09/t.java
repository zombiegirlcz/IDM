package q09;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputChecklistDelegate.Model f241211a;

    public t(InputChecklistDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f241211a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f241211a, ((t) obj2).f241211a);
    }

    public final int hashCode() {
        return this.f241211a.hashCode();
    }
}
