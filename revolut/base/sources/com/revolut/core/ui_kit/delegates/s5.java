package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s5 extends EsimDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54685a;

    public s5(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54685a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s5) && this.f54685a.equals(((s5) obj2).f54685a);
    }

    public final int hashCode() {
        return this.f54685a.hashCode();
    }
}
