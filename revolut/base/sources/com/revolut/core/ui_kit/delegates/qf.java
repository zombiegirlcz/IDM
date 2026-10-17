package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qf extends RowDelegate.Model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f54634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f54635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54636c;
    public final boolean d;

    public qf(dj0.d dVar, MoneyClause moneyClause, boolean z, boolean z3, int i) {
        moneyClause = (i & 2) != 0 ? null : moneyClause;
        z = (i & 4) != 0 ? false : z;
        z3 = (i & 8) != 0 ? true : z3;
        this.f54634a = dVar;
        this.f54635b = moneyClause;
        this.f54636c = z;
        this.d = z3;
    }

    public final dj0.d a() {
        return this.f54634a;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f54636c;
    }

    public final Clause d() {
        return this.f54635b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj2;
        return Intrinsics.f(this.f54634a, qfVar.f54634a) && Intrinsics.f(this.f54635b, qfVar.f54635b) && this.f54636c == qfVar.f54636c && this.d == qfVar.d;
    }

    public final int hashCode() {
        dj0.d dVar = this.f54634a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Clause clause = this.f54635b;
        return j6.a.c(j6.a.c((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f54636c), 31, this.d);
    }
}
