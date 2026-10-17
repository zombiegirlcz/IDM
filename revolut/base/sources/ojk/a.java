package ojk;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.insurance.api.models.details.CFACDocument;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$State;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsAccountAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsSavingsAvailability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225802a;

    public /* synthetic */ a(int i) {
        this.f225802a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f225802a;
        od0.i iVar = od0.i.f224256b;
        Pair pair = null;
        switch (i) {
            case 0:
                EsimDelegate.Model it8 = (EsimDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.f52238q;
                if (obj3 instanceof PlanScreenElementView.FeaturedActionWidget) {
                    return (PlanScreenElementView.FeaturedActionWidget) obj3;
                }
                return null;
            case 1:
                EsimDelegate.Model it9 = (EsimDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.f52238q;
                if (obj4 instanceof PlanScreenElementView.FeaturedActionWidget) {
                    return (PlanScreenElementView.FeaturedActionWidget) obj4;
                }
                return null;
            case 2:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.k;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g0.c();
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new xj5.a((List) pair2.f186385a, (List) pair2.f186386b);
            case 5:
                List<jq9.k> recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                ArrayList arrayList = new ArrayList();
                for (jq9.k kVar : recents) {
                    jq9.p pVar = kVar instanceof jq9.p ? (jq9.p) kVar : null;
                    zm3.a aVar = pVar != null ? pVar.f177514b : null;
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (obj5 instanceof zm3.l) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 6:
                zm3.b it11 = (zm3.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list = it11.f323334c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof zm3.l) {
                        arrayList3.add(obj6);
                    }
                }
                return arrayList3;
            case 7:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceDocumentsScreen.U;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj7 = it12.u;
                if (obj7 instanceof CFACDocument) {
                    return (CFACDocument) obj7;
                }
                return null;
            case 8:
                JuniorProgressionFlowContract$State juniorProgressionFlowContract$State = (JuniorProgressionFlowContract$State) obj2;
                return JuniorProgressionFlowContract$State.a(juniorProgressionFlowContract$State, null, juniorProgressionFlowContract$State.f77153b + 1, null, 5);
            case 9:
                return JuniorProgressionFlowContract$State.a((JuniorProgressionFlowContract$State) obj2, null, 0, null, 5);
            case 10:
                vl4.g it13 = (vl4.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it13);
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 12:
                whf.p it14 = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 14:
                Intrinsics.checkNotNullParameter((aii.r) obj2, "it");
                return Unit.f186387a;
            case 15:
                ejb.b it15 = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f126837b;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 17:
                Clause it16 = (Clause) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it16);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 19:
                od0.i rateWithIdOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(rateWithIdOptional, "rateWithIdOptional");
                Pair pair3 = (Pair) rateWithIdOptional.f224257a;
                return pair3 != null ? new MoreForFamilyScreenContract$KidsSavingsAvailability.CreationAvailable((Clause) pair3.f186385a, (String) pair3.f186386b) : MoreForFamilyScreenContract$KidsSavingsAvailability.NotAvailable.f103440a;
            case 20:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zhm.w.u(it17);
            case 21:
                ejb.b it18 = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f126837b;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 23:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                return (SavingsProductData) zhm.d0.b0(list2);
            case 24:
                Pair it19 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it19);
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 26:
                List list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                Iterator it20 = list3.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Pair pair4 = (Pair) ((od0.i) it20.next()).f224257a;
                        if (pair4 != null) {
                            pair = pair4;
                        }
                    }
                }
                if (pair != null) {
                    return pair;
                }
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            case 27:
                Pair it21 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it21);
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return MoreForFamilyScreenContract$KidsAccountAvailability.NotAvailable.f103434a;
        }
    }
}
