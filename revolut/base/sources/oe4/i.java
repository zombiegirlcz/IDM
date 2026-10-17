package oe4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f224526a;

    public i(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f224526a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f224526a, ((i) obj2).f224526a);
    }

    public final int hashCode() {
        return this.f224526a.hashCode();
    }
}
