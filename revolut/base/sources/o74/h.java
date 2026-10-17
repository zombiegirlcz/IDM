package o74;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputChecklistDelegate.Model f222709a;

    public h(InputChecklistDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f222709a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f222709a, ((h) obj2).f222709a);
    }

    public final int hashCode() {
        return this.f222709a.hashCode();
    }
}
