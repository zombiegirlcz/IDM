package com.revolut.feature_move_money.impl.automation.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c7i.k;
import c7i.t;
import c7i.u;
import c7i.v;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreen;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import jii.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u7i.j;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc7i/t;", "Ltki/c;", "Lc7i/v;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyAutomationScreen extends ViewController<t> implements tki.c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(MoveMoneyAutomationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final MoveMoneyAutomationScreenContract$InputData K;
    public final int L;
    public final CellDetailsActionDelegate M;
    public final TextDelegate N;
    public final ConditionalAmountDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public MoveMoneyAutomationScreen(MoveMoneyAutomationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar_action_footer;
        this.M = new CellDetailsActionDelegate();
        this.N = new TextDelegate();
        this.O = new ConditionalAmountDelegate(new c64.a(this, 1));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: c7i.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationScreen f22004b;

            {
                this.f22004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MoveMoneyAutomationScreen moveMoneyAutomationScreen = this.f22004b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAutomationScreen.T;
                        MoveMoneyAutomationScreen moveMoneyAutomationScreen2 = this.f22004b;
                        return tki.g.a(moveMoneyAutomationScreen2, moveMoneyAutomationScreen2.d(), zhm.v.k(moveMoneyAutomationScreen2.O, moveMoneyAutomationScreen2.M, moveMoneyAutomationScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MoveMoneyAutomationScreen.T;
                        qji.b bVarU2 = moveMoneyAutomationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.automation.screen.di.MoveMoneyAutomationScreenInjector");
                        u7i.h hVar = (u7i.h) bVarU2;
                        u7i.l lVar = hVar.f277808c;
                        u7i.h hVar2 = hVar.d;
                        MoveMoneyAutomationScreenContract$InputData moveMoneyAutomationScreenContract$InputData = moveMoneyAutomationScreen.K;
                        moveMoneyAutomationScreenContract$InputData.getClass();
                        return new u7i.j(lVar, hVar2, moveMoneyAutomationScreen, moveMoneyAutomationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoveMoneyAutomationScreen.T;
                        return (u) ((u7i.j) moveMoneyAutomationScreen.R.getValue()).f277817j.get();
                }
            }
        });
        this.Q = s.t(this, c7i.h.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: c7i.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationScreen f22004b;

            {
                this.f22004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MoveMoneyAutomationScreen moveMoneyAutomationScreen = this.f22004b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAutomationScreen.T;
                        MoveMoneyAutomationScreen moveMoneyAutomationScreen2 = this.f22004b;
                        return tki.g.a(moveMoneyAutomationScreen2, moveMoneyAutomationScreen2.d(), zhm.v.k(moveMoneyAutomationScreen2.O, moveMoneyAutomationScreen2.M, moveMoneyAutomationScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MoveMoneyAutomationScreen.T;
                        qji.b bVarU2 = moveMoneyAutomationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.automation.screen.di.MoveMoneyAutomationScreenInjector");
                        u7i.h hVar = (u7i.h) bVarU2;
                        u7i.l lVar = hVar.f277808c;
                        u7i.h hVar2 = hVar.d;
                        MoveMoneyAutomationScreenContract$InputData moveMoneyAutomationScreenContract$InputData = moveMoneyAutomationScreen.K;
                        moveMoneyAutomationScreenContract$InputData.getClass();
                        return new u7i.j(lVar, hVar2, moveMoneyAutomationScreen, moveMoneyAutomationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoveMoneyAutomationScreen.T;
                        return (u) ((u7i.j) moveMoneyAutomationScreen.R.getValue()).f277817j.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: c7i.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationScreen f22004b;

            {
                this.f22004b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MoveMoneyAutomationScreen moveMoneyAutomationScreen = this.f22004b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAutomationScreen.T;
                        MoveMoneyAutomationScreen moveMoneyAutomationScreen2 = this.f22004b;
                        return tki.g.a(moveMoneyAutomationScreen2, moveMoneyAutomationScreen2.d(), zhm.v.k(moveMoneyAutomationScreen2.O, moveMoneyAutomationScreen2.M, moveMoneyAutomationScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MoveMoneyAutomationScreen.T;
                        qji.b bVarU2 = moveMoneyAutomationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.automation.screen.di.MoveMoneyAutomationScreenInjector");
                        u7i.h hVar = (u7i.h) bVarU2;
                        u7i.l lVar = hVar.f277808c;
                        u7i.h hVar2 = hVar.d;
                        MoveMoneyAutomationScreenContract$InputData moveMoneyAutomationScreenContract$InputData = moveMoneyAutomationScreen.K;
                        moveMoneyAutomationScreenContract$InputData.getClass();
                        return new u7i.j(lVar, hVar2, moveMoneyAutomationScreen, moveMoneyAutomationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoveMoneyAutomationScreen.T;
                        return (u) ((u7i.j) moveMoneyAutomationScreen.R.getValue()).f277817j.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174528c.setSubtitle(uiState.f22030c);
        d3().f174527b.setModel(uiState.f22029b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.move_money_automation_screen_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new c7i.j(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new c7i.j(this, continuation, 1), 3);
        ConditionalAmountDelegate conditionalAmountDelegate = this.O;
        ViewController.P2(this, l.y(conditionalAmountDelegate.d.f121375b, conditionalAmountDelegate.e.f121375b, "merge(...)"), new k(this, continuation, 0), 3);
        ViewController.P2(this, new bk6.c(rd0.e.b(this.M.d), 29), new c7i.l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new k(this, continuation, 1), 3);
    }

    public final i d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u d() {
        return (u) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
