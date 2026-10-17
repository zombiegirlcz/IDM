package gp0;

import fp0.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp0.i f145204a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f145204a, ((g) obj2).f145204a);
    }

    @Override // gp0.i
    public final k getSurface() {
        return this.f145204a;
    }

    public final int hashCode() {
        return this.f145204a.hashCode();
    }

    public g(fp0.i surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f145204a = surface;
    }

    public /* synthetic */ g(int i) {
        this(fp0.f.f137022a);
    }
}
