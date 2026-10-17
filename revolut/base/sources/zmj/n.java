package zmj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f323569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f323570c;
    public final Data d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f323571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f323572h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dm0.b f323573j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f323574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f323575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f323576n;

    public n(Data subscription, Data allDataPlans, Data allSubscriptions, Data subscriptionOffer, Data esimInstallationStates, boolean z, Data autoRenewalToggleChecked, Data giftRecipient, String idempotencyKey, dm0.b deviceId, Data esimProfiles, Data unlockableEsimProfiles, Data userDevices, Data connectivityTroubleshootingInfo) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(allDataPlans, "allDataPlans");
        Intrinsics.checkNotNullParameter(allSubscriptions, "allSubscriptions");
        Intrinsics.checkNotNullParameter(subscriptionOffer, "subscriptionOffer");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        Intrinsics.checkNotNullParameter(autoRenewalToggleChecked, "autoRenewalToggleChecked");
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        Intrinsics.checkNotNullParameter(unlockableEsimProfiles, "unlockableEsimProfiles");
        Intrinsics.checkNotNullParameter(userDevices, "userDevices");
        Intrinsics.checkNotNullParameter(connectivityTroubleshootingInfo, "connectivityTroubleshootingInfo");
        this.f323568a = subscription;
        this.f323569b = allDataPlans;
        this.f323570c = allSubscriptions;
        this.d = subscriptionOffer;
        this.e = esimInstallationStates;
        this.f = z;
        this.f323571g = autoRenewalToggleChecked;
        this.f323572h = giftRecipient;
        this.i = idempotencyKey;
        this.f323573j = deviceId;
        this.k = esimProfiles;
        this.f323574l = unlockableEsimProfiles;
        this.f323575m = userDevices;
        this.f323576n = connectivityTroubleshootingInfo;
    }

    public static n a(n nVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, String str, Data data8, Data data9, Data data10, Data data11, int i) {
        Data subscription = (i & 1) != 0 ? nVar.f323568a : data;
        Data allDataPlans = (i & 2) != 0 ? nVar.f323569b : data2;
        Data allSubscriptions = (i & 4) != 0 ? nVar.f323570c : data3;
        Data subscriptionOffer = (i & 8) != 0 ? nVar.d : data4;
        Data esimInstallationStates = (i & 16) != 0 ? nVar.e : data5;
        boolean z = (i & 32) != 0 ? nVar.f : true;
        Data autoRenewalToggleChecked = (i & 64) != 0 ? nVar.f323571g : data6;
        Data giftRecipient = (i & 128) != 0 ? nVar.f323572h : data7;
        String idempotencyKey = (i & 256) != 0 ? nVar.i : str;
        dm0.b deviceId = nVar.f323573j;
        Data esimProfiles = (i & 1024) != 0 ? nVar.k : data8;
        Data unlockableEsimProfiles = (i & 2048) != 0 ? nVar.f323574l : data9;
        Data userDevices = (i & 4096) != 0 ? nVar.f323575m : data10;
        Data connectivityTroubleshootingInfo = (i & 8192) != 0 ? nVar.f323576n : data11;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(allDataPlans, "allDataPlans");
        Intrinsics.checkNotNullParameter(allSubscriptions, "allSubscriptions");
        Intrinsics.checkNotNullParameter(subscriptionOffer, "subscriptionOffer");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        Intrinsics.checkNotNullParameter(autoRenewalToggleChecked, "autoRenewalToggleChecked");
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        Intrinsics.checkNotNullParameter(unlockableEsimProfiles, "unlockableEsimProfiles");
        Intrinsics.checkNotNullParameter(userDevices, "userDevices");
        Intrinsics.checkNotNullParameter(connectivityTroubleshootingInfo, "connectivityTroubleshootingInfo");
        return new n(subscription, allDataPlans, allSubscriptions, subscriptionOffer, esimInstallationStates, z, autoRenewalToggleChecked, giftRecipient, idempotencyKey, deviceId, esimProfiles, unlockableEsimProfiles, userDevices, connectivityTroubleshootingInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f323568a, nVar.f323568a) && Intrinsics.f(this.f323569b, nVar.f323569b) && Intrinsics.f(this.f323570c, nVar.f323570c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && Intrinsics.f(this.f323571g, nVar.f323571g) && Intrinsics.f(this.f323572h, nVar.f323572h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f323573j, nVar.f323573j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f323574l, nVar.f323574l) && Intrinsics.f(this.f323575m, nVar.f323575m) && Intrinsics.f(this.f323576n, nVar.f323576n);
    }

    public final int hashCode() {
        return this.f323576n.hashCode() + kii.e.c(this.f323575m, kii.e.c(this.f323574l, kii.e.c(this.k, (this.f323573j.hashCode() + p.a.c(kii.e.c(this.f323572h, kii.e.c(this.f323571g, j6.a.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f323570c, kii.e.c(this.f323569b, this.f323568a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31), 31), 31, this.i)) * 31, 31), 31), 31);
    }
}
