package com.revolut.feature.statements.impl.ui.consolidated.bank_id;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.consolidated.bank_id.BankIDAnnualStatementsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dzd.c;
import eyd.b0;
import eyd.i;
import eyd.l;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/bank_id/BankIDAnnualStatementsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldzd/c;", "<init>", "()V", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankIDAnnualStatementsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BankIDAnnualStatementsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();

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

    public BankIDAnnualStatementsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dzd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankIDAnnualStatementsScreen f121317b;

            {
                this.f121317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen = this.f121317b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankIDAnnualStatementsScreen.R;
                        qji.b bVarU2 = bankIDAnnualStatementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.bank_id.di.BankIDAnnualReportsScreenInjector");
                        b0 b0Var = ((l) bVarU2).f130780b;
                        i iVar = new i();
                        iVar.f130758a = e4m.b.b(new eyd.h(b0Var, 0));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BankIDAnnualStatementsScreen.R;
                        BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen2 = this.f121317b;
                        return dli.f.a(bankIDAnnualStatementsScreen2, (b) bankIDAnnualStatementsScreen2.Q.getValue(), v.k(bankIDAnnualStatementsScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), bankIDAnnualStatementsScreen2.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BankIDAnnualStatementsScreen.R;
                        return (b) ((i) bankIDAnnualStatementsScreen.M.getValue()).f130758a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: dzd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankIDAnnualStatementsScreen f121317b;

            {
                this.f121317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen = this.f121317b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankIDAnnualStatementsScreen.R;
                        qji.b bVarU2 = bankIDAnnualStatementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.bank_id.di.BankIDAnnualReportsScreenInjector");
                        b0 b0Var = ((l) bVarU2).f130780b;
                        i iVar = new i();
                        iVar.f130758a = e4m.b.b(new eyd.h(b0Var, 0));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BankIDAnnualStatementsScreen.R;
                        BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen2 = this.f121317b;
                        return dli.f.a(bankIDAnnualStatementsScreen2, (b) bankIDAnnualStatementsScreen2.Q.getValue(), v.k(bankIDAnnualStatementsScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), bankIDAnnualStatementsScreen2.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BankIDAnnualStatementsScreen.R;
                        return (b) ((i) bankIDAnnualStatementsScreen.M.getValue()).f130758a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: dzd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankIDAnnualStatementsScreen f121317b;

            {
                this.f121317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen = this.f121317b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankIDAnnualStatementsScreen.R;
                        qji.b bVarU2 = bankIDAnnualStatementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.bank_id.di.BankIDAnnualReportsScreenInjector");
                        b0 b0Var = ((l) bVarU2).f130780b;
                        i iVar = new i();
                        iVar.f130758a = e4m.b.b(new eyd.h(b0Var, 0));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BankIDAnnualStatementsScreen.R;
                        BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen2 = this.f121317b;
                        return dli.f.a(bankIDAnnualStatementsScreen2, (b) bankIDAnnualStatementsScreen2.Q.getValue(), v.k(bankIDAnnualStatementsScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), bankIDAnnualStatementsScreen2.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BankIDAnnualStatementsScreen.R;
                        return (b) ((i) bankIDAnnualStatementsScreen.M.getValue()).f130758a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (dzd.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.statements_group_bank_id_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.statements_group_bank_id_screen_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.statements_group_bank_id_screen_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new v0(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new dzd.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
