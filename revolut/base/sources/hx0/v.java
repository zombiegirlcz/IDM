package hx0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f156344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f156345c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;

    public /* synthetic */ v(Object obj2, AppCompatImageView appCompatImageView, View view, AppCompatImageView appCompatImageView2, int i) {
        this.f156343a = i;
        this.f156344b = obj2;
        this.f156345c = appCompatImageView;
        this.d = view;
        this.e = appCompatImageView2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f156343a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f156343a) {
            case 0:
                Iterator it8 = ((List) this.f156344b).iterator();
                while (it8.hasNext()) {
                    ((View) it8.next()).setHasTransientState(false);
                }
                ViewGroup viewGroup = (ViewGroup) this.d;
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
                break;
            case 1:
                break;
            default:
                ViewParent parent = ((View) ((jji.e) this.f156344b).f174964c).getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView((AppCompatImageView) this.f156345c);
                }
                this.d.setVisibility(0);
                ((AppCompatImageView) this.e).setVisibility(0);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f156343a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f156343a) {
            case 0:
                Iterator it8 = ((List) this.f156345c).iterator();
                while (it8.hasNext()) {
                    ((View) it8.next()).setHasTransientState(true);
                }
                ViewGroup viewGroup = (ViewGroup) this.e;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                break;
            case 1:
                ViewParent parent = ((jji.c) this.f156344b).f174958b.getParent();
                Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).addView((AppCompatImageView) this.f156345c);
                this.d.setVisibility(4);
                ((AppCompatImageView) this.e).setVisibility(4);
                break;
        }
    }

    public v(List list, ViewGroup viewGroup, List list2, ViewGroup viewGroup2) {
        this.f156343a = 0;
        this.f156344b = list;
        this.d = viewGroup;
        this.f156345c = list2;
        this.e = viewGroup2;
    }
}
