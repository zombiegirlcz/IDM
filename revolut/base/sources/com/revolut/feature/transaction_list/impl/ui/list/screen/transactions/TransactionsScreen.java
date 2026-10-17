package com.revolut.feature.transaction_list.impl.ui.list.screen.transactions;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cbh.f;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.feature.transaction_list.impl.R$id;
import com.revolut.feature.transaction_list.impl.R$layout;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tki.b;
import tki.c;
import vc.s;
import vga.g;
import vgf.i;
import vgf.l;
import vgf.m;
import vgf.n;
import vgf.p;
import vgf.t;
import vgf.u;
import vgf.v;
import xki.e;
import yhm.j;
import yp0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/screen/transactions/TransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvgf/t;", "Ltki/c;", "Lvgf/v;", "Companion", "a", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsScreen extends ViewController<t> implements c {
    public final TransactionsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;
    public final SwipeToActionDelegate R;
    public final InputDisclosureDelegate S;
    public final LargeActionButtonDelegate T;
    public final ActionWidgetDelegate U;
    public final FullScreenStateDelegate V;
    public final Lazy W;
    public final Object X;
    public final Object Y;
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(TransactionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/transaction_list/impl/databinding/ScreenTransactionsTabBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TransactionsScreen(TransactionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vgf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsScreen f289099b;

            {
                this.f289099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsScreen transactionsScreen = this.f289099b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen2 = this.f289099b;
                        return tki.g.a(transactionsScreen2, transactionsScreen2.R2(), zhm.d0.E0(((fd6.a) transactionsScreen2.Y.getValue()).e, zhm.v.k(transactionsScreen2.Q, transactionsScreen2.R, transactionsScreen2.S, transactionsScreen2.U, new ListSubheaderDelegate(), transactionsScreen2.V, new RowLoadingDelegate(), new TextDelegate())), R$id.screenTransactionsTab_recyclerView, new vdl.a(transactionsScreen2, 26), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsScreen.Z;
                        return (u) ((pgf.h) transactionsScreen.O.getValue()).f235929s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen3 = this.f289099b;
                        qji.b bVarU2 = transactionsScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.di.TransactionsScreenInjector");
                        pgf.f fVar = (pgf.f) bVarU2;
                        pgf.e eVar = fVar.f235912b;
                        pgf.f fVar2 = fVar.f235913c;
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = transactionsScreen3.K;
                        transactionsScreenContract$InputData.getClass();
                        ScreenContentRecyclerView screenTransactionsTabRecyclerView = transactionsScreen3.d3().f174037b;
                        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
                        return new pgf.h(eVar, fVar2, transactionsScreen3, screenTransactionsTabRecyclerView, transactionsScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsScreen.Z;
                        return (Tabs) transactionsScreen.D2().getRootView().findViewById(R$id.flowTransactionList_monthTabs);
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsScreen.Z;
                        return (t60.b) ((pgf.h) transactionsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr6 = TransactionsScreen.Z;
                        return (fd6.a) ((pgf.h) transactionsScreen.O.getValue()).f235923l.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vgf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsScreen f289099b;

            {
                this.f289099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsScreen transactionsScreen = this.f289099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen2 = this.f289099b;
                        return tki.g.a(transactionsScreen2, transactionsScreen2.R2(), zhm.d0.E0(((fd6.a) transactionsScreen2.Y.getValue()).e, zhm.v.k(transactionsScreen2.Q, transactionsScreen2.R, transactionsScreen2.S, transactionsScreen2.U, new ListSubheaderDelegate(), transactionsScreen2.V, new RowLoadingDelegate(), new TextDelegate())), R$id.screenTransactionsTab_recyclerView, new vdl.a(transactionsScreen2, 26), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsScreen.Z;
                        return (u) ((pgf.h) transactionsScreen.O.getValue()).f235929s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen3 = this.f289099b;
                        qji.b bVarU2 = transactionsScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.di.TransactionsScreenInjector");
                        pgf.f fVar = (pgf.f) bVarU2;
                        pgf.e eVar = fVar.f235912b;
                        pgf.f fVar2 = fVar.f235913c;
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = transactionsScreen3.K;
                        transactionsScreenContract$InputData.getClass();
                        ScreenContentRecyclerView screenTransactionsTabRecyclerView = transactionsScreen3.d3().f174037b;
                        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
                        return new pgf.h(eVar, fVar2, transactionsScreen3, screenTransactionsTabRecyclerView, transactionsScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsScreen.Z;
                        return (Tabs) transactionsScreen.D2().getRootView().findViewById(R$id.flowTransactionList_monthTabs);
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsScreen.Z;
                        return (t60.b) ((pgf.h) transactionsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr6 = TransactionsScreen.Z;
                        return (fd6.a) ((pgf.h) transactionsScreen.O.getValue()).f235923l.get();
                }
            }
        });
        this.N = R$layout.screen_transactions_tab;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: vgf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsScreen f289099b;

            {
                this.f289099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionsScreen transactionsScreen = this.f289099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen2 = this.f289099b;
                        return tki.g.a(transactionsScreen2, transactionsScreen2.R2(), zhm.d0.E0(((fd6.a) transactionsScreen2.Y.getValue()).e, zhm.v.k(transactionsScreen2.Q, transactionsScreen2.R, transactionsScreen2.S, transactionsScreen2.U, new ListSubheaderDelegate(), transactionsScreen2.V, new RowLoadingDelegate(), new TextDelegate())), R$id.screenTransactionsTab_recyclerView, new vdl.a(transactionsScreen2, 26), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsScreen.Z;
                        return (u) ((pgf.h) transactionsScreen.O.getValue()).f235929s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen3 = this.f289099b;
                        qji.b bVarU2 = transactionsScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.di.TransactionsScreenInjector");
                        pgf.f fVar = (pgf.f) bVarU2;
                        pgf.e eVar = fVar.f235912b;
                        pgf.f fVar2 = fVar.f235913c;
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = transactionsScreen3.K;
                        transactionsScreenContract$InputData.getClass();
                        ScreenContentRecyclerView screenTransactionsTabRecyclerView = transactionsScreen3.d3().f174037b;
                        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
                        return new pgf.h(eVar, fVar2, transactionsScreen3, screenTransactionsTabRecyclerView, transactionsScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsScreen.Z;
                        return (Tabs) transactionsScreen.D2().getRootView().findViewById(R$id.flowTransactionList_monthTabs);
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsScreen.Z;
                        return (t60.b) ((pgf.h) transactionsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr6 = TransactionsScreen.Z;
                        return (fd6.a) ((pgf.h) transactionsScreen.O.getValue()).f235923l.get();
                }
            }
        });
        this.P = s.t(this, i.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        this.S = new InputDisclosureDelegate();
        this.T = new LargeActionButtonDelegate();
        this.U = new ActionWidgetDelegate();
        this.V = new FullScreenStateDelegate();
        final int i5 = 3;
        this.W = j.b(new Function0(this) { // from class: vgf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsScreen f289099b;

            {
                this.f289099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransactionsScreen transactionsScreen = this.f289099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen2 = this.f289099b;
                        return tki.g.a(transactionsScreen2, transactionsScreen2.R2(), zhm.d0.E0(((fd6.a) transactionsScreen2.Y.getValue()).e, zhm.v.k(transactionsScreen2.Q, transactionsScreen2.R, transactionsScreen2.S, transactionsScreen2.U, new ListSubheaderDelegate(), transactionsScreen2.V, new RowLoadingDelegate(), new TextDelegate())), R$id.screenTransactionsTab_recyclerView, new vdl.a(transactionsScreen2, 26), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsScreen.Z;
                        return (u) ((pgf.h) transactionsScreen.O.getValue()).f235929s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen3 = this.f289099b;
                        qji.b bVarU2 = transactionsScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.di.TransactionsScreenInjector");
                        pgf.f fVar = (pgf.f) bVarU2;
                        pgf.e eVar = fVar.f235912b;
                        pgf.f fVar2 = fVar.f235913c;
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = transactionsScreen3.K;
                        transactionsScreenContract$InputData.getClass();
                        ScreenContentRecyclerView screenTransactionsTabRecyclerView = transactionsScreen3.d3().f174037b;
                        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
                        return new pgf.h(eVar, fVar2, transactionsScreen3, screenTransactionsTabRecyclerView, transactionsScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsScreen.Z;
                        return (Tabs) transactionsScreen.D2().getRootView().findViewById(R$id.flowTransactionList_monthTabs);
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsScreen.Z;
                        return (t60.b) ((pgf.h) transactionsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr6 = TransactionsScreen.Z;
                        return (fd6.a) ((pgf.h) transactionsScreen.O.getValue()).f235923l.get();
                }
            }
        });
        final int i6 = 4;
        this.X = w.y0(new Function0(this) { // from class: vgf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsScreen f289099b;

            {
                this.f289099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TransactionsScreen transactionsScreen = this.f289099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen2 = this.f289099b;
                        return tki.g.a(transactionsScreen2, transactionsScreen2.R2(), zhm.d0.E0(((fd6.a) transactionsScreen2.Y.getValue()).e, zhm.v.k(transactionsScreen2.Q, transactionsScreen2.R, transactionsScreen2.S, transactionsScreen2.U, new ListSubheaderDelegate(), transactionsScreen2.V, new RowLoadingDelegate(), new TextDelegate())), R$id.screenTransactionsTab_recyclerView, new vdl.a(transactionsScreen2, 26), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsScreen.Z;
                        return (u) ((pgf.h) transactionsScreen.O.getValue()).f235929s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen3 = this.f289099b;
                        qji.b bVarU2 = transactionsScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.di.TransactionsScreenInjector");
                        pgf.f fVar = (pgf.f) bVarU2;
                        pgf.e eVar = fVar.f235912b;
                        pgf.f fVar2 = fVar.f235913c;
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = transactionsScreen3.K;
                        transactionsScreenContract$InputData.getClass();
                        ScreenContentRecyclerView screenTransactionsTabRecyclerView = transactionsScreen3.d3().f174037b;
                        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
                        return new pgf.h(eVar, fVar2, transactionsScreen3, screenTransactionsTabRecyclerView, transactionsScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsScreen.Z;
                        return (Tabs) transactionsScreen.D2().getRootView().findViewById(R$id.flowTransactionList_monthTabs);
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsScreen.Z;
                        return (t60.b) ((pgf.h) transactionsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr6 = TransactionsScreen.Z;
                        return (fd6.a) ((pgf.h) transactionsScreen.O.getValue()).f235923l.get();
                }
            }
        });
        final int i21 = 5;
        this.Y = w.y0(new Function0(this) { // from class: vgf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsScreen f289099b;

            {
                this.f289099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TransactionsScreen transactionsScreen = this.f289099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen2 = this.f289099b;
                        return tki.g.a(transactionsScreen2, transactionsScreen2.R2(), zhm.d0.E0(((fd6.a) transactionsScreen2.Y.getValue()).e, zhm.v.k(transactionsScreen2.Q, transactionsScreen2.R, transactionsScreen2.S, transactionsScreen2.U, new ListSubheaderDelegate(), transactionsScreen2.V, new RowLoadingDelegate(), new TextDelegate())), R$id.screenTransactionsTab_recyclerView, new vdl.a(transactionsScreen2, 26), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsScreen.Z;
                        return (u) ((pgf.h) transactionsScreen.O.getValue()).f235929s.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsScreen.Z;
                        TransactionsScreen transactionsScreen3 = this.f289099b;
                        qji.b bVarU2 = transactionsScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.di.TransactionsScreenInjector");
                        pgf.f fVar = (pgf.f) bVarU2;
                        pgf.e eVar = fVar.f235912b;
                        pgf.f fVar2 = fVar.f235913c;
                        TransactionsScreenContract$InputData transactionsScreenContract$InputData = transactionsScreen3.K;
                        transactionsScreenContract$InputData.getClass();
                        ScreenContentRecyclerView screenTransactionsTabRecyclerView = transactionsScreen3.d3().f174037b;
                        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
                        return new pgf.h(eVar, fVar2, transactionsScreen3, screenTransactionsTabRecyclerView, transactionsScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsScreen.Z;
                        return (Tabs) transactionsScreen.D2().getRootView().findViewById(R$id.flowTransactionList_monthTabs);
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsScreen.Z;
                        return (t60.b) ((pgf.h) transactionsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr6 = TransactionsScreen.Z;
                        return (fd6.a) ((pgf.h) transactionsScreen.O.getValue()).f235923l.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Integer num = uiState.f289138b;
        if (num != null) {
            int iIntValue = num.intValue();
            RecyclerView.LayoutManager layoutManagerB2 = ((b) ((tki.a) this.L.getValue())).f271959b.b2();
            LinearLayoutManager linearLayoutManager = layoutManagerB2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManagerB2 : null;
            if (linearLayoutManager != null) {
                Integer num2 = uiState.f289139c;
                linearLayoutManager.scrollToPositionWithOffset(iIntValue, num2 != null ? num2.intValue() : 0);
            }
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) R2();
            aVar.H2(aVar.J, new g(17));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pgf.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(com.revolut.core.ui_kit.R$id.internal_content_description_clause, new TextLocalisedClause("transactions.feed", (List) null, (Clause) null, false, 30));
        ScreenContentRecyclerView screenTransactionsTabRecyclerView = d3().f174037b;
        Intrinsics.checkNotNullExpressionValue(screenTransactionsTabRecyclerView, "screenTransactionsTabRecyclerView");
        y.g(screenTransactionsTabRecyclerView, m2());
        ((j60.a) ((pgf.h) this.O.getValue()).i.get()).d(zhm.v.k(this.T, this.Q));
    }

    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52538c), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new vgf.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f51589c.f121375b), null, new p(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.V.f52371h.f121375b), new vgf.q(this, null), 3);
        ?? r62 = this.X;
        com.revolut.kompot.navigable.a.g2(this, t1.e0(vkm.q.q(new v0f.p(new f(t1.J(yh5.b.d(vkm.q.i(rd0.e.b(((t60.g) ((t60.b) r62.getValue())).R()), 1, ukm.f.DROP_OLDEST), rd0.e.b(((t60.g) ((t60.b) r62.getValue())).d)), 500L), 4), 4))), null, new p(this, continuation, 1), 3);
        RecyclerView.LayoutManager layoutManager = d3().f174037b.getLayoutManager();
        com.revolut.kompot.navigable.a.g2(this, t1.J(rd0.e.b(((t60.g) ((t60.b) r62.getValue())).e), 50L), null, new vfg.m(layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null, this, continuation, 4), 3);
    }

    public final jgf.b d3() {
        ViewBinding value = this.P.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jgf.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u d() {
        return (u) this.M.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f3(androidx.recyclerview.widget.LinearLayoutManager r20) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen.f3(androidx.recyclerview.widget.LinearLayoutManager):void");
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
