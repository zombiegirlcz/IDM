package dce;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsActionDelegate.Model f112900a;

    public u(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112900a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f112900a, ((u) obj2).f112900a);
    }

    public final int hashCode() {
        return this.f112900a.hashCode();
    }
}
