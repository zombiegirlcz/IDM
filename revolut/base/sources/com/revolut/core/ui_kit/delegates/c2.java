package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 extends CellDetailsActionListDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f53740a;

    public c2(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f53740a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c2) && this.f53740a.equals(((c2) obj2).f53740a);
    }

    public final int hashCode() {
        return this.f53740a.hashCode();
    }
}
