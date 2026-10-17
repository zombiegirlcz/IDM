package ls0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hoi.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends hoi.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Function1 f199574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Function1 f199575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DecelerateInterpolator f199576r;

    public a(Function1 translationXDelegate, Function1 function1) {
        DecelerateInterpolator interpolator = new DecelerateInterpolator();
        Intrinsics.checkNotNullParameter(translationXDelegate, "translationXDelegate");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        super(true, 28);
        this.f199574p = translationXDelegate;
        this.f199575q = function1;
        this.f199576r = interpolator;
    }

    public static float i(View view, RecyclerView.ViewHolder viewHolder) {
        return (((viewHolder.itemView.getRight() + viewHolder.itemView.getLeft()) / 2.0f) - (view.getWidth() / 2.0f)) / viewHolder.itemView.getWidth();
    }

    @Override // hoi.c
    public final Float a(RecyclerView.ViewHolder holder, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function1 function1 = this.f199575q;
        if (function1 != null) {
            return (Float) function1.invoke(Float.valueOf(i3 / holder.itemView.getWidth()));
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
        return null;
    }

    @Override // hoi.c
    public final void animateAddImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        k(holder);
        j(holder);
        holder.itemView.animate().alpha(1.0f).setDuration(getAddDuration()).setInterpolator(this.f199576r).setListener(new hoi.d(this, holder)).start();
    }

    @Override // hoi.c
    public final void animateRemoveImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(getRemoveDuration()).setInterpolator(this.f199576r).setListener(new f(this, holder)).start();
    }

    @Override // hoi.c
    public final float b(RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return ((Number) this.f199574p.invoke(Float.valueOf(i / holder.itemView.getWidth()))).floatValue();
    }

    @Override // hoi.c
    public final void g(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // hoi.c
    public final void h(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        k(holder);
        j(holder);
    }

    public final void j(RecyclerView.ViewHolder viewHolder) {
        Function1 function1 = this.f199575q;
        if (function1 == null) {
            return;
        }
        Object parent = viewHolder.itemView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        float fFloatValue = ((Number) function1.invoke(Float.valueOf(i(view, viewHolder)))).floatValue();
        viewHolder.itemView.setScaleX(fFloatValue);
        viewHolder.itemView.setScaleY(fFloatValue);
    }

    public final void k(RecyclerView.ViewHolder viewHolder) {
        Object parent = viewHolder.itemView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        viewHolder.itemView.setTranslationX(((Number) this.f199574p.invoke(Float.valueOf(i(view, viewHolder)))).floatValue());
    }
}
