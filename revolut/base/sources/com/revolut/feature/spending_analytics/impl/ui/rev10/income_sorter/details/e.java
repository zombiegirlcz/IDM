package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import aqd.d0;
import aqd.h1;
import aqd.k1;
import aqd.l1;
import aqd.m;
import aqd.n;
import aqd.p;
import aqd.s;
import aqd.s1;
import aqd.t;
import cli.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import dqd.r;
import dqd.y;
import java.util.ArrayList;
import kkf.x5;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.z1;
import w4l.j;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends h implements d0 {
    public final j2 A;
    public final IncomeSortersDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f87760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kqd.e f87761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f87762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f87763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f87764t;
    public final j9l.a u;
    public final elb.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n60.b f87765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f87766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87767y;
    public final z1 z;

    public e(s1 stateMapper, IncomeSortersDetailsContract$InputData inputData, d incomeSorterDetailsDelegate, kqd.e incomeSorterDestinationsUpdatesProvider, w80.b amountFormatter, r errorStateProvider, y transferErrorProvider, j9l.a moneyCalculator, elb.b savingsFeatureConfigInteractor, n60.b keyboardViewControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(incomeSorterDetailsDelegate, "incomeSorterDetailsDelegate");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationsUpdatesProvider, "incomeSorterDestinationsUpdatesProvider");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
        Intrinsics.checkNotNullParameter(transferErrorProvider, "transferErrorProvider");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        this.o = inputData;
        this.f87760p = incomeSorterDetailsDelegate;
        this.f87761q = incomeSorterDestinationsUpdatesProvider;
        this.f87762r = amountFormatter;
        this.f87763s = errorStateProvider;
        this.f87764t = transferErrorProvider;
        this.u = moneyCalculator;
        this.v = savingsFeatureConfigInteractor;
        this.f87765w = keyboardViewControllerExtension;
        this.f87766x = mra.d.b(this, new t(new Data(null, null, true, 3, null), n.REGULAR, r0.g(), null, false, null, null), stateMapper, null, false, 12);
        this.f87767y = hx7.e.a(this, new anc.b(this, 7));
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
        this.A = q.c(r0.g());
    }

    public static ArrayList I2(ArrayList arrayList) {
        ArrayList arrayListP = pyd.c.p(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListP) {
            IncomeSorterDestinationInfo incomeSorterDestinationInfo = ((IncomeSorterHomeContract$DestinationValue) obj2).f87825a;
            if ((incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer) || (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // yji.l
    public final void I1() {
        kqd.e eVar = this.f87761q;
        Continuation continuation = null;
        l.a1(this, q.J(eVar.f188374b, new x5(eVar.f188375c, 16), q.Q(eVar.d, new a3(continuation, eVar, 3))), null, null, new k1(0, this, continuation), 3);
        l.a1(this, eVar.e, null, null, new k1(1, this, continuation), 3);
        l.a1(this, eVar.f, null, null, new k1(2, this, continuation), 3);
    }

    public final void J2() {
        m mVar = (m) ((t) ((j2) this.f87766x.f22677a).getValue()).f8402a.getContent();
        if (mVar == null) {
            return;
        }
        s sVar = mVar.f8365c;
        if (sVar instanceof p) {
            r6.b.D("Cannot delete an IS in creation flow");
            return;
        }
        if (!(sVar instanceof aqd.r)) {
            throw new NoWhenBranchMatchedException();
        }
        aqd.r rVar = (aqd.r) sVar;
        h.v2(this.f87767y, new IncomeSortersDetailsContract$ModalStep.IncomeSorterDelete(rVar.f8392c, rVar.d, mVar.f8370m, rVar.f8391b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87767y;
    }

    public final Flow K2() {
        return X1(new mii.h(new TextLocalisedClause(R$string.common_error_title, null, null, 14), "error"));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.z, new l1(0, this, continuation)), null, new k1(3, this, continuation), 3);
        l.b1(this, this.v.a(j.f294644c), null, new k1(4, this, continuation), 3);
        l.b1(this, rd0.e.b(this.f87765w.d), null, new k1(5, this, continuation), 3);
        l.b1(this, q.Q(q.r(new h1(this, 0), new t0(this.f87766x.B(new aqb.s(9)), 1)), new l1(1, this, continuation)), null, new k1(6, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f87766x;
    }
}
