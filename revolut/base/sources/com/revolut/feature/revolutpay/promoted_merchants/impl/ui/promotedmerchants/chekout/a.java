package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.ui.shops.what_is.WhatIsRevolutPayScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import eub.i;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mre.c;
import nyd.j;
import occ.b;
import occ.p;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eub.a f84680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kcc.b f84681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f84682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a7c.a f84683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PromotedMerchantCheckoutContract$InputData f84684t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f84685w;

    public a(i revPointsOptInInteractor, eub.a revPointsAvailabilityInteractor, kcc.b promotedMerchantsInteractor, c termsNavigationFactory, a7c.a revolutPayInfoScreenFactory, PromotedMerchantCheckoutContract$InputData inputData, p mapper) {
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(promotedMerchantsInteractor, "promotedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(revolutPayInfoScreenFactory, "revolutPayInfoScreenFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = revPointsOptInInteractor;
        this.f84680p = revPointsAvailabilityInteractor;
        this.f84681q = promotedMerchantsInteractor;
        this.f84682r = termsNavigationFactory;
        this.f84683s = revolutPayInfoScreenFactory;
        this.f84684t = inputData;
        this.u = e.a(this, new oa4.c(this, 12));
        this.v = new vii.b();
        this.f84685w = d.b(this, new occ.a(inputData.f84678b, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        occ.i iVar = new occ.i(1, this, continuation);
        vii.b bVar = this.v;
        l.a1(this, q.Q(bVar, iVar), null, null, new occ.l(0, this, null), 3);
        l.a1(this, q.Q(bVar, new occ.i(0, this, continuation)), null, null, new occ.l(1, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f84685w;
    }

    public final void y(ty0.a clauseData) {
        Intrinsics.checkNotNullParameter(clauseData, "clauseData");
        String str = clauseData.f275445a;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        if (iHashCode == -576393405) {
            if (str.equals("CLICK_ID_REVOLUT_PAY_TERMS")) {
                TermsScope.INSTANCE.getClass();
                n2(new j(this, TermsScope.f90375o0, continuation, 11), new whi.b(6));
                return;
            }
            return;
        }
        if (iHashCode == 650203796) {
            if (str.equals("CLICK_ID_REV_POINTS_TERMS")) {
                TermsScope.INSTANCE.getClass();
                n2(new j(this, TermsScope.X, continuation, 11), new whi.b(6));
                return;
            }
            return;
        }
        if (iHashCode == 2127125345 && str.equals("CLICK_ID_WHAT_IS_REVOLUT_PAY")) {
            ((m9c.a) this.f84683s).getClass();
            C1(new com.revolut.kompot.common.d(new WhatIsRevolutPayScreen(), 4));
        }
    }
}
