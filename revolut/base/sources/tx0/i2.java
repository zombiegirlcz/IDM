package tx0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i2 {
    public static final View a(View view) {
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (((view instanceof RecyclerView) && (layoutManager = ((RecyclerView) view).getLayoutManager()) != null && layoutManager.canScrollVertically()) || (view instanceof NestedScrollView)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewA = a(childAt);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }
}
