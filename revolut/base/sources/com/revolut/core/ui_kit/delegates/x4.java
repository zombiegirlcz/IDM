package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x4 extends CounterTextDelegate.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55593a;

    public x4(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55593a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x4) && Intrinsics.f(this.f55593a, ((x4) obj2).f55593a);
    }

    public final int hashCode() {
        return this.f55593a.hashCode();
    }
}
