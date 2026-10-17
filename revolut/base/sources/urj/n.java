package urj;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.overview.GoalsOverviewScreenContract$InputData;
import g48.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import tof.i3;
import vkm.j2;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends oki.h implements e {
    public final r0 A;
    public final ge3.a B;
    public final l5i.q C;
    public final z1 D;
    public final y E;
    public final GoalsOverviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pzi.a f282337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pzi.b f282338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final grj.j f282339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ge3.e f282340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wsg.n f282341t;
    public final tzi.a u;
    public final mrj.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final srj.c f282342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final thf.c f282343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l80.e f282344y;
    public final ang.f z;

    public n(GoalsOverviewScreenContract$InputData inputData, pzi.a budgetOverviewInteractor, pzi.b budgetingInteractor, grj.j jointBudgetingDataSynchronizer, ge3.e transactionCategorisationInteractor, wsg.n walletInteractor, tzi.a budgetingCycleInteractor, mrj.a spentAmountsLoader, srj.c categoryBudgetOverviewFactory, thf.c categoryResourcesMapper, l80.e dateProvider, ang.f userInteractor, r0 jointAccountInteractor, ge3.a analyticsPocketsInteractor, l5i.q analyticsTransactionsInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(jointBudgetingDataSynchronizer, "jointBudgetingDataSynchronizer");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        Intrinsics.checkNotNullParameter(spentAmountsLoader, "spentAmountsLoader");
        Intrinsics.checkNotNullParameter(categoryBudgetOverviewFactory, "categoryBudgetOverviewFactory");
        Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f282337p = budgetOverviewInteractor;
        this.f282338q = budgetingInteractor;
        this.f282339r = jointBudgetingDataSynchronizer;
        this.f282340s = transactionCategorisationInteractor;
        this.f282341t = walletInteractor;
        this.u = budgetingCycleInteractor;
        this.v = spentAmountsLoader;
        this.f282342w = categoryBudgetOverviewFactory;
        this.f282343x = categoryResourcesMapper;
        this.f282344y = dateProvider;
        this.z = userInteractor;
        this.A = jointAccountInteractor;
        this.B = analyticsPocketsInteractor;
        this.C = analyticsTransactionsInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.D = z1VarB;
        this.E = mra.d.b(this, new a(new Data(null, null, true, 3, null), null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(urj.n r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof urj.m
            if (r0 == 0) goto L13
            r0 = r7
            urj.m r0 = (urj.m) r0
            int r1 = r0.f282336w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282336w = r1
            goto L18
        L13:
            urj.m r0 = new urj.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f282336w
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 == r5) goto L29
            if (r2 != r3) goto L2d
        L29:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L8a
            goto L7f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            goto L49
        L39:
            yhm.o.b(r7)
            kotlinx.coroutines.flow.Flow r7 = r6.L2()
            r0.f282336w = r4
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L49
            goto L7e
        L49:
            com.revolut.core.model.account.AccountId r7 = (com.revolut.core.model.account.AccountId) r7
            if (r7 != 0) goto L50
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L50:
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L8a
            boolean r2 = r7 instanceof com.revolut.core.model.account.AccountId.Joint     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L65
            grj.j r6 = r6.f282339r     // Catch: java.lang.Throwable -> L8a
            com.revolut.core.model.account.AccountId$Joint r7 = (com.revolut.core.model.account.AccountId.Joint) r7     // Catch: java.lang.Throwable -> L8a
            r0.f282336w = r5     // Catch: java.lang.Throwable -> L8a
            grj.k r6 = (grj.k) r6     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r6 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L8a
            if (r6 != r1) goto L7f
            goto L7e
        L65:
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Throwable -> L8a
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L84
            pzi.b r6 = r6.f282338q     // Catch: java.lang.Throwable -> L8a
            grj.i r6 = (grj.i) r6     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            pfm.h r6 = r6.e(r7, r2)     // Catch: java.lang.Throwable -> L8a
            r0.f282336w = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r6 = nim.a.a(r6, r0)     // Catch: java.lang.Throwable -> L8a
            if (r6 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L8a
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L8a
            goto L91
        L84:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L8a
            r6.<init>()     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r6 = move-exception
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L91:
            java.lang.Throwable r6 = yhm.m.a(r6)
            if (r6 == 0) goto La1
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.WARNING
            r1 = 0
            rd0.d.a(r0, r1, r1, r6, r7)
        La1:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: urj.n.I2(urj.n, gim.c):java.lang.Object");
    }

    public static final void J2(n nVar, uzi.b bVar, xi0.b bVar2, qzi.h hVar, List list, Map map, List list2, ie3.a aVar, AccountId accountId) {
        Object cVar;
        Object next;
        List list3;
        int size = (aVar == null || (list3 = aVar.f160626a) == null) ? 0 : list3.size();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f(((qzi.a) obj2).d, v13.d.u(qzi.l.OVERALL))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            trj.a aVarA = null;
            if (!it8.hasNext()) {
                break;
            }
            qzi.a aVar2 = (qzi.a) it8.next();
            srj.c cVar2 = nVar.f282342w;
            Long l2 = (Long) map.get(aVar2.d);
            dj0.d dVar = new dj0.d(l2 != null ? l2.longValue() : 0L, aVar2.f250648c.f115083b);
            String strP = v13.d.p(aVar2.d);
            Iterator it9 = list2.iterator();
            while (true) {
                if (it9.hasNext()) {
                    next = it9.next();
                    if (Intrinsics.f(((i3) next).getId(), strP)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            i3 i3Var = (i3) next;
            if (i3Var != null) {
                cVar2.getClass();
                aVarA = srj.c.a(dVar, aVar2, i3Var);
            }
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
        List listP0 = d0.P0(arrayList2, cim.b.a(new urd.y(3), new um7.d(nVar, 24)));
        if (hVar != null) {
            qzi.a aVar3 = hVar.f250654a;
            long jK2 = K2(hVar.f250655b, aVar3);
            dj0.d dVar2 = hVar.f250657g;
            dj0.d dVar3 = hVar.f;
            cVar = new b(bVar, dVar2, dVar3, aVar3.f250648c, hVar.f250658h, pyd.c.k(dVar3, jK2), hVar.f250656c, jK2, size, hVar.i, listP0, hVar.f250654a);
        } else {
            LocalDate localDate = ((l80.f) nVar.f282344y).g().toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            cVar = new c(bVar, K2(localDate, null), bVar2);
        }
        nVar.H2(nVar.E, new toh.h(cVar, 28, aVar, accountId));
    }

    public static long K2(LocalDate localDate, qzi.a aVar) {
        LocalDate localDateWithDayOfMonth;
        LocalDate localDateWithMaximumValue;
        if (aVar == null || (localDateWithDayOfMonth = aVar.e) == null) {
            localDateWithDayOfMonth = localDate.withDayOfMonth(1);
        }
        if (aVar == null || (localDateWithMaximumValue = aVar.f) == null) {
            localDateWithMaximumValue = localDate.dayOfMonth().withMaximumValue();
        }
        long days = (((long) Days.daysBetween(localDateWithDayOfMonth, localDateWithMaximumValue).getDays()) + 1) - ((long) Days.daysBetween(localDateWithDayOfMonth, localDate).getDays());
        if (days < 1) {
            return 1L;
        }
        return days;
    }

    public final Flow L2() {
        int i = g.f282328a[this.o.f101525a.ordinal()];
        if (i == 1) {
            return new go.g(AccountId.Personal.f51414a, 2);
        }
        if (i == 2) {
            return vkm.q.q(new tnb.k(nz8.d.j(this.A.i(false), new up5.k(23), 1), 12));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void M2() {
        AccountId accountId;
        dj0.d dVar;
        y yVar = this.E;
        d dVar2 = (d) ((a) ((j2) yVar.f22677a).getValue()).f282313a.getContent();
        if (dVar2 == null || (accountId = ((a) ((j2) yVar.f22677a).getValue()).f282315c) == null) {
            return;
        }
        if (dVar2 instanceof b) {
            dVar = ((b) dVar2).d;
        } else {
            if (!(dVar2 instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new dj0.d(0L, ((c) dVar2).f282325c);
        }
        l1().M0(new com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.b(dVar, accountId, com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.c.UPDATE_CATEGORY_BUDGET));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new l(1, continuation, this), new whi.b(6));
        yji.l.b1(this, vkm.q.Q(this.D, new i(2, continuation, this)), null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
