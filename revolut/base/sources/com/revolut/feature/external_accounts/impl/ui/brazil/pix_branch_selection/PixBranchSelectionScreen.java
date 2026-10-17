package com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import bl6.f;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p0l.d;
import pk6.b;
import pk6.h;
import pk6.i;
import pk6.j;
import te0.w;
import vc.s;
import xf6.k0;
import xf6.o;
import xf6.t;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/pix_branch_selection/PixBranchSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpk6/h;", "Ldli/a;", "Lpk6/i;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixBranchSelectionScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PixBranchSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PixBranchSelectionScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;

    public PixBranchSelectionScreen(PixBranchSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: pk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixBranchSelectionScreen f236924b;

            {
                this.f236924b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixBranchSelectionScreen pixBranchSelectionScreen = this.f236924b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixBranchSelectionScreen.R;
                        qji.b bVarU2 = pixBranchSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.di.PixBranchSelectionScreenComponent.Injector");
                        o oVar = (o) bVarU2;
                        t tVar = oVar.f304970b;
                        o oVar2 = oVar.f304971c;
                        PixBranchSelectionScreenContract$InputData pixBranchSelectionScreenContract$InputData = pixBranchSelectionScreen.K;
                        pixBranchSelectionScreenContract$InputData.getClass();
                        return new k0(tVar, oVar2, pixBranchSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PixBranchSelectionScreen.R;
                        return (j) ((k0) pixBranchSelectionScreen.N.getValue()).f304912c.get();
                    default:
                        KProperty[] kPropertyArr3 = PixBranchSelectionScreen.R;
                        PixBranchSelectionScreen pixBranchSelectionScreen2 = this.f236924b;
                        return dli.f.a(pixBranchSelectionScreen2, pixBranchSelectionScreen2.R2(), u.c(pixBranchSelectionScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: pk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixBranchSelectionScreen f236924b;

            {
                this.f236924b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixBranchSelectionScreen pixBranchSelectionScreen = this.f236924b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixBranchSelectionScreen.R;
                        qji.b bVarU2 = pixBranchSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.di.PixBranchSelectionScreenComponent.Injector");
                        o oVar = (o) bVarU2;
                        t tVar = oVar.f304970b;
                        o oVar2 = oVar.f304971c;
                        PixBranchSelectionScreenContract$InputData pixBranchSelectionScreenContract$InputData = pixBranchSelectionScreen.K;
                        pixBranchSelectionScreenContract$InputData.getClass();
                        return new k0(tVar, oVar2, pixBranchSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PixBranchSelectionScreen.R;
                        return (j) ((k0) pixBranchSelectionScreen.N.getValue()).f304912c.get();
                    default:
                        KProperty[] kPropertyArr3 = PixBranchSelectionScreen.R;
                        PixBranchSelectionScreen pixBranchSelectionScreen2 = this.f236924b;
                        return dli.f.a(pixBranchSelectionScreen2, pixBranchSelectionScreen2.R2(), u.c(pixBranchSelectionScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: pk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixBranchSelectionScreen f236924b;

            {
                this.f236924b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixBranchSelectionScreen pixBranchSelectionScreen = this.f236924b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixBranchSelectionScreen.R;
                        qji.b bVarU2 = pixBranchSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.di.PixBranchSelectionScreenComponent.Injector");
                        o oVar = (o) bVarU2;
                        t tVar = oVar.f304970b;
                        o oVar2 = oVar.f304971c;
                        PixBranchSelectionScreenContract$InputData pixBranchSelectionScreenContract$InputData = pixBranchSelectionScreen.K;
                        pixBranchSelectionScreenContract$InputData.getClass();
                        return new k0(tVar, oVar2, pixBranchSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PixBranchSelectionScreen.R;
                        return (j) ((k0) pixBranchSelectionScreen.N.getValue()).f304912c.get();
                    default:
                        KProperty[] kPropertyArr3 = PixBranchSelectionScreen.R;
                        PixBranchSelectionScreen pixBranchSelectionScreen2 = this.f236924b;
                        return dli.f.a(pixBranchSelectionScreen2, pixBranchSelectionScreen2.R2(), u.c(pixBranchSelectionScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_pix_smart_transfer_branch_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.topup_pix_smart_transfer_branch_selection_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.topup_pix_smart_transfer_bank_selection_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, null, 25), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ViewController.P2(this, rd0.e.b(searchView.f57337m), new pk6.d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(searchView.f57336l), new f(navBarWithToolbar, null, 5), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(this.P.f53218h), 12), new pk6.d(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
