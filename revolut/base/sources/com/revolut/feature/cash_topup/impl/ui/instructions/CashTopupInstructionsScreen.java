package com.revolut.feature.cash_topup.impl.ui.instructions;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.instructions.CashTopupInstructionsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.y;
import m9d.y0;
import mc3.b;
import mc3.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/instructions/CashTopupInstructionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmc3/b;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopupInstructionsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CashTopupInstructionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N;
    public final Object O;
    public final Object P;

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

    public CashTopupInstructionsScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopupInstructionsScreen f204266b;

            {
                this.f204266b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashTopupInstructionsScreen cashTopupInstructionsScreen = this.f204266b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopupInstructionsScreen.Q;
                        qji.b bVarU2 = cashTopupInstructionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.instructions.di.CashTopupInstructionsScreenInjector");
                        }
                        mb3.w wVar = new mb3.w();
                        wVar.f204111a = e4m.b.b(new y(wVar, 1, 27));
                        wVar.f204112b = e4m.b.b(new y(wVar, 0, 27));
                        return wVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopupInstructionsScreen.Q;
                        return (c) ((mb3.w) cashTopupInstructionsScreen.N.getValue()).f204112b.get();
                    default:
                        KProperty[] kPropertyArr3 = CashTopupInstructionsScreen.Q;
                        CashTopupInstructionsScreen cashTopupInstructionsScreen2 = this.f204266b;
                        return f.a(cashTopupInstructionsScreen2, (c) cashTopupInstructionsScreen2.O.getValue(), v.k(new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopupInstructionsScreen f204266b;

            {
                this.f204266b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashTopupInstructionsScreen cashTopupInstructionsScreen = this.f204266b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopupInstructionsScreen.Q;
                        qji.b bVarU2 = cashTopupInstructionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.instructions.di.CashTopupInstructionsScreenInjector");
                        }
                        mb3.w wVar = new mb3.w();
                        wVar.f204111a = e4m.b.b(new y(wVar, 1, 27));
                        wVar.f204112b = e4m.b.b(new y(wVar, 0, 27));
                        return wVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopupInstructionsScreen.Q;
                        return (c) ((mb3.w) cashTopupInstructionsScreen.N.getValue()).f204112b.get();
                    default:
                        KProperty[] kPropertyArr3 = CashTopupInstructionsScreen.Q;
                        CashTopupInstructionsScreen cashTopupInstructionsScreen2 = this.f204266b;
                        return f.a(cashTopupInstructionsScreen2, (c) cashTopupInstructionsScreen2.O.getValue(), v.k(new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopupInstructionsScreen f204266b;

            {
                this.f204266b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CashTopupInstructionsScreen cashTopupInstructionsScreen = this.f204266b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopupInstructionsScreen.Q;
                        qji.b bVarU2 = cashTopupInstructionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.instructions.di.CashTopupInstructionsScreenInjector");
                        }
                        mb3.w wVar = new mb3.w();
                        wVar.f204111a = e4m.b.b(new y(wVar, 1, 27));
                        wVar.f204112b = e4m.b.b(new y(wVar, 0, 27));
                        return wVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopupInstructionsScreen.Q;
                        return (c) ((mb3.w) cashTopupInstructionsScreen.N.getValue()).f204112b.get();
                    default:
                        KProperty[] kPropertyArr3 = CashTopupInstructionsScreen.Q;
                        CashTopupInstructionsScreen cashTopupInstructionsScreen2 = this.f204266b;
                        return f.a(cashTopupInstructionsScreen2, (c) cashTopupInstructionsScreen2.O.getValue(), v.k(new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mb3.w) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_cash_deposit_instructions_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new y0(this, null, 7), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
