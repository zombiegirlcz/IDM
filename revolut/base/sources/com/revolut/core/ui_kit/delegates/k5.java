package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class k5 implements q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54369a;

    public k5(boolean z) {
        this.f54369a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k5) && this.f54369a == ((k5) obj2).f54369a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54369a);
    }
}
