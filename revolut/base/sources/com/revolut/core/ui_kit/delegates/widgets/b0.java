package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55297a;

    public b0(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55297a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && this.f55297a.equals(((b0) obj2).f55297a);
    }

    public final int hashCode() {
        return this.f55297a.hashCode();
    }
}
