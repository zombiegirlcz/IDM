package hui;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f155680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f155681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f155682c;
    public final Data d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f155683g;

    public k(Data revPointsAccountData, Data activePassesData, Data nearYouAirportsData, Data configData, Data termsUrlData, List helpItems, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(revPointsAccountData, "revPointsAccountData");
        Intrinsics.checkNotNullParameter(activePassesData, "activePassesData");
        Intrinsics.checkNotNullParameter(nearYouAirportsData, "nearYouAirportsData");
        Intrinsics.checkNotNullParameter(configData, "configData");
        Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f155680a = revPointsAccountData;
        this.f155681b = activePassesData;
        this.f155682c = nearYouAirportsData;
        this.d = configData;
        this.e = termsUrlData;
        this.f = helpItems;
        this.f155683g = legalEntityContext;
    }

    public static k a(k kVar, Data data, Data data2, Data data3, Data data4, Data data5, List list, Data data6, int i) {
        if ((i & 1) != 0) {
            data = kVar.f155680a;
        }
        Data revPointsAccountData = data;
        if ((i & 2) != 0) {
            data2 = kVar.f155681b;
        }
        Data activePassesData = data2;
        if ((i & 4) != 0) {
            data3 = kVar.f155682c;
        }
        Data nearYouAirportsData = data3;
        if ((i & 8) != 0) {
            data4 = kVar.d;
        }
        Data configData = data4;
        if ((i & 16) != 0) {
            data5 = kVar.e;
        }
        Data termsUrlData = data5;
        if ((i & 32) != 0) {
            list = kVar.f;
        }
        List helpItems = list;
        if ((i & 64) != 0) {
            data6 = kVar.f155683g;
        }
        Data legalEntityContext = data6;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(revPointsAccountData, "revPointsAccountData");
        Intrinsics.checkNotNullParameter(activePassesData, "activePassesData");
        Intrinsics.checkNotNullParameter(nearYouAirportsData, "nearYouAirportsData");
        Intrinsics.checkNotNullParameter(configData, "configData");
        Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new k(revPointsAccountData, activePassesData, nearYouAirportsData, configData, termsUrlData, helpItems, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f155680a, kVar.f155680a) && Intrinsics.f(this.f155681b, kVar.f155681b) && Intrinsics.f(this.f155682c, kVar.f155682c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f155683g, kVar.f155683g);
    }

    public final int hashCode() {
        return this.f155683g.hashCode() + p.a.d(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f155682c, kii.e.c(this.f155681b, this.f155680a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }
}
