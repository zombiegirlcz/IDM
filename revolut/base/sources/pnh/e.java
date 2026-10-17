package pnh;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsActionDelegate.Model f237770a;

    public e(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f237770a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f237770a, ((e) obj2).f237770a);
    }

    public final int hashCode() {
        return this.f237770a.hashCode();
    }
}
