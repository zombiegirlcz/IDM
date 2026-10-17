package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f53727a;

    public be(boolean z) {
        this.f53727a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof be) && this.f53727a == ((be) obj2).f53727a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53727a);
    }
}
