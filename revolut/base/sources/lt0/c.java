package lt0;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f199729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f199730c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f199731g;

    public c(int i, dj0.d base, dj0.d forecast, dj0.d upperInnerBound, dj0.d upperOuterBound, dj0.d lowerInnerBound, dj0.d lowerOuterBound) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(forecast, "forecast");
        Intrinsics.checkNotNullParameter(upperInnerBound, "upperInnerBound");
        Intrinsics.checkNotNullParameter(upperOuterBound, "upperOuterBound");
        Intrinsics.checkNotNullParameter(lowerInnerBound, "lowerInnerBound");
        Intrinsics.checkNotNullParameter(lowerOuterBound, "lowerOuterBound");
        this.f199728a = i;
        this.f199729b = base;
        this.f199730c = forecast;
        this.d = upperInnerBound;
        this.e = upperOuterBound;
        this.f = lowerInnerBound;
        this.f199731g = lowerOuterBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f199728a == cVar.f199728a && Intrinsics.f(this.f199729b, cVar.f199729b) && Intrinsics.f(this.f199730c, cVar.f199730c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f199731g, cVar.f199731g);
    }

    public final int hashCode() {
        return this.f199731g.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(Integer.hashCode(this.f199728a) * 31, 31, this.f199729b), 31, this.f199730c), 31, this.d), 31, this.e), 31, this.f);
    }
}
