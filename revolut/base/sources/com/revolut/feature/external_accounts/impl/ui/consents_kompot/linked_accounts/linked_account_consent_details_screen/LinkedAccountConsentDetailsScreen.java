package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import wl6.b;
import wl6.c;
import wl6.d;
import wl6.f;
import wl6.g;
import xf6.c0;
import xf6.d0;
import xf6.t;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/linked_accounts/linked_account_consent_details_screen/LinkedAccountConsentDetailsScreenContract$OutputData;", "Ldli/a;", "Lwl6/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedAccountConsentDetailsScreen extends ViewController<LinkedAccountConsentDetailsScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LinkedAccountConsentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LinkedAccountConsentDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final ListCellDelegate O;
    public final ListSubheaderDelegate P;
    public final Object Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public final Object T;

    public LinkedAccountConsentDetailsScreen(LinkedAccountConsentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new ListCellDelegate();
        this.P = new ListSubheaderDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountConsentDetailsScreen f298437b;

            {
                this.f298437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen = this.f298437b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountConsentDetailsScreen.U;
                        qji.b bVarU2 = linkedAccountConsentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.di.LinkedAccountConsentDetailsScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        t tVar = d0Var.f304816a;
                        d0 d0Var2 = d0Var.f304817b;
                        LinkedAccountConsentDetailsScreenContract$InputData linkedAccountConsentDetailsScreenContract$InputData = linkedAccountConsentDetailsScreen.K;
                        linkedAccountConsentDetailsScreenContract$InputData.getClass();
                        return new c0(tVar, d0Var2, linkedAccountConsentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountConsentDetailsScreen.U;
                        return (f) ((c0) linkedAccountConsentDetailsScreen.Q.getValue()).f304806c.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountConsentDetailsScreen.U;
                        LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen2 = this.f298437b;
                        return dli.f.a(linkedAccountConsentDetailsScreen2, linkedAccountConsentDetailsScreen2.d(), v.k(linkedAccountConsentDetailsScreen2.N, new RowLoadingDelegate(), linkedAccountConsentDetailsScreen2.P, linkedAccountConsentDetailsScreen2.O, linkedAccountConsentDetailsScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: wl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountConsentDetailsScreen f298437b;

            {
                this.f298437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen = this.f298437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountConsentDetailsScreen.U;
                        qji.b bVarU2 = linkedAccountConsentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.di.LinkedAccountConsentDetailsScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        t tVar = d0Var.f304816a;
                        d0 d0Var2 = d0Var.f304817b;
                        LinkedAccountConsentDetailsScreenContract$InputData linkedAccountConsentDetailsScreenContract$InputData = linkedAccountConsentDetailsScreen.K;
                        linkedAccountConsentDetailsScreenContract$InputData.getClass();
                        return new c0(tVar, d0Var2, linkedAccountConsentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountConsentDetailsScreen.U;
                        return (f) ((c0) linkedAccountConsentDetailsScreen.Q.getValue()).f304806c.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountConsentDetailsScreen.U;
                        LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen2 = this.f298437b;
                        return dli.f.a(linkedAccountConsentDetailsScreen2, linkedAccountConsentDetailsScreen2.d(), v.k(linkedAccountConsentDetailsScreen2.N, new RowLoadingDelegate(), linkedAccountConsentDetailsScreen2.P, linkedAccountConsentDetailsScreen2.O, linkedAccountConsentDetailsScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new FullScreenStateDelegate();
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: wl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountConsentDetailsScreen f298437b;

            {
                this.f298437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen = this.f298437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountConsentDetailsScreen.U;
                        qji.b bVarU2 = linkedAccountConsentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.di.LinkedAccountConsentDetailsScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        t tVar = d0Var.f304816a;
                        d0 d0Var2 = d0Var.f304817b;
                        LinkedAccountConsentDetailsScreenContract$InputData linkedAccountConsentDetailsScreenContract$InputData = linkedAccountConsentDetailsScreen.K;
                        linkedAccountConsentDetailsScreenContract$InputData.getClass();
                        return new c0(tVar, d0Var2, linkedAccountConsentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountConsentDetailsScreen.U;
                        return (f) ((c0) linkedAccountConsentDetailsScreen.Q.getValue()).f304806c.get();
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountConsentDetailsScreen.U;
                        LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen2 = this.f298437b;
                        return dli.f.a(linkedAccountConsentDetailsScreen2, linkedAccountConsentDetailsScreen2.d(), v.k(linkedAccountConsentDetailsScreen2.N, new RowLoadingDelegate(), linkedAccountConsentDetailsScreen2.P, linkedAccountConsentDetailsScreen2.O, linkedAccountConsentDetailsScreen2.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        String str = uiState.f298439a;
        String str2 = uiState.f298440b;
        if (str != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        }
        d3().f174539b.setSecondDescriptionVisible(str2 != null);
        if (str2 != null) {
            d3().f174539b.setSecondDescriptionText(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new wkg.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
