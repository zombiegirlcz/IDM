package axi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import svi.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f10953c;
    public final Data d;
    public final Data e;
    public final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f10955h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wi0.b f10956j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f10957l;

    public l(int i, boolean z, Data pricingData, Data termsData, Data revPointsAccountStatusData, d0 d0Var, boolean z3, Data userPocketData, Data checkoutPriceData, wi0.b bVar, Data quotesData, Data planUpgradeBannerItem) {
        Intrinsics.checkNotNullParameter(pricingData, "pricingData");
        Intrinsics.checkNotNullParameter(termsData, "termsData");
        Intrinsics.checkNotNullParameter(revPointsAccountStatusData, "revPointsAccountStatusData");
        Intrinsics.checkNotNullParameter(userPocketData, "userPocketData");
        Intrinsics.checkNotNullParameter(checkoutPriceData, "checkoutPriceData");
        Intrinsics.checkNotNullParameter(quotesData, "quotesData");
        Intrinsics.checkNotNullParameter(planUpgradeBannerItem, "planUpgradeBannerItem");
        this.f10951a = i;
        this.f10952b = z;
        this.f10953c = pricingData;
        this.d = termsData;
        this.e = revPointsAccountStatusData;
        this.f = d0Var;
        this.f10954g = z3;
        this.f10955h = userPocketData;
        this.i = checkoutPriceData;
        this.f10956j = bVar;
        this.k = quotesData;
        this.f10957l = planUpgradeBannerItem;
    }

    public static l a(l lVar, int i, Data data, Data data2, Data data3, d0 d0Var, boolean z, Data data4, Data data5, wi0.b bVar, Data data6, Data data7, int i2) {
        if ((i2 & 1) != 0) {
            i = lVar.f10951a;
        }
        int i3 = i;
        boolean z3 = lVar.f10952b;
        if ((i2 & 4) != 0) {
            data = lVar.f10953c;
        }
        Data pricingData = data;
        Data termsData = (i2 & 8) != 0 ? lVar.d : data2;
        Data revPointsAccountStatusData = (i2 & 16) != 0 ? lVar.e : data3;
        d0 d0Var2 = (i2 & 32) != 0 ? lVar.f : d0Var;
        boolean z4 = (i2 & 64) != 0 ? lVar.f10954g : z;
        Data userPocketData = (i2 & 128) != 0 ? lVar.f10955h : data4;
        Data checkoutPriceData = (i2 & 256) != 0 ? lVar.i : data5;
        wi0.b bVar2 = (i2 & 512) != 0 ? lVar.f10956j : bVar;
        Data quotesData = (i2 & 1024) != 0 ? lVar.k : data6;
        Data planUpgradeBannerItem = (i2 & 2048) != 0 ? lVar.f10957l : data7;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pricingData, "pricingData");
        Intrinsics.checkNotNullParameter(termsData, "termsData");
        Intrinsics.checkNotNullParameter(revPointsAccountStatusData, "revPointsAccountStatusData");
        Intrinsics.checkNotNullParameter(userPocketData, "userPocketData");
        Intrinsics.checkNotNullParameter(checkoutPriceData, "checkoutPriceData");
        Intrinsics.checkNotNullParameter(quotesData, "quotesData");
        Intrinsics.checkNotNullParameter(planUpgradeBannerItem, "planUpgradeBannerItem");
        return new l(i3, z3, pricingData, termsData, revPointsAccountStatusData, d0Var2, z4, userPocketData, checkoutPriceData, bVar2, quotesData, planUpgradeBannerItem);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f10951a == lVar.f10951a && this.f10952b == lVar.f10952b && Intrinsics.f(this.f10953c, lVar.f10953c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f10954g == lVar.f10954g && Intrinsics.f(this.f10955h, lVar.f10955h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f10956j, lVar.f10956j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f10957l, lVar.f10957l);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f10953c, j6.a.c(Integer.hashCode(this.f10951a) * 31, 31, this.f10952b), 31), 31), 31);
        d0 d0Var = this.f;
        int iC2 = kii.e.c(this.i, kii.e.c(this.f10955h, j6.a.c((iC + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.f10954g), 31), 31);
        wi0.b bVar = this.f10956j;
        return this.f10957l.hashCode() + kii.e.c(this.k, (iC2 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31);
    }
}
