package sc7;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsRevPoints;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import jlk.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import l3l.m;
import m1c.f1;
import m1c.s1;
import m1c.y;
import m1c.z;
import n2l.l;
import veh.k;
import vrl.j0;
import vrl.l0;
import vy5.i0;
import vy5.v0;
import w3c.n;
import wbg.g0;
import xl2.a0;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f261644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f261645c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(TradingAccount tradingAccount, l0 l0Var, xi0.b bVar, m4l.j jVar, l4l.a aVar) {
        this.f261643a = 23;
        this.f261644b = tradingAccount;
        this.f261645c = bVar;
        this.d = jVar;
        this.e = aVar;
    }

    private final Object a(Object obj2) {
        vb0.b bVar = (vb0.b) this.f261644b;
        PromptScreen screen = (PromptScreen) this.f261645c;
        a0 a0Var = screen.f;
        PromptMarketingScreen promptMarketingScreen = (PromptMarketingScreen) this.d;
        m mVar = (m) this.e;
        u result = (u) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof p) {
            bVar.f287349c.Z2(((p) result).f111461a.f275445a);
        } else if (Intrinsics.f(result, s.f111464a)) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Action actionO = (hb9.b.p(screen) == null || a0Var != a0.HORIZONTAL) ? hb9.b.o(screen) : hb9.b.p(screen);
            if (actionO == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar.a(promptMarketingScreen, actionO, screen, mVar);
        } else if (Intrinsics.f(result, t.f111465a)) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Action actionP = (hb9.b.p(screen) == null || a0Var != a0.HORIZONTAL) ? hb9.b.p(screen) : hb9.b.o(screen);
            if (actionP == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar.a(promptMarketingScreen, actionP, screen, mVar);
        } else if (Intrinsics.f(result, q.f111462a)) {
            promptMarketingScreen.m2().onBackPressed();
        } else if (!Intrinsics.f(result, r.f111463a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        veh.f fVar;
        Function1 function1 = (Function1) this.f261644b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f261645c;
        k kVar = (k) this.d;
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
        veh.e update = (veh.e) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        veh.e eVar = (veh.e) function1.invoke(update);
        Data data = eVar.f288321a;
        ref$ObjectRef.f186409a = (data == null || (fVar = (veh.f) data.getContent()) == null) ? null : new teh.c(kVar.o.f95719a, fVar.f288325b, fVar.f288326c, teh.b.ASC);
        boolean zF = Intrinsics.f(kVar.f288338s.getValue(), ref$ObjectRef.f186409a);
        ref$BooleanRef.f186407a = !zF;
        return veh.e.a(eVar, null, (zF || ref$ObjectRef.f186409a == null) ? eVar.f288322b : new Data(null, null, true, 3, null), null, 5);
    }

    private final Object c(Object obj2) {
        Flow flowB;
        vgc.p pVar = (vgc.p) this.f261644b;
        w4l.k kVar = (w4l.k) this.f261645c;
        List list = (List) this.d;
        List list2 = (List) this.e;
        Map transactionIdsByPaymentId = (Map) obj2;
        Intrinsics.checkNotNullParameter(transactionIdsByPaymentId, "transactionIdsByPaymentId");
        vkm.d dVarB = rd0.e.b(pVar.f288836a.c(Intrinsics.f(kVar, w4l.i.f294643c)));
        Set setI1 = d0.i1(w.u(transactionIdsByPaymentId.values()));
        if (setI1.isEmpty()) {
            flowB = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        } else {
            flowB = rd0.e.b(pVar.f288837b.c(new RevPointsTransactionPageParams(0, null, null, null, f1.RECURRING_PAYMENTS, s1.COMPLETED, null, d0.d1(setI1), null, 335)));
        }
        return nim.a.v(u0.m(dVarB, flowB), new b(pVar, list, transactionIdsByPaymentId, list2, 18));
    }

    private final Object d(Object obj2) {
        double dJ;
        vgc.p pVar = (vgc.p) this.f261644b;
        List list = (List) this.f261645c;
        Map map = (Map) this.d;
        List list2 = (List) this.e;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        z zVar = (z) pair.f186385a;
        List list3 = (List) pair.f186386b;
        pVar.getClass();
        boolean z = zVar instanceof y;
        if (z) {
            dJ = ((y) zVar).f201475a.f201472c.J();
        } else {
            if (!Intrinsics.f(zVar, z.a.f201476a)) {
                throw new NoWhenBranchMatchedException();
            }
            dJ = 0.0d;
        }
        return new RentAndBillsRevPoints(dJ, vgc.p.a(map, list3, list), vgc.p.a(map, list3, list2), z);
    }

    private final Object e(Object obj2) {
        vjk.d dVar = (vjk.d) this.f261644b;
        hha.d dVar2 = (hha.d) this.d;
        String str = (String) this.f261645c;
        Function0 function0 = (Function0) this.e;
        jlk.j result = (jlk.j) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result, j.a.f175856a)) {
            if (!(result instanceof j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.V2(new sxe.g(23, dVar, dVar2, str, function0, (Continuation) null), new yi5.b(29));
        }
        return Unit.f186387a;
    }

    private final Object g(Object obj2) {
        vpd.c cVar = (vpd.c) this.f261644b;
        Set set = (Set) this.f261645c;
        Set set2 = (Set) this.d;
        List list = (List) this.e;
        vpd.d update = (vpd.d) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        Set set3 = set;
        Set set4 = set2;
        ArrayList arrayListE0 = d0.E0(set4, d0.E0(set3, cVar.f291152a));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : arrayListE0) {
            if (hashSet.add(((IncomeSorterDestinationInfo) obj3).getId())) {
                arrayList.add(obj3);
            }
        }
        Data dataP = zi0.c.P(vpd.c.a(cVar, arrayList), false, null, 3);
        LinkedHashSet selectedDestinations = a1.l(a1.l(d0.i1(list), set3), set4);
        Intrinsics.checkNotNullParameter(selectedDestinations, "selectedDestinations");
        return vpd.d.a(update, dataP, new vpd.j(selectedDestinations), null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.f261644b
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref$BooleanRef) r2
            java.lang.Object r3 = r0.f261645c
            nu0.m r3 = (nu0.m) r3
            java.lang.Object r4 = r0.d
            vq0.h r4 = (vq0.h) r4
            sgm.j1 r5 = r4.e
            android.os.Handler r6 = r4.d
            java.lang.Object r7 = r0.e
            nu0.d r7 = (nu0.d) r7
            java.lang.String r8 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            boolean r8 = r1 instanceof nu0.g.a
            r9 = 5000(0x1388, double:2.4703E-320)
            r11 = 1
            if (r8 == 0) goto L27
            r2.f186407a = r11
            goto L6a
        L27:
            boolean r8 = r1 instanceof nu0.g.b
            r12 = 0
            if (r8 == 0) goto L2f
            r2.f186407a = r12
            goto L6a
        L2f:
            boolean r8 = r1 instanceof nu0.f
            if (r8 == 0) goto L6a
            jv0.y r3 = r3.getContentPlayerView()
            long r13 = r3.getContentPosition()
            long r15 = r3.getContentDuration()
            long r15 = r15 - r13
            r13 = 0
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 >= 0) goto L47
            r15 = r13
        L47:
            boolean r3 = r4.f291295h
            r17 = 4000(0xfa0, double:1.9763E-320)
            if (r3 != 0) goto L59
            int r3 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r3 > 0) goto L59
            r4.d()
            r6.postDelayed(r5, r9)
            r4.f291295h = r11
        L59:
            boolean r3 = r4.f291295h
            if (r3 == 0) goto L63
            int r3 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r3 <= 0) goto L63
            r4.f291295h = r12
        L63:
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 != 0) goto L6a
            r4.d()
        L6a:
            boolean r3 = r1 instanceof nu0.f
            if (r3 == 0) goto L78
            nu0.f r1 = (nu0.f) r1
            boolean r3 = r1.f219182b
            if (r3 == 0) goto L87
            boolean r1 = r1.f219183c
            if (r1 != 0) goto L87
        L78:
            boolean r1 = r7.c()
            if (r1 != 0) goto L82
            boolean r1 = r4.f
            if (r1 != 0) goto L87
        L82:
            r7.a()
            r4.f = r11
        L87:
            boolean r1 = r2.f186407a
            if (r1 != 0) goto L8e
            r6.postDelayed(r5, r9)
        L8e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sc7.b.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2) {
        TradingAccount tradingAccount = (TradingAccount) this.f261644b;
        l0 l0Var = (l0) this.f261645c;
        l4l.a aVar = (l4l.a) this.d;
        List list = (List) this.e;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj2;
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        n2l.j jVarB = l.b(tradingAccount);
        return Optional.ofNullable(jVarB != null ? new xdf.h(l0Var.f291651g.h(jVarB, tradingLegalEntityInformation.f105106a, null), aVar, list) : null);
    }

    private final Object j(Object obj2) {
        TradingAccount tradingAccount = (TradingAccount) this.f261644b;
        xi0.b bVar = (xi0.b) this.f261645c;
        m4l.j jVar = (m4l.j) this.d;
        l4l.a aVar = (l4l.a) this.e;
        List cashHoldings = (List) obj2;
        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
        List<kel.b> list = cashHoldings;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (kel.b bVar2 : list) {
            j0 j0VarB = l0.b(bVar2, bVar, jVar != null ? jVar.f202769c : null);
            arrayList.add(new SourcePocket.Holding(bVar2, tradingAccount, j0VarB.f291643b, new SourcePocket.Balance.MoneyBalance(j0VarB.f291642a), null, aVar, jVar));
        }
        return new Pair(tradingAccount, arrayList);
    }

    private final Object k(Object obj2) {
        i0 i0Var = (i0) this.f261644b;
        io3.d dVar = (io3.d) this.f261645c;
        xi0.b bVar = (xi0.b) this.d;
        List list = (List) this.e;
        vf0.h hVar = (vf0.h) obj2;
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        vy5.a aVar = (vy5.a) hVar.f288433a;
        f95.b bVar2 = (f95.b) hVar.f288434b;
        od0.i iVar = (od0.i) hVar.f288435c;
        Set set = (Set) hVar.d;
        v0 v0Var = i0Var.f293162a;
        Intrinsics.checkNotNullParameter(bVar2, "<this>");
        ArrayList arrayListF = v0Var.f(dVar, aVar, bVar, bVar2 instanceof f95.a);
        return i0Var.f.a(arrayListF).map(new vx9.w(new aqd.f(i0Var, dVar, bVar, list, arrayListF, bVar2, iVar, set), 8));
    }

    private final Object l(Object obj2) {
        TradingOnboardingStatus tradingOnboardingStatus;
        w4f.b bVar = (w4f.b) this.f261644b;
        xi0.b bVar2 = (xi0.b) this.f261645c;
        n9l.b bVar3 = (n9l.b) this.d;
        del.f fVar = (del.f) this.e;
        wel.e portfolio = (wel.e) obj2;
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        int i = w4f.a.f294562b[portfolio.f296819b.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4 || i == 5) {
                return te0.w.h(new Data(new d3f.a(portfolio, null), null, false, 6, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(portfolio, "<this>");
        wel.h hVar = portfolio.f.f296826a;
        if (hVar == null || (tradingOnboardingStatus = hVar.f296827a) == null) {
            tradingOnboardingStatus = TradingOnboardingStatus.NONE;
        }
        return w4f.a.f294561a[tradingOnboardingStatus.ordinal()] == 1 ? zi0.c.G(ue0.e.p(nim.a.w(ael.t.d(bVar.f294564m, portfolio.f296818a, false, bVar3, bVar2, true, fVar, 2), new n(portfolio, 1)), h0.f322473a), new d3f.a(portfolio, null)) : te0.w.h(new Data(new d3f.a(portfolio, null), null, false, 6, null));
    }

    private final Object m(Object obj2) {
        efm.r rVarJust;
        w4l.k kVar = (w4l.k) this.f261644b;
        w4l.f fVar = (w4l.f) this.f261645c;
        ihm.k kVar2 = (ihm.k) this.e;
        Data cached = (Data) obj2;
        Intrinsics.checkNotNullParameter(cached, "cached");
        boolean z = kVar.f294646b || cached.getContent() == null;
        Object obj3 = this.d;
        if (z) {
            rVarJust = efm.r.just(cached);
        } else {
            fVar.f294640l.put(obj3, Boolean.TRUE);
            rVarJust = efm.r.just(Data.copy$default(cached, null, null, false, 3, null));
        }
        Intrinsics.h(rVarJust);
        efm.r rVarConcat = efm.r.concat(rVarJust, kVar2);
        Intrinsics.checkNotNullExpressionValue(rVarConcat, "concat(...)");
        return z ? rVarConcat.mergeWith(new pfm.h(new lm.a(new qg7.k(fVar, 17, cached, obj3), 5), 2)) : rVarConcat;
    }

    private final Object n(Object obj2) {
        Data data = (Data) this.f261644b;
        HotelsPointsRedeemOption hotelsPointsRedeemOption = (HotelsPointsRedeemOption) this.f261645c;
        RevPoints revPoints = (RevPoints) this.d;
        Boolean bool = (Boolean) this.e;
        Intrinsics.h(data);
        return g0.a((g0) obj2, data, hotelsPointsRedeemOption, null, revPoints, null, false, false, bool, null, null, null, null, null, 8052);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0402  */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 3562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc7.b.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f261643a = i;
        this.f261644b = obj2;
        this.f261645c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public /* synthetic */ b(Object obj2, Object obj3, String str, Serializable serializable, int i) {
        this.f261643a = i;
        this.f261644b = obj2;
        this.d = serializable;
        this.f261645c = str;
        this.e = obj3;
    }

    public /* synthetic */ b(vpd.c cVar, Set set, Set set2, vpd.j jVar, List list) {
        this.f261643a = 20;
        this.f261644b = cVar;
        this.f261645c = set;
        this.d = set2;
        this.e = list;
    }
}
