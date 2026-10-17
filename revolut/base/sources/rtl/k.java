package rtl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f257326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f257327c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f257328g;

    public k(String selectedPocketId, Data investmentAccounts, Data mainAccounts, Data commodityAccounts, Data instrument, Data wealthDisclaimersData, Data disclaimer) {
        Intrinsics.checkNotNullParameter(selectedPocketId, "selectedPocketId");
        Intrinsics.checkNotNullParameter(investmentAccounts, "investmentAccounts");
        Intrinsics.checkNotNullParameter(mainAccounts, "mainAccounts");
        Intrinsics.checkNotNullParameter(commodityAccounts, "commodityAccounts");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f257325a = selectedPocketId;
        this.f257326b = investmentAccounts;
        this.f257327c = mainAccounts;
        this.d = commodityAccounts;
        this.e = instrument;
        this.f = wealthDisclaimersData;
        this.f257328g = disclaimer;
    }

    public static k a(k kVar, String str, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            str = kVar.f257325a;
        }
        String selectedPocketId = str;
        if ((i & 2) != 0) {
            data = kVar.f257326b;
        }
        Data investmentAccounts = data;
        if ((i & 4) != 0) {
            data2 = kVar.f257327c;
        }
        Data mainAccounts = data2;
        if ((i & 8) != 0) {
            data3 = kVar.d;
        }
        Data commodityAccounts = data3;
        if ((i & 16) != 0) {
            data4 = kVar.e;
        }
        Data instrument = data4;
        if ((i & 32) != 0) {
            data5 = kVar.f;
        }
        Data wealthDisclaimersData = data5;
        if ((i & 64) != 0) {
            data6 = kVar.f257328g;
        }
        Data disclaimer = data6;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPocketId, "selectedPocketId");
        Intrinsics.checkNotNullParameter(investmentAccounts, "investmentAccounts");
        Intrinsics.checkNotNullParameter(mainAccounts, "mainAccounts");
        Intrinsics.checkNotNullParameter(commodityAccounts, "commodityAccounts");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new k(selectedPocketId, investmentAccounts, mainAccounts, commodityAccounts, instrument, wealthDisclaimersData, disclaimer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f257325a, kVar.f257325a) && Intrinsics.f(this.f257326b, kVar.f257326b) && Intrinsics.f(this.f257327c, kVar.f257327c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f257328g, kVar.f257328g);
    }

    public final int hashCode() {
        return this.f257328g.hashCode() + kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f257327c, kii.e.c(this.f257326b, this.f257325a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
