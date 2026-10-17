package com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.l;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund.AirportLoungePassAboutRefundScreen;
import cwi.e1;
import cwi.f1;
import jii.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n14.e;
import pki.b;
import se4.c;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/refund/about_refund/AirportLoungePassAboutRefundScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lcli/l;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassAboutRefundScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(AirportLoungePassAboutRefundScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, o.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return o.a(p0);
        }
    }

    public AirportLoungePassAboutRefundScreen() {
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: syi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassAboutRefundScreen f266672b;

            {
                this.f266672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungePassAboutRefundScreen airportLoungePassAboutRefundScreen = this.f266672b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassAboutRefundScreen.P;
                        return e.a(airportLoungePassAboutRefundScreen, (b) airportLoungePassAboutRefundScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassAboutRefundScreen.P;
                        qji.b bVarU2 = airportLoungePassAboutRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund.di.AirportLoungePassAboutRefundScreenInjector");
                        return (f1) ((e1) ((tyi.a) bVarU2).c().mo3808a(airportLoungePassAboutRefundScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassAboutRefundScreen.P;
                        f1 f1Var = (f1) airportLoungePassAboutRefundScreen.N.getValue();
                        switch (f1Var.f109670a) {
                            case 0:
                                return (b) f1Var.f.get();
                            default:
                                return (b) f1Var.f.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: syi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassAboutRefundScreen f266672b;

            {
                this.f266672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungePassAboutRefundScreen airportLoungePassAboutRefundScreen = this.f266672b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassAboutRefundScreen.P;
                        return e.a(airportLoungePassAboutRefundScreen, (b) airportLoungePassAboutRefundScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassAboutRefundScreen.P;
                        qji.b bVarU2 = airportLoungePassAboutRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund.di.AirportLoungePassAboutRefundScreenInjector");
                        return (f1) ((e1) ((tyi.a) bVarU2).c().mo3808a(airportLoungePassAboutRefundScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassAboutRefundScreen.P;
                        f1 f1Var = (f1) airportLoungePassAboutRefundScreen.N.getValue();
                        switch (f1Var.f109670a) {
                            case 0:
                                return (b) f1Var.f.get();
                            default:
                                return (b) f1Var.f.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: syi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassAboutRefundScreen f266672b;

            {
                this.f266672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungePassAboutRefundScreen airportLoungePassAboutRefundScreen = this.f266672b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassAboutRefundScreen.P;
                        return e.a(airportLoungePassAboutRefundScreen, (b) airportLoungePassAboutRefundScreen.O.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassAboutRefundScreen.P;
                        qji.b bVarU2 = airportLoungePassAboutRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund.di.AirportLoungePassAboutRefundScreenInjector");
                        return (f1) ((e1) ((tyi.a) bVarU2).c().mo3808a(airportLoungePassAboutRefundScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassAboutRefundScreen.P;
                        f1 f1Var = (f1) airportLoungePassAboutRefundScreen.N.getValue();
                        switch (f1Var.f109670a) {
                            case 0:
                                return (b) f1Var.f.get();
                            default:
                                return (b) f1Var.f.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (syi.b) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.airport_lounges_refund_info_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_refund_info_text, null, null, 14), null, null, false, 28));
        d3().f174545b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new c(this, null, 28), 3);
    }

    public final o d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }
}
