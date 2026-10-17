package hoi;

import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DecelerateInterpolator f154326p;

    public i() {
        this(0);
    }

    @Override // hoi.c
    public final void animateAddImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(1.0f).setDuration(getAddDuration()).setInterpolator(this.f154326p).setListener(new d(this, holder)).start();
    }

    @Override // hoi.c
    public final void animateRemoveImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(getRemoveDuration()).setInterpolator(this.f154326p).setListener(new f(this, holder)).start();
    }

    @Override // hoi.c
    public final void g(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    public i(int i) {
        DecelerateInterpolator interpolator = new DecelerateInterpolator();
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        super(true, 24);
        this.f154326p = interpolator;
    }
}
