package com.revolut.core.ui_kit.delegates.widgets;

/* JADX INFO: loaded from: classes19.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55416a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof l1) {
            return this.f55416a == ((l1) obj2).f55416a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55416a);
    }

    public final String toString() {
        return j6.a.l(this.f55416a, "Step(percentageValue=", ")");
    }
}
