package au0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.revolut.feature.freelancer.common.models.onboarding.OnboardFreelancerResult;
import com.revolut.feature.freelancer.common.models.onboarding.OnboardingVerificationStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import st6.f;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9239a;

    public /* synthetic */ j0(int i) {
        this.f9239a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OnboardingVerificationStep urlSpecification;
        Set setI1;
        lr6.c cVar = null;
        switch (this.f9239a) {
            case 0:
                Intrinsics.checkNotNullParameter((View) obj2, "it");
                return Unit.f186387a;
            case 1:
                View from = (View) obj2;
                Intrinsics.checkNotNullParameter(from, "it");
                Intrinsics.checkNotNullParameter(js0.f.Companion, "<this>");
                Intrinsics.checkNotNullParameter(from, "from");
                ViewParent parent = from.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    return null;
                }
                return jb3.l.n(viewGroup);
            case 2:
                List customers = (List) obj2;
                Intrinsics.checkNotNullParameter(customers, "customers");
                List list = customers;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(mif.e0.C((com.revolut.feature.freelancer.impl.network.models.l) it8.next()));
                }
                return arrayList;
            case 3:
                com.revolut.feature.freelancer.impl.network.models.l customer = (com.revolut.feature.freelancer.impl.network.models.l) obj2;
                Intrinsics.checkNotNullParameter(customer, "customer");
                return zhm.u.c(mif.e0.C(customer));
            case 4:
                com.revolut.feature.freelancer.impl.network.models.l it9 = (com.revolut.feature.freelancer.impl.network.models.l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return mif.e0.C(it9);
            case 5:
                qt6.f settings = (qt6.f) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                return ft6.h.f(settings);
            case 6:
                List invoices = (List) obj2;
                Intrinsics.checkNotNullParameter(invoices, "invoices");
                List list2 = invoices;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(ft6.h.e((qt6.b) it10.next()));
                }
                return arrayList2;
            case 7:
                qt6.l it11 = (qt6.l) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ft6.h.h(it11);
            case 8:
                qt6.f it12 = (qt6.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ft6.h.f(it12);
            case 9:
                qt6.b it13 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return ft6.h.e(it13);
            case 10:
                List taxRates = (List) obj2;
                Intrinsics.checkNotNullParameter(taxRates, "taxRates");
                List list3 = taxRates;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    arrayList3.add(ft6.h.h((qt6.l) it14.next()));
                }
                return arrayList3;
            case 11:
                qt6.b it15 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return ft6.h.e(it15);
            case 12:
                qt6.b it16 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return ft6.h.e(it16);
            case 13:
                qt6.b it17 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return ft6.h.e(it17);
            case 14:
                qt6.b it18 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return ft6.h.e(it18);
            case 15:
                qt6.b it19 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return ft6.h.e(it19);
            case 16:
                qt6.b it20 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return ft6.h.e(it20);
            case 17:
                qt6.b it21 = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return ft6.h.e(it21);
            case 18:
                List invoices2 = (List) obj2;
                Intrinsics.checkNotNullParameter(invoices2, "invoices");
                List list4 = invoices2;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it22 = list4.iterator();
                while (it22.hasNext()) {
                    arrayList4.add(ft6.h.e((qt6.b) it22.next()));
                }
                return arrayList4;
            case 19:
                List invoices3 = (List) obj2;
                Intrinsics.checkNotNullParameter(invoices3, "invoices");
                List list5 = invoices3;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it23 = list5.iterator();
                while (it23.hasNext()) {
                    arrayList5.add(ft6.h.e((qt6.b) it23.next()));
                }
                return arrayList5;
            case 20:
                qt6.b invoice = (qt6.b) obj2;
                Intrinsics.checkNotNullParameter(invoice, "invoice");
                return zhm.u.c(ft6.h.e(invoice));
            case 21:
                qt6.b bVar = (qt6.b) obj2;
                Intrinsics.h(bVar);
                return ft6.h.e(bVar);
            case 22:
                return ((ResponseBody) obj2).string();
            case 23:
                com.revolut.feature.freelancer.impl.network.models.d0 it24 = (com.revolut.feature.freelancer.impl.network.models.d0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                Map map = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(it24, "<this>");
                return new OnboardFreelancerResult(it24.getApplicationId());
            case 24:
                List<st6.f> steps = (List) obj2;
                Intrinsics.checkNotNullParameter(steps, "steps");
                Map map2 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(steps, "<this>");
                ArrayList arrayList6 = new ArrayList();
                for (st6.f fVar : steps) {
                    if (fVar instanceof f.a) {
                        f.a aVar = (f.a) fVar;
                        urlSpecification = new OnboardingVerificationStep.ActivityProof(aVar.getVerificationType(), aVar.getFormId());
                    } else if (fVar instanceof f.d) {
                        f.d dVar = (f.d) fVar;
                        urlSpecification = new OnboardingVerificationStep.UrlSpecification(dVar.getVerificationType(), dVar.getMandatory());
                    } else {
                        if (!(fVar instanceof f.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        urlSpecification = null;
                    }
                    if (urlSpecification != null) {
                        arrayList6.add(urlSpecification);
                    }
                }
                return arrayList6;
            case 25:
                List list6 = (List) obj2;
                Intrinsics.checkNotNullParameter(list6, "list");
                List<st6.d> list7 = list6;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list7, 10));
                for (st6.d dVar2 : list7) {
                    Map map3 = ft6.k.f137948a;
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    arrayList7.add(new vr6.c(dVar2.getType(), dVar2.getMessage()));
                }
                return arrayList7;
            case 26:
                com.revolut.feature.freelancer.impl.network.models.k0 it25 = (com.revolut.feature.freelancer.impl.network.models.k0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                Intrinsics.checkNotNullParameter(it25, "<this>");
                String cardProcessors = it25.getCardProcessors();
                lr6.c[] cVarArrValues = lr6.c.values();
                int length = cVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        lr6.c cVar2 = cVarArrValues[i];
                        if (kotlin.text.a0.z(cVar2.name(), cardProcessors, true)) {
                            cVar = cVar2;
                        } else {
                            i++;
                        }
                    }
                }
                if (cVar == null) {
                    cVar = lr6.c.UNKNOWN;
                }
                return new lr6.f0(cVar);
            case 27:
                od0.i it26 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                List list8 = (List) it26.g();
                return (list8 == null || (setI1 = zhm.d0.i1(list8)) == null) ? zhm.h0.f322473a : setI1;
            case 28:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                return zhm.d0.P0(orders, new au6.j2());
            default:
                com.revolut.feature.freelancer.impl.network.models.l0 it27 = (com.revolut.feature.freelancer.impl.network.models.l0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return ft6.k.a(it27);
        }
    }
}
