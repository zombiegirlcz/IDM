package com.revolut.feature.credit.card.impl.ui.credit_limit_cap;

import al4.n;
import al4.o;
import al4.p;
import an4.e;
import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import ft3.t0;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.e3;
import om4.k0;
import om4.y2;
import rl8.d;
import rq4.i;
import rq4.j;
import rq4.k;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements k {
    public final e A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final y C;
    public final CreditLimitCapChangeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y2 f69184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r70.c f69185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rq4.a f69186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f69187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f69188t;
    public final ow4.a u;
    public final n60.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f69189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f69190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f69191y;
    public final e3 z;

    public c(CreditLimitCapChangeScreenContract$InputData inputData, y2 creditCardLimitCapInteractor, r70.c hapticEngine, rq4.a dialogFactory, n creditCardInteractor, k0 creditCardFeatureInteractor, ow4.a moneyUtils, n60.b keyboardViewControllerExtension, p creditCardProductFeatureTogglesInteractor, o creditCardLimitIncreaseInteractor, f userInteractor, e3 creditCardLimitsInfoInteractor, e navigationFactory, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardLimitCapInteractor, "creditCardLimitCapInteractor");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(moneyUtils, "moneyUtils");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitIncreaseInteractor, "creditCardLimitIncreaseInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitsInfoInteractor, "creditCardLimitsInfoInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69184p = creditCardLimitCapInteractor;
        this.f69185q = hapticEngine;
        this.f69186r = dialogFactory;
        this.f69187s = creditCardInteractor;
        this.f69188t = creditCardFeatureInteractor;
        this.u = moneyUtils;
        this.v = keyboardViewControllerExtension;
        this.f69189w = creditCardProductFeatureTogglesInteractor;
        this.f69190x = creditCardLimitIncreaseInteractor;
        this.f69191y = userInteractor;
        this.z = creditCardLimitsInfoInteractor;
        this.A = navigationFactory;
        this.B = hx7.e.a(this, new d(this, 10));
        this.C = mra.d.b(this, new j(new Data(null, null, true, 3, null), null, null, false, false, inputData.f69173b), stateMapper, null, false, 12);
    }

    public final void I2(String listId) {
        i iVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode == -1466448091) {
            if (listId.equals("id_decrease_limit_item_link")) {
                J2();
                return;
            }
            return;
        }
        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = this.o;
        if (iHashCode != 368903581) {
            if (iHashCode == 937226432 && listId.equals("credit_limit_cap_change_actions_limit_increase")) {
                r2 r2Var = r2.CREDIT_LIMIT_CAP;
                ft3.n nVar = new ft3.n(creditLimitCapChangeScreenContract$InputData.f69172a, 2);
                t0 t0Var = t0.f137874a;
                C1(new BridgeDestination(gc0.c.f(new CreditApplicationFeatureConfig.StartApplication(r2Var, nVar, null, null, null, null, 14330))));
                return;
            }
            return;
        }
        if (listId.equals("credit_limit_cap_change_actions_more_about") && (iVar = (i) ((j) ((j2) this.C.f22677a).getValue()).f256465a.getContent()) != null) {
            um4.a aVar = iVar.f;
            wi0.b bVar = iVar.f256464c;
            String str = creditLimitCapChangeScreenContract$InputData.f69172a;
            this.A.getClass();
            C1(e.a(aVar, bVar, str));
        }
    }

    public final void J2() {
        kl4.b bVar;
        i iVar = (i) ((j) ((j2) this.C.f22677a).getValue()).f256465a.getContent();
        if (iVar == null || (bVar = iVar.e) == null) {
            return;
        }
        boolean z = bVar.f185283a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.B;
        if (z) {
            h.v2(aVar, new CreditLimitCapChangeScreenContract$ModalStep.LimitDecreaseSheet(bVar.f185285c, bVar.f185284b, bVar.d), ModalDestination.Style.POPUP.f98311a);
        } else {
            h.v2(aVar, CreditLimitCapChangeScreenContract$ModalStep.CreditLimitDecreaseIneligibleExplainer.f69178a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new rlh.c(this, continuation, 11), new whi.b(6));
        l.b1(this, rd0.e.b(this.v.d), null, new rk9.d(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.C;
    }
}
