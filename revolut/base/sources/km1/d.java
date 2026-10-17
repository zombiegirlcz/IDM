package km1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo1.b f185669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f185671c;

    public d(xo1.b bVar, String actualQuery, Data billersData) {
        Intrinsics.checkNotNullParameter(actualQuery, "actualQuery");
        Intrinsics.checkNotNullParameter(billersData, "billersData");
        this.f185669a = bVar;
        this.f185670b = actualQuery;
        this.f185671c = billersData;
    }

    public static d a(d dVar, String actualQuery, Data billersData, int i) {
        xo1.b bVar = dVar.f185669a;
        if ((i & 2) != 0) {
            actualQuery = dVar.f185670b;
        }
        if ((i & 4) != 0) {
            billersData = dVar.f185671c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(actualQuery, "actualQuery");
        Intrinsics.checkNotNullParameter(billersData, "billersData");
        return new d(bVar, actualQuery, billersData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f185669a == dVar.f185669a && Intrinsics.f(this.f185670b, dVar.f185670b) && Intrinsics.f(this.f185671c, dVar.f185671c);
    }

    public final int hashCode() {
        xo1.b bVar = this.f185669a;
        return this.f185671c.hashCode() + p.a.c((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f185670b);
    }
}
