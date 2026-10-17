package k4a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f180866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180867b;

    public a(c cVar, ScreenContentRecyclerView screenContentRecyclerView, int i) {
        this.f180866a = screenContentRecyclerView;
        this.f180867b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (c.a(parent.getChildLayoutPosition(view), this.f180866a)) {
            outRect.bottom = this.f180867b;
        }
    }
}
