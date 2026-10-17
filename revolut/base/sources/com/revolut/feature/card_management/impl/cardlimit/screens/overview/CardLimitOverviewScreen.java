package com.revolut.feature.card_management.impl.cardlimit.screens.overview;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreen;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import ihm.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lz2.c;
import njj.n;
import nz2.d;
import nz2.i;
import nz2.j;
import nz2.k;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardlimit/screens/overview/CardLimitOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnz2/i;", "Ldli/a;", "Lnz2/k;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardLimitOverviewScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CardLimitOverviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CardLimitOverviewScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final RowDelegate N;
    public final LimitProgressBarWithTextDelegate O;
    public final Object P;
    public final int Q;
    public final h R;

    public CardLimitOverviewScreen(CardLimitOverviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitOverviewScreen f220936b;

            {
                this.f220936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardLimitOverviewScreen cardLimitOverviewScreen = this.f220936b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardLimitOverviewScreen.S;
                        qji.b bVarU2 = cardLimitOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.overview.di.CardLimitOverviewInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardLimitOverviewScreenContract$InputData cardLimitOverviewScreenContract$InputData = cardLimitOverviewScreen.K;
                        cardLimitOverviewScreenContract$InputData.getClass();
                        return new lz2.c(aVar, bVar2, cardLimitOverviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardLimitOverviewScreen.S;
                        return (j) ((lz2.c) cardLimitOverviewScreen.L.getValue()).f200907c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardLimitOverviewScreen.S;
                        CardLimitOverviewScreen cardLimitOverviewScreen2 = this.f220936b;
                        return dli.f.a(cardLimitOverviewScreen2, (j) cardLimitOverviewScreen2.M.getValue(), v.k(cardLimitOverviewScreen2.N, cardLimitOverviewScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitOverviewScreen f220936b;

            {
                this.f220936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardLimitOverviewScreen cardLimitOverviewScreen = this.f220936b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardLimitOverviewScreen.S;
                        qji.b bVarU2 = cardLimitOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.overview.di.CardLimitOverviewInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardLimitOverviewScreenContract$InputData cardLimitOverviewScreenContract$InputData = cardLimitOverviewScreen.K;
                        cardLimitOverviewScreenContract$InputData.getClass();
                        return new lz2.c(aVar, bVar2, cardLimitOverviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardLimitOverviewScreen.S;
                        return (j) ((lz2.c) cardLimitOverviewScreen.L.getValue()).f200907c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardLimitOverviewScreen.S;
                        CardLimitOverviewScreen cardLimitOverviewScreen2 = this.f220936b;
                        return dli.f.a(cardLimitOverviewScreen2, (j) cardLimitOverviewScreen2.M.getValue(), v.k(cardLimitOverviewScreen2.N, cardLimitOverviewScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new RowDelegate(null, null, 7);
        this.O = new LimitProgressBarWithTextDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: nz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitOverviewScreen f220936b;

            {
                this.f220936b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardLimitOverviewScreen cardLimitOverviewScreen = this.f220936b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardLimitOverviewScreen.S;
                        qji.b bVarU2 = cardLimitOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.overview.di.CardLimitOverviewInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardLimitOverviewScreenContract$InputData cardLimitOverviewScreenContract$InputData = cardLimitOverviewScreen.K;
                        cardLimitOverviewScreenContract$InputData.getClass();
                        return new lz2.c(aVar, bVar2, cardLimitOverviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardLimitOverviewScreen.S;
                        return (j) ((lz2.c) cardLimitOverviewScreen.L.getValue()).f200907c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardLimitOverviewScreen.S;
                        CardLimitOverviewScreen cardLimitOverviewScreen2 = this.f220936b;
                        return dli.f.a(cardLimitOverviewScreen2, (j) cardLimitOverviewScreen2.M.getValue(), v.k(cardLimitOverviewScreen2.N, cardLimitOverviewScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar;
        this.R = s.t(this, d.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_spending_limit_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_spending_limit_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R.string.card_spending_limit_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, vkm.q.J(new n(rd0.e.b(((m) value).f174539b.f59410q), 22), new n(rd0.e.b(this.N.f53225r), 23), new n(rd0.e.b((f) this.O.f52641c.getValue()), 24)), new nwc.f(this, null, 8), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
