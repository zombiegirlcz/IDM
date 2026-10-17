package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.AccessDetailsAuScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.AccessDetailsAuScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.c3;
import xf6.d3;
import xki.e;
import yi6.b;
import yi6.c;
import yi6.d;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/accounts_au/access_detail_au/AccessDetailsAuScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyi6/d;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccessDetailsAuScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccessDetailsAuScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AccessDetailsAuScreenContract$InputData K;
    public final h L;
    public final int M;
    public final TextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AccessDetailsAuScreen(AccessDetailsAuScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: yi6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessDetailsAuScreen f314261b;

            {
                this.f314261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccessDetailsAuScreen accessDetailsAuScreen = this.f314261b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccessDetailsAuScreen.R;
                        AccessDetailsAuScreen accessDetailsAuScreen2 = this.f314261b;
                        return dli.f.a(accessDetailsAuScreen2, (c) accessDetailsAuScreen2.Q.getValue(), v.k(new RowDelegate(null, null, 7), accessDetailsAuScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessDetailsAuScreen.R;
                        qji.b bVarU2 = accessDetailsAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.di.AccessDetailAuScreenInjector");
                        c3 c3Var = (c3) ((zi6.a) bVarU2).b().mo3808a(accessDetailsAuScreen);
                        AccessDetailsAuScreenContract$InputData accessDetailsAuScreenContract$InputData = accessDetailsAuScreen.K;
                        switch (c3Var.f304813a) {
                            case 0:
                                accessDetailsAuScreenContract$InputData.getClass();
                                c3Var.d = accessDetailsAuScreenContract$InputData;
                                break;
                            default:
                                accessDetailsAuScreenContract$InputData.getClass();
                                c3Var.d = accessDetailsAuScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AccessDetailsAuScreen.R;
                        d3 d3Var = (d3) accessDetailsAuScreen.P.getValue();
                        switch (d3Var.f304824a) {
                            case 0:
                                return (c) d3Var.d.get();
                            default:
                                return (c) d3Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: yi6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessDetailsAuScreen f314261b;

            {
                this.f314261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccessDetailsAuScreen accessDetailsAuScreen = this.f314261b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccessDetailsAuScreen.R;
                        AccessDetailsAuScreen accessDetailsAuScreen2 = this.f314261b;
                        return dli.f.a(accessDetailsAuScreen2, (c) accessDetailsAuScreen2.Q.getValue(), v.k(new RowDelegate(null, null, 7), accessDetailsAuScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessDetailsAuScreen.R;
                        qji.b bVarU2 = accessDetailsAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.di.AccessDetailAuScreenInjector");
                        c3 c3Var = (c3) ((zi6.a) bVarU2).b().mo3808a(accessDetailsAuScreen);
                        AccessDetailsAuScreenContract$InputData accessDetailsAuScreenContract$InputData = accessDetailsAuScreen.K;
                        switch (c3Var.f304813a) {
                            case 0:
                                accessDetailsAuScreenContract$InputData.getClass();
                                c3Var.d = accessDetailsAuScreenContract$InputData;
                                break;
                            default:
                                accessDetailsAuScreenContract$InputData.getClass();
                                c3Var.d = accessDetailsAuScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AccessDetailsAuScreen.R;
                        d3 d3Var = (d3) accessDetailsAuScreen.P.getValue();
                        switch (d3Var.f304824a) {
                            case 0:
                                return (c) d3Var.d.get();
                            default:
                                return (c) d3Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: yi6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessDetailsAuScreen f314261b;

            {
                this.f314261b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccessDetailsAuScreen accessDetailsAuScreen = this.f314261b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccessDetailsAuScreen.R;
                        AccessDetailsAuScreen accessDetailsAuScreen2 = this.f314261b;
                        return dli.f.a(accessDetailsAuScreen2, (c) accessDetailsAuScreen2.Q.getValue(), v.k(new RowDelegate(null, null, 7), accessDetailsAuScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessDetailsAuScreen.R;
                        qji.b bVarU2 = accessDetailsAuScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.di.AccessDetailAuScreenInjector");
                        c3 c3Var = (c3) ((zi6.a) bVarU2).b().mo3808a(accessDetailsAuScreen);
                        AccessDetailsAuScreenContract$InputData accessDetailsAuScreenContract$InputData = accessDetailsAuScreen.K;
                        switch (c3Var.f304813a) {
                            case 0:
                                accessDetailsAuScreenContract$InputData.getClass();
                                c3Var.d = accessDetailsAuScreenContract$InputData;
                                break;
                            default:
                                accessDetailsAuScreenContract$InputData.getClass();
                                c3Var.d = accessDetailsAuScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AccessDetailsAuScreen.R;
                        d3 d3Var = (d3) accessDetailsAuScreen.P.getValue();
                        switch (d3Var.f304824a) {
                            case 0:
                                return (c) d3Var.d.get();
                            default:
                                return (c) d3Var.d.get();
                        }
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
        return (d3) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.auth_account_access_details_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.auth_account_access_details_subtitle, u.c(this.K.f72524a), null, 12));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new y5g.d(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new y83.d(this, (Continuation) null, 27), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
