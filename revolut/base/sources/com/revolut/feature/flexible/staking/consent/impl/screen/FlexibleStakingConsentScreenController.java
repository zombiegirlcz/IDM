package com.revolut.feature.flexible.staking.consent.impl.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aq6.b;
import aq6.e;
import au0.b1;
import au0.c1;
import au0.m0;
import au0.u0;
import aw0.n6;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.flexible.staking.consent.impl.R$layout;
import com.revolut.feature.flexible.staking.consent.impl.R$string;
import com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jp9.l;
import jq6.c;
import jq6.d;
import jq6.f;
import jq6.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/flexible/staking/consent/impl/screen/FlexibleStakingConsentScreenController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laq6/e;", "Ldli/a;", "Ljq6/d;", "Companion", "a", "feature_flexible_staking_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlexibleStakingConsentScreenController extends ViewController<e> implements a {
    public final b K;
    public final int L;
    public final int M;
    public final h N;
    public final androidx.camera.viewfinder.a O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FlexibleStakingConsentScreenController.class, "binding", "getBinding()Lcom/revolut/feature/flexible/staking/consent/impl/databinding/ScreenFlexibleStakingConsentBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public FlexibleStakingConsentScreenController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_flexible_staking_consent;
        this.M = R$style.UiKitTheme_TransparentNight;
        this.N = s.t(this, f.f);
        this.O = new androidx.camera.viewfinder.a(this, 14);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: jq6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexibleStakingConsentScreenController f177483b;

            {
                this.f177483b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FlexibleStakingConsentScreenController flexibleStakingConsentScreenController = this.f177483b;
                switch (i2) {
                    case 0:
                        FlexibleStakingConsentScreenController.Companion companion = FlexibleStakingConsentScreenController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(flexibleStakingConsentScreenController.m2()).a().get(fq6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fq6.a.class, " is not found"));
                        }
                        fq6.a aVar3 = ((fq6.a) aVar2.b()).f137192g;
                        aq6.b bVar = flexibleStakingConsentScreenController.K;
                        bVar.getClass();
                        return new fq6.b(aVar3, bVar);
                    case 1:
                        FlexibleStakingConsentScreenController.Companion companion2 = FlexibleStakingConsentScreenController.INSTANCE;
                        return (c) ((fq6.b) flexibleStakingConsentScreenController.P.getValue()).f137197c.get();
                    default:
                        FlexibleStakingConsentScreenController.Companion companion3 = FlexibleStakingConsentScreenController.INSTANCE;
                        FlexibleStakingConsentScreenController flexibleStakingConsentScreenController2 = this.f177483b;
                        return dli.f.a(flexibleStakingConsentScreenController2, flexibleStakingConsentScreenController2.d(), (List) flexibleStakingConsentScreenController2.R.getValue(), flexibleStakingConsentScreenController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: jq6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexibleStakingConsentScreenController f177483b;

            {
                this.f177483b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FlexibleStakingConsentScreenController flexibleStakingConsentScreenController = this.f177483b;
                switch (i22) {
                    case 0:
                        FlexibleStakingConsentScreenController.Companion companion = FlexibleStakingConsentScreenController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(flexibleStakingConsentScreenController.m2()).a().get(fq6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fq6.a.class, " is not found"));
                        }
                        fq6.a aVar3 = ((fq6.a) aVar2.b()).f137192g;
                        aq6.b bVar = flexibleStakingConsentScreenController.K;
                        bVar.getClass();
                        return new fq6.b(aVar3, bVar);
                    case 1:
                        FlexibleStakingConsentScreenController.Companion companion2 = FlexibleStakingConsentScreenController.INSTANCE;
                        return (c) ((fq6.b) flexibleStakingConsentScreenController.P.getValue()).f137197c.get();
                    default:
                        FlexibleStakingConsentScreenController.Companion companion3 = FlexibleStakingConsentScreenController.INSTANCE;
                        FlexibleStakingConsentScreenController flexibleStakingConsentScreenController2 = this.f177483b;
                        return dli.f.a(flexibleStakingConsentScreenController2, flexibleStakingConsentScreenController2.d(), (List) flexibleStakingConsentScreenController2.R.getValue(), flexibleStakingConsentScreenController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new l(7));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: jq6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexibleStakingConsentScreenController f177483b;

            {
                this.f177483b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FlexibleStakingConsentScreenController flexibleStakingConsentScreenController = this.f177483b;
                switch (i22) {
                    case 0:
                        FlexibleStakingConsentScreenController.Companion companion = FlexibleStakingConsentScreenController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(flexibleStakingConsentScreenController.m2()).a().get(fq6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fq6.a.class, " is not found"));
                        }
                        fq6.a aVar3 = ((fq6.a) aVar2.b()).f137192g;
                        aq6.b bVar = flexibleStakingConsentScreenController.K;
                        bVar.getClass();
                        return new fq6.b(aVar3, bVar);
                    case 1:
                        FlexibleStakingConsentScreenController.Companion companion2 = FlexibleStakingConsentScreenController.INSTANCE;
                        return (c) ((fq6.b) flexibleStakingConsentScreenController.P.getValue()).f137197c.get();
                    default:
                        FlexibleStakingConsentScreenController.Companion companion3 = FlexibleStakingConsentScreenController.INSTANCE;
                        FlexibleStakingConsentScreenController flexibleStakingConsentScreenController2 = this.f177483b;
                        return dli.f.a(flexibleStakingConsentScreenController2, flexibleStakingConsentScreenController2.d(), (List) flexibleStakingConsentScreenController2.R.getValue(), flexibleStakingConsentScreenController2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TextLocalisedClause textLocalisedClause = uiState.f177480b;
        n6 n6Var = uiState.f177481c;
        n6 n6Var2 = uiState.d;
        d3().f116919b.setModel(n6Var2 != null ? new aw0.h(true, n6Var, n6Var2, textLocalisedClause, null, null, 112) : new aw0.e(true, textLocalisedClause, null, n6Var, null, null, 52));
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean J2() {
        return !this.K.f8270a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (fq6.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f116920c;
        c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage("https://assets.revolut.com/published-assets-v3/8318bac7-eeff-4a0f-94de-15ffc5d604d3/8d76ab75-28e5-4454-85bf-68d9b70e51cf.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), new TextLocalisedClause(R$string.crypto_staking_auto_earn_consent_title, null, null, 14), null)), null, null, 6);
        navBarWithBigTile.setTitleStyle(b1.MARKETING);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
        if (this.K.f8270a) {
            navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        } else {
            navBarWithBigTile.setNavigationButtonIcon((Image) null);
        }
        d3().f116919b.addOnLayoutChangeListener(this.O);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        d3().f116919b.removeOnLayoutChangeListener(this.O);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (this.K.f8270a) {
            ViewController.P2(this, rd0.e.b(d3().f116920c.f59357t), new g(this, null, 0), 3);
        }
        ViewController.P2(this, rd0.e.b(d3().f116919b.f), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f116919b.f58955g), new g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f116919b.e), new jij.h(this, continuation, 17), 3);
    }

    public final dq6.a d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dq6.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
