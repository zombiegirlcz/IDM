package com.revolut.feature.card_personalisation.generation.impl.ui.generation;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import aw0.o9;
import b53.b;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_personalisation.generation.api.CardPersonalisationGenerationUiApi$Toggles$AiCardCustomisationAirBranding;
import com.revolut.feature.card_personalisation.generation.impl.R$id;
import com.revolut.feature.card_personalisation.generation.impl.R$layout;
import com.revolut.feature.card_personalisation.generation.impl.R$string;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import e53.i;
import ip0.md;
import j3c.y;
import j53.c;
import j53.f;
import j53.g;
import j53.m;
import j53.n;
import java.util.List;
import jte.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import mx0.e4;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_personalisation/generation/impl/ui/generation/CustomisationImageGenerationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb53/b;", "Ldli/a;", "Lj53/m;", "Companion", "j53/b", "a", "feature_shared_card_personalisation_generation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomisationImageGenerationController extends ViewController<b> implements dli.a {
    public final int K;
    public final Object L;
    public final Object M;
    public final j N;
    public final j O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CustomisationImageGenerationController.class, "binding", "getBinding()Lcom/revolut/feature/card_personalisation/generation/impl/databinding/ScreenCustomisationImageGenerationBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CustomisationImageGenerationController(CustomisationImageGenerationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_customisation_image_generation;
        this.L = w.y0(new y(9));
        Lazy lazyY0 = w.y0(new y(10));
        this.M = lazyY0;
        this.N = new j(7, u.c((SuggestionsBarDelegate) lazyY0.getValue()), false);
        this.O = new j(7, u.c(new ContainerDelegate(u.c(new SimpleMediaDelegate()), null, 6)), false);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: j53.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomisationImageGenerationController f171463b;

            {
                this.f171463b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CustomisationImageGenerationController.Companion companion = CustomisationImageGenerationController.INSTANCE;
                        CustomisationImageGenerationController customisationImageGenerationController = this.f171463b;
                        return dli.f.a(customisationImageGenerationController, customisationImageGenerationController.d(), v.k(new TextDelegate(), (FullScreenStateDelegate) customisationImageGenerationController.L.getValue(), new SimpleMediaDelegate()), R$id.customisationImageGenerationScreen_recyclerView, null, null, null, 56);
                    default:
                        CustomisationImageGenerationController.Companion companion2 = CustomisationImageGenerationController.INSTANCE;
                        return (h) ((e53.i) this.f171463b.R.getValue()).i.get();
                }
            }
        });
        this.Q = s.t(this, c.f);
        this.R = w.y0(new md(this, inputData, 28));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: j53.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomisationImageGenerationController f171463b;

            {
                this.f171463b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CustomisationImageGenerationController.Companion companion = CustomisationImageGenerationController.INSTANCE;
                        CustomisationImageGenerationController customisationImageGenerationController = this.f171463b;
                        return dli.f.a(customisationImageGenerationController, customisationImageGenerationController.d(), v.k(new TextDelegate(), (FullScreenStateDelegate) customisationImageGenerationController.L.getValue(), new SimpleMediaDelegate()), R$id.customisationImageGenerationScreen_recyclerView, null, null, null, 56);
                    default:
                        CustomisationImageGenerationController.Companion companion2 = CustomisationImageGenerationController.INSTANCE;
                        return (h) ((e53.i) this.f171463b.R.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        String str = uiState.i;
        boolean z = uiState.d;
        boolean z3 = uiState.e;
        boolean z4 = uiState.f;
        n nVar = qVar instanceof n ? (n) qVar : null;
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f171479a) : null)) {
            List list = uiState.f171474b;
            boolean zIsEmpty = list.isEmpty();
            j jVar = this.O;
            if (zIsEmpty) {
                jVar.d();
            } else {
                jVar.c(list);
                d3().f.setCurrentItem(0, false);
            }
            ViewPager2 customisationImageGenerationScreenPager = d3().f;
            Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenPager, "customisationImageGenerationScreenPager");
            List list2 = list;
            customisationImageGenerationScreenPager.setVisibility(!list2.isEmpty() ? 0 : 8);
            ScrollingPagerIndicatorView customisationImageGenerationScreenPagerIndicator = d3().f21404g;
            Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenPagerIndicator, "customisationImageGenerationScreenPagerIndicator");
            customisationImageGenerationScreenPagerIndicator.setVisibility(!list2.isEmpty() ? 0 : 8);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.e) : null)) {
            d3().f21403c.setEnabled(z4);
            d3().f21405h.setEnabled(z4);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.d) : null)) {
            LargeActionButton customisationImageGenerationScreenFirstButton = d3().f21403c;
            Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenFirstButton, "customisationImageGenerationScreenFirstButton");
            customisationImageGenerationScreenFirstButton.setVisibility(z3 ? 0 : 8);
            LargeActionButton customisationImageGenerationScreenSecondButton = d3().f21405h;
            Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenSecondButton, "customisationImageGenerationScreenSecondButton");
            customisationImageGenerationScreenSecondButton.setVisibility(z3 ? 0 : 8);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f171480b) : null)) {
            d3().d.setInputActions(uiState.f171475c);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f171481c) : null)) {
            ChatInputView customisationImageGenerationScreenInputView = d3().d;
            Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenInputView, "customisationImageGenerationScreenInputView");
            customisationImageGenerationScreenInputView.setVisibility(z ? 0 : 8);
            if (z) {
                ChatInputView chatInputView = d3().d;
                m70.a.c(t0.f186434a);
                chatInputView.setInput(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f) : null)) {
            LargeActionButton customisationImageGenerationScreenStopButton = d3().i;
            Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenStopButton, "customisationImageGenerationScreenStopButton");
            customisationImageGenerationScreenStopButton.setVisibility(uiState.f171476g ? 0 : 8);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f171482g) : null) && uiState.f171477h) {
            d3().d.c0();
        }
        if (str != null) {
            d3().d.setInput(new TextClause(uiState.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            ((a) d()).I2(str);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.i) : null)) {
            this.N.c(uiState.f171478j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AsyncDiffRecyclerView asyncDiffRecyclerView = d3().f21406j;
        asyncDiffRecyclerView.setAdapter(this.N);
        asyncDiffRecyclerView.setOverScrollMode(2);
        asyncDiffRecyclerView.setLayoutManager(new LinearLayoutManager(m2(), 1, false));
        ViewPager2 viewPager2 = d3().f;
        viewPager2.setAdapter(this.O);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setClipChildren(false);
        viewPager2.setClipToPadding(false);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setClipChildren(false);
            recyclerView.setClipToPadding(false);
        }
        viewPager2.registerOnPageChangeCallback(new j53.b(this));
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = d3().f21404g;
        Context context = scrollingPagerIndicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground_60, context);
        Context context2 = scrollingPagerIndicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        scrollingPagerIndicatorView.setIndicatorColors(iS, kli.a.s(R$attr.uikit_colorForeground, context2));
        ViewPager2 customisationImageGenerationScreenPager = d3().f;
        Intrinsics.checkNotNullExpressionValue(customisationImageGenerationScreenPager, "customisationImageGenerationScreenPager");
        scrollingPagerIndicatorView.P(customisationImageGenerationScreenPager);
        gte.a aVarB = ((i) this.R.getValue()).f122733b.f122728b.b();
        s.j(aVarB);
        if (((d) aVarB).c(CardPersonalisationGenerationUiApi$Toggles$AiCardCustomisationAirBranding.f65310c)) {
            d3().f21402b.setBackgroundType(AnimatedBackgroundType.AIR.f51467a);
        }
        d3().e.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.card_personalisation_generation_title, null, null, 14), null, null, null, false, 30));
        ChatInputView chatInputView = d3().d;
        chatInputView.setHint(new TextLocalisedClause(R$string.card_personalisation_generation_input_placeholder, null, null, 14));
        chatInputView.setFixedState(e4.ONLY_TEXT);
        LargeActionButton largeActionButton = d3().f21403c;
        largeActionButton.setText(new TextLocalisedClause(R$string.card_personalisation_generation_action_confirm, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        LargeActionButton largeActionButton2 = d3().f21405h;
        largeActionButton2.setText(new TextLocalisedClause(R$string.card_personalisation_generation_action_cancel, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f);
        LargeActionButton largeActionButton3 = d3().i;
        largeActionButton3.setIcon(new ResourceImage(R$drawable.uikit_icn_24_stop, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        largeActionButton3.o(LargeActionButton.ButtonStyle.f58726b);
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.b0()), null, new j53.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.M), null, new j53.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f21403c.o), null, new j53.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f21405h.o), null, new j53.e(this, null, 1), 3);
        ?? r56 = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).f52371h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).d), null, new j53.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().i.o), null, new j53.e(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SuggestionsBarDelegate) this.M.getValue()).p().d), null, new g(this, null), 3);
    }

    public final c53.a d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c53.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j53.h d() {
        return (j53.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
