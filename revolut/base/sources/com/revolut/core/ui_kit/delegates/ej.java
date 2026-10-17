package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class ej extends VoucherSmallTileDelegate.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54134a;

    public ej(int i) {
        this.f54134a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ej) && this.f54134a == ((ej) obj2).f54134a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54134a);
    }
}
