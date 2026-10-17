package cl4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f24948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24949c;

    public j(dj0.d spendsCap, String rate, String period) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(spendsCap, "spendsCap");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f24947a = rate;
        this.f24948b = spendsCap;
        this.f24949c = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f24947a, jVar.f24947a) && Intrinsics.f(this.f24948b, jVar.f24948b) && Intrinsics.f(this.f24949c, jVar.f24949c);
    }

    public final int hashCode() {
        return this.f24949c.hashCode() + v7.c(this.f24947a.hashCode() * 31, 31, this.f24948b);
    }
}
