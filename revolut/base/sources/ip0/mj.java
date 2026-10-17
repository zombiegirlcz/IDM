package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f165388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f165389c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f165390g;

    public mj(int i, dj0.d base, dj0.d forecast, dj0.d upperInnerBound, dj0.d upperOuterBound, dj0.d lowerInnerBound, dj0.d lowerOuterBound) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(forecast, "forecast");
        Intrinsics.checkNotNullParameter(upperInnerBound, "upperInnerBound");
        Intrinsics.checkNotNullParameter(upperOuterBound, "upperOuterBound");
        Intrinsics.checkNotNullParameter(lowerInnerBound, "lowerInnerBound");
        Intrinsics.checkNotNullParameter(lowerOuterBound, "lowerOuterBound");
        this.f165387a = i;
        this.f165388b = base;
        this.f165389c = forecast;
        this.d = upperInnerBound;
        this.e = upperOuterBound;
        this.f = lowerInnerBound;
        this.f165390g = lowerOuterBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj2;
        return this.f165387a == mjVar.f165387a && Intrinsics.f(this.f165388b, mjVar.f165388b) && Intrinsics.f(this.f165389c, mjVar.f165389c) && Intrinsics.f(this.d, mjVar.d) && Intrinsics.f(this.e, mjVar.e) && Intrinsics.f(this.f, mjVar.f) && Intrinsics.f(this.f165390g, mjVar.f165390g);
    }

    public final int hashCode() {
        return this.f165390g.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(Integer.hashCode(this.f165387a) * 31, 31, this.f165388b), 31, this.f165389c), 31, this.d), 31, this.e), 31, this.f);
    }
}
