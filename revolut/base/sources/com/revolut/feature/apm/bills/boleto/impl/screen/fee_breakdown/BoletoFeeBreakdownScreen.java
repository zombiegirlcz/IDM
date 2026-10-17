package com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.BoletoFeeBreakdownScreen;
import com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.BoletoFeeBreakdownScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kl7.w0;
import kn1.b;
import kn1.d;
import kn1.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import sm1.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/screen/fee_breakdown/BoletoFeeBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lkn1/d;", "Lno/d1;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BoletoFeeBreakdownScreen extends ViewController<Object> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BoletoFeeBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BoletoFeeBreakdownScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public BoletoFeeBreakdownScreen(BoletoFeeBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new w0(8));
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: kn1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFeeBreakdownScreen f185969b;

            {
                this.f185969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BoletoFeeBreakdownScreen boletoFeeBreakdownScreen = this.f185969b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoFeeBreakdownScreen.R;
                        return (f) ((sm1.e) boletoFeeBreakdownScreen.Q.getValue()).f264321c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoFeeBreakdownScreen.R;
                        BoletoFeeBreakdownScreen boletoFeeBreakdownScreen2 = this.f185969b;
                        return dli.f.a(boletoFeeBreakdownScreen2, (f) boletoFeeBreakdownScreen2.N.getValue(), u.c((CellDetailsDelegate) boletoFeeBreakdownScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletoFeeBreakdownScreen.R;
                        qji.b bVarU2 = boletoFeeBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.di.BoletoFeeBreakdownScreenInjector");
                        i iVar = (i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        i iVar2 = iVar.f264331c;
                        BoletoFeeBreakdownScreenContract$InputData boletoFeeBreakdownScreenContract$InputData = boletoFeeBreakdownScreen.K;
                        boletoFeeBreakdownScreenContract$InputData.getClass();
                        return new sm1.e(dVar, iVar2, boletoFeeBreakdownScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: kn1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFeeBreakdownScreen f185969b;

            {
                this.f185969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BoletoFeeBreakdownScreen boletoFeeBreakdownScreen = this.f185969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoFeeBreakdownScreen.R;
                        return (f) ((sm1.e) boletoFeeBreakdownScreen.Q.getValue()).f264321c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoFeeBreakdownScreen.R;
                        BoletoFeeBreakdownScreen boletoFeeBreakdownScreen2 = this.f185969b;
                        return dli.f.a(boletoFeeBreakdownScreen2, (f) boletoFeeBreakdownScreen2.N.getValue(), u.c((CellDetailsDelegate) boletoFeeBreakdownScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletoFeeBreakdownScreen.R;
                        qji.b bVarU2 = boletoFeeBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.di.BoletoFeeBreakdownScreenInjector");
                        i iVar = (i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        i iVar2 = iVar.f264331c;
                        BoletoFeeBreakdownScreenContract$InputData boletoFeeBreakdownScreenContract$InputData = boletoFeeBreakdownScreen.K;
                        boletoFeeBreakdownScreenContract$InputData.getClass();
                        return new sm1.e(dVar, iVar2, boletoFeeBreakdownScreenContract$InputData);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: kn1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFeeBreakdownScreen f185969b;

            {
                this.f185969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BoletoFeeBreakdownScreen boletoFeeBreakdownScreen = this.f185969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoFeeBreakdownScreen.R;
                        return (f) ((sm1.e) boletoFeeBreakdownScreen.Q.getValue()).f264321c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoFeeBreakdownScreen.R;
                        BoletoFeeBreakdownScreen boletoFeeBreakdownScreen2 = this.f185969b;
                        return dli.f.a(boletoFeeBreakdownScreen2, (f) boletoFeeBreakdownScreen2.N.getValue(), u.c((CellDetailsDelegate) boletoFeeBreakdownScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletoFeeBreakdownScreen.R;
                        qji.b bVarU2 = boletoFeeBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.di.BoletoFeeBreakdownScreenInjector");
                        i iVar = (i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        i iVar2 = iVar.f264331c;
                        BoletoFeeBreakdownScreenContract$InputData boletoFeeBreakdownScreenContract$InputData = boletoFeeBreakdownScreen.K;
                        boletoFeeBreakdownScreenContract$InputData.getClass();
                        return new sm1.e(dVar, iVar2, boletoFeeBreakdownScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sm1.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_fee_breakdown_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
