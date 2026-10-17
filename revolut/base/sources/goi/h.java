package goi;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f145168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f145169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UIKitLinearLayoutManager f145170c;
    public int d;
    public int e;

    public h(RecyclerView recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.f145168a = recycler;
    }

    public final void a(int i, boolean z) {
        int i2;
        UIKitLinearLayoutManager uIKitLinearLayoutManager = this.f145170c;
        RecyclerView recyclerView = this.f145168a;
        if (uIKitLinearLayoutManager == null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager");
            uIKitLinearLayoutManager = (UIKitLinearLayoutManager) layoutManager;
            this.f145170c = uIKitLinearLayoutManager;
        }
        int i3 = i - this.e;
        if (i3 != 0) {
            this.e = i;
            uIKitLinearLayoutManager.e += i3;
            uIKitLinearLayoutManager.callOnLayoutComplete$recycler_kit_release();
            if (z) {
                View childAt = uIKitLinearLayoutManager.getChildAt(uIKitLinearLayoutManager.getChildCount() - 1);
                if (childAt != null) {
                    int decoratedBottom = uIKitLinearLayoutManager.getDecoratedBottom(childAt);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    i2 = decoratedBottom + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                recyclerView.scrollBy(0, i3);
                View childAt2 = uIKitLinearLayoutManager.getChildAt(uIKitLinearLayoutManager.getChildCount() - 1);
                if (childAt2 == null || childAt2 != childAt) {
                    return;
                }
                int decoratedBottom2 = uIKitLinearLayoutManager.getDecoratedBottom(childAt2);
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i2 == decoratedBottom2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) {
                    uIKitLinearLayoutManager.offsetChildrenVertical(-i3);
                }
            }
        }
    }
}
