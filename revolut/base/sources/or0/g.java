package or0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class g {
    public static final void a(RecyclerView.LayoutManager layoutManager, View child, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(layoutManager, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (layoutManager.getLayoutDirection() == 1) {
            layoutManager.layoutDecoratedWithMargins(child, layoutManager.getWidth() - i3, i2, layoutManager.getWidth() - i, i5);
        } else {
            layoutManager.layoutDecoratedWithMargins(child, i, i2, i3, i5);
        }
    }

    public static final void b(final RecyclerView recyclerView, final Function0 onFinish) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (!recyclerView.isAnimating() || itemAnimator == null) {
            onFinish.invoke();
        } else {
            itemAnimator.isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: or0.f
                @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
                public final void onAnimationsFinished() {
                    g.b(recyclerView, onFinish);
                }
            });
        }
    }
}
