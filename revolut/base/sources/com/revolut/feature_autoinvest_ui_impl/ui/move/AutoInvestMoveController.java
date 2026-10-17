package com.revolut.feature_autoinvest_ui_impl.ui.move;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ew1.d;
import ewh.b;
import ewh.c;
import ewh.g;
import ewh.i;
import ewh.p;
import grl.k9;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_autoinvest_ui_impl/ui/move/AutoInvestMoveController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_autoinvest_ui_api/navigation/AutoInvestMoveControllerApi$Result;", "Ldli/a;", "Lewh/p;", "Lno/m;", "feature_autoinvest_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoInvestMoveController extends ViewController<AutoInvestMoveControllerApi$Result> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AutoInvestMoveController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final int L;
    public final h M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AutoInvestMoveController(AutoInvestMoveScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        yvh.h hVar = inputData.f96624a.e;
        int i = hVar == null ? -1 : g.f130269a[hVar.ordinal()];
        final int i2 = 1;
        k9 k9Var = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? k9.ProductUnspecified : k9.RoboAdvisor : k9.RevPoints : k9.Savings : k9.Crypto : k9.Donations;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new LargeActionButtonDelegate();
        final int i3 = 0;
        this.O = w.y0(new Function0(this) { // from class: ewh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoInvestMoveController f130262b;

            {
                this.f130262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = AutoInvestMoveController.R;
                        int i5 = R$id.navBarBottomSheet_RecyclerView;
                        AutoInvestMoveController autoInvestMoveController = this.f130262b;
                        return dli.f.a(autoInvestMoveController, (i) autoInvestMoveController.P.getValue(), zhm.v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), autoInvestMoveController.N), i5, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AutoInvestMoveController.R;
                        return (i) ((dwh.b) this.f130262b.Q.getValue()).d.get();
                }
            }
        });
        this.P = w.y0(new Function0(this) { // from class: ewh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoInvestMoveController f130262b;

            {
                this.f130262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AutoInvestMoveController.R;
                        int i5 = R$id.navBarBottomSheet_RecyclerView;
                        AutoInvestMoveController autoInvestMoveController = this.f130262b;
                        return dli.f.a(autoInvestMoveController, (i) autoInvestMoveController.P.getValue(), zhm.v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), autoInvestMoveController.N), i5, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AutoInvestMoveController.R;
                        return (i) ((dwh.b) this.f130262b.Q.getValue()).d.get();
                }
            }
        });
        this.Q = w.y0(new eq8.b(this, inputData, 16));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f130278a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dwh.b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new c(this, null), 3);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((n) value).f174542b.F), new d(this, null, 6), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
