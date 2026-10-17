package pq0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cli.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.internal.views.DynamicWidthHeightAutosizeTextView;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.xs;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends xs {
    public final UiKitMediaView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f238633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f238634h;
    public final DynamicWidthHeightAutosizeTextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstraintLayout itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "parent");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UiKitMediaView uiKitMediaView = new UiKitMediaView(context, null, 6, 0);
        this.f = uiKitMediaView;
        ConstraintLayout constraintLayout = new ConstraintLayout(itemView.getContext());
        this.f238633g = constraintLayout;
        View view = new View(itemView.getContext());
        this.f238634h = view;
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        DynamicWidthHeightAutosizeTextView dynamicWidthHeightAutosizeTextView = new DynamicWidthHeightAutosizeTextView(context2, null, 6, 0);
        this.i = dynamicWidthHeightAutosizeTextView;
        Context context3 = itemView.getContext();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        Unit unit = Unit.f186387a;
        itemView.addView(constraintLayout, layoutParams);
        Intrinsics.h(context3);
        int iK = kli.a.k(context3, 40.0f);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iK;
        layoutParams2.dimensionRatio = "375:392";
        constraintLayout.addView(uiKitMediaView, layoutParams2);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams3.startToStart = 0;
        layoutParams3.endToEnd = 0;
        layoutParams3.topToTop = 0;
        layoutParams3.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iK;
        constraintLayout.addView(view, layoutParams3);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{kli.a.s(R$attr.uikit_colorTransparent, context3), kli.a.s(R$attr.uikit_windowBackground, context3)}));
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams4.startToStart = 0;
        layoutParams4.endToEnd = 0;
        layoutParams4.bottomToBottom = 0;
        int iK2 = kli.a.k(context3, 16.0f);
        layoutParams4.setMarginStart(iK2);
        layoutParams4.setMarginEnd(iK2);
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = kli.a.k(context3, 24.0f);
        itemView.addView(dynamicWidthHeightAutosizeTextView, layoutParams4);
        dynamicWidthHeightAutosizeTextView.setMaxLines(3);
        dynamicWidthHeightAutosizeTextView.setGravity(8388611);
        jb3.l.e(dynamicWidthHeightAutosizeTextView, R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage);
        dynamicWidthHeightAutosizeTextView.setAutoSizeTextTypeWithDefaults(1);
        dynamicWidthHeightAutosizeTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context3));
        Resources resources = context3.getResources();
        dynamicWidthHeightAutosizeTextView.setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R$dimen.internal_MarketingDisplay2_min_text_size), resources.getDimensionPixelSize(com.revolut.core.ui_kit_resources.R$dimen.internal_MarketingDisplay2_text_size), 1, 0);
        if (!dynamicWidthHeightAutosizeTextView.isLaidOut() || dynamicWidthHeightAutosizeTextView.isLayoutRequested()) {
            dynamicWidthHeightAutosizeTextView.addOnLayoutChangeListener(new u(this, 13));
        } else {
            F();
        }
    }

    public final void F() {
        ConstraintLayout constraintLayout = this.f238633g;
        int height = constraintLayout.getHeight();
        DynamicWidthHeightAutosizeTextView dynamicWidthHeightAutosizeTextView = this.i;
        int height2 = dynamicWidthHeightAutosizeTextView.getHeight();
        if (height == 0 || height2 == 0) {
            return;
        }
        int i = height - height2;
        ViewGroup.LayoutParams layoutParams = dynamicWidthHeightAutosizeTextView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = i - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = i2 - kli.a.k(context, 56.0f);
        or0.u.z(this.f238634h, 0, iK, 0, 0, false, 29);
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        j70.a aVarA = wr0.a.a(context2);
        if (aVarA == null) {
            return;
        }
        w0.b(constraintLayout, zhm.u.c(new qo0.e(BitmapDescriptorFactory.HUE_RED, 100.0f, iK, height)), aVarA);
    }
}
