package com.revolut.feature.credit.application.plugins.impl.ui.debts.hub;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.k;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import com.revolut.feature.credit.core.R$string;
import dw3.y1;
import j60.a;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import wrj.m;
import x5a.d;
import x84.b;
import x84.c;
import x84.f;
import x84.i;
import x84.l;
import x84.n;
import x84.q;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/hub/DebtsHubScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lx84/n;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/hub/DebtsHubScreenContract$InputData;", "Lx84/l;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebtsHubScreen extends PluginRecyclerViewScreen<n, DebtsHubScreenContract$InputData, l> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f67442e0 = {o0.f186429a.j(new h0(DebtsHubScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final int V;
    public final int W;
    public final FullScreenStateDelegate X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f67443a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f67444b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final h f67445d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebtsHubScreen(DebtsHubScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_credit_recycler_navbar_twinbuttons;
        this.W = R$id.creditApplication_recyclerView;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.X = fullScreenStateDelegate;
        Lazy lazyY0 = w.y0(new d(12));
        this.Y = lazyY0;
        final int i = 0;
        Lazy lazyY02 = w.y0(new Function0(this) { // from class: x84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtsHubScreen f303279b;

            {
                this.f303279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DebtsHubScreen debtsHubScreen = this.f303279b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DebtsHubScreen.f67442e0;
                        return new SwipeToActionDelegate((RowDelegate) debtsHubScreen.Y.getValue(), false);
                    default:
                        KProperty[] kPropertyArr2 = DebtsHubScreen.f67442e0;
                        return (m) ((y1) debtsHubScreen.f67443a0.getValue()).f120198h.get();
                }
            }
        });
        this.Z = lazyY02;
        this.f67443a0 = w.y0(new m(this, inputData, 19));
        final int i2 = 1;
        this.f67444b0 = w.y0(new Function0(this) { // from class: x84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtsHubScreen f303279b;

            {
                this.f303279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DebtsHubScreen debtsHubScreen = this.f303279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DebtsHubScreen.f67442e0;
                        return new SwipeToActionDelegate((RowDelegate) debtsHubScreen.Y.getValue(), false);
                    default:
                        KProperty[] kPropertyArr2 = DebtsHubScreen.f67442e0;
                        return (m) ((y1) debtsHubScreen.f67443a0.getValue()).f120198h.get();
                }
            }
        });
        this.c0 = v.k((RowDelegate) lazyY0.getValue(), (SwipeToActionDelegate) lazyY02.getValue(), fullScreenStateDelegate, new RowLoadingDelegate());
        this.f67445d0 = s.t(this, b.f);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        q qVar = (q) T2();
        a aVar = qVar.f303291r;
        if (aVar.j()) {
            a.v(aVar, true, null, 2);
        } else {
            qVar.v2(i.f303282a);
        }
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        n uiState = (n) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinVerticalButton twinVerticalButton = g3().d;
        boolean z = uiState.f303285a;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (y1) this.f67443a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f10698b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        Continuation continuation = null;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new c(this, continuation, 0), 3);
        TwinVerticalButton twinVerticalButton = g3().d;
        twinVerticalButton.setCollapsible(false);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_primary_action_text, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_secondary_action_text, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.o0()), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.p0()), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SwipeToActionDelegate) this.Z.getValue()).f), null, new x84.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.Y.getValue()).f53218h), null, new x84.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f52371h.f121375b), null, new f(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        n uiState = (n) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinVerticalButton twinVerticalButton = g3().d;
        boolean z = uiState.f303285a;
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setSecondaryButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final k g3() {
        ViewBinding value = this.f67445d0.getValue(this, f67442e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final x84.m T2() {
        return (x84.m) this.f67444b0.getValue();
    }
}
