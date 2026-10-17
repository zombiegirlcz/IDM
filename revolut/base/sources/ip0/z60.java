package ip0;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.ViewCompat;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.OnMeasureCallbackConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z60 extends koi.b implements ms0.i2 {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f167401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Guideline f167402h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f167403j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f167404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f167405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f167406n;
    public final View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.marketingPromptLoading_shimmerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.marketingPromptLoading_closeImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById2;
        this.f167401g = appCompatImageView;
        View viewFindViewById3 = itemView.findViewById(R$id.marketingPromptLoading_topGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167402h = (Guideline) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.marketingPromptLoading_circleAsset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.marketingPromptLoading_circleAssetTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f167403j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.marketingPromptLoading_circleAssetSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.marketingPromptLoading_backgroundAssetTitle1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f167404l = viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.marketingPromptLoading_backgroundAssetTitle2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f167405m = viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.marketingPromptLoading_backgroundAssetSubtitle1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f167406n = viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.marketingPromptLoading_backgroundAssetSubtitle2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = viewFindViewById10;
        ny0.i.e(appCompatImageView);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        ViewCompat.setOnApplyWindowInsetsListener(itemView, new com.google.android.material.sidesheet.c(this, marginLayoutParams != null ? marginLayoutParams.topMargin : 0, 3));
        ViewUtils.requestApplyInsetsWhenAttached(itemView);
        OnMeasureCallbackConstraintLayout onMeasureCallbackConstraintLayout = itemView instanceof OnMeasureCallbackConstraintLayout ? (OnMeasureCallbackConstraintLayout) itemView : null;
        if (onMeasureCallbackConstraintLayout != null) {
            onMeasureCallbackConstraintLayout.setOnMeasureCallback(this);
        }
    }

    public final boolean F() {
        int i;
        AppCompatImageView appCompatImageView = this.f167401g;
        if (appCompatImageView.getVisibility() == 0) {
            int measuredHeight = appCompatImageView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        } else {
            i = 0;
        }
        Guideline guideline = this.f167402h;
        ViewGroup.LayoutParams layoutParams2 = guideline.getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (((ConstraintLayout.LayoutParams) layoutParams2).guideBegin == i) {
            return false;
        }
        guideline.setGuidelineBegin(i);
        return true;
    }

    @Override // ms0.i2
    public final boolean b(OnMeasureCallbackConstraintLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return F();
    }
}
