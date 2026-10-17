package u36;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276781b;

    public b() {
        this(0);
    }

    public static b a(b bVar, Data assets, String searchQuery, int i) {
        if ((i & 1) != 0) {
            assets = bVar.f276780a;
        }
        if ((i & 2) != 0) {
            searchQuery = bVar.f276781b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new b(assets, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f276780a, bVar.f276780a) && Intrinsics.f(this.f276781b, bVar.f276781b);
    }

    public final int hashCode() {
        return this.f276781b.hashCode() + (this.f276780a.hashCode() * 31);
    }

    public b(Data assets, String searchQuery) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f276780a = assets;
        this.f276781b = searchQuery;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null), "");
    }
}
