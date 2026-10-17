package wq0;

import android.animation.Animator;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f299375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f299376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f299377c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    public f(g gVar, boolean z, Function0 function0, boolean z3, Function0 function02) {
        this.f299375a = gVar;
        this.f299376b = z;
        this.f299377c = function0;
        this.d = z3;
        this.e = function02;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.f299375a;
        gVar.f299379b = null;
        if (!this.f299376b) {
            Iterator it8 = gVar.f299378a.iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).setVisibility(8);
            }
        }
        this.f299377c.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.d) {
            Iterator it8 = this.f299375a.f299378a.iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).setVisibility(0);
            }
        }
        this.e.invoke();
    }
}
