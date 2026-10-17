package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details.AccessDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import ui6.b;
import ui6.c;
import ui6.d;
import vc.s;
import xf6.a1;
import xf6.a2;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/accounts/access_details/AccessDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lui6/d;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccessDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AccessDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AccessDetailsScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ui6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessDetailsScreen f280310b;

            {
                this.f280310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccessDetailsScreen accessDetailsScreen = this.f280310b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccessDetailsScreen.Q;
                        AccessDetailsScreen accessDetailsScreen2 = this.f280310b;
                        return f.a(accessDetailsScreen2, (e) accessDetailsScreen2.P.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessDetailsScreen.Q;
                        qji.b bVarU2 = accessDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details.di.AccessDetailsScreenInjector");
                        a2 a2Var = new a2();
                        a2Var.f304788a = e4m.b.b(new a1(a2Var, 1, 2));
                        a2Var.f304789b = e4m.b.b(new a1(a2Var, 0, 2));
                        return a2Var;
                    default:
                        KProperty[] kPropertyArr3 = AccessDetailsScreen.Q;
                        return (e) ((a2) accessDetailsScreen.O.getValue()).f304789b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ui6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessDetailsScreen f280310b;

            {
                this.f280310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccessDetailsScreen accessDetailsScreen = this.f280310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccessDetailsScreen.Q;
                        AccessDetailsScreen accessDetailsScreen2 = this.f280310b;
                        return f.a(accessDetailsScreen2, (e) accessDetailsScreen2.P.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessDetailsScreen.Q;
                        qji.b bVarU2 = accessDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details.di.AccessDetailsScreenInjector");
                        a2 a2Var = new a2();
                        a2Var.f304788a = e4m.b.b(new a1(a2Var, 1, 2));
                        a2Var.f304789b = e4m.b.b(new a1(a2Var, 0, 2));
                        return a2Var;
                    default:
                        KProperty[] kPropertyArr3 = AccessDetailsScreen.Q;
                        return (e) ((a2) accessDetailsScreen.O.getValue()).f304789b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ui6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessDetailsScreen f280310b;

            {
                this.f280310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccessDetailsScreen accessDetailsScreen = this.f280310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccessDetailsScreen.Q;
                        AccessDetailsScreen accessDetailsScreen2 = this.f280310b;
                        return f.a(accessDetailsScreen2, (e) accessDetailsScreen2.P.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessDetailsScreen.Q;
                        qji.b bVarU2 = accessDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details.di.AccessDetailsScreenInjector");
                        a2 a2Var = new a2();
                        a2Var.f304788a = e4m.b.b(new a1(a2Var, 1, 2));
                        a2Var.f304789b = e4m.b.b(new a1(a2Var, 0, 2));
                        return a2Var;
                    default:
                        KProperty[] kPropertyArr3 = AccessDetailsScreen.Q;
                        return (e) ((a2) accessDetailsScreen.O.getValue()).f304789b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ui6.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.auth_account_access_details_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.auth_account_access_details_subtitle, u.c(this.K.f280311a), null, 12));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new uea.e(this, null, 4), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
