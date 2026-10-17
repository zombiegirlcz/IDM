package cyl;

import android.animation.Animator;
import android.view.View;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendingMessageAnimationContainerLayout f110127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f110128c;

    public /* synthetic */ d(SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout, View view, int i) {
        this.f110126a = i;
        this.f110127b = sendingMessageAnimationContainerLayout;
        this.f110128c = view;
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
        int i = this.f110126a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f110126a) {
            case 0:
                this.f110127b.f107120h = null;
                this.f110128c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f110126a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f110126a) {
            case 0:
                break;
            default:
                this.f110127b.f107120h = null;
                this.f110128c.setVisibility(4);
                break;
        }
    }
}
