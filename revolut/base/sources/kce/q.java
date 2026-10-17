package kce;

import ard.t;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.recurring_payments.api.RecurringPaymentApi$Toggles$PredictedSubscriptions;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.x;
import qua.y;
import qua.z;
import te0.w;
import w38.v;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements g9e.a {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.d f182711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f182712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f182713c;
    public final wsg.n d;
    public final e61.a e;
    public final ppg.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q7c.d f182714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.e f182715h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mk0.a f182716j;
    public final jla.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cl3.a f182717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d9e.b f182718m;

    static {
        Intrinsics.checkNotNullParameter("SCHEDULED_HELPER_SHOWED_KEY", "id");
        Intrinsics.checkNotNullParameter("SCHEDULED_TOOLTIP_SHOWED_KEY", "id");
    }

    public q(uc.d recurringPaymentExtendedContentProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, b80.c networkStateRepository, wsg.n walletInteractor, e61.a ratesInteractor, ppg.b vaultsInteractor, q7c.d merchantInitiatedDeferredPaymentInteractor, l80.e dateProvider, gte.a featureToggleInteractor, mk0.a personalisationStorage, jla.h productCatalogueInteractor, cl3.a contactsInteractor, d9e.b raisedSubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentExtendedContentProvider, "recurringPaymentExtendedContentProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(merchantInitiatedDeferredPaymentInteractor, "merchantInitiatedDeferredPaymentInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(raisedSubscriptionsInteractor, "raisedSubscriptionsInteractor");
        this.f182711a = recurringPaymentExtendedContentProvider;
        this.f182712b = transactionsInteractor;
        this.f182713c = networkStateRepository;
        this.d = walletInteractor;
        this.e = ratesInteractor;
        this.f = vaultsInteractor;
        this.f182714g = merchantInitiatedDeferredPaymentInteractor;
        this.f182715h = dateProvider;
        this.i = featureToggleInteractor;
        this.f182716j = personalisationStorage;
        this.k = productCatalogueInteractor;
        this.f182717l = contactsInteractor;
        this.f182718m = raisedSubscriptionsInteractor;
    }

    public final List e(List list, RecurringPaymentFilter recurringPaymentFilter) {
        if (recurringPaymentFilter == null) {
            return list;
        }
        ZonedDateTime zonedDateTimeK = ((l80.f) this.f182715h).k();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (zae.c.a(((RecurringPaymentWithExtra) obj2).getF81653a(), recurringPaymentFilter, zonedDateTimeK)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final efm.r f(efm.r rVar, efm.r rVar2, efm.r rVar3) {
        efm.r map = cl3.a.a(this.f182717l).map(new c(new kcd.a(1), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = w.n(rVar, rVar2, rVar3, map).switchMap(new c(new d(this, 1), 5));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final efm.r g(xi0.b baseCurrency, b9e.e subscriptionsModel) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(subscriptionsModel, "subscriptionsModel");
        ArrayList arrayListA = subscriptionsModel.a();
        ArrayList subscriptions = new ArrayList(zhm.w.t(arrayListA, 10));
        Iterator it8 = arrayListA.iterator();
        while (it8.hasNext()) {
            subscriptions.add(((RecurringPaymentWithExtra) it8.next()).getF81653a());
        }
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : subscriptions) {
            if (hashSet.add(((qua.p) obj2).i)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((qua.p) it9.next()).i);
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!Intrinsics.f((String) obj3, baseCurrency.f306286a)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        for (String str : arrayList3) {
            xi0.b.Companion.getClass();
            arrayList4.add(new Pair(xi0.a.a(str), baseCurrency));
        }
        return ue0.e.E(this.e.a(arrayList4), new Data(f0.f322471a, null, false, 2, null));
    }

    public final efm.r h(b9e.b bVar, RecurringPaymentFilter recurringPaymentFilter, Set accountId, boolean z, boolean z3) {
        Object next;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Set set = accountId;
        boolean z4 = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((AccountId) it8.next()) instanceof AccountId.Personal) {
                    z4 = true;
                    break;
                }
            }
        }
        Iterator it9 = set.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (((AccountId) next) instanceof AccountId.Joint) {
                break;
            }
        }
        AccountId.Joint joint = next instanceof AccountId.Joint ? (AccountId.Joint) next : null;
        z xVar = qua.w.f249340a;
        if (!z4 || joint == null) {
            if (joint != null) {
                String id10 = joint.f51413b;
                Intrinsics.checkNotNullParameter(id10, "id");
                xVar = new x(id10);
            } else if (z4) {
                xVar = y.f249342a;
            }
        }
        return i(xVar, false, bVar, recurringPaymentFilter, z, z3);
    }

    public final efm.r i(z walletFilter, boolean z, b9e.b bVar, RecurringPaymentFilter recurringPaymentFilter, boolean z3, boolean z4) {
        efm.r rVarI;
        efm.r rVarJ;
        efm.r rVarH;
        boolean z6 = walletFilter.equals(y.f249342a) || walletFilter.equals(qua.w.f249340a);
        uc.d dVar = this.f182711a;
        xua.a aVar = (xua.a) dVar.f278953b;
        Intrinsics.checkNotNullParameter(walletFilter, "walletFilter");
        if (z3) {
            yua.q qVar = (yua.q) aVar;
            Intrinsics.checkNotNullParameter(walletFilter, "walletFilter");
            rVarI = qVar.i(nim.a.w(qVar.s(true, walletFilter, false), new ysk.a(11)), new ypg.h(22));
        } else {
            yua.q qVar2 = (yua.q) aVar;
            Intrinsics.checkNotNullParameter(walletFilter, "walletFilter");
            rVarI = qVar2.i(nim.a.w(qVar2.s(true, walletFilter, true), new ysk.a(11)), new ypg.h(22));
        }
        efm.r rVarR = pd.b.r(rVarI, new yua.a(dVar, 1));
        if (z6) {
            q7c.d dVar2 = this.f182714g;
            rVarJ = nim.a.w(((k7c.h) dVar2.f242807a).d.f(Unit.f186387a, true), new q56.o(dVar2, 13)).map(new k64.a(29, new kcd.a(2)));
        } else {
            rVarJ = zi0.c.j(f0.f322471a);
        }
        Intrinsics.checkNotNullExpressionValue(rVarJ, "observeDeferredPayments(...)");
        efm.r rVarT = pd.b.t(nim.a.w(nim.a.w(kli.a.h(rVarR, rVarJ), new kcd.a(5)), new kcd.a(6)), new k65.d(1, this, q.class, "wrapWithExtraData", "wrapWithExtraData(Ljava/util/List;)Lio/reactivex/Single;", 0, 12));
        boolean zC = ((jte.d) this.i).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c);
        d9e.b bVar2 = this.f182718m;
        if (zC && z3) {
            wae.e eVar = (wae.e) bVar2;
            yua.q qVar3 = (yua.q) eVar.f295870a;
            sfm.b bVar3 = new sfm.b(qVar3.m(), new yta.c(16, new yua.g(qVar3, 0)), 2);
            Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
            rVarH = pd.b.t(bVar3, new v(eVar, null, 17));
        } else if (zC) {
            wae.e eVar2 = (wae.e) bVar2;
            yua.q qVar4 = (yua.q) eVar2.f295870a;
            sfm.b bVar4 = new sfm.b(qVar4.m(), new yta.c(19, new yua.g(qVar4, 1)), 2);
            Intrinsics.checkNotNullExpressionValue(bVar4, "flatMapObservable(...)");
            rVarH = pd.b.t(bVar4, new w3c.n(eVar2, 18));
        } else {
            rVarH = w.h(new Data(f0.f322471a, null, false, 6, null));
        }
        efm.r rVarCompose = nim.a.w(kli.a.h(rVarT, rVarH), new t(this, bVar, recurringPaymentFilter, z4, 14)).compose(new c(new gae.a(z, this, 25), 6));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }
}
