package vu0;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f292136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f292137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f292138c;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f292139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f292140h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f292141j;
    public b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f292142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f292143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f292144n;

    public d(View view, a config) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f292136a = view;
        this.f292137b = config;
        this.f292138c = te0.w.y0(new vt3.a(this, 2));
        this.d = -1.0f;
        this.e = -1.0f;
        Float f = config.f292129a;
        this.f292141j = f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
        this.k = b.UNDECIDED;
    }

    public final boolean a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f292142l = true;
            this.d = event.getX();
            this.e = event.getY();
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.f292139g = BitmapDescriptorFactory.HUE_RED;
            this.i = false;
            this.k = b.UNDECIDED;
        }
        a aVar = this.f292137b;
        if (((Boolean) aVar.f292130b.invoke()).booleanValue()) {
            this.k = b.REJECTED;
            e(false);
            return false;
        }
        if (actionMasked == 0) {
            boolean zBooleanValue = ((Boolean) aVar.f292131c.invoke(event)).booleanValue();
            this.k = zBooleanValue ? b.UNDECIDED : b.REJECTED;
            e(zBooleanValue);
            return zBooleanValue;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f292142l) {
                    e(false);
                    return false;
                }
                this.f = Math.abs(event.getX() - this.d);
                this.f292139g = Math.abs(event.getY() - this.e);
                int i = c.f292135a[this.k.ordinal()];
                if (i == 1) {
                    if (aVar.f || b(event)) {
                        e(true);
                        return true;
                    }
                    this.k = b.REJECTED;
                    e(false);
                    return false;
                }
                if (i == 2) {
                    e(false);
                    return false;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Math.max(this.f, this.f292139g) < this.f292141j) {
                    e(true);
                    return true;
                }
                boolean z = this.f >= this.f292139g && b(event);
                this.k = z ? b.CLAIMED : b.REJECTED;
                e(z);
                return z;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5 || actionMasked == 6) {
                    return this.f292142l && this.k != b.REJECTED;
                }
                this.f292142l = false;
                this.k = b.REJECTED;
                e(false);
                return false;
            }
        }
        this.f292142l = false;
        e(false);
        return true;
    }

    public final boolean b(MotionEvent motionEvent) {
        float x3 = motionEvent.getX() - this.d;
        a aVar = this.f292137b;
        return ((Boolean) aVar.d.invoke(motionEvent)).booleanValue() && ((Boolean) aVar.e.invoke(Float.valueOf(x3))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        View view;
        if (this.i || (view = this.f292140h) == null || this.f < ((Number) this.f292138c.getValue()).floatValue()) {
            return;
        }
        view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
        this.i = true;
    }

    public final void d(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            this.f292143m = false;
            this.f292144n = false;
        }
    }

    public final void e(boolean z) {
        if (z != this.f292144n) {
            this.f292144n = z;
            ViewParent parent = this.f292136a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(this.f292144n || this.f292143m);
            }
        }
    }

    public final void f() {
        this.f292142l = false;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.f292139g = BitmapDescriptorFactory.HUE_RED;
        this.i = false;
        this.k = b.UNDECIDED;
        this.f292143m = false;
        this.f292144n = false;
        ViewParent parent = this.f292136a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }
}
