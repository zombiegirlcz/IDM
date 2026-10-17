package com.revolut.feature.card_design.impl.card_design.carousel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleRegistry;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.feature.card_design.impl.R$id;
import com.revolut.feature.card_design.impl.R$layout;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselController;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData;
import com.revolut.feature.card_design.impl.card_design.carousel.g;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.ui_kit.card_scene.CardDesignProxyCarouselView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.h4;
import mxl.i;
import no.m;
import nxl.f;
import org.jetbrains.annotations.NotNull;
import po0.l;
import po0.v;
import qz0.n;
import sq5.j;
import sx2.b0;
import sx2.c0;
import sx2.l0;
import sx2.m0;
import sx2.q0;
import te0.w;
import vc.s;
import vkm.j2;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/f;", "Ldli/a;", "Lsx2/m0;", "Lno/m;", "Companion", "a", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDesignCarouselController extends ViewController<f> implements dli.a, m {
    public final CardDesignCarouselScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final AnalyticsProduct O;
    public final Object P;
    public boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CardDesignCarouselController.class, "binding", "getBinding()Lcom/revolut/feature/card_design/impl/databinding/ScreenCardDesignCarouselBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CardDesignCarouselController(CardDesignCarouselScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_card_design_carousel;
        this.M = s.t(this, sx2.d.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignCarouselController f266264b;

            {
                this.f266264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardDesignCarouselController cardDesignCarouselController = this.f266264b;
                switch (i2) {
                    case 0:
                        CardDesignCarouselController.Companion companion = CardDesignCarouselController.INSTANCE;
                        qji.b bVarU2 = cardDesignCarouselController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_design.impl.card_design.carousel.di.CardDesignCarouselScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = cardDesignCarouselController.K;
                        cardDesignCarouselScreenContract$InputData.getClass();
                        return new gy2.c(dVar, eVar2, cardDesignCarouselScreenContract$InputData);
                    case 1:
                        CardDesignCarouselController.Companion companion2 = CardDesignCarouselController.INSTANCE;
                        return Boolean.valueOf(cardDesignCarouselController.R1().f147776b.k.b().a());
                    case 2:
                        CardDesignCarouselController.Companion companion3 = CardDesignCarouselController.INSTANCE;
                        return (b0) cardDesignCarouselController.R1().f147779h.get();
                    default:
                        CardDesignCarouselController.Companion companion4 = CardDesignCarouselController.INSTANCE;
                        CardDesignCarouselController cardDesignCarouselController2 = this.f266264b;
                        return dli.f.a(cardDesignCarouselController2, cardDesignCarouselController2.d(), zhm.v.k((FullScreenStateDelegate) cardDesignCarouselController2.S.getValue(), new FullScreenStateLoadingDelegate()), R$id.cardDesignCarouselScreen_descriptionsRecycler, new b(cardDesignCarouselController2, 1), null, null, 48);
                }
            }
        });
        this.O = inputData.f64688m;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignCarouselController f266264b;

            {
                this.f266264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardDesignCarouselController cardDesignCarouselController = this.f266264b;
                switch (i22) {
                    case 0:
                        CardDesignCarouselController.Companion companion = CardDesignCarouselController.INSTANCE;
                        qji.b bVarU2 = cardDesignCarouselController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_design.impl.card_design.carousel.di.CardDesignCarouselScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = cardDesignCarouselController.K;
                        cardDesignCarouselScreenContract$InputData.getClass();
                        return new gy2.c(dVar, eVar2, cardDesignCarouselScreenContract$InputData);
                    case 1:
                        CardDesignCarouselController.Companion companion2 = CardDesignCarouselController.INSTANCE;
                        return Boolean.valueOf(cardDesignCarouselController.R1().f147776b.k.b().a());
                    case 2:
                        CardDesignCarouselController.Companion companion3 = CardDesignCarouselController.INSTANCE;
                        return (b0) cardDesignCarouselController.R1().f147779h.get();
                    default:
                        CardDesignCarouselController.Companion companion4 = CardDesignCarouselController.INSTANCE;
                        CardDesignCarouselController cardDesignCarouselController2 = this.f266264b;
                        return dli.f.a(cardDesignCarouselController2, cardDesignCarouselController2.d(), zhm.v.k((FullScreenStateDelegate) cardDesignCarouselController2.S.getValue(), new FullScreenStateLoadingDelegate()), R$id.cardDesignCarouselScreen_descriptionsRecycler, new b(cardDesignCarouselController2, 1), null, null, 48);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignCarouselController f266264b;

            {
                this.f266264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardDesignCarouselController cardDesignCarouselController = this.f266264b;
                switch (i22) {
                    case 0:
                        CardDesignCarouselController.Companion companion = CardDesignCarouselController.INSTANCE;
                        qji.b bVarU2 = cardDesignCarouselController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_design.impl.card_design.carousel.di.CardDesignCarouselScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = cardDesignCarouselController.K;
                        cardDesignCarouselScreenContract$InputData.getClass();
                        return new gy2.c(dVar, eVar2, cardDesignCarouselScreenContract$InputData);
                    case 1:
                        CardDesignCarouselController.Companion companion2 = CardDesignCarouselController.INSTANCE;
                        return Boolean.valueOf(cardDesignCarouselController.R1().f147776b.k.b().a());
                    case 2:
                        CardDesignCarouselController.Companion companion3 = CardDesignCarouselController.INSTANCE;
                        return (b0) cardDesignCarouselController.R1().f147779h.get();
                    default:
                        CardDesignCarouselController.Companion companion4 = CardDesignCarouselController.INSTANCE;
                        CardDesignCarouselController cardDesignCarouselController2 = this.f266264b;
                        return dli.f.a(cardDesignCarouselController2, cardDesignCarouselController2.d(), zhm.v.k((FullScreenStateDelegate) cardDesignCarouselController2.S.getValue(), new FullScreenStateLoadingDelegate()), R$id.cardDesignCarouselScreen_descriptionsRecycler, new b(cardDesignCarouselController2, 1), null, null, 48);
                }
            }
        });
        this.S = w.y0(new j(19));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: sx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignCarouselController f266264b;

            {
                this.f266264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardDesignCarouselController cardDesignCarouselController = this.f266264b;
                switch (i22) {
                    case 0:
                        CardDesignCarouselController.Companion companion = CardDesignCarouselController.INSTANCE;
                        qji.b bVarU2 = cardDesignCarouselController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_design.impl.card_design.carousel.di.CardDesignCarouselScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = cardDesignCarouselController.K;
                        cardDesignCarouselScreenContract$InputData.getClass();
                        return new gy2.c(dVar, eVar2, cardDesignCarouselScreenContract$InputData);
                    case 1:
                        CardDesignCarouselController.Companion companion2 = CardDesignCarouselController.INSTANCE;
                        return Boolean.valueOf(cardDesignCarouselController.R1().f147776b.k.b().a());
                    case 2:
                        CardDesignCarouselController.Companion companion3 = CardDesignCarouselController.INSTANCE;
                        return (b0) cardDesignCarouselController.R1().f147779h.get();
                    default:
                        CardDesignCarouselController.Companion companion4 = CardDesignCarouselController.INSTANCE;
                        CardDesignCarouselController cardDesignCarouselController2 = this.f266264b;
                        return dli.f.a(cardDesignCarouselController2, cardDesignCarouselController2.d(), zhm.v.k((FullScreenStateDelegate) cardDesignCarouselController2.S.getValue(), new FullScreenStateLoadingDelegate()), R$id.cardDesignCarouselScreen_descriptionsRecycler, new b(cardDesignCarouselController2, 1), null, null, 48);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [android.widget.FrameLayout, jxl.a] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m0 uiState = (m0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l0 l0Var = qVar instanceof l0 ? (l0) qVar : null;
        dli.a.z0(uiState);
        SkipConfig skipConfig = uiState.f266314j;
        q0 q0Var = uiState.i;
        TagViewData tagViewData = uiState.f266312g;
        TagViewData tagViewData2 = uiState.f266310b;
        jx2.o oVar2 = uiState.d;
        List<? extends NavBarMenuItem> listC = skipConfig != null ? u.c(new TextNavBarMenuItem("LIST_ID_MENU_ITEM_SKIP", skipConfig.f64593b.f64591a, null, null, 12)) : f0.f322471a;
        Integer numValueOf = skipConfig != null ? null : Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        d3().e.setMenuItems(listC);
        d3().e.setNavigationButtonIcon(numValueOf);
        if (pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.d) : null)) {
            BasicNavBar basicNavBar = d3().e;
            basicNavBar.setTagVisible(tagViewData2 != null);
            if (tagViewData2 != null) {
                basicNavBar.setTagContent(tagViewData2);
            }
        }
        if (pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.e) : null)) {
            TagView tagView = d3().f;
            tagView.setVisibility(tagViewData != null ? 0 : 8);
            if (tagViewData != null) {
                tagView.setContent(tagViewData);
            }
        }
        if (pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.f266307g) : null)) {
            SmallActionButton smallActionButton = d3().f121053g;
            smallActionButton.setVisibility(q0Var == null ? 8 : 0);
            if (q0Var != null) {
                smallActionButton.setIcon(q0Var.f266325a);
                smallActionButton.setText(q0Var.f266326b);
            }
        }
        if (pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.f266305b) : null)) {
            LargeActionButton largeActionButton = d3().d;
            largeActionButton.o(oVar2.f179056a);
            largeActionButton.setText(oVar2.f179057b);
            largeActionButton.setEnabled(oVar2.f179058c);
            largeActionButton.setIcon(oVar2.d);
            largeActionButton.L(oVar2.e);
        }
        if (pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.f) : null)) {
            d3().d.setAnalyticsContext(uiState.f266313h);
        }
        if (pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.f266306c) : null)) {
            d3().f121052c.setTextClause(uiState.e);
        }
        if (!pd.b.k(l0Var != null ? Boolean.valueOf(l0Var.f266304a) : null) || this.Q) {
            return;
        }
        mxl.j jVar = uiState.f266311c;
        if (jVar instanceof i) {
            i group = (i) jVar;
            CardDesignProxyCarouselView cardDesignProxyCarouselView = d3().f121051b;
            Intrinsics.checkNotNullParameter(group, "group");
            ixl.a aVar = cardDesignProxyCarouselView.f107095a;
            if (aVar != null) {
                aVar.b(group);
            }
            this.Q = true;
            return;
        }
        if (jVar instanceof nxl.b) {
            nxl.b group2 = (nxl.b) jVar;
            CardDesignProxyCarouselView cardDesignProxyCarouselView2 = d3().f121051b;
            Intrinsics.checkNotNullParameter(group2, "group");
            ?? r142 = cardDesignProxyCarouselView2.f107096b;
            if (r142 != 0) {
                r142.b(group2);
            }
            this.Q = true;
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 2000 && i2 == -1 && intent != null) {
            SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) intent.getParcelableExtra("EXTRA_SELECTED_CARD_BINDING_STRATEGY");
            e eVar = (e) d();
            y yVar = eVar.N;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            Object content = ((c0) j2Var.getValue()).f266273c.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hha.d dVar = (hha.d) content;
            Object content2 = ((c0) j2Var2.getValue()).d.getContent();
            if (content2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List list = (List) content2;
            e93.q qVar = (e93.q) ((c0) j2Var2.getValue()).f.getContent();
            e93.f fVar = qVar != null ? qVar.f123888b : null;
            e93.d dVar2 = fVar instanceof e93.d ? (e93.d) fVar : null;
            if (dVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            eVar.N2(dVar2, dVar, list, selectedPaymentMethodResultContract$SelectedCardBindingStrategy);
        }
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Object backgroundMode;
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r110 = this.P;
        if (((Boolean) r110.getValue()).booleanValue()) {
            gy2.d dVar = R1().f147776b;
            th0.j.a();
            Activity activity = m2();
            Intrinsics.checkNotNullParameter(activity, "activity");
            uc.a.a(activity);
        }
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setLoadingButtonTag("CARD_DESIGN_NEXT_BUTTON_TAG");
        d3().d.setCustomE2ETestId("card_design_selection.get_card_button");
        d3().f121053g.i(h4.FLAT);
        CardDesignProxyCarouselView cardDesignCarouselScreenCardView = d3().f121051b;
        Intrinsics.checkNotNullExpressionValue(cardDesignCarouselScreenCardView, "cardDesignCarouselScreenCardView");
        boolean zBooleanValue = ((Boolean) r110.getValue()).booleanValue();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        lxl.f assetsHelper = new lxl.f(context, new n(context2, null, null));
        Activity activityM2 = m2();
        Intrinsics.checkNotNullParameter(activityM2, "<this>");
        float fG = c8g.c.G(activityM2) / c8g.c.b(activityM2);
        boolean z = ((Boolean) jo0.g.f176833q.getValue()).booleanValue() && fG < 600.0f;
        float f = z ? 128.0f : 256.0f;
        int iK = kli.a.k(m2(), fG) - kli.a.k(m2(), (((z ? 105.0f : 210.0f) + f) + 32.0f) + 32.0f);
        int iK2 = kli.a.k(m2(), f + 32.0f);
        nxl.c cVar = new nxl.c(iK, iK2);
        if (this.K.f64693s) {
            backgroundMode = f.a.f220586a;
        } else {
            fk3.b bVarB = R1().f147776b.f147793t.b();
            s.j(bVarB);
            backgroundMode = new nxl.e(((ik3.g) bVarB).f161888g.b().H1 ? AnimatedBackgroundType.ONBOARDING.f51478a : AnimatedBackgroundType.DEFAULT.f51471a);
        }
        suf.a get3dSceneView = new suf.a(this, 4);
        int i = CardDesignProxyCarouselView.d;
        LifecycleRegistry lifecycle = this.F;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(assetsHelper, "assetsHelper");
        Intrinsics.checkNotNullParameter(backgroundMode, "backgroundMode");
        Intrinsics.checkNotNullParameter(get3dSceneView, "get3dSceneView");
        if (zBooleanValue) {
            boolean zEquals = backgroundMode.equals(f.b.f220587a);
            Context context3 = cardDesignCarouselScreenCardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ixl.a aVar = (ixl.a) get3dSceneView.invoke(context3, Boolean.valueOf(!zEquals));
            aVar.getSceneView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            aVar.d(lifecycle);
            aVar.e(assetsHelper);
            Intrinsics.checkNotNullExpressionValue(cardDesignCarouselScreenCardView.getContext(), "getContext(...)");
            aVar.setCardNodePositionParams(iK / c8g.c.G(r2), Float.valueOf(iK2));
            if (backgroundMode instanceof nxl.e) {
                Context context4 = cardDesignCarouselScreenCardView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                if (jh.d.g(context4)) {
                    AnimatedBackgroundView.Companion companion = AnimatedBackgroundView.INSTANCE;
                    Context context5 = cardDesignCarouselScreenCardView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    AnimatedBackgroundType backgroundType = ((nxl.e) backgroundMode).f220585a;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(context5, "context");
                    Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
                    com.revolut.core.ui_kit.background.c cVar2 = v.Companion;
                    boolean zQ = kli.a.q(context5);
                    com.revolut.core.ui_kit.background.a colorAttrResolver = new com.revolut.core.ui_kit.background.a(context5);
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
                    Intrinsics.checkNotNullParameter(colorAttrResolver, "colorAttrResolver");
                    l lVarA = com.revolut.core.ui_kit.background.c.a(backgroundType, colorAttrResolver);
                    if (lVarA == null) {
                        lVarA = po0.j.DEFAULT;
                    }
                    aVar.setLottieBackground(lVarA.b(zQ, false));
                }
            }
            cardDesignCarouselScreenCardView.addView(aVar.getSceneView());
            cardDesignCarouselScreenCardView.f107095a = aVar;
        } else {
            Context context6 = cardDesignCarouselScreenCardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            jxl.d dVar2 = new jxl.d(context6, null, 6, 0);
            dVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dVar2.setCardMetrics(cVar);
            cardDesignCarouselScreenCardView.addView(dVar2);
            cardDesignCarouselScreenCardView.f107096b = dVar2;
        }
        cardDesignCarouselScreenCardView.f107097c.k(Unit.f186387a);
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = d3().f121050a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerConstraintLayout, "getRoot(...)");
        c8g.a.a(controllerContainerConstraintLayout, ny0.b.f220590a, new sx2.b(this, 0));
    }

    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CardDesignProxyCarouselView cardDesignProxyCarouselView = d3().f121051b;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.Q(cardDesignProxyCarouselView.f107097c, new iw6.l((Continuation) null, cardDesignProxyCarouselView, 29)), null, new sx2.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59211b), null, new a(this, null), 3);
        final int i = 0;
        d3().f.setOnClickListener(new View.OnClickListener(this) { // from class: sx2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignCarouselController f266270b;

            {
                this.f266270b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                CardDesignCarouselController cardDesignCarouselController = this.f266270b;
                switch (i2) {
                    case 0:
                        CardDesignCarouselController.Companion companion = CardDesignCarouselController.INSTANCE;
                        ((com.revolut.feature.card_design.impl.card_design.carousel.e) cardDesignCarouselController.d()).M2(g.b.f64720a);
                        break;
                    default:
                        CardDesignCarouselController.Companion companion2 = CardDesignCarouselController.INSTANCE;
                        ((com.revolut.feature.card_design.impl.card_design.carousel.e) cardDesignCarouselController.d()).M2(g.d.f64722a);
                        break;
                }
            }
        });
        final int i2 = 1;
        d3().f121053g.setOnClickListener(new View.OnClickListener(this) { // from class: sx2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDesignCarouselController f266270b;

            {
                this.f266270b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                CardDesignCarouselController cardDesignCarouselController = this.f266270b;
                switch (i22) {
                    case 0:
                        CardDesignCarouselController.Companion companion = CardDesignCarouselController.INSTANCE;
                        ((com.revolut.feature.card_design.impl.card_design.carousel.e) cardDesignCarouselController.d()).M2(g.b.f64720a);
                        break;
                    default:
                        CardDesignCarouselController.Companion companion2 = CardDesignCarouselController.INSTANCE;
                        ((com.revolut.feature.card_design.impl.card_design.carousel.e) cardDesignCarouselController.d()).M2(g.d.f64722a);
                        break;
                }
            }
        });
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f121052c.f58608l), null, new sx2.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).d), null, new sx2.e(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59210a.f57403b), null, new ryj.f(2, d(), b0.class, "menuItemClicked", "menuItemClicked(Ljava/lang/String;)V", 4, 10), 3);
    }

    public final dy2.a d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dy2.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gy2.c R1() {
        return (gy2.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final b0 d() {
        return (b0) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
