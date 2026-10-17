package knd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he3.b f186122c;
    public final boolean d;
    public final lzi.i e;
    public final long f;

    public o(List allIntervals, List loadIntervals, he3.b dateFilter, boolean z) {
        Intrinsics.checkNotNullParameter(allIntervals, "allIntervals");
        Intrinsics.checkNotNullParameter(loadIntervals, "loadIntervals");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        this.f186120a = allIntervals;
        this.f186121b = loadIntervals;
        this.f186122c = dateFilter;
        this.d = z;
        this.e = lzi.i.MONTHLY;
        this.f = 1L;
    }

    @Override // knd.p
    public final long a() {
        return this.f;
    }

    @Override // knd.p
    public final he3.b b() {
        return this.f186122c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f186120a, oVar.f186120a) && Intrinsics.f(this.f186121b, oVar.f186121b) && this.f186122c == oVar.f186122c && this.d == oVar.d;
    }

    @Override // knd.p
    public final lzi.i getPeriodType() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f186122c.hashCode() + p.a.d(this.f186120a.hashCode() * 31, 31, this.f186121b)) * 31);
    }
}
