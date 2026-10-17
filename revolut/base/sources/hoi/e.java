package hoi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.ViewHolder f154314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f154316c;

    public e(c cVar, RecyclerView.ViewHolder holder, boolean z) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f154316c = cVar;
        this.f154314a = holder;
        this.f154315b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        RecyclerView.ViewHolder viewHolder = this.f154314a;
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.animate().setListener(null);
        itemView.setAlpha(1.0f);
        itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        boolean z = this.f154315b;
        c cVar = this.f154316c;
        cVar.dispatchChangeFinished(viewHolder, z);
        cVar.o.remove(viewHolder);
        cVar.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f154316c.dispatchChangeStarting(this.f154314a, this.f154315b);
    }
}
