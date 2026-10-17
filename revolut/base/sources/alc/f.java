package alc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f6193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f6194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f6195c;
    public final dj0.d d;

    public f(dj0.d min, dj0.d max, dj0.d dVar, dj0.d stepSize) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(dVar, "default");
        Intrinsics.checkNotNullParameter(stepSize, "stepSize");
        this.f6193a = min;
        this.f6194b = max;
        this.f6195c = dVar;
        this.d = stepSize;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f6193a, fVar.f6193a) && Intrinsics.f(this.f6194b, fVar.f6194b) && Intrinsics.f(this.f6195c, fVar.f6195c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f6193a.hashCode() * 31, 31, this.f6194b), 31, this.f6195c);
    }
}
