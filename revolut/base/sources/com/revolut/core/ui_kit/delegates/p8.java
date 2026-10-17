package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListingCardBasicDelegate.Model f54578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f54579b;

    public p8(ListingCardBasicDelegate.Model model, ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f54578a = model;
        this.f54579b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj2;
        return Intrinsics.f(this.f54578a, p8Var.f54578a) && Intrinsics.f(this.f54579b, p8Var.f54579b);
    }

    public final int hashCode() {
        return this.f54579b.hashCode() + (this.f54578a.hashCode() * 31);
    }
}
