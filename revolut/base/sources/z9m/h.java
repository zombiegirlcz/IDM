package z9m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f320529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eim.c f320530b;

    public h(ViewPropertyAnimator viewPropertyAnimator, eim.c cVar) {
        this.f320529a = viewPropertyAnimator;
        this.f320530b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationEnd(animation);
        this.f320529a.setListener(null);
        m.Companion companion = yhm.m.INSTANCE;
        this.f320530b.resumeWith(Unit.f186387a);
    }
}
