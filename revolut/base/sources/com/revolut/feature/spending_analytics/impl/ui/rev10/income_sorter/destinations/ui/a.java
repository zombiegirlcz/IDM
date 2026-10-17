package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mqd.o;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vdl.c1;
import vkm.j2;
import vkm.q;
import vkm.z1;
import vpd.b0;
import vpd.f;
import vpd.i0;
import vpd.j;
import vpd.k;
import vpd.l;
import vpd.z0;
import xld.b;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements f {

    @NotNull
    public static final b0 Companion = new b0();
    public final IncomeSorterDestinationsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f87732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rqd.h f87733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f87734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f87735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final end.f f87736t;
    public final elb.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f87738x;

    public a(z0 stateMapper, IncomeSorterDestinationsContract$InputData inputData, b incomeSorterDestinationsInteractor, rqd.h ratesProviders, o newIncomeSorterDestinationAvailabilityProvider, gte.a featureToggleInteractor, end.f investmentsDestinationUiMapper, elb.b savingsFeatureConfigInteractor) {
        l kVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationsInteractor, "incomeSorterDestinationsInteractor");
        Intrinsics.checkNotNullParameter(ratesProviders, "ratesProviders");
        Intrinsics.checkNotNullParameter(newIncomeSorterDestinationAvailabilityProvider, "newIncomeSorterDestinationAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investmentsDestinationUiMapper, "investmentsDestinationUiMapper");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        this.o = inputData;
        this.f87732p = incomeSorterDestinationsInteractor;
        this.f87733q = ratesProviders;
        this.f87734r = newIncomeSorterDestinationAvailabilityProvider;
        this.f87735s = featureToggleInteractor;
        this.f87736t = investmentsDestinationUiMapper;
        this.u = savingsFeatureConfigInteractor;
        Data data = new Data(null, null, true, 3, null);
        IncomeSorterDestinationsContract$InputData.SelectionMode selectionMode = inputData.f87718a;
        if (selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection) {
            kVar = new j(h0.f322473a);
        } else {
            if (!(selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection remainingBalanceDestinationSelection = (IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection) selectionMode;
            kVar = new k(remainingBalanceDestinationSelection.f87722a, remainingBalanceDestinationSelection.f87723b);
        }
        this.v = d.b(this, new vpd.d(data, kVar, null), stateMapper, null, false, 12);
        this.f87737w = e.a(this, new vh9.b(this, 14));
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f87738x = z1VarB;
    }

    public final Set I2() {
        Set set;
        l lVar = ((vpd.d) ((j2) this.v.f22677a).getValue()).f291157b;
        Set setI1 = null;
        j jVar = lVar instanceof j ? (j) lVar : null;
        if (jVar != null && (set = jVar.f291169a) != null) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(w.t(set2, 10));
            Iterator it8 = set2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((IncomeSorterDestinationInfo) it8.next()).getId());
            }
            setI1 = d0.i1(arrayList);
        }
        return setI1 == null ? h0.f322473a : setI1;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87737w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.Q(this.f87738x, new c1((Continuation) null, this, 20)), null, new i0(this, null, 0), 3);
        yji.l.b1(this, this.u.a(w4l.j.f294644c), null, new i0(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
