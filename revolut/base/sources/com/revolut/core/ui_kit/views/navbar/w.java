package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends ScrollerNavBarContentView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59554a;

    public w(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f59554a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f59554a, ((w) obj2).f59554a);
    }

    public final int hashCode() {
        return this.f59554a.hashCode();
    }
}
