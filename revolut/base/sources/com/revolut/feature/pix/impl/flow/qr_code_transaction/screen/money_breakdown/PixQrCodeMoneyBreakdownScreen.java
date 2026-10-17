package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.m1;
import p8a.n1;
import te0.w;
import u9a.b;
import uba.d;
import uba.e;
import uba.g;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/screen/money_breakdown/PixQrCodeMoneyBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luba/d;", "Ldli/a;", "Luba/e;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeMoneyBreakdownScreen extends ViewController<d> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PixQrCodeMoneyBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final PixQrCodeMoneyBreakdownScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public PixQrCodeMoneyBreakdownScreen(PixQrCodeMoneyBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new b(6));
        this.M = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: uba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeMoneyBreakdownScreen f278791b;

            {
                this.f278791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen = this.f278791b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeMoneyBreakdownScreen.R;
                        n1 n1Var = (n1) pixQrCodeMoneyBreakdownScreen.Q.getValue();
                        switch (n1Var.f234036a) {
                            case 0:
                                return (g) n1Var.d.get();
                            default:
                                return (g) n1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeMoneyBreakdownScreen.R;
                        PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen2 = this.f278791b;
                        return dli.f.a(pixQrCodeMoneyBreakdownScreen2, (g) pixQrCodeMoneyBreakdownScreen2.N.getValue(), u.c((CellDetailsDelegate) pixQrCodeMoneyBreakdownScreen2.L.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeMoneyBreakdownScreen.R;
                        qji.b bVarU2 = pixQrCodeMoneyBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.di.PixQrCodeMoneyBreakdownScreenInjector");
                        m1 m1Var = (m1) ((vba.a) bVarU2).c().mo3808a(pixQrCodeMoneyBreakdownScreen);
                        PixQrCodeMoneyBreakdownScreenContract$InputData pixQrCodeMoneyBreakdownScreenContract$InputData = pixQrCodeMoneyBreakdownScreen.K;
                        switch (m1Var.f234027a) {
                            case 0:
                                pixQrCodeMoneyBreakdownScreenContract$InputData.getClass();
                                m1Var.d = pixQrCodeMoneyBreakdownScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeMoneyBreakdownScreenContract$InputData.getClass();
                                m1Var.d = pixQrCodeMoneyBreakdownScreenContract$InputData;
                                break;
                        }
                        return (n1) m1Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: uba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeMoneyBreakdownScreen f278791b;

            {
                this.f278791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen = this.f278791b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeMoneyBreakdownScreen.R;
                        n1 n1Var = (n1) pixQrCodeMoneyBreakdownScreen.Q.getValue();
                        switch (n1Var.f234036a) {
                            case 0:
                                return (g) n1Var.d.get();
                            default:
                                return (g) n1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeMoneyBreakdownScreen.R;
                        PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen2 = this.f278791b;
                        return dli.f.a(pixQrCodeMoneyBreakdownScreen2, (g) pixQrCodeMoneyBreakdownScreen2.N.getValue(), u.c((CellDetailsDelegate) pixQrCodeMoneyBreakdownScreen2.L.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeMoneyBreakdownScreen.R;
                        qji.b bVarU2 = pixQrCodeMoneyBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.di.PixQrCodeMoneyBreakdownScreenInjector");
                        m1 m1Var = (m1) ((vba.a) bVarU2).c().mo3808a(pixQrCodeMoneyBreakdownScreen);
                        PixQrCodeMoneyBreakdownScreenContract$InputData pixQrCodeMoneyBreakdownScreenContract$InputData = pixQrCodeMoneyBreakdownScreen.K;
                        switch (m1Var.f234027a) {
                            case 0:
                                pixQrCodeMoneyBreakdownScreenContract$InputData.getClass();
                                m1Var.d = pixQrCodeMoneyBreakdownScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeMoneyBreakdownScreenContract$InputData.getClass();
                                m1Var.d = pixQrCodeMoneyBreakdownScreenContract$InputData;
                                break;
                        }
                        return (n1) m1Var.mo3783build();
                }
            }
        });
        this.P = s.t(this, uba.b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeMoneyBreakdownScreen f278791b;

            {
                this.f278791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen = this.f278791b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeMoneyBreakdownScreen.R;
                        n1 n1Var = (n1) pixQrCodeMoneyBreakdownScreen.Q.getValue();
                        switch (n1Var.f234036a) {
                            case 0:
                                return (g) n1Var.d.get();
                            default:
                                return (g) n1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeMoneyBreakdownScreen.R;
                        PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen2 = this.f278791b;
                        return dli.f.a(pixQrCodeMoneyBreakdownScreen2, (g) pixQrCodeMoneyBreakdownScreen2.N.getValue(), u.c((CellDetailsDelegate) pixQrCodeMoneyBreakdownScreen2.L.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeMoneyBreakdownScreen.R;
                        qji.b bVarU2 = pixQrCodeMoneyBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.di.PixQrCodeMoneyBreakdownScreenInjector");
                        m1 m1Var = (m1) ((vba.a) bVarU2).c().mo3808a(pixQrCodeMoneyBreakdownScreen);
                        PixQrCodeMoneyBreakdownScreenContract$InputData pixQrCodeMoneyBreakdownScreenContract$InputData = pixQrCodeMoneyBreakdownScreen.K;
                        switch (m1Var.f234027a) {
                            case 0:
                                pixQrCodeMoneyBreakdownScreenContract$InputData.getClass();
                                m1Var.d = pixQrCodeMoneyBreakdownScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeMoneyBreakdownScreenContract$InputData.getClass();
                                m1Var.d = pixQrCodeMoneyBreakdownScreenContract$InputData;
                                break;
                        }
                        return (n1) m1Var.mo3783build();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_transaction_review_amount_breakdown_title, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.pix_transaction_review_cta_button_got_it, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new u07.b(this, null, 22), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
