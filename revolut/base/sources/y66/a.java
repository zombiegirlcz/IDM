package y66;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f311183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f311184c;
    public final String d;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data balancesData, lk0.g gVar, xi0.b bVar, String searchQuery, int i) {
        if ((i & 1) != 0) {
            balancesData = aVar.f311182a;
        }
        if ((i & 2) != 0) {
            gVar = aVar.f311183b;
        }
        if ((i & 4) != 0) {
            bVar = aVar.f311184c;
        }
        if ((i & 8) != 0) {
            searchQuery = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(balancesData, "balancesData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new a(balancesData, gVar, bVar, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f311182a, aVar.f311182a) && Intrinsics.f(this.f311183b, aVar.f311183b) && Intrinsics.f(this.f311184c, aVar.f311184c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f311182a.hashCode() * 31;
        lk0.g gVar = this.f311183b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31;
        xi0.b bVar = this.f311184c;
        return this.d.hashCode() + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public a(Data balancesData, lk0.g gVar, xi0.b bVar, String searchQuery) {
        Intrinsics.checkNotNullParameter(balancesData, "balancesData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f311182a = balancesData;
        this.f311183b = gVar;
        this.f311184c = bVar;
        this.d = searchQuery;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), null, null, "");
    }
}
