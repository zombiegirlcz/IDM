package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AmountInputActionsDelegate.Model f55582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55583b;

    public x(AmountInputActionsDelegate.Model model, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55582a = model;
        this.f55583b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f55582a, xVar.f55582a) && this.f55583b == xVar.f55583b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55583b) + (this.f55582a.hashCode() * 31);
    }
}
