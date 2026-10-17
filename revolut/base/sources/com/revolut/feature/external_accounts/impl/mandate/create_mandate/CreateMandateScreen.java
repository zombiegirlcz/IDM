package com.revolut.feature.external_accounts.impl.mandate.create_mandate;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cge.g;
import ch6.d;
import ch6.e;
import ch6.f;
import ch6.j;
import ch6.k;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$id;
import com.revolut.feature.external_accounts.impl.R$layout;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import we6.m;
import xf6.s1;
import xf6.y1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/create_mandate/CreateMandateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/m;", "Ldli/a;", "Lch6/k;", "Lno/m;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateMandateScreen extends ViewController<m> implements dli.a, no.m {
    public final CreateMandateScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final CellDetailsDelegate R;
    public final CellDetailsActionDelegate S;
    public final TextDelegate T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreateMandateScreen.class, "binding", "getBinding()Lcom/revolut/feature/external_accounts/impl/databinding/ScreenCreateMandateBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CreateMandateScreen(CreateMandateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137507t;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = R$layout.screen_create_mandate;
        this.N = R$style.UiKitTheme_Transparent;
        this.O = s.t(this, e.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ch6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateMandateScreen f24126b;

            {
                this.f24126b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreateMandateScreen createMandateScreen = this.f24126b;
                switch (i2) {
                    case 0:
                        CreateMandateScreen.Companion companion2 = CreateMandateScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(createMandateScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        CreateMandateScreenContract$InputData createMandateScreenContract$InputData = createMandateScreen.K;
                        createMandateScreenContract$InputData.getClass();
                        return new s1(y1Var, createMandateScreen, createMandateScreenContract$InputData);
                    case 1:
                        CreateMandateScreen.Companion companion3 = CreateMandateScreen.INSTANCE;
                        return (j) ((s1) createMandateScreen.P.getValue()).i.get();
                    default:
                        CreateMandateScreen.Companion companion4 = CreateMandateScreen.INSTANCE;
                        CreateMandateScreen createMandateScreen2 = this.f24126b;
                        return dli.f.a(createMandateScreen2, createMandateScreen2.R2(), v.k(createMandateScreen2.R, createMandateScreen2.S, new RowLoadingDelegate(), createMandateScreen2.T), R$id.createMandateScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ch6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateMandateScreen f24126b;

            {
                this.f24126b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreateMandateScreen createMandateScreen = this.f24126b;
                switch (i22) {
                    case 0:
                        CreateMandateScreen.Companion companion2 = CreateMandateScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(createMandateScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        CreateMandateScreenContract$InputData createMandateScreenContract$InputData = createMandateScreen.K;
                        createMandateScreenContract$InputData.getClass();
                        return new s1(y1Var, createMandateScreen, createMandateScreenContract$InputData);
                    case 1:
                        CreateMandateScreen.Companion companion3 = CreateMandateScreen.INSTANCE;
                        return (j) ((s1) createMandateScreen.P.getValue()).i.get();
                    default:
                        CreateMandateScreen.Companion companion4 = CreateMandateScreen.INSTANCE;
                        CreateMandateScreen createMandateScreen2 = this.f24126b;
                        return dli.f.a(createMandateScreen2, createMandateScreen2.R2(), v.k(createMandateScreen2.R, createMandateScreen2.S, new RowLoadingDelegate(), createMandateScreen2.T), R$id.createMandateScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new CellDetailsDelegate();
        this.S = new CellDetailsActionDelegate();
        this.T = new TextDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ch6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateMandateScreen f24126b;

            {
                this.f24126b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreateMandateScreen createMandateScreen = this.f24126b;
                switch (i22) {
                    case 0:
                        CreateMandateScreen.Companion companion2 = CreateMandateScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(createMandateScreen.m2()).a().get(je6.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        CreateMandateScreenContract$InputData createMandateScreenContract$InputData = createMandateScreen.K;
                        createMandateScreenContract$InputData.getClass();
                        return new s1(y1Var, createMandateScreen, createMandateScreenContract$InputData);
                    case 1:
                        CreateMandateScreen.Companion companion3 = CreateMandateScreen.INSTANCE;
                        return (j) ((s1) createMandateScreen.P.getValue()).i.get();
                    default:
                        CreateMandateScreen.Companion companion4 = CreateMandateScreen.INSTANCE;
                        CreateMandateScreen createMandateScreen2 = this.f24126b;
                        return dli.f.a(createMandateScreen2, createMandateScreen2.R2(), v.k(createMandateScreen2.R, createMandateScreen2.S, new RowLoadingDelegate(), createMandateScreen2.T), R$id.createMandateScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f270266c.setMainButtonEnabled(!uiState.f24133b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((s1) this.P.getValue()).d.get()).d(u.c(new RowDelegate(null, null, 7)));
        d3().f270265b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        NavBarWithToolbar navBarWithToolbar = d3().d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_mandate_header, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.open_banking_mandate_header_description, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_INFO_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        d3().f270266c.setMainButtonText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        d3().f270266c.setSecondaryButtonText(new TextLocalisedClause(R$string.open_banking_common_action_not_now, null, null, 14));
        d3().f270266c.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new f(this, continuation, 0), 3);
        r rVarFilter = d3().d.o.f57403b.filter(new cd0.c(new g(5), 28));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new f(this, continuation, 1), 3);
        r rVarFilter2 = this.R.d.filter(new cd0.c(new g(6), 29));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new ch6.g(this, null), 3);
        r rVarFilter3 = this.S.d.filter(new d(new g(7), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter3), null, new ch6.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f270266c.o0()), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f270266c.p0()), null, new f(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new cbh.g(this, continuation, 15), 3);
    }

    public final tf6.a d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tf6.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
