package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t5 extends EsimDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54742a;

    public t5(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54742a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t5) && this.f54742a.equals(((t5) obj2).f54742a);
    }

    public final int hashCode() {
        return this.f54742a.hashCode();
    }
}
