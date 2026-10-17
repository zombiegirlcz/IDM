package com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw7.b;
import dw7.d;
import dw7.f;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.c;
import lu7.s;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/card_claims/CardClaimsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldw7/f;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardClaimsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardClaimsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CardClaimsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public CardClaimsScreen(CardClaimsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardClaimsScreen f120337b;

            {
                this.f120337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardClaimsScreen cardClaimsScreen = this.f120337b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardClaimsScreen.R;
                        CardClaimsScreen cardClaimsScreen2 = this.f120337b;
                        return dli.f.a(cardClaimsScreen2, (h) cardClaimsScreen2.Q.getValue(), v.k(cardClaimsScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardClaimsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardClaimsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CardClaimsScreenContract$InputData cardClaimsScreenContract$InputData = cardClaimsScreen.K;
                        cardClaimsScreenContract$InputData.getClass();
                        return new lu7.c(sVar, cardClaimsScreen, cardClaimsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardClaimsScreen.R;
                        return (h) ((lu7.c) cardClaimsScreen.P.getValue()).f.get();
                }
            }
        });
        this.O = vc.s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: dw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardClaimsScreen f120337b;

            {
                this.f120337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardClaimsScreen cardClaimsScreen = this.f120337b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardClaimsScreen.R;
                        CardClaimsScreen cardClaimsScreen2 = this.f120337b;
                        return dli.f.a(cardClaimsScreen2, (h) cardClaimsScreen2.Q.getValue(), v.k(cardClaimsScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardClaimsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardClaimsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CardClaimsScreenContract$InputData cardClaimsScreenContract$InputData = cardClaimsScreen.K;
                        cardClaimsScreenContract$InputData.getClass();
                        return new lu7.c(sVar, cardClaimsScreen, cardClaimsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardClaimsScreen.R;
                        return (h) ((lu7.c) cardClaimsScreen.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: dw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardClaimsScreen f120337b;

            {
                this.f120337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardClaimsScreen cardClaimsScreen = this.f120337b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardClaimsScreen.R;
                        CardClaimsScreen cardClaimsScreen2 = this.f120337b;
                        return dli.f.a(cardClaimsScreen2, (h) cardClaimsScreen2.Q.getValue(), v.k(cardClaimsScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CardClaimsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardClaimsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CardClaimsScreenContract$InputData cardClaimsScreenContract$InputData = cardClaimsScreen.K;
                        cardClaimsScreenContract$InputData.getClass();
                        return new lu7.c(sVar, cardClaimsScreen, cardClaimsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardClaimsScreen.R;
                        return (h) ((lu7.c) cardClaimsScreen.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f120339a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f120340b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(uiState.f120341c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (dw7.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new dw7.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new dw7.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
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
