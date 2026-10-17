package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate.NewTaxRateScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jd1.k;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.l;
import ld1.p;
import ld1.r;
import sji.b;
import te0.w;
import v78.d;
import vc.s;
import ve1.c;
import ve1.e;
import ve1.f;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/new_tax_rate/NewTaxRateScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lve1/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewTaxRateScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60815b0 = {o0.f186429a.j(new h0(NewTaxRateScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenNewTaxRateBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final InputTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f60816a0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenNewTaxRateBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.newTaxRateScreen_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.newTaxRateScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.newTaxRateScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new k(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public NewTaxRateScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_new_tax_rate;
        this.V = R$id.newTaxRateScreen_recyclerView;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ve1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTaxRateScreen f288102b;

            {
                this.f288102b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NewTaxRateScreen newTaxRateScreen = this.f288102b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewTaxRateScreen.f60815b0;
                        qji.b bVarQ2 = newTaxRateScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate.di.NewTaxRateScreenInjector");
                        p pVar = (p) bVarQ2;
                        l lVar = pVar.f193985a;
                        p pVar2 = pVar.f193986b;
                        r rVar = new r();
                        int i3 = 0;
                        rVar.f193991a = e4m.b.b(new ld1.q(lVar, pVar2, rVar, 1, i3));
                        rVar.f193992b = e4m.b.b(new ld1.q(lVar, pVar2, rVar, 0, i3));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = NewTaxRateScreen.f60815b0;
                        return (e) ((r) newTaxRateScreen.X.getValue()).f193992b.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ve1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTaxRateScreen f288102b;

            {
                this.f288102b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NewTaxRateScreen newTaxRateScreen = this.f288102b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewTaxRateScreen.f60815b0;
                        qji.b bVarQ2 = newTaxRateScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate.di.NewTaxRateScreenInjector");
                        p pVar = (p) bVarQ2;
                        l lVar = pVar.f193985a;
                        p pVar2 = pVar.f193986b;
                        r rVar = new r();
                        int i3 = 0;
                        rVar.f193991a = e4m.b.b(new ld1.q(lVar, pVar2, rVar, 1, i3));
                        rVar.f193992b = e4m.b.b(new ld1.q(lVar, pVar2, rVar, 0, i3));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = NewTaxRateScreen.f60815b0;
                        return (e) ((r) newTaxRateScreen.X.getValue()).f193992b.get();
                }
            }
        });
        InputTextDelegate inputTextDelegate = new InputTextDelegate(new d(28));
        this.Z = inputTextDelegate;
        this.f60816a0 = u.c(inputTextDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f172934b.setEnabled(uiState.f288106b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f172935c.f59410q), null, new ve1.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f172934b.o), null, new ve1.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.e.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f172935c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_new_tax_rate_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f172934b.setText(new TextLocalisedClause(R$string.product_catalogue_common_action_add, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f172934b.setEnabled(uiState.f288106b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF60816a0() {
        return this.f60816a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final k g3() {
        ViewBinding value = this.W.getValue(this, f60815b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.U;
    }
}
