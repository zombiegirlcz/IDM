package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 extends CounterTextDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4 f54741b;

    public t4(Clause text, s4 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54740a = text;
        this.f54741b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f54740a, t4Var.f54740a) && this.f54741b == t4Var.f54741b;
    }

    public final int hashCode() {
        return this.f54741b.hashCode() + (this.f54740a.hashCode() * 31);
    }

    public /* synthetic */ t4(Clause clause) {
        this(clause, s4.AUTO_SIZE);
    }
}
