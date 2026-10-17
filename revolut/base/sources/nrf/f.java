package nrf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f218637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f218638c;
    public final dj0.d d;

    public f(dj0.d total, boolean z, List breakdown, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f218636a = total;
        this.f218637b = z;
        this.f218638c = breakdown;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f218636a, fVar.f218636a) && this.f218637b == fVar.f218637b && Intrinsics.f(this.f218638c, fVar.f218638c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(this.f218636a.hashCode() * 31, 31, this.f218637b), 31, this.f218638c);
        dj0.d dVar = this.d;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }
}
