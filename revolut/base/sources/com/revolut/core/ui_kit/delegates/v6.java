package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class v6 extends HeroBannerDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54858b;

    public v6(int i, int i2) {
        this.f54857a = i;
        this.f54858b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj2;
        return this.f54857a == v6Var.f54857a && this.f54858b == v6Var.f54858b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54858b) + (Integer.hashCode(this.f54857a) * 31);
    }
}
