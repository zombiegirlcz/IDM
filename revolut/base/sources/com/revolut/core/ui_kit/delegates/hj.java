package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class hj extends VoucherSmallTileDelegate.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54264a;

    public hj(int i) {
        this.f54264a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hj) && this.f54264a == ((hj) obj2).f54264a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54264a);
    }
}
