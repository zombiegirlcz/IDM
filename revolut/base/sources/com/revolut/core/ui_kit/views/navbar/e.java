package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends BasicNavBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59525a;

    public e(String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        this.f59525a = tabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f59525a, ((e) obj2).f59525a);
    }

    public final int hashCode() {
        return this.f59525a.hashCode();
    }
}
