package cbh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f22818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f22819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f22820c;
    public final Data d;
    public final Data e;
    public final lk0.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f22821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22822h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d1h.g f22823j;

    public j(InvestTransactionsFilter filter, Data tradingLegalEntityInformation, Data wealthDisclaimersData, Data commoditiesDisclaimersData, Data shouldShowCfdOnlyDisclaimersData, lk0.g gVar, Data data, boolean z, boolean z3, d1h.g gVar2) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(commoditiesDisclaimersData, "commoditiesDisclaimersData");
        Intrinsics.checkNotNullParameter(shouldShowCfdOnlyDisclaimersData, "shouldShowCfdOnlyDisclaimersData");
        this.f22818a = filter;
        this.f22819b = tradingLegalEntityInformation;
        this.f22820c = wealthDisclaimersData;
        this.d = commoditiesDisclaimersData;
        this.e = shouldShowCfdOnlyDisclaimersData;
        this.f = gVar;
        this.f22821g = data;
        this.f22822h = z;
        this.i = z3;
        this.f22823j = gVar2;
    }

    public static j a(j jVar, Data data, Data data2, Data data3, Data data4, lk0.g gVar, Data data5, boolean z, d1h.g gVar2, int i) {
        InvestTransactionsFilter filter = jVar.f22818a;
        if ((i & 2) != 0) {
            data = jVar.f22819b;
        }
        Data tradingLegalEntityInformation = data;
        if ((i & 4) != 0) {
            data2 = jVar.f22820c;
        }
        Data wealthDisclaimersData = data2;
        if ((i & 8) != 0) {
            data3 = jVar.d;
        }
        Data commoditiesDisclaimersData = data3;
        Data shouldShowCfdOnlyDisclaimersData = (i & 16) != 0 ? jVar.e : data4;
        lk0.g gVar3 = (i & 32) != 0 ? jVar.f : gVar;
        Data data6 = (i & 64) != 0 ? jVar.f22821g : data5;
        boolean z3 = (i & 128) != 0 ? jVar.f22822h : z;
        boolean z4 = jVar.i;
        d1h.g gVar4 = (i & 512) != 0 ? jVar.f22823j : gVar2;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(commoditiesDisclaimersData, "commoditiesDisclaimersData");
        Intrinsics.checkNotNullParameter(shouldShowCfdOnlyDisclaimersData, "shouldShowCfdOnlyDisclaimersData");
        return new j(filter, tradingLegalEntityInformation, wealthDisclaimersData, commoditiesDisclaimersData, shouldShowCfdOnlyDisclaimersData, gVar3, data6, z3, z4, gVar4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f22818a, jVar.f22818a) && Intrinsics.f(this.f22819b, jVar.f22819b) && Intrinsics.f(this.f22820c, jVar.f22820c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f22821g, jVar.f22821g) && this.f22822h == jVar.f22822h && this.i == jVar.i && Intrinsics.f(this.f22823j, jVar.f22823j);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f22820c, kii.e.c(this.f22819b, this.f22818a.hashCode() * 31, 31), 31), 31), 31);
        lk0.g gVar = this.f;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31;
        Data data = this.f22821g;
        int iC2 = j6.a.c(j6.a.c((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f22822h), 31, this.i);
        d1h.g gVar2 = this.f22823j;
        return iC2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }
}
