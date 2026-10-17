package az0;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.i0 f11340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f11341c;
    public final l0 d;
    public ValueAnimator e;

    public p0(String url2, d7.i0 task, k0 successListener, l0 failureListener) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(successListener, "successListener");
        Intrinsics.checkNotNullParameter(failureListener, "failureListener");
        this.f11339a = url2;
        this.f11340b = task;
        this.f11341c = successListener;
        this.d = failureListener;
        this.e = null;
    }

    public final ValueAnimator a() {
        return this.e;
    }

    public final d7.d0 b() {
        return this.d;
    }

    public final d7.d0 c() {
        return this.f11341c;
    }

    public final d7.i0 d() {
        return this.f11340b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f11339a, p0Var.f11339a) && this.f11340b.equals(p0Var.f11340b) && equals(p0Var.f11341c) && equals(p0Var.d) && Intrinsics.f(this.e, p0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (hashCode() + ((hashCode() + ((this.f11340b.hashCode() + (this.f11339a.hashCode() * 31)) * 31)) * 31)) * 31;
        ValueAnimator valueAnimator = this.e;
        return iHashCode + (valueAnimator == null ? 0 : valueAnimator.hashCode());
    }
}
