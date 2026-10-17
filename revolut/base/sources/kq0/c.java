package kq0;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f188285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f188286c;

    public /* synthetic */ c(a aVar, View view, View view2, int i) {
        this.f188284a = i;
        this.f188285b = view;
        this.f188286c = view2;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f188284a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f188284a) {
            case 0:
                View viewToBeVisible = this.f188285b;
                Intrinsics.checkNotNullParameter(viewToBeVisible, "viewToBeVisible");
                View viewToBeGone = this.f188286c;
                Intrinsics.checkNotNullParameter(viewToBeGone, "viewToBeGone");
                viewToBeVisible.setVisibility(0);
                viewToBeGone.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f188284a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f188284a) {
            case 0:
                break;
            default:
                View viewToBeVisible = this.f188285b;
                Intrinsics.checkNotNullParameter(viewToBeVisible, "viewToBeVisible");
                View viewToBeGone = this.f188286c;
                Intrinsics.checkNotNullParameter(viewToBeGone, "viewToBeGone");
                viewToBeVisible.setVisibility(0);
                viewToBeGone.setVisibility(8);
                break;
        }
    }
}
