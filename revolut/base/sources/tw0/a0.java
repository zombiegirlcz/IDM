package tw0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f274786c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0() {
        int i = 0;
        this(i, 15, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.top = this.f274786c;
        outRect.bottom = this.d;
        outRect.left = this.f274784a;
        outRect.right = this.f274785b;
    }

    public /* synthetic */ a0(int i, int i2, int i3) {
        this(0, (i2 & 2) != 0 ? 0 : i, 0, 0);
    }

    public a0(int i, int i2, int i3, int i5) {
        this.f274784a = i;
        this.f274785b = i2;
        this.f274786c = i3;
        this.d = i5;
    }
}
