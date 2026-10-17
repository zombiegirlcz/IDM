package com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.InvestmentGoalsScreen;
import java.util.List;
import jii.u;
import jm4.o3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kyk.e;
import pwb.p;
import pzk.b;
import pzk.c;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/investment_goals/investment_goals_screen/InvestmentGoalsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpzk/c;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lpzk/b;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestmentGoalsScreen extends BaseRecyclerViewScreen<c, IOData$EmptyInput, b> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f104185a0 = {o0.f186429a.j(new h0(InvestmentGoalsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public InvestmentGoalsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, a.f);
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = true;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: pzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentGoalsScreen f241010b;

            {
                this.f241010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestmentGoalsScreen investmentGoalsScreen = this.f241010b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentGoalsScreen.f104185a0;
                        qji.b bVarQ2 = investmentGoalsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.di.InvestmentGoalsScreenComponent.InvestmentGoalsScreenInjector");
                        kyk.e eVar = new kyk.e();
                        eVar.f190935a = e4m.b.b(new o3(eVar, 1, 28));
                        eVar.f190936b = e4m.b.b(new o3(eVar, 0, 28));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr2 = InvestmentGoalsScreen.f104185a0;
                        return (e) ((kyk.e) investmentGoalsScreen.X.getValue()).f190936b.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: pzk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentGoalsScreen f241010b;

            {
                this.f241010b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestmentGoalsScreen investmentGoalsScreen = this.f241010b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentGoalsScreen.f104185a0;
                        qji.b bVarQ2 = investmentGoalsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.di.InvestmentGoalsScreenComponent.InvestmentGoalsScreenInjector");
                        kyk.e eVar = new kyk.e();
                        eVar.f190935a = e4m.b.b(new o3(eVar, 1, 28));
                        eVar.f190936b = e4m.b.b(new o3(eVar, 0, 28));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr2 = InvestmentGoalsScreen.f104185a0;
                        return (e) ((kyk.e) investmentGoalsScreen.X.getValue()).f190936b.get();
                }
            }
        });
        this.Z = w.y0(new pni.a(21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (pzk.e) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.f59410q), null, new pnb.b(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174564b.o), null, new p(this, null, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_header_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        g3().f174564b.setText(new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_button, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101870b0() {
        return (List) this.Z.getValue();
    }

    public final u g3() {
        ViewBinding value = this.U.getValue(this, f104185a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
