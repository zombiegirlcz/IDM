package ms0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.LimitProgressBar;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k3 extends UIKitFrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LimitProgressBar f208312h;
    public final ImageView i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k3(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 40.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        setMeasuredDimension(iK, iK);
    }

    public final void setProgress(float f) {
        this.f208312h.setProgress(f);
    }

    public final void setStopIconVisible(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k3(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LimitProgressBar limitProgressBar = new LimitProgressBar(context, null, 6, 0);
        this.f208312h = limitProgressBar;
        ImageView imageView = new ImageView(context);
        this.i = imageView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorGreyTone10, context2);
        GradientDrawable gradientDrawableK = v7.k(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorGroupedBackground_40, context3));
        setBackground(new RippleDrawable(ColorStateList.valueOf(iS), gradientDrawableK, null));
        limitProgressBar.b(new o1(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, R$attr.uikit_colorAccentNeutral, 0, R$attr.uikit_colorTransparent, R$attr.uikit_colorGreyTone10, 2.0f, 0L, null, false, 360.0f, 270.0f, false, 8978));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iK = kli.a.k(context4, 36.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
        layoutParams.gravity = 17;
        addView(limitProgressBar, layoutParams);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int iK2 = kli.a.k(context5, 16.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iK2, iK2);
        layoutParams2.gravity = 17;
        zi0.c.g(imageView, new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246));
        addView(imageView, layoutParams2);
        imageView.setVisibility(8);
    }

    public /* synthetic */ k3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
