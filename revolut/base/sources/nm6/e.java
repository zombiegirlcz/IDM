package nm6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217184b;

    public e(Data institutionsData, String searchQuery) {
        Intrinsics.checkNotNullParameter(institutionsData, "institutionsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f217183a = institutionsData;
        this.f217184b = searchQuery;
    }

    public static e a(e eVar, Data institutionsData, String searchQuery, int i) {
        if ((i & 1) != 0) {
            institutionsData = eVar.f217183a;
        }
        if ((i & 2) != 0) {
            searchQuery = eVar.f217184b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(institutionsData, "institutionsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new e(institutionsData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f217183a, eVar.f217183a) && Intrinsics.f(this.f217184b, eVar.f217184b);
    }

    public final int hashCode() {
        return this.f217184b.hashCode() + (this.f217183a.hashCode() * 31);
    }
}
