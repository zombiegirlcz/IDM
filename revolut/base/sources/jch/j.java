package jch;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f172802b;

    public j(List defaultFilters, List filters) {
        Intrinsics.checkNotNullParameter(defaultFilters, "defaultFilters");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f172801a = defaultFilters;
        this.f172802b = filters;
    }

    public static j a(j jVar, List filters) {
        List defaultFilters = jVar.f172801a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(defaultFilters, "defaultFilters");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new j(defaultFilters, filters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f172801a, jVar.f172801a) && Intrinsics.f(this.f172802b, jVar.f172802b);
    }

    public final int hashCode() {
        return this.f172802b.hashCode() + (this.f172801a.hashCode() * 31);
    }
}
