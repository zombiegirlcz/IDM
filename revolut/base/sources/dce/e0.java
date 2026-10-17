package dce;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f112863a;

    public e0(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112863a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f112863a, ((e0) obj2).f112863a);
    }

    public final int hashCode() {
        return this.f112863a.hashCode();
    }
}
