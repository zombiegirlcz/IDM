package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z1 extends CandleStickGraphDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.z8 f55662a;

    public z1(aw0.z8 z8Var) {
        this.f55662a = z8Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z1) && Intrinsics.f(this.f55662a, ((z1) obj2).f55662a);
    }

    public final int hashCode() {
        aw0.z8 z8Var = this.f55662a;
        if (z8Var == null) {
            return 0;
        }
        return z8Var.hashCode();
    }
}
