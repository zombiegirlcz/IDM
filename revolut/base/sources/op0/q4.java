package op0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 extends GridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f227393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f227394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, int i) {
        super(context, 2, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f227393a = 3;
        this.f227394b = i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        boolean zCheckLayoutParams = super.checkLayoutParams(layoutParams);
        if (zCheckLayoutParams && layoutParams != null) {
            m(layoutParams);
        }
        return zCheckLayoutParams;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        RecyclerView.LayoutParams layoutParamsGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateDefaultLayoutParams, "generateDefaultLayoutParams(...)");
        m(layoutParamsGenerateDefaultLayoutParams);
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context c2, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(c2, attrs);
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateLayoutParams, "generateLayoutParams(...)");
        m(layoutParamsGenerateLayoutParams);
        return layoutParamsGenerateLayoutParams;
    }

    public final void m(RecyclerView.LayoutParams layoutParams) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = rim.d.c((width - ((r1 - 1) * this.f227394b)) / this.f227393a);
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -1;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp10) {
        Intrinsics.checkNotNullParameter(lp10, "lp");
        RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(lp10);
        Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateLayoutParams, "generateLayoutParams(...)");
        m(layoutParamsGenerateLayoutParams);
        return layoutParamsGenerateLayoutParams;
    }
}
