package com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.HiddenAccountsAndTransactionsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import luc.g;
import luc.i;
import pki.b;
import te0.w;
import tki.c;
import vc.s;
import vtc.f;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/hidden_accounts_and_transactions/HiddenAccountsAndTransactionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lluc/g;", "Ltki/c;", "Lluc/i;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HiddenAccountsAndTransactionsController extends ViewController<g> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(HiddenAccountsAndTransactionsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final int M = R$layout.screen_recycler_navbar;
    public final boolean N = true;
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public HiddenAccountsAndTransactionsController() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: luc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenAccountsAndTransactionsController f200214b;

            {
                this.f200214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController = this.f200214b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenAccountsAndTransactionsController.R;
                        qji.b bVarU2 = hiddenAccountsAndTransactionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.di.HiddenAccountsAndTransactionsControllerInjector");
                        vtc.f fVar = new vtc.f();
                        fVar.f291971a = e4m.b.b(new vk6.a(4));
                        return fVar;
                    case 1:
                        KProperty[] kPropertyArr2 = HiddenAccountsAndTransactionsController.R;
                        return (h) ((vtc.f) hiddenAccountsAndTransactionsController.O.getValue()).f291971a.get();
                    default:
                        KProperty[] kPropertyArr3 = HiddenAccountsAndTransactionsController.R;
                        HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController2 = this.f200214b;
                        return tki.g.a(hiddenAccountsAndTransactionsController2, (h) hiddenAccountsAndTransactionsController2.P.getValue(), u.c(hiddenAccountsAndTransactionsController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: luc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenAccountsAndTransactionsController f200214b;

            {
                this.f200214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController = this.f200214b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenAccountsAndTransactionsController.R;
                        qji.b bVarU2 = hiddenAccountsAndTransactionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.di.HiddenAccountsAndTransactionsControllerInjector");
                        vtc.f fVar = new vtc.f();
                        fVar.f291971a = e4m.b.b(new vk6.a(4));
                        return fVar;
                    case 1:
                        KProperty[] kPropertyArr2 = HiddenAccountsAndTransactionsController.R;
                        return (h) ((vtc.f) hiddenAccountsAndTransactionsController.O.getValue()).f291971a.get();
                    default:
                        KProperty[] kPropertyArr3 = HiddenAccountsAndTransactionsController.R;
                        HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController2 = this.f200214b;
                        return tki.g.a(hiddenAccountsAndTransactionsController2, (h) hiddenAccountsAndTransactionsController2.P.getValue(), u.c(hiddenAccountsAndTransactionsController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: luc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenAccountsAndTransactionsController f200214b;

            {
                this.f200214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController = this.f200214b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenAccountsAndTransactionsController.R;
                        qji.b bVarU2 = hiddenAccountsAndTransactionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.di.HiddenAccountsAndTransactionsControllerInjector");
                        vtc.f fVar = new vtc.f();
                        fVar.f291971a = e4m.b.b(new vk6.a(4));
                        return fVar;
                    case 1:
                        KProperty[] kPropertyArr2 = HiddenAccountsAndTransactionsController.R;
                        return (h) ((vtc.f) hiddenAccountsAndTransactionsController.O.getValue()).f291971a.get();
                    default:
                        KProperty[] kPropertyArr3 = HiddenAccountsAndTransactionsController.R;
                        HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController2 = this.f200214b;
                        return tki.g.a(hiddenAccountsAndTransactionsController2, (h) hiddenAccountsAndTransactionsController2.P.getValue(), u.c(hiddenAccountsAndTransactionsController2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f200220b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b h3() {
        return (luc.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new lpl.c(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new luc.b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
