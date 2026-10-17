package zr0;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;
import lq0.p;
import ms0.k5;
import uw0.j;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f324527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f324528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f324529c;
    public Animator d;
    public boolean e;

    public e(j holder) throws Throwable {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f324527a = holder;
        if (holder.itemView instanceof k5) {
            return;
        }
        hx7.e.n(new IllegalStateException("view must be a UIKitViewGroup in vh[".concat(holder.getClass().getName())));
    }

    public final void a() {
        Animator animator = this.d;
        if (animator != null) {
            animator.cancel();
        }
        p pVar = this.f324529c;
        if (pVar != null) {
            pVar.a();
        }
        this.f324529c = null;
    }
}
