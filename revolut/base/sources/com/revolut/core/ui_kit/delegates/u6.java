package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class u6 extends HeroBannerDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54805a;

    public u6(int i) {
        this.f54805a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u6) && this.f54805a == ((u6) obj2).f54805a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54805a);
    }
}
