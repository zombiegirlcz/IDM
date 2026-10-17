package com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
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
import woc.p;
import x0f.g;
import xf6.y0;
import xf6.z0;
import xkf.c;
import xki.e;
import xn6.b;
import xn6.d;
import xn6.f;
import xn6.j;
import xn6.k;
import xn6.l;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/screens/institutions_list/InstitutionsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxn6/j;", "Ldli/a;", "Lxn6/l;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstitutionsListScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InstitutionsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final f K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public InstitutionsListScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstitutionsListScreen f307315b;

            {
                this.f307315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstitutionsListScreen institutionsListScreen = this.f307315b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstitutionsListScreen.S;
                        qji.b bVarU2 = institutionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.di.InstitutionsListScreenInjector");
                        y0 y0Var = (y0) ((yn6.a) bVarU2).c().mo3808a(institutionsListScreen);
                        f fVar = institutionsListScreen.K;
                        switch (y0Var.f305168a) {
                            case 0:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                            case 1:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                            default:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                        }
                        return (z0) y0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InstitutionsListScreen.S;
                        z0 z0Var = (z0) institutionsListScreen.N.getValue();
                        switch (z0Var.f305185a) {
                            case 0:
                                return (k) z0Var.e.get();
                            case 1:
                                return (k) z0Var.e.get();
                            default:
                                return (k) z0Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = InstitutionsListScreen.S;
                        InstitutionsListScreen institutionsListScreen2 = this.f307315b;
                        return dli.f.a(institutionsListScreen2, institutionsListScreen2.R2(), v.k((RowDelegate) institutionsListScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) institutionsListScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstitutionsListScreen f307315b;

            {
                this.f307315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstitutionsListScreen institutionsListScreen = this.f307315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstitutionsListScreen.S;
                        qji.b bVarU2 = institutionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.di.InstitutionsListScreenInjector");
                        y0 y0Var = (y0) ((yn6.a) bVarU2).c().mo3808a(institutionsListScreen);
                        f fVar = institutionsListScreen.K;
                        switch (y0Var.f305168a) {
                            case 0:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                            case 1:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                            default:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                        }
                        return (z0) y0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InstitutionsListScreen.S;
                        z0 z0Var = (z0) institutionsListScreen.N.getValue();
                        switch (z0Var.f305185a) {
                            case 0:
                                return (k) z0Var.e.get();
                            case 1:
                                return (k) z0Var.e.get();
                            default:
                                return (k) z0Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = InstitutionsListScreen.S;
                        InstitutionsListScreen institutionsListScreen2 = this.f307315b;
                        return dli.f.a(institutionsListScreen2, institutionsListScreen2.R2(), v.k((RowDelegate) institutionsListScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) institutionsListScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new c(20));
        this.Q = w.y0(new c(21));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: xn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstitutionsListScreen f307315b;

            {
                this.f307315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstitutionsListScreen institutionsListScreen = this.f307315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstitutionsListScreen.S;
                        qji.b bVarU2 = institutionsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.di.InstitutionsListScreenInjector");
                        y0 y0Var = (y0) ((yn6.a) bVarU2).c().mo3808a(institutionsListScreen);
                        f fVar = institutionsListScreen.K;
                        switch (y0Var.f305168a) {
                            case 0:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                            case 1:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                            default:
                                fVar.getClass();
                                y0Var.d = fVar;
                                break;
                        }
                        return (z0) y0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InstitutionsListScreen.S;
                        z0 z0Var = (z0) institutionsListScreen.N.getValue();
                        switch (z0Var.f305185a) {
                            case 0:
                                return (k) z0Var.e.get();
                            case 1:
                                return (k) z0Var.e.get();
                            default:
                                return (k) z0Var.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = InstitutionsListScreen.S;
                        InstitutionsListScreen institutionsListScreen2 = this.f307315b;
                        return dli.f.a(institutionsListScreen2, institutionsListScreen2.R2(), v.k((RowDelegate) institutionsListScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), (FullScreenStateDelegate) institutionsListScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((l) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (this.K.f307319a.f72290g) {
            return super.F2();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.external_institutions_selection_search_title, null, null, 14));
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        f fVar = this.K;
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration = fVar.f307319a;
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration2 = fVar.f307319a;
        navBarWithToolbar2.setNavigationButtonImage(externalInstitutionsConfiguration.f72290g ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(externalInstitutionsConfiguration2.f72287a, null);
        navBarWithToolbar.setToolbarTitle(externalInstitutionsConfiguration2.f72287a);
        Clause clause = externalInstitutionsConfiguration2.f72288b;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionText(clause);
        }
        navBarWithToolbar.setSecondDescriptionVisible(externalInstitutionsConfiguration2.f72288b != null);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new g(this, null, 29), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new p(2, R2(), k.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 4, 7), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new bl6.f(navBarWithToolbar, null, 8), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), new xn6.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new d(2, 4, k.class, R2(), "onItemClicked", "onItemClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
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
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
