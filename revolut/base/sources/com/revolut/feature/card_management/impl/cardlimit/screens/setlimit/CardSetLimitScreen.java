package com.revolut.feature.card_management.impl.cardlimit.screens.setlimit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreen;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import pqc.k;
import pz2.d;
import pz2.i;
import pz2.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardlimit/screens/setlimit/CardSetLimitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lpz2/i;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSetLimitScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardSetLimitScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CardSetLimitScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final h Q;

    public CardSetLimitScreen(CardSetLimitScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSetLimitScreen f240869b;

            {
                this.f240869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardSetLimitScreen cardSetLimitScreen = this.f240869b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardSetLimitScreen.R;
                        qji.b bVarU2 = cardSetLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.di.CardSetLimitInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardSetLimitScreenContract$InputData cardSetLimitScreenContract$InputData = cardSetLimitScreen.K;
                        cardSetLimitScreenContract$InputData.getClass();
                        return new lz2.d(aVar, bVar2, cardSetLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSetLimitScreen.R;
                        return (n) ((lz2.d) cardSetLimitScreen.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardSetLimitScreen.R;
                        return new CenteredAmountDelegate(new pu4.d(cardSetLimitScreen, 13));
                    default:
                        KProperty[] kPropertyArr4 = CardSetLimitScreen.R;
                        CardSetLimitScreen cardSetLimitScreen2 = this.f240869b;
                        return dli.f.a(cardSetLimitScreen2, (n) cardSetLimitScreen2.M.getValue(), u.c((CenteredAmountDelegate) cardSetLimitScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSetLimitScreen f240869b;

            {
                this.f240869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardSetLimitScreen cardSetLimitScreen = this.f240869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSetLimitScreen.R;
                        qji.b bVarU2 = cardSetLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.di.CardSetLimitInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardSetLimitScreenContract$InputData cardSetLimitScreenContract$InputData = cardSetLimitScreen.K;
                        cardSetLimitScreenContract$InputData.getClass();
                        return new lz2.d(aVar, bVar2, cardSetLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSetLimitScreen.R;
                        return (n) ((lz2.d) cardSetLimitScreen.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardSetLimitScreen.R;
                        return new CenteredAmountDelegate(new pu4.d(cardSetLimitScreen, 13));
                    default:
                        KProperty[] kPropertyArr4 = CardSetLimitScreen.R;
                        CardSetLimitScreen cardSetLimitScreen2 = this.f240869b;
                        return dli.f.a(cardSetLimitScreen2, (n) cardSetLimitScreen2.M.getValue(), u.c((CenteredAmountDelegate) cardSetLimitScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: pz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSetLimitScreen f240869b;

            {
                this.f240869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardSetLimitScreen cardSetLimitScreen = this.f240869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSetLimitScreen.R;
                        qji.b bVarU2 = cardSetLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.di.CardSetLimitInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardSetLimitScreenContract$InputData cardSetLimitScreenContract$InputData = cardSetLimitScreen.K;
                        cardSetLimitScreenContract$InputData.getClass();
                        return new lz2.d(aVar, bVar2, cardSetLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSetLimitScreen.R;
                        return (n) ((lz2.d) cardSetLimitScreen.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardSetLimitScreen.R;
                        return new CenteredAmountDelegate(new pu4.d(cardSetLimitScreen, 13));
                    default:
                        KProperty[] kPropertyArr4 = CardSetLimitScreen.R;
                        CardSetLimitScreen cardSetLimitScreen2 = this.f240869b;
                        return dli.f.a(cardSetLimitScreen2, (n) cardSetLimitScreen2.M.getValue(), u.c((CenteredAmountDelegate) cardSetLimitScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.O = w.y0(new Function0(this) { // from class: pz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSetLimitScreen f240869b;

            {
                this.f240869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardSetLimitScreen cardSetLimitScreen = this.f240869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSetLimitScreen.R;
                        qji.b bVarU2 = cardSetLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.di.CardSetLimitInjector");
                        lz2.b bVar = (lz2.b) bVarU2;
                        lz2.a aVar = bVar.f200903b;
                        lz2.b bVar2 = bVar.f200904c;
                        CardSetLimitScreenContract$InputData cardSetLimitScreenContract$InputData = cardSetLimitScreen.K;
                        cardSetLimitScreenContract$InputData.getClass();
                        return new lz2.d(aVar, bVar2, cardSetLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSetLimitScreen.R;
                        return (n) ((lz2.d) cardSetLimitScreen.L.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardSetLimitScreen.R;
                        return new CenteredAmountDelegate(new pu4.d(cardSetLimitScreen, 13));
                    default:
                        KProperty[] kPropertyArr4 = CardSetLimitScreen.R;
                        CardSetLimitScreen cardSetLimitScreen2 = this.f240869b;
                        return dli.f.a(cardSetLimitScreen2, (n) cardSetLimitScreen2.M.getValue(), u.c((CenteredAmountDelegate) cardSetLimitScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        this.Q = s.t(this, d.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f240876b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lz2.d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (n) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_limit_header, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_limit_header, null, null, 14));
        l.A(R.string.card_limit_edit_action_set, null, null, 14, d3().f174564b);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new pvk.i(rd0.e.b(d3().f174565c.f59410q), 3), new pvk.i(rd0.e.b(((CenteredAmountDelegate) this.N.getValue()).d.f121375b), 4), new pvk.i(rd0.e.b(d3().f174564b.o), 5)), new k(this, null, 24), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
