package et6;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.MerchantDisabledFeature;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import ip0.u20;
import ip0.w20;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129317a;

    public /* synthetic */ r1(int i) {
        this.f129317a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        boolean z3;
        boolean z4;
        Object next;
        Object next2;
        Object next3;
        switch (this.f129317a) {
            case 0:
                FreelancerAccountDetails details = (FreelancerAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                List list = details.f73271c;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (((lr6.a0) it8.next()) == lr6.a0.CARD_PRESENT) {
                            z = true;
                        }
                    }
                    z = false;
                }
                break;
            case 1:
                FreelancerAccountDetails details2 = (FreelancerAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(details2, "details");
                List list2 = details2.e;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z3 = false;
                } else {
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        if (((MerchantDisabledFeature) it9.next()).f73336b == lr6.e0.MISSING_URL) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                break;
            case 2:
                FreelancerAccountDetails details3 = (FreelancerAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(details3, "details");
                List list3 = details3.f73271c;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        if (v1.f129353b.contains((lr6.a0) it10.next())) {
                            z4 = true;
                        }
                    }
                    z4 = false;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                break;
            case 5:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                od0.i iVar = (od0.i) pair2.f186385a;
                djb.h hVar = new djb.h((List) pair2.f186386b);
                es6.d dVar = (es6.d) iVar.f224257a;
                break;
            case 6:
                yvh.b it11 = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            case 7:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list4 = (List) pair3.f186385a;
                xi0.b bVar = (xi0.b) pair3.f186386b;
                Iterator it12 = list4.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next = it12.next();
                        if (Intrinsics.f(z92.f.j((io3.d) next).f115083b, bVar)) {
                        }
                    } else {
                        next = null;
                    }
                }
                break;
            case 8:
                List fees = (List) obj2;
                Intrinsics.checkNotNullParameter(fees, "fees");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : fees) {
                    gr6.o.Companion.getClass();
                    if (gr6.n.f145943b.contains(((as6.b) obj3).f8797a)) {
                        arrayList.add(obj3);
                    }
                }
                break;
            case 9:
                rr6.g it13 = (rr6.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.i.Companion.getClass();
                break;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                break;
            case 11:
                Intrinsics.checkNotNullParameter((Data) obj2, "it");
                break;
            case 12:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Set set = (Set) rVar.f314201a;
                List list5 = (List) rVar.f314202b;
                Set set2 = (Set) rVar.f314203c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list5) {
                    if (((FreelancerTaxProfile) obj4).e == ds6.d.ACTIVE) {
                        arrayList2.add(obj4);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it14 = arrayList2.iterator();
                while (it14.hasNext()) {
                    linkedHashSet.add(((FreelancerTaxProfile) it14.next()).f73475b);
                }
                break;
            case 13:
                List profiles = (List) obj2;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : profiles) {
                    if (((FreelancerTaxProfile) obj5).e == ds6.d.ACTIVE) {
                        arrayList3.add(obj5);
                    }
                }
                break;
            case 14:
                List profiles2 = (List) obj2;
                Intrinsics.checkNotNullParameter(profiles2, "profiles");
                Iterator it15 = profiles2.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next2 = it15.next();
                        if (((FreelancerTaxProfile) next2).f73475b == ds6.j.VAT) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                od0.i.Companion.getClass();
                break;
            case 15:
                List taxPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(taxPockets, "taxPockets");
                od0.h hVar2 = od0.i.Companion;
                Iterator it16 = taxPockets.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next3 = it16.next();
                        if (((es6.d) next3).f128868c == es6.c.ACTIVE) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                hVar2.getClass();
                break;
            case 16:
                List vatReminders = (List) obj2;
                Intrinsics.checkNotNullParameter(vatReminders, "vatReminders");
                break;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 18:
                BlikCode it17 = (BlikCode) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                break;
            case 19:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                break;
            case 20:
                eu2.d update = (eu2.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                w20 w20Var = w20.ICON_60DP;
                u20 u20Var = new u20("id_payment_options_loading_1", w20Var);
                yp0.b.l(u20Var, 0, 0, 0, 0, null, false, 63);
                u20 u20Var2 = new u20("id_payment_options_loading_2", w20Var);
                yp0.b.l(u20Var2, 0, 0, 0, 0, null, false, 63);
                break;
            case 22:
                bu7.b0 insuranceDetails = (bu7.b0) obj2;
                Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
                od0.h hVar3 = od0.i.Companion;
                bu7.n nVar = insuranceDetails.o;
                hVar3.getClass();
                break;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 24:
                break;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                break;
        }
        return null;
    }

    public /* synthetic */ r1(Object obj2, int i) {
        this.f129317a = i;
    }
}
