package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection;

import ang.f;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.R$string;
import f01.c;
import ffk.t;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import nmb.g;
import nmb.v;
import nmb.w;
import nmb.x;
import oki.h;
import tmb.i;
import v04.b;
import vkm.q;
import w4l.j;
import wsg.n;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {
    public final ijb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f83320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f83321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f83322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f83323s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SavingsCurrencySelectionContract$InputData f83324t;
    public final f80.a u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f83325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83326x;

    public a(ijb.a savingsProductInteractor, n walletInteractor, t planInteractor, f userInteractor, i eventHandlerExtension, SavingsCurrencySelectionContract$InputData inputData, f80.a uriHelper, c uiKitResources, nmb.t stateMapper) {
        int i;
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(planInteractor, "planInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(eventHandlerExtension, "eventHandlerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsProductInteractor;
        this.f83320p = walletInteractor;
        this.f83321q = planInteractor;
        this.f83322r = userInteractor;
        this.f83323s = eventHandlerExtension;
        this.f83324t = inputData;
        this.u = uriHelper;
        this.v = uiKitResources;
        Data data = new Data(null, null, true, 3, null);
        int i2 = w.f217259a[inputData.f83318a.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R$string.savings_onboarding_product_selection_title_save;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.savings_onboarding_product_selection_title_invest;
        }
        TextLocalisedClause textLocalisedClauseQ = b.Q(new TextLocalisedClause(i, null, null, 14), R$string.savings_onboarding_product_currency_selection);
        m70.a.c(t0.f186434a);
        this.f83325w = d.b(this, new nmb.c(data, null, textLocalisedClauseQ, "", false), stateMapper, null, false, 12);
        this.f83326x = e.a(this, new v(0));
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarA = ijb.a.a(this.o, null, null, null, null, 15);
        vkm.d dVarB = rd0.e.b(this.f83320p.J(AccountId.Personal.f51414a, w4l.h.f294642c));
        vkm.d dVarB2 = rd0.e.b(this.f83321q.q());
        l.a1(this, nim.a.u(new x((Continuation) null, this), u0.m(u0.i(nVarA, dVarB, dVarB2), q.q(nim.a.v(this.f83322r.j(j.f294644c), new nl0.c(27))))), null, null, new x(this, (Continuation) null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83326x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83325w;
    }
}
