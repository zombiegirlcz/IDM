package com.revolut.feature.insurance_home.impl.ui.screen.product_summary;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qw7.g;
import te0.w;
import vc.s;
import vge.z1;
import vw7.b;
import vw7.c;
import vw7.d;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/ui/screen/product_summary/InsuranceProductSummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvw7/d;", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceProductSummaryScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(InsuranceProductSummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public InsuranceProductSummaryScreen(InsuranceProductSummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceProductSummaryScreen f292648b;

            {
                this.f292648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceProductSummaryScreen.P;
                        InsuranceProductSummaryScreen insuranceProductSummaryScreen = this.f292648b;
                        return dli.f.a(insuranceProductSummaryScreen, (c) insuranceProductSummaryScreen.O.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsuranceProductSummaryScreen.P;
                        return (c) ((g) this.f292648b.N.getValue()).f249821c.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new vqd.b(this, inputData, 17));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceProductSummaryScreen f292648b;

            {
                this.f292648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceProductSummaryScreen.P;
                        InsuranceProductSummaryScreen insuranceProductSummaryScreen = this.f292648b;
                        return dli.f.a(insuranceProductSummaryScreen, (c) insuranceProductSummaryScreen.O.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsuranceProductSummaryScreen.P;
                        return (c) ((g) this.f292648b.N.getValue()).f249821c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174545b;
        Clause clause = uiState.f292650b;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        largeActionButton.setText(clause);
        d3().f174546c.setHeaderModel(uiState.f292651c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174545b.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new z1(this, null, 19), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
