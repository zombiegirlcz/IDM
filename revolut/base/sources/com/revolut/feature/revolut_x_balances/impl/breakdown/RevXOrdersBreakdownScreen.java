package com.revolut.feature.revolut_x_balances.impl.breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreen;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pt5.r;
import te0.w;
import u4c.b;
import u4c.d;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolut_x_balances/impl/breakdown/RevXOrdersBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu4c/d;", "Lpt5/r;", "feature_retail_revolut_x_balances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevXOrdersBreakdownScreen extends ViewController<q> implements a, r {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(RevXOrdersBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final RevXOrdersBreakdownScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Lazy O;
    public final Lazy P;
    public final Lazy Q;
    public final RowDelegate R;
    public final Object S;
    public final ListSubheaderDelegate T;
    public final Object U;
    public final Object V;

    public RevXOrdersBreakdownScreen(RevXOrdersBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: u4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevXOrdersBreakdownScreen f277308b;

            {
                this.f277308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevXOrdersBreakdownScreen revXOrdersBreakdownScreen = this.f277308b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevXOrdersBreakdownScreen.W;
                        return (e) ((x4c.a) revXOrdersBreakdownScreen.V.getValue()).f302849j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevXOrdersBreakdownScreen.W;
                        return new SwipeToActionDelegate(revXOrdersBreakdownScreen.R, true);
                    case 2:
                        KProperty[] kPropertyArr3 = RevXOrdersBreakdownScreen.W;
                        RevXOrdersBreakdownScreen revXOrdersBreakdownScreen2 = this.f277308b;
                        return dli.f.a(revXOrdersBreakdownScreen2, (e) revXOrdersBreakdownScreen2.N.getValue(), v.k((CellDetailsActionDelegate) revXOrdersBreakdownScreen2.O.getValue(), (CellDetailsDelegate) revXOrdersBreakdownScreen2.P.getValue(), (LargeActionButtonDelegate) revXOrdersBreakdownScreen2.Q.getValue(), revXOrdersBreakdownScreen2.R, (SwipeToActionDelegate) revXOrdersBreakdownScreen2.S.getValue(), revXOrdersBreakdownScreen2.T, new RowLoadingDelegate()), revXOrdersBreakdownScreen2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = RevXOrdersBreakdownScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(revXOrdersBreakdownScreen.m2()).a().get(x4c.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x4c.b.class, " is not found"));
                        }
                        x4c.b bVar = ((x4c.b) aVar2.b()).f302853g;
                        RevXOrdersBreakdownScreenContract$InputData revXOrdersBreakdownScreenContract$InputData = revXOrdersBreakdownScreen.K;
                        revXOrdersBreakdownScreenContract$InputData.getClass();
                        return new x4c.a(bVar, revXOrdersBreakdownScreen, revXOrdersBreakdownScreenContract$InputData);
                }
            }
        });
        this.O = j.b(new ty.a(21));
        this.P = j.b(new ty.a(22));
        this.Q = j.b(new ty.a(23));
        this.R = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: u4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevXOrdersBreakdownScreen f277308b;

            {
                this.f277308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevXOrdersBreakdownScreen revXOrdersBreakdownScreen = this.f277308b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevXOrdersBreakdownScreen.W;
                        return (e) ((x4c.a) revXOrdersBreakdownScreen.V.getValue()).f302849j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevXOrdersBreakdownScreen.W;
                        return new SwipeToActionDelegate(revXOrdersBreakdownScreen.R, true);
                    case 2:
                        KProperty[] kPropertyArr3 = RevXOrdersBreakdownScreen.W;
                        RevXOrdersBreakdownScreen revXOrdersBreakdownScreen2 = this.f277308b;
                        return dli.f.a(revXOrdersBreakdownScreen2, (e) revXOrdersBreakdownScreen2.N.getValue(), v.k((CellDetailsActionDelegate) revXOrdersBreakdownScreen2.O.getValue(), (CellDetailsDelegate) revXOrdersBreakdownScreen2.P.getValue(), (LargeActionButtonDelegate) revXOrdersBreakdownScreen2.Q.getValue(), revXOrdersBreakdownScreen2.R, (SwipeToActionDelegate) revXOrdersBreakdownScreen2.S.getValue(), revXOrdersBreakdownScreen2.T, new RowLoadingDelegate()), revXOrdersBreakdownScreen2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = RevXOrdersBreakdownScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(revXOrdersBreakdownScreen.m2()).a().get(x4c.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x4c.b.class, " is not found"));
                        }
                        x4c.b bVar = ((x4c.b) aVar2.b()).f302853g;
                        RevXOrdersBreakdownScreenContract$InputData revXOrdersBreakdownScreenContract$InputData = revXOrdersBreakdownScreen.K;
                        revXOrdersBreakdownScreenContract$InputData.getClass();
                        return new x4c.a(bVar, revXOrdersBreakdownScreen, revXOrdersBreakdownScreenContract$InputData);
                }
            }
        });
        this.T = new ListSubheaderDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: u4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevXOrdersBreakdownScreen f277308b;

            {
                this.f277308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevXOrdersBreakdownScreen revXOrdersBreakdownScreen = this.f277308b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevXOrdersBreakdownScreen.W;
                        return (e) ((x4c.a) revXOrdersBreakdownScreen.V.getValue()).f302849j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevXOrdersBreakdownScreen.W;
                        return new SwipeToActionDelegate(revXOrdersBreakdownScreen.R, true);
                    case 2:
                        KProperty[] kPropertyArr3 = RevXOrdersBreakdownScreen.W;
                        RevXOrdersBreakdownScreen revXOrdersBreakdownScreen2 = this.f277308b;
                        return dli.f.a(revXOrdersBreakdownScreen2, (e) revXOrdersBreakdownScreen2.N.getValue(), v.k((CellDetailsActionDelegate) revXOrdersBreakdownScreen2.O.getValue(), (CellDetailsDelegate) revXOrdersBreakdownScreen2.P.getValue(), (LargeActionButtonDelegate) revXOrdersBreakdownScreen2.Q.getValue(), revXOrdersBreakdownScreen2.R, (SwipeToActionDelegate) revXOrdersBreakdownScreen2.S.getValue(), revXOrdersBreakdownScreen2.T, new RowLoadingDelegate()), revXOrdersBreakdownScreen2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = RevXOrdersBreakdownScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(revXOrdersBreakdownScreen.m2()).a().get(x4c.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x4c.b.class, " is not found"));
                        }
                        x4c.b bVar = ((x4c.b) aVar2.b()).f302853g;
                        RevXOrdersBreakdownScreenContract$InputData revXOrdersBreakdownScreenContract$InputData = revXOrdersBreakdownScreen.K;
                        revXOrdersBreakdownScreenContract$InputData.getClass();
                        return new x4c.a(bVar, revXOrdersBreakdownScreen, revXOrdersBreakdownScreenContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: u4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevXOrdersBreakdownScreen f277308b;

            {
                this.f277308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RevXOrdersBreakdownScreen revXOrdersBreakdownScreen = this.f277308b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevXOrdersBreakdownScreen.W;
                        return (e) ((x4c.a) revXOrdersBreakdownScreen.V.getValue()).f302849j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevXOrdersBreakdownScreen.W;
                        return new SwipeToActionDelegate(revXOrdersBreakdownScreen.R, true);
                    case 2:
                        KProperty[] kPropertyArr3 = RevXOrdersBreakdownScreen.W;
                        RevXOrdersBreakdownScreen revXOrdersBreakdownScreen2 = this.f277308b;
                        return dli.f.a(revXOrdersBreakdownScreen2, (e) revXOrdersBreakdownScreen2.N.getValue(), v.k((CellDetailsActionDelegate) revXOrdersBreakdownScreen2.O.getValue(), (CellDetailsDelegate) revXOrdersBreakdownScreen2.P.getValue(), (LargeActionButtonDelegate) revXOrdersBreakdownScreen2.Q.getValue(), revXOrdersBreakdownScreen2.R, (SwipeToActionDelegate) revXOrdersBreakdownScreen2.S.getValue(), revXOrdersBreakdownScreen2.T, new RowLoadingDelegate()), revXOrdersBreakdownScreen2.d3().d.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = RevXOrdersBreakdownScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(revXOrdersBreakdownScreen.m2()).a().get(x4c.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x4c.b.class, " is not found"));
                        }
                        x4c.b bVar = ((x4c.b) aVar2.b()).f302853g;
                        RevXOrdersBreakdownScreenContract$InputData revXOrdersBreakdownScreenContract$InputData = revXOrdersBreakdownScreen.K;
                        revXOrdersBreakdownScreenContract$InputData.getClass();
                        return new x4c.a(bVar, revXOrdersBreakdownScreen, revXOrdersBreakdownScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174514c.setHeaderModel(uiState.f277313b);
        d3().f174513b.setModel(uiState.f277314c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x4c.a) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u4c.e) this.N.getValue();
    }

    @Override // pt5.r
    public final efm.r S() {
        return ((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b;
    }

    @Override // pt5.r
    public final efm.r T() {
        return this.R.f53218h;
    }

    @Override // pt5.r
    public final efm.r U() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174513b.f), null, new u07.b(this, null, 8), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    @Override // pt5.r
    public final efm.r h0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r i0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r j1() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
