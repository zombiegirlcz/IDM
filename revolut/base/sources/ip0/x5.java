package ip0;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes19.dex */
public final class x5 implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OvershootInterpolator f167094a = new OvershootInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearInterpolator f167095b = new LinearInterpolator();

    @Override // ip0.z5
    public final Interpolator a() {
        return this.f167094a;
    }

    @Override // ip0.z5
    public final boolean b() {
        return false;
    }

    @Override // ip0.z5
    public final Interpolator c() {
        return this.f167095b;
    }

    @Override // ip0.z5
    public final int d() {
        return 0;
    }

    @Override // ip0.z5
    public final long e() {
        return 100L;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof x5);
    }

    @Override // ip0.z5
    public final long f() {
        return 0L;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }
}
