package goi;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends RecyclerView.ItemDecoration {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f145173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f145174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f145175c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f145176g;

    public static final class a {
        private a() {
        }
    }

    public j(float f) {
        this.f145173a = f;
        this.f145175c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.f145176g = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.f145174b) {
            this.f145174b = true;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f145175c = c8g.c.e(context, 16.0f);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.d = c8g.c.e(context2, 12.0f);
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            this.e = c8g.c.e(context3, 8.0f);
            Context context4 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.f = c8g.c.e(context4, 4.0f);
            float f = this.f145173a;
            if (f >= BitmapDescriptorFactory.HUE_RED) {
                Context context5 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                this.f145176g = c8g.c.e(context5, f);
            }
        }
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        boolean z = childAdapterPosition >= 0 && childAdapterPosition < (adapter != null ? adapter.getItemCount() : 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int spanCount = gridLayoutManager.getSpanCount();
        int spanSize = z ? gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition) : layoutParams2.getSpanSize();
        if (spanSize >= spanCount) {
            outRect.setEmpty();
            return;
        }
        int spanIndex = z ? gridLayoutManager.getSpanSizeLookup().getSpanIndex(childAdapterPosition, spanCount) : layoutParams2.getSpanIndex();
        if (spanIndex == -1) {
            outRect.setEmpty();
            return;
        }
        int i2 = this.f145176g;
        if (i2 < 0) {
            i2 = spanCount > 4 ? this.f145175c : spanCount == 4 ? this.d : this.e;
        }
        int i3 = this.f145175c;
        boolean z3 = spanIndex == 0;
        boolean z4 = spanSize + spanIndex == spanCount;
        float f4 = spanCount;
        float fA = v0.a.a(spanCount, 1, i2, i3 * 2) / f4;
        if (z3) {
            i = (int) (fA - i3);
        } else if (z4) {
            i3 = (int) (fA - i3);
            i = i3;
        } else {
            float f5 = ((spanCount - spanIndex) * i2) / f4;
            float f6 = (i2 * r5) / f4;
            float f32 = fA / (f5 + f6);
            i3 = (int) (f5 * f32);
            i = (int) (f6 * f32);
        }
        if (parent.getLayoutDirection() == 1) {
            outRect.left = i;
            outRect.right = i3;
        } else {
            outRect.left = i3;
            outRect.right = i;
        }
        int i5 = this.f145176g;
        int i6 = i5 >= 0 ? i5 / 2 : this.f;
        outRect.top = i6;
        outRect.bottom = i6;
    }

    public j() {
        this(-1.0f);
    }
}
