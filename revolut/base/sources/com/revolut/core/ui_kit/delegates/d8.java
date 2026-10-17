package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d8 extends LinearProgressWithAmountDelegate.Model.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54013a;

    public d8(ArrayList steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f54013a = steps;
        if (steps.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d8) && this.f54013a.equals(((d8) obj2).f54013a);
    }

    public final int hashCode() {
        return this.f54013a.hashCode();
    }
}
