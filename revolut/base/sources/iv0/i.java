package iv0;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f168678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uw0.i f168679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f168680c;
    public final /* synthetic */ boolean d;

    public i(j jVar, uw0.i iVar, View view, boolean z) {
        this.f168678a = jVar;
        this.f168679b = iVar;
        this.f168680c = view;
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        uw0.i iVar = this.f168679b;
        View view = this.f168680c;
        j jVar = this.f168678a;
        jVar.e(iVar, view);
        jVar.e.i(this.d);
    }
}
