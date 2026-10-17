package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.TermsAndConditionsScreen;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.p0;
import qgk.z1;
import rlh.c;
import rm0.k;
import rmk.d;
import rmk.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/termsandconditions/screen/TermsAndConditionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrmk/e;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TermsAndConditionsScreen extends BaseRecyclerViewScreen<e, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103588a0 = {o0.f186429a.j(new h0(TermsAndConditionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final List Z;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TermsAndConditionsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, a.f);
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: rmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsScreen f255349b;

            {
                this.f255349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TermsAndConditionsScreen termsAndConditionsScreen = this.f255349b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsScreen.f103588a0;
                        qji.b bVarQ2 = termsAndConditionsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.di.TermsAndConditionsScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new z1(p0Var.f246187a, p0Var.f246188b);
                    default:
                        KProperty[] kPropertyArr2 = TermsAndConditionsScreen.f103588a0;
                        return (d) ((z1) termsAndConditionsScreen.W.getValue()).f246354c.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: rmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsScreen f255349b;

            {
                this.f255349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TermsAndConditionsScreen termsAndConditionsScreen = this.f255349b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsScreen.f103588a0;
                        qji.b bVarQ2 = termsAndConditionsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.termsandconditions.screen.di.TermsAndConditionsScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new z1(p0Var.f246187a, p0Var.f246188b);
                    default:
                        KProperty[] kPropertyArr2 = TermsAndConditionsScreen.f103588a0;
                        return (d) ((z1) termsAndConditionsScreen.W.getValue()).f246354c.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new k(2));
        this.Y = lazyY0;
        this.Z = v.k((RowDelegate) lazyY0.getValue(), new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (z1) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, f103588a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Y.getValue()).f53218h), null, new rmk.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.V.getValue(this, f103588a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.plan_manage_screen_terms_and_conditions_link, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.plan_manage_screen_terms_and_conditions_link, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92190a0() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }
}
