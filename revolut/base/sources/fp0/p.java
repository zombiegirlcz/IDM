package fp0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import ix0.a2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f137029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gp0.i f137030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jq0.p f137031c;
    public boolean e;
    public a2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f137032g;
    public n d = n.NONE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f137033h = true;

    public p(View view, gp0.i iVar) {
        this.f137029a = view;
        this.f137030b = iVar;
        this.f = iVar.a(view);
        d(this.f137030b.getSurface());
        view.addOnAttachStateChangeListener(new es0.k(this, 2));
    }

    public static final void b(p pVar, boolean z) {
        if (pVar.f137033h == z) {
            return;
        }
        pVar.f137033h = z;
        if (z) {
            pVar.f = pVar.f137030b.a(pVar.f137029a);
        } else {
            pVar.f.cancel();
        }
        pVar.d(pVar.f137030b.getSurface());
    }

    public final void c(gp0.i animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (this.f137030b.equals(animator)) {
            return;
        }
        this.f.cancel();
        this.f137030b = animator;
        if (this.f137033h) {
            this.f = animator.a(this.f137029a);
        }
        d(animator.getSurface());
    }

    public final void d(k kVar) {
        n nVar = (this.f137033h && kVar.a()) ? n.SCALE_UP : n.NONE;
        boolean zB = kVar.b();
        jq0.p pVar = this.f137031c;
        n nVar2 = this.d;
        View view = this.f137029a;
        if (nVar2 == nVar && this.e == zB && (nVar == n.NONE || view.getStateListAnimator() == pVar)) {
            return;
        }
        jq0.p pVar2 = null;
        if (pVar != null) {
            pVar.f177385m = null;
            pVar.f177382h = false;
            pVar.f177383j = false;
            View view2 = pVar.f177378a;
            view2.animate().cancel();
            pVar.f177386n.removeCallbacks(pVar.o);
            pVar.f177389r.cancel();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            float f = pVar.d;
            viewPropertyAnimatorAnimate.scaleX(f).scaleY(f).setDuration(0L).start();
            view2.setScaleX(f);
            view2.setScaleY(f);
            pVar.a();
        }
        if (view.getStateListAnimator() == pVar) {
            view.setStateListAnimator(null);
        }
        int i = o.f137028a[nVar.ordinal()];
        if (i == 1) {
            pVar2 = new jq0.p(view, new es.e(this, 29), zB);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.f137031c = pVar2;
        this.d = nVar;
        this.e = zB;
        if (pVar2 != null) {
            view.setStateListAnimator(pVar2);
        }
    }
}
