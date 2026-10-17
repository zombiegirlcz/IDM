package com.revolut.feature.select.payment.impl.ui.select_card;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bxc.c;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreen;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fna.f;
import fxc.d;
import fxc.j;
import fxc.l;
import fxc.m;
import in0.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/select_card/SelectPaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfxc/j;", "Ldli/a;", "Lfxc/m;", "Lin0/g;", "Lno/k;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectPaymentScreen extends ViewController<j> implements a, g, k {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SelectPaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SelectPaymentScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final boolean S;
    public AnalyticsContext T;

    public SelectPaymentScreen(SelectPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fxc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectPaymentScreen f138790b;

            {
                this.f138790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectPaymentScreen selectPaymentScreen = this.f138790b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectPaymentScreen.U;
                        qji.b bVarU2 = selectPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.select.payment.impl.ui.select_card.di.SelectPaymentScreenComponentInjector");
                        bxc.b bVar = (bxc.b) bVarU2;
                        bxc.a aVar = bVar.f19663b;
                        bxc.b bVar2 = bVar.f19664c;
                        SelectPaymentScreenContract$InputData selectPaymentScreenContract$InputData = selectPaymentScreen.K;
                        selectPaymentScreenContract$InputData.getClass();
                        return new bxc.c(aVar, bVar2, selectPaymentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectPaymentScreen.U;
                        return (l) ((bxc.c) selectPaymentScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectPaymentScreen.U;
                        SelectPaymentScreen selectPaymentScreen2 = this.f138790b;
                        return dli.f.a(selectPaymentScreen2, selectPaymentScreen2.R2(), v.k(new RowLoadingDelegate(), selectPaymentScreen2.M, selectPaymentScreen2.N, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fxc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectPaymentScreen f138790b;

            {
                this.f138790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectPaymentScreen selectPaymentScreen = this.f138790b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectPaymentScreen.U;
                        qji.b bVarU2 = selectPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.select.payment.impl.ui.select_card.di.SelectPaymentScreenComponentInjector");
                        bxc.b bVar = (bxc.b) bVarU2;
                        bxc.a aVar = bVar.f19663b;
                        bxc.b bVar2 = bVar.f19664c;
                        SelectPaymentScreenContract$InputData selectPaymentScreenContract$InputData = selectPaymentScreen.K;
                        selectPaymentScreenContract$InputData.getClass();
                        return new bxc.c(aVar, bVar2, selectPaymentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectPaymentScreen.U;
                        return (l) ((bxc.c) selectPaymentScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectPaymentScreen.U;
                        SelectPaymentScreen selectPaymentScreen2 = this.f138790b;
                        return dli.f.a(selectPaymentScreen2, selectPaymentScreen2.R2(), v.k(new RowLoadingDelegate(), selectPaymentScreen2.M, selectPaymentScreen2.N, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fxc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectPaymentScreen f138790b;

            {
                this.f138790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectPaymentScreen selectPaymentScreen = this.f138790b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectPaymentScreen.U;
                        qji.b bVarU2 = selectPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.select.payment.impl.ui.select_card.di.SelectPaymentScreenComponentInjector");
                        bxc.b bVar = (bxc.b) bVarU2;
                        bxc.a aVar = bVar.f19663b;
                        bxc.b bVar2 = bVar.f19664c;
                        SelectPaymentScreenContract$InputData selectPaymentScreenContract$InputData = selectPaymentScreen.K;
                        selectPaymentScreenContract$InputData.getClass();
                        return new bxc.c(aVar, bVar2, selectPaymentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectPaymentScreen.U;
                        return (l) ((bxc.c) selectPaymentScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectPaymentScreen.U;
                        SelectPaymentScreen selectPaymentScreen2 = this.f138790b;
                        return dli.f.a(selectPaymentScreen2, selectPaymentScreen2.R2(), v.k(new RowLoadingDelegate(), selectPaymentScreen2.M, selectPaymentScreen2.N, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = R$layout.screen_recycler_navbar;
        this.S = true;
        this.T = inputData.f85822c;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.T = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getT() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.emergency_payment_setup_select_card_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.emergency_payment_setup_select_card_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.emergency_payment_setup_select_card_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ADD_NEW_CARD_MENU_ITEM_ACTION_ID", new TextLocalisedClause(R$string.emergency_payment_setup_select_card_button_title, null, null, 14), null, 60)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new ft.d(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new f(this, continuation, 23), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new fxc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new fxc.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new fxc.g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.f85821b;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.S);
    }
}
