package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class l3 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54416a;

    public l3() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l3) && this.f54416a == ((l3) obj2).f54416a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54416a);
    }

    public l3(int i) {
        this.f54416a = i;
    }
}
