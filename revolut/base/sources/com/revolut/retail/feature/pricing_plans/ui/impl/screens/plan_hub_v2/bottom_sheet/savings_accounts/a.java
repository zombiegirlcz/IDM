package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import djb.n;
import gmk.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements gmk.h {
    public final PlanSavingsAccountsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f103546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f103547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f103548r;

    public a(cli.n stateMapper, PlanSavingsAccountsScreenContract$InputData inputData, n savingsAccountsDetailsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        this.o = inputData;
        this.f103546p = savingsAccountsDetailsInteractor;
        this.f103547q = new vii.b();
        this.f103548r = d.b(this, new f(inputData.f103545a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f103547q, new g6f.l(continuation, this, 9)), null, null, new gii.b(this, continuation, 11), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f103548r;
    }
}
