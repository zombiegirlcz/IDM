package wbg;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f296168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsPointsRedeemOption f296169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f296170c;
    public final RevPoints d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f296171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f296172h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f296173j;
    public final od0.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f296174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f296175m;

    public g0() {
        this(0);
    }

    public static g0 a(g0 g0Var, Data data, HotelsPointsRedeemOption hotelsPointsRedeemOption, Data data2, RevPoints revPoints, Data data3, boolean z, boolean z3, Boolean bool, Data data4, Data data5, od0.i iVar, Data data6, Data data7, int i) {
        if ((i & 1) != 0) {
            data = g0Var.f296168a;
        }
        Data bookingDraft = data;
        HotelsPointsRedeemOption hotelsPointsRedeemOption2 = (i & 2) != 0 ? g0Var.f296169b : hotelsPointsRedeemOption;
        Data calculatedTotalPrice = (i & 4) != 0 ? g0Var.f296170c : data2;
        RevPoints revPoints2 = (i & 8) != 0 ? g0Var.d : revPoints;
        Data propertyPayment = (i & 16) != 0 ? g0Var.e : data3;
        boolean z4 = (i & 32) != 0 ? g0Var.f : z;
        boolean z6 = (i & 64) != 0 ? g0Var.f296171g : z3;
        Boolean bool2 = (i & 128) != 0 ? g0Var.f296172h : bool;
        Data quote = (i & 256) != 0 ? g0Var.i : data4;
        Data userCompany = (i & 512) != 0 ? g0Var.f296173j : data5;
        od0.i revPointsOptInInfo = (i & 1024) != 0 ? g0Var.k : iVar;
        Data legalEntityContext = (i & 2048) != 0 ? g0Var.f296174l : data6;
        Data privacyNoticeDocumentInfo = (i & 4096) != 0 ? g0Var.f296175m : data7;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(bookingDraft, "bookingDraft");
        Intrinsics.checkNotNullParameter(calculatedTotalPrice, "calculatedTotalPrice");
        Intrinsics.checkNotNullParameter(propertyPayment, "propertyPayment");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(privacyNoticeDocumentInfo, "privacyNoticeDocumentInfo");
        return new g0(bookingDraft, hotelsPointsRedeemOption2, calculatedTotalPrice, revPoints2, propertyPayment, z4, z6, bool2, quote, userCompany, revPointsOptInInfo, legalEntityContext, privacyNoticeDocumentInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f296168a, g0Var.f296168a) && Intrinsics.f(this.f296169b, g0Var.f296169b) && Intrinsics.f(this.f296170c, g0Var.f296170c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && this.f == g0Var.f && this.f296171g == g0Var.f296171g && Intrinsics.f(this.f296172h, g0Var.f296172h) && Intrinsics.f(this.i, g0Var.i) && Intrinsics.f(this.f296173j, g0Var.f296173j) && Intrinsics.f(this.k, g0Var.k) && Intrinsics.f(this.f296174l, g0Var.f296174l) && Intrinsics.f(this.f296175m, g0Var.f296175m);
    }

    public final int hashCode() {
        int iHashCode = this.f296168a.hashCode() * 31;
        HotelsPointsRedeemOption hotelsPointsRedeemOption = this.f296169b;
        int iC = kii.e.c(this.f296170c, (iHashCode + (hotelsPointsRedeemOption == null ? 0 : hotelsPointsRedeemOption.hashCode())) * 31, 31);
        RevPoints revPoints = this.d;
        int iC2 = j6.a.c(j6.a.c(kii.e.c(this.e, (iC + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31, 31), 31, this.f), 31, this.f296171g);
        Boolean bool = this.f296172h;
        return this.f296175m.hashCode() + kii.e.c(this.f296174l, r6.b.f(this.k, kii.e.c(this.f296173j, kii.e.c(this.i, (iC2 + (bool != null ? bool.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public g0(Data bookingDraft, HotelsPointsRedeemOption hotelsPointsRedeemOption, Data calculatedTotalPrice, RevPoints revPoints, Data propertyPayment, boolean z, boolean z3, Boolean bool, Data quote, Data userCompany, od0.i revPointsOptInInfo, Data legalEntityContext, Data privacyNoticeDocumentInfo) {
        Intrinsics.checkNotNullParameter(bookingDraft, "bookingDraft");
        Intrinsics.checkNotNullParameter(calculatedTotalPrice, "calculatedTotalPrice");
        Intrinsics.checkNotNullParameter(propertyPayment, "propertyPayment");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(privacyNoticeDocumentInfo, "privacyNoticeDocumentInfo");
        this.f296168a = bookingDraft;
        this.f296169b = hotelsPointsRedeemOption;
        this.f296170c = calculatedTotalPrice;
        this.d = revPoints;
        this.e = propertyPayment;
        this.f = z;
        this.f296171g = z3;
        this.f296172h = bool;
        this.i = quote;
        this.f296173j = userCompany;
        this.k = revPointsOptInInfo;
        this.f296174l = legalEntityContext;
        this.f296175m = privacyNoticeDocumentInfo;
    }

    public /* synthetic */ g0(int i) {
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, false, 7, null);
        Data data5 = new Data(null, null, false, 7, null);
        od0.i.Companion.getClass();
        this(data, null, data2, null, data3, false, false, null, data4, data5, od0.i.f224256b, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
