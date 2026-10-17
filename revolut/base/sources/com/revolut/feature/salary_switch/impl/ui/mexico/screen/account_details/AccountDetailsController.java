package com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.AccountDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ghl.c;
import grc.f;
import grc.k;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import z0g.k0;
import zpc.o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/screen/account_details/AccountDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgrc/b;", "Ldli/a;", "Lgrc/c;", "<init>", "()V", "Companion", "a", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountDetailsController extends ViewController<grc.b> implements dli.a {
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public final h K = s.t(this, b.f);
    public final InputTextDelegate L = new InputTextDelegate(new c(this, 14));
    public final int Q = R$layout.screen_recycler_navbar_nextbutton;

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AccountDetailsController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: grc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f145970b;

            {
                this.f145970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountDetailsController accountDetailsController = this.f145970b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        return (j60.a) ((zpc.a) accountDetailsController.N.getValue()).f324233h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        qji.b bVarU2 = accountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.di.AccountDetailsControllerComponent.Injector");
                        zpc.k kVar = ((o) bVarU2).f324279b;
                        zpc.a aVar = new zpc.a();
                        int i3 = 28;
                        aVar.f324229a = e4m.b.b(new k0(kVar, aVar, 1, i3));
                        aVar.f324230b = e4m.b.b(new k0(kVar, aVar, 0, i3));
                        aVar.f324231c = e4m.b.b(e4m.c.a(accountDetailsController));
                        aVar.d = e4m.b.b(new k0(kVar, aVar, 4, i3));
                        aVar.e = e4m.b.b(new k0(kVar, aVar, 3, i3));
                        aVar.f = e4m.b.b(new k0(kVar, aVar, 2, i3));
                        aVar.f324232g = e4m.b.b(new k0(kVar, aVar, 6, i3));
                        aVar.f324233h = e4m.b.b(new k0(kVar, aVar, 7, i3));
                        aVar.i = e4m.b.b(new k0(kVar, aVar, 5, i3));
                        return aVar;
                    case 2:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        return (k) ((zpc.a) accountDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f145970b;
                        return dli.f.a(accountDetailsController2, accountDetailsController2.R2(), zhm.u.c(accountDetailsController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: grc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f145970b;

            {
                this.f145970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountDetailsController accountDetailsController = this.f145970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        return (j60.a) ((zpc.a) accountDetailsController.N.getValue()).f324233h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        qji.b bVarU2 = accountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.di.AccountDetailsControllerComponent.Injector");
                        zpc.k kVar = ((o) bVarU2).f324279b;
                        zpc.a aVar = new zpc.a();
                        int i3 = 28;
                        aVar.f324229a = e4m.b.b(new k0(kVar, aVar, 1, i3));
                        aVar.f324230b = e4m.b.b(new k0(kVar, aVar, 0, i3));
                        aVar.f324231c = e4m.b.b(e4m.c.a(accountDetailsController));
                        aVar.d = e4m.b.b(new k0(kVar, aVar, 4, i3));
                        aVar.e = e4m.b.b(new k0(kVar, aVar, 3, i3));
                        aVar.f = e4m.b.b(new k0(kVar, aVar, 2, i3));
                        aVar.f324232g = e4m.b.b(new k0(kVar, aVar, 6, i3));
                        aVar.f324233h = e4m.b.b(new k0(kVar, aVar, 7, i3));
                        aVar.i = e4m.b.b(new k0(kVar, aVar, 5, i3));
                        return aVar;
                    case 2:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        return (k) ((zpc.a) accountDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f145970b;
                        return dli.f.a(accountDetailsController2, accountDetailsController2.R2(), zhm.u.c(accountDetailsController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: grc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f145970b;

            {
                this.f145970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountDetailsController accountDetailsController = this.f145970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        return (j60.a) ((zpc.a) accountDetailsController.N.getValue()).f324233h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        qji.b bVarU2 = accountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.di.AccountDetailsControllerComponent.Injector");
                        zpc.k kVar = ((o) bVarU2).f324279b;
                        zpc.a aVar = new zpc.a();
                        int i32 = 28;
                        aVar.f324229a = e4m.b.b(new k0(kVar, aVar, 1, i32));
                        aVar.f324230b = e4m.b.b(new k0(kVar, aVar, 0, i32));
                        aVar.f324231c = e4m.b.b(e4m.c.a(accountDetailsController));
                        aVar.d = e4m.b.b(new k0(kVar, aVar, 4, i32));
                        aVar.e = e4m.b.b(new k0(kVar, aVar, 3, i32));
                        aVar.f = e4m.b.b(new k0(kVar, aVar, 2, i32));
                        aVar.f324232g = e4m.b.b(new k0(kVar, aVar, 6, i32));
                        aVar.f324233h = e4m.b.b(new k0(kVar, aVar, 7, i32));
                        aVar.i = e4m.b.b(new k0(kVar, aVar, 5, i32));
                        return aVar;
                    case 2:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        return (k) ((zpc.a) accountDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f145970b;
                        return dli.f.a(accountDetailsController2, accountDetailsController2.R2(), zhm.u.c(accountDetailsController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: grc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsController f145970b;

            {
                this.f145970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AccountDetailsController accountDetailsController = this.f145970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountDetailsController.R;
                        return (j60.a) ((zpc.a) accountDetailsController.N.getValue()).f324233h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountDetailsController.R;
                        qji.b bVarU2 = accountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.di.AccountDetailsControllerComponent.Injector");
                        zpc.k kVar = ((o) bVarU2).f324279b;
                        zpc.a aVar = new zpc.a();
                        int i32 = 28;
                        aVar.f324229a = e4m.b.b(new k0(kVar, aVar, 1, i32));
                        aVar.f324230b = e4m.b.b(new k0(kVar, aVar, 0, i32));
                        aVar.f324231c = e4m.b.b(e4m.c.a(accountDetailsController));
                        aVar.d = e4m.b.b(new k0(kVar, aVar, 4, i32));
                        aVar.e = e4m.b.b(new k0(kVar, aVar, 3, i32));
                        aVar.f = e4m.b.b(new k0(kVar, aVar, 2, i32));
                        aVar.f324232g = e4m.b.b(new k0(kVar, aVar, 6, i32));
                        aVar.f324233h = e4m.b.b(new k0(kVar, aVar, 7, i32));
                        aVar.i = e4m.b.b(new k0(kVar, aVar, 5, i32));
                        return aVar;
                    case 2:
                        KProperty[] kPropertyArr3 = AccountDetailsController.R;
                        return (k) ((zpc.a) accountDetailsController.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr4 = AccountDetailsController.R;
                        AccountDetailsController accountDetailsController2 = this.f145970b;
                        return dli.f.a(accountDetailsController2, accountDetailsController2.R2(), zhm.u.c(accountDetailsController2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        grc.c uiState = (grc.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f145968b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zpc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_mx_bank_account_title, null, null, 14);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.salary_switch_mx_bank_account_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setMenuItems(zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_SECURITY", new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124)));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.salary_switch_mx_bank_account_action_continue, null, null, 14));
        largeActionButton.setLoadingButtonTag("CONTINUE_LOADING_TAG");
        ((j60.a) this.M.getValue()).d(zhm.u.c(new RowDelegate(null, null, 7)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new grc.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new gii.b(this, continuation, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new grc.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.i.f121375b), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
