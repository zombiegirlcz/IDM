package tw0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends hoi.s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f274876r;

    public s0(RecyclerView recyclerView, koi.h adapter, boolean z, joi.c cVar) {
        d0 widgetAnimationHelper = new d0();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(widgetAnimationHelper, "widgetAnimationHelper");
        super(recyclerView, cVar);
        this.f274876r = new c0(recyclerView, adapter, z, widgetAnimationHelper);
        setSupportsChangeAnimations(false);
    }

    @Override // hoi.s, hoi.c, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f274876r.a(holder, new tml.a(this, holder, 21))) {
            return false;
        }
        super.animateAdd(holder);
        return true;
    }

    @Override // hoi.c, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        dispatchChangeFinished(oldHolder, true);
        if (viewHolder != null && viewHolder != oldHolder) {
            dispatchChangeFinished(viewHolder, false);
        }
        return false;
    }

    @Override // hoi.s
    public final void j(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.j(holder);
        holder.itemView.setAlpha(1.0f);
    }
}
