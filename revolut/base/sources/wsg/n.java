package wsg;

import atg.t;
import atg.v;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import efm.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import org.joda.time.DateTime;
import s7a.m0;
import skm.e0;
import skm.p0;
import wim.z;
import wp5.x;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements osg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f299735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsg.b f299736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final atg.l f299737c;
    public final ppk.f d;
    public final ez5.b e;
    public final y91.b f;

    public n(ang.f userInteractor, qsg.b walletRepository, atg.l unitedWalletRepository, ppk.f ratesInteractor, fk3.a configurationInteractor, ez5.b customOrderInteractor, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletRepository, "walletRepository");
        Intrinsics.checkNotNullParameter(unitedWalletRepository, "unitedWalletRepository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(customOrderInteractor, "customOrderInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f299735a = userInteractor;
        this.f299736b = walletRepository;
        this.f299737c = unitedWalletRepository;
        this.d = ratesInteractor;
        this.e = customOrderInteractor;
        this.f = accountsProductFeatureChecker;
    }

    public static ArrayList G(String str, List list) {
        ArrayList arrayListF1 = d0.f1(list);
        a0.E(arrayListF1, new wb3.k(str, 29));
        Iterator it8 = arrayListF1.iterator();
        int size = 0;
        while (true) {
            if (!it8.hasNext()) {
                size = -1;
                break;
            }
            if (((io3.d) it8.next()).r() == io3.k.INACTIVE) {
                break;
            }
            size++;
        }
        if (size < 0) {
            size = arrayListF1.size();
        }
        ArrayList arrayList = new ArrayList(w.t(arrayListF1, 10));
        Iterator it9 = arrayListF1.iterator();
        while (it9.hasNext()) {
            arrayList.add(((io3.d) it9.next()).getId());
        }
        ArrayList arrayListF12 = d0.f1(arrayList);
        arrayListF12.add(size, str);
        return arrayListF12;
    }

    public static ArrayList H(String str, List list) {
        int iNextIndex;
        ArrayList arrayListF1 = d0.f1(list);
        a0.E(arrayListF1, new wb3.k(str, 28));
        ListIterator listIterator = arrayListF1.listIterator(arrayListF1.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((io3.d) listIterator.previous()).r() == io3.k.ACTIVE) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        ArrayList arrayList = new ArrayList(w.t(arrayListF1, 10));
        Iterator it8 = arrayListF1.iterator();
        while (it8.hasNext()) {
            arrayList.add(((io3.d) it8.next()).getId());
        }
        ArrayList arrayListF12 = d0.f1(arrayList);
        arrayListF12.add(iNextIndex + 1, str);
        return arrayListF12;
    }

    public static io3.g I(io3.d dVar, List list, io3.d dVar2, xi0.b bVar) {
        Object next;
        if (Intrinsics.f(dVar.getCurrency(), bVar.f306286a)) {
            dj0.d dVarE = io3.h.e(dVar);
            dj0.d dVarE2 = io3.h.e(dVar);
            long jH = dVar.h();
            xi0.a aVar = xi0.b.Companion;
            String currency = dVar.getCurrency();
            aVar.getClass();
            return new io3.g(dVar, dVarE, pyd.c.O(dVarE2, new dj0.d(jH, xi0.a.a(currency))), 12);
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar2 = (n9l.a) next;
            if (Intrinsics.f(aVar2.b().f306286a, dVar.getCurrency()) && Intrinsics.f(aVar2.d(), bVar)) {
                break;
            }
        }
        n9l.a aVar3 = (n9l.a) next;
        long jD = dVar.d() + (dVar2 != null ? dVar2.d() : 0L);
        xi0.a aVar4 = xi0.b.Companion;
        String currency2 = dVar.getCurrency();
        aVar4.getClass();
        dj0.d dVar3 = new dj0.d(jD, xi0.a.a(currency2));
        return new io3.g(io3.d.a(dVar, null, null, jD, null, 8388351), aVar3 != null ? new dj0.d(pyd.c.J(dVar3, aVar3.c(), aVar3.d()), bVar) : null, aVar3 != null ? new dj0.d(pyd.c.J(pyd.c.O(dVar3, new dj0.d(dVar.h(), xi0.a.a(dVar.getCurrency()))), aVar3.c(), aVar3.d()), bVar) : null, 12);
    }

    public static w4l.k q0(boolean z) {
        return z ? w4l.i.f294643c : w4l.h.f294642c;
    }

    public final DateTime A(xi0.b currency, AccountId accountId) {
        Long l2;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Map mapE = vVar.e(accountId);
        if (mapE == null || (l2 = (Long) mapE.get(currency.f306286a)) == null) {
            return null;
        }
        return new DateTime(l2.longValue());
    }

    public final efm.d0 B(List pockets, xi0.b baseCurrency, List exchangeRates, boolean z) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(z ? nim.a.w(osg.b.e(this, false, io3.l.VESTING, null, null, null, null, null, 124), new v77.a(pockets, 16)) : zi0.c.j(r0.g()), new apd.c(pockets, this, exchangeRates, baseCurrency)), null, new e(1), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final efm.d0 C() {
        efm.d0 d0VarFirstOrError = m70.a.g(this.f299737c.a(), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final fo3.c D(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Pair pairG = ((atg.h) vVar.e).g(accountId);
        fo3.c cVar = pairG != null ? (fo3.c) ue8.c.E(pairG).f186385a : null;
        if (cVar != null) {
            return cVar;
        }
        throw new NoSuchElementException("No default wallet found for the user:".concat(accountId.getClass().getName()));
    }

    public final ufm.i E(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarFirstOrError = m70.a.g(X(accountId, w4l.h.f294642c), null, new e(0), 1).firstOrError();
        x xVar = new x(new a(1), 19);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, xVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.d0 F(AccountId account, boolean z) {
        Intrinsics.checkNotNullParameter(account, "account");
        efm.d0 d0VarFirstOrError = m70.a.e(X(account, z ? w4l.i.f294643c : w4l.h.f294642c), new e(14), new wm9.k(26)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final r J(AccountId accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.w(X(accountId, loadingStrategy), new a(8));
    }

    public final r K(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.r(W(accountId), new i(this, accountId, 1));
    }

    public final r L(String id10, AccountId accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(S(loadingStrategy, d0.i1(io3.k.a()), null, null, accountId), new wb3.k(id10, 23));
    }

    public final r M(w4l.k loadingStrategy, io3.l lVar, io3.k kVar, io3.i iVar, io3.j jVar, qsg.a order, AccountId accountId) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.w(((v) this.f299736b).h(accountId, loadingStrategy), new krl.m(this, order, accountId, lVar, kVar, jVar, iVar, 15));
    }

    public final r N(boolean z, io3.l lVar, io3.k kVar, io3.i iVar, io3.j jVar, qsg.a order, AccountId accountId) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return M(z ? w4l.i.f294643c : w4l.h.f294642c, lVar, kVar, iVar, jVar, order, accountId);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[LOOP:0: B:23:0x0089->B:25:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r O(java.util.List r11, boolean r12, xi0.b r13) {
        /*
            r10 = this;
            java.lang.String r0 = "pockets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "baseCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1b
            goto L7a
        L1b:
            java.util.Iterator r1 = r0.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r1.next()
            io3.d r2 = (io3.d) r2
            java.lang.String r2 = r2.getCurrency()
            java.lang.String r3 = r13.f306286a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            if (r2 != 0) goto L1f
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            io3.d r2 = (io3.d) r2
            java.lang.String r3 = r2.getCurrency()
            java.lang.String r4 = r13.f306286a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 != 0) goto L6b
            xi0.a r3 = xi0.b.Companion
            java.lang.String r2 = r2.getCurrency()
            r3.getClass()
            xi0.b r2 = xi0.a.a(r2)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r13)
            goto L6c
        L6b:
            r3 = 0
        L6c:
            if (r3 == 0) goto L40
            r1.add(r3)
            goto L40
        L72:
            ppk.f r0 = r10.d
            efm.r r12 = r0.b(r1, r12)
            r3 = r13
            goto Laa
        L7a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r0, r1)
            r12.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r0.next()
            io3.d r1 = (io3.d) r1
            n9l.a r2 = new n9l.a
            r8 = 0
            r9 = 0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7 = 0
            r4 = r13
            r3 = r13
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r12.add(r2)
            goto L89
        La5:
            r3 = r13
            efm.r r12 = zi0.c.j(r12)
        Laa:
            java.util.Map r13 = zhm.r0.g()
            efm.r r13 = zi0.c.j(r13)
            efm.r r12 = le.u1.d(r13, r12)
            efm.r r12 = mif.e0.h(r12)
            c9h.a r13 = new c9h.a
            r0 = 10
            r13.<init>(r11, r10, r3, r0)
            efm.r r11 = nim.a.w(r12, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wsg.n.O(java.util.List, boolean, xi0.b):efm.r");
    }

    public final r P() {
        r rVarSwitchMap = u(w4l.h.f294642c).switchMap(new x(new d(this, 0), 13));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final r Q(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r map = vVar.n(walletId, loadingStrategy).map(new a08.r(5, new t(walletId, walletId, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r R() {
        return this.f299737c.a();
    }

    public final r S(w4l.k loadingStrategy, Set pocketStates, io3.l lVar, io3.i iVar, AccountId accountId) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(pocketStates, "states");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(pocketStates, "pocketStates");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.w(nim.a.w(vVar.d(accountId, loadingStrategy), new a83.d0(5, pocketStates)), new wp5.v(lVar, iVar, 16));
    }

    public final r T(Function1 function1, dz5.b bVar, boolean z) {
        return pd.b.s(nim.a.w(osg.b.e(this, z, null, null, io3.i.INTERNAL, null, null, null, 102), new v1.m(9, function1)), new wp5.v(this, bVar, 15));
    }

    public final r U(AccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vVar.k.f(accountId, z);
    }

    public final r V() {
        return this.f.d() ? pd.b.s(nim.a.w(osg.b.e(this, false, null, null, io3.i.EXTERNAL, null, null, null, 102), new a(2)), new d(this, 1)) : te0.w.h(new Data(f0.f322471a, null, false, 6, null));
    }

    public final r W(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return X(accountId, w4l.h.f294642c);
    }

    public final r X(AccountId accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return ((v) this.f299736b).i(accountId, loadingStrategy);
    }

    public final r Y(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((v) this.f299736b).j(walletId, loadingStrategy);
    }

    public final r Z(String ownerId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(vVar.l(ownerId, loadingStrategy), new arf.h(19));
    }

    public final r a0(String userId, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return pd.b.r(nim.a.w(osg.b.q(this, z), new wb3.k(userId, 26)), new h(this, z, 0));
    }

    public final r b0(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        r rVarSwitchMap = u(w4l.h.f294642c).switchMap(new x(new g(this, walletId, 0), 15));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final r c0(String userId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return nim.a.w(d0(str, q0(z)), new wb3.k(userId, 25));
    }

    public final r d0(String str, w4l.k loadingStrategy) {
        r rVarU;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (str == null || (rVarU = r.just(str)) == null) {
            rVarU = u(loadingStrategy);
            Intrinsics.checkNotNullExpressionValue(rVarU, "currentRegisteredIdentityId(...)");
        }
        r rVarSwitchMap = rVarU.switchMap(new x(new c(this, loadingStrategy, 0), 12));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final r e0(String ownerId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((v) this.f299736b).l(ownerId, loadingStrategy);
    }

    public final r f0(boolean z) {
        r rVarSwitchMap = u(q0(z)).switchMap(new x(new h(this, z, 1), 22));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final r g0(fo3.d walletIdentityType, w4l.k loadingStrategy, Set set) {
        Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarM = ((v) this.f299736b).m(walletIdentityType, loadingStrategy);
        return set == null ? rVarM : nim.a.w(rVarM, new m0(19, set));
    }

    public final r h0(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarSwitchMap = u(loadingStrategy).switchMap(new x(new c(this, loadingStrategy, 1), 18));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final pfm.a i0(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i = 0;
        pfm.a aVar = new pfm.a(vVar.c(accountId), new atg.n(i, new atg.m(vVar, i)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b j0(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vVar.k.g(accountId, false);
    }

    public final pfm.a k0(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i = 5;
        pfm.a aVar = new pfm.a(vVar.c(accountId), new atg.n(i, new atg.m(vVar, i)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b l0(boolean z) {
        return ((atg.h) ((v) this.f299736b).e).f.g(Unit.f186387a, z);
    }

    public final pfm.a m0(boolean z) {
        efm.d0 d0VarFirstOrError = u(w4l.h.f294642c).firstOrError();
        k kVar = new k(new h(this, z, 2), 0);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, kVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.r n0(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        DateTime dateTimeNow = DateTime.now();
        v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        pfm.h hVar = new pfm.h(new aed.d(vVar, accountId, dateTimeNow, currency, 2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return te0.w.g0(hVar);
    }

    public final pfm.r o0(final long j2, final String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        final v vVar = (v) this.f299736b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        final AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        pfm.n nVar = new pfm.n(new Callable() { // from class: atg.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xe0.e eVar = vVar.f9079c;
                v.Companion.getClass();
                AccountId accountId2 = accountId;
                String strB = r.b(accountId2, "LATEST_TOPUP_AMOUNT");
                Type type = l21.d.f191610a.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Map linkedHashMap = (Map) eVar.T2(strB, type);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(currency, Long.valueOf(j2));
                eVar.G(linkedHashMap, r.b(accountId2, "LATEST_TOPUP_AMOUNT"), z.d(o0.f186429a.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(Long.TYPE))))));
                return Unit.f186387a;
            }
        }, 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return te0.w.g0(nVar);
    }

    public final List p0(Iterable iterable, qsg.a aVar, AccountId accountId) {
        int i = l.f299734a[aVar.ordinal()];
        if (i == 1) {
            return d0.d1(iterable);
        }
        if (i == 2) {
            return d0.P0(iterable, new m());
        }
        if (i == 3) {
            return d0.P0(iterable, new oh3.e(this, accountId, 27));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object t(fo3.g gVar, aie.v vVar) throws Throwable {
        ald.l lVar = new ald.l((v) this.f299736b, gVar, null, 13);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, lVar, vVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final r u(w4l.k kVar) {
        akg.n nVarJ = this.f299735a.j(kVar);
        p0 p0Var = p0.f264001a;
        return m70.a.g(rd0.e.c(nVarJ, qk.d.h()), null, new e(13), 1).map(new k(new a(9), 2));
    }

    public final pfm.z v(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarR = osg.b.r(this, currency, io3.l.CURRENT, io3.i.INTERNAL, accountId, 20);
        x xVar = new x(new a(5), 26);
        d0VarR.getClass();
        ufm.i iVar = new ufm.i(d0VarR, xVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, h0.f322473a, new a(6));
    }

    public final efm.d0 w(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v vVar = (v) this.f299736b;
        sfm.b bVarG = ue0.e.v(((atg.h) vVar.e).f.g(Unit.f186387a, true)).g(vVar.i(accountId, w4l.j.f294644c));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        efm.d0 d0VarFirstOrError = m70.a.e(bVarG, new e(6), new e(7)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.i x(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarFirstOrError = m70.a.g(X(accountId, w4l.h.f294642c), null, new e(12), 1).firstOrError();
        k kVar = new k(new a(7), 1);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, kVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i y(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarFirstOrError = m70.a.g(W(accountId), null, new e(5), 1).firstOrError();
        x xVar = new x(new i(this, accountId, 0), 27);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, xVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.d0 z(AccountId accountId, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarFirstOrError = m70.a.g(osg.b.s(this, id10, accountId, 4), null, new wm9.k(29), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
