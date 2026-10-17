package qij;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import dej.h0;
import dej.i0;
import dej.j0;
import dej.l0;
import dej.n0;
import dfj.k0;
import dfj.s3;
import dfj.v2;
import dfj.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f246739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f246740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f246741c;
    public final x d;
    public final v2 e;
    public final cej.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f246742g;

    public o(t esimHomeBannerRepository, k0 esimInstallationStateInteractor, s3 esimSubscriptionsInteractor, x esimEventsInteractor, v2 esimProfilesInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(esimHomeBannerRepository, "esimHomeBannerRepository");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimEventsInteractor, "esimEventsInteractor");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f246739a = esimHomeBannerRepository;
        this.f246740b = esimInstallationStateInteractor;
        this.f246741c = esimSubscriptionsInteractor;
        this.d = esimEventsInteractor;
        this.e = esimProfilesInteractor;
        this.f = mobilePlansFeatureAvailabilityInteractor;
        this.f246742g = featureToggleInteractor;
    }

    public static j23.b a(o oVar, List list, List list2, List list3, boolean z, int i) {
        e eVar;
        Flow flowV;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = (i & 16) == 0;
        oVar.getClass();
        List list4 = list3;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list4) {
            if (obj2 instanceof h0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((h0) it8.next()).f113546a);
        }
        ArrayList<l0> arrayList3 = new ArrayList();
        for (Object obj3 : list4) {
            if (obj3 instanceof l0) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list4) {
            if (obj4 instanceof i0) {
                arrayList4.add(obj4);
            }
        }
        ArrayList<n0> arrayList5 = new ArrayList();
        for (Object obj5 : list4) {
            if (obj5 instanceof n0) {
                arrayList5.add(obj5);
            }
        }
        ArrayList<j0> arrayList6 = new ArrayList();
        for (Object obj6 : list4) {
            if (obj6 instanceof j0) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (l0 l0Var : arrayList3) {
            arrayList7.add(hb9.b.j(f.f246731a));
        }
        if (!arrayList2.isEmpty()) {
            arrayList7.add(hb9.b.j((z3 && arrayList2.size() == 1) ? new c((EsimProfile) d0.K0(arrayList2)) : new d(arrayList2)));
        }
        Iterator it9 = arrayList4.iterator();
        while (true) {
            boolean zHasNext = it9.hasNext();
            eVar = e.f246730a;
            if (!zHasNext) {
                break;
            }
            EsimProfile esimProfile = ((i0) it9.next()).f113555a;
            if (((jte.d) oVar.f246742g).c(EsimApi$Toggles.EsimActivationBannerHidden.f100167c)) {
                flowV = hb9.b.j(eVar);
            } else {
                t tVar = oVar.f246739a;
                String esimProfileId = esimProfile.f100423a;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
                flowV = nim.a.v(new olf.e(tVar.f246747a.C0("enable_esim_banner_dismissed_" + esimProfileId, Boolean.TYPE), 29), new ohj.g(esimProfile, 1));
            }
            arrayList7.add(flowV);
        }
        for (n0 n0Var : arrayList5) {
            arrayList7.add(hb9.b.j(eVar));
        }
        for (j0 j0Var : arrayList6) {
            arrayList7.add(hb9.b.j(eVar));
        }
        if (!list.isEmpty()) {
            arrayList7.add(hb9.b.j(new j((EsimProfile) d0.b0(list))));
        }
        if (!list2.isEmpty()) {
            List list5 = list2;
            ArrayList arrayList8 = new ArrayList();
            for (Object obj7 : list5) {
                EsimProfileLock esimProfileLock = ((EsimProfile) obj7).k;
                if (esimProfileLock != null && esimProfileLock.f100447a) {
                    arrayList8.add(obj7);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj8 : list5) {
                EsimProfileLock esimProfileLock2 = ((EsimProfile) obj8).k;
                if (esimProfileLock2 != null && !esimProfileLock2.f100447a) {
                    arrayList9.add(obj8);
                }
            }
            if (!arrayList8.isEmpty()) {
                arrayList7.add(hb9.b.j(new i(arrayList8)));
            }
            if (!arrayList9.isEmpty() && !z) {
                arrayList7.add(hb9.b.j(new h(arrayList9)));
            }
        }
        if (arrayList7.isEmpty()) {
            arrayList7.add(hb9.b.j(eVar));
        }
        return u0.k(arrayList7);
    }
}
