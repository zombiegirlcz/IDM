package knd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.j f186115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.h f186116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he3.b f186117c;

    public n(lzi.h cycle, lzi.j period) {
        he3.b dateFilter = he3.b.START_DATE;
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        this.f186115a = period;
        this.f186116b = cycle;
        this.f186117c = dateFilter;
    }

    @Override // knd.p
    public final long a() {
        return this.f186115a.b();
    }

    @Override // knd.p
    public final he3.b b() {
        return this.f186117c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f186115a, nVar.f186115a) && Intrinsics.f(this.f186116b, nVar.f186116b) && this.f186117c == nVar.f186117c;
    }

    @Override // knd.p
    public final lzi.i getPeriodType() {
        return this.f186115a.f200980a;
    }

    public final int hashCode() {
        return this.f186117c.hashCode() + ((this.f186116b.hashCode() + (this.f186115a.hashCode() * 31)) * 31);
    }
}
