package com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bi2.n;
import bpe.b;
import bpe.c;
import bpe.e;
import bpe.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.PayStampDutyScreen;
import com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.PayStampDutyScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/stamp_duty/ui/pay/PayStampDutyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbpe/e;", "Ldli/a;", "Lbpe/h;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayStampDutyScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PayStampDutyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetTwinVerticalButtonBinding;", 0))};
    public final PayStampDutyScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PayStampDutyScreen(PayStampDutyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_twin_vertical_button;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayStampDutyScreen f17610b;

            {
                this.f17610b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayStampDutyScreen payStampDutyScreen = this.f17610b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayStampDutyScreen.Q;
                        PayStampDutyScreen payStampDutyScreen2 = this.f17610b;
                        return dli.f.a(payStampDutyScreen2, (g) payStampDutyScreen2.P.getValue(), f0.f322471a, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PayStampDutyScreen.Q;
                        qji.b bVarU2 = payStampDutyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.di.PayStampDutyScreenInjector");
                        voe.d dVar = (voe.d) bVarU2;
                        voe.c cVar = dVar.f290956b;
                        voe.d dVar2 = dVar.f290957c;
                        PayStampDutyScreenContract$InputData payStampDutyScreenContract$InputData = payStampDutyScreen.K;
                        payStampDutyScreenContract$InputData.getClass();
                        return new voe.a(cVar, dVar2, payStampDutyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PayStampDutyScreen.Q;
                        return (g) ((voe.a) payStampDutyScreen.O.getValue()).f290946b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayStampDutyScreen f17610b;

            {
                this.f17610b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayStampDutyScreen payStampDutyScreen = this.f17610b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayStampDutyScreen.Q;
                        PayStampDutyScreen payStampDutyScreen2 = this.f17610b;
                        return dli.f.a(payStampDutyScreen2, (g) payStampDutyScreen2.P.getValue(), f0.f322471a, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PayStampDutyScreen.Q;
                        qji.b bVarU2 = payStampDutyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.di.PayStampDutyScreenInjector");
                        voe.d dVar = (voe.d) bVarU2;
                        voe.c cVar = dVar.f290956b;
                        voe.d dVar2 = dVar.f290957c;
                        PayStampDutyScreenContract$InputData payStampDutyScreenContract$InputData = payStampDutyScreen.K;
                        payStampDutyScreenContract$InputData.getClass();
                        return new voe.a(cVar, dVar2, payStampDutyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PayStampDutyScreen.Q;
                        return (g) ((voe.a) payStampDutyScreen.O.getValue()).f290946b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: bpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayStampDutyScreen f17610b;

            {
                this.f17610b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayStampDutyScreen payStampDutyScreen = this.f17610b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayStampDutyScreen.Q;
                        PayStampDutyScreen payStampDutyScreen2 = this.f17610b;
                        return dli.f.a(payStampDutyScreen2, (g) payStampDutyScreen2.P.getValue(), f0.f322471a, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PayStampDutyScreen.Q;
                        qji.b bVarU2 = payStampDutyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.di.PayStampDutyScreenInjector");
                        voe.d dVar = (voe.d) bVarU2;
                        voe.c cVar = dVar.f290956b;
                        voe.d dVar2 = dVar.f290957c;
                        PayStampDutyScreenContract$InputData payStampDutyScreenContract$InputData = payStampDutyScreen.K;
                        payStampDutyScreenContract$InputData.getClass();
                        return new voe.a(cVar, dVar2, payStampDutyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PayStampDutyScreen.Q;
                        return (g) ((voe.a) payStampDutyScreen.O.getValue()).f290946b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        bpe.h uiState = (bpe.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174548b.setHeaderModel(uiState.f17615a);
        d3().d.setMainButtonText(uiState.f17616b);
        d3().d.setSecondaryButtonText(new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_cta_back, null, null, 14));
        d3().d.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (voe.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174549c.setVisibility(8);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174548b.F), null, new n(this, null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o0()), null, new c(this, null, 0), 3);
        d3().d.setMainButtonLoadingTag("PAY_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.p0()), null, new c(this, null, 1), 3);
    }

    public final p d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
