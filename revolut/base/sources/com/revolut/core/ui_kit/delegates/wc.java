package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class wc extends PromotionalMediumTileDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54920a;

    public wc(int i) {
        this.f54920a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wc) && this.f54920a == ((wc) obj2).f54920a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54920a);
    }
}
