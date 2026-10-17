package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.l f54616a;

    public q1(yy0.l imageUiElement) {
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        this.f54616a = imageUiElement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q1) && Intrinsics.f(this.f54616a, ((q1) obj2).f54616a);
    }

    public final int hashCode() {
        return this.f54616a.hashCode();
    }
}
