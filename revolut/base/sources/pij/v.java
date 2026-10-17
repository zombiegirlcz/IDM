package pij;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f236579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f236580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f236581c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f236582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f236583h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f236584j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f236585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dm0.b f236586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f236587n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f236588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f236589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f236590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f236591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EsimSubscriptionsEmptyDisplay f236592t;
    public final Boolean u;

    public v(Data esimSubscriptions, Data planSubscription, Data pricingPlans, Data esimHomeBanners, Data planOffers, Data revolutTermsUrl, Data partnerTermsUrl, Data esimInstallationStates, Data hasGiftRecipients, String idempotencyKey, Data userCompany, Data onlyManualInstallationAvailable, dm0.b deviceId, h0 viewSelection, Data unlockableEsimProfiles, Data devices, Data portabilityChecklistSlots, Data subscriptionsByView, Boolean bool, EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay, Boolean bool2) {
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        Intrinsics.checkNotNullParameter(planSubscription, "planSubscription");
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        Intrinsics.checkNotNullParameter(esimHomeBanners, "esimHomeBanners");
        Intrinsics.checkNotNullParameter(planOffers, "planOffers");
        Intrinsics.checkNotNullParameter(revolutTermsUrl, "revolutTermsUrl");
        Intrinsics.checkNotNullParameter(partnerTermsUrl, "partnerTermsUrl");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        Intrinsics.checkNotNullParameter(hasGiftRecipients, "hasGiftRecipients");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(viewSelection, "viewSelection");
        Intrinsics.checkNotNullParameter(unlockableEsimProfiles, "unlockableEsimProfiles");
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(portabilityChecklistSlots, "portabilityChecklistSlots");
        Intrinsics.checkNotNullParameter(subscriptionsByView, "subscriptionsByView");
        this.f236579a = esimSubscriptions;
        this.f236580b = planSubscription;
        this.f236581c = pricingPlans;
        this.d = esimHomeBanners;
        this.e = planOffers;
        this.f = revolutTermsUrl;
        this.f236582g = partnerTermsUrl;
        this.f236583h = esimInstallationStates;
        this.i = hasGiftRecipients;
        this.f236584j = idempotencyKey;
        this.k = userCompany;
        this.f236585l = onlyManualInstallationAvailable;
        this.f236586m = deviceId;
        this.f236587n = viewSelection;
        this.o = unlockableEsimProfiles;
        this.f236588p = devices;
        this.f236589q = portabilityChecklistSlots;
        this.f236590r = subscriptionsByView;
        this.f236591s = bool;
        this.f236592t = esimSubscriptionsEmptyDisplay;
        this.u = bool2;
    }

    public static v a(v vVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, String str, Data data10, Data data11, h0 h0Var, Data data12, Data data13, Data data14, Data data15, Boolean bool, EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay, Boolean bool2, int i) {
        Data data16;
        Data data17;
        Data data18;
        Data data19;
        Data data20;
        Boolean bool3;
        Data esimSubscriptions = (i & 1) != 0 ? vVar.f236579a : data;
        Data planSubscription = (i & 2) != 0 ? vVar.f236580b : data2;
        Data pricingPlans = (i & 4) != 0 ? vVar.f236581c : data3;
        Data esimHomeBanners = (i & 8) != 0 ? vVar.d : data4;
        Data planOffers = (i & 16) != 0 ? vVar.e : data5;
        Data revolutTermsUrl = (i & 32) != 0 ? vVar.f : data6;
        Data partnerTermsUrl = (i & 64) != 0 ? vVar.f236582g : data7;
        Data esimInstallationStates = (i & 128) != 0 ? vVar.f236583h : data8;
        Data hasGiftRecipients = (i & 256) != 0 ? vVar.i : data9;
        String idempotencyKey = (i & 512) != 0 ? vVar.f236584j : str;
        Data userCompany = (i & 1024) != 0 ? vVar.k : data10;
        Data onlyManualInstallationAvailable = (i & 2048) != 0 ? vVar.f236585l : data11;
        dm0.b deviceId = vVar.f236586m;
        h0 viewSelection = (i & 8192) != 0 ? vVar.f236587n : h0Var;
        Data unlockableEsimProfiles = (i & 16384) != 0 ? vVar.o : data12;
        Data data21 = (i & 32768) != 0 ? vVar.f236588p : data13;
        if ((i & 65536) != 0) {
            data16 = data21;
            data17 = vVar.f236589q;
        } else {
            data16 = data21;
            data17 = data14;
        }
        if ((i & 131072) != 0) {
            data18 = data17;
            data19 = vVar.f236590r;
        } else {
            data18 = data17;
            data19 = data15;
        }
        if ((i & 262144) != 0) {
            data20 = data19;
            bool3 = vVar.f236591s;
        } else {
            data20 = data19;
            bool3 = bool;
        }
        Boolean bool4 = bool3;
        EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay2 = (i & 524288) != 0 ? vVar.f236592t : esimSubscriptionsEmptyDisplay;
        Boolean bool5 = (i & PKIFailureInfo.badCertTemplate) != 0 ? vVar.u : bool2;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        Intrinsics.checkNotNullParameter(planSubscription, "planSubscription");
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        Intrinsics.checkNotNullParameter(esimHomeBanners, "esimHomeBanners");
        Intrinsics.checkNotNullParameter(planOffers, "planOffers");
        Intrinsics.checkNotNullParameter(revolutTermsUrl, "revolutTermsUrl");
        Intrinsics.checkNotNullParameter(partnerTermsUrl, "partnerTermsUrl");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        Intrinsics.checkNotNullParameter(hasGiftRecipients, "hasGiftRecipients");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Boolean bool6 = bool5;
        Intrinsics.checkNotNullParameter(viewSelection, "viewSelection");
        Intrinsics.checkNotNullParameter(unlockableEsimProfiles, "unlockableEsimProfiles");
        Data devices = data16;
        Intrinsics.checkNotNullParameter(devices, "devices");
        Data portabilityChecklistSlots = data18;
        Intrinsics.checkNotNullParameter(portabilityChecklistSlots, "portabilityChecklistSlots");
        Data subscriptionsByView = data20;
        Intrinsics.checkNotNullParameter(subscriptionsByView, "subscriptionsByView");
        return new v(esimSubscriptions, planSubscription, pricingPlans, esimHomeBanners, planOffers, revolutTermsUrl, partnerTermsUrl, esimInstallationStates, hasGiftRecipients, idempotencyKey, userCompany, onlyManualInstallationAvailable, deviceId, viewSelection, unlockableEsimProfiles, data16, data18, subscriptionsByView, bool4, esimSubscriptionsEmptyDisplay2, bool6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f236579a, vVar.f236579a) && Intrinsics.f(this.f236580b, vVar.f236580b) && Intrinsics.f(this.f236581c, vVar.f236581c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f236582g, vVar.f236582g) && Intrinsics.f(this.f236583h, vVar.f236583h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f236584j, vVar.f236584j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f236585l, vVar.f236585l) && Intrinsics.f(this.f236586m, vVar.f236586m) && Intrinsics.f(this.f236587n, vVar.f236587n) && Intrinsics.f(this.o, vVar.o) && Intrinsics.f(this.f236588p, vVar.f236588p) && Intrinsics.f(this.f236589q, vVar.f236589q) && Intrinsics.f(this.f236590r, vVar.f236590r) && Intrinsics.f(this.f236591s, vVar.f236591s) && Intrinsics.f(this.f236592t, vVar.f236592t) && Intrinsics.f(this.u, vVar.u);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f236590r, kii.e.c(this.f236589q, kii.e.c(this.f236588p, kii.e.c(this.o, (this.f236587n.hashCode() + ((this.f236586m.hashCode() + kii.e.c(this.f236585l, kii.e.c(this.k, p.a.c(kii.e.c(this.i, kii.e.c(this.f236583h, kii.e.c(this.f236582g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f236581c, kii.e.c(this.f236580b, this.f236579a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f236584j), 31), 31)) * 31)) * 31, 31), 31), 31), 31);
        Boolean bool = this.f236591s;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay = this.f236592t;
        int iHashCode2 = (iHashCode + (esimSubscriptionsEmptyDisplay == null ? 0 : esimSubscriptionsEmptyDisplay.hashCode())) * 31;
        Boolean bool2 = this.u;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
