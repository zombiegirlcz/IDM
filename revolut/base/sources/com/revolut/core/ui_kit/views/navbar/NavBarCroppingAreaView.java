package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.s8;
import aw0.x8;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import ix0.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.d5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarCroppingAreaView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lmx0/d5;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarCroppingAreaView extends ConstraintLayout implements d5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarCroppingAreaView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(dr0.l.d(io0.a.d(0.2f, -16777216)));
        View.inflate(context, R$layout.internal_view_nav_bar_cropping_area, this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setBackground(new RoundedBackgroundDrawable(context, 0, 6));
        }
        f0(null);
    }

    public final void f0(Drawable drawable) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        x8 x8VarD = s0.d(drawable, context, s8.DEFAULT);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable background = getChildAt(i).getBackground();
            RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
            if (roundedBackgroundDrawable != null) {
                roundedBackgroundDrawable.e(x8VarD.f10610b);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tx0.d5.d(context), 1073741824);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(tx0.d5.b(context2), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarCroppingAreaView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
