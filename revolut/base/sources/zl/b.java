package zl;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.d f323136b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f323135a = 350;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Animator f323137c = a();

    public b(uc.d dVar) {
        this.f323136b = dVar;
    }

    public abstract Animator a();

    public final void b(long j2) {
        this.f323135a = j2;
        Animator animator = this.f323137c;
        if (animator instanceof ValueAnimator) {
            animator.setDuration(j2);
        }
    }

    public final void c() {
        Animator animator = this.f323137c;
        if (animator == null || animator.isRunning()) {
            return;
        }
        this.f323137c.start();
    }
}
