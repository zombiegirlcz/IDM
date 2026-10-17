package com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import b0a.j;
import b22.b;
import b22.c;
import b22.d;
import b22.h;
import b22.i;
import b22.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreen;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.p;
import p12.r;
import p12.v;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/alias_claim/form/upload/ApmAliasClaimUploadScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb22/h;", "Ldli/a;", "Lb22/i;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmAliasClaimUploadScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ApmAliasClaimUploadScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final ApmAliasClaimUploadScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;

    public ApmAliasClaimUploadScreen(ApmAliasClaimUploadScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: b22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimUploadScreen f11856b;

            {
                this.f11856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmAliasClaimUploadScreen apmAliasClaimUploadScreen = this.f11856b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimUploadScreen.R;
                        qji.b bVarU2 = apmAliasClaimUploadScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.di.ApmAliasClaimUploadScreenInjector");
                        p pVar = (p) bVarU2;
                        v vVar = pVar.f231738a;
                        p pVar2 = pVar.f231739b;
                        ApmAliasClaimUploadScreenContract$InputData apmAliasClaimUploadScreenContract$InputData = apmAliasClaimUploadScreen.K;
                        apmAliasClaimUploadScreenContract$InputData.getClass();
                        return new r(vVar, pVar2, apmAliasClaimUploadScreen, apmAliasClaimUploadScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmAliasClaimUploadScreen.R;
                        return (m) ((r) apmAliasClaimUploadScreen.N.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = ApmAliasClaimUploadScreen.R;
                        ApmAliasClaimUploadScreen apmAliasClaimUploadScreen2 = this.f11856b;
                        return dli.f.a(apmAliasClaimUploadScreen2, apmAliasClaimUploadScreen2.d(), zhm.v.k(apmAliasClaimUploadScreen2.P, new CellDetailsListDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: b22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimUploadScreen f11856b;

            {
                this.f11856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmAliasClaimUploadScreen apmAliasClaimUploadScreen = this.f11856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimUploadScreen.R;
                        qji.b bVarU2 = apmAliasClaimUploadScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.di.ApmAliasClaimUploadScreenInjector");
                        p pVar = (p) bVarU2;
                        v vVar = pVar.f231738a;
                        p pVar2 = pVar.f231739b;
                        ApmAliasClaimUploadScreenContract$InputData apmAliasClaimUploadScreenContract$InputData = apmAliasClaimUploadScreen.K;
                        apmAliasClaimUploadScreenContract$InputData.getClass();
                        return new r(vVar, pVar2, apmAliasClaimUploadScreen, apmAliasClaimUploadScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmAliasClaimUploadScreen.R;
                        return (m) ((r) apmAliasClaimUploadScreen.N.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = ApmAliasClaimUploadScreen.R;
                        ApmAliasClaimUploadScreen apmAliasClaimUploadScreen2 = this.f11856b;
                        return dli.f.a(apmAliasClaimUploadScreen2, apmAliasClaimUploadScreen2.d(), zhm.v.k(apmAliasClaimUploadScreen2.P, new CellDetailsListDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: b22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimUploadScreen f11856b;

            {
                this.f11856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmAliasClaimUploadScreen apmAliasClaimUploadScreen = this.f11856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimUploadScreen.R;
                        qji.b bVarU2 = apmAliasClaimUploadScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.di.ApmAliasClaimUploadScreenInjector");
                        p pVar = (p) bVarU2;
                        v vVar = pVar.f231738a;
                        p pVar2 = pVar.f231739b;
                        ApmAliasClaimUploadScreenContract$InputData apmAliasClaimUploadScreenContract$InputData = apmAliasClaimUploadScreen.K;
                        apmAliasClaimUploadScreenContract$InputData.getClass();
                        return new r(vVar, pVar2, apmAliasClaimUploadScreen, apmAliasClaimUploadScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmAliasClaimUploadScreen.R;
                        return (m) ((r) apmAliasClaimUploadScreen.N.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = ApmAliasClaimUploadScreen.R;
                        ApmAliasClaimUploadScreen apmAliasClaimUploadScreen2 = this.f11856b;
                        return dli.f.a(apmAliasClaimUploadScreen2, apmAliasClaimUploadScreen2.d(), zhm.v.k(apmAliasClaimUploadScreen2.P, new CellDetailsListDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174533b.setModel(uiState.f11861b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.apm_alias_ownership_claim_upload_subtitle, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new c(this, null, 1), 3);
        RowDelegate rowDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(rowDelegate.k, new j(7))), null, new avk.i(this, null, 14), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
