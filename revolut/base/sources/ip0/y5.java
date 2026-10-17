package ip0;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes19.dex */
public final class y5 implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearInterpolator f167249a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearInterpolator f167250b = new LinearInterpolator();

    @Override // ip0.z5
    public final Interpolator a() {
        return this.f167249a;
    }

    @Override // ip0.z5
    public final boolean b() {
        return true;
    }

    @Override // ip0.z5
    public final Interpolator c() {
        return this.f167250b;
    }

    @Override // ip0.z5
    public final int d() {
        return 1;
    }

    @Override // ip0.z5
    public final long e() {
        return 300L;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof y5);
    }

    @Override // ip0.z5
    public final long f() {
        return 2000L;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(1) * 31);
    }
}
