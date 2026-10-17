package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/PassCardDetailsContainer;", "Lcom/revolut/flexbox/FlexboxLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PassCardDetailsContainer extends FlexboxLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PassCardDetailsContainer(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.flexbox.FlexboxLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() == 0) {
            return;
        }
        List<com.revolut.flexbox.a> flexLines = getFlexLines();
        int i3 = (flexLines.size() < 2 || ((com.revolut.flexbox.a) d0.m0(flexLines)).f98241h != 1) ? -1 : ((com.revolut.flexbox.a) d0.m0(flexLines)).o;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 200.0f);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            FlexboxLayout.LayoutParams layoutParams2 = layoutParams instanceof FlexboxLayout.LayoutParams ? (FlexboxLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                TextView textView = (TextView) childAt.findViewById(R$id.passCardLabeledText_title);
                TextView textView2 = (TextView) childAt.findViewById(R$id.passCardLabeledText_value);
                boolean z3 = i5 == i3;
                if (z3 != (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1)) {
                    if (z3) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                        layoutParams2.f98202b = 1.0f;
                        if (textView != null) {
                            textView.setMaxWidth(Integer.MAX_VALUE);
                        }
                        if (textView2 != null) {
                            textView2.setMaxWidth(Integer.MAX_VALUE);
                        }
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
                        layoutParams2.f98202b = BitmapDescriptorFactory.HUE_RED;
                        if (textView != null) {
                            textView.setMaxWidth(iK);
                        }
                        if (textView2 != null) {
                            textView2.setMaxWidth(iK);
                        }
                    }
                    childAt.setLayoutParams(layoutParams2);
                    z = true;
                }
            }
            i5++;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PassCardDetailsContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassCardDetailsContainer(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setFlexWrap(1);
        setDividerDrawableVertical(context.getDrawable(R$drawable.internal_divider_vertical_pass_card_details));
        setDividerDrawableHorizontal(context.getDrawable(R$drawable.internal_divider_horizontal_pass_card_details));
        setShowDividerVertical(2);
        setShowDividerHorizontal(2);
    }

    public /* synthetic */ PassCardDetailsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
