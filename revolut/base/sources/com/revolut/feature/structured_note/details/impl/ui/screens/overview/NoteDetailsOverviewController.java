package com.revolut.feature.structured_note.details.impl.ui.screens.overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewController;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewControllerContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m5e.b;
import m5e.d;
import m5e.e;
import m5e.f;
import m5e.g;
import m5e.i;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/overview/NoteDetailsOverviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm5e/i;", "Companion", "a", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoteDetailsOverviewController extends ViewController<q> implements a {
    public final NoteDetailsOverviewControllerContract$InputData K;
    public final h L;
    public final int M;
    public final FixedTabsDelegate N;
    public final TabsDelegate O;
    public final HeaderDelegate P;
    public final RowDelegate Q;
    public final RowLoadingDelegate R;
    public final ListSubheaderLoadingDelegate S;
    public final ListSubheaderDelegate T;
    public final TrendViewDelegate U;
    public final SmallActionButtonDelegate V;
    public final SwipeToActionDelegate W;
    public final CalendarRowDelegate X;
    public final CellDetailsDelegate Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ProgressStepVerticalDelegate f88890a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f88891b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d f88892d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f88893e0;
    public final e f0;
    public final avk.h g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f88894h0;
    public final Object i0;
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(NoteDetailsOverviewController.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public NoteDetailsOverviewController(NoteDetailsOverviewControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_view;
        this.N = new FixedTabsDelegate();
        this.O = new TabsDelegate();
        this.P = new HeaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new RowLoadingDelegate();
        this.S = new ListSubheaderLoadingDelegate();
        this.T = new ListSubheaderDelegate();
        this.U = new TrendViewDelegate(1000L);
        this.V = new SmallActionButtonDelegate();
        this.W = new SwipeToActionDelegate(rowDelegate, false);
        this.X = new CalendarRowDelegate();
        this.Y = new CellDetailsDelegate();
        this.Z = new LargeActionButtonDelegate();
        this.f88890a0 = new ProgressStepVerticalDelegate();
        this.f88891b0 = new TwinHorizontalButtonDelegate();
        final int i = 0;
        this.c0 = w.y0(new Function0(this) { // from class: m5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoteDetailsOverviewController f202900b;

            {
                this.f202900b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NoteDetailsOverviewController.Companion companion = NoteDetailsOverviewController.INSTANCE;
                        NoteDetailsOverviewController noteDetailsOverviewController = this.f202900b;
                        qji.b bVarU2 = noteDetailsOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.overview.di.NoteDetailsOverviewControllerComponentInjector");
                        o4e.d dVar = (o4e.d) ((c5e.a) bVarU2);
                        o4e.l lVar = dVar.f222214b;
                        o4e.d dVar2 = dVar.f222215c;
                        NoteDetailsOverviewControllerContract$InputData noteDetailsOverviewControllerContract$InputData = noteDetailsOverviewController.K;
                        a5e.g gVar = new a5e.g(noteDetailsOverviewControllerContract$InputData.f88895a);
                        a5e.c cVar = new a5e.c(noteDetailsOverviewController.N);
                        String str = noteDetailsOverviewControllerContract$InputData.f88895a;
                        s4e.e eVar = new s4e.e(str);
                        RowDelegate rowDelegate2 = noteDetailsOverviewController.Q;
                        s4e.c cVar2 = new s4e.c(rowDelegate2);
                        t4e.e eVar2 = new t4e.e(str);
                        t4e.c cVar3 = new t4e.c(noteDetailsOverviewController.T);
                        y4e.e eVar3 = new y4e.e(str);
                        y4e.c cVar4 = new y4e.c(rowDelegate2);
                        x4e.e eVar4 = new x4e.e(str);
                        x4e.c cVar5 = new x4e.c(noteDetailsOverviewController.U);
                        h3h.e eVar5 = new h3h.e(str, true);
                        h3h.c cVar6 = new h3h.c(noteDetailsOverviewController.P, noteDetailsOverviewController.T, noteDetailsOverviewController.S, noteDetailsOverviewController.Q, noteDetailsOverviewController.R);
                        String str2 = noteDetailsOverviewControllerContract$InputData.f88895a;
                        eel.c cVar7 = eel.c.ONE_DAY;
                        eel.c cVar8 = eel.c.ONE_WEEK;
                        eel.c cVar9 = eel.c.ONE_MONTH;
                        eel.c cVar10 = eel.c.SIX_MONTHS;
                        eel.c cVar11 = eel.c.ONE_YEAR;
                        e3h.d dVar3 = new e3h.d(str2, v.k(cVar7, cVar8, cVar9, cVar10, cVar11, eel.c.ALL), cVar11, zhm.h0.f322473a, false, null, false, false, false, null, YearClass.CLASS_2016);
                        c cVar12 = new c(noteDetailsOverviewController);
                        SmallActionButtonDelegate smallActionButtonDelegate = noteDetailsOverviewController.V;
                        z4e.c cVar13 = new z4e.c(smallActionButtonDelegate);
                        z4e.e eVar6 = new z4e.e(str);
                        u4e.c cVar14 = new u4e.c(smallActionButtonDelegate);
                        u4e.e eVar7 = new u4e.e(str);
                        w4e.c cVar15 = new w4e.c(str);
                        avk.h hVar = noteDetailsOverviewController.g0;
                        f fVar = noteDetailsOverviewController.f88893e0;
                        e eVar8 = noteDetailsOverviewController.f0;
                        d dVar4 = noteDetailsOverviewController.f88892d0;
                        hVar.getClass();
                        fVar.getClass();
                        eVar8.getClass();
                        dVar4.getClass();
                        return new o4e.e(lVar, dVar2, new f3h.b(), new f3h.a(), noteDetailsOverviewController, noteDetailsOverviewControllerContract$InputData, gVar, cVar, eVar, cVar2, eVar2, cVar3, eVar3, cVar4, eVar4, cVar5, eVar5, cVar6, dVar3, cVar12, eVar6, cVar13, eVar7, cVar14, cVar15, hVar, fVar, eVar8, dVar4);
                    case 1:
                        NoteDetailsOverviewController.Companion companion2 = NoteDetailsOverviewController.INSTANCE;
                        return (g) ((o4e.e) ((n5e.a) this.f202900b.c0.getValue())).f222232n0.get();
                    default:
                        NoteDetailsOverviewController.Companion companion3 = NoteDetailsOverviewController.INSTANCE;
                        NoteDetailsOverviewController noteDetailsOverviewController2 = this.f202900b;
                        return dli.f.a(noteDetailsOverviewController2, (g) noteDetailsOverviewController2.f88894h0.getValue(), v.k(noteDetailsOverviewController2.Q, noteDetailsOverviewController2.T, noteDetailsOverviewController2.N, noteDetailsOverviewController2.P, noteDetailsOverviewController2.S, noteDetailsOverviewController2.R, new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new TextDelegate(), noteDetailsOverviewController2.U, new FooterTextDelegate(), noteDetailsOverviewController2.V, noteDetailsOverviewController2.W, noteDetailsOverviewController2.X, noteDetailsOverviewController2.Y, noteDetailsOverviewController2.Z, noteDetailsOverviewController2.f88890a0, noteDetailsOverviewController2.f88891b0), 0, null, null, null, 60);
                }
            }
        });
        this.f88892d0 = new d(this);
        this.f88893e0 = new f(this);
        this.f0 = new e(this);
        this.g0 = new avk.h(this);
        final int i2 = 1;
        this.f88894h0 = w.y0(new Function0(this) { // from class: m5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoteDetailsOverviewController f202900b;

            {
                this.f202900b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        NoteDetailsOverviewController.Companion companion = NoteDetailsOverviewController.INSTANCE;
                        NoteDetailsOverviewController noteDetailsOverviewController = this.f202900b;
                        qji.b bVarU2 = noteDetailsOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.overview.di.NoteDetailsOverviewControllerComponentInjector");
                        o4e.d dVar = (o4e.d) ((c5e.a) bVarU2);
                        o4e.l lVar = dVar.f222214b;
                        o4e.d dVar2 = dVar.f222215c;
                        NoteDetailsOverviewControllerContract$InputData noteDetailsOverviewControllerContract$InputData = noteDetailsOverviewController.K;
                        a5e.g gVar = new a5e.g(noteDetailsOverviewControllerContract$InputData.f88895a);
                        a5e.c cVar = new a5e.c(noteDetailsOverviewController.N);
                        String str = noteDetailsOverviewControllerContract$InputData.f88895a;
                        s4e.e eVar = new s4e.e(str);
                        RowDelegate rowDelegate2 = noteDetailsOverviewController.Q;
                        s4e.c cVar2 = new s4e.c(rowDelegate2);
                        t4e.e eVar2 = new t4e.e(str);
                        t4e.c cVar3 = new t4e.c(noteDetailsOverviewController.T);
                        y4e.e eVar3 = new y4e.e(str);
                        y4e.c cVar4 = new y4e.c(rowDelegate2);
                        x4e.e eVar4 = new x4e.e(str);
                        x4e.c cVar5 = new x4e.c(noteDetailsOverviewController.U);
                        h3h.e eVar5 = new h3h.e(str, true);
                        h3h.c cVar6 = new h3h.c(noteDetailsOverviewController.P, noteDetailsOverviewController.T, noteDetailsOverviewController.S, noteDetailsOverviewController.Q, noteDetailsOverviewController.R);
                        String str2 = noteDetailsOverviewControllerContract$InputData.f88895a;
                        eel.c cVar7 = eel.c.ONE_DAY;
                        eel.c cVar8 = eel.c.ONE_WEEK;
                        eel.c cVar9 = eel.c.ONE_MONTH;
                        eel.c cVar10 = eel.c.SIX_MONTHS;
                        eel.c cVar11 = eel.c.ONE_YEAR;
                        e3h.d dVar3 = new e3h.d(str2, v.k(cVar7, cVar8, cVar9, cVar10, cVar11, eel.c.ALL), cVar11, zhm.h0.f322473a, false, null, false, false, false, null, YearClass.CLASS_2016);
                        c cVar12 = new c(noteDetailsOverviewController);
                        SmallActionButtonDelegate smallActionButtonDelegate = noteDetailsOverviewController.V;
                        z4e.c cVar13 = new z4e.c(smallActionButtonDelegate);
                        z4e.e eVar6 = new z4e.e(str);
                        u4e.c cVar14 = new u4e.c(smallActionButtonDelegate);
                        u4e.e eVar7 = new u4e.e(str);
                        w4e.c cVar15 = new w4e.c(str);
                        avk.h hVar = noteDetailsOverviewController.g0;
                        f fVar = noteDetailsOverviewController.f88893e0;
                        e eVar8 = noteDetailsOverviewController.f0;
                        d dVar4 = noteDetailsOverviewController.f88892d0;
                        hVar.getClass();
                        fVar.getClass();
                        eVar8.getClass();
                        dVar4.getClass();
                        return new o4e.e(lVar, dVar2, new f3h.b(), new f3h.a(), noteDetailsOverviewController, noteDetailsOverviewControllerContract$InputData, gVar, cVar, eVar, cVar2, eVar2, cVar3, eVar3, cVar4, eVar4, cVar5, eVar5, cVar6, dVar3, cVar12, eVar6, cVar13, eVar7, cVar14, cVar15, hVar, fVar, eVar8, dVar4);
                    case 1:
                        NoteDetailsOverviewController.Companion companion2 = NoteDetailsOverviewController.INSTANCE;
                        return (g) ((o4e.e) ((n5e.a) this.f202900b.c0.getValue())).f222232n0.get();
                    default:
                        NoteDetailsOverviewController.Companion companion3 = NoteDetailsOverviewController.INSTANCE;
                        NoteDetailsOverviewController noteDetailsOverviewController2 = this.f202900b;
                        return dli.f.a(noteDetailsOverviewController2, (g) noteDetailsOverviewController2.f88894h0.getValue(), v.k(noteDetailsOverviewController2.Q, noteDetailsOverviewController2.T, noteDetailsOverviewController2.N, noteDetailsOverviewController2.P, noteDetailsOverviewController2.S, noteDetailsOverviewController2.R, new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new TextDelegate(), noteDetailsOverviewController2.U, new FooterTextDelegate(), noteDetailsOverviewController2.V, noteDetailsOverviewController2.W, noteDetailsOverviewController2.X, noteDetailsOverviewController2.Y, noteDetailsOverviewController2.Z, noteDetailsOverviewController2.f88890a0, noteDetailsOverviewController2.f88891b0), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: m5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoteDetailsOverviewController f202900b;

            {
                this.f202900b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        NoteDetailsOverviewController.Companion companion = NoteDetailsOverviewController.INSTANCE;
                        NoteDetailsOverviewController noteDetailsOverviewController = this.f202900b;
                        qji.b bVarU2 = noteDetailsOverviewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.structured_note.details.impl.ui.screens.overview.di.NoteDetailsOverviewControllerComponentInjector");
                        o4e.d dVar = (o4e.d) ((c5e.a) bVarU2);
                        o4e.l lVar = dVar.f222214b;
                        o4e.d dVar2 = dVar.f222215c;
                        NoteDetailsOverviewControllerContract$InputData noteDetailsOverviewControllerContract$InputData = noteDetailsOverviewController.K;
                        a5e.g gVar = new a5e.g(noteDetailsOverviewControllerContract$InputData.f88895a);
                        a5e.c cVar = new a5e.c(noteDetailsOverviewController.N);
                        String str = noteDetailsOverviewControllerContract$InputData.f88895a;
                        s4e.e eVar = new s4e.e(str);
                        RowDelegate rowDelegate2 = noteDetailsOverviewController.Q;
                        s4e.c cVar2 = new s4e.c(rowDelegate2);
                        t4e.e eVar2 = new t4e.e(str);
                        t4e.c cVar3 = new t4e.c(noteDetailsOverviewController.T);
                        y4e.e eVar3 = new y4e.e(str);
                        y4e.c cVar4 = new y4e.c(rowDelegate2);
                        x4e.e eVar4 = new x4e.e(str);
                        x4e.c cVar5 = new x4e.c(noteDetailsOverviewController.U);
                        h3h.e eVar5 = new h3h.e(str, true);
                        h3h.c cVar6 = new h3h.c(noteDetailsOverviewController.P, noteDetailsOverviewController.T, noteDetailsOverviewController.S, noteDetailsOverviewController.Q, noteDetailsOverviewController.R);
                        String str2 = noteDetailsOverviewControllerContract$InputData.f88895a;
                        eel.c cVar7 = eel.c.ONE_DAY;
                        eel.c cVar8 = eel.c.ONE_WEEK;
                        eel.c cVar9 = eel.c.ONE_MONTH;
                        eel.c cVar10 = eel.c.SIX_MONTHS;
                        eel.c cVar11 = eel.c.ONE_YEAR;
                        e3h.d dVar3 = new e3h.d(str2, v.k(cVar7, cVar8, cVar9, cVar10, cVar11, eel.c.ALL), cVar11, zhm.h0.f322473a, false, null, false, false, false, null, YearClass.CLASS_2016);
                        c cVar12 = new c(noteDetailsOverviewController);
                        SmallActionButtonDelegate smallActionButtonDelegate = noteDetailsOverviewController.V;
                        z4e.c cVar13 = new z4e.c(smallActionButtonDelegate);
                        z4e.e eVar6 = new z4e.e(str);
                        u4e.c cVar14 = new u4e.c(smallActionButtonDelegate);
                        u4e.e eVar7 = new u4e.e(str);
                        w4e.c cVar15 = new w4e.c(str);
                        avk.h hVar = noteDetailsOverviewController.g0;
                        f fVar = noteDetailsOverviewController.f88893e0;
                        e eVar8 = noteDetailsOverviewController.f0;
                        d dVar4 = noteDetailsOverviewController.f88892d0;
                        hVar.getClass();
                        fVar.getClass();
                        eVar8.getClass();
                        dVar4.getClass();
                        return new o4e.e(lVar, dVar2, new f3h.b(), new f3h.a(), noteDetailsOverviewController, noteDetailsOverviewControllerContract$InputData, gVar, cVar, eVar, cVar2, eVar2, cVar3, eVar3, cVar4, eVar4, cVar5, eVar5, cVar6, dVar3, cVar12, eVar6, cVar13, eVar7, cVar14, cVar15, hVar, fVar, eVar8, dVar4);
                    case 1:
                        NoteDetailsOverviewController.Companion companion2 = NoteDetailsOverviewController.INSTANCE;
                        return (g) ((o4e.e) ((n5e.a) this.f202900b.c0.getValue())).f222232n0.get();
                    default:
                        NoteDetailsOverviewController.Companion companion3 = NoteDetailsOverviewController.INSTANCE;
                        NoteDetailsOverviewController noteDetailsOverviewController2 = this.f202900b;
                        return dli.f.a(noteDetailsOverviewController2, (g) noteDetailsOverviewController2.f88894h0.getValue(), v.k(noteDetailsOverviewController2.Q, noteDetailsOverviewController2.T, noteDetailsOverviewController2.N, noteDetailsOverviewController2.P, noteDetailsOverviewController2.S, noteDetailsOverviewController2.R, new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new TextDelegate(), noteDetailsOverviewController2.U, new FooterTextDelegate(), noteDetailsOverviewController2.V, noteDetailsOverviewController2.W, noteDetailsOverviewController2.X, noteDetailsOverviewController2.Y, noteDetailsOverviewController2.Z, noteDetailsOverviewController2.f88890a0, noteDetailsOverviewController2.f88891b0), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n5e.a) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.f88894h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = j0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.L;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((pji.a) value).f236787b.setClipToPadding(false);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value2).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        knm.b.v(kli.a.k(m2(), 134.0f), recyclerView);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.i0.getValue();
    }
}
