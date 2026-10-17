package k3g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f180712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f180713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180714c;
    public final List d;
    public final List e;

    public d(Data searchResponse, TravelExperienceDatesSelection datesSelection, String query, List recentSearchDestinations, List popularDestinations) {
        Intrinsics.checkNotNullParameter(searchResponse, "searchResponse");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(recentSearchDestinations, "recentSearchDestinations");
        Intrinsics.checkNotNullParameter(popularDestinations, "popularDestinations");
        this.f180712a = searchResponse;
        this.f180713b = datesSelection;
        this.f180714c = query;
        this.d = recentSearchDestinations;
        this.e = popularDestinations;
    }

    public static d a(d dVar, Data data, String str, List list, List list2, int i) {
        if ((i & 1) != 0) {
            data = dVar.f180712a;
        }
        Data searchResponse = data;
        TravelExperienceDatesSelection datesSelection = dVar.f180713b;
        if ((i & 4) != 0) {
            str = dVar.f180714c;
        }
        String query = str;
        if ((i & 8) != 0) {
            list = dVar.d;
        }
        List recentSearchDestinations = list;
        if ((i & 16) != 0) {
            list2 = dVar.e;
        }
        List popularDestinations = list2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(searchResponse, "searchResponse");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(recentSearchDestinations, "recentSearchDestinations");
        Intrinsics.checkNotNullParameter(popularDestinations, "popularDestinations");
        return new d(searchResponse, datesSelection, query, recentSearchDestinations, popularDestinations);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f180712a, dVar.f180712a) && Intrinsics.f(this.f180713b, dVar.f180713b) && Intrinsics.f(this.f180714c, dVar.f180714c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.c((this.f180713b.hashCode() + (this.f180712a.hashCode() * 31)) * 31, 31, this.f180714c), 31, this.d);
    }
}
