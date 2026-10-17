package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatItemsDelegate.Model f54273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54274b;

    public i3(ChatItemsDelegate.Model model, Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54273a = model;
        this.f54274b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.f54273a, i3Var.f54273a) && Intrinsics.f(this.f54274b, i3Var.f54274b);
    }

    public final int hashCode() {
        int iHashCode = this.f54273a.hashCode() * 31;
        Object obj2 = this.f54274b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
