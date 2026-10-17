package s6e;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.api.FreelancerApi$Toggles;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import fmb.t0;
import g48.r0;
import h6e.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import vkm.v1;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements g6e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f260322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f260323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f260324c;
    public final xua.a d;
    public final o6e.b e;
    public final j0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f260325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t6e.d f260326h;
    public final t6e.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nd.p f260327j;
    public final xvh.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g6e.b f260328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final eli.j f260329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qd0.b f260330n;
    public final l80.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f260331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y91.b f260332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gr6.e f260333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f260334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p38.a f260335t;

    public z(gte.a featureTogglesInteractor, ppg.b vaultsInteractor, l93.f revolutCardsInteractor, xua.a recurringPaymentInteractor, o6e.b subaccountsRepository, j0 transactionFilterProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, t6e.d balanceCalculator, t6e.m estimatedSpendCalculator, nd.p paymentsFilterDelegate, xvh.c autoInvestInteractor, g6e.b subaccountBackgroundInteractor, eli.j twoFaErrorHandler, qd0.b languageProvider, l80.e dateProvider, wsg.n walletInteractor, y91.b accountsProductFeatureChecker, gr6.e freelancerAvailabilityInteractor, r0 jointAccountsInteractor, p38.a jointAccountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(featureTogglesInteractor, "featureTogglesInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(subaccountsRepository, "subaccountsRepository");
        Intrinsics.checkNotNullParameter(transactionFilterProvider, "transactionFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(balanceCalculator, "balanceCalculator");
        Intrinsics.checkNotNullParameter(estimatedSpendCalculator, "estimatedSpendCalculator");
        Intrinsics.checkNotNullParameter(paymentsFilterDelegate, "paymentsFilterDelegate");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        this.f260322a = featureTogglesInteractor;
        this.f260323b = vaultsInteractor;
        this.f260324c = revolutCardsInteractor;
        this.d = recurringPaymentInteractor;
        this.e = subaccountsRepository;
        this.f = transactionFilterProvider;
        this.f260325g = transactionsInteractor;
        this.f260326h = balanceCalculator;
        this.i = estimatedSpendCalculator;
        this.f260327j = paymentsFilterDelegate;
        this.k = autoInvestInteractor;
        this.f260328l = subaccountBackgroundInteractor;
        this.f260329m = twoFaErrorHandler;
        this.f260330n = languageProvider;
        this.o = dateProvider;
        this.f260331p = walletInteractor;
        this.f260332q = accountsProductFeatureChecker;
        this.f260333r = freelancerAvailabilityInteractor;
        this.f260334s = jointAccountsInteractor;
        this.f260335t = jointAccountsProductFeatureChecker;
    }

    public static Subaccount A(pcd.s sVar) {
        switch (h.f260282b[sVar.e.ordinal()]) {
            case 1:
                int i = h.f260281a[sVar.f234889n.ordinal()];
                if (i == 1 || i == 2) {
                    return new Subaccount.Personal(sVar);
                }
                if (i == 3) {
                    return new Subaccount.Teen(sVar);
                }
                if (i == 4) {
                    return new Subaccount.Junior(sVar);
                }
                if (i == 5) {
                    return new Subaccount.Joint(sVar);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                return new Subaccount.Group(sVar);
            case 3:
                return new Subaccount.Pro(sVar);
            case 4:
                return new Subaccount.ProTax(sVar);
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalArgumentException("Can not map " + sVar.e + " vault to subaccount");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ArrayList B(List list) {
        Set setB;
        pcd.d0 b0Var;
        List<h6e.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (h6e.a aVar : list2) {
            if (aVar.f149621b) {
                pcd.y[] elements = {pcd.y.CONTRIBUTE, pcd.y.WITHDRAW};
                Intrinsics.checkNotNullParameter(elements, "elements");
                setB = kotlin.collections.d.y0(elements);
            } else {
                setB = y0.b(pcd.y.CONTRIBUTE);
            }
            zm3.l lVar = aVar.f149620a;
            if (lVar instanceof zm3.i) {
                b0Var = new pcd.c0(((zm3.i) lVar).f323351b, setB);
            } else {
                if (!(lVar instanceof zm3.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                b0Var = new pcd.b0(((zm3.j) lVar).f, setB);
            }
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    public static final akg.n c(z zVar) {
        r0 r0Var = zVar.f260334s;
        return nim.a.v(u0.m(n14.k.p(((c48.g) r0Var.f140406c).f21116n.b(Unit.f186387a, w4l.h.f294642c), new s65.r(22)), rd0.e.e(new t0(r0Var.r(), 1), zhm.h0.f322473a, new qtb.o(3, 19, (Continuation) null))), new s65.r(zVar, 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (nim.a.a(r13, r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(gim.c r13, java.lang.String r14, java.util.List r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.C(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    @Override // c61.a
    public final efm.r a() {
        return rd0.e.c(new v(mo3.a.g(w(f.e.f149640a, w4l.h.f294642c), null, new s6d.r(2), 1), this, 0), kotlin.coroutines.g.f186406a);
    }

    public final Object d(String id10, gim.c cVar) {
        ypg.p pVar = (ypg.p) this.f260323b;
        Intrinsics.checkNotNullParameter(id10, "id");
        Object objA = nim.a.a(((eed.n) pVar.f).b(id10), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object e(SubaccountType subaccountType, String str, String str2, xi0.b bVar, List list, String str3, gim.i iVar) {
        pcd.l0 l0Var;
        if (bVar == null) {
            throw new IllegalStateException("Currency can not be null");
        }
        if (subaccountType.equals(SubaccountType.Personal.f88963a)) {
            l0Var = pcd.l0.REGULAR;
        } else if (subaccountType.equals(SubaccountType.Pro.f88964a)) {
            l0Var = pcd.l0.PRO_REGULAR;
        } else if (subaccountType.equals(SubaccountType.ProTax.f88965a)) {
            l0Var = pcd.l0.PRO_TAX;
        } else if (subaccountType.equals(SubaccountType.Joint.f88961a)) {
            l0Var = pcd.l0.REGULAR;
        } else if (subaccountType.equals(SubaccountType.Group.f88960a)) {
            l0Var = pcd.l0.GROUP;
        } else {
            if (!subaccountType.equals(SubaccountType.Junior.f88962a) && !subaccountType.equals(SubaccountType.Teen.f88966a)) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = pcd.l0.REGULAR;
        }
        return x(str, bVar, list, str2, l0Var, str3, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (nim.a.a(r0, r1) != r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r14, qua.p r15, gim.c r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.f(java.lang.String, qua.p, gim.c):java.lang.Object");
    }

    public final v1 g() {
        return new v1(new j(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s6e.k
            if (r0 == 0) goto L13
            r0 = r6
            s6e.k r0 = (s6e.k) r0
            int r1 = r0.f260293w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260293w = r1
            goto L18
        L13:
            s6e.k r0 = new s6e.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260293w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f260293w = r3
            com.revolut.feature.subaccount.api.models.SubaccountType$Group r6 = com.revolut.feature.subaccount.api.models.SubaccountType.Group.f88960a
            java.lang.Object r6 = r4.j(r5, r6, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = "null cannot be cast to non-null type com.revolut.feature.subaccount.api.models.Subaccount.Group"
            kotlin.jvm.internal.Intrinsics.i(r6, r5)
            com.revolut.feature.subaccount.api.models.Subaccount$Group r6 = (com.revolut.feature.subaccount.api.models.Subaccount.Group) r6
            pcd.s r5 = r6.f88953a
            java.util.List r5 = r5.k
            if (r5 == 0) goto L4b
            return r5
        L4b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.h(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(xvh.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s6e.l
            if (r0 == 0) goto L13
            r0 = r6
            s6e.l r0 = (s6e.l) r0
            int r1 = r0.f260296w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260296w = r1
            goto L18
        L13:
            s6e.l r0 = new s6e.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260296w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            xvh.c r6 = r4.k
            b6d.r r6 = (b6d.r) r6
            ufm.i r5 = r6.g(r5)
            r0.f260296w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.i(xvh.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x011d, code lost:
    
        if (r7 == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, com.revolut.feature.subaccount.api.models.SubaccountType r6, gim.c r7) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.j(java.lang.String, com.revolut.feature.subaccount.api.models.SubaccountType, gim.c):java.lang.Object");
    }

    public final aim.o k() {
        aim.o oVar = new aim.o();
        if (this.f260332q.a("REVOLUT_CARD.link_to_pocket")) {
            oVar.add(SubaccountType.Personal.f88963a);
            oVar.add(SubaccountType.Joint.f88961a);
            et6.l0 l0Var = (et6.l0) this.f260333r;
            if (((jte.d) l0Var.f129264b).c(FreelancerApi$Toggles.ProPocketCardLinking.f73168c) && l0Var.b("FREELANCER_POCKETS.regular_pocket")) {
                oVar.add(SubaccountType.Pro.f88964a);
            }
        }
        return y0.a(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s6e.n
            if (r0 == 0) goto L13
            r0 = r7
            s6e.n r0 = (s6e.n) r0
            int r1 = r0.f260301w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260301w = r1
            goto L18
        L13:
            s6e.n r0 = new s6e.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260301w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L76
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            vkm.d r7 = r5.u(r6)
            s6e.f r2 = new s6e.f
            r4 = 0
            r2.<init>(r5, r4)
            kotlinx.coroutines.flow.Flow r7 = boh.f.e(r7, r2)
            efm.r r2 = r5.p(r6)
            vkm.d r2 = rd0.e.b(r2)
            xua.a r4 = r5.d
            yua.q r4 = (yua.q) r4
            sfm.b r6 = r4.r(r6)
            vkm.d r6 = rd0.e.b(r6)
            akg.n r6 = zh9.u0.i(r7, r2, r6)
            s6e.f r7 = new s6e.f
            r2 = 1
            r7.<init>(r5, r2)
            akg.n r6 = nim.a.v(r6, r7)
            s6d.r r7 = new s6d.r
            r2 = 4
            r7.<init>(r2)
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r7, r3)
            r0.f260301w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L7f
            boolean r6 = r7.booleanValue()
            goto L80
        L7f:
            r6 = 0
        L80:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.l(java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow m(Set subaccountIds) {
        Intrinsics.checkNotNullParameter(subaccountIds, "subaccountIds");
        if (subaccountIds.isEmpty()) {
            return new go.g(new Data(zhm.r0.g(), null, false, 6, null), 2);
        }
        Continuation continuation = null;
        return vkm.q.Q(new v1(new rhl.b(this, subaccountIds, continuation, 18)), new om4.r0(continuation, this, subaccountIds, 29));
    }

    public final sfm.b n(AccountId accountId) {
        ufm.i iVarE = this.f260331p.E(accountId);
        o function = o.f260302a;
        Intrinsics.checkNotNullParameter(function, "function");
        ufm.i iVar = new ufm.i(iVarE, new nd.o(), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        sfm.b bVar = new sfm.b(iVar, new s65.o(new ro7.n(this, 8), 5), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final vkm.d o(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(nim.a.w(((ypg.p) this.f260323b).l(loadingStrategy, pcd.g.f234858b), new s65.r(this, 28)));
    }

    public final efm.r p(String subaccountId) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        efm.r rVarSwitchMap = rd0.e.c(new v1(new qg7.p(this, subaccountId, null)), kotlin.coroutines.g.f186406a).switchMap(new s65.o(new e(this, subaccountId, 0), 4));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final v1 q(String subaccountId) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        return new v1(new s(this, subaccountId, null));
    }

    public final Flow r() {
        aim.o oVarK = k();
        return oVarK.f5338a.isEmpty() ? new go.g(zhm.r0.g(), 2) : new v1(new t(this, oVarK, null));
    }

    public final efm.r s(String subaccountId, xi0.b currency, jli.c paymentPeriod) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentPeriod, "paymentPeriod");
        efm.r map = m70.a.g(p(subaccountId), null, new s6d.r(5), 1).map(new s65.o(new s06.e(this, 3, paymentPeriod, currency), 7)).map(new s65.o(new f(this, 2), 8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Flow t(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        boolean z = subaccount instanceof Subaccount.Pro;
        od0.i iVar = od0.i.f224256b;
        ppg.b bVar = this.f260323b;
        if (z) {
            et6.l0 l0Var = (et6.l0) this.f260333r;
            if (((jte.d) l0Var.f129264b).c(FreelancerApi$Toggles.ProPocketSpareChange.f73169c) && l0Var.b("FREELANCER_POCKETS.regular_pocket")) {
                return rd0.e.b(nim.a.w(((ypg.p) bVar).k(((Subaccount.Pro) subaccount).f88957a.f234881a), new s65.r(24)));
            }
            od0.i.Companion.getClass();
            return new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        if ((subaccount instanceof Subaccount.ProTax) || (subaccount instanceof Subaccount.Teen)) {
            od0.i.Companion.getClass();
            return new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        if (!(subaccount instanceof Subaccount.Group) && !(subaccount instanceof Subaccount.Personal) && !(subaccount instanceof Subaccount.Junior) && !(subaccount instanceof Subaccount.Joint)) {
            throw new NoWhenBranchMatchedException();
        }
        return rd0.e.b(nim.a.w(((ypg.p) bVar).k(subaccount.getF88959a().f234881a), new s65.r(25)));
    }

    public final vkm.d u(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return rd0.e.b(nim.a.w(((ypg.p) this.f260323b).i(id10), new g(this, 4)));
    }

    public final vkm.d v(String id10, SubaccountType type) {
        efm.r rVarW;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean zF = Intrinsics.f(type, SubaccountType.Personal.f88963a);
        ppg.b bVar = this.f260323b;
        if (zF) {
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new s65.r(20));
        } else if (Intrinsics.f(type, SubaccountType.Group.f88960a)) {
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new s65.r(27));
        } else if (Intrinsics.f(type, SubaccountType.Pro.f88964a)) {
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new s65.r(29));
        } else if (Intrinsics.f(type, SubaccountType.ProTax.f88965a)) {
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new g(0));
        } else if (type instanceof SubaccountType.Joint) {
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new g(1));
        } else if (type instanceof SubaccountType.Junior) {
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new g(2));
        } else {
            if (!(type instanceof SubaccountType.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarW = nim.a.w(((ypg.p) bVar).i(id10), new g(3));
        }
        return rd0.e.b(rVarW);
    }

    public final akg.n w(h6e.f filter, w4l.k loadingStrategy) {
        efm.r rVarW;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        boolean z = filter instanceof f.e;
        ppg.b bVar = this.f260323b;
        if (z) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.REGULAR)), new s65.r(12));
        } else if (filter instanceof f.c) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.GROUP)), new s65.r(13));
        } else if (filter instanceof f.C0861f) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.PRO_REGULAR)), new s65.r(14));
        } else if (filter instanceof f.g) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.PRO_TAX)), new s65.r(15));
        } else if (filter instanceof f.b) {
            rVarW = zi0.c.j(zhm.f0.f322471a);
        } else if (filter instanceof h6e.g) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.REGULAR, new pcd.l(((h6e.g) filter).f149643a))), new s65.r(16));
        } else if (filter instanceof f.d) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.REGULAR, j.c.f234866a)), new s65.r(17));
        } else if (filter instanceof h6e.h) {
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.REGULAR, new pcd.k(((h6e.h) filter).f149644a))), new s65.r(18));
        } else {
            if (!Intrinsics.f(filter, f.a.f149636a)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarW = nim.a.w(((ypg.p) bVar).l(loadingStrategy, new pcd.f(pcd.l0.REGULAR, j.b.f234865a)), new s65.r(19));
        }
        return nim.a.v(rd0.e.b(rVarW), new s65.r(21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r18, xi0.b r19, java.util.List r20, java.lang.String r21, pcd.l0 r22, java.lang.String r23, gim.c r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof s6e.x
            if (r2 == 0) goto L17
            r2 = r1
            s6e.x r2 = (s6e.x) r2
            int r3 = r2.f260318y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f260318y = r3
            goto L1c
        L17:
            s6e.x r2 = new s6e.x
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f260316w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f260318y
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L3f
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            com.revolut.feature.subaccount.api.models.Subaccount r2 = r2.v
            yhm.o.b(r1)
            return r2
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            goto L89
        L3f:
            yhm.o.b(r1)
            pcd.u r8 = new pcd.u
            if (r20 == 0) goto L4c
            java.util.ArrayList r1 = B(r20)
            r12 = r1
            goto L4d
        L4c:
            r12 = r7
        L4d:
            r15 = 0
            r16 = 64
            r11 = 0
            r9 = r18
            r10 = r19
            r13 = r22
            r14 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            ppg.b r1 = r0.f260323b
            ypg.p r1 = (ypg.p) r1
            java.lang.String r4 = "vaultCreate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            odd.a r1 = r1.f
            eed.n r1 = (eed.n) r1
            ufm.i r1 = r1.c(r8)
            eli.j r4 = r0.f260329m
            eli.a r4 = sjg.a.a(r4)
            efm.d0 r1 = r1.g(r4)
            java.lang.String r4 = "compose(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r4 = r21
            r2.u = r4
            r2.f260318y = r6
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L89
            goto Lc3
        L89:
            pcd.s r1 = (pcd.s) r1
            kotlin.jvm.internal.Intrinsics.h(r1)
            com.revolut.feature.subaccount.api.models.Subaccount r1 = A(r1)
            if (r4 == 0) goto Lc4
            r2.u = r7
            r2.v = r1
            r2.f260318y = r5
            g6e.b r5 = r0.f260328l
            s6e.d r5 = (s6e.d) r5
            pcd.s r6 = r1.getF88959a()
            java.lang.String r6 = r6.f234881a
            com.revolut.feature.subaccount.api.models.SubaccountType r7 = r1.c()
            xi0.b r8 = r1.getCurrency()
            r23 = r2
            r22 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            java.lang.Object r2 = r18.e(r19, r20, r21, r22, r23)
            if (r2 != r3) goto Lbf
            goto Lc1
        Lbf:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lc1:
            if (r2 != r3) goto Lc4
        Lc3:
            return r3
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.z.x(java.lang.String, xi0.b, java.util.List, java.lang.String, pcd.l0, java.lang.String, gim.c):java.lang.Object");
    }

    public final efm.b y(SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        efm.b bVarP = efm.b.p(((ypg.p) this.f260323b).o(Intrinsics.f(subaccountType, SubaccountType.Joint.f88961a) ? pcd.b.PERSONAL_JOINT : pcd.b.PERSONAL, true), ((yua.q) this.d).t(true));
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        return bVarP;
    }

    public final Object z(SubaccountType subaccountType, gim.c cVar) {
        boolean zEquals = subaccountType.equals(SubaccountType.Personal.f88963a);
        ppg.b bVar = this.f260323b;
        if (zEquals) {
            Object objA = nim.a.a(((ypg.p) bVar).o(pcd.b.PERSONAL, false), cVar);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        if (subaccountType.equals(SubaccountType.Group.f88960a)) {
            Object objA2 = nim.a.a(((ypg.p) bVar).o(pcd.b.PERSONAL, false), cVar);
            return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
        }
        if (subaccountType.equals(SubaccountType.Pro.f88964a)) {
            Object objA3 = nim.a.a(((ypg.p) bVar).o(pcd.b.PERSONAL, false), cVar);
            return objA3 == fim.a.COROUTINE_SUSPENDED ? objA3 : Unit.f186387a;
        }
        if (subaccountType.equals(SubaccountType.ProTax.f88965a)) {
            Object objA4 = nim.a.a(((ypg.p) bVar).o(pcd.b.PERSONAL, false), cVar);
            return objA4 == fim.a.COROUTINE_SUSPENDED ? objA4 : Unit.f186387a;
        }
        if (subaccountType instanceof SubaccountType.Joint) {
            Object objA5 = nim.a.a(((ypg.p) bVar).o(pcd.b.PERSONAL_JOINT, false), cVar);
            return objA5 == fim.a.COROUTINE_SUSPENDED ? objA5 : Unit.f186387a;
        }
        if (subaccountType instanceof SubaccountType.Junior) {
            Object objA6 = nim.a.a(((ypg.p) bVar).o(pcd.b.YOUTH, false), cVar);
            return objA6 == fim.a.COROUTINE_SUSPENDED ? objA6 : Unit.f186387a;
        }
        if (!(subaccountType instanceof SubaccountType.Teen)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objA7 = nim.a.a(((ypg.p) bVar).o(pcd.b.PERSONAL_UNDER_18, false), cVar);
        return objA7 == fim.a.COROUTINE_SUSPENDED ? objA7 : Unit.f186387a;
    }
}
