package com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters;

import ali.b;
import cli.g;
import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import hx7.e;
import java.util.List;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import x8h.m;
import xo8.i0;
import xoh.j;
import xoh.t;
import xoh.v;
import xoh.w;
import yji.l;
import zel.f;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements xoh.h {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ScreenerAllFiltersFlowContract$Page f96167w = ScreenerAllFiltersFlowContract$Page.STOCKS;
    public final ScreenerAllFiltersFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vph.a f96168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fkg.a f96169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f96170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t1 f96171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f96172t;
    public final b u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(w stateMapper, ScreenerAllFiltersFlowContract$InputData inputData, vph.a closeConfirmationDialogMapper, fkg.a screenerInstrumentProvider, m etpProductAvailabilityInteractor, t1 groupProvider) {
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$PageG;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(closeConfirmationDialogMapper, "closeConfirmationDialogMapper");
        Intrinsics.checkNotNullParameter(screenerInstrumentProvider, "screenerInstrumentProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(groupProvider, "groupProvider");
        this.o = inputData;
        this.f96168p = closeConfirmationDialogMapper;
        this.f96169q = screenerInstrumentProvider;
        this.f96170r = etpProductAvailabilityInteractor;
        this.f96171s = groupProvider;
        f fVar = inputData.f96162a;
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page = (fVar == null || (screenerAllFiltersFlowContract$PageG = hx7.b.G(fVar)) == null) ? f96167w : screenerAllFiltersFlowContract$PageG;
        this.f96172t = d.b(this, new j(u.c(screenerAllFiltersFlowContract$Page), screenerAllFiltersFlowContract$Page, r0.g(), q0.c(new Pair(screenerAllFiltersFlowContract$Page, inputData.f96163b)), false, true), stateMapper, null, false, 12);
        final int i = 0;
        this.u = s.b(this, new Function2(this) { // from class: xoh.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a f307851b;

            {
                this.f307851b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        ScreenerAllFiltersFlowContract$Page tab2 = (ScreenerAllFiltersFlowContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        zel.f fVarF = hx7.b.F(tab2);
                        final com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar = this.f307851b;
                        ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = aVar.o;
                        List list = screenerAllFiltersFlowContract$InputData.f96163b;
                        if (fVarF != screenerAllFiltersFlowContract$InputData.f96162a) {
                            list = null;
                        }
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController = new ScreenerEmbeddedFiltersController(new ScreenerEmbeddedFiltersControllerContract$InputData(fVarF, list));
                        final int i2 = 0;
                        Function1 block = new Function1() { // from class: xoh.s
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i2) {
                                    case 0:
                                        qph.n it8 = (qph.n) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$PageG2 = hx7.b.G(it8.f248411a);
                                        com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar2 = aVar;
                                        y yVar = aVar2.f96172t;
                                        aVar2.H2(yVar, new xf0.j(screenerAllFiltersFlowContract$PageG2, it8, 26));
                                        aVar2.n2(new wh3.h(18, aVar2, hx7.b.F(screenerAllFiltersFlowContract$PageG2), (List) ((j) ((j2) yVar.f22677a).getValue()).d.get(screenerAllFiltersFlowContract$PageG2), screenerAllFiltersFlowContract$PageG2, (Continuation) null), new whi.b(6));
                                        break;
                                    default:
                                        dii.g output = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (Intrinsics.f(output, dii.f.f115069a)) {
                                            aVar.C2(l.f307840a);
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block, "block");
                        screenerEmbeddedFiltersController.H = block;
                        return screenerEmbeddedFiltersController;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        ScreenerAllFiltersFlowContract$ModalStep step = (ScreenerAllFiltersFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!Intrinsics.f(step, ScreenerAllFiltersFlowContract$ModalStep.ResetFiltersConfirmation.f96165a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar2 = this.f307851b;
                        aVar2.f96168p.getClass();
                        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(vph.a.a());
                        final int i3 = 1;
                        Function1 block2 = new Function1() { // from class: xoh.s
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        qph.n it8 = (qph.n) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$PageG2 = hx7.b.G(it8.f248411a);
                                        com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar22 = aVar2;
                                        y yVar = aVar22.f96172t;
                                        aVar22.H2(yVar, new xf0.j(screenerAllFiltersFlowContract$PageG2, it8, 26));
                                        aVar22.n2(new wh3.h(18, aVar22, hx7.b.F(screenerAllFiltersFlowContract$PageG2), (List) ((j) ((j2) yVar.f22677a).getValue()).d.get(screenerAllFiltersFlowContract$PageG2), screenerAllFiltersFlowContract$PageG2, (Continuation) null), new whi.b(6));
                                        break;
                                    default:
                                        dii.g output = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (Intrinsics.f(output, dii.f.f115069a)) {
                                            aVar2.C2(l.f307840a);
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        actionsBottomSheetController.H = block2;
                        return actionsBottomSheetController;
                }
            }
        });
        final int i2 = 1;
        this.v = e.a(this, new Function2(this) { // from class: xoh.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a f307851b;

            {
                this.f307851b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        ScreenerAllFiltersFlowContract$Page tab2 = (ScreenerAllFiltersFlowContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        zel.f fVarF = hx7.b.F(tab2);
                        final com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar = this.f307851b;
                        ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = aVar.o;
                        List list = screenerAllFiltersFlowContract$InputData.f96163b;
                        if (fVarF != screenerAllFiltersFlowContract$InputData.f96162a) {
                            list = null;
                        }
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController = new ScreenerEmbeddedFiltersController(new ScreenerEmbeddedFiltersControllerContract$InputData(fVarF, list));
                        final int i22 = 0;
                        Function1 block = new Function1() { // from class: xoh.s
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i22) {
                                    case 0:
                                        qph.n it8 = (qph.n) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$PageG2 = hx7.b.G(it8.f248411a);
                                        com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar22 = aVar;
                                        y yVar = aVar22.f96172t;
                                        aVar22.H2(yVar, new xf0.j(screenerAllFiltersFlowContract$PageG2, it8, 26));
                                        aVar22.n2(new wh3.h(18, aVar22, hx7.b.F(screenerAllFiltersFlowContract$PageG2), (List) ((j) ((j2) yVar.f22677a).getValue()).d.get(screenerAllFiltersFlowContract$PageG2), screenerAllFiltersFlowContract$PageG2, (Continuation) null), new whi.b(6));
                                        break;
                                    default:
                                        dii.g output = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (Intrinsics.f(output, dii.f.f115069a)) {
                                            aVar.C2(l.f307840a);
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block, "block");
                        screenerEmbeddedFiltersController.H = block;
                        return screenerEmbeddedFiltersController;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        ScreenerAllFiltersFlowContract$ModalStep step = (ScreenerAllFiltersFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!Intrinsics.f(step, ScreenerAllFiltersFlowContract$ModalStep.ResetFiltersConfirmation.f96165a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar2 = this.f307851b;
                        aVar2.f96168p.getClass();
                        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(vph.a.a());
                        final int i3 = 1;
                        Function1 block2 = new Function1() { // from class: xoh.s
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        qph.n it8 = (qph.n) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$PageG2 = hx7.b.G(it8.f248411a);
                                        com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a aVar22 = aVar2;
                                        y yVar = aVar22.f96172t;
                                        aVar22.H2(yVar, new xf0.j(screenerAllFiltersFlowContract$PageG2, it8, 26));
                                        aVar22.n2(new wh3.h(18, aVar22, hx7.b.F(screenerAllFiltersFlowContract$PageG2), (List) ((j) ((j2) yVar.f22677a).getValue()).d.get(screenerAllFiltersFlowContract$PageG2), screenerAllFiltersFlowContract$PageG2, (Continuation) null), new whi.b(6));
                                        break;
                                    default:
                                        dii.g output = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (Intrinsics.f(output, dii.f.f115069a)) {
                                            aVar2.C2(l.f307840a);
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        actionsBottomSheetController.H = block2;
                        return actionsBottomSheetController;
                }
            }
        });
    }

    @Override // ali.h
    public final b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void I1() {
        t1 t1Var = this.f96171s;
        Continuation continuation = null;
        l.a1(this, mo3.a.g(rd0.e.n(nim.a.v(((aoh.a) t1Var.f185240b).a(), new ml3.y(t1Var, 29)), h0.f322473a), null, new xlb.l(16), 1), null, null, new v(this, continuation, 0), 3);
        l.a1(this, this.f96172t.B(new i0(9)), null, null, new v(this, continuation, 1), 3);
        l.a1(this, this.f96170r.a(), null, null, new rf9.h(this, continuation, 22), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2() {
        /*
            r3 = this;
            com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData r0 = r3.o
            java.util.List r0 = r0.f96163b
            boolean r0 = r0.isEmpty()
            cli.y r1 = r3.f96172t
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            xoh.j r2 = (xoh.j) r2
            java.util.Map r2 = r2.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L51
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            xoh.j r1 = (xoh.j) r1
            java.util.Map r1 = r1.d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2f
            goto L51
        L2f:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L37
            r1 = 1
            goto L52
        L51:
            r1 = 0
        L52:
            if (r0 == 0) goto L60
            if (r1 == 0) goto L60
            com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$ModalStep$ResetFiltersConfirmation r0 = com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$ModalStep.ResetFiltersConfirmation.f96165a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            com.revolut.kompot.navigable.vc.modal.a r2 = r3.v
            oki.h.v2(r2, r0, r1)
            return
        L60:
            xoh.l r0 = xoh.l.f307840a
            r3.C2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a.I2():void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f96172t;
    }
}
