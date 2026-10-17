package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f53995a;

    public s(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f53995a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f53995a.equals(((s) obj2).f53995a);
    }

    public final int hashCode() {
        return this.f53995a.hashCode();
    }
}
