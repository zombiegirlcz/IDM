package com.revolut.feature.junior.isa.impl.ui.jisa_national_number;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import t9h.b;
import ta8.c;
import ta8.d;
import ta8.e;
import ta8.f;
import ta8.g;
import ta8.j;
import ta8.k;
import ta8.l;
import ta8.m;
import ta8.n;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_national_number/JuniorIsaNationalNumberScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lta8/n;", "ta8/c", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaNationalNumberScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorIsaNationalNumberScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final JuniorIsaNationalNumberScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorIsaNationalNumberScreen(JuniorIsaNationalNumberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, e.f);
        this.N = new InputTextDelegate(new ta8.a(this, 0));
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ta8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaNationalNumberScreen f269153b;

            {
                this.f269153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen = this.f269153b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaNationalNumberScreen.S;
                        JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen2 = this.f269153b;
                        return dli.f.a(juniorIsaNationalNumberScreen2, juniorIsaNationalNumberScreen2.d(), v.k(juniorIsaNationalNumberScreen2.N, juniorIsaNationalNumberScreen2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaNationalNumberScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaNationalNumberScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaNationalNumberScreenContract$InputData juniorIsaNationalNumberScreenContract$InputData = juniorIsaNationalNumberScreen.K;
                        juniorIsaNationalNumberScreenContract$InputData.getClass();
                        return new x98.n(oVar, juniorIsaNationalNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaNationalNumberScreen.S;
                        return (j) ((x98.n) juniorIsaNationalNumberScreen.Q.getValue()).f303627b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ta8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaNationalNumberScreen f269153b;

            {
                this.f269153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen = this.f269153b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaNationalNumberScreen.S;
                        JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen2 = this.f269153b;
                        return dli.f.a(juniorIsaNationalNumberScreen2, juniorIsaNationalNumberScreen2.d(), v.k(juniorIsaNationalNumberScreen2.N, juniorIsaNationalNumberScreen2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaNationalNumberScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaNationalNumberScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaNationalNumberScreenContract$InputData juniorIsaNationalNumberScreenContract$InputData = juniorIsaNationalNumberScreen.K;
                        juniorIsaNationalNumberScreenContract$InputData.getClass();
                        return new x98.n(oVar, juniorIsaNationalNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaNationalNumberScreen.S;
                        return (j) ((x98.n) juniorIsaNationalNumberScreen.Q.getValue()).f303627b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ta8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaNationalNumberScreen f269153b;

            {
                this.f269153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen = this.f269153b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaNationalNumberScreen.S;
                        JuniorIsaNationalNumberScreen juniorIsaNationalNumberScreen2 = this.f269153b;
                        return dli.f.a(juniorIsaNationalNumberScreen2, juniorIsaNationalNumberScreen2.d(), v.k(juniorIsaNationalNumberScreen2.N, juniorIsaNationalNumberScreen2.O), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaNationalNumberScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaNationalNumberScreen.m2()).a().get(x98.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", x98.o.class, " is not found"));
                        }
                        x98.o oVar = ((x98.o) aVar2.b()).f303638q;
                        JuniorIsaNationalNumberScreenContract$InputData juniorIsaNationalNumberScreenContract$InputData = juniorIsaNationalNumberScreen.K;
                        juniorIsaNationalNumberScreenContract$InputData.getClass();
                        return new x98.n(oVar, juniorIsaNationalNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaNationalNumberScreen.S;
                        return (j) ((x98.n) juniorIsaNationalNumberScreen.Q.getValue()).f303627b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (uiState instanceof m) {
            NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            screenRecyclerNavbarFooterNextbuttonToolbar.I0(t3Var, false);
            LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
            screenRecyclerNavbarFooterNextbuttonButton.setVisibility(8);
            FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
            screenRecyclerNavbarFooterNextbuttonFooterView.setVisibility(8);
            return;
        }
        if (uiState instanceof l) {
            d3().e.l0();
            LargeActionButton screenRecyclerNavbarFooterNextbuttonButton2 = d3().f174557b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton2, "screenRecyclerNavbarFooterNextbuttonButton");
            screenRecyclerNavbarFooterNextbuttonButton2.setVisibility(8);
            FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView2 = d3().f174558c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView2, "screenRecyclerNavbarFooterNextbuttonFooterView");
            screenRecyclerNavbarFooterNextbuttonFooterView2.setVisibility(8);
            return;
        }
        if (!(uiState instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        d3().e.l0();
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView3 = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView3, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView3.setVisibility(this.K.d == s98.a.PROFILE_EDIT ? 0 : 8);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(((k) uiState).f269164b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x98.n) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        c cVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        JuniorIsaNationalNumberScreenContract$InputData juniorIsaNationalNumberScreenContract$InputData = this.K;
        s98.a aVar = juniorIsaNationalNumberScreenContract$InputData.d;
        String str = juniorIsaNationalNumberScreenContract$InputData.f76803b;
        int i = d.f269157a[aVar.ordinal()];
        if (i == 1) {
            cVar = new c(new TextLocalisedClause(R$string.junior_trading_nino_title, null, null, 14), new TextLocalisedClause(R$string.junior_trading_nino_subtitle, v.k(str, new TextLocalisedClause(R$string.junior_trading_nino_subtitle_action, null, new Click(30, (Integer) null, (Object) null, "ITEM_ID_DESCRIPTION_ACTION", false), 10)), null, 12), new TextLocalisedClause(R$string.junior_trading_nino_action_title, null, null, 14));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new c(new TextLocalisedClause(R$string.junior_trading_onboarding_nino_title, u.c(str), null, 12), new TextLocalisedClause(R$string.junior_trading_onboarding_nino_subtitle, null, new Click(30, (Integer) null, (Object) null, "ITEM_ID_DESCRIPTION_ACTION", false), 10), new TextLocalisedClause(R$string.junior_trading_onboarding_nino_action_title, null, null, 14));
        }
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = cVar.f269154a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(cVar.f269155b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(cVar.f269156c);
        largeActionButton.setLoadingButtonTag("SAVE_BUTTON_LOADING_TAG");
        FooterTextView footerTextView = d3().f174558c;
        if (juniorIsaNationalNumberScreenContract$InputData.d != s98.a.PROFILE_EDIT) {
            footerTextView.setVisibility(8);
        } else {
            footerTextView.setContent(new c7(new TextLocalisedClause(R$string.junior_trading_nino_w8ben_update_footer, null, null, 14), false, null, 6));
            footerTextView.setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.x0()), new b(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new g(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
