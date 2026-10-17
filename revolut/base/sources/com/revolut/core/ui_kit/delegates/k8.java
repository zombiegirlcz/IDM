package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class k8 extends ListCellDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54373a;

    public k8(int i) {
        this.f54373a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k8) && this.f54373a == ((k8) obj2).f54373a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54373a);
    }
}
