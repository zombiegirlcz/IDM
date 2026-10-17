package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends ActionWidgetDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f54226a;

    public h(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f54226a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f54226a, ((h) obj2).f54226a);
    }

    public final int hashCode() {
        return this.f54226a.hashCode();
    }
}
