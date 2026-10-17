package com.revolut.feature.apm.bizum.impl.ui.registration.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.registration.confirmation.BizumRegistrationConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.q;
import ms1.n;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import yna.j1;
import ys1.c;
import ys1.e;
import ys1.f;
import ys1.g;
import ys1.i;
import ys1.j;
import ys1.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/confirmation/BizumRegistrationConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lys1/g;", "Lcom/revolut/feature/apm/bizum/impl/ui/registration/BizumRegistrationFlowContract$InputData;", "Lys1/e;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumRegistrationConfirmationScreen extends BaseRecyclerViewScreen<g, BizumRegistrationFlowContract$InputData, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61590b0 = {o0.f186429a.j(new h0(BizumRegistrationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61591a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizumRegistrationConfirmationScreen(BizumRegistrationFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.V = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
        this.W = true;
        this.X = s.t(this, i.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ys1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationConfirmationScreen f316390b;

            {
                this.f316390b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BizumRegistrationConfirmationScreen bizumRegistrationConfirmationScreen = this.f316390b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationConfirmationScreen.f61590b0;
                        qji.b bVarQ2 = bizumRegistrationConfirmationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.confirmation.di.BizumRegistrationConfirmationScreenInjector");
                        n nVar = (n) bVarQ2;
                        ms1.j jVar = nVar.f208560b;
                        n nVar2 = nVar.f208561c;
                        ms1.m mVar = new ms1.m();
                        mVar.f208556a = e4m.b.b(new q(jVar, nVar2, mVar, 1, 23));
                        mVar.f208557b = e4m.b.b(new q(jVar, nVar2, mVar, 0, 23));
                        mVar.f208558c = e4m.b.b(new q(jVar, nVar2, mVar, 3, 23));
                        mVar.d = e4m.b.b(new q(jVar, nVar2, mVar, 2, 23));
                        return mVar;
                    default:
                        KProperty[] kPropertyArr2 = BizumRegistrationConfirmationScreen.f61590b0;
                        return (f) ((ms1.m) bizumRegistrationConfirmationScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: ys1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationConfirmationScreen f316390b;

            {
                this.f316390b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BizumRegistrationConfirmationScreen bizumRegistrationConfirmationScreen = this.f316390b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationConfirmationScreen.f61590b0;
                        qji.b bVarQ2 = bizumRegistrationConfirmationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.confirmation.di.BizumRegistrationConfirmationScreenInjector");
                        n nVar = (n) bVarQ2;
                        ms1.j jVar = nVar.f208560b;
                        n nVar2 = nVar.f208561c;
                        ms1.m mVar = new ms1.m();
                        mVar.f208556a = e4m.b.b(new q(jVar, nVar2, mVar, 1, 23));
                        mVar.f208557b = e4m.b.b(new q(jVar, nVar2, mVar, 0, 23));
                        mVar.f208558c = e4m.b.b(new q(jVar, nVar2, mVar, 3, 23));
                        mVar.d = e4m.b.b(new q(jVar, nVar2, mVar, 2, 23));
                        return mVar;
                    default:
                        KProperty[] kPropertyArr2 = BizumRegistrationConfirmationScreen.f61590b0;
                        return (f) ((ms1.m) bizumRegistrationConfirmationScreen.Y.getValue()).d.get();
                }
            }
        });
        this.f61591a0 = w.y0(new j1(14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((k) ((f) this.Z.getValue())).v2(c.f316385a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174558c.setTextClause(uiState.f316388b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (ms1.m) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, rd0.e.b(g3().e.f59410q), null, new j(this, null, 0), 3);
        a.g2(this, rd0.e.b(g3().f174557b.o), null, new j(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.bizum_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.bizum_registration_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.bizum_registration_confirmation_title, null, null, 14), null);
        LargeActionButton largeActionButton = g3().f174557b;
        largeActionButton.setLoadingButtonTag("BIZUM_REG_CONFIRMATION_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.bizum_registration_confirmation_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        g uiState = (g) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174558c.setTextClause(uiState.f316388b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f61591a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final jii.s g3() {
        ViewBinding value = this.X.getValue(this, f61590b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
