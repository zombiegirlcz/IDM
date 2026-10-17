package com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration;

import a08.b;
import a2f.c;
import a2f.d;
import a2f.g;
import a2f.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.R$id;
import com.revolut.feature.trade_rev_points.impl.R$layout;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import t1f.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/account_registration/TradeRevPointsAccountRegistrationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La2f/g;", "Ldli/a;", "La2f/i;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsAccountRegistrationScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TradeRevPointsAccountRegistrationScreen.class, "binding", "getBinding()Lcom/revolut/feature/trade_rev_points/impl/databinding/ScreenTradeRevPointsAccountRegistrationBinding;", 0))};
    public final TradeRevPointsAccountRegistrationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public TradeRevPointsAccountRegistrationScreen(TradeRevPointsAccountRegistrationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_trade_rev_points_account_registration;
        this.M = w.y0(new b(19));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: a2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountRegistrationScreen f806b;

            {
                this.f806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen = this.f806b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountRegistrationScreen.R;
                        TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen2 = this.f806b;
                        return dli.f.a(tradeRevPointsAccountRegistrationScreen2, tradeRevPointsAccountRegistrationScreen2.R2(), u.c((InputTextDelegate) tradeRevPointsAccountRegistrationScreen2.M.getValue()), R$id.tradeRevPointsAccountRegistration_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationScreen.R;
                        qji.b bVarU2 = tradeRevPointsAccountRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.di.TradeRevPointsAccountRegistrationScreenInjector");
                        return (t1f.n) ((b2f.a) ((b2f.b) bVarU2).b().mo3808a(tradeRevPointsAccountRegistrationScreen)).f(tradeRevPointsAccountRegistrationScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsAccountRegistrationScreen.R;
                        t1f.n nVar = (t1f.n) tradeRevPointsAccountRegistrationScreen.P.getValue();
                        switch (nVar.f267330a) {
                            case 0:
                                return (h) nVar.d.get();
                            default:
                                return (h) nVar.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, a2f.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: a2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountRegistrationScreen f806b;

            {
                this.f806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen = this.f806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountRegistrationScreen.R;
                        TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen2 = this.f806b;
                        return dli.f.a(tradeRevPointsAccountRegistrationScreen2, tradeRevPointsAccountRegistrationScreen2.R2(), u.c((InputTextDelegate) tradeRevPointsAccountRegistrationScreen2.M.getValue()), R$id.tradeRevPointsAccountRegistration_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationScreen.R;
                        qji.b bVarU2 = tradeRevPointsAccountRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.di.TradeRevPointsAccountRegistrationScreenInjector");
                        return (t1f.n) ((b2f.a) ((b2f.b) bVarU2).b().mo3808a(tradeRevPointsAccountRegistrationScreen)).f(tradeRevPointsAccountRegistrationScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsAccountRegistrationScreen.R;
                        t1f.n nVar = (t1f.n) tradeRevPointsAccountRegistrationScreen.P.getValue();
                        switch (nVar.f267330a) {
                            case 0:
                                return (h) nVar.d.get();
                            default:
                                return (h) nVar.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: a2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountRegistrationScreen f806b;

            {
                this.f806b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen = this.f806b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountRegistrationScreen.R;
                        TradeRevPointsAccountRegistrationScreen tradeRevPointsAccountRegistrationScreen2 = this.f806b;
                        return dli.f.a(tradeRevPointsAccountRegistrationScreen2, tradeRevPointsAccountRegistrationScreen2.R2(), u.c((InputTextDelegate) tradeRevPointsAccountRegistrationScreen2.M.getValue()), R$id.tradeRevPointsAccountRegistration_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationScreen.R;
                        qji.b bVarU2 = tradeRevPointsAccountRegistrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.di.TradeRevPointsAccountRegistrationScreenInjector");
                        return (t1f.n) ((b2f.a) ((b2f.b) bVarU2).b().mo3808a(tradeRevPointsAccountRegistrationScreen)).f(tradeRevPointsAccountRegistrationScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsAccountRegistrationScreen.R;
                        t1f.n nVar = (t1f.n) tradeRevPointsAccountRegistrationScreen.P.getValue();
                        switch (nVar.f267330a) {
                            case 0:
                                return (h) nVar.d.get();
                            default:
                                return (h) nVar.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().d.setEnabled(uiState.e);
        d3().f241434b.setTextClause(uiState.f814b);
        d3().f241435c.setDescriptionText(uiState.f);
        NavBarWithToolbar navBarWithToolbar = d3().f241435c;
        Clause textClause = uiState.f815c;
        navBarWithToolbar.setTitle(textClause, null);
        if (textClause == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        navBarWithToolbar.setToolbarTitle(textClause);
        String str = uiState.d;
        navBarWithToolbar.setEndIconImage(str != null ? new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090) : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f241435c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().d;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.trade_rev_points_common_next_button_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("REGISTER_ACCOUNT_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f241435c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f241434b.f58608l), null, new c(this, continuation, 2), 3);
    }

    public final q1f.b d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q1f.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final a2f.h R2() {
        return (a2f.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
