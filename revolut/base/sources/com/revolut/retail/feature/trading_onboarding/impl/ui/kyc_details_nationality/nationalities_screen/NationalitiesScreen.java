package com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreen;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyk.j;
import no.m;
import rch.o;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import vge.z1;
import vkm.q;
import vmf.k;
import vzk.b;
import vzk.c;
import vzk.d;
import vzk.f;
import vzk.l;
import vzk.n;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/nationalities_screen/NationalitiesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvzk/n;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/nationalities_screen/NationalitiesScreenContract$InputData;", "Lvzk/l;", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NationalitiesScreen extends BaseRecyclerViewScreen<n, NationalitiesScreenContract$InputData, l> implements m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f104198h0 = {o0.f186429a.j(new h0(NationalitiesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final h U;
    public final RowDelegate V;
    public final ListSubheaderDelegate W;
    public final FullScreenStateDelegate X;
    public final TextDelegate Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f104199a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f104200b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f104201d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f104202e0;
    public final Object f0;
    public final AnalyticsProduct g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NationalitiesScreen(NationalitiesScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new RowDelegate(null, null, 7);
        this.W = new ListSubheaderDelegate();
        this.X = new FullScreenStateDelegate();
        this.Y = new TextDelegate();
        this.Z = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.f104199a0 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
        this.f104200b0 = true;
        final int i = 0;
        this.c0 = w.y0(new Function0(this) { // from class: vzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalitiesScreen f293546b;

            {
                this.f293546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NationalitiesScreen nationalitiesScreen = this.f293546b;
                switch (i2) {
                    case 0:
                        return zhm.v.k(nationalitiesScreen.V, new RowLoadingDelegate(), nationalitiesScreen.W, nationalitiesScreen.X, nationalitiesScreen.Y);
                    case 1:
                        KProperty[] kPropertyArr = NationalitiesScreen.f104198h0;
                        return (j60.a) ((kyk.j) nationalitiesScreen.f104202e0.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = NationalitiesScreen.f104198h0;
                        return (m) ((kyk.j) nationalitiesScreen.f104202e0.getValue()).f190952g.get();
                }
            }
        });
        final int i2 = 1;
        this.f104201d0 = w.y0(new Function0(this) { // from class: vzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalitiesScreen f293546b;

            {
                this.f293546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NationalitiesScreen nationalitiesScreen = this.f293546b;
                switch (i22) {
                    case 0:
                        return zhm.v.k(nationalitiesScreen.V, new RowLoadingDelegate(), nationalitiesScreen.W, nationalitiesScreen.X, nationalitiesScreen.Y);
                    case 1:
                        KProperty[] kPropertyArr = NationalitiesScreen.f104198h0;
                        return (j60.a) ((kyk.j) nationalitiesScreen.f104202e0.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = NationalitiesScreen.f104198h0;
                        return (m) ((kyk.j) nationalitiesScreen.f104202e0.getValue()).f190952g.get();
                }
            }
        });
        this.f104202e0 = w.y0(new vqd.b(this, inputData, 20));
        final int i3 = 2;
        this.f0 = w.y0(new Function0(this) { // from class: vzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalitiesScreen f293546b;

            {
                this.f293546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NationalitiesScreen nationalitiesScreen = this.f293546b;
                switch (i22) {
                    case 0:
                        return zhm.v.k(nationalitiesScreen.V, new RowLoadingDelegate(), nationalitiesScreen.W, nationalitiesScreen.X, nationalitiesScreen.Y);
                    case 1:
                        KProperty[] kPropertyArr = NationalitiesScreen.f104198h0;
                        return (j60.a) ((kyk.j) nationalitiesScreen.f104202e0.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = NationalitiesScreen.f104198h0;
                        return (m) ((kyk.j) nationalitiesScreen.f104202e0.getValue()).f190952g.get();
                }
            }
        });
        this.g0 = inputData.f104203a.getE();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getK() {
        return this.g0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.f104202e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(h3().e.f59410q), null, new z1(this, null, 24), 3);
        LargeActionButton largeActionButton = h3().f174557b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        a.g2(this, e.b(largeActionButton.o), null, new k(this, null, 17), 3);
        RowDelegate rowDelegate = this.V;
        a.g2(this, e.b(rowDelegate.f53220l), null, new c(2, 0, vzk.m.class, T2(), "onRowItemActionClick", "onRowItemActionClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), 3);
        a.g2(this, e.b(rowDelegate.f53218h), null, new d(2, 0, vzk.m.class, T2(), "onRowItemClick", "onRowItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), 3);
        a.g2(this, e.b(this.W.f52707c), null, new vzk.e(2, 0, vzk.m.class, T2(), "onSubheaderClick", "onSubheaderClick(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), 3);
        a.g2(this, e.b(this.X.f52371h.f121375b), null, new f(2, 0, vzk.m.class, T2(), "onFullScreenActionClicked", "onFullScreenActionClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), 3);
        a.g2(this, q.J(e.b(this.Y.d), e.b(h3().f174558c.f58608l)), null, new o(2, T2(), vzk.m.class, "onClauseClick", "onClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 18), 3);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        NationalitiesScreenContract$InputData nationalitiesScreenContract$InputData = (NationalitiesScreenContract$InputData) this.G;
        TextLocalisedClause textLocalisedClause = nationalitiesScreenContract$InputData.f104204b ? new TextLocalisedClause(R$string.wealth_trading_onboarding_kyc_nationalities_header_title, null, null, 14) : new TextLocalisedClause(R$string.wealth_trading_onboarding_kyc_nationality_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(nationalitiesScreenContract$InputData.f104204b ? j0.MULTILINE : j0.DEFAULT);
        navBarWithToolbar.setSecondDescriptionText(nationalitiesScreenContract$InputData.f104204b ? new TextLocalisedClause(R$string.wealth_trading_onboarding_kyc_nationalities_header_subtitle, null, null, 14) : new TextLocalisedClause(R$string.wealth_trading_onboarding_kyc_nationality_header_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        ((j60.a) this.f104201d0.getValue()).d(u.c(this.V));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101870b0() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.f104199a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(n uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174557b;
        vzk.k kVar = uiState.f293556a;
        largeActionButton.setText(kVar.f293552a);
        largeActionButton.setEnabled(kVar.f293553b);
        FooterTextView footerTextView = h3().f174558c;
        Clause clause = uiState.f293557b;
        if (clause != null) {
            footerTextView.setTextClause(clause);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.Z;
    }

    public final jii.s h3() {
        ViewBinding value = this.U.getValue(this, f104198h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final vzk.m T2() {
        return (vzk.m) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f104200b0);
    }
}
