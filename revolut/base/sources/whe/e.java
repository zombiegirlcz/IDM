package whe;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import ix0.a2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener, a2 {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f297632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.a f297633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f297634c = new Handler(Looper.getMainLooper());
    public ViewTreeObserver d;

    public e(View view, a0.a aVar) {
        this.f297632a = view;
        this.f297633b = aVar;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    @Override // ix0.a2
    public final void cancel() {
        View view = this.f297632a;
        onViewDetachedFromWindow(view);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f297634c.postAtFrontOfQueue(this.f297633b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
        this.d = viewTreeObserver;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            this.d = null;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this);
            } else {
                this.f297632a.getViewTreeObserver().removeOnDrawListener(this);
            }
        }
    }
}
