package com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters;

import akg.n;
import b9.w2;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import hx7.e;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import jt0.b;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qm2.c;
import qph.l;
import qph.s;
import qph.u;
import qph.v;
import qph.w;
import qr0.i;
import sph.m;
import tsk.t;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.z1;
import vph.d;
import xo8.a0;
import yph.j;
import zel.g;
import zh9.u0;
import zhm.h0;
import zsc.p;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements l {

    @NotNull
    public static final s Companion = new s();
    public final y A;
    public final z1 B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final ScreenerEmbeddedFiltersControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f96217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vph.o f96218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f96219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f96220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f96221t;
    public final t u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final toh.d f96222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w2 f96223x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f96224y;
    public final zsc.h z;

    public a(ScreenerEmbeddedFiltersControllerContract$InputData inputData, v stateMapper, w screenerMetricNameAccessor, o screenerAllMetricFiltersProvider, vph.o selectedFilterReducer, b statsGroupMetricsProvider, m screenerInfoDialogMapper, i screenerDisclaimersProvider, t filtersToolbarEventsNotifier, d filterInfoDescriptorProvider, toh.d screenerAvailableMetricProvider, w2 screenerFilterProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(screenerMetricNameAccessor, "screenerMetricNameAccessor");
        Intrinsics.checkNotNullParameter(screenerAllMetricFiltersProvider, "screenerAllMetricFiltersProvider");
        Intrinsics.checkNotNullParameter(selectedFilterReducer, "selectedFilterReducer");
        Intrinsics.checkNotNullParameter(statsGroupMetricsProvider, "statsGroupMetricsProvider");
        Intrinsics.checkNotNullParameter(screenerInfoDialogMapper, "screenerInfoDialogMapper");
        Intrinsics.checkNotNullParameter(screenerDisclaimersProvider, "screenerDisclaimersProvider");
        Intrinsics.checkNotNullParameter(filtersToolbarEventsNotifier, "filtersToolbarEventsNotifier");
        Intrinsics.checkNotNullParameter(filterInfoDescriptorProvider, "filterInfoDescriptorProvider");
        Intrinsics.checkNotNullParameter(screenerAvailableMetricProvider, "screenerAvailableMetricProvider");
        Intrinsics.checkNotNullParameter(screenerFilterProvider, "screenerFilterProvider");
        this.o = inputData;
        this.f96217p = screenerAllMetricFiltersProvider;
        this.f96218q = selectedFilterReducer;
        this.f96219r = statsGroupMetricsProvider;
        this.f96220s = screenerInfoDialogMapper;
        this.f96221t = screenerDisclaimersProvider;
        this.u = filtersToolbarEventsNotifier;
        this.v = filterInfoDescriptorProvider;
        this.f96222w = screenerAvailableMetricProvider;
        this.f96223x = screenerFilterProvider;
        this.f96224y = new vii.b(w4l.h.f294642c);
        this.z = new zsc.h(new Pair(screenerMetricNameAccessor, p.WORD_PREFIX));
        this.A = mra.d.b(this, new qph.m(null, new Data(null, null, true, 3, null), inputData.f96209b, null, null, null, null), stateMapper, null, false, 12);
        this.B = q.b(1, 1, f.DROP_OLDEST);
        this.C = e.a(this, new c(this, 6));
    }

    @Override // yph.h
    public final void H(j parcel, Pair updatedRange) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(updatedRange, "updatedRange");
        soh.f fVar = parcel.f315903b;
        g gVar = parcel.f315902a;
        BigDecimal bigDecimal = fVar.f264838c;
        int iG = gc0.c.g(fVar.f264836a, bigDecimal);
        int iG2 = gc0.c.g(fVar.f264837b, bigDecimal);
        int iIntValue = ((Number) updatedRange.f186385a).intValue();
        int iIntValue2 = ((Number) updatedRange.f186386b).intValue();
        this.f96218q.getClass();
        H2(this.A, new qpb.a(this, vph.o.b(gVar, bigDecimal, iG, iG2, iIntValue, iIntValue2), 2));
    }

    @Override // yji.l
    public final void I1() {
        ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData = this.o;
        zel.f group = screenerEmbeddedFiltersControllerContract$InputData.f96208a;
        i iVar = this.f96221t;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        yji.l.a1(this, nim.a.v(((z0h.d) iVar.f248595b).w0(), new tjf.e(iVar, group, 24)), null, null, new qph.t(4, this, null), 3);
        ScreenerAllFiltersFlow screenerAllFiltersFlow = (ScreenerAllFiltersFlow) this.u.f274170b;
        ScreenerAllFiltersFlow.Companion companion = ScreenerAllFiltersFlow.INSTANCE;
        yji.l.a1(this, new v0f.p(new a0(rd0.e.b(screenerAllFiltersFlow.d3().f154293c.o.f57403b), 2), 21), null, null, new qg4.d(this, null, 17), 3);
        yji.l.a1(this, t1.d(this.B, 300L), null, null, new qph.t(1, this, null), 3);
        zel.f group2 = screenerEmbeddedFiltersControllerContract$InputData.f96208a;
        toh.d dVar = this.f96222w;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(group2, "screenerInstrumentGroup");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n nVarM = ((kbb.c) dVar.f273214a).M(group2, loadingStrategy);
        b bVar = (b) dVar.f273215b;
        Intrinsics.checkNotNullParameter(group2, "group");
        List listA = sph.o.a(group2);
        ugl.c cVar = (ugl.c) bVar.f178265b;
        ugl.b bVar2 = ugl.c.Companion;
        yji.l.a1(this, nim.a.v(u0.m(nVarM, nim.a.v(((yhl.f) cVar).b(listA, loadingStrategy), new tkm.d(bVar, group2, 5))), new tlf.n(21)), null, null, new qph.t(0, this, null), 3);
    }

    public final void I2(ScreenerFilterInfo dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        boolean z = dialog instanceof ScreenerFilterInfo.Destination;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.C;
        if (z) {
            h.v2(aVar, new ScreenerEmbeddedFiltersControllerContract$ModalStep.ControllerDialog(((ScreenerFilterInfo.Destination) dialog).f96158a), ModalDestination.Style.POPUP.f98311a);
        } else {
            if (!(dialog instanceof ScreenerFilterInfo.Dialog)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(aVar, new ScreenerEmbeddedFiltersControllerContract$ModalStep.InfoDialog((ScreenerFilterInfo.Dialog) dialog), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.n(q.Q(this.f96224y, new u(1, this, continuation)), h0.f322473a), null, new qph.t(5, this, null), 3);
        zel.f group = this.o.f96208a;
        b bVar = this.f96219r;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        List listA = sph.o.a(group);
        ugl.c cVar = (ugl.c) bVar.f178265b;
        ugl.b bVar2 = ugl.c.Companion;
        yji.l.b1(this, nim.a.v(((yhl.f) cVar).b(listA, w4l.h.f294642c), new tkm.d(bVar, group, 5)), null, new qph.t(6, this, null), 3);
        qpb.i iVar = new qpb.i(7);
        y yVar = this.A;
        yji.l.b1(this, yVar.B(iVar), null, new qph.t(7, this, null), 3);
        yji.l.b1(this, new t0(((ScreenerAllFiltersFlow) this.u.f274170b).P, 1), null, new qph.t(2, this, null), 3);
        yji.l.b1(this, q.Q(yVar.B(new qpb.i(8)), new u(0, this, continuation)), null, new qph.t(3, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }

    @Override // yph.h
    public final void r(yph.i option) {
        Object next;
        Intrinsics.checkNotNullParameter(option, "option");
        y yVar = this.A;
        Iterator it8 = ((qph.m) ((j2) yVar.f22677a).getValue()).f248409c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((ScreenerSelectedFilter) next).getF105167a() == option.f315900a) {
                    break;
                }
            }
        }
        ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) next;
        ScreenerSelectedFilter.Options options = screenerSelectedFilter instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) screenerSelectedFilter : null;
        List list = options != null ? options.f105166b : null;
        g gVar = option.f315900a;
        String str = option.f315901b;
        this.f96218q.getClass();
        H2(yVar, new qpb.a(this, vph.o.a(gVar, list, str), 3));
    }
}
