package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AmountInputActionsDelegate.Model f54070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f54071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54072c;

    public e0(AmountInputActionsDelegate.Model model, String text, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54070a = model;
        this.f54071b = text;
        this.f54072c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f54070a, e0Var.f54070a) && Intrinsics.f(this.f54071b, e0Var.f54071b) && this.f54072c == e0Var.f54072c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54072c) + ((this.f54071b.hashCode() + (this.f54070a.hashCode() * 31)) * 31);
    }
}
