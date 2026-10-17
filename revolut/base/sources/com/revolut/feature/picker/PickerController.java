package com.revolut.feature.picker;

import aim.e;
import an9.g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import aw0.o9;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.picker.R$id;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import knm.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c9;
import no.k;
import no.m;
import org.jetbrains.annotations.NotNull;
import s6d.r;
import s7a.a0;
import s7a.c;
import s7a.f;
import s7a.i;
import s7a.j;
import s7a.j0;
import s7a.k0;
import s7a.l;
import s7a.n;
import s7a.p;
import s7a.t;
import s7a.u;
import s7a.x;
import te0.w;
import vc.s;
import x7a.d;
import yp0.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/picker/PickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls7a/a0;", "Ldli/a;", "Ls7a/k0;", "Lno/m;", "Lno/k;", "Companion", "a", "feature_picker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PickerController extends ViewController<a0> implements dli.a, m, k {
    public final x K;
    public final d L;
    public final int M;
    public final RowDelegate N;
    public final InputDisclosureDelegate O;
    public final InputChecklistDelegate P;
    public final SingleChoiceDelegate Q;
    public final SelectableDelegate R;
    public final ListSubheaderDelegate S;
    public final AccountCellItemDelegate T;
    public final SelectableDelegate U;
    public final SelectableDelegate V;
    public final FullScreenStateDelegate W;
    public final AnalyticsProduct X;
    public AnalyticsContext Y;
    public final Integer Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f80343a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f80344b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f80345d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f80346e0;
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PickerController.class, "binding", "getBinding()Lcom/revolut/feature/picker/databinding/FeatureScreenPickerBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.picker.PickerController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PickerController(x inputData, d interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.K = inputData;
        this.L = interactor;
        this.M = R$layout.feature_screen_picker;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new InputDisclosureDelegate();
        this.P = new InputChecklistDelegate();
        this.Q = new SingleChoiceDelegate();
        this.R = new SelectableDelegate(rowDelegate);
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.S = listSubheaderDelegate;
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        this.T = accountCellItemDelegate;
        this.U = new SelectableDelegate(listSubheaderDelegate);
        this.V = new SelectableDelegate(accountCellItemDelegate);
        this.W = new FullScreenStateDelegate();
        this.X = inputData.f260655n;
        this.Y = inputData.o;
        this.Z = inputData.f260659s;
        final int i = 0;
        this.f80343a0 = w.y0(new Function0(this) { // from class: s7a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerController f260601b;

            {
                this.f260601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Clause clause;
                int i2 = i;
                PickerController pickerController = this.f260601b;
                switch (i2) {
                    case 0:
                        PickerController.Companion companion = PickerController.INSTANCE;
                        PickerController pickerController2 = this.f260601b;
                        return dli.f.a(pickerController2, pickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), pickerController2.N, pickerController2.O, pickerController2.P, pickerController2.Q, pickerController2.R, pickerController2.S, pickerController2.T, pickerController2.U, pickerController2.V, pickerController2.W), R$id.picker_recyclerView, null, null, null, 56);
                    case 1:
                        PickerController.Companion companion2 = PickerController.INSTANCE;
                        t headerMode = pickerController.K.f260647a;
                        ModalDestination.Style styleB = pickerController.q2().b();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(headerMode, "headerMode");
                        return (!Intrinsics.f(styleB, ModalDestination.Style.BOTTOM_DIALOG.f98301a) || headerMode == null || (clause = headerMode.f260638a) == null) ? headerMode : new s(clause, headerMode.e, headerMode.f260642h);
                    case 2:
                        PickerController.Companion companion3 = PickerController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pickerController.m2()).a().get(u7a.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u7a.d.class, " is not found"));
                        }
                        u7a.a aVar3 = ((u7a.a) aVar2.b()).f277720c;
                        x xVar = pickerController.K;
                        xVar.getClass();
                        x7a.d dVar = pickerController.L;
                        dVar.getClass();
                        return new u7a.b(aVar3, xVar, dVar);
                    default:
                        PickerController.Companion companion4 = PickerController.INSTANCE;
                        return (j0) ((u7a.b) pickerController.f80345d0.getValue()).e.get();
                }
            }
        });
        this.f80344b0 = s.t(this, c.f);
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: s7a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerController f260601b;

            {
                this.f260601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Clause clause;
                int i22 = i2;
                PickerController pickerController = this.f260601b;
                switch (i22) {
                    case 0:
                        PickerController.Companion companion = PickerController.INSTANCE;
                        PickerController pickerController2 = this.f260601b;
                        return dli.f.a(pickerController2, pickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), pickerController2.N, pickerController2.O, pickerController2.P, pickerController2.Q, pickerController2.R, pickerController2.S, pickerController2.T, pickerController2.U, pickerController2.V, pickerController2.W), R$id.picker_recyclerView, null, null, null, 56);
                    case 1:
                        PickerController.Companion companion2 = PickerController.INSTANCE;
                        t headerMode = pickerController.K.f260647a;
                        ModalDestination.Style styleB = pickerController.q2().b();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(headerMode, "headerMode");
                        return (!Intrinsics.f(styleB, ModalDestination.Style.BOTTOM_DIALOG.f98301a) || headerMode == null || (clause = headerMode.f260638a) == null) ? headerMode : new s(clause, headerMode.e, headerMode.f260642h);
                    case 2:
                        PickerController.Companion companion3 = PickerController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pickerController.m2()).a().get(u7a.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u7a.d.class, " is not found"));
                        }
                        u7a.a aVar3 = ((u7a.a) aVar2.b()).f277720c;
                        x xVar = pickerController.K;
                        xVar.getClass();
                        x7a.d dVar = pickerController.L;
                        dVar.getClass();
                        return new u7a.b(aVar3, xVar, dVar);
                    default:
                        PickerController.Companion companion4 = PickerController.INSTANCE;
                        return (j0) ((u7a.b) pickerController.f80345d0.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.f80345d0 = w.y0(new Function0(this) { // from class: s7a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerController f260601b;

            {
                this.f260601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Clause clause;
                int i22 = i3;
                PickerController pickerController = this.f260601b;
                switch (i22) {
                    case 0:
                        PickerController.Companion companion = PickerController.INSTANCE;
                        PickerController pickerController2 = this.f260601b;
                        return dli.f.a(pickerController2, pickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), pickerController2.N, pickerController2.O, pickerController2.P, pickerController2.Q, pickerController2.R, pickerController2.S, pickerController2.T, pickerController2.U, pickerController2.V, pickerController2.W), R$id.picker_recyclerView, null, null, null, 56);
                    case 1:
                        PickerController.Companion companion2 = PickerController.INSTANCE;
                        t headerMode = pickerController.K.f260647a;
                        ModalDestination.Style styleB = pickerController.q2().b();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(headerMode, "headerMode");
                        return (!Intrinsics.f(styleB, ModalDestination.Style.BOTTOM_DIALOG.f98301a) || headerMode == null || (clause = headerMode.f260638a) == null) ? headerMode : new s(clause, headerMode.e, headerMode.f260642h);
                    case 2:
                        PickerController.Companion companion3 = PickerController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pickerController.m2()).a().get(u7a.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u7a.d.class, " is not found"));
                        }
                        u7a.a aVar3 = ((u7a.a) aVar2.b()).f277720c;
                        x xVar = pickerController.K;
                        xVar.getClass();
                        x7a.d dVar = pickerController.L;
                        dVar.getClass();
                        return new u7a.b(aVar3, xVar, dVar);
                    default:
                        PickerController.Companion companion4 = PickerController.INSTANCE;
                        return (j0) ((u7a.b) pickerController.f80345d0.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.f80346e0 = w.y0(new Function0(this) { // from class: s7a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerController f260601b;

            {
                this.f260601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Clause clause;
                int i22 = i5;
                PickerController pickerController = this.f260601b;
                switch (i22) {
                    case 0:
                        PickerController.Companion companion = PickerController.INSTANCE;
                        PickerController pickerController2 = this.f260601b;
                        return dli.f.a(pickerController2, pickerController2.R2(), zhm.v.k(new RowLoadingDelegate(), pickerController2.N, pickerController2.O, pickerController2.P, pickerController2.Q, pickerController2.R, pickerController2.S, pickerController2.T, pickerController2.U, pickerController2.V, pickerController2.W), R$id.picker_recyclerView, null, null, null, 56);
                    case 1:
                        PickerController.Companion companion2 = PickerController.INSTANCE;
                        t headerMode = pickerController.K.f260647a;
                        ModalDestination.Style styleB = pickerController.q2().b();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(headerMode, "headerMode");
                        return (!Intrinsics.f(styleB, ModalDestination.Style.BOTTOM_DIALOG.f98301a) || headerMode == null || (clause = headerMode.f260638a) == null) ? headerMode : new s(clause, headerMode.e, headerMode.f260642h);
                    case 2:
                        PickerController.Companion companion3 = PickerController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pickerController.m2()).a().get(u7a.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u7a.d.class, " is not found"));
                        }
                        u7a.a aVar3 = ((u7a.a) aVar2.b()).f277720c;
                        x xVar = pickerController.K;
                        xVar.getClass();
                        x7a.d dVar = pickerController.L;
                        dVar.getClass();
                        return new u7a.b(aVar3, xVar, dVar);
                    default:
                        PickerController.Companion companion4 = PickerController.INSTANCE;
                        return (j0) ((u7a.b) pickerController.f80345d0.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getL() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k0 uiState = (k0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean z = uiState.d;
        boolean z3 = uiState.f260612b;
        Clause clause = uiState.f260613c;
        Integer num = uiState.e;
        boolean z4 = uiState.i;
        u uVar = (u) this.c0.getValue();
        if (!(uVar instanceof t)) {
            if (!(uVar instanceof s7a.s)) {
                throw new NoWhenBranchMatchedException();
            }
            t7a.a aVarD3 = d3();
            NavBarBottomSheet navBarBottomSheet = aVarD3.d;
            ScreenContentRecyclerView pickerRecyclerView = aVarD3.e;
            LargeActionButton pickerButton = aVarD3.f268624b;
            navBarBottomSheet.setSearchButtonActive(z4);
            aVarD3.d.setSearchInput(new TextClause(uiState.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
            b.z(pickerRecyclerView, true, null, 14);
            if (num != null) {
                int iIntValue = num.intValue();
                RecyclerView.LayoutManager layoutManager = pickerRecyclerView.getLayoutManager();
                Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPosition(iIntValue);
            }
            if (clause != null) {
                pickerButton.setText(clause);
            }
            Intrinsics.checkNotNullExpressionValue(pickerButton, "pickerButton");
            b.z(pickerButton, z, null, 14);
            pickerButton.setEnabled(z3);
            if (!z) {
                Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
                b.v(0, pickerRecyclerView);
                return;
            } else {
                Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
                Context context = pickerRecyclerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                b.v(kli.a.k(context, 92.0f), pickerRecyclerView);
                return;
            }
        }
        t tVar = (t) uVar;
        t7a.a aVarD32 = d3();
        NavBarWithToolbar navBarWithToolbar = aVarD32.f268625c;
        ScreenContentRecyclerView pickerRecyclerView2 = aVarD32.e;
        LargeActionButton pickerButton2 = aVarD32.f268624b;
        navBarWithToolbar.setSearchButtonActive(z4);
        NavBarWithToolbar pickerNavBar = aVarD32.f268625c;
        pickerNavBar.setSearchInput(new TextClause(uiState.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        boolean z6 = this.K.f260654m && !pickerNavBar.f59409p.m();
        if (!pickerNavBar.f59421x0 && z6) {
            pickerNavBar.K0(j4.NO_ANIMATION);
            pickerNavBar.post(new s7a.a(aVarD32, 0));
        }
        pickerNavBar.setNavigationButtonIcon(uiState.f260615h ? Integer.valueOf(ofm.q.k(q2())) : null);
        Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
        NavBarMenuItem navBarMenuItem = uiState.f260614g;
        List list = tVar.f260641g;
        e eVarB = zhm.u.b();
        if (navBarMenuItem != null) {
            eVarB.add(navBarMenuItem);
        }
        eVarB.addAll(list);
        pickerNavBar.setMenuItems(eVarB);
        zhm.u.a(eVarB);
        Intrinsics.checkNotNullExpressionValue(pickerRecyclerView2, "pickerRecyclerView");
        b.z(pickerRecyclerView2, true, null, 14);
        if (num != null) {
            int iIntValue2 = num.intValue();
            RecyclerView.LayoutManager layoutManager2 = pickerRecyclerView2.getLayoutManager();
            Intrinsics.i(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager2).scrollToPosition(iIntValue2);
        }
        if (clause != null) {
            pickerButton2.setText(clause);
        }
        Intrinsics.checkNotNullExpressionValue(pickerButton2, "pickerButton");
        b.z(pickerButton2, z, null, 14);
        pickerButton2.setEnabled(z3);
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(pickerRecyclerView2, "pickerRecyclerView");
            b.v(0, pickerRecyclerView2);
        } else {
            Intrinsics.checkNotNullExpressionValue(pickerRecyclerView2, "pickerRecyclerView");
            Context context2 = pickerRecyclerView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            b.v(kli.a.k(context2, 92.0f), pickerRecyclerView2);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) R2();
        if (!aVar.f80348p.f260653l) {
            return super.F2();
        }
        aVar.C2(new a0(p.f260622a));
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Y = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getT() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u7a.b) this.f80345d0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        x xVar = this.K;
        boolean z = xVar.f260649c;
        Clause clause = xVar.i;
        ((hli.e) view).setFitStatusBar(z);
        u uVar = (u) this.c0.getValue();
        if (!(uVar instanceof t)) {
            if (!(uVar instanceof s7a.s)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewParent parent = d3().f268625c.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(d3().f268625c);
            }
            s7a.s sVar = (s7a.s) uVar;
            t7a.a aVarD3 = d3();
            LargeActionButton pickerButton = aVarD3.f268624b;
            Intrinsics.checkNotNullExpressionValue(pickerButton, "pickerButton");
            pickerButton.o(LargeActionButton.ButtonStyle.f58725a);
            pickerButton.setLoadingButtonTag("PICKER_SCREEN_PRIMARY_BUTTON_TAG");
            pickerButton.setOnClickListener(new c9(this, 16));
            pickerButton.setAnalyticsContext(xVar.f260658r);
            NavBarBottomSheet navBarBottomSheet = aVarD3.d;
            navBarBottomSheet.setHeaderModel(new lw0.a(sVar.f260632a, sVar.f260633b, null, null, false, 4));
            Clause clause2 = sVar.f260634c;
            if (clause2 != null) {
                navBarBottomSheet.setHint(clause2);
            }
            if (clause != null) {
                aVarD3.f268624b.setText(clause);
            }
            ScreenContentRecyclerView pickerRecyclerView = aVarD3.e;
            Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
            y.g(pickerRecyclerView, m2());
            return;
        }
        ViewParent parent2 = d3().d.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(d3().d);
        }
        t tVar = (t) uVar;
        t7a.a aVarD32 = d3();
        LargeActionButton pickerButton2 = aVarD32.f268624b;
        NavBarWithToolbar pickerNavBar = aVarD32.f268625c;
        Intrinsics.checkNotNullExpressionValue(pickerButton2, "pickerButton");
        pickerButton2.o(LargeActionButton.ButtonStyle.f58725a);
        pickerButton2.setLoadingButtonTag("PICKER_SCREEN_PRIMARY_BUTTON_TAG");
        pickerButton2.setOnClickListener(new c9(this, 16));
        pickerButton2.setAnalyticsContext(xVar.f260658r);
        pickerNavBar.setHeaderTitleMode(tVar.d);
        Clause clause3 = tVar.f260638a;
        if (clause3 == null) {
            pickerNavBar.j0(false);
        } else {
            pickerNavBar.setToolbarTitle(clause3);
            Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
            pickerNavBar.setTitle(clause3, null);
        }
        Clause clause4 = tVar.e;
        if (clause4 != null) {
            pickerNavBar.setDescriptionText(clause4);
            pickerNavBar.setDescriptionVisible(true);
        }
        Clause clause5 = tVar.f;
        if (clause5 != null) {
            pickerNavBar.setSecondDescriptionText(clause5);
            pickerNavBar.setSecondDescriptionVisible(true);
        }
        Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
        b.z(pickerNavBar, tVar.f260639b, null, 14);
        Clause clause6 = tVar.f260642h;
        if (clause6 != null) {
            pickerNavBar.setHint(clause6);
        }
        Clause clause7 = tVar.i;
        if (clause7 != null) {
            pickerNavBar.setSearchContentDescription(clause7);
        }
        if (clause != null) {
            aVarD32.f268624b.setText(clause);
        }
        ScreenContentRecyclerView pickerRecyclerView2 = aVarD32.e;
        Intrinsics.checkNotNullExpressionValue(pickerRecyclerView2, "pickerRecyclerView");
        y.g(pickerRecyclerView2, m2());
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVar = (u) this.c0.getValue();
        int i = 10;
        int i2 = 8;
        int i3 = 3;
        int i5 = 1;
        Continuation continuation = null;
        if (uVar instanceof t) {
            t7a.a aVarD3 = d3();
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarD3.f268625c.o.f57403b), null, new i(this, continuation, 7), 3);
            NavBarWithToolbar navBarWithToolbar = aVarD3.f268625c;
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59409p.f57337m), null, new i(this, continuation, i2), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new s1k.b(this, continuation, 13), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.p0()), null, new i(this, continuation, 9), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.x0()), null, new i(this, continuation, i), 3);
            com.revolut.kompot.navigable.a.g2(this, vkm.q.t(rd0.e.b(navBarWithToolbar.X0), 1), null, new i(this, continuation, 11), 3);
        } else {
            if (!(uVar instanceof s7a.s)) {
                throw new NoWhenBranchMatchedException();
            }
            t7a.a aVarD32 = d3();
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarD32.d.I()), null, new i(this, continuation, i3), 3);
            NavBarBottomSheet navBarBottomSheet = aVarD32.d;
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarBottomSheet.E), null, new i(this, continuation, 4), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarBottomSheet.F), null, new i(this, continuation, 5), 3);
            com.revolut.kompot.navigable.a.g2(this, vkm.q.t(rd0.e.b(navBarBottomSheet.S), 1), null, new i(this, continuation, 6), 3);
        }
        vkm.d dVarB = rd0.e.b(this.U.r());
        FullScreenStateDelegate fullScreenStateDelegate = this.W;
        ViewController.P2(this, new g(vkm.q.J(dVarB, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b)), 29), new i(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f51551c.f53218h), null, new s7a.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.p()), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.r()), null, new s7a.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52538c), null, new n(this, null), 3);
        InputChecklistDelegate inputChecklistDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputChecklistDelegate.f52518c), null, new s7a.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputChecklistDelegate.p()), null, new i(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputChecklistDelegate.e.f121375b), null, new s7a.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52707c), null, new s7a.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new s7a.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.r(new r(i), t1.d(new qij.s(((a) R2()).o.h(), i2), 1000L)), null, new i(this, continuation, 0), 3);
    }

    public final t7a.a d3() {
        ViewBinding value = this.f80344b0.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t7a.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j0 d() {
        return (j0) this.f80346e0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f80343a0.getValue();
    }
}
