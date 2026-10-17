package v23;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputChecklistDelegate.Model f285637a;

    public k(InputChecklistDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f285637a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f285637a, ((k) obj2).f285637a);
    }

    public final int hashCode() {
        return this.f285637a.hashCode();
    }
}
