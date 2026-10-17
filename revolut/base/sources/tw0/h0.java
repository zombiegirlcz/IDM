package tw0;

import android.animation.Animator;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f274812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f274813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f274814c;
    public final /* synthetic */ tml.a d;
    public final /* synthetic */ float e;
    public final /* synthetic */ View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f274815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f274816h;

    public h0(Ref$BooleanRef ref$BooleanRef, j0 j0Var, RecyclerView recyclerView, tml.a aVar, float f, View view, float f4, Ref$BooleanRef ref$BooleanRef2) {
        this.f274812a = ref$BooleanRef;
        this.f274813b = j0Var;
        this.f274814c = recyclerView;
        this.d = aVar;
        this.e = f;
        this.f = view;
        this.f274815g = f4;
        this.f274816h = ref$BooleanRef2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f274816h.f186407a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i0 i0Var;
        boolean z = this.f274812a.f186407a;
        j0 j0Var = this.f274813b;
        if (!z) {
            RecyclerView recyclerView = this.f274814c;
            boolean zIsLaidOut = ViewCompat.isLaidOut(recyclerView);
            tml.a aVar = this.d;
            if (!zIsLaidOut || recyclerView.isLayoutRequested()) {
                i0Var = new i0(recyclerView, aVar, recyclerView, this.e, this.f, this.f274815g, this.f274813b);
                recyclerView.addOnLayoutChangeListener(i0Var);
            } else {
                aVar.invoke();
                recyclerView.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, this.e, this.f.getTop() + this.f274815g, 0));
                j0Var.f274826c = null;
                i0Var = null;
            }
            j0Var.f274826c = i0Var;
        }
        j0Var.f274825b = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
