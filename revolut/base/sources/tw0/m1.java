package tw0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m1 extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f274851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f274852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f274853c;
    public float d;
    public float e;
    public float f;

    public m1(l0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f274851a = callback;
        this.f274852b = new j0(this);
    }

    public static void b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f4) {
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setTranslationX(f);
        itemView.setTranslationY(f4);
        if (recyclerView != null && itemView.getTag(R$id.widgetItemTouchHelper_draggedItemOriginalElevation) == null) {
            Float fValueOf = Float.valueOf(itemView.getElevation());
            itemView.setElevation(yp0.y.e(recyclerView, null) + 1.0f);
            itemView.setTag(R$id.widgetItemTouchHelper_draggedItemOriginalElevation, fValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f274851a.I1();
        j0 j0Var = this.f274852b;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Animator animator = j0Var.f274825b;
        if (animator != null) {
            animator.cancel();
        }
        i0 i0Var = j0Var.f274826c;
        if (i0Var != null) {
            i0Var.cancel();
        }
        j0Var.f274826c = null;
        if ((viewHolder instanceof op0.o) && ((com.revolut.core.ui_kit.delegates.widgets.m) ((op0.o) viewHolder)).f55423m) {
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewHolder.itemView.getHeight(), ((com.revolut.core.ui_kit.delegates.widgets.m) ((op0.o) viewHolder)).f55424n);
            valueAnimatorOfInt.addUpdateListener(new ap0.m(itemView, 13));
            valueAnimatorOfInt.addListener(new es0.z(itemView, -2, 2));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "apply(...)");
            valueAnimatorOfInt.start();
            j0Var.f274825b = valueAnimatorOfInt;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder.itemView.animate();
        viewPropertyAnimatorAnimate.setListener(new g0(viewHolder));
        viewPropertyAnimatorAnimate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).scaleX(1.0f).scaleY(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
        View itemView2 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        Object tag2 = itemView2.getTag(R$id.widgetItemTouchHelper_draggedItemOriginalElevation);
        Float f = tag2 instanceof Float ? (Float) tag2 : null;
        if (f != null) {
            itemView2.setElevation(f.floatValue());
        }
        itemView2.setTag(R$id.widgetItemTouchHelper_draggedItemOriginalElevation, null);
        viewHolder.itemView.setHapticFeedbackEnabled(true);
        this.f274853c = false;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return ItemTouchHelper.Callback.makeMovementFlags(viewHolder instanceof op0.p ? 15 : 0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onChildDraw(Canvas c2, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f4, int i, boolean z) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (f == BitmapDescriptorFactory.HUE_RED && f4 == BitmapDescriptorFactory.HUE_RED && !this.f274853c) {
            return;
        }
        this.f274853c = true;
        b(recyclerView, viewHolder, f, f4);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f274851a.m1(viewHolder.getAbsoluteAdapterPosition(), target.getAbsoluteAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
