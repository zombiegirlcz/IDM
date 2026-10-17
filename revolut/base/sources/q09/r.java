package q09;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleChoiceDelegate.Model f241209a;

    public r(SingleChoiceDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f241209a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f241209a, ((r) obj2).f241209a);
    }

    public final int hashCode() {
        return this.f241209a.hashCode();
    }
}
