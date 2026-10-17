package zgj;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f322174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f322175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f322176c;
    public final Data d;
    public final Data e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f322177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f322178h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f322179j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f322180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f322181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f322182n;
    public final wi0.b o;

    public r(Data checkoutPrice, Data userPocket, Data esimDataPlan, Data subscriptions, Data esimInstallationState, String idempotencyKey, Set acceptedTerms, Data revPointsAccount, Data pointsOptions, Data selectedPointsOption, Data autoRenewalToggleChecked, Data esimCheckout, Data userCompany, Data onlyManualInstallationAvailable, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(esimDataPlan, "esimDataPlan");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(esimInstallationState, "esimInstallationState");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(acceptedTerms, "acceptedTerms");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        Intrinsics.checkNotNullParameter(selectedPointsOption, "selectedPointsOption");
        Intrinsics.checkNotNullParameter(autoRenewalToggleChecked, "autoRenewalToggleChecked");
        Intrinsics.checkNotNullParameter(esimCheckout, "esimCheckout");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        this.f322174a = checkoutPrice;
        this.f322175b = userPocket;
        this.f322176c = esimDataPlan;
        this.d = subscriptions;
        this.e = esimInstallationState;
        this.f = idempotencyKey;
        this.f322177g = acceptedTerms;
        this.f322178h = revPointsAccount;
        this.i = pointsOptions;
        this.f322179j = selectedPointsOption;
        this.k = autoRenewalToggleChecked;
        this.f322180l = esimCheckout;
        this.f322181m = userCompany;
        this.f322182n = onlyManualInstallationAvailable;
        this.o = bVar;
    }

    public static r a(r rVar, Data data, Data data2, Data data3, Data data4, Data data5, String str, Set set, Data data6, Data data7, Data data8, Data data9, Data data10, Data data11, Data data12, wi0.b bVar, int i) {
        Data checkoutPrice = (i & 1) != 0 ? rVar.f322174a : data;
        Data userPocket = (i & 2) != 0 ? rVar.f322175b : data2;
        Data esimDataPlan = (i & 4) != 0 ? rVar.f322176c : data3;
        Data subscriptions = (i & 8) != 0 ? rVar.d : data4;
        Data esimInstallationState = (i & 16) != 0 ? rVar.e : data5;
        String idempotencyKey = (i & 32) != 0 ? rVar.f : str;
        Set acceptedTerms = (i & 64) != 0 ? rVar.f322177g : set;
        Data revPointsAccount = (i & 128) != 0 ? rVar.f322178h : data6;
        Data pointsOptions = (i & 256) != 0 ? rVar.i : data7;
        Data selectedPointsOption = (i & 512) != 0 ? rVar.f322179j : data8;
        Data autoRenewalToggleChecked = (i & 1024) != 0 ? rVar.k : data9;
        Data esimCheckout = (i & 2048) != 0 ? rVar.f322180l : data10;
        Data userCompany = (i & 4096) != 0 ? rVar.f322181m : data11;
        Data onlyManualInstallationAvailable = (i & 8192) != 0 ? rVar.f322182n : data12;
        wi0.b bVar2 = (i & 16384) != 0 ? rVar.o : bVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(esimDataPlan, "esimDataPlan");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(esimInstallationState, "esimInstallationState");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(acceptedTerms, "acceptedTerms");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        Intrinsics.checkNotNullParameter(selectedPointsOption, "selectedPointsOption");
        Intrinsics.checkNotNullParameter(autoRenewalToggleChecked, "autoRenewalToggleChecked");
        Intrinsics.checkNotNullParameter(esimCheckout, "esimCheckout");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        return new r(checkoutPrice, userPocket, esimDataPlan, subscriptions, esimInstallationState, idempotencyKey, acceptedTerms, revPointsAccount, pointsOptions, selectedPointsOption, autoRenewalToggleChecked, esimCheckout, userCompany, onlyManualInstallationAvailable, bVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f322174a, rVar.f322174a) && Intrinsics.f(this.f322175b, rVar.f322175b) && Intrinsics.f(this.f322176c, rVar.f322176c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f322177g, rVar.f322177g) && Intrinsics.f(this.f322178h, rVar.f322178h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f322179j, rVar.f322179j) && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f322180l, rVar.f322180l) && Intrinsics.f(this.f322181m, rVar.f322181m) && Intrinsics.f(this.f322182n, rVar.f322182n) && Intrinsics.f(this.o, rVar.o);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f322182n, kii.e.c(this.f322181m, kii.e.c(this.f322180l, kii.e.c(this.k, kii.e.c(this.f322179j, kii.e.c(this.i, kii.e.c(this.f322178h, p.a.f(p.a.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f322176c, kii.e.c(this.f322175b, this.f322174a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31, this.f322177g), 31), 31), 31), 31), 31), 31), 31);
        wi0.b bVar = this.o;
        return iC + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
