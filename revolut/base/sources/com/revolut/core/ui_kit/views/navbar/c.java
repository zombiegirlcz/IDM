package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountSelectionNavBarContentView.b f59521b;

    public c(String pageId, AccountSelectionNavBarContentView.b scrollingState) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
        this.f59520a = pageId;
        this.f59521b = scrollingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f59520a, cVar.f59520a) && Intrinsics.f(this.f59521b, cVar.f59521b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59521b.f59197a) + (this.f59520a.hashCode() * 31);
    }
}
