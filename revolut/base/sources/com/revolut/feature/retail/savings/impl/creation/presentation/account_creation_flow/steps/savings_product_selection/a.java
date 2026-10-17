package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection;

import ang.f;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.R$string;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import pfk.o0;
import pij.d1;
import pj9.m;
import pmb.g;
import pmb.r;
import pmb.s;
import tmb.i;
import v04.b;
import vkm.q;
import w4l.j;
import wsg.n;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {
    public final ijb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f83329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f83330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f83331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SavingsProductSelectionContract$InputData f83332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f83333t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(ijb.a savingsProductInteractor, n walletInteractor, f userInteractor, i eventHandlerExtension, SavingsProductSelectionContract$InputData inputData, f80.a uriHelper, r stateMapper) {
        int i;
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(eventHandlerExtension, "eventHandlerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsProductInteractor;
        this.f83329p = walletInteractor;
        this.f83330q = userInteractor;
        this.f83331r = eventHandlerExtension;
        this.f83332s = inputData;
        this.f83333t = uriHelper;
        Data data = new Data(null, null, true, 3, null);
        int i2 = s.f237547a[inputData.f83327a.ordinal()];
        if (i2 == 1) {
            i = R$string.savings_select_a_fund_title;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.vaults.R$string.mmf_choose_a_currency_title;
        }
        this.u = d.b(this, new pmb.d(data, null, 0, b.Q(new TextLocalisedClause(i, null, null, 14), R$string.savings_onboarding_product_upsell)), stateMapper, null, false, 12);
        this.v = e.a(this, new m(16));
    }

    @Override // yji.l
    public final void I1() {
        List listC = u.c(this.f83332s.f83327a);
        List listC2 = u.c(ncd.m.ACTIVE);
        olb.d dVar = (olb.d) this.o;
        w4l.h hVar = w4l.h.f294642c;
        l.a1(this, nim.a.v(u0.i(dVar.i(listC, listC2, hVar), rd0.e.b(this.f83329p.J(AccountId.Personal.f51414a, hVar)), q.q(nim.a.v(this.f83330q.j(j.f294644c), new pj9.n(24)))), new d1(this, 18)), null, null, new o0(this, (Continuation) null, 20), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
