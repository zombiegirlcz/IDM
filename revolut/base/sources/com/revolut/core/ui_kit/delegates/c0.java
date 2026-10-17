package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f53739a;

    public c0(TextLocalisedClause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f53739a = hint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f53739a.equals(((c0) obj2).f53739a);
    }

    public final int hashCode() {
        return this.f53739a.hashCode();
    }
}
