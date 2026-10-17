package vha;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import et6.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tfm.c4;
import tfm.f4;
import tfm.n4;
import tof.ua;
import tof.va;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f289427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final et6.u0 f289428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final et6.h1 f289429c;
    public final gr6.h d;
    public final wsg.n e;
    public final mt8.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final psi.a f289430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gr6.a f289431h;
    public final jf1.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gr6.m f289432j;
    public final jid.z k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wa7.m f289433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final et6.z f289434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f289435n;
    public final n4 o;

    public s(gr6.e freelancerAvailabilityInteractor, et6.u0 freelancerCapabilitiesInteractor, et6.h1 freelancerInteractor, gr6.h freelancerCashbackInteractor, wsg.n walletInteractor, mt8.d kycInteractor, psi.a comparator, gr6.a freelancerAccountDetailsInteractor, jf1.a proMerchantTogglesInteractor, gr6.m freelancerPocketsInteractor, jid.z delistedPocketsInteractor, wa7.m hiddenAccountsInteractor, et6.z acquiringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerCapabilitiesInteractor, "freelancerCapabilitiesInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(acquiringPaymentInteractor, "acquiringPaymentInteractor");
        this.f289427a = freelancerAvailabilityInteractor;
        this.f289428b = freelancerCapabilitiesInteractor;
        this.f289429c = freelancerInteractor;
        this.d = freelancerCashbackInteractor;
        this.e = walletInteractor;
        this.f = kycInteractor;
        this.f289430g = comparator;
        this.f289431h = freelancerAccountDetailsInteractor;
        this.i = proMerchantTogglesInteractor;
        this.f289432j = freelancerPocketsInteractor;
        this.k = delistedPocketsInteractor;
        this.f289433l = hiddenAccountsInteractor;
        this.f289434m = acquiringPaymentInteractor;
        j2 j2VarC = vkm.q.c(null);
        this.f289435n = j2VarC;
        agm.a aVarReplay = rd0.e.c(vkm.q.Q(new vkm.t0(j2VarC, 1), new vdl.c1((Continuation) null, this, 6)), kotlin.coroutines.g.f186406a).switchMap(new vf0.n(new ux7.i(1, this, s.class, "observePendingAmountForAllPockets", "observePendingAmountForAllPockets(Z)Lio/reactivex/Observable;", 0, 27), 28)).replay(1);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        efm.c0 c0Var = hhm.f.f152431c;
        aVarReplay.getClass();
        mfm.f.e(1, "subscriberCount");
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        this.o = new n4(aVarReplay instanceof c4 ? new f4(((c4) aVarReplay).f270387g) : aVarReplay, 5000L, timeUnit, c0Var);
    }

    public final efm.r a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        w4l.k kVarC = c8g.c.C(dataLoadingMode);
        vkm.d dVarB = rd0.e.b(pd.b.r(this.e.J(AccountId.Personal.f51414a, kVarC), new vgk.f(this, dataLoadingMode, 2)));
        akg.n nVarE = ((et6.y0) this.d).e(c8g.c.C(dataLoadingMode));
        vkm.d dVarD = ((et6.g) this.f289431h).d(c8g.c.C(dataLoadingMode));
        zfc.d dVar = (zfc.d) this.i;
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(nim.a.u(new a41.i1(this, (Continuation) null), nim.a.u(new tk9.i(2, 17, null), zh9.u0.m(zh9.u0.i(dVarB, nVarE, dVarD), zh9.u0.m(dVar.f321922a.r(Boolean.FALSE, new zfc.a(dVar, 1)), rd0.e.b(nim.a.w(this.f.a(false), new vgk.g(6))))))), kotlin.coroutines.g.f186406a);
    }

    public final efm.r b(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set states = kotlin.collections.d.y0(elements);
        w4l.k loadingStrategy = c8g.c.C(dataLoadingMode);
        i2 i2Var = (i2) this.f289432j;
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        final int i = 0;
        efm.r rVarR = pd.b.r(rd0.e.c(rd0.e.b(osg.b.c(i2Var.f129249c, loadingStrategy, states, io3.l.MERCHANT, io3.i.INTERNAL, null, 16)), kotlin.coroutines.g.f186406a), new Function1(this) { // from class: vha.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f289406b;

            {
                this.f289406b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List pockets = (List) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(pockets, "pockets");
                        return this.f289406b.k.d(pockets);
                    default:
                        Intrinsics.checkNotNullParameter(pockets, "pockets");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = pockets.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            s sVar = this.f289406b;
                            if (!zHasNext) {
                                return zhm.d0.P0(arrayList, sVar.f289430g);
                            }
                            Object next = it8.next();
                            io3.d dVar = (io3.d) next;
                            sVar.getClass();
                            io3.k kVar = io3.k.ACTIVE;
                            io3.k kVar2 = io3.k.DELISTED;
                            io3.k[] elements2 = {kVar, kVar2};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            Set setY0 = kotlin.collections.d.y0(elements2);
                            io3.k kVar3 = dVar.f;
                            if (setY0.contains(kVar3) || (!io3.h.e(dVar).k() && kVar3 == io3.k.INACTIVE)) {
                                String str = dVar.f163147c;
                                xi0.b.Companion.getClass();
                                if (!Intrinsics.f(str, xi0.b.f306279q.f306286a) || dVar.i != 0 || kVar3 == kVar2) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        return nim.a.w(rVarR, new Function1(this) { // from class: vha.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f289406b;

            {
                this.f289406b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List pockets = (List) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(pockets, "pockets");
                        return this.f289406b.k.d(pockets);
                    default:
                        Intrinsics.checkNotNullParameter(pockets, "pockets");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = pockets.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            s sVar = this.f289406b;
                            if (!zHasNext) {
                                return zhm.d0.P0(arrayList, sVar.f289430g);
                            }
                            Object next = it8.next();
                            io3.d dVar = (io3.d) next;
                            sVar.getClass();
                            io3.k kVar = io3.k.ACTIVE;
                            io3.k kVar2 = io3.k.DELISTED;
                            io3.k[] elements2 = {kVar, kVar2};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            Set setY0 = kotlin.collections.d.y0(elements2);
                            io3.k kVar3 = dVar.f;
                            if (setY0.contains(kVar3) || (!io3.h.e(dVar).k() && kVar3 == io3.k.INACTIVE)) {
                                String str = dVar.f163147c;
                                xi0.b.Companion.getClass();
                                if (!Intrinsics.f(str, xi0.b.f306279q.f306286a) || dVar.i != 0 || kVar3 == kVar2) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    public final efm.r c(Set accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Set set = accountId;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                String str = ((ProductAccountId) it8.next()).f89729a;
                t0.Companion.getClass();
                if (Intrinsics.f(str, t0.d)) {
                    return nim.a.w(b(sfe.a.FULL), new vgk.g(5));
                }
            }
        }
        if (accountId.size() == 1) {
            return te0.w.h(zi0.c.P(new ua(((ProductAccountId) zhm.d0.a0(accountId)).f89729a), false, null, 3));
        }
        Set set2 = accountId;
        ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            arrayList.add(((ProductAccountId) it9.next()).f89729a);
        }
        return te0.w.h(zi0.c.P(new va(zhm.d0.i1(arrayList)), false, null, 3));
    }
}
