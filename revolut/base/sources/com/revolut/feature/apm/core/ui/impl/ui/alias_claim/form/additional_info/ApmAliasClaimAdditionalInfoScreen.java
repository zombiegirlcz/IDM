package com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.m6;
import aw0.n6;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.ApmAliasClaimAdditionalInfoScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import p12.m;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import y12.c;
import y12.g;
import y12.i;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/alias_claim/form/additional_info/ApmAliasClaimAdditionalInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly12/g;", "Ldli/a;", "Ly12/h;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmAliasClaimAdditionalInfoScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ApmAliasClaimAdditionalInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar_action_footer;
    public final h L = s.t(this, a.f);
    public final InputTextDelegate O = new InputTextDelegate(null);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public ApmAliasClaimAdditionalInfoScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: y12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimAdditionalInfoScreen f310276b;

            {
                this.f310276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen = this.f310276b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimAdditionalInfoScreen.Q;
                        qji.b bVarU2 = apmAliasClaimAdditionalInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.di.ApmAliasClaimAdditionalInfoScreenInjector");
                        m mVar = new m();
                        int i3 = 23;
                        mVar.f231725a = e4m.b.b(new oai.s(mVar, 1, i3));
                        mVar.f231726b = e4m.b.b(new oai.s(mVar, 0, i3));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmAliasClaimAdditionalInfoScreen.Q;
                        return (i) ((m) apmAliasClaimAdditionalInfoScreen.M.getValue()).f231726b.get();
                    default:
                        KProperty[] kPropertyArr3 = ApmAliasClaimAdditionalInfoScreen.Q;
                        ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen2 = this.f310276b;
                        return dli.f.a(apmAliasClaimAdditionalInfoScreen2, (i) apmAliasClaimAdditionalInfoScreen2.N.getValue(), u.c(apmAliasClaimAdditionalInfoScreen2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: y12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimAdditionalInfoScreen f310276b;

            {
                this.f310276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen = this.f310276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimAdditionalInfoScreen.Q;
                        qji.b bVarU2 = apmAliasClaimAdditionalInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.di.ApmAliasClaimAdditionalInfoScreenInjector");
                        m mVar = new m();
                        int i3 = 23;
                        mVar.f231725a = e4m.b.b(new oai.s(mVar, 1, i3));
                        mVar.f231726b = e4m.b.b(new oai.s(mVar, 0, i3));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmAliasClaimAdditionalInfoScreen.Q;
                        return (i) ((m) apmAliasClaimAdditionalInfoScreen.M.getValue()).f231726b.get();
                    default:
                        KProperty[] kPropertyArr3 = ApmAliasClaimAdditionalInfoScreen.Q;
                        ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen2 = this.f310276b;
                        return dli.f.a(apmAliasClaimAdditionalInfoScreen2, (i) apmAliasClaimAdditionalInfoScreen2.N.getValue(), u.c(apmAliasClaimAdditionalInfoScreen2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: y12.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimAdditionalInfoScreen f310276b;

            {
                this.f310276b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen = this.f310276b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimAdditionalInfoScreen.Q;
                        qji.b bVarU2 = apmAliasClaimAdditionalInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.di.ApmAliasClaimAdditionalInfoScreenInjector");
                        m mVar = new m();
                        int i32 = 23;
                        mVar.f231725a = e4m.b.b(new oai.s(mVar, 1, i32));
                        mVar.f231726b = e4m.b.b(new oai.s(mVar, 0, i32));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ApmAliasClaimAdditionalInfoScreen.Q;
                        return (i) ((m) apmAliasClaimAdditionalInfoScreen.M.getValue()).f231726b.get();
                    default:
                        KProperty[] kPropertyArr3 = ApmAliasClaimAdditionalInfoScreen.Q;
                        ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen2 = this.f310276b;
                        return dli.f.a(apmAliasClaimAdditionalInfoScreen2, (i) apmAliasClaimAdditionalInfoScreen2.N.getValue(), u.c(apmAliasClaimAdditionalInfoScreen2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((y12.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_alias_ownership_claim_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_alias_ownership_claim_details_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.apm_alias_ownership_claim_details_subtitle, null, null, 14));
        d3().f174533b.setModel(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.apm_alias_ownership_claim_details_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new y12.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new y12.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.e.f121375b), null, new c(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
