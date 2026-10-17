package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54147a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f8) {
            return this.f54147a == ((f8) obj2).f54147a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54147a);
    }

    public final String toString() {
        return j6.a.l(this.f54147a, "Step(progressPercent=", ")");
    }
}
