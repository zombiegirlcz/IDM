package dee;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import dej.b2;
import dej.c1;
import dej.d3;
import dej.f1;
import dej.g1;
import dej.m0;
import dej.o0;
import dej.p1;
import dej.p3;
import dej.r2;
import dej.s2;
import dej.t1;
import dej.u3;
import dej.z1;
import dfj.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.r1;
import pej.a;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113427a;

    public /* synthetic */ x(int i) {
        this.f113427a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        Object next3;
        int i = this.f113427a;
        Object iVar = rd6.j.f253358a;
        g1.a aVar = g1.a.f113537a;
        b39.b bVar = b39.b.f12015a;
        Object obj3 = null;
        switch (i) {
            case 0:
                return (tde.l) ((n) obj2).f113413a.getContent();
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return c0.a();
            case 2:
                df4.d update = (df4.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new df4.d(true);
            case 3:
                EsimProfile it8 = (EsimProfile) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                EsimProfileDetails esimProfileDetails = it8.f100426g;
                return new Pair(esimProfileDetails != null ? esimProfileDetails.f100433a : null, it8.i);
            case 4:
                dej.i it9 = (dej.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.d);
            case 5:
                List profileToScopes = (List) obj2;
                Intrinsics.checkNotNullParameter(profileToScopes, "profileToScopes");
                Iterator it10 = profileToScopes.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (((p1) next).f113615b.contains(u3.CONNECTIVITY)) {
                        }
                    } else {
                        next = null;
                    }
                }
                p1 p1Var = (p1) next;
                if (p1Var != null) {
                    return p1Var.f113614a;
                }
                return null;
            case 6:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zhm.w.u(it11);
            case 7:
                Map idToProfile = (Map) obj2;
                Intrinsics.checkNotNullParameter(idToProfile, "idToProfile");
                ArrayList arrayList = new ArrayList();
                Iterator it12 = idToProfile.entrySet().iterator();
                while (it12.hasNext()) {
                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) ((Map.Entry) it12.next()).getValue();
                    if (juniorBankingProfile.f77104l != ij8.h.ACTIVE) {
                        juniorBankingProfile = null;
                    }
                    EsimGiftRecipient esimGiftRecipient = juniorBankingProfile != null ? new EsimGiftRecipient(juniorBankingProfile.f77103j, juniorBankingProfile.f77102h, juniorBankingProfile.f77101g, juniorBankingProfile.f77099b, juniorBankingProfile.f77100c, juniorBankingProfile.f) : null;
                    if (esimGiftRecipient != null) {
                        arrayList.add(esimGiftRecipient);
                    }
                }
                return arrayList;
            case 8:
                dej.b0 b0Var = (dej.b0) ((Pair) obj2).f186386b;
                if (b0Var.f113493a.isEmpty()) {
                    return null;
                }
                return b0Var;
            case 9:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Optional.ofNullable(zhm.d0.t0(it13, dfj.k0.f));
            case 10:
                Optional optionalInstallationState = (Optional) obj2;
                Intrinsics.checkNotNullParameter(optionalInstallationState, "optionalInstallationState");
                return (rd6.k) optionalInstallationState.map(new bpd.a(new x(11), 7)).orElse(iVar);
            case 11:
                o0 o0Var = (o0) obj2;
                Intrinsics.h(o0Var);
                Intrinsics.checkNotNullParameter(o0Var, "<this>");
                if ((o0Var instanceof dej.i0) || (o0Var instanceof dej.h0)) {
                    EsimProfileDetails esimProfileDetails2 = o0Var.a().f100426g;
                    iVar = new rd6.i(esimProfileDetails2 != null ? esimProfileDetails2.f100434b : null);
                } else if (!(o0Var instanceof m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return iVar;
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (((Boolean) pair.f186385a).booleanValue() && (((pej.a) pair.f186386b) instanceof a.C1306a)) ? new b39.a(b39.d.ESIM) : bVar;
            case 13:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return zhm.d0.P0(zhm.d0.E0((List) pair2.f186386b, (List) pair2.f186385a), new e1());
            case 14:
                t1 subscription = (t1) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                List list = subscription.I;
                return list == null ? zhm.f0.f322471a : list;
            case 15:
                whf.p transactionsContent = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                List list2 = transactionsContent.f297646a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(new r2((a3) it14.next(), transactionsContent.f297647b, transactionsContent.f297648c));
                }
                return arrayList2;
            case 16:
                List revPointsTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(revPointsTransactions, "revPointsTransactions");
                List list3 = revPointsTransactions;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it15 = list3.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(new s2(((r1) it15.next()).f201449a));
                }
                return arrayList3;
            case 17:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return (((Boolean) pair3.f186385a).booleanValue() && (((pej.a) pair3.f186386b) instanceof a.C1306a)) ? new b39.a(b39.d.MOBILE_PLANS) : bVar;
            case 18:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                t1 t1Var = (t1) pair4.f186385a;
                List list4 = (List) pair4.f186386b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list4) {
                    if (((c1) obj4).f != null) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it16 = arrayList4.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next2 = it16.next();
                        c1 c1Var = (c1) next2;
                        f1 f1Var = t1Var.G;
                        if (!Intrinsics.f(f1Var != null ? f1Var.f113531a : null, c1Var.f113504a) || !zhm.v.k(aVar, g1.b.f113538a).contains(c1Var.d)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                c1 c1Var2 = (c1) next2;
                if (c1Var2 != null) {
                    return c1Var2.f;
                }
                return null;
            case 19:
                List planOffers = (List) obj2;
                Intrinsics.checkNotNullParameter(planOffers, "planOffers");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : planOffers) {
                    c1 c1Var3 = (c1) obj5;
                    if (c1Var3.f != null && Intrinsics.f(c1Var3.d, aVar)) {
                        arrayList5.add(obj5);
                    }
                }
                return arrayList5;
            case 20:
                List esimProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : esimProfiles) {
                    EsimProfileLock esimProfileLock = ((EsimProfile) obj6).k;
                    if (esimProfileLock != null && esimProfileLock.f100447a && esimProfileLock.f100449c) {
                        arrayList6.add(obj6);
                    }
                }
                return arrayList6;
            case 21:
                List esimProfiles2 = (List) obj2;
                Intrinsics.checkNotNullParameter(esimProfiles2, "esimProfiles");
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : esimProfiles2) {
                    EsimProfileLock esimProfileLock2 = ((EsimProfile) obj7).k;
                    if (esimProfileLock2 != null && esimProfileLock2.d) {
                        arrayList7.add(obj7);
                    }
                }
                return arrayList7;
            case 22:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                return (((Boolean) pair5.f186385a).booleanValue() && (((pej.a) pair5.f186386b) instanceof a.C1306a)) ? new b39.a(b39.d.ESIM_REV_POINTS) : bVar;
            case 23:
                p3 response = (p3) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List list5 = response.f113617a;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : list5) {
                    t1 t1Var2 = ((d3) obj8).f113523a;
                    if (t1Var2.f113653g == dej.m.MOBILE_PLAN) {
                        Intrinsics.checkNotNullParameter(t1Var2, "<this>");
                        z1 z1Var = t1Var2.f113662s;
                        if ((z1Var != null ? z1Var.f113697a : null) == b2.ELIGIBLE) {
                            arrayList8.add(obj8);
                        }
                    }
                }
                return p3.a(response, arrayList8);
            case 24:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                Iterator it17 = terms.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        next3 = it17.next();
                        TermsScope termsScope = ((Terms) next3).f;
                        TermsScope.INSTANCE.getClass();
                        if (Intrinsics.f(termsScope, TermsScope.f90382t)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                Terms terms2 = (Terms) next3;
                String str = terms2 != null ? terms2.f90357c : null;
                if (str == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimTermsAndConditionsInteractorImpl", "Failed to fetch Revolut Terms URL", null, h0Var);
                }
                return new go.g(new Data(str == null ? "" : str, null, false, 6, null), 2);
            case 25:
                dej.i config = (dej.i) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return config.f113552a;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimTermsAndConditionsInteractorImpl", "Failed to fetch Partner Terms URL", null, h0Var2);
                return "";
            case 27:
                od0.i optionalPaymentMethod = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) optionalPaymentMethod.g();
                if (paymentMethod != null) {
                    PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) (!(paymentMethod instanceof PaymentMethod.Pocket) ? null : paymentMethod);
                    if (pocket != null) {
                        return new EsimUserPocket(pocket.f84376a, pocket, pocket.i);
                    }
                }
                throw new IllegalStateException(h30.l.r("Unable to get default pocket. Default payment method type is: ", paymentMethod != null ? edl.a.j(paymentMethod) : null));
            case 28:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                List list6 = (List) pair6.f186385a;
                xi0.b bVar2 = (xi0.b) pair6.f186386b;
                Iterator it18 = list6.iterator();
                while (true) {
                    if (it18.hasNext()) {
                        Object next4 = it18.next();
                        if (Intrinsics.f(((io3.d) next4).f163147c, bVar2.f306286a)) {
                            obj3 = next4;
                        }
                    }
                }
                io3.d dVar = (io3.d) obj3;
                if (dVar != null) {
                    return dVar;
                }
                throw new IllegalStateException(h30.l.r("Unable to find pocket of base currency: ", bVar2.f306286a));
            default:
                io3.d walletPocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(walletPocket, "walletPocket");
                return new EsimUserPocket(null, null, z92.f.j(walletPocket));
        }
    }

    public /* synthetic */ x(Object obj2, int i) {
        this.f113427a = i;
    }
}
