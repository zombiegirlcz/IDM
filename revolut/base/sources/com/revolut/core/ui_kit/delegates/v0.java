package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.gradients.UiKitGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitGradient f54843a;

    public v0(UiKitGradient gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f54843a = gradient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && Intrinsics.f(this.f54843a, ((v0) obj2).f54843a);
    }

    public final int hashCode() {
        return this.f54843a.hashCode();
    }
}
