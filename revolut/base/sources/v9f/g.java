package v9f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f287034b;

    public g(Data data, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f287033a = searchQuery;
        this.f287034b = data;
    }

    public static g a(g gVar, String searchQuery, Data data, int i) {
        if ((i & 1) != 0) {
            searchQuery = gVar.f287033a;
        }
        if ((i & 2) != 0) {
            data = gVar.f287034b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new g(data, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f287033a, gVar.f287033a) && Intrinsics.f(this.f287034b, gVar.f287034b);
    }

    public final int hashCode() {
        int iHashCode = this.f287033a.hashCode() * 31;
        Data data = this.f287034b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
