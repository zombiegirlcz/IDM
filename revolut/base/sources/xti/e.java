package xti;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f308825b;

    public e(Data airportsList, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(airportsList, "airportsList");
        this.f308824a = searchQuery;
        this.f308825b = airportsList;
    }

    public static e a(e eVar, String searchQuery, Data airportsList, int i) {
        if ((i & 1) != 0) {
            searchQuery = eVar.f308824a;
        }
        if ((i & 2) != 0) {
            airportsList = eVar.f308825b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(airportsList, "airportsList");
        return new e(airportsList, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f308824a, eVar.f308824a) && Intrinsics.f(this.f308825b, eVar.f308825b);
    }

    public final int hashCode() {
        return this.f308825b.hashCode() + (this.f308824a.hashCode() * 31);
    }
}
