package okk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import com.revolut.feature.shared.savings.models.product.SavingsOnboardingData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$JointSavingsAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsSavingsAvailability;
import com.revolut.sso.api.models.Evidence;
import dx4.a1;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ll4.y;
import n61.p;
import om4.u0;
import plg.n;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226136a;

    public /* synthetic */ d(int i) {
        this.f226136a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f226136a;
        nl4.f fVar = nl4.f.f216997a;
        Object obj3 = null;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return MoreForFamilyScreenContract$KidsSavingsAvailability.NotAvailable.f103440a;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return MoreForFamilyScreenContract$JointSavingsAvailability.NotAvailable.f103430a;
            case 2:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = MoreForFamilyScreen.R;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.u;
            case 3:
                Evidence it11 = (Evidence) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                String simpleName = it11.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            case 4:
                List autoInvestsList = (List) obj2;
                Intrinsics.checkNotNullParameter(autoInvestsList, "autoInvestsList");
                Iterator it12 = autoInvestsList.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next2 = it12.next();
                        yvh.b bVar = (yvh.b) next2;
                        if (bVar.f317177b && bVar.e == yvh.h.CURRENT_POCKET) {
                            obj3 = next2;
                        }
                    }
                }
                yvh.b bVar2 = (yvh.b) obj3;
                if (bVar2 != null) {
                    od0.i.Companion.getClass();
                    return od0.h.a(bVar2);
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                return ((io3.d) obj2).f163145a;
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List<SavingsProductData> list2 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (SavingsProductData savingsProductData : list2) {
                    Iterator it13 = list.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            next = it13.next();
                            if (Intrinsics.f(((hha.d) next).f152287a, savingsProductData.f86683a.i)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    hha.d dVar = (hha.d) next;
                    Pair pair2 = dVar != null ? new Pair(dVar, savingsProductData) : null;
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                return arrayList;
            case 7:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                hha.d dVar2 = (hha.d) pair3.f186385a;
                List list3 = (List) pair3.f186386b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (Intrinsics.f(((SavingsProductData) obj4).f86683a.i, dVar2.f152287a)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 8:
                SavingsOnboardingData it14 = (SavingsOnboardingData) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.h hVar = od0.i.Companion;
                OnboardingConfig onboardingConfig = it14.f86615b;
                hVar.getClass();
                return od0.h.a(onboardingConfig);
            case 9:
                p it15 = (p) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return n.f237393a;
            case 10:
                qlg.a it16 = (qlg.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new kq2.b(it16.getTransactionId(), null);
            case 11:
                PricingPlanSubscription it17 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f81129a;
            case 12:
                Intrinsics.checkNotNullParameter((olm.a) obj2, "<this>");
                return Unit.f186387a;
            case 13:
                Intrinsics.checkNotNullParameter((olm.a) obj2, "<this>");
                return Unit.f186387a;
            case 14:
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                ql0.a.f247033a.getClass();
                return r.timer(5L, TimeUnit.MINUTES, hhm.f.f152431c);
            case 15:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return al4.h.f6143a;
            case 16:
                List entryPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
                return new al4.f(entryPoints);
            case 17:
                cl4.a details = (cl4.a) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                return new al4.g(details);
            case 18:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                return Boolean.valueOf(w.S(user, wi0.b.A));
            case 19:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.FALSE;
            case 20:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return AdditionalCardholdersState.NotAvailable.f69812a;
            case 21:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                CreditCardPaymentDetails creditCardPaymentDetails = (CreditCardPaymentDetails) rVar.f314201a;
                CreditCard creditCard = (CreditCard) rVar.f314202b;
                y yVar = (y) rVar.f314203c;
                xi0.b bVar3 = creditCardPaymentDetails.f68737c;
                dj0.d dVar3 = creditCardPaymentDetails.f;
                dj0.d dVar4 = creditCardPaymentDetails.f68739h;
                return new gl4.d(bVar3, dVar3, dVar4, dVar4, creditCardPaymentDetails.f68743n, creditCardPaymentDetails.o, new dj0.d(10L, creditCardPaymentDetails.f68737c), pyd.c.H(creditCard.f69794c, new dj0.d(yVar.f196564n, creditCard.f69798l)));
            case 22:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return Boolean.valueOf(((Boolean) pair4.f186385a).booleanValue() && !((List) pair4.f186386b).isEmpty());
            case 23:
                Throwable it22 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.FALSE;
            case 24:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                return Boolean.valueOf(!pockets.isEmpty());
            case 25:
                Throwable it23 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return f0.f322471a;
            case 26:
                Throwable it24 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return fVar;
            case 27:
                Throwable it25 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return fVar;
            case 28:
                List entryPoints2 = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints2, "entryPoints");
                ArrayList<fs3.i> arrayList3 = new ArrayList();
                for (Object obj5 : entryPoints2) {
                    if (u0.f226706h.contains(((fs3.i) obj5).f137586a)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (fs3.i iVar : arrayList3) {
                    fs3.b bVar4 = iVar.f137586a;
                    a1 a1Var = iVar.d;
                    int iC = a1Var != null ? a1Var.c() : u0.a(bVar4);
                    String str = iVar.f137587b;
                    TextLocalisedClause textLocalisedClause = str != null ? new TextLocalisedClause(R$string.credit_card_additional_entry_point_global_search_title, u.c(str), null, 12) : u0.b(iVar.f137586a);
                    String str2 = iVar.f137588c;
                    arrayList4.add(new al4.k(bVar4, iC, textLocalisedClause, str2 != null ? new TextLocalisedClause(R$string.credit_card_additional_entry_point_global_search_subtitle, u.c(str2), null, 12) : null));
                }
                return arrayList4;
            default:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return d0.E0((List) rVar2.f314203c, d0.E0((List) rVar2.f314202b, (List) rVar2.f314201a));
        }
    }

    public /* synthetic */ d(u0 u0Var) {
        this.f226136a = 28;
    }
}
