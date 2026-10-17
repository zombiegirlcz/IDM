package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow;

import ang.f;
import bwc.e;
import cli.g;
import cli.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import wtc.q0;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements bwc.c {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0 f85717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.h f85718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ali.b f85719r;

    public b(n stateMapper, f userInteractor, q0 userCountryInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        this.o = userInteractor;
        this.f85717p = userCountryInteractor;
        Intrinsics.checkNotNullParameter("DayNightTransactionsLimitsFlow", "keyValue");
        this.f85718q = d.e(this, "DayNightTransactionsLimitsFlow", new TransactionsDayNightLimitsFlowContract$FlowState(0), stateMapper, null, 24);
        this.f85719r = s.b(this, new bhi.c(this, 29));
    }

    public static final void I2(b bVar, dwc.f fVar) {
        bVar.getClass();
        if (fVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.C2(new e(fVar.f120359a));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f85719r;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, mo3.a.g(this.o.j(w4l.h.f294642c), null, null, 3), null, null, new a(this, null), 3);
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f85718q;
    }
}
