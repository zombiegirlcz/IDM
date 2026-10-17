package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yi extends VoucherSmallTileDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f55654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f55655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f55656c;

    public yi(CompositeClause compositeClause, MoneyClause priceClause) {
        Intrinsics.checkNotNullParameter(priceClause, "priceClause");
        this.f55654a = priceClause;
        this.f55655b = compositeClause;
        this.f55656c = yhm.j.b(new ie7.a(this, 22));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj2;
        return this.f55654a.equals(yiVar.f55654a) && Intrinsics.f(this.f55655b, yiVar.f55655b);
    }

    public final int hashCode() {
        int iHashCode = this.f55654a.hashCode() * 31;
        Clause clause = this.f55655b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
