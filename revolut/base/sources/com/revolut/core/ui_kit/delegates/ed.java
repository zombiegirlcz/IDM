package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.internal.views.CircleProgressBarWithText;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.GooglePayButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.o60;
import ip0.w10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ed extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f54109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScrollView f54110h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f54111j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f54112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f54113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f54114n;
    public final ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecyclerView f54115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CircleProgressBarWithText f54116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UiKitMediaView f54117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f54118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final GooglePayButton f54119t;
    public final LargeActionButton u;
    public final LargeActionButton v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f54120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f54121x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.prompt_gradientOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.prompt_backgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54109g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.prompt_scrollContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ScrollView scrollView = (ScrollView) viewFindViewById3;
        this.f54110h = scrollView;
        View viewFindViewById4 = itemView.findViewById(R$id.prompt_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.prompt_menuIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54111j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.prompt_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.prompt_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById7;
        this.f54112l = textView;
        View viewFindViewById8 = itemView.findViewById(R$id.prompt_footerDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById8;
        this.f54113m = textView2;
        View viewFindViewById9 = itemView.findViewById(R$id.prompt_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f54114n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.prompt_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.prompt_RecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54115p = (RecyclerView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.prompt_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f54116q = (CircleProgressBarWithText) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.prompt_playerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById13;
        this.f54117r = uiKitMediaView;
        View viewFindViewById14 = itemView.findViewById(R$id.prompt_BottomContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f54118s = (ConstraintLayout) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.prompt_googlePayButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f54119t = (GooglePayButton) viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.prompt_primaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.u = (LargeActionButton) viewFindViewById16;
        View viewFindViewById17 = itemView.findViewById(R$id.prompt_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.v = (LargeActionButton) viewFindViewById17;
        ix0.c0 c0Var = ix0.c0.f169220a;
        textView.setMovementMethod(c0Var);
        textView.setClickable(false);
        textView2.setMovementMethod(c0Var);
        textView2.setClickable(false);
        scrollView.setClipToPadding(false);
        itemView.getViewTreeObserver().addOnPreDrawListener(new com.onfido.android.sdk.capture.ui.camera.util.a(this, 1));
        uiKitMediaView.setGlyphDisplayOption(new yp0.l(yp0.n.FACTOR_50, 3));
        scrollView.setOnScrollChangeListener(new o60(this, 0));
        int paddingTop = itemView.getPaddingTop();
        itemView.setPadding(itemView.getPaddingLeft(), 0, itemView.getPaddingRight(), itemView.getPaddingBottom());
        ViewCompat.setOnApplyWindowInsetsListener(itemView, new com.google.android.material.sidesheet.c(this, paddingTop, 1));
        ViewUtils.requestApplyInsetsWhenAttached(itemView);
        c8g.a.a(itemView, ny0.a.f220589a, new w10(this, 3));
    }

    public final void F() {
        UiKitMediaView uiKitMediaView = this.f54117r;
        ViewGroup.LayoutParams layoutParams = uiKitMediaView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = uiKitMediaView.getResources().getDimensionPixelSize(R$dimen.internal_prompt_image_size);
        marginLayoutParams.width = uiKitMediaView.getResources().getDimensionPixelSize(R$dimen.internal_prompt_image_size);
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        uiKitMediaView.setLayoutParams(marginLayoutParams);
    }

    public final void H(int i) {
        ScrollView scrollView = this.f54110h;
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingTop = (scrollView.getPaddingTop() + (scrollView.getPaddingBottom() + childAt.getHeight())) - scrollView.getHeight();
        ImageView imageView = this.f54111j;
        ImageView imageView2 = this.i;
        TextView textView = this.f54112l;
        UiKitMediaView uiKitMediaView = this.f54117r;
        if (paddingTop <= 0) {
            uiKitMediaView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            textView.setAlpha(1.0f);
            imageView2.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            return;
        }
        uiKitMediaView.setTranslationY(-(paddingTop - i));
        koi.j jVar = this.e;
        PromptContentDelegate.Model model = jVar instanceof PromptContentDelegate.Model ? (PromptContentDelegate.Model) jVar : null;
        boolean z = (model != null ? model.f53059g : null) != null;
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        if (z) {
            TextView textView2 = this.f54114n;
            if (textView2.getVisibility() != 0) {
                textView2 = null;
            }
            if (textView2 != null) {
                textView = textView2;
            }
            float fH = knm.b.h(textView, viewGroup) + textView.getHeight();
            TextView textView3 = this.f54113m;
            int height = textView3.getHeight();
            float fH2 = knm.b.h(textView3, viewGroup);
            float f = height;
            float f4 = (height != 0 && fH > fH2) ? fH >= fH2 + f ? 0.0f : (f - (fH - fH2)) / f : 1.0f;
            textView3.setAlpha(f4);
            textView3.setVisibility(f4 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
        }
        koi.j jVar2 = this.e;
        PromptContentDelegate.Model model2 = jVar2 instanceof PromptContentDelegate.Model ? (PromptContentDelegate.Model) jVar2 : null;
        if (model2 == null || model2.f == null) {
            imageView2 = null;
        }
        if (model2 == null || model2.C == null) {
            imageView = null;
        }
        ImageView[] elements = {imageView2, imageView};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List<ImageView> listL = kotlin.collections.d.L(elements);
        View view2 = this.itemView;
        Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) view2;
        for (ImageView imageView3 : listL) {
            int height2 = imageView3.getHeight();
            float fH3 = knm.b.h(imageView3, viewGroup2);
            float f5 = height2;
            float f6 = fH3 + f5;
            float fH4 = knm.b.h(this.k, viewGroup2);
            float f32 = (height2 != 0 && f6 > fH4) ? fH3 >= fH4 ? 0.0f : (fH4 - fH3) / f5 : 1.0f;
            imageView3.setAlpha(f32);
            imageView3.setVisibility(f32 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
        }
    }

    public final void I(ad content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Media media = content.f53677a;
        if (!(media instanceof Image)) {
            if (media instanceof Video) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                F();
                return;
            }
            return;
        }
        boolean z = content.f53678b;
        UiKitMediaView uiKitMediaView = this.f54117r;
        LottieAnimationView lottieAnimationViewI = uiKitMediaView.i();
        if (!z) {
            ViewGroup.LayoutParams layoutParams = lottieAnimationViewI.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            lottieAnimationViewI.setLayoutParams(layoutParams);
            lottieAnimationViewI.setAdjustViewBounds(false);
            F();
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = lottieAnimationViewI.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        lottieAnimationViewI.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = uiKitMediaView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        Context context = uiKitMediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        marginLayoutParams.setMarginStart(kli.a.w(R$attr.uikit_dp24, context));
        Context context2 = uiKitMediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        marginLayoutParams.setMarginEnd(kli.a.w(R$attr.uikit_dp24, context2));
        uiKitMediaView.setLayoutParams(marginLayoutParams);
        lottieAnimationViewI.setAdjustViewBounds(true);
    }
}
