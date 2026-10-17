package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y1 extends CandleStickGraphDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f55614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.r0 f55615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.z8 f55616c;

    public y1(Integer num, aw0.r0 candle, aw0.z8 z8Var) {
        Intrinsics.checkNotNullParameter(candle, "candle");
        this.f55614a = num;
        this.f55615b = candle;
        this.f55616c = z8Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f55614a, y1Var.f55614a) && Intrinsics.f(this.f55615b, y1Var.f55615b) && Intrinsics.f(this.f55616c, y1Var.f55616c);
    }

    public final int hashCode() {
        Integer num = this.f55614a;
        int iHashCode = (this.f55615b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        aw0.z8 z8Var = this.f55616c;
        return iHashCode + (z8Var != null ? z8Var.hashCode() : 0);
    }
}
