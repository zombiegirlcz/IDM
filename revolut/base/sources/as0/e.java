package as0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ix0.j2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f8744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f8745c;
    public final /* synthetic */ ScreenContentRecyclerView d;
    public final /* synthetic */ d e;
    public final /* synthetic */ j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f8746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f8747h;
    public final /* synthetic */ ScreenContentRecyclerView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ValueAnimator valueAnimator, j2 j2Var, f fVar, ScreenContentRecyclerView screenContentRecyclerView, d dVar, j2 j2Var2, ScreenContentRecyclerView screenContentRecyclerView2, d dVar2, ScreenContentRecyclerView screenContentRecyclerView3) {
        super(valueAnimator);
        this.f8744b = j2Var;
        this.f8745c = fVar;
        this.d = screenContentRecyclerView;
        this.e = dVar;
        this.f = j2Var2;
        this.f8746g = screenContentRecyclerView2;
        this.f8747h = dVar2;
        this.i = screenContentRecyclerView3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f.cancel();
        this.f8745c.a();
        d dVar = this.f8747h;
        ScreenContentRecyclerView screenContentRecyclerView = this.f8746g;
        screenContentRecyclerView.removeOnAttachStateChangeListener(dVar);
        screenContentRecyclerView.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f8744b.cancel();
        this.f8745c.a();
        d dVar = this.e;
        ScreenContentRecyclerView screenContentRecyclerView = this.d;
        screenContentRecyclerView.removeOnAttachStateChangeListener(dVar);
        screenContentRecyclerView.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue("alpha");
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        f fVar = this.f8745c;
        fVar.f8748a = iIntValue;
        if (fVar.f.isEmpty()) {
            return;
        }
        this.i.invalidate();
    }
}
