package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.b0;
import c7b.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import dli.a;
import dze.n;
import e18.i;
import e7b.b;
import e7b.c;
import e7b.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_type/CobrandedCardsTypeSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc7b/k;", "Ldli/a;", "Le7b/f;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsTypeSelectionScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CobrandedCardsTypeSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CobrandedCardsTypeSelectionScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CobrandedCardsTypeSelectionScreen(CobrandedCardsTypeSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new i(22));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsTypeSelectionScreen f123145b;

            {
                this.f123145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen = this.f123145b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsTypeSelectionScreen.R;
                        CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen2 = this.f123145b;
                        return dli.f.a(cobrandedCardsTypeSelectionScreen2, (e) cobrandedCardsTypeSelectionScreen2.Q.getValue(), u.c((RowDelegate) cobrandedCardsTypeSelectionScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsTypeSelectionScreen.R;
                        qji.b bVarU2 = cobrandedCardsTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.di.CobrandedCardsTypeSelectionScreenInjector");
                        b0 b0Var = (b0) ((f7b.b) bVarU2).c().mo3808a(cobrandedCardsTypeSelectionScreen);
                        CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = cobrandedCardsTypeSelectionScreen.K;
                        switch (b0Var.f12567a) {
                            case 0:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                            case 1:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                        }
                        return (f7b.a) b0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsTypeSelectionScreen.R;
                        return ((f7b.a) cobrandedCardsTypeSelectionScreen.P.getValue()).a();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsTypeSelectionScreen f123145b;

            {
                this.f123145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen = this.f123145b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsTypeSelectionScreen.R;
                        CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen2 = this.f123145b;
                        return dli.f.a(cobrandedCardsTypeSelectionScreen2, (e) cobrandedCardsTypeSelectionScreen2.Q.getValue(), u.c((RowDelegate) cobrandedCardsTypeSelectionScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsTypeSelectionScreen.R;
                        qji.b bVarU2 = cobrandedCardsTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.di.CobrandedCardsTypeSelectionScreenInjector");
                        b0 b0Var = (b0) ((f7b.b) bVarU2).c().mo3808a(cobrandedCardsTypeSelectionScreen);
                        CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = cobrandedCardsTypeSelectionScreen.K;
                        switch (b0Var.f12567a) {
                            case 0:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                            case 1:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                        }
                        return (f7b.a) b0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsTypeSelectionScreen.R;
                        return ((f7b.a) cobrandedCardsTypeSelectionScreen.P.getValue()).a();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsTypeSelectionScreen f123145b;

            {
                this.f123145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen = this.f123145b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsTypeSelectionScreen.R;
                        CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen2 = this.f123145b;
                        return dli.f.a(cobrandedCardsTypeSelectionScreen2, (e) cobrandedCardsTypeSelectionScreen2.Q.getValue(), u.c((RowDelegate) cobrandedCardsTypeSelectionScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsTypeSelectionScreen.R;
                        qji.b bVarU2 = cobrandedCardsTypeSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.di.CobrandedCardsTypeSelectionScreenInjector");
                        b0 b0Var = (b0) ((f7b.b) bVarU2).c().mo3808a(cobrandedCardsTypeSelectionScreen);
                        CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = cobrandedCardsTypeSelectionScreen.K;
                        switch (b0Var.f12567a) {
                            case 0:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                            case 1:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsTypeSelectionScreenContract$InputData.getClass();
                                b0Var.d = cobrandedCardsTypeSelectionScreenContract$InputData;
                                break;
                        }
                        return (f7b.a) b0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsTypeSelectionScreen.R;
                        return ((f7b.a) cobrandedCardsTypeSelectionScreen.P.getValue()).a();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f7b.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (e7b.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cobrand_card_type_picker_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new n(this, null, 18), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new c(this, null), 3);
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
