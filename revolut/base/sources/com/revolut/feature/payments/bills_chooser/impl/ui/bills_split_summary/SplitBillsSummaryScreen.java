package com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitSummaryController;
import com.revolut.feature.payments.bills_chooser.impl.R$id;
import com.revolut.feature.payments.bills_chooser.impl.R$layout;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import gp9.i;
import ihm.f;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wp5.x;
import wp9.c0;
import wp9.e;
import wp9.e0;
import wp9.g;
import wp9.l;
import wp9.m;
import wp9.n;
import wp9.r;
import wp9.y;
import yhm.j;
import yhm.k;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreen;", "Lcom/revolut/feature/payments/bills_chooser/api/navigation/SplitSummaryController;", "Ltki/c;", "Lwp9/e0;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillsSummaryScreen extends SplitSummaryController implements tki.c {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(SplitBillsSummaryScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/bills_chooser/impl/databinding/ScreenBillsSelectionSplitSummaryBinding;", 0))};
    public final SplitBillInputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final f P;
    public final Object Q;
    public final SelectableDelegate R;
    public final ListSubheaderDelegate S;
    public final TabsDelegate T;
    public final RowDelegate U;
    public final FullScreenStateDelegate V;
    public final h W;
    public final Object X;
    public final Object Y;

    public SplitBillsSummaryScreen(SplitBillInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bills_selection_split_summary;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wp9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillsSummaryScreen f299176b;

            {
                this.f299176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                int i5 = 0;
                SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299176b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                        SplitBillsSummaryScreen splitBillsSummaryScreen2 = this.f299176b;
                        return tki.g.a(splitBillsSummaryScreen2, splitBillsSummaryScreen2.d(), zhm.v.k(new RowLoadingDelegate(), splitBillsSummaryScreen2.S, (RowDelegate) splitBillsSummaryScreen2.Q.getValue(), splitBillsSummaryScreen2.R, splitBillsSummaryScreen2.T, splitBillsSummaryScreen2.V), R$id.splitBillSummary_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                        return (u80.d) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145395x.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                        qd0.b bVarN = ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145381b.f145357g.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 3:
                        KProperty[] kPropertyArr4 = SplitBillsSummaryScreen.Z;
                        return new RowDelegate(new c(splitBillsSummaryScreen, i5), new c(splitBillsSummaryScreen, i3), 4);
                    case 4:
                        KProperty[] kPropertyArr5 = SplitBillsSummaryScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillsSummaryScreen.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        SplitBillInputData splitBillInputData = splitBillsSummaryScreen.K;
                        splitBillInputData.getClass();
                        return new gp9.i(dVar, splitBillsSummaryScreen, splitBillInputData);
                    default:
                        KProperty[] kPropertyArr6 = SplitBillsSummaryScreen.Z;
                        return (y) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145394w.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wp9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillsSummaryScreen f299176b;

            {
                this.f299176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                int i5 = 0;
                SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299176b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                        SplitBillsSummaryScreen splitBillsSummaryScreen2 = this.f299176b;
                        return tki.g.a(splitBillsSummaryScreen2, splitBillsSummaryScreen2.d(), zhm.v.k(new RowLoadingDelegate(), splitBillsSummaryScreen2.S, (RowDelegate) splitBillsSummaryScreen2.Q.getValue(), splitBillsSummaryScreen2.R, splitBillsSummaryScreen2.T, splitBillsSummaryScreen2.V), R$id.splitBillSummary_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                        return (u80.d) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145395x.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                        qd0.b bVarN = ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145381b.f145357g.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 3:
                        KProperty[] kPropertyArr4 = SplitBillsSummaryScreen.Z;
                        return new RowDelegate(new c(splitBillsSummaryScreen, i5), new c(splitBillsSummaryScreen, i3), 4);
                    case 4:
                        KProperty[] kPropertyArr5 = SplitBillsSummaryScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillsSummaryScreen.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        SplitBillInputData splitBillInputData = splitBillsSummaryScreen.K;
                        splitBillInputData.getClass();
                        return new gp9.i(dVar, splitBillsSummaryScreen, splitBillInputData);
                    default:
                        KProperty[] kPropertyArr6 = SplitBillsSummaryScreen.Z;
                        return (y) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145394w.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wp9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillsSummaryScreen f299176b;

            {
                this.f299176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                int i5 = 0;
                SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299176b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                        SplitBillsSummaryScreen splitBillsSummaryScreen2 = this.f299176b;
                        return tki.g.a(splitBillsSummaryScreen2, splitBillsSummaryScreen2.d(), zhm.v.k(new RowLoadingDelegate(), splitBillsSummaryScreen2.S, (RowDelegate) splitBillsSummaryScreen2.Q.getValue(), splitBillsSummaryScreen2.R, splitBillsSummaryScreen2.T, splitBillsSummaryScreen2.V), R$id.splitBillSummary_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                        return (u80.d) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145395x.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                        qd0.b bVarN = ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145381b.f145357g.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 3:
                        KProperty[] kPropertyArr4 = SplitBillsSummaryScreen.Z;
                        return new RowDelegate(new c(splitBillsSummaryScreen, i5), new c(splitBillsSummaryScreen, i32), 4);
                    case 4:
                        KProperty[] kPropertyArr5 = SplitBillsSummaryScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillsSummaryScreen.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        SplitBillInputData splitBillInputData = splitBillsSummaryScreen.K;
                        splitBillInputData.getClass();
                        return new gp9.i(dVar, splitBillsSummaryScreen, splitBillInputData);
                    default:
                        KProperty[] kPropertyArr6 = SplitBillsSummaryScreen.Z;
                        return (y) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145394w.get();
                }
            }
        });
        this.P = v0.a.d("create(...)");
        final int i5 = 3;
        Lazy lazyC = j.c(k.NONE, new Function0(this) { // from class: wp9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillsSummaryScreen f299176b;

            {
                this.f299176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 1;
                int i59 = 0;
                SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299176b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                        SplitBillsSummaryScreen splitBillsSummaryScreen2 = this.f299176b;
                        return tki.g.a(splitBillsSummaryScreen2, splitBillsSummaryScreen2.d(), zhm.v.k(new RowLoadingDelegate(), splitBillsSummaryScreen2.S, (RowDelegate) splitBillsSummaryScreen2.Q.getValue(), splitBillsSummaryScreen2.R, splitBillsSummaryScreen2.T, splitBillsSummaryScreen2.V), R$id.splitBillSummary_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                        return (u80.d) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145395x.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                        qd0.b bVarN = ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145381b.f145357g.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 3:
                        KProperty[] kPropertyArr4 = SplitBillsSummaryScreen.Z;
                        return new RowDelegate(new c(splitBillsSummaryScreen, i59), new c(splitBillsSummaryScreen, i32), 4);
                    case 4:
                        KProperty[] kPropertyArr5 = SplitBillsSummaryScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillsSummaryScreen.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        SplitBillInputData splitBillInputData = splitBillsSummaryScreen.K;
                        splitBillInputData.getClass();
                        return new gp9.i(dVar, splitBillsSummaryScreen, splitBillInputData);
                    default:
                        KProperty[] kPropertyArr6 = SplitBillsSummaryScreen.Z;
                        return (y) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145394w.get();
                }
            }
        });
        this.Q = lazyC;
        this.R = new SelectableDelegate((RowDelegate) lazyC.getValue());
        this.S = new ListSubheaderDelegate();
        this.T = new TabsDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new FullScreenStateDelegate();
        this.W = s.t(this, wp9.f.f);
        final int i6 = 4;
        this.X = w.y0(new Function0(this) { // from class: wp9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillsSummaryScreen f299176b;

            {
                this.f299176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 1;
                int i59 = 0;
                SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299176b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                        SplitBillsSummaryScreen splitBillsSummaryScreen2 = this.f299176b;
                        return tki.g.a(splitBillsSummaryScreen2, splitBillsSummaryScreen2.d(), zhm.v.k(new RowLoadingDelegate(), splitBillsSummaryScreen2.S, (RowDelegate) splitBillsSummaryScreen2.Q.getValue(), splitBillsSummaryScreen2.R, splitBillsSummaryScreen2.T, splitBillsSummaryScreen2.V), R$id.splitBillSummary_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                        return (u80.d) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145395x.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                        qd0.b bVarN = ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145381b.f145357g.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 3:
                        KProperty[] kPropertyArr4 = SplitBillsSummaryScreen.Z;
                        return new RowDelegate(new c(splitBillsSummaryScreen, i59), new c(splitBillsSummaryScreen, i32), 4);
                    case 4:
                        KProperty[] kPropertyArr5 = SplitBillsSummaryScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillsSummaryScreen.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        SplitBillInputData splitBillInputData = splitBillsSummaryScreen.K;
                        splitBillInputData.getClass();
                        return new gp9.i(dVar, splitBillsSummaryScreen, splitBillInputData);
                    default:
                        KProperty[] kPropertyArr6 = SplitBillsSummaryScreen.Z;
                        return (y) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145394w.get();
                }
            }
        });
        final int i21 = 5;
        this.Y = w.y0(new Function0(this) { // from class: wp9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillsSummaryScreen f299176b;

            {
                this.f299176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                int i32 = 1;
                int i59 = 0;
                SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299176b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                        SplitBillsSummaryScreen splitBillsSummaryScreen2 = this.f299176b;
                        return tki.g.a(splitBillsSummaryScreen2, splitBillsSummaryScreen2.d(), zhm.v.k(new RowLoadingDelegate(), splitBillsSummaryScreen2.S, (RowDelegate) splitBillsSummaryScreen2.Q.getValue(), splitBillsSummaryScreen2.R, splitBillsSummaryScreen2.T, splitBillsSummaryScreen2.V), R$id.splitBillSummary_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                        return (u80.d) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145395x.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                        qd0.b bVarN = ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145381b.f145357g.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 3:
                        KProperty[] kPropertyArr4 = SplitBillsSummaryScreen.Z;
                        return new RowDelegate(new c(splitBillsSummaryScreen, i59), new c(splitBillsSummaryScreen, i32), 4);
                    case 4:
                        KProperty[] kPropertyArr5 = SplitBillsSummaryScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(splitBillsSummaryScreen.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        SplitBillInputData splitBillInputData = splitBillsSummaryScreen.K;
                        splitBillInputData.getClass();
                        return new gp9.i(dVar, splitBillsSummaryScreen, splitBillInputData);
                    default:
                        KProperty[] kPropertyArr6 = SplitBillsSummaryScreen.Z;
                        return (y) ((gp9.i) splitBillsSummaryScreen.X.getValue()).f145394w.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e0 uiState = (e0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ep9.c cVarD3 = d3();
        r rVar = uiState.f299181b;
        c0 c0Var = rVar.f299196a;
        Clause clause = rVar.d;
        int i = e.f299177a[c0Var.ordinal()];
        if (i == 1) {
            LargeActionButton splitBillSummarySubmitButton = cVarD3.e;
            Intrinsics.checkNotNullExpressionValue(splitBillSummarySubmitButton, "splitBillSummarySubmitButton");
            splitBillSummarySubmitButton.setVisibility(8);
        } else if (i == 2) {
            LargeActionButton splitBillSummarySubmitButton2 = cVarD3.e;
            Intrinsics.checkNotNullExpressionValue(splitBillSummarySubmitButton2, "splitBillSummarySubmitButton");
            splitBillSummarySubmitButton2.setVisibility(0);
            cVarD3.e.setEnabled(true);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton splitBillSummarySubmitButton3 = cVarD3.e;
            Intrinsics.checkNotNullExpressionValue(splitBillSummarySubmitButton3, "splitBillSummarySubmitButton");
            splitBillSummarySubmitButton3.setVisibility(0);
            cVarD3.e.setEnabled(false);
        }
        FooterTextView footerTextView = cVarD3.f128125b;
        LargeActionButton splitBillSummarySelectionButton = cVarD3.d;
        footerTextView.setTextClause(clause);
        FooterTextView splitBillSummaryFooterView = cVarD3.f128125b;
        Intrinsics.checkNotNullExpressionValue(splitBillSummaryFooterView, "splitBillSummaryFooterView");
        splitBillSummaryFooterView.setVisibility(clause != null ? 0 : 8);
        cVarD3.f128126c.setMenuItems(rVar.f299198c);
        int i2 = e.f299178b[rVar.f299197b.ordinal()];
        if (i2 == 1) {
            Intrinsics.checkNotNullExpressionValue(splitBillSummarySelectionButton, "splitBillSummarySelectionButton");
            splitBillSummarySelectionButton.setVisibility(8);
        } else if (i2 == 2) {
            Intrinsics.checkNotNullExpressionValue(splitBillSummarySelectionButton, "splitBillSummarySelectionButton");
            splitBillSummarySelectionButton.setVisibility(0);
            splitBillSummarySelectionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_checkbox_off, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(splitBillSummarySelectionButton, "splitBillSummarySelectionButton");
            splitBillSummarySelectionButton.setVisibility(0);
            splitBillSummarySelectionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_checkbox_on, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c cVar = (c) d();
        SplitBillInputData splitBillInputData = cVar.v;
        if (splitBillInputData.f79200g) {
            cVar.C2(bp9.e.f17566a);
        }
        if (splitBillInputData.f79200g) {
            return true;
        }
        return super.F2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ep9.c cVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = cVarD3.f128126c;
        SplitBillInputData splitBillInputData = this.K;
        navBarWithToolbar.setTitle(splitBillInputData.f79199c, null);
        navBarWithToolbar.setToolbarTitle(splitBillInputData.f79199c);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionClickable(au0.c0.TEXT_AND_ICON);
        LargeActionButton largeActionButton = cVarD3.e;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        largeActionButton.o(defaultFilledButton);
        largeActionButton.setText(splitBillInputData.d);
        cVarD3.d.o(defaultFilledButton);
        ((j60.a) ((i) this.X.getValue()).f.get()).d(u.c(this.U));
    }

    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        efm.r rVarDistinctUntilChanged = this.P.filter(new x(new wp5.w(1), 3)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new n(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f128126c.o.f57403b), null, new n(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f128126c.f59410q), null, new m(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new m(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new m(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.R.r(), new wp5.w(2))), null, new n(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f53515c.f121375b), null, new n(this, continuation, 4), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.i.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52372j.f121375b), null, new wp9.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new wp9.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52707c), null, new wp9.j(this, null), 3);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).k), null, new wp9.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53226s), null, new m(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.U.f53218h, new wp5.w(3))), null, new n(this, continuation, 0), 3);
    }

    public final ep9.c d3() {
        ViewBinding value = this.W.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ep9.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final y R2() {
        return (y) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.M.getValue();
    }
}
