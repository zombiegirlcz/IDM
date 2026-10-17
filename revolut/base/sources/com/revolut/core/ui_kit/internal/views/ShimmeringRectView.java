package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.a4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ShimmeringRectView;", "Landroid/view/View;", "Lms0/a4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShimmeringRectView extends View implements a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56379a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmeringRectView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ms0.a4
    public final void a(int i, int i2, Path outPath) {
        Intrinsics.checkNotNullParameter(outPath, "outPath");
        float width = getWidth() + i;
        float height = getHeight() + i2;
        float f = this.f56379a;
        outPath.addRoundRect(i, i2, width, height, f, f, Path.Direction.CW);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmeringRectView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmeringRectView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.uikit_ShimmeringRectView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.uikit_ShimmeringRectView_uikit_shimmeringRadius, kli.a.l(context, 16.0f));
        this.f56379a = dimension;
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = context.getDrawable(kli.a.x(R$attr.uikit_shimmerBackgroundRect, context));
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null && gradientDrawable.getCornerRadius() != dimension) {
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.i(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable2 = (GradientDrawable) drawableMutate;
            gradientDrawable2.setCornerRadius(dimension);
            setBackground(gradientDrawable2);
            return;
        }
        setBackground(gradientDrawable);
    }

    public /* synthetic */ ShimmeringRectView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
