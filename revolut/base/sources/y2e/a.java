package y2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f310632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310634c;
    public final g2e.a d;

    public a() {
        this(null, 15);
    }

    public static a a(a aVar, lk0.g brands, List availableQuickFilters, ArrayList arrayList, g2e.a filtersState, int i) {
        if ((i & 1) != 0) {
            brands = aVar.f310632a;
        }
        if ((i & 2) != 0) {
            availableQuickFilters = aVar.f310633b;
        }
        List availableFilters = arrayList;
        if ((i & 4) != 0) {
            availableFilters = aVar.f310634c;
        }
        if ((i & 8) != 0) {
            filtersState = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(brands, "brands");
        Intrinsics.checkNotNullParameter(availableQuickFilters, "availableQuickFilters");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(filtersState, "filtersState");
        return new a(brands, availableQuickFilters, availableFilters, filtersState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310632a, aVar.f310632a) && Intrinsics.f(this.f310633b, aVar.f310633b) && Intrinsics.f(this.f310634c, aVar.f310634c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f310632a.f196174a.hashCode() * 31, 31, this.f310633b), 31, this.f310634c);
    }

    public a(lk0.g brands, List availableQuickFilters, List availableFilters, g2e.a filtersState) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        Intrinsics.checkNotNullParameter(availableQuickFilters, "availableQuickFilters");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(filtersState, "filtersState");
        this.f310632a = brands;
        this.f310633b = availableQuickFilters;
        this.f310634c = availableFilters;
        this.d = filtersState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(g2e.a aVar, int i) {
        f0 f0Var = f0.f322471a;
        this(new lk0.g(f0Var), f0Var, f0Var, (i & 8) != 0 ? new g2e.a(0) : aVar);
    }
}
