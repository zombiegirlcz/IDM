package hoi;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class j extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TimeInterpolator f154327p;

    public j() {
        this(null, 7);
    }

    @Override // hoi.c
    public final void animateAddImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(1.0f).setDuration(getAddDuration()).setInterpolator(this.f154327p).setListener(new d(this, holder)).start();
    }

    @Override // hoi.c
    public final void animateRemoveImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(getRemoveDuration()).setInterpolator(this.f154327p).setListener(new f(this, holder)).start();
    }

    @Override // hoi.c
    public final void g(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(TimeInterpolator interpolator, int i) {
        interpolator = (i & 1) != 0 ? new DecelerateInterpolator() : interpolator;
        boolean z = (i & 4) != 0;
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        super(z, 28);
        this.f154327p = interpolator;
    }
}
