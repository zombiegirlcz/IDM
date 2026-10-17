package cl4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f24946c;
    public final String d;

    public i(dj0.d spendsThreshold, String lowerRate, String higherRate, String period) {
        Intrinsics.checkNotNullParameter(lowerRate, "lowerRate");
        Intrinsics.checkNotNullParameter(higherRate, "higherRate");
        Intrinsics.checkNotNullParameter(spendsThreshold, "spendsThreshold");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f24944a = lowerRate;
        this.f24945b = higherRate;
        this.f24946c = spendsThreshold;
        this.d = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f24944a, iVar.f24944a) && Intrinsics.f(this.f24945b, iVar.f24945b) && Intrinsics.f(this.f24946c, iVar.f24946c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.c(this.f24944a.hashCode() * 31, 31, this.f24945b), 31, this.f24946c);
    }
}
