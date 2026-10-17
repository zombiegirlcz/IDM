package com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.a3;
import xf6.h2;
import xf6.w2;
import xki.e;
import z75.f;
import zhm.v;
import zj6.b;
import zj6.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/linked_accounts/BrazilLinkedAccountsScreenContract$OutputData;", "Ldli/a;", "Lzj6/i;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazilLinkedAccountsScreen extends ViewController<BrazilLinkedAccountsScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BrazilLinkedAccountsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BrazilLinkedAccountsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;
    public final Object Q;

    public BrazilLinkedAccountsScreen(BrazilLinkedAccountsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilLinkedAccountsScreen f322758b;

            {
                this.f322758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrazilLinkedAccountsScreen brazilLinkedAccountsScreen = this.f322758b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilLinkedAccountsScreen.R;
                        qji.b bVarU2 = brazilLinkedAccountsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.di.BrazilLinkedAccountsScreenComponent.Injector");
                        a3 a3Var = (a3) bVarU2;
                        w2 w2Var = a3Var.f304790a;
                        a3 a3Var2 = a3Var.f304791b;
                        BrazilLinkedAccountsScreenContract$InputData brazilLinkedAccountsScreenContract$InputData = brazilLinkedAccountsScreen.K;
                        brazilLinkedAccountsScreenContract$InputData.getClass();
                        return new h2(w2Var, a3Var2, brazilLinkedAccountsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilLinkedAccountsScreen.R;
                        return (h) ((h2) brazilLinkedAccountsScreen.N.getValue()).f304878c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilLinkedAccountsScreen.R;
                        BrazilLinkedAccountsScreen brazilLinkedAccountsScreen2 = this.f322758b;
                        return dli.f.a(brazilLinkedAccountsScreen2, (h) brazilLinkedAccountsScreen2.P.getValue(), v.k(brazilLinkedAccountsScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilLinkedAccountsScreen f322758b;

            {
                this.f322758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrazilLinkedAccountsScreen brazilLinkedAccountsScreen = this.f322758b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilLinkedAccountsScreen.R;
                        qji.b bVarU2 = brazilLinkedAccountsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.di.BrazilLinkedAccountsScreenComponent.Injector");
                        a3 a3Var = (a3) bVarU2;
                        w2 w2Var = a3Var.f304790a;
                        a3 a3Var2 = a3Var.f304791b;
                        BrazilLinkedAccountsScreenContract$InputData brazilLinkedAccountsScreenContract$InputData = brazilLinkedAccountsScreen.K;
                        brazilLinkedAccountsScreenContract$InputData.getClass();
                        return new h2(w2Var, a3Var2, brazilLinkedAccountsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilLinkedAccountsScreen.R;
                        return (h) ((h2) brazilLinkedAccountsScreen.N.getValue()).f304878c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilLinkedAccountsScreen.R;
                        BrazilLinkedAccountsScreen brazilLinkedAccountsScreen2 = this.f322758b;
                        return dli.f.a(brazilLinkedAccountsScreen2, (h) brazilLinkedAccountsScreen2.P.getValue(), v.k(brazilLinkedAccountsScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilLinkedAccountsScreen f322758b;

            {
                this.f322758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrazilLinkedAccountsScreen brazilLinkedAccountsScreen = this.f322758b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilLinkedAccountsScreen.R;
                        qji.b bVarU2 = brazilLinkedAccountsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.di.BrazilLinkedAccountsScreenComponent.Injector");
                        a3 a3Var = (a3) bVarU2;
                        w2 w2Var = a3Var.f304790a;
                        a3 a3Var2 = a3Var.f304791b;
                        BrazilLinkedAccountsScreenContract$InputData brazilLinkedAccountsScreenContract$InputData = brazilLinkedAccountsScreen.K;
                        brazilLinkedAccountsScreenContract$InputData.getClass();
                        return new h2(w2Var, a3Var2, brazilLinkedAccountsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilLinkedAccountsScreen.R;
                        return (h) ((h2) brazilLinkedAccountsScreen.N.getValue()).f304878c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilLinkedAccountsScreen.R;
                        BrazilLinkedAccountsScreen brazilLinkedAccountsScreen2 = this.f322758b;
                        return dli.f.a(brazilLinkedAccountsScreen2, (h) brazilLinkedAccountsScreen2.P.getValue(), v.k(brazilLinkedAccountsScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zj6.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        BrazilLinkedAccountsScreenContract$InputData brazilLinkedAccountsScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(brazilLinkedAccountsScreenContract$InputData.f72642a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(brazilLinkedAccountsScreenContract$InputData.f72642a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new z3f.b(this, null, 15), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, new f(rd0.e.b(rowDelegate.f53218h), 6), new zj6.f(this, null, 0), 3);
        ViewController.P2(this, new f(rd0.e.b(rowDelegate.f53220l), 7), new zj6.f(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
