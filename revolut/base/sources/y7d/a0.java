package y7d;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends DefaultItemAnimator {

    @NotNull
    private static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f311464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f311465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f311466c;
    public final b d;
    public boolean e;
    public long f;

    public a0(long j2, float f, b onAllRemoveAnimationsDone) {
        AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(onAllRemoveAnimationsDone, "onAllRemoveAnimationsDone");
        this.f311464a = j2;
        this.f311465b = f;
        this.f311466c = interpolator;
        this.d = onAllRemoveAnimationsDone;
        this.e = true;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        View view = holder.itemView;
        float translationY = view.getTranslationY();
        boolean z = this.e;
        float f = this.f311465b;
        if (!z) {
            f = -f;
        }
        view.setTranslationY(translationY + f);
        Intrinsics.checkNotNullParameter(holder, "holder");
        long layoutPosition = (((long) holder.getLayoutPosition()) * 100) + 300;
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Long lValueOf = bindingAdapter != null ? Long.valueOf((((long) (bindingAdapter.getItemCount() - 1)) * 100) + 300) : null;
        long jLongValue = lValueOf != null ? 300 + (lValueOf.longValue() - layoutPosition) : 300L;
        Long lValueOf2 = Long.valueOf(layoutPosition);
        Long lValueOf3 = Long.valueOf(jLongValue);
        long jLongValue2 = lValueOf2.longValue();
        long jLongValue3 = lValueOf3.longValue();
        this.f = Math.max(this.f, jLongValue3);
        holder.itemView.setTag(Long.valueOf(jLongValue3));
        holder.itemView.animate().alpha(1.0f).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(jLongValue2).setInterpolator(this.f311466c).setStartDelay(Math.max(this.f311464a - System.currentTimeMillis(), 0L)).setListener(new cx0.f(new y(this, holder, 0), new y(this, holder, 1), 1)).start();
        return true;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateRemove(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Long l2 = (Long) holder.itemView.getTag();
        if (l2 == null) {
            dispatchRemoveFinished(holder);
            return false;
        }
        holder.itemView.animate().alpha(BitmapDescriptorFactory.HUE_RED).translationY(this.f311465b).setDuration(l2.longValue()).setInterpolator(this.f311466c).setListener(new cx0.f(new y(this, holder, 2), new qg7.k(l2, 25, this, holder), 1)).start();
        return true;
    }
}
