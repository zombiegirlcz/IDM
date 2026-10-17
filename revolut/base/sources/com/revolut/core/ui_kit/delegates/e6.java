package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e6 extends ExtraSmallCardDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54088a;

    public e6(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54088a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e6) && this.f54088a.equals(((e6) obj2).f54088a);
    }

    public final int hashCode() {
        return this.f54088a.hashCode();
    }
}
