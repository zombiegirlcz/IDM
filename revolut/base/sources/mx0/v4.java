package mx0;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v4 extends hoi.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AccelerateInterpolator f210045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DecelerateInterpolator f210046q;

    public v4() {
        super(true, true, true, true, true);
        this.f210045p = new AccelerateInterpolator(2.0f);
        this.f210046q = new DecelerateInterpolator();
    }

    @Override // hoi.c
    public final void animateAddImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(1.0f).setDuration(getAddDuration()).setInterpolator(this.f210045p).setListener(new hoi.d(this, holder)).start();
    }

    @Override // hoi.c
    public final void animateRemoveImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(getRemoveDuration()).setInterpolator(this.f210046q).setListener(new hoi.f(this, holder)).start();
    }

    @Override // hoi.c
    public final void g(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }
}
