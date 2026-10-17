package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u5 extends EsimDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54804b;

    public u5(Clause labelText, Clause buttonText) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f54803a = labelText;
        this.f54804b = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj2;
        return this.f54803a.equals(u5Var.f54803a) && this.f54804b.equals(u5Var.f54804b);
    }

    public final int hashCode() {
        return this.f54804b.hashCode() + (this.f54803a.hashCode() * 31);
    }
}
