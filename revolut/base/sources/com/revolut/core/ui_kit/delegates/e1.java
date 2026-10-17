package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f54074b;

    public e1(float f, d1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f54073a = f;
        this.f54074b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Float.compare(this.f54073a, e1Var.f54073a) == 0 && this.f54074b == e1Var.f54074b;
    }

    public final int hashCode() {
        return this.f54074b.hashCode() + (Float.hashCode(this.f54073a) * 31);
    }
}
