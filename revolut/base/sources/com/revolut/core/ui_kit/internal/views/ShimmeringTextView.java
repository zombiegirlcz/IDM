package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.a4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ShimmeringTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lms0/a4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShimmeringTextView extends AppCompatTextView implements a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayerDrawable f56381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56382c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmeringTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ms0.a4
    public final void a(int i, int i2, Path outPath) {
        Intrinsics.checkNotNullParameter(outPath, "outPath");
        LayerDrawable layerDrawable = this.f56381b;
        int layerInsetTop = layerDrawable.getLayerInsetTop(0);
        int layerInsetBottom = layerDrawable.getLayerInsetBottom(0);
        float f = this.f56380a;
        outPath.addRoundRect(i, i2 + layerInsetTop, getWidth() + i, ((getHeight() + i2) + layerInsetTop) - layerInsetBottom, f, f, Path.Direction.CW);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        float fDescent = getPaint().descent() - getPaint().ascent();
        float f = this.f56382c;
        if (f > BitmapDescriptorFactory.HUE_RED && f < fDescent) {
            fDescent = f;
        }
        int height = (int) ((getHeight() - fDescent) / 2);
        if (height < 0) {
            height = 0;
        }
        int i6 = height;
        this.f56381b.setLayerInset(0, 0, i6, 0, i6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmeringTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmeringTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56380a = kli.a.l(context, 16.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.uikit_ShimmeringTextView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f56382c = typedArrayObtainStyledAttributes.getDimension(R$styleable.uikit_ShimmeringTextView_uikit_shimmeringTextMaxHeight, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        setMaxLines(1);
        setSingleLine(true);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{context.getDrawable(kli.a.x(R$attr.uikit_shimmerBackgroundRect, context))});
        this.f56381b = layerDrawable;
        setBackground(layerDrawable);
    }

    public /* synthetic */ ShimmeringTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
