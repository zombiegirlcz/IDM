package dce;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate.Model f112865a;

    public g0(CellDetailsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112865a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f112865a, ((g0) obj2).f112865a);
    }

    public final int hashCode() {
        return this.f112865a.hashCode();
    }
}
