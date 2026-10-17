package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54681a;

    public rg(TextClause primary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f54681a = primary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof rg) && this.f54681a.equals(((rg) obj2).f54681a);
    }

    public final int hashCode() {
        return this.f54681a.hashCode() * 31;
    }
}
