package vga;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pricing_plans.upgrade_prompt.impl.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import do3.n;
import ffk.j;
import ffk.t;
import hha.s;
import hha.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import m8b.o;
import mha.h;
import te0.w;
import wga.i;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends o {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, t tVar, l80.e eVar, ang.f fVar, int i) {
        super(jVar, tVar, eVar, fVar);
        this.e = i;
    }

    public static mha.a d(hha.d dVar, List list) {
        mha.a aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.f(((h) obj2).a(), dVar.f152287a)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        do {
            aVar = null;
            if (!it8.hasNext()) {
                break;
            }
            h hVar = (h) it8.next();
            if (hVar instanceof mha.a) {
                aVar = (mha.a) hVar;
            }
        } while (aVar == null);
        return aVar;
    }

    public static boolean e(hha.d dVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.f(((h) obj2).a(), dVar.f152287a)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof mha.d) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            if (((mha.d) it8.next()).f205444c == null) {
                return true;
            }
        }
        return false;
    }

    @Override // m8b.o
    public final i a(PricingPlanSubscription subscription, List higherPlans, List allLimits) {
        hha.d dVar;
        mha.a aVarD;
        hha.d dVar2;
        int i = this.e;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(higherPlans, "higherPlans");
        Intrinsics.checkNotNullParameter(allLimits, "allLimits");
        switch (i) {
            case 0:
                hha.d dVar3 = subscription.f81129a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : higherPlans) {
                    hha.d dVar4 = (hha.d) obj2;
                    mha.a aVarD2 = d(dVar3, allLimits);
                    boolean zF = false;
                    if (aVarD2 != null && (aVarD = d(dVar4, allLimits)) != null) {
                        zF = aVarD.f205435c.f(aVarD2.f205435c);
                    }
                    if (zF) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty() || (dVar = (hha.d) d0.d0(arrayList)) == null) {
                    return null;
                }
                return ebm.a.b(new TextLocalisedClause(R$string.premium_contextual_banners_atm_unlock_higher_limits_title, null, null, 14), s.f(dVar));
            default:
                u.Companion.getClass();
                u feature = u.f;
                Lazy lazy = s.f152339a;
                Intrinsics.checkNotNullParameter(subscription, "<this>");
                Intrinsics.checkNotNullParameter(feature, "feature");
                if (s.h(subscription.f81129a, feature)) {
                    return null;
                }
                List list = higherPlans;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    hha.d dVar5 = (hha.d) obj3;
                    if (e(dVar5, allLimits)) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : allLimits) {
                            if (Intrinsics.f(((h) obj4).a(), dVar5.f152287a)) {
                                arrayList3.add(obj4);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : arrayList3) {
                            if (obj5 instanceof mha.g) {
                                arrayList4.add(obj5);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            Iterator it8 = arrayList4.iterator();
                            while (it8.hasNext()) {
                                mha.j jVar = ((mha.g) it8.next()).f205452c;
                                if (jVar == null || Intrinsics.b(Double.valueOf(jVar.f205454a), 0.0d)) {
                                    arrayList2.add(obj3);
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list) {
                    if (e((hha.d) obj6, allLimits)) {
                        arrayList5.add(obj6);
                    }
                }
                if (arrayList2.isEmpty()) {
                    if (arrayList5.isEmpty() || (dVar2 = (hha.d) d0.d0(arrayList5)) == null) {
                        return null;
                    }
                    return ebm.a.b(new TextLocalisedClause(R$string.premium_contextual_banners_fx_weekend_fee_title, null, null, 14), s.f(dVar2));
                }
                hha.d dVar6 = (hha.d) d0.d0(arrayList2);
                if (dVar6 == null) {
                    return null;
                }
                return ebm.a.b(new TextLocalisedClause(R$string.premium_contextual_banners_fx_title, null, null, 14), s.f(dVar6));
        }
    }

    @Override // m8b.o
    public boolean b(n user) {
        switch (this.e) {
            case 1:
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                return w.S(user, wi0.b.A);
            default:
                return super.b(user);
        }
    }
}
