package au0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9148a = 4.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9149b = -1;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f9149b == -1) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f9149b = kli.a.k(context, this.f9148a);
        }
        Object childViewHolder = parent.getChildViewHolder(view);
        if (childViewHolder instanceof a3) {
            int i = this.f9149b;
            ((f3) ((a3) childViewHolder)).I(outRect, view, i, i);
        } else {
            int i2 = this.f9149b;
            outRect.right = i2;
            outRect.left = i2;
        }
    }
}
