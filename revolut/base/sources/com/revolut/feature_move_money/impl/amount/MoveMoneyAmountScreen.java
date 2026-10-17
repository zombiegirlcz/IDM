package com.revolut.feature_move_money.impl.amount;

import a2f.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b4g.f0;
import b6i.m;
import b6i.n;
import b6i.t0;
import b6i.v0;
import b6i.w0;
import b6i.x0;
import b6i.y0;
import cli.o;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.AmountDualEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.feature_move_money.impl.R$layout;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveMoneyAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData;", "Ltki/c;", "Lb6i/o;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyAmountScreen extends ViewController<MoveAmountScreenContract$OutputData> implements tki.c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(MoveMoneyAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyAmountBinding;", 0))};
    public final MoveAmountScreenContract$InputData K;
    public final h L;
    public final AmountDualEditDelegate M;
    public final RowDelegate N;
    public final AccountCellItemDelegate O;
    public final TextDelegate P;
    public final InputTextDelegate Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final boolean V;

    public MoveMoneyAmountScreen(MoveAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, t0.f);
        this.M = new AmountDualEditDelegate(new q(this, 28));
        this.N = new RowDelegate(null, null, 7);
        this.O = new AccountCellItemDelegate();
        this.P = new TextDelegate();
        this.Q = new InputTextDelegate(null);
        this.R = R$layout.screen_move_money_amount;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: b6i.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAmountScreen f12821b;

            {
                this.f12821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MoveMoneyAmountScreen moveMoneyAmountScreen = this.f12821b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAmountScreen.W;
                        return (n) ((u7i.f) moveMoneyAmountScreen.T.getValue()).B.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MoveMoneyAmountScreen.W;
                        qji.b bVarR1 = moveMoneyAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.amount.di.MoveAmountScreenInjector");
                        u7i.m mVar = (u7i.m) bVarR1;
                        u7i.l lVar = mVar.e;
                        u7i.m mVar2 = mVar.f;
                        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = moveMoneyAmountScreen.K;
                        moveAmountScreenContract$InputData.getClass();
                        return new u7i.f(lVar, mVar2, moveMoneyAmountScreen, moveAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoveMoneyAmountScreen.W;
                        MoveMoneyAmountScreen moveMoneyAmountScreen2 = this.f12821b;
                        return tki.g.a(moveMoneyAmountScreen2, moveMoneyAmountScreen2.d(), zhm.d0.E0(((fd6.a) ((u7i.f) moveMoneyAmountScreen2.T.getValue()).e.get()).e, zhm.v.k(moveMoneyAmountScreen2.M, new CellDetailsDelegate(), new RowLoadingDelegate(), moveMoneyAmountScreen2.N, moveMoneyAmountScreen2.O, moveMoneyAmountScreen2.P, moveMoneyAmountScreen2.Q)), R$id.moveMoneyAmount_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: b6i.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAmountScreen f12821b;

            {
                this.f12821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MoveMoneyAmountScreen moveMoneyAmountScreen = this.f12821b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAmountScreen.W;
                        return (n) ((u7i.f) moveMoneyAmountScreen.T.getValue()).B.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MoveMoneyAmountScreen.W;
                        qji.b bVarR1 = moveMoneyAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.amount.di.MoveAmountScreenInjector");
                        u7i.m mVar = (u7i.m) bVarR1;
                        u7i.l lVar = mVar.e;
                        u7i.m mVar2 = mVar.f;
                        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = moveMoneyAmountScreen.K;
                        moveAmountScreenContract$InputData.getClass();
                        return new u7i.f(lVar, mVar2, moveMoneyAmountScreen, moveAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoveMoneyAmountScreen.W;
                        MoveMoneyAmountScreen moveMoneyAmountScreen2 = this.f12821b;
                        return tki.g.a(moveMoneyAmountScreen2, moveMoneyAmountScreen2.d(), zhm.d0.E0(((fd6.a) ((u7i.f) moveMoneyAmountScreen2.T.getValue()).e.get()).e, zhm.v.k(moveMoneyAmountScreen2.M, new CellDetailsDelegate(), new RowLoadingDelegate(), moveMoneyAmountScreen2.N, moveMoneyAmountScreen2.O, moveMoneyAmountScreen2.P, moveMoneyAmountScreen2.Q)), R$id.moveMoneyAmount_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: b6i.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAmountScreen f12821b;

            {
                this.f12821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MoveMoneyAmountScreen moveMoneyAmountScreen = this.f12821b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAmountScreen.W;
                        return (n) ((u7i.f) moveMoneyAmountScreen.T.getValue()).B.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MoveMoneyAmountScreen.W;
                        qji.b bVarR1 = moveMoneyAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature_move_money.impl.amount.di.MoveAmountScreenInjector");
                        u7i.m mVar = (u7i.m) bVarR1;
                        u7i.l lVar = mVar.e;
                        u7i.m mVar2 = mVar.f;
                        MoveAmountScreenContract$InputData moveAmountScreenContract$InputData = moveMoneyAmountScreen.K;
                        moveAmountScreenContract$InputData.getClass();
                        return new u7i.f(lVar, mVar2, moveMoneyAmountScreen, moveAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoveMoneyAmountScreen.W;
                        MoveMoneyAmountScreen moveMoneyAmountScreen2 = this.f12821b;
                        return tki.g.a(moveMoneyAmountScreen2, moveMoneyAmountScreen2.d(), zhm.d0.E0(((fd6.a) ((u7i.f) moveMoneyAmountScreen2.T.getValue()).e.get()).e, zhm.v.k(moveMoneyAmountScreen2.M, new CellDetailsDelegate(), new RowLoadingDelegate(), moveMoneyAmountScreen2.N, moveMoneyAmountScreen2.O, moveMoneyAmountScreen2.P, moveMoneyAmountScreen2.Q)), R$id.moveMoneyAmount_recyclerView, null, null, null, 56);
                }
            }
        });
        this.V = true;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b6i.o uiState = (b6i.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        BasicNavBar basicNavBar = d3().f260841b;
        m mVar = uiState.f12806b;
        basicNavBar.setTitle(mVar.f12798a);
        basicNavBar.setSubtitle(mVar.f12799b);
        basicNavBar.setMenuItems(mVar.f12800c);
        LargeActionButton largeActionButton = d3().d;
        largeActionButton.setLoadingButtonTag("MOVE_MONEY_AMOUNT_CTA_BUTTON_TAG");
        b6i.f fVar = uiState.f12807c;
        largeActionButton.setEnabled(fVar.f12778a);
        largeActionButton.setText(fVar.f12779b);
        LargeActionButton largeActionButton2 = d3().f260842c;
        largeActionButton2.setEnabled(fVar.f12780c);
        largeActionButton2.setVisibility(fVar.d ? 0 : 8);
        largeActionButton2.setIcon(fVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u7i.f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f260841b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f260841b.f59211b), new x0(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f260841b.e), new x0(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(d3().f260841b.f59210a.f57403b), new v0(this, continuation, 3), 3);
        AmountDualEditDelegate amountDualEditDelegate = this.M;
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.f51620q), new x0(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.e.f121375b), new x0(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.k.f121375b), new x0(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.f.f121375b), new x0(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.f51616l.f121375b), new x0(this, continuation, 4), 3);
        r rVarMerge = r.merge(w.a0(amountDualEditDelegate.i.f121375b, new f0(21)), w.a0(amountDualEditDelegate.o.f121375b, new f0(22)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new v0(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(w.a0(amountDualEditDelegate.f51614h.f121375b, new f0(23))), new v0(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(w.a0(amountDualEditDelegate.f51618n.f121375b, new f0(24))), new v0(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53220l), new w0(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o), new x0(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f260842c.o), new x0(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new v0(this, continuation, 4), 3);
        InputTextDelegate inputTextDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new y0(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new v0(this, continuation, 5), 3);
    }

    public final s7i.a d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (s7i.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
