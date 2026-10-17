package zrd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f324679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yld.g f324680c;
    public final amd.b d;
    public final amd.a e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f324681g;

    public a(Data netWorthData, Data balanceHistoryData, yld.g netWorthType, amd.b bVar, amd.a selectedTimeframe, int i, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(netWorthData, "netWorthData");
        Intrinsics.checkNotNullParameter(balanceHistoryData, "balanceHistoryData");
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f324678a = netWorthData;
        this.f324679b = balanceHistoryData;
        this.f324680c = netWorthType;
        this.d = bVar;
        this.e = selectedTimeframe;
        this.f = i;
        this.f324681g = legalEntityContext;
    }

    public static a a(a aVar, Data data, Data data2, amd.b bVar, amd.a aVar2, int i, Data data3, int i2) {
        if ((i2 & 1) != 0) {
            data = aVar.f324678a;
        }
        Data netWorthData = data;
        if ((i2 & 2) != 0) {
            data2 = aVar.f324679b;
        }
        Data balanceHistoryData = data2;
        yld.g netWorthType = aVar.f324680c;
        if ((i2 & 8) != 0) {
            bVar = aVar.d;
        }
        amd.b bVar2 = bVar;
        if ((i2 & 16) != 0) {
            aVar2 = aVar.e;
        }
        amd.a selectedTimeframe = aVar2;
        if ((i2 & 32) != 0) {
            i = aVar.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            data3 = aVar.f324681g;
        }
        Data legalEntityContext = data3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(netWorthData, "netWorthData");
        Intrinsics.checkNotNullParameter(balanceHistoryData, "balanceHistoryData");
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new a(netWorthData, balanceHistoryData, netWorthType, bVar2, selectedTimeframe, i3, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f324678a, aVar.f324678a) && Intrinsics.f(this.f324679b, aVar.f324679b) && this.f324680c == aVar.f324680c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Intrinsics.f(this.f324681g, aVar.f324681g);
    }

    public final int hashCode() {
        int iHashCode = (this.f324680c.hashCode() + kii.e.c(this.f324679b, this.f324678a.hashCode() * 31, 31)) * 31;
        amd.b bVar = this.d;
        return this.f324681g.hashCode() + j6.a.b(this.f, (this.e.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31);
    }
}
