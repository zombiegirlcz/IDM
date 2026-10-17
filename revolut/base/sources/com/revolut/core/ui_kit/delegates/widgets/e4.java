package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e4 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4 f55347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4 f55348b;

    public e4(g4 startAction, g4 endAction) {
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(endAction, "endAction");
        this.f55347a = startAction;
        this.f55348b = endAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return Intrinsics.f(this.f55347a, e4Var.f55347a) && Intrinsics.f(this.f55348b, e4Var.f55348b);
    }

    public final int hashCode() {
        return this.f55348b.hashCode() + (this.f55347a.hashCode() * 31);
    }
}
