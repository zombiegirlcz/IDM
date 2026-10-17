package god;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f145132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145133c;
    public final Map d;

    public a() {
        this(null, 15);
    }

    public static a a(a aVar, List countries, LinkedHashSet linkedHashSet, String searchQuery, Map existingTripCounts, int i) {
        if ((i & 1) != 0) {
            countries = aVar.f145131a;
        }
        Set selectedCountryCodes = linkedHashSet;
        if ((i & 2) != 0) {
            selectedCountryCodes = aVar.f145132b;
        }
        if ((i & 4) != 0) {
            searchQuery = aVar.f145133c;
        }
        if ((i & 8) != 0) {
            existingTripCounts = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(selectedCountryCodes, "selectedCountryCodes");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(existingTripCounts, "existingTripCounts");
        return new a(countries, selectedCountryCodes, searchQuery, existingTripCounts);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f145131a, aVar.f145131a) && Intrinsics.f(this.f145132b, aVar.f145132b) && Intrinsics.f(this.f145133c, aVar.f145133c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.f(this.f145131a.hashCode() * 31, 31, this.f145132b), 31, this.f145133c);
    }

    public a(List countries, Set selectedCountryCodes, String searchQuery, Map existingTripCounts) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(selectedCountryCodes, "selectedCountryCodes");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(existingTripCounts, "existingTripCounts");
        this.f145131a = countries;
        this.f145132b = selectedCountryCodes;
        this.f145133c = searchQuery;
        this.d = existingTripCounts;
    }

    public a(Map map, int i) {
        this(f0.f322471a, h0.f322473a, "", (i & 8) != 0 ? r0.g() : map);
    }
}
