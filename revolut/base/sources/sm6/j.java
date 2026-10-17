package sm6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f264368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264369b;

    public j(Data appData, String searchQuery) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f264368a = appData;
        this.f264369b = searchQuery;
    }

    public static j a(j jVar, Data appData, String searchQuery, int i) {
        if ((i & 1) != 0) {
            appData = jVar.f264368a;
        }
        if ((i & 2) != 0) {
            searchQuery = jVar.f264369b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new j(appData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f264368a, jVar.f264368a) && Intrinsics.f(this.f264369b, jVar.f264369b);
    }

    public final int hashCode() {
        return this.f264369b.hashCode() + (this.f264368a.hashCode() * 31);
    }
}
