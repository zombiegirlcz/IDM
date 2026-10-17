package aqd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f8402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f8403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8404c;
    public final uib.c d;
    public final boolean e;
    public final IncomeSorterDestinationId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncomeSorterDestinationId f8405g;

    public t(Data detailsData, n detailsMode, Map destinationSpecificErrors, uib.c cVar, boolean z, IncomeSorterDestinationId incomeSorterDestinationId, IncomeSorterDestinationId incomeSorterDestinationId2) {
        Intrinsics.checkNotNullParameter(detailsData, "detailsData");
        Intrinsics.checkNotNullParameter(detailsMode, "detailsMode");
        Intrinsics.checkNotNullParameter(destinationSpecificErrors, "destinationSpecificErrors");
        this.f8402a = detailsData;
        this.f8403b = detailsMode;
        this.f8404c = destinationSpecificErrors;
        this.d = cVar;
        this.e = z;
        this.f = incomeSorterDestinationId;
        this.f8405g = incomeSorterDestinationId2;
    }

    public static t a(t tVar, Data data, n nVar, Map map, uib.c cVar, boolean z, IncomeSorterDestinationId incomeSorterDestinationId, IncomeSorterDestinationId incomeSorterDestinationId2, int i) {
        if ((i & 1) != 0) {
            data = tVar.f8402a;
        }
        Data detailsData = data;
        if ((i & 2) != 0) {
            nVar = tVar.f8403b;
        }
        n detailsMode = nVar;
        if ((i & 4) != 0) {
            map = tVar.f8404c;
        }
        Map destinationSpecificErrors = map;
        if ((i & 8) != 0) {
            cVar = tVar.d;
        }
        uib.c cVar2 = cVar;
        if ((i & 16) != 0) {
            z = tVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            incomeSorterDestinationId = tVar.f;
        }
        IncomeSorterDestinationId incomeSorterDestinationId3 = incomeSorterDestinationId;
        if ((i & 64) != 0) {
            incomeSorterDestinationId2 = tVar.f8405g;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(detailsData, "detailsData");
        Intrinsics.checkNotNullParameter(detailsMode, "detailsMode");
        Intrinsics.checkNotNullParameter(destinationSpecificErrors, "destinationSpecificErrors");
        return new t(detailsData, detailsMode, destinationSpecificErrors, cVar2, z3, incomeSorterDestinationId3, incomeSorterDestinationId2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f8402a, tVar.f8402a) && this.f8403b == tVar.f8403b && Intrinsics.f(this.f8404c, tVar.f8404c) && this.d == tVar.d && this.e == tVar.e && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f8405g, tVar.f8405g);
    }

    public final int hashCode() {
        int iE = p.a.e((this.f8403b.hashCode() + (this.f8402a.hashCode() * 31)) * 31, 31, this.f8404c);
        uib.c cVar = this.d;
        int iC = j6.a.c((iE + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.e);
        IncomeSorterDestinationId incomeSorterDestinationId = this.f;
        int iHashCode = (iC + (incomeSorterDestinationId == null ? 0 : incomeSorterDestinationId.hashCode())) * 31;
        IncomeSorterDestinationId incomeSorterDestinationId2 = this.f8405g;
        return iHashCode + (incomeSorterDestinationId2 != null ? incomeSorterDestinationId2.hashCode() : 0);
    }
}
