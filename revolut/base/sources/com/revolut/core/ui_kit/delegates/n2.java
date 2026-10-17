package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54491a;

    public n2(TextClause content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f54491a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n2) && this.f54491a.equals(((n2) obj2).f54491a);
    }

    public final int hashCode() {
        return this.f54491a.hashCode() * 31;
    }
}
