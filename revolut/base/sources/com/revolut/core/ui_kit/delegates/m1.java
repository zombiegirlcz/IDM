package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigTileDelegate.Model f54453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f54454b;

    public m1(BigTileDelegate.Model model, ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f54453a = model;
        this.f54454b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f54453a, m1Var.f54453a) && Intrinsics.f(this.f54454b, m1Var.f54454b);
    }

    public final int hashCode() {
        return this.f54454b.hashCode() + (this.f54453a.hashCode() * 31);
    }
}
