package dce;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsActionDelegate.Model f112866a;

    public h0(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112866a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f112866a, ((h0) obj2).f112866a);
    }

    public final int hashCode() {
        return this.f112866a.hashCode();
    }
}
