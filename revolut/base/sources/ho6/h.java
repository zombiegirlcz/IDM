package ho6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f154229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154230b;

    public h(Data countryDepartmentsData, String searchQuery) {
        Intrinsics.checkNotNullParameter(countryDepartmentsData, "countryDepartmentsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f154229a = countryDepartmentsData;
        this.f154230b = searchQuery;
    }

    public static h a(h hVar, Data countryDepartmentsData, String searchQuery, int i) {
        if ((i & 1) != 0) {
            countryDepartmentsData = hVar.f154229a;
        }
        if ((i & 2) != 0) {
            searchQuery = hVar.f154230b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(countryDepartmentsData, "countryDepartmentsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new h(countryDepartmentsData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154229a, hVar.f154229a) && Intrinsics.f(this.f154230b, hVar.f154230b);
    }

    public final int hashCode() {
        return this.f154230b.hashCode() + (this.f154229a.hashCode() * 31);
    }
}
