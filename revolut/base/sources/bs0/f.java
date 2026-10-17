package bs0;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends d {
    public final int b(View targetView, OrientationHelper helper) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(helper, "helper");
        RecyclerView.LayoutManager layoutManager = helper.getLayoutManager();
        Intrinsics.checkNotNullExpressionValue(layoutManager, "getLayoutManager(...)");
        return (layoutManager.getF53278a() && layoutManager.getLayoutDirection() == 1) ? helper.getDecoratedEnd(targetView) : helper.getDecoratedStart(targetView);
    }

    public final int c(RecyclerView.LayoutManager layoutManager, View targetView, OrientationHelper helper) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(helper, "helper");
        int iB = b(targetView, helper);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(helper, "helper");
        return iB - ((layoutManager.getF53278a() && layoutManager.getLayoutDirection() == 1) ? helper.getEndAfterPadding() : helper.getStartAfterPadding());
    }
}
