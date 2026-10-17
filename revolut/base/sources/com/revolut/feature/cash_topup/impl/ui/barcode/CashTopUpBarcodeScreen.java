package com.revolut.feature.cash_topup.impl.ui.barcode;

import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.barcode.CashTopUpBarcodeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import in0.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mb3.l;
import sa6.y;
import sb3.c;
import sb3.d;
import sb3.f;
import sb3.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/barcode/CashTopUpBarcodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsb3/i;", "Ldli/a;", "Lsb3/m;", "Lin0/g;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpBarcodeScreen extends ViewController<i> implements dli.a, g {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CashTopUpBarcodeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object U;
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final RowDelegate P = new RowDelegate(null, null, 7);
    public final TextDelegate Q = new TextDelegate();
    public final CellDetailsChevronDelegate R = new CellDetailsChevronDelegate();
    public final CellDetailsActionDelegate S = new CellDetailsActionDelegate();
    public final Object T = w.y0(new s8f.h(8));

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public CashTopUpBarcodeScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sb3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpBarcodeScreen f261479b;

            {
                this.f261479b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashTopUpBarcodeScreen cashTopUpBarcodeScreen = this.f261479b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpBarcodeScreen.V;
                        qji.b bVarU2 = cashTopUpBarcodeScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.barcode.di.CashTopUpBarcodeScreenInjector");
                        }
                        mb3.k kVar = (mb3.k) bVarU2;
                        mb3.p pVar = kVar.f204076b;
                        mb3.k kVar2 = kVar.f204077c;
                        Activity activityM2 = cashTopUpBarcodeScreen.m2();
                        activityM2.getClass();
                        return new mb3.l(pVar, kVar2, cashTopUpBarcodeScreen, activityM2);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopUpBarcodeScreen.V;
                        return (l) ((mb3.l) cashTopUpBarcodeScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CashTopUpBarcodeScreen.V;
                        CashTopUpBarcodeScreen cashTopUpBarcodeScreen2 = this.f261479b;
                        return dli.f.a(cashTopUpBarcodeScreen2, cashTopUpBarcodeScreen2.R2(), v.k(new QRCodeDelegate(), new QRCodeLoadingDelegate(), cashTopUpBarcodeScreen2.P, cashTopUpBarcodeScreen2.Q, cashTopUpBarcodeScreen2.R, cashTopUpBarcodeScreen2.S, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: sb3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpBarcodeScreen f261479b;

            {
                this.f261479b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashTopUpBarcodeScreen cashTopUpBarcodeScreen = this.f261479b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpBarcodeScreen.V;
                        qji.b bVarU2 = cashTopUpBarcodeScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.barcode.di.CashTopUpBarcodeScreenInjector");
                        }
                        mb3.k kVar = (mb3.k) bVarU2;
                        mb3.p pVar = kVar.f204076b;
                        mb3.k kVar2 = kVar.f204077c;
                        Activity activityM2 = cashTopUpBarcodeScreen.m2();
                        activityM2.getClass();
                        return new mb3.l(pVar, kVar2, cashTopUpBarcodeScreen, activityM2);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopUpBarcodeScreen.V;
                        return (l) ((mb3.l) cashTopUpBarcodeScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CashTopUpBarcodeScreen.V;
                        CashTopUpBarcodeScreen cashTopUpBarcodeScreen2 = this.f261479b;
                        return dli.f.a(cashTopUpBarcodeScreen2, cashTopUpBarcodeScreen2.R2(), v.k(new QRCodeDelegate(), new QRCodeLoadingDelegate(), cashTopUpBarcodeScreen2.P, cashTopUpBarcodeScreen2.Q, cashTopUpBarcodeScreen2.R, cashTopUpBarcodeScreen2.S, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: sb3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpBarcodeScreen f261479b;

            {
                this.f261479b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CashTopUpBarcodeScreen cashTopUpBarcodeScreen = this.f261479b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpBarcodeScreen.V;
                        qji.b bVarU2 = cashTopUpBarcodeScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.barcode.di.CashTopUpBarcodeScreenInjector");
                        }
                        mb3.k kVar = (mb3.k) bVarU2;
                        mb3.p pVar = kVar.f204076b;
                        mb3.k kVar2 = kVar.f204077c;
                        Activity activityM2 = cashTopUpBarcodeScreen.m2();
                        activityM2.getClass();
                        return new mb3.l(pVar, kVar2, cashTopUpBarcodeScreen, activityM2);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopUpBarcodeScreen.V;
                        return (l) ((mb3.l) cashTopUpBarcodeScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CashTopUpBarcodeScreen.V;
                        CashTopUpBarcodeScreen cashTopUpBarcodeScreen2 = this.f261479b;
                        return dli.f.a(cashTopUpBarcodeScreen2, cashTopUpBarcodeScreen2.R2(), v.k(new QRCodeDelegate(), new QRCodeLoadingDelegate(), cashTopUpBarcodeScreen2.P, cashTopUpBarcodeScreen2.Q, cashTopUpBarcodeScreen2.R, cashTopUpBarcodeScreen2.S, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        sb3.m uiState = (sb3.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ?? r2 = uiState.f261489b;
        navBarWithToolbar.setTitle(r2, null);
        d3().f174539b.setToolbarTitle(r2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((l) this.N.getValue()).d.get()).d(v.k((LargeActionButtonDelegate) this.T.getValue(), new CellDetailsDelegate()));
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.topup_cash_barcode_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f51821c), null, new sb3.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.T.getValue()).d.f121375b), null, new sb3.g(this, null), 3);
        r rVarFilter = this.Q.d.filter(new sa6.a(new y(7), 17));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final sb3.l R2() {
        return (sb3.l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
