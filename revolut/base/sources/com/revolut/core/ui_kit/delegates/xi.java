package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xi extends VoucherSmallTileDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55608a;

    public xi(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f55608a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xi) && this.f55608a.equals(((xi) obj2).f55608a);
    }

    public final int hashCode() {
        return this.f55608a.hashCode();
    }
}
