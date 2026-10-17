package jq0;

import android.animation.TimeInterpolator;
import android.view.Choreographer;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f177361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f177362c;
    public long d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f177363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f177364h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f177365j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f177366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f177367m;

    /* JADX WARN: Multi-variable type inference failed */
    public i(g callback, TimeInterpolator interpolator) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.f177360a = (View) callback;
        this.f177361b = interpolator;
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
        this.f177362c = choreographer;
        this.d = -1L;
        this.e = -1L;
        this.f177367m = new h(this, 0);
    }

    public static void d(i iVar, float f, float f4, long j2) {
        iVar.e(f, f4, j2, -1L, false);
    }

    public final void a() {
        this.f = false;
        this.f177362c.removeFrameCallback(this.f177367m);
    }

    public final void b() {
        e(this.f177365j, this.f177364h, (long) ((1.0f - this.i) * this.d), -1L, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, jq0.g] */
    public final void c(float f) {
        a();
        this.f177363g = f;
        this.f177365j = f;
        this.f177360a.a(f);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, jq0.g] */
    public final void e(float f, float f4, long j2, long j3, boolean z) {
        a();
        this.e = j3;
        this.f177363g = f;
        this.f177364h = f4;
        this.d = j2;
        this.f177366l = z;
        this.f177365j = f;
        ?? r56 = this.f177360a;
        r56.a(f);
        if (j2 == 0 || f == f4) {
            this.f177365j = f4;
            r56.a(f4);
            return;
        }
        this.f = true;
        if (this.k && r56.b()) {
            this.f177362c.postFrameCallback(this.f177367m);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause$ui_kit_components_release() {
        this.k = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$ui_kit_components_release() {
        this.k = true;
        if (!this.f || this.f177364h == this.f177363g) {
            return;
        }
        b();
    }

    public /* synthetic */ i(g gVar) {
        this(gVar, new LinearInterpolator());
    }
}
