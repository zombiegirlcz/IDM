package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class xb implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55600a;

    public xb(float f) {
        this.f55600a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xb) && Float.compare(this.f55600a, ((xb) obj2).f55600a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f55600a);
    }
}
