package a83;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f2064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f2065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f2066c;
    public final List d;
    public final String e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b93.d f2067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f2068h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f2069j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f2070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f2071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2072n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f2073p;

    public o(Data cardItems, Data creditCardEntryPointUiModels, Data payLaterProductState, List npsItems, String str, Data terminatedCards, b93.d cardScope, Data jointAccountId, boolean z, Data revPointsOptInInfo, boolean z3, Data legalContext, Data atmMapData, boolean z4, Data freeCardDeliveryOffer, Data cardOrderReimbursedOffer) {
        Intrinsics.checkNotNullParameter(cardItems, "cardItems");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiModels, "creditCardEntryPointUiModels");
        Intrinsics.checkNotNullParameter(payLaterProductState, "payLaterProductState");
        Intrinsics.checkNotNullParameter(npsItems, "npsItems");
        Intrinsics.checkNotNullParameter(terminatedCards, "terminatedCards");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        Intrinsics.checkNotNullParameter(atmMapData, "atmMapData");
        Intrinsics.checkNotNullParameter(freeCardDeliveryOffer, "freeCardDeliveryOffer");
        Intrinsics.checkNotNullParameter(cardOrderReimbursedOffer, "cardOrderReimbursedOffer");
        this.f2064a = cardItems;
        this.f2065b = creditCardEntryPointUiModels;
        this.f2066c = payLaterProductState;
        this.d = npsItems;
        this.e = str;
        this.f = terminatedCards;
        this.f2067g = cardScope;
        this.f2068h = jointAccountId;
        this.i = z;
        this.f2069j = revPointsOptInInfo;
        this.k = z3;
        this.f2070l = legalContext;
        this.f2071m = atmMapData;
        this.f2072n = z4;
        this.o = freeCardDeliveryOffer;
        this.f2073p = cardOrderReimbursedOffer;
    }

    public static o a(o oVar, Data data, Data data2, Data data3, List list, String str, Data data4, Data data5, Data data6, boolean z, Data data7, Data data8, boolean z3, Data data9, Data data10, int i) {
        Data cardItems = (i & 1) != 0 ? oVar.f2064a : data;
        Data creditCardEntryPointUiModels = (i & 2) != 0 ? oVar.f2065b : data2;
        Data payLaterProductState = (i & 4) != 0 ? oVar.f2066c : data3;
        List npsItems = (i & 8) != 0 ? oVar.d : list;
        String str2 = (i & 16) != 0 ? oVar.e : str;
        Data terminatedCards = (i & 32) != 0 ? oVar.f : data4;
        b93.d cardScope = oVar.f2067g;
        Data jointAccountId = (i & 128) != 0 ? oVar.f2068h : data5;
        boolean z4 = oVar.i;
        Data revPointsOptInInfo = (i & 512) != 0 ? oVar.f2069j : data6;
        boolean z6 = (i & 1024) != 0 ? oVar.k : z;
        Data legalContext = (i & 2048) != 0 ? oVar.f2070l : data7;
        Data atmMapData = (i & 4096) != 0 ? oVar.f2071m : data8;
        boolean z11 = (i & 8192) != 0 ? oVar.f2072n : z3;
        Data freeCardDeliveryOffer = (i & 16384) != 0 ? oVar.o : data9;
        Data cardOrderReimbursedOffer = (i & 32768) != 0 ? oVar.f2073p : data10;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(cardItems, "cardItems");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiModels, "creditCardEntryPointUiModels");
        Intrinsics.checkNotNullParameter(payLaterProductState, "payLaterProductState");
        Intrinsics.checkNotNullParameter(npsItems, "npsItems");
        Intrinsics.checkNotNullParameter(terminatedCards, "terminatedCards");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        Intrinsics.checkNotNullParameter(atmMapData, "atmMapData");
        Intrinsics.checkNotNullParameter(freeCardDeliveryOffer, "freeCardDeliveryOffer");
        Intrinsics.checkNotNullParameter(cardOrderReimbursedOffer, "cardOrderReimbursedOffer");
        return new o(cardItems, creditCardEntryPointUiModels, payLaterProductState, npsItems, str2, terminatedCards, cardScope, jointAccountId, z4, revPointsOptInInfo, z6, legalContext, atmMapData, z11, freeCardDeliveryOffer, cardOrderReimbursedOffer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f2064a, oVar.f2064a) && Intrinsics.f(this.f2065b, oVar.f2065b) && Intrinsics.f(this.f2066c, oVar.f2066c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && this.f2067g == oVar.f2067g && Intrinsics.f(this.f2068h, oVar.f2068h) && this.i == oVar.i && Intrinsics.f(this.f2069j, oVar.f2069j) && this.k == oVar.k && Intrinsics.f(this.f2070l, oVar.f2070l) && Intrinsics.f(this.f2071m, oVar.f2071m) && this.f2072n == oVar.f2072n && Intrinsics.f(this.o, oVar.o) && Intrinsics.f(this.f2073p, oVar.f2073p);
    }

    public final int hashCode() {
        int iD = p.a.d(kii.e.c(this.f2066c, kii.e.c(this.f2065b, this.f2064a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return this.f2073p.hashCode() + kii.e.c(this.o, j6.a.c(kii.e.c(this.f2071m, kii.e.c(this.f2070l, j6.a.c(kii.e.c(this.f2069j, j6.a.c(kii.e.c(this.f2068h, (this.f2067g.hashCode() + kii.e.c(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31), 31, this.i), 31), 31, this.k), 31), 31), 31, this.f2072n), 31);
    }
}
