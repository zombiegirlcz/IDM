package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class gj extends VoucherSmallTileDelegate.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54225a;

    public gj(int i) {
        this.f54225a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gj) && this.f54225a == ((gj) obj2).f54225a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54225a);
    }
}
