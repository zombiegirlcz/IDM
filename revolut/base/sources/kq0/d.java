package kq0;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f188288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f188289c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;

    public /* synthetic */ d(a aVar, b bVar, View view, View view2, int i) {
        this.f188287a = i;
        this.f188288b = aVar;
        this.f188289c = bVar;
        this.d = view;
        this.e = view2;
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
        int i = this.f188287a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f188287a) {
            case 0:
                View[] views = {this.d, this.e};
                this.f188288b.getClass();
                b animatorTag = this.f188289c;
                Intrinsics.checkNotNullParameter(animatorTag, "animatorTag");
                Intrinsics.checkNotNullParameter(views, "views");
                for (int i = 0; i < 2; i++) {
                    View view = views[i];
                    if (view.getTag().getClass().equals(animatorTag.getClass())) {
                        view.setTag(null);
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f188287a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f188287a) {
            case 0:
                break;
            default:
                View[] views = {this.d, this.e};
                this.f188288b.getClass();
                b animatorTag = this.f188289c;
                Intrinsics.checkNotNullParameter(animatorTag, "animatorTag");
                Intrinsics.checkNotNullParameter(views, "views");
                for (int i = 0; i < 2; i++) {
                    views[i].setTag(animatorTag);
                }
                break;
        }
    }
}
