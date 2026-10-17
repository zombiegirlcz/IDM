package com.revolut.feature_move_money.impl.automation.screen.limit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.feature_move_money.impl.R$layout;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import e58.d;
import e7i.f;
import e7i.g;
import e7i.m;
import e7i.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s7i.b;
import te0.w;
import u7i.i;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/screen/limit/MoveMoneyAutomationLimitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le7i/m;", "Ldli/a;", "Le7i/o;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyAutomationLimitScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(MoveMoneyAutomationLimitScreen.class, "binding", "getBinding()Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyAutomationLimitBinding;", 0))};
    public final CenteredAmountDelegate K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public MoveMoneyAutomationLimitScreen(MoveMoneyAutomationLimitScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new CenteredAmountDelegate(null);
        this.L = s.t(this, f.f);
        this.M = R$layout.screen_move_money_automation_limit;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: e7i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationLimitScreen f123336b;

            {
                this.f123336b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAutomationLimitScreen.Q;
                        MoveMoneyAutomationLimitScreen moveMoneyAutomationLimitScreen = this.f123336b;
                        return dli.f.a(moveMoneyAutomationLimitScreen, moveMoneyAutomationLimitScreen.R2(), u.c(moveMoneyAutomationLimitScreen.K), R$id.moveMoneyAutomationLimit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = MoveMoneyAutomationLimitScreen.Q;
                        return (n) ((u7i.i) this.f123336b.O.getValue()).f277811c.get();
                }
            }
        });
        this.O = w.y0(new d(this, inputData, 4));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e7i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationLimitScreen f123336b;

            {
                this.f123336b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyAutomationLimitScreen.Q;
                        MoveMoneyAutomationLimitScreen moveMoneyAutomationLimitScreen = this.f123336b;
                        return dli.f.a(moveMoneyAutomationLimitScreen, moveMoneyAutomationLimitScreen.R2(), u.c(moveMoneyAutomationLimitScreen.K), R$id.moveMoneyAutomationLimit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = MoveMoneyAutomationLimitScreen.Q;
                        return (n) ((u7i.i) this.f123336b.O.getValue()).f277811c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e7i.o uiState = (e7i.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f260845c.setMenuItems(uiState.e);
        d3().d.setItems(uiState.f123345c, uiState.d);
        d3().f260844b.setModel(uiState.f123344b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f260845c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f260845c.setTitle(new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f260845c.f59211b), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.K.d.f121375b), new e7i.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f260845c.o), new e7i.i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f260844b.f), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f260845c.f59210a.f57403b), new e7i.h(this, null, 1), 3);
    }

    public final b d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
