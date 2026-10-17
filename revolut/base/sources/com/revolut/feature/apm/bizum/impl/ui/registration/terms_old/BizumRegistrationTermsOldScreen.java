package com.revolut.feature.apm.bizum.impl.ui.registration.terms_old;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.impl.R$id;
import com.revolut.feature.apm.bizum.impl.R$layout;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.BizumRegistrationTermsOldScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import fnk.a;
import ft1.c;
import ft1.d;
import ft1.e;
import ft1.f;
import ft1.i;
import ft1.j;
import ft1.k;
import ft1.m;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.q;
import ms1.p;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/terms_old/BizumRegistrationTermsOldScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lft1/f;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$InputData;", "Lft1/d;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumRegistrationTermsOldScreen extends BaseRecyclerViewScreen<f, BizumRegistrationFlowContract$InputData, d> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61594d0 = {o0.f186429a.j(new h0(BizumRegistrationTermsOldScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumRegistrationBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61595a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f61596b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizumRegistrationTermsOldScreen(BizumRegistrationFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_bizum_registration;
        this.V = R$id.bizumRegistration_recyclerView;
        this.W = true;
        this.X = s.t(this, ft1.h.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ft1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationTermsOldScreen f137778b;

            {
                this.f137778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BizumRegistrationTermsOldScreen bizumRegistrationTermsOldScreen = this.f137778b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationTermsOldScreen.f61594d0;
                        qji.b bVarQ2 = bizumRegistrationTermsOldScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.di.BizumRegistrationTermsOldScreenInjector");
                        ms1.n nVar = (ms1.n) bVarQ2;
                        ms1.j jVar = nVar.f208560b;
                        ms1.n nVar2 = nVar.f208561c;
                        p pVar = new p();
                        int i3 = 24;
                        pVar.f208565a = e4m.b.b(new q(jVar, nVar2, pVar, 1, i3));
                        pVar.f208566b = e4m.b.b(new q(jVar, nVar2, pVar, 0, i3));
                        pVar.f208567c = e4m.b.b(new q(jVar, nVar2, pVar, 3, i3));
                        pVar.d = e4m.b.b(new q(jVar, nVar2, pVar, 2, i3));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BizumRegistrationTermsOldScreen.f61594d0;
                        return (e) ((p) bizumRegistrationTermsOldScreen.Y.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = BizumRegistrationTermsOldScreen.f61594d0;
                        return v.k((RowDelegate) bizumRegistrationTermsOldScreen.f61595a0.getValue(), (InputChecklistDelegate) bizumRegistrationTermsOldScreen.f61596b0.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: ft1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationTermsOldScreen f137778b;

            {
                this.f137778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BizumRegistrationTermsOldScreen bizumRegistrationTermsOldScreen = this.f137778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationTermsOldScreen.f61594d0;
                        qji.b bVarQ2 = bizumRegistrationTermsOldScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.di.BizumRegistrationTermsOldScreenInjector");
                        ms1.n nVar = (ms1.n) bVarQ2;
                        ms1.j jVar = nVar.f208560b;
                        ms1.n nVar2 = nVar.f208561c;
                        p pVar = new p();
                        int i3 = 24;
                        pVar.f208565a = e4m.b.b(new q(jVar, nVar2, pVar, 1, i3));
                        pVar.f208566b = e4m.b.b(new q(jVar, nVar2, pVar, 0, i3));
                        pVar.f208567c = e4m.b.b(new q(jVar, nVar2, pVar, 3, i3));
                        pVar.d = e4m.b.b(new q(jVar, nVar2, pVar, 2, i3));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BizumRegistrationTermsOldScreen.f61594d0;
                        return (e) ((p) bizumRegistrationTermsOldScreen.Y.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = BizumRegistrationTermsOldScreen.f61594d0;
                        return v.k((RowDelegate) bizumRegistrationTermsOldScreen.f61595a0.getValue(), (InputChecklistDelegate) bizumRegistrationTermsOldScreen.f61596b0.getValue());
                }
            }
        });
        this.f61595a0 = w.y0(new a(22));
        this.f61596b0 = w.y0(new a(23));
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: ft1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationTermsOldScreen f137778b;

            {
                this.f137778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BizumRegistrationTermsOldScreen bizumRegistrationTermsOldScreen = this.f137778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationTermsOldScreen.f61594d0;
                        qji.b bVarQ2 = bizumRegistrationTermsOldScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.di.BizumRegistrationTermsOldScreenInjector");
                        ms1.n nVar = (ms1.n) bVarQ2;
                        ms1.j jVar = nVar.f208560b;
                        ms1.n nVar2 = nVar.f208561c;
                        p pVar = new p();
                        int i32 = 24;
                        pVar.f208565a = e4m.b.b(new q(jVar, nVar2, pVar, 1, i32));
                        pVar.f208566b = e4m.b.b(new q(jVar, nVar2, pVar, 0, i32));
                        pVar.f208567c = e4m.b.b(new q(jVar, nVar2, pVar, 3, i32));
                        pVar.d = e4m.b.b(new q(jVar, nVar2, pVar, 2, i32));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BizumRegistrationTermsOldScreen.f61594d0;
                        return (e) ((p) bizumRegistrationTermsOldScreen.Y.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = BizumRegistrationTermsOldScreen.f61594d0;
                        return v.k((RowDelegate) bizumRegistrationTermsOldScreen.f61595a0.getValue(), (InputChecklistDelegate) bizumRegistrationTermsOldScreen.f61596b0.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((m) ((e) this.Z.getValue())).v2(c.f137774a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f189090b.setEnabled(uiState.f137776b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (p) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f189091c.f59410q), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f189090b.o), null, new i(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.f61595a0.getValue()).f53218h), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.f61596b0.getValue()).f52518c), null, new k(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f189091c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.bizum_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.bizum_registration_terms_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.bizum_registration_terms_title, null, null, 14), null);
        LargeActionButton largeActionButton = g3().f189090b;
        largeActionButton.setLoadingButtonTag("BIZUM_REG_TERMS_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.bizum_registration_terms_action, null, null, 14));
        largeActionButton.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f189090b.setEnabled(uiState.f137776b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106400d0() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getU() {
        return this.V;
    }

    public final ks1.b g3() {
        ViewBinding value = this.X.getValue(this, f61594d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ks1.b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
