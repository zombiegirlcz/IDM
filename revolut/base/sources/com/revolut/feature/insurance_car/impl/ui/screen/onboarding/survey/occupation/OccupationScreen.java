package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation.OccupationScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nl7.e;
import no.m;
import ql7.t;
import ql7.v0;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import xp7.c;
import xp7.d;
import xp7.f;
import xp7.g;
import xp7.i;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/occupation/OccupationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxp7/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lxp7/f;", "Lno/m;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OccupationScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, f> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(OccupationScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenButtonWithFooterBinding;", 0))};
    public final /* synthetic */ zl7.a U;
    public final int V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputTextDelegate f75641a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75642b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/insurance_car/impl/databinding/ScreenButtonWithFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return e.a(p0);
        }
    }

    public OccupationScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = zl7.a.f323190a;
        this.V = R$layout.screen_button_with_footer;
        this.W = s.t(this, a.f);
        this.X = R$id.buttonWithFooter_recyclerView;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: xp7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationScreen f307889b;

            {
                this.f307889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OccupationScreen occupationScreen = this.f307889b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OccupationScreen.c0;
                        qji.b bVarQ2 = occupationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation.di.OccupationScreenInjector");
                        v0 v0Var = new v0();
                        v0Var.f247495a = e4m.b.b(e4m.c.a(occupationScreen));
                        v0Var.f247496b = e4m.b.b(new t(v0Var, 3, 8));
                        v0Var.f247497c = e4m.b.b(new t(v0Var, 2, 8));
                        v0Var.d = e4m.b.b(new t(v0Var, 1, 8));
                        v0Var.e = e4m.b.b(new t(v0Var, 0, 8));
                        v0Var.f = e4m.b.b(new t(v0Var, 4, 8));
                        v0Var.f247498g = e4m.b.b(new t(v0Var, 6, 8));
                        v0Var.f247499h = e4m.b.b(new t(v0Var, 5, 8));
                        return v0Var;
                    default:
                        KProperty[] kPropertyArr2 = OccupationScreen.c0;
                        return (i) ((v0) occupationScreen.Y.getValue()).f247499h.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: xp7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationScreen f307889b;

            {
                this.f307889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OccupationScreen occupationScreen = this.f307889b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OccupationScreen.c0;
                        qji.b bVarQ2 = occupationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation.di.OccupationScreenInjector");
                        v0 v0Var = new v0();
                        v0Var.f247495a = e4m.b.b(e4m.c.a(occupationScreen));
                        v0Var.f247496b = e4m.b.b(new t(v0Var, 3, 8));
                        v0Var.f247497c = e4m.b.b(new t(v0Var, 2, 8));
                        v0Var.d = e4m.b.b(new t(v0Var, 1, 8));
                        v0Var.e = e4m.b.b(new t(v0Var, 0, 8));
                        v0Var.f = e4m.b.b(new t(v0Var, 4, 8));
                        v0Var.f247498g = e4m.b.b(new t(v0Var, 6, 8));
                        v0Var.f247499h = e4m.b.b(new t(v0Var, 5, 8));
                        return v0Var;
                    default:
                        KProperty[] kPropertyArr2 = OccupationScreen.c0;
                        return (i) ((v0) occupationScreen.Y.getValue()).f247499h.get();
                }
            }
        });
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f75641a0 = inputTextDelegate;
        this.f75642b0 = u.c(inputTextDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        e eVarG3 = g3();
        eVarG3.f217057b.setButtonEnabled(uiState.f307894c);
        eVarG3.f217057b.setDescription(uiState.f307893b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(zl7.a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (v0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f217058c.f59410q), null, new xp7.b(this, continuation, 0), 3);
        InputTextDelegate inputTextDelegate = this.f75641a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.i.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f217057b.f0()), null, new xp7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f217057b.i), null, new xp7.b(this, continuation, 2), 3);
        FooterActionButtonView buttonWithFooterButton = g3().f217057b;
        Intrinsics.checkNotNullExpressionValue(buttonWithFooterButton, "buttonWithFooterButton");
        if (!buttonWithFooterButton.isLaidOut() || buttonWithFooterButton.isLayoutRequested()) {
            buttonWithFooterButton.addOnLayoutChangeListener(new cli.u(this, 19));
            return;
        }
        ScreenContentRecyclerView buttonWithFooterRecyclerView = g3().d;
        Intrinsics.checkNotNullExpressionValue(buttonWithFooterRecyclerView, "buttonWithFooterRecyclerView");
        knm.b.v(buttonWithFooterButton.getHeight(), buttonWithFooterRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f217058c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_question_occupation_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.car_insurance_question_occupation_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f217057b.setButtonText(new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        g uiState = (g) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        e eVarG3 = g3();
        eVarG3.f217057b.setButtonEnabled(uiState.f307894c);
        eVarG3.f217057b.setDescription(uiState.f307893b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF75642b0() {
        return this.f75642b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final e g3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }
}
