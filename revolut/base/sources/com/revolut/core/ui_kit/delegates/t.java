package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionWidgetDelegate.a f54721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionWidgetDelegate.Model f54722b;

    public t(ActionWidgetDelegate.a action, ActionWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54721a = action;
        this.f54722b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f54721a, tVar.f54721a) && Intrinsics.f(this.f54722b, tVar.f54722b);
    }

    public final int hashCode() {
        return this.f54722b.hashCode() + (this.f54721a.hashCode() * 31);
    }
}
