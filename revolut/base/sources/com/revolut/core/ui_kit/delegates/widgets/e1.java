package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55337a;

    public e1(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55337a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && this.f55337a.equals(((e1) obj2).f55337a);
    }

    public final int hashCode() {
        return this.f55337a.hashCode();
    }
}
