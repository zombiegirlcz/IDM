package com.revolut.feature.apm.bizum.impl.ui.registration.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.impl.R$id;
import com.revolut.feature.apm.bizum.impl.R$layout;
import com.revolut.feature.apm.bizum.impl.ui.registration.intro.BizumRegistrationIntroScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ct1.c;
import ct1.d;
import ct1.e;
import ct1.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ks1.b;
import ms1.o;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/registration/intro/BizumRegistrationIntroScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lct1/e;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lct1/d;", "<init>", "()V", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumRegistrationIntroScreen extends BaseRecyclerViewScreen<e, IOData$EmptyInput, d> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61592b0 = {o0.f186429a.j(new h0(BizumRegistrationIntroScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumRegistrationBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61593a0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumRegistrationBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return b.a(p0);
        }
    }

    public BizumRegistrationIntroScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_bizum_registration;
        this.V = R$id.bizumRegistration_recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ct1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationIntroScreen f108616b;

            {
                this.f108616b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BizumRegistrationIntroScreen bizumRegistrationIntroScreen = this.f108616b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationIntroScreen.f61592b0;
                        qji.b bVarQ2 = bizumRegistrationIntroScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.intro.di.BizumRegistrationIntroScreenInjector");
                        o oVar = new o();
                        oVar.f208563a = e4m.b.b(new mil.a(oVar, 1, 7));
                        oVar.f208564b = e4m.b.b(new mil.a(oVar, 0, 7));
                        return oVar;
                    default:
                        KProperty[] kPropertyArr2 = BizumRegistrationIntroScreen.f61592b0;
                        return (h) ((o) bizumRegistrationIntroScreen.Y.getValue()).f208564b.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: ct1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumRegistrationIntroScreen f108616b;

            {
                this.f108616b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BizumRegistrationIntroScreen bizumRegistrationIntroScreen = this.f108616b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumRegistrationIntroScreen.f61592b0;
                        qji.b bVarQ2 = bizumRegistrationIntroScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.registration.intro.di.BizumRegistrationIntroScreenInjector");
                        o oVar = new o();
                        oVar.f208563a = e4m.b.b(new mil.a(oVar, 1, 7));
                        oVar.f208564b = e4m.b.b(new mil.a(oVar, 0, 7));
                        return oVar;
                    default:
                        KProperty[] kPropertyArr2 = BizumRegistrationIntroScreen.f61592b0;
                        return (h) ((o) bizumRegistrationIntroScreen.Y.getValue()).f208564b.get();
                }
            }
        });
        this.f61593a0 = w.y0(new cpi.b(10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((ct1.h) this.Z.getValue()).v2(c.f108613a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (o) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ct1.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f189091c.f59410q), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f189090b.o), null, new g(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f189091c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.bizum_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.bizum_registration_intro_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.bizum_registration_intro_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.bizum_registration_intro_title_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        g3().f189090b.setText(new TextLocalisedClause(R$string.bizum_registration_intro_action, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f61593a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final b g3() {
        ViewBinding value = this.X.getValue(this, f61592b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
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
