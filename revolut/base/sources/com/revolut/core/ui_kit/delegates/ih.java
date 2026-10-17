package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ih extends SplitColumnCellDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54305a;

    public ih(TextClause textValue) {
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        this.f54305a = textValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ih) && this.f54305a.equals(((ih) obj2).f54305a);
    }

    public final int hashCode() {
        return this.f54305a.hashCode();
    }
}
