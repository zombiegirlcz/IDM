package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ShimmeringTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e9 extends ShimmerConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e9(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View shimmeringTextView = new ShimmeringTextView(context, null, R$attr.internal_textAppearanceBody2);
        shimmeringTextView.setId(R$id.profileCard_infoTextLoading);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.k(context, 24.0f);
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        layoutParams.startToStart = 0;
        layoutParams.matchConstraintPercentWidth = 0.5f;
        shimmeringTextView.setLayoutParams(layoutParams);
        View shimmeringTextView2 = new ShimmeringTextView(context, null, R$attr.internal_textAppearanceLargeSubheader);
        shimmeringTextView2.setId(R$id.profileCard_titleTextLoading);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = kli.a.k(context, 12.0f);
        layoutParams2.topToBottom = R$id.profileCard_infoTextLoading;
        layoutParams2.endToEnd = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.matchConstraintPercentWidth = 0.87f;
        shimmeringTextView2.setLayoutParams(layoutParams2);
        View shimmeringTextView3 = new ShimmeringTextView(context, null, R$attr.internal_textAppearanceBody2);
        shimmeringTextView3.setId(R$id.profileCard_subtitleTextLoading);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = kli.a.k(context, 8.0f);
        layoutParams3.topToBottom = R$id.profileCard_titleTextLoading;
        layoutParams3.endToEnd = 0;
        layoutParams3.startToStart = 0;
        layoutParams3.matchConstraintPercentWidth = 0.34f;
        shimmeringTextView3.setLayoutParams(layoutParams3);
        addView(shimmeringTextView);
        addView(shimmeringTextView2);
        addView(shimmeringTextView3);
    }

    public /* synthetic */ e9(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
