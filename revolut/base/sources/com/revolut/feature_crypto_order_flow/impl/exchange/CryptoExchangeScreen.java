package com.revolut.feature_crypto_order_flow.impl.exchange;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.f;
import aw0.j8;
import aw0.n6;
import cli.o;
import cli.q;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.impl.R$id;
import com.revolut.feature_crypto_order_flow.impl.R$layout;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.RatesSourceContext;
import grl.g0;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import org.jmrtd.lds.LDSFile;
import rd0.e;
import te0.w;
import uyh.i;
import uyh.n;
import uyh.p;
import vc.s;
import vkm.z1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luyh/n;", "Ldli/a;", "Luyh/p;", "Lin0/g;", "Lno/k;", "Lxyh/g;", "Lkyh/c;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeScreen extends ViewController<n> implements dli.a, g, k, xyh.g, kyh.c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CryptoExchangeScreen.class, "binding", "getBinding()Lcom/revolut/feature_crypto_order_flow/impl/databinding/ScreenCryptoExchangeBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final z1 R;
    public nqi.a S;
    public final CenteredAmountDelegate T;
    public AnalyticsContext U;
    public final int V;
    public final h W;

    public CryptoExchangeScreen(CryptoExchangeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new uj7.a(this, inputData, 25));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeScreen f284349b;

            {
                this.f284349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoExchangeScreen cryptoExchangeScreen = this.f284349b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoExchangeScreen.X;
                        qd0.b bVarN = ((tyh.d) cryptoExchangeScreen.K.getValue()).f275610c.e.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoExchangeScreen.X;
                        return (o) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275616n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoExchangeScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275612h.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoExchangeScreen.X;
                        CryptoExchangeScreen cryptoExchangeScreen2 = this.f284349b;
                        return dli.f.a(cryptoExchangeScreen2, cryptoExchangeScreen2.R2(), zhm.v.k(cryptoExchangeScreen2.T, (CellDetailsActionDelegate) cryptoExchangeScreen2.N.getValue(), (CellDetailsDelegate) cryptoExchangeScreen2.O.getValue()), R$id.crypto_exchange_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeScreen f284349b;

            {
                this.f284349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoExchangeScreen cryptoExchangeScreen = this.f284349b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoExchangeScreen.X;
                        qd0.b bVarN = ((tyh.d) cryptoExchangeScreen.K.getValue()).f275610c.e.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoExchangeScreen.X;
                        return (o) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275616n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoExchangeScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275612h.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoExchangeScreen.X;
                        CryptoExchangeScreen cryptoExchangeScreen2 = this.f284349b;
                        return dli.f.a(cryptoExchangeScreen2, cryptoExchangeScreen2.R2(), zhm.v.k(cryptoExchangeScreen2.T, (CellDetailsActionDelegate) cryptoExchangeScreen2.N.getValue(), (CellDetailsDelegate) cryptoExchangeScreen2.O.getValue()), R$id.crypto_exchange_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new ux7.g(2));
        this.O = w.y0(new ux7.g(3));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: uyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeScreen f284349b;

            {
                this.f284349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoExchangeScreen cryptoExchangeScreen = this.f284349b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoExchangeScreen.X;
                        qd0.b bVarN = ((tyh.d) cryptoExchangeScreen.K.getValue()).f275610c.e.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoExchangeScreen.X;
                        return (o) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275616n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoExchangeScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275612h.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoExchangeScreen.X;
                        CryptoExchangeScreen cryptoExchangeScreen2 = this.f284349b;
                        return dli.f.a(cryptoExchangeScreen2, cryptoExchangeScreen2.R2(), zhm.v.k(cryptoExchangeScreen2.T, (CellDetailsActionDelegate) cryptoExchangeScreen2.N.getValue(), (CellDetailsDelegate) cryptoExchangeScreen2.O.getValue()), R$id.crypto_exchange_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: uyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeScreen f284349b;

            {
                this.f284349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoExchangeScreen cryptoExchangeScreen = this.f284349b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoExchangeScreen.X;
                        qd0.b bVarN = ((tyh.d) cryptoExchangeScreen.K.getValue()).f275610c.e.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoExchangeScreen.X;
                        return (o) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275616n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoExchangeScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((tyh.d) cryptoExchangeScreen.K.getValue()).f275612h.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoExchangeScreen.X;
                        CryptoExchangeScreen cryptoExchangeScreen2 = this.f284349b;
                        return dli.f.a(cryptoExchangeScreen2, cryptoExchangeScreen2.R2(), zhm.v.k(cryptoExchangeScreen2.T, (CellDetailsActionDelegate) cryptoExchangeScreen2.N.getValue(), (CellDetailsDelegate) cryptoExchangeScreen2.O.getValue()), R$id.crypto_exchange_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = ta6.a.a(0);
        this.T = new CenteredAmountDelegate(new umd.n(this, 22));
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
        aVarNewBuilder.h(g0.CRYPTO);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.U = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.V = R$layout.screen_crypto_exchange;
        this.W = s.t(this, uyh.b.f);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView actionFooterView = d3().f240839c;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        actionFooterView.setModel(new aw0.g(new n6(null, defaultFilledButton, new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.cryptobuysell_order_type_select_title, null, null, 14), LDSFile.EF_DG4_TAG), null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.cryptobuysell_editor_review_order, null, null, 14), defaultFilledButton, null, null, uiState.f284388b, null, null, 988), (Clause) null, f.SMALL_PRIMARY_BUTTON, 8));
        j8 j8Var = uiState.f284389c;
        NavBarWithAvatar cryptoExchangeNavBarWithAvatar = d3().f240838b;
        Intrinsics.checkNotNullExpressionValue(cryptoExchangeNavBarWithAvatar, "cryptoExchangeNavBarWithAvatar");
        cryptoExchangeNavBarWithAvatar.setModel(j8Var);
        ((KeyboardSuggestionsControllerExtension) this.P.getValue()).S("legacy_source_id", uiState.d);
    }

    @Override // kyh.c
    public final vkm.d C1() {
        return e.b(this.T.f.f121375b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (tyh.d) this.K.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f240838b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) this.P.getValue();
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
        aVarNewBuilder.h(g0.CRYPTO);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        AnalyticsContext analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        keyboardSuggestionsControllerExtension.getClass();
        Intrinsics.checkNotNullParameter("legacy_source_id", "sourceId");
        keyboardSuggestionsControllerExtension.d.put("legacy_source_id", analyticsContext);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((KeyboardSuggestionsControllerExtension) this.P.getValue()).S("legacy_source_id", f0.f322471a);
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pyh.a aVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, e.b(aVarD3.f240838b.f59338a), new uyh.e(this, continuation, 0), 3);
        ViewController.P2(this, e.b(aVarD3.f240838b.f59343j), new uyh.e(this, continuation, 1), 3);
        ViewController.P2(this, e.b(aVarD3.f240839c.f58955g), new uyh.e(this, continuation, 2), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.T;
        ViewController.P2(this, vkm.q.J(e.b(centeredAmountDelegate.f51965h.f121375b), e.b(centeredAmountDelegate.i.f121375b)), new uyh.f(this, null), 3);
        ViewController.P2(this, e.b(centeredAmountDelegate.e.f121375b), new uyh.g(this, null), 3);
        ViewController.P2(this, this.R, new uyh.h(this, null), 3);
        ViewController.P2(this, e.b(((CellDetailsActionDelegate) this.N.getValue()).d), new i(this, null), 3);
        ViewController.P2(this, new tnb.k(((KeyboardSuggestionsControllerExtension) this.P.getValue()).R("legacy_source_id"), 15), new up2.q(this, continuation, 17), 3);
    }

    public final pyh.a d3() {
        ViewBinding value = this.W.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (pyh.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final uyh.o R2() {
        return (uyh.o) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
