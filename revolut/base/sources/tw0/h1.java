package tw0;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 extends DefaultItemAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f274817a;

    public h1(RecyclerView recyclerView, koi.h adapter, boolean z) {
        d0 widgetAnimationHelper = new d0();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(widgetAnimationHelper, "widgetAnimationHelper");
        this.f274817a = new c0(recyclerView, adapter, z, widgetAnimationHelper);
        setSupportsChangeAnimations(false);
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f274817a.a(holder, new tml.a(this, holder, 22))) {
            return false;
        }
        boolean zAnimateAdd = super.animateAdd(holder);
        holder.itemView.setAlpha(1.0f);
        return zAnimateAdd;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i5) {
        if (viewHolder != null) {
            dispatchChangeFinished(viewHolder, true);
        }
        if (viewHolder2 != null && !viewHolder2.equals(viewHolder)) {
            dispatchChangeFinished(viewHolder2, false);
        }
        return false;
    }
}
