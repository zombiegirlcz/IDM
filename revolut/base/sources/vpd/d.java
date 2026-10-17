package vpd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f291156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f291157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uib.c f291158c;

    public d(Data destinationsData, l selection, uib.c cVar) {
        Intrinsics.checkNotNullParameter(destinationsData, "destinationsData");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f291156a = destinationsData;
        this.f291157b = selection;
        this.f291158c = cVar;
    }

    public static d a(d dVar, Data destinationsData, j jVar, uib.c cVar, int i) {
        if ((i & 1) != 0) {
            destinationsData = dVar.f291156a;
        }
        l selection = jVar;
        if ((i & 2) != 0) {
            selection = dVar.f291157b;
        }
        if ((i & 4) != 0) {
            cVar = dVar.f291158c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(destinationsData, "destinationsData");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return new d(destinationsData, selection, cVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f291156a, dVar.f291156a) && Intrinsics.f(this.f291157b, dVar.f291157b) && this.f291158c == dVar.f291158c;
    }

    public final int hashCode() {
        int iHashCode = (this.f291157b.hashCode() + (this.f291156a.hashCode() * 31)) * 31;
        uib.c cVar = this.f291158c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
