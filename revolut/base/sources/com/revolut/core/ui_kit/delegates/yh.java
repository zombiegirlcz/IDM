package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yh extends SwipeToActionDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv0.i f55653a;

    public yh(qv0.i model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55653a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yh) && Intrinsics.f(this.f55653a, ((yh) obj2).f55653a);
    }

    public final int hashCode() {
        return this.f55653a.hashCode();
    }
}
