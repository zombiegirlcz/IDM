package aac;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayManagementHome;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.navigation.destination.McyTopupAccountVerificationDestination;
import com.revolut.retail.feature.travel_status.api.TravelStatusApi$Toggles$TravelStatus;
import com.revolut.retail.feature.travel_status.api.navigation.TravelStatusEntryDestination;
import e0f.v0;
import e31.j;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import lg0.e;
import lg0.g;
import r10.q;
import rd0.c;
import xii.b;
import yte.n;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2798a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2799b;

    public a(q revolutPayManagementInteractor) {
        Intrinsics.checkNotNullParameter(revolutPayManagementInteractor, "revolutPayManagementInteractor");
        this.f2799b = revolutPayManagementInteractor;
    }

    @Override // xii.b
    public final Set a() {
        switch (this.f2798a) {
            case 0:
                return y0.b("revolut-pay/settings");
            case 1:
                rte.b.Companion.getClass();
                return rte.b.templates;
            default:
                String[] elements = {"travel-status", "travel-status/{partnerId}"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return d.y0(elements);
        }
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        g71.a aVar;
        TopupMethodType topupMethodType;
        int i = this.f2798a;
        Object obj2 = this.f2799b;
        String str = null;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                if (((q) obj2).O()) {
                    return RevolutPayFeatureConfig$RevolutPayManagementHome.f84280a;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                String methodId = g.a("storedMethodId", deeplink.f195041c);
                if (methodId == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to handle MCY Account verification deeplink: missing stored method id");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(c.ERROR, "India MCY Account Verification", null, illegalArgumentException, h0Var);
                    return null;
                }
                v0 v0Var = (v0) ((vte.a) obj2);
                v0Var.getClass();
                Intrinsics.checkNotNullParameter(methodId, "methodId");
                j jVar = (j) v0Var.f121695c;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(methodId, "methodId");
                String strConcat = "TOPUP_INDIA_MCY_PENDING_INFO_KEY_".concat(methodId);
                ue0.c cVar = jVar.f122180a;
                o21.a aVar2 = (o21.a) j6.a.k(o21.a.class, cVar, strConcat);
                if (aVar2 != null) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    try {
                        String topupMethodType2 = aVar2.getTopupMethodType();
                        TopupMethodType[] topupMethodTypeArrValues = TopupMethodType.values();
                        int length = topupMethodTypeArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                topupMethodType = topupMethodTypeArrValues[i2];
                                if (!a0.z(topupMethodType.name(), topupMethodType2, true)) {
                                    i2++;
                                }
                            } else {
                                topupMethodType = null;
                            }
                        }
                        if (topupMethodType == null) {
                            throw new IllegalArgumentException("Invalid TopupMethodType stored for Mcy StoredMethod " + aVar2.getTopupMethodType());
                        }
                        aVar = new g71.a(topupMethodType, mo3.a.o(aVar2.getAmount()));
                    } catch (Exception e) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(c.ERROR, null, null, e, h0Var2);
                        aVar = null;
                    }
                } else {
                    aVar = null;
                }
                cVar.I0(strConcat);
                if (aVar != null) {
                    dj0.d dVar = aVar.f141071b;
                    return new McyTopupAccountVerificationDestination(aVar.f141070a, new TopUpMethodsContext(dVar.f115083b.f306286a, n.CURRENT), dVar, methodId);
                }
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Failed to handle MCY Account verification deeplink: missing pending info");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(c.ERROR, "India MCY Account Verification", null, illegalArgumentException2, h0Var3);
                return null;
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                if (((gte.a) obj2).a(TravelStatusApi$Toggles$TravelStatus.f104290c)) {
                    return null;
                }
                String str2 = (String) deeplink.f195040b.get("partnerId");
                if (str2 != null && !d0.W(str2)) {
                    str = str2;
                }
                return new TravelStatusEntryDestination(str);
        }
    }

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f2799b = featureToggleInteractor;
    }

    public a(vte.a topUpInteractor) {
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        this.f2799b = topUpInteractor;
    }
}
