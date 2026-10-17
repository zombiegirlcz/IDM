package com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.IndiaNetBankingInstitutionsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import njj.n;
import nm6.b;
import nm6.d;
import nm6.f;
import nm6.h;
import nm6.i;
import nm6.j;
import te0.w;
import vc.s;
import xf6.f0;
import xf6.t;
import xf6.u;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/india/netbanking/screen/institutions/IndiaNetBankingInstitutionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnm6/h;", "Ldli/a;", "Lnm6/i;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndiaNetBankingInstitutionsScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(IndiaNetBankingInstitutionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final f K;
    public final int L;
    public final Object M;
    public final Object N;
    public final ao.h O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public IndiaNetBankingInstitutionsScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaNetBankingInstitutionsScreen f217180b;

            {
                this.f217180b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen = this.f217180b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaNetBankingInstitutionsScreen.S;
                        qji.b bVarU2 = indiaNetBankingInstitutionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.di.IndiaNetBankingInstitutionsScreenComponent.Injector");
                        f0 f0Var = (f0) bVarU2;
                        t tVar = f0Var.f304845b;
                        f0 f0Var2 = f0Var.f304846c;
                        f fVar = indiaNetBankingInstitutionsScreen.K;
                        fVar.getClass();
                        return new u(tVar, f0Var2, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaNetBankingInstitutionsScreen.S;
                        return (j) ((u) indiaNetBankingInstitutionsScreen.M.getValue()).f305100b.get();
                    default:
                        KProperty[] kPropertyArr3 = IndiaNetBankingInstitutionsScreen.S;
                        IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen2 = this.f217180b;
                        return dli.f.a(indiaNetBankingInstitutionsScreen2, (j) indiaNetBankingInstitutionsScreen2.N.getValue(), v.k(indiaNetBankingInstitutionsScreen2.P, indiaNetBankingInstitutionsScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaNetBankingInstitutionsScreen f217180b;

            {
                this.f217180b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen = this.f217180b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaNetBankingInstitutionsScreen.S;
                        qji.b bVarU2 = indiaNetBankingInstitutionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.di.IndiaNetBankingInstitutionsScreenComponent.Injector");
                        f0 f0Var = (f0) bVarU2;
                        t tVar = f0Var.f304845b;
                        f0 f0Var2 = f0Var.f304846c;
                        f fVar = indiaNetBankingInstitutionsScreen.K;
                        fVar.getClass();
                        return new u(tVar, f0Var2, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaNetBankingInstitutionsScreen.S;
                        return (j) ((u) indiaNetBankingInstitutionsScreen.M.getValue()).f305100b.get();
                    default:
                        KProperty[] kPropertyArr3 = IndiaNetBankingInstitutionsScreen.S;
                        IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen2 = this.f217180b;
                        return dli.f.a(indiaNetBankingInstitutionsScreen2, (j) indiaNetBankingInstitutionsScreen2.N.getValue(), v.k(indiaNetBankingInstitutionsScreen2.P, indiaNetBankingInstitutionsScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: nm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaNetBankingInstitutionsScreen f217180b;

            {
                this.f217180b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen = this.f217180b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaNetBankingInstitutionsScreen.S;
                        qji.b bVarU2 = indiaNetBankingInstitutionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.di.IndiaNetBankingInstitutionsScreenComponent.Injector");
                        f0 f0Var = (f0) bVarU2;
                        t tVar = f0Var.f304845b;
                        f0 f0Var2 = f0Var.f304846c;
                        f fVar = indiaNetBankingInstitutionsScreen.K;
                        fVar.getClass();
                        return new u(tVar, f0Var2, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaNetBankingInstitutionsScreen.S;
                        return (j) ((u) indiaNetBankingInstitutionsScreen.M.getValue()).f305100b.get();
                    default:
                        KProperty[] kPropertyArr3 = IndiaNetBankingInstitutionsScreen.S;
                        IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen2 = this.f217180b;
                        return dli.f.a(indiaNetBankingInstitutionsScreen2, (j) indiaNetBankingInstitutionsScreen2.N.getValue(), v.k(indiaNetBankingInstitutionsScreen2.P, indiaNetBankingInstitutionsScreen2.Q, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.india_core_topup_net_banking_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.india_core_topup_net_banking_selection_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new j2(this, null, 14), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59409p.f57337m), new d(this, null, 1), 3);
        ViewController.P2(this, new n(rd0.e.b(this.P.f53218h), 6), new d(this, null, 0), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
