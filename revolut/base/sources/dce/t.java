package dce;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeActionButtonDelegate.Model f112898a;

    public t(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112898a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f112898a, ((t) obj2).f112898a);
    }

    public final int hashCode() {
        return this.f112898a.hashCode();
    }
}
