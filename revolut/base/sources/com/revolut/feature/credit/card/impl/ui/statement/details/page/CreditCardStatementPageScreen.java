package com.revolut.feature.credit.card.impl.ui.statement.details.page;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.credit.card.impl.R$id;
import com.revolut.feature.credit.card.impl.R$layout;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import im4.d;
import jm4.v2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lkf.f0;
import lv4.c;
import lv4.n;
import lv4.r;
import no.m;
import te0.w;
import vc.s;
import w01.k;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/page/CreditCardStatementPageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llv4/n;", "Ldli/a;", "Llv4/s;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementPageScreen extends ViewController<n> implements a, m {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(CreditCardStatementPageScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/card/impl/databinding/ScreenRecyclerActionBinding;", 0))};
    public final /* synthetic */ b K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final h U;
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public CreditCardStatementPageScreen(CreditCardStatementPageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = w.y0(new f0(28));
        this.M = w.y0(new f0(29));
        this.N = w.y0(new lv4.b(0));
        this.O = w.y0(new lv4.b(1));
        this.P = w.y0(new lv4.b(2));
        final int i = 3;
        this.Q = w.y0(new Function0(this) { // from class: lv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementPageScreen f200282b;

            {
                this.f200282b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementPageScreen creditCardStatementPageScreen = this.f200282b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementPageScreen.Z;
                        return (j60.a) ((v2) creditCardStatementPageScreen.X.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementPageScreen.Z;
                        CreditCardStatementPageScreen creditCardStatementPageScreen2 = this.f200282b;
                        return dli.f.a(creditCardStatementPageScreen2, (o) creditCardStatementPageScreen2.Y.getValue(), zhm.v.k((LargeActionButtonDelegate) creditCardStatementPageScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementPageScreen2.L.getValue(), (FullScreenStateDelegate) creditCardStatementPageScreen2.O.getValue(), (SwipeToActionDelegate) creditCardStatementPageScreen2.Q.getValue(), (CellDetailsChevronDelegate) creditCardStatementPageScreen2.R.getValue(), (RowDelegate) creditCardStatementPageScreen2.P.getValue(), (CellDetailsBadgeDelegate) creditCardStatementPageScreen2.N.getValue(), (CellDetailsActionDelegate) creditCardStatementPageScreen2.S.getValue(), new FooterTextDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), new TextDelegate()), R$id.screenRecyclerAction_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardStatementPageScreen.Z;
                        return (o) ((v2) creditCardStatementPageScreen.X.getValue()).f176405m.get();
                    default:
                        KProperty[] kPropertyArr4 = CreditCardStatementPageScreen.Z;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementPageScreen.P.getValue(), false);
                }
            }
        });
        this.R = w.y0(new lv4.b(3));
        this.S = w.y0(new lv4.b(4));
        final int i2 = 0;
        this.T = w.y0(new Function0(this) { // from class: lv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementPageScreen f200282b;

            {
                this.f200282b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementPageScreen creditCardStatementPageScreen = this.f200282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementPageScreen.Z;
                        return (j60.a) ((v2) creditCardStatementPageScreen.X.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementPageScreen.Z;
                        CreditCardStatementPageScreen creditCardStatementPageScreen2 = this.f200282b;
                        return dli.f.a(creditCardStatementPageScreen2, (o) creditCardStatementPageScreen2.Y.getValue(), zhm.v.k((LargeActionButtonDelegate) creditCardStatementPageScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementPageScreen2.L.getValue(), (FullScreenStateDelegate) creditCardStatementPageScreen2.O.getValue(), (SwipeToActionDelegate) creditCardStatementPageScreen2.Q.getValue(), (CellDetailsChevronDelegate) creditCardStatementPageScreen2.R.getValue(), (RowDelegate) creditCardStatementPageScreen2.P.getValue(), (CellDetailsBadgeDelegate) creditCardStatementPageScreen2.N.getValue(), (CellDetailsActionDelegate) creditCardStatementPageScreen2.S.getValue(), new FooterTextDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), new TextDelegate()), R$id.screenRecyclerAction_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardStatementPageScreen.Z;
                        return (o) ((v2) creditCardStatementPageScreen.X.getValue()).f176405m.get();
                    default:
                        KProperty[] kPropertyArr4 = CreditCardStatementPageScreen.Z;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementPageScreen.P.getValue(), false);
                }
            }
        });
        this.U = s.t(this, c.f);
        this.V = R$layout.screen_recycler_action;
        final int i3 = 1;
        this.W = w.y0(new Function0(this) { // from class: lv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementPageScreen f200282b;

            {
                this.f200282b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementPageScreen creditCardStatementPageScreen = this.f200282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementPageScreen.Z;
                        return (j60.a) ((v2) creditCardStatementPageScreen.X.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementPageScreen.Z;
                        CreditCardStatementPageScreen creditCardStatementPageScreen2 = this.f200282b;
                        return dli.f.a(creditCardStatementPageScreen2, (o) creditCardStatementPageScreen2.Y.getValue(), zhm.v.k((LargeActionButtonDelegate) creditCardStatementPageScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementPageScreen2.L.getValue(), (FullScreenStateDelegate) creditCardStatementPageScreen2.O.getValue(), (SwipeToActionDelegate) creditCardStatementPageScreen2.Q.getValue(), (CellDetailsChevronDelegate) creditCardStatementPageScreen2.R.getValue(), (RowDelegate) creditCardStatementPageScreen2.P.getValue(), (CellDetailsBadgeDelegate) creditCardStatementPageScreen2.N.getValue(), (CellDetailsActionDelegate) creditCardStatementPageScreen2.S.getValue(), new FooterTextDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), new TextDelegate()), R$id.screenRecyclerAction_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardStatementPageScreen.Z;
                        return (o) ((v2) creditCardStatementPageScreen.X.getValue()).f176405m.get();
                    default:
                        KProperty[] kPropertyArr4 = CreditCardStatementPageScreen.Z;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementPageScreen.P.getValue(), false);
                }
            }
        });
        this.X = w.y0(new ltf.b(this, inputData, 5));
        final int i5 = 2;
        this.Y = w.y0(new Function0(this) { // from class: lv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementPageScreen f200282b;

            {
                this.f200282b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardStatementPageScreen creditCardStatementPageScreen = this.f200282b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementPageScreen.Z;
                        return (j60.a) ((v2) creditCardStatementPageScreen.X.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementPageScreen.Z;
                        CreditCardStatementPageScreen creditCardStatementPageScreen2 = this.f200282b;
                        return dli.f.a(creditCardStatementPageScreen2, (o) creditCardStatementPageScreen2.Y.getValue(), zhm.v.k((LargeActionButtonDelegate) creditCardStatementPageScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementPageScreen2.L.getValue(), (FullScreenStateDelegate) creditCardStatementPageScreen2.O.getValue(), (SwipeToActionDelegate) creditCardStatementPageScreen2.Q.getValue(), (CellDetailsChevronDelegate) creditCardStatementPageScreen2.R.getValue(), (RowDelegate) creditCardStatementPageScreen2.P.getValue(), (CellDetailsBadgeDelegate) creditCardStatementPageScreen2.N.getValue(), (CellDetailsActionDelegate) creditCardStatementPageScreen2.S.getValue(), new FooterTextDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), new TextDelegate()), R$id.screenRecyclerAction_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardStatementPageScreen.Z;
                        return (o) ((v2) creditCardStatementPageScreen.X.getValue()).f176405m.get();
                    default:
                        KProperty[] kPropertyArr4 = CreditCardStatementPageScreen.Z;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementPageScreen.P.getValue(), false);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        lv4.s uiState = (lv4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        r rVar = uiState.f200309a;
        ViewBinding value = this.U.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ActionFooterView actionFooterView = ((d) value).f162306b;
        if (rVar == null) {
            k.a(actionFooterView);
        } else {
            k.d(actionFooterView);
            actionFooterView.setModel(new e(false, null, null, new n6(rVar.f200308a, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, lv4.q.f200307a, 508), null, null, 55));
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v2) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lv4.o) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.T.getValue()).d(v.k((LargeActionButtonDelegate) this.M.getValue(), (RowDelegate) this.P.getValue(), (CellDetailsDelegate) this.L.getValue()));
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.U.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((d) value).f162306b.f), null, new lv4.e(this, null, 0), 3);
        vkm.d dVarB = rd0.e.b(((RowDelegate) this.P.getValue()).f53218h);
        ?? r110 = this.L;
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(dVarB, rd0.e.b(((CellDetailsDelegate) r110.getValue()).f), rd0.e.b(((CellDetailsDelegate) r110.getValue()).d), rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((LargeActionButtonDelegate) this.M.getValue()).d.f121375b), rd0.e.b(((CellDetailsBadgeDelegate) this.N.getValue()).e), rd0.e.b(((CellDetailsChevronDelegate) this.R.getValue()).f51821c), rd0.e.b(((CellDetailsActionDelegate) this.S.getValue()).d)), yx4.b.Companion, 17), null, new lv4.e(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
