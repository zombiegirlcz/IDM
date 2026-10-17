package oej;

import akg.n;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pej.a;
import pej.b;
import qej.f;
import qej.g;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qej.c f224610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f224611b;

    public b(qej.c esimCoreRepository, f esimSimulationRepository) {
        Intrinsics.checkNotNullParameter(esimCoreRepository, "esimCoreRepository");
        Intrinsics.checkNotNullParameter(esimSimulationRepository, "esimSimulationRepository");
        this.f224610a = esimCoreRepository;
        this.f224611b = esimSimulationRepository;
    }

    public final pej.a a() {
        boolean zA = this.f224610a.a();
        this.f224611b.getClass();
        b.a aVar = b.a.f235383a;
        if (Intrinsics.f(aVar, aVar)) {
            return zA ? a.C1306a.f235381a : a.b.f235382a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList b() {
        SubscriptionManager subscriptionManagerB;
        Iterable iterableP0;
        String iccId;
        this.f224611b.getClass();
        qej.c cVar = this.f224610a;
        if (((Boolean) cVar.f245183b.getValue()).booleanValue() && (subscriptionManagerB = cVar.b()) != null) {
            List<SubscriptionInfo> accessibleSubscriptionInfoList = subscriptionManagerB.getAccessibleSubscriptionInfoList();
            if (accessibleSubscriptionInfoList == null) {
                accessibleSubscriptionInfoList = f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : accessibleSubscriptionInfoList) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj2;
                if (subscriptionInfo.isEmbedded() && (iccId = subscriptionInfo.getIccId()) != null && iccId.length() != 0) {
                    arrayList.add(obj2);
                }
            }
            iterableP0 = d0.P0(arrayList, new qej.b());
        } else {
            iterableP0 = f0.f322471a;
        }
        Iterable<SubscriptionInfo> iterable = iterableP0;
        ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
        for (SubscriptionInfo subscriptionInfo2 : iterable) {
            int subscriptionId = subscriptionInfo2.getSubscriptionId();
            String iccId2 = subscriptionInfo2.getIccId();
            Intrinsics.checkNotNullExpressionValue(iccId2, "getIccId(...)");
            String mccString = subscriptionInfo2.getMccString();
            String str = "";
            if (mccString == null) {
                mccString = "";
            }
            String mncString = subscriptionInfo2.getMncString();
            if (mncString != null) {
                str = mncString;
            }
            arrayList2.add(new pej.c(subscriptionId, iccId2, mccString, str));
        }
        return arrayList2;
    }

    public final Boolean c(pej.c cVar) {
        SubscriptionManager subscriptionManagerB = this.f224610a.b();
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManagerB != null ? subscriptionManagerB.getActiveSubscriptionInfoList() : null;
        if (activeSubscriptionInfoList == null) {
            activeSubscriptionInfoList = f0.f322471a;
        }
        List<SubscriptionInfo> list = activeSubscriptionInfoList;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((SubscriptionInfo) it8.next()).getSubscriptionId() == cVar.f235384a) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final n d() {
        ((g) this.f224611b).getClass();
        return nim.a.v(new go.g(zi0.c.P(b.a.f235383a, false, null, 3), 2), new o9h.b(this, 17));
    }
}
