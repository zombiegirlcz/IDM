package tw0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f274792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f274793b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f274794c = -1;

    public c(float f) {
        this.f274792a = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (this.f274793b < 0) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f274793b = kli.a.k(context, this.f274792a);
        }
        if (this.f274794c < 0) {
            this.f274794c = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
        }
        boolean z = childAdapterPosition == 0;
        boolean z3 = childAdapterPosition == state.getItemCount() - 1;
        int i = z ? this.f274794c : this.f274793b;
        int i2 = z3 ? this.f274794c : 0;
        if (parent.getLayoutDirection() == 1) {
            outRect.right = i;
            outRect.left = i2;
        } else {
            outRect.left = i;
            outRect.right = i2;
        }
    }
}
