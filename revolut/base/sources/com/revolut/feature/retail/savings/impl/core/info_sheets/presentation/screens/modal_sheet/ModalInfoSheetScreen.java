package com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.modal_sheet;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.g;
import aw0.i;
import aw0.n6;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PieChartVerticalLegendDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.modal_sheet.ModalInfoSheetScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import hlb.l;
import hlb.m;
import hlb.n;
import jii.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import llb.b;
import llb.c;
import llb.d;
import llb.f;
import no.k;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/core/info_sheets/presentation/screens/modal_sheet/ModalInfoSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhlb/o;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModalInfoSheetScreen extends ViewController<q> implements a, k {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f83220a0 = {o0.f186429a.j(new h0(ModalInfoSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final TextDelegate Q;
    public final CellDetailsDelegate R;
    public final CellDetailsBarRatingDelegate S;
    public final PieChartVerticalLegendDelegate T;
    public final ListSubheaderDelegate U;
    public final FullScreenStateDelegate V;
    public AnalyticsContext W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public ModalInfoSheetScreen(String sheetKey) {
        Intrinsics.checkNotNullParameter(sheetKey, "sheetKey");
        this.K = R$layout.screen_recycler_navbar_two_buttons;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: llb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModalInfoSheetScreen f196693b;

            {
                this.f196693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ModalInfoSheetScreen modalInfoSheetScreen = this.f196693b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174574c;
                    case 1:
                        KProperty[] kPropertyArr2 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174573b;
                    case 2:
                        KProperty[] kPropertyArr3 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = ModalInfoSheetScreen.f83220a0;
                        ModalInfoSheetScreen modalInfoSheetScreen2 = this.f196693b;
                        f fVarD = modalInfoSheetScreen2.d();
                        int i3 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        FullScreenStateDelegate fullScreenStateDelegate = modalInfoSheetScreen2.V;
                        RowDelegate rowDelegate = modalInfoSheetScreen2.P;
                        TextDelegate textDelegate = modalInfoSheetScreen2.Q;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = modalInfoSheetScreen2.S;
                        return dli.f.a(modalInfoSheetScreen2, fVarD, v.k(fullScreenStateDelegate, rowDelegate, textDelegate, rowLoadingDelegate, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.R, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.T, modalInfoSheetScreen2.U), i3, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = ModalInfoSheetScreen.f83220a0;
                        qji.b bVarU2 = modalInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        blb.e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr6 = ModalInfoSheetScreen.f83220a0;
                        return (f) ((blb.b) modalInfoSheetScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: llb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModalInfoSheetScreen f196693b;

            {
                this.f196693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ModalInfoSheetScreen modalInfoSheetScreen = this.f196693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174574c;
                    case 1:
                        KProperty[] kPropertyArr2 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174573b;
                    case 2:
                        KProperty[] kPropertyArr3 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = ModalInfoSheetScreen.f83220a0;
                        ModalInfoSheetScreen modalInfoSheetScreen2 = this.f196693b;
                        f fVarD = modalInfoSheetScreen2.d();
                        int i3 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        FullScreenStateDelegate fullScreenStateDelegate = modalInfoSheetScreen2.V;
                        RowDelegate rowDelegate = modalInfoSheetScreen2.P;
                        TextDelegate textDelegate = modalInfoSheetScreen2.Q;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = modalInfoSheetScreen2.S;
                        return dli.f.a(modalInfoSheetScreen2, fVarD, v.k(fullScreenStateDelegate, rowDelegate, textDelegate, rowLoadingDelegate, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.R, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.T, modalInfoSheetScreen2.U), i3, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = ModalInfoSheetScreen.f83220a0;
                        qji.b bVarU2 = modalInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        blb.e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr6 = ModalInfoSheetScreen.f83220a0;
                        return (f) ((blb.b) modalInfoSheetScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: llb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModalInfoSheetScreen f196693b;

            {
                this.f196693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ModalInfoSheetScreen modalInfoSheetScreen = this.f196693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174574c;
                    case 1:
                        KProperty[] kPropertyArr2 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174573b;
                    case 2:
                        KProperty[] kPropertyArr3 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = ModalInfoSheetScreen.f83220a0;
                        ModalInfoSheetScreen modalInfoSheetScreen2 = this.f196693b;
                        f fVarD = modalInfoSheetScreen2.d();
                        int i32 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        FullScreenStateDelegate fullScreenStateDelegate = modalInfoSheetScreen2.V;
                        RowDelegate rowDelegate = modalInfoSheetScreen2.P;
                        TextDelegate textDelegate = modalInfoSheetScreen2.Q;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = modalInfoSheetScreen2.S;
                        return dli.f.a(modalInfoSheetScreen2, fVarD, v.k(fullScreenStateDelegate, rowDelegate, textDelegate, rowLoadingDelegate, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.R, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.T, modalInfoSheetScreen2.U), i32, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = ModalInfoSheetScreen.f83220a0;
                        qji.b bVarU2 = modalInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        blb.e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr6 = ModalInfoSheetScreen.f83220a0;
                        return (f) ((blb.b) modalInfoSheetScreen.Y.getValue()).d.get();
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new TextDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new CellDetailsBarRatingDelegate();
        this.T = new PieChartVerticalLegendDelegate();
        this.U = new ListSubheaderDelegate();
        this.V = new FullScreenStateDelegate();
        this.W = new AnalyticsContext(v0.a.b(sheetKey, AnalyticsContext.INSTANCE));
        final int i5 = 3;
        this.X = w.y0(new Function0(this) { // from class: llb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModalInfoSheetScreen f196693b;

            {
                this.f196693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ModalInfoSheetScreen modalInfoSheetScreen = this.f196693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174574c;
                    case 1:
                        KProperty[] kPropertyArr2 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174573b;
                    case 2:
                        KProperty[] kPropertyArr3 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = ModalInfoSheetScreen.f83220a0;
                        ModalInfoSheetScreen modalInfoSheetScreen2 = this.f196693b;
                        f fVarD = modalInfoSheetScreen2.d();
                        int i32 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        FullScreenStateDelegate fullScreenStateDelegate = modalInfoSheetScreen2.V;
                        RowDelegate rowDelegate = modalInfoSheetScreen2.P;
                        TextDelegate textDelegate = modalInfoSheetScreen2.Q;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = modalInfoSheetScreen2.S;
                        return dli.f.a(modalInfoSheetScreen2, fVarD, v.k(fullScreenStateDelegate, rowDelegate, textDelegate, rowLoadingDelegate, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.R, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.T, modalInfoSheetScreen2.U), i32, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = ModalInfoSheetScreen.f83220a0;
                        qji.b bVarU2 = modalInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        blb.e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr6 = ModalInfoSheetScreen.f83220a0;
                        return (f) ((blb.b) modalInfoSheetScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i6 = 4;
        this.Y = w.y0(new Function0(this) { // from class: llb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModalInfoSheetScreen f196693b;

            {
                this.f196693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ModalInfoSheetScreen modalInfoSheetScreen = this.f196693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174574c;
                    case 1:
                        KProperty[] kPropertyArr2 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174573b;
                    case 2:
                        KProperty[] kPropertyArr3 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = ModalInfoSheetScreen.f83220a0;
                        ModalInfoSheetScreen modalInfoSheetScreen2 = this.f196693b;
                        f fVarD = modalInfoSheetScreen2.d();
                        int i32 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        FullScreenStateDelegate fullScreenStateDelegate = modalInfoSheetScreen2.V;
                        RowDelegate rowDelegate = modalInfoSheetScreen2.P;
                        TextDelegate textDelegate = modalInfoSheetScreen2.Q;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = modalInfoSheetScreen2.S;
                        return dli.f.a(modalInfoSheetScreen2, fVarD, v.k(fullScreenStateDelegate, rowDelegate, textDelegate, rowLoadingDelegate, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.R, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.T, modalInfoSheetScreen2.U), i32, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = ModalInfoSheetScreen.f83220a0;
                        qji.b bVarU2 = modalInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        blb.e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr6 = ModalInfoSheetScreen.f83220a0;
                        return (f) ((blb.b) modalInfoSheetScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i21 = 5;
        this.Z = w.y0(new Function0(this) { // from class: llb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModalInfoSheetScreen f196693b;

            {
                this.f196693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                ModalInfoSheetScreen modalInfoSheetScreen = this.f196693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174574c;
                    case 1:
                        KProperty[] kPropertyArr2 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().f174573b;
                    case 2:
                        KProperty[] kPropertyArr3 = ModalInfoSheetScreen.f83220a0;
                        return modalInfoSheetScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = ModalInfoSheetScreen.f83220a0;
                        ModalInfoSheetScreen modalInfoSheetScreen2 = this.f196693b;
                        f fVarD = modalInfoSheetScreen2.d();
                        int i32 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        FullScreenStateDelegate fullScreenStateDelegate = modalInfoSheetScreen2.V;
                        RowDelegate rowDelegate = modalInfoSheetScreen2.P;
                        TextDelegate textDelegate = modalInfoSheetScreen2.Q;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = modalInfoSheetScreen2.S;
                        return dli.f.a(modalInfoSheetScreen2, fVarD, v.k(fullScreenStateDelegate, rowDelegate, textDelegate, rowLoadingDelegate, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.R, cellDetailsBarRatingDelegate, modalInfoSheetScreen2.T, modalInfoSheetScreen2.U), i32, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = ModalInfoSheetScreen.f83220a0;
                        qji.b bVarU2 = modalInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        blb.e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr6 = ModalInfoSheetScreen.f83220a0;
                        return (f) ((blb.b) modalInfoSheetScreen.Y.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hlb.o uiState = (hlb.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        n nVar = uiState.f153437b;
        if (nVar instanceof hlb.k) {
            NavBarWithToolbar navBarWithToolbarF3 = f3();
            hlb.k kVar = (hlb.k) nVar;
            Clause clause = kVar.f153433b;
            TextClause textClause = kVar.f153432a;
            navBarWithToolbarF3.setTitle(textClause, null);
            f3().setToolbarTitle(textClause);
            f3().setSecondDescriptionVisible(clause != null);
            f3().setSecondDescriptionText(clause);
            f3().l0();
        } else if (nVar instanceof l) {
            f3().setTitle(null, null);
            f3().l0();
        } else {
            if (!(nVar instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbarF32 = f3();
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbarF32.I0(t3Var, false);
        }
        i iVar = uiState.f153438c;
        if (iVar instanceof e) {
            g3().setVisibility(0);
            h3().setVisibility(8);
            LargeActionButton largeActionButtonG3 = g3();
            n6 n6Var = ((e) iVar).d;
            largeActionButtonG3.setText(n6Var.f10433a);
            g3().o(n6Var.f10434b);
            g3().setLoadingButtonTag(n6Var.f);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().o), null, new d(this, iVar, null, 0), 3);
            return;
        }
        if (!(iVar instanceof aw0.h)) {
            if (!(iVar instanceof g) && iVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
            screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(8);
            LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
            screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(8);
            Unit unit = Unit.f186387a;
            return;
        }
        g3().setVisibility(0);
        h3().setVisibility(0);
        LargeActionButton largeActionButtonG32 = g3();
        aw0.h hVar = (aw0.h) iVar;
        n6 n6Var2 = hVar.f10331c;
        n6 n6Var3 = hVar.f10330b;
        largeActionButtonG32.setText(n6Var3.f10433a);
        g3().o(n6Var3.f10434b);
        g3().setLoadingButtonTag(n6Var3.f);
        h3().setText(n6Var2.f10433a);
        h3().o(n6Var2.f10434b);
        h3().setLoadingButtonTag(n6Var2.f);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().o), null, new d(this, iVar, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().o), null, new d(this, iVar, null, 2), 3);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.W = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (blb.b) this.Y.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.savings_info_sheet_title, null, null, 14));
        d3().f174572a.setBackground(null);
        f3().setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        f3().setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new la8.h(this, null, 19), 3);
        r rVarMergeArray = r.mergeArray(this.P.f53218h, this.R.f, this.S.f51820c, this.T.f52923c, this.U.f52707c, this.V.f52371h.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new c(this, null, 0), 3);
        r rVarMergeArray2 = r.mergeArray(f3().x0(), this.Q.d);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray2, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray2), null, new c(this, null, 1), 3);
    }

    public final x d3() {
        ViewBinding value = this.L.getValue(this, f83220a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NavBarWithToolbar f3() {
        return (NavBarWithToolbar) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LargeActionButton g3() {
        return (LargeActionButton) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LargeActionButton h3() {
        return (LargeActionButton) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}
