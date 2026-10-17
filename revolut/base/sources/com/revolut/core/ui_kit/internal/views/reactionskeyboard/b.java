package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends ReactionsKeyboardTabs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f57505a;

    public b(TextClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f57505a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f57505a.equals(((b) obj2).f57505a);
    }

    public final int hashCode() {
        return this.f57505a.hashCode();
    }
}
