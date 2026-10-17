package e7l;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f123351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f123352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f123353c;
    public final dj0.d d;

    public b(dj0.d min, dj0.d max, dj0.d daily, dj0.d monthly) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(daily, "daily");
        Intrinsics.checkNotNullParameter(monthly, "monthly");
        this.f123351a = min;
        this.f123352b = max;
        this.f123353c = daily;
        this.d = monthly;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f123351a, bVar.f123351a) && Intrinsics.f(this.f123352b, bVar.f123352b) && Intrinsics.f(this.f123353c, bVar.f123353c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f123351a.hashCode() * 31, 31, this.f123352b), 31, this.f123353c);
    }
}
