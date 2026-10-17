package gcg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f142449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f142450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f142451c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f142452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f142453h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f142454j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f142455l;

    public j() {
        this(false, 4095);
    }

    public static j a(j jVar, Data data, s sVar, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, boolean z, Data data9, int i) {
        if ((i & 1) != 0) {
            data = jVar.f142449a;
        }
        Data nextTripPropertyRecommendations = data;
        if ((i & 2) != 0) {
            sVar = jVar.f142450b;
        }
        s sVar2 = sVar;
        Data upcomingBookings = (i & 4) != 0 ? jVar.f142451c : data2;
        Data campaigns = (i & 8) != 0 ? jVar.d : data3;
        Data recentlyViewedItems = (i & 16) != 0 ? jVar.e : data4;
        Data navigableDropOffs = (i & 32) != 0 ? jVar.f : data5;
        Data popularItems = (i & 64) != 0 ? jVar.f142452g : data6;
        Data boostedProperties = (i & 128) != 0 ? jVar.f142453h : data7;
        Data revPointsRates = (i & 256) != 0 ? jVar.i : data8;
        boolean z3 = (i & 512) != 0 ? jVar.f142454j : z;
        boolean z4 = jVar.k;
        Data legalEntityContext = (i & 2048) != 0 ? jVar.f142455l : data9;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(nextTripPropertyRecommendations, "nextTripPropertyRecommendations");
        Intrinsics.checkNotNullParameter(upcomingBookings, "upcomingBookings");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Intrinsics.checkNotNullParameter(recentlyViewedItems, "recentlyViewedItems");
        Intrinsics.checkNotNullParameter(navigableDropOffs, "navigableDropOffs");
        Intrinsics.checkNotNullParameter(popularItems, "popularItems");
        Intrinsics.checkNotNullParameter(boostedProperties, "boostedProperties");
        Intrinsics.checkNotNullParameter(revPointsRates, "revPointsRates");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new j(nextTripPropertyRecommendations, sVar2, upcomingBookings, campaigns, recentlyViewedItems, navigableDropOffs, popularItems, boostedProperties, revPointsRates, z3, z4, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f142449a, jVar.f142449a) && Intrinsics.f(this.f142450b, jVar.f142450b) && Intrinsics.f(this.f142451c, jVar.f142451c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f142452g, jVar.f142452g) && Intrinsics.f(this.f142453h, jVar.f142453h) && Intrinsics.f(this.i, jVar.i) && this.f142454j == jVar.f142454j && this.k == jVar.k && Intrinsics.f(this.f142455l, jVar.f142455l);
    }

    public final int hashCode() {
        int iHashCode = this.f142449a.hashCode() * 31;
        s sVar = this.f142450b;
        return this.f142455l.hashCode() + j6.a.c(j6.a.c(kii.e.c(this.i, kii.e.c(this.f142453h, kii.e.c(this.f142452g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f142451c, (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f142454j), 31, this.k);
    }

    public j(Data nextTripPropertyRecommendations, s sVar, Data upcomingBookings, Data campaigns, Data recentlyViewedItems, Data navigableDropOffs, Data popularItems, Data boostedProperties, Data revPointsRates, boolean z, boolean z3, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(nextTripPropertyRecommendations, "nextTripPropertyRecommendations");
        Intrinsics.checkNotNullParameter(upcomingBookings, "upcomingBookings");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Intrinsics.checkNotNullParameter(recentlyViewedItems, "recentlyViewedItems");
        Intrinsics.checkNotNullParameter(navigableDropOffs, "navigableDropOffs");
        Intrinsics.checkNotNullParameter(popularItems, "popularItems");
        Intrinsics.checkNotNullParameter(boostedProperties, "boostedProperties");
        Intrinsics.checkNotNullParameter(revPointsRates, "revPointsRates");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f142449a = nextTripPropertyRecommendations;
        this.f142450b = sVar;
        this.f142451c = upcomingBookings;
        this.d = campaigns;
        this.e = recentlyViewedItems;
        this.f = navigableDropOffs;
        this.f142452g = popularItems;
        this.f142453h = boostedProperties;
        this.i = revPointsRates;
        this.f142454j = z;
        this.k = z3;
        this.f142455l = legalEntityContext;
    }

    public /* synthetic */ j(boolean z, int i) {
        this(new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), true, (i & 1024) != 0 ? false : z, new Data(null, null, true, 3, null));
    }
}
