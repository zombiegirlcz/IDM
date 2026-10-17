package ix0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener, a2 {

    @NotNull
    public static final i2 Companion = new i2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f169248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f169249c;

    public j2(View view, Runnable runnable) {
        this.f169247a = view;
        this.f169248b = runnable;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    @Override // ix0.a2
    public final void cancel() {
        View view = this.f169247a;
        onViewDetachedFromWindow(view);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f169248b.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
        this.f169249c = viewTreeObserver;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewTreeObserver viewTreeObserver = this.f169249c;
        if (viewTreeObserver != null) {
            this.f169249c = null;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                this.f169247a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
        }
    }
}
