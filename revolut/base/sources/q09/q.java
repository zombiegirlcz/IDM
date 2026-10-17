package q09;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeActionButtonDelegate.Model f241208a;

    public q(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f241208a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f241208a, ((q) obj2).f241208a);
    }

    public final int hashCode() {
        return this.f241208a.hashCode();
    }
}
