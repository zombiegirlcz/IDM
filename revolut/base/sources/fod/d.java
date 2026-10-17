package fod;

import do3.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f136929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f136930c;

    public d(List tripAnalytics, n user, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(tripAnalytics, "tripAnalytics");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f136928a = tripAnalytics;
        this.f136929b = user;
        this.f136930c = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f136928a, dVar.f136928a) && Intrinsics.f(this.f136929b, dVar.f136929b) && Intrinsics.f(this.f136930c, dVar.f136930c);
    }

    public final int hashCode() {
        return this.f136930c.hashCode() + ((this.f136929b.hashCode() + (this.f136928a.hashCode() * 31)) * 31);
    }
}
