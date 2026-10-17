package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a2 extends GridWidgetDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55290a;

    public a2(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55290a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a2) && this.f55290a.equals(((a2) obj2).f55290a);
    }

    public final int hashCode() {
        return this.f55290a.hashCode() * 31;
    }
}
