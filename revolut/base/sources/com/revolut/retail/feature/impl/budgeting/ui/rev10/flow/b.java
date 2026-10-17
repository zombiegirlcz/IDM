package com.revolut.retail.feature.impl.budgeting.ui.rev10.flow;

import com.revolut.core.model.account.AccountId;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f101514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f101515c;
    public final c d;

    public b(dj0.d budgetAmount, AccountId accountId, c flowType) {
        Intrinsics.checkNotNullParameter(budgetAmount, "budgetAmount");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f101514b = budgetAmount;
        this.f101515c = accountId;
        this.d = flowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f101514b, bVar.f101514b) && Intrinsics.f(this.f101515c, bVar.f101515c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + l.b(this.f101515c, this.f101514b.hashCode() * 31, 31);
    }
}
