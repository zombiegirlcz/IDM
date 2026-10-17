package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.views.Tabs;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends Tabs.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59748a;

    public v(int i) {
        this.f59748a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f59748a == ((v) obj2).f59748a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59748a);
    }
}
