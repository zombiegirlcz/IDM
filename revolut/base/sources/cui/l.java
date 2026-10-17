package cui;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f109008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f109009c;
    public final Data d;
    public final bti.f e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f109010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f109011h;
    public final wi0.b i;

    public l(Data terminalAndItsAirportData, Data revPointsAccountStatusData, Data bookingSlotStatusData, Data configData, bti.f fVar, Data userPocketData, Data checkoutPriceData, boolean z, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(terminalAndItsAirportData, "terminalAndItsAirportData");
        Intrinsics.checkNotNullParameter(revPointsAccountStatusData, "revPointsAccountStatusData");
        Intrinsics.checkNotNullParameter(bookingSlotStatusData, "bookingSlotStatusData");
        Intrinsics.checkNotNullParameter(configData, "configData");
        Intrinsics.checkNotNullParameter(userPocketData, "userPocketData");
        Intrinsics.checkNotNullParameter(checkoutPriceData, "checkoutPriceData");
        this.f109007a = terminalAndItsAirportData;
        this.f109008b = revPointsAccountStatusData;
        this.f109009c = bookingSlotStatusData;
        this.d = configData;
        this.e = fVar;
        this.f = userPocketData;
        this.f109010g = checkoutPriceData;
        this.f109011h = z;
        this.i = bVar;
    }

    public static l a(l lVar, Data data, Data data2, Data data3, Data data4, bti.f fVar, Data data5, Data data6, boolean z, wi0.b bVar, int i) {
        if ((i & 1) != 0) {
            data = lVar.f109007a;
        }
        Data terminalAndItsAirportData = data;
        if ((i & 2) != 0) {
            data2 = lVar.f109008b;
        }
        Data revPointsAccountStatusData = data2;
        if ((i & 4) != 0) {
            data3 = lVar.f109009c;
        }
        Data bookingSlotStatusData = data3;
        if ((i & 8) != 0) {
            data4 = lVar.d;
        }
        Data configData = data4;
        if ((i & 16) != 0) {
            fVar = lVar.e;
        }
        bti.f fVar2 = fVar;
        Data userPocketData = (i & 32) != 0 ? lVar.f : data5;
        Data checkoutPriceData = (i & 64) != 0 ? lVar.f109010g : data6;
        boolean z3 = (i & 128) != 0 ? lVar.f109011h : z;
        wi0.b bVar2 = (i & 256) != 0 ? lVar.i : bVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(terminalAndItsAirportData, "terminalAndItsAirportData");
        Intrinsics.checkNotNullParameter(revPointsAccountStatusData, "revPointsAccountStatusData");
        Intrinsics.checkNotNullParameter(bookingSlotStatusData, "bookingSlotStatusData");
        Intrinsics.checkNotNullParameter(configData, "configData");
        Intrinsics.checkNotNullParameter(userPocketData, "userPocketData");
        Intrinsics.checkNotNullParameter(checkoutPriceData, "checkoutPriceData");
        return new l(terminalAndItsAirportData, revPointsAccountStatusData, bookingSlotStatusData, configData, fVar2, userPocketData, checkoutPriceData, z3, bVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f109007a, lVar.f109007a) && Intrinsics.f(this.f109008b, lVar.f109008b) && Intrinsics.f(this.f109009c, lVar.f109009c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f109010g, lVar.f109010g) && this.f109011h == lVar.f109011h && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f109009c, kii.e.c(this.f109008b, this.f109007a.hashCode() * 31, 31), 31), 31);
        bti.f fVar = this.e;
        int iC2 = j6.a.c(kii.e.c(this.f109010g, kii.e.c(this.f, (iC + (fVar == null ? 0 : fVar.hashCode())) * 31, 31), 31), 31, this.f109011h);
        wi0.b bVar = this.i;
        return iC2 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
