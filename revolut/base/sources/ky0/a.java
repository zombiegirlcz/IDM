package ky0;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButtonDelegate.Model f190614a;

    public a(SmallActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f190614a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f190614a, ((a) obj2).f190614a);
    }

    public final int hashCode() {
        return this.f190614a.hashCode();
    }
}
