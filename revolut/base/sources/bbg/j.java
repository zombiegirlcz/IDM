package bbg;

import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f14283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f14284c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HotelsPointsRedeemOption f14286h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f14287j;
    public final Data k;

    public j(Data hotelsProperty, Data originalBooking, Data beds, Data propertyPayment, Data monetaryPrice, Data exchangedAmountQuoteData, boolean z, HotelsPointsRedeemOption hotelsPointsRedeemOption, Data revPointsOptInInfo, Data userCompany, Data revPointsPillMenuItem) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(originalBooking, "originalBooking");
        Intrinsics.checkNotNullParameter(beds, "beds");
        Intrinsics.checkNotNullParameter(propertyPayment, "propertyPayment");
        Intrinsics.checkNotNullParameter(monetaryPrice, "monetaryPrice");
        Intrinsics.checkNotNullParameter(exchangedAmountQuoteData, "exchangedAmountQuoteData");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(revPointsPillMenuItem, "revPointsPillMenuItem");
        this.f14282a = hotelsProperty;
        this.f14283b = originalBooking;
        this.f14284c = beds;
        this.d = propertyPayment;
        this.e = monetaryPrice;
        this.f = exchangedAmountQuoteData;
        this.f14285g = z;
        this.f14286h = hotelsPointsRedeemOption;
        this.i = revPointsOptInInfo;
        this.f14287j = userCompany;
        this.k = revPointsPillMenuItem;
    }

    public static j a(j jVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, HotelsPointsRedeemOption hotelsPointsRedeemOption, Data data7, Data data8, Data data9, int i) {
        if ((i & 1) != 0) {
            data = jVar.f14282a;
        }
        Data hotelsProperty = data;
        if ((i & 2) != 0) {
            data2 = jVar.f14283b;
        }
        Data originalBooking = data2;
        if ((i & 4) != 0) {
            data3 = jVar.f14284c;
        }
        Data beds = data3;
        Data propertyPayment = (i & 8) != 0 ? jVar.d : data4;
        Data monetaryPrice = (i & 16) != 0 ? jVar.e : data5;
        Data exchangedAmountQuoteData = (i & 32) != 0 ? jVar.f : data6;
        boolean z = jVar.f14285g;
        HotelsPointsRedeemOption hotelsPointsRedeemOption2 = (i & 128) != 0 ? jVar.f14286h : hotelsPointsRedeemOption;
        Data revPointsOptInInfo = (i & 256) != 0 ? jVar.i : data7;
        Data userCompany = (i & 512) != 0 ? jVar.f14287j : data8;
        Data revPointsPillMenuItem = (i & 1024) != 0 ? jVar.k : data9;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(originalBooking, "originalBooking");
        Intrinsics.checkNotNullParameter(beds, "beds");
        Intrinsics.checkNotNullParameter(propertyPayment, "propertyPayment");
        Intrinsics.checkNotNullParameter(monetaryPrice, "monetaryPrice");
        Intrinsics.checkNotNullParameter(exchangedAmountQuoteData, "exchangedAmountQuoteData");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(revPointsPillMenuItem, "revPointsPillMenuItem");
        return new j(hotelsProperty, originalBooking, beds, propertyPayment, monetaryPrice, exchangedAmountQuoteData, z, hotelsPointsRedeemOption2, revPointsOptInInfo, userCompany, revPointsPillMenuItem);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f14282a, jVar.f14282a) && Intrinsics.f(this.f14283b, jVar.f14283b) && Intrinsics.f(this.f14284c, jVar.f14284c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f14285g == jVar.f14285g && Intrinsics.f(this.f14286h, jVar.f14286h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f14287j, jVar.f14287j) && Intrinsics.f(this.k, jVar.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f14284c, kii.e.c(this.f14283b, this.f14282a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.f14285g);
        HotelsPointsRedeemOption hotelsPointsRedeemOption = this.f14286h;
        return this.k.hashCode() + kii.e.c(this.f14287j, kii.e.c(this.i, (iC + (hotelsPointsRedeemOption == null ? 0 : hotelsPointsRedeemOption.hashCode())) * 31, 31), 31);
    }
}
