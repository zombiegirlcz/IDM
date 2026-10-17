package hoi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f154322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f154323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f154324c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f154325g;

    public h(c cVar, RecyclerView.ViewHolder viewHolder, int i, View view, int i2, Float f, ViewPropertyAnimator viewPropertyAnimator) {
        this.f154322a = cVar;
        this.f154323b = viewHolder;
        this.f154324c = i;
        this.d = view;
        this.e = i2;
        this.f = f;
        this.f154325g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        int i = this.f154324c;
        View view = this.d;
        if (i != 0) {
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (this.e != 0) {
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
        Float f = this.f;
        if (f != null) {
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f154325g.setListener(null);
        c cVar = this.f154322a;
        RecyclerView.ViewHolder viewHolder = this.f154323b;
        cVar.dispatchMoveFinished(viewHolder);
        cVar.f154311n.remove(viewHolder);
        cVar.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f154322a.dispatchMoveStarting(this.f154323b);
    }
}
