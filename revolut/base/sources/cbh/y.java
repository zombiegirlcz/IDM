package cbh;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q0;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends oki.h implements m {

    @NotNull
    private static final q Companion = new q();
    public final Object A;
    public final z1 B;
    public final z1 C;
    public tzg.g D;
    public final Object E;
    public final InvestTransactionsListContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.l f22851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tzg.m f22852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f22853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f22854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.b f22855t;
    public final d1h.e u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fbh.a f22856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rul.e f22857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z f22858y;
    public final y2f.a z;

    public y(InvestTransactionsListContract$InputData inputData, ac4.g stateMapper, ybl.l tradingConfigInteractor, tzg.m wealthAccountsInteractor, aah.h disclaimersExtension, k paginationControllerModelExtension, ybl.b instrumentTickerInteractor, d1h.e wealthRemoteDisclaimersControllerModelExtension, gte.a featureToggleInteractor, fbh.a disclaimerScopesProvider, rul.e investTransactionsPaginationInteractor, z transactionsScrollingHandler, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(paginationControllerModelExtension, "paginationControllerModelExtension");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersControllerModelExtension, "wealthRemoteDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(disclaimerScopesProvider, "disclaimerScopesProvider");
        Intrinsics.checkNotNullParameter(investTransactionsPaginationInteractor, "investTransactionsPaginationInteractor");
        Intrinsics.checkNotNullParameter(transactionsScrollingHandler, "transactionsScrollingHandler");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.o = inputData;
        this.f22851p = tradingConfigInteractor;
        this.f22852q = wealthAccountsInteractor;
        this.f22853r = disclaimersExtension;
        this.f22854s = paginationControllerModelExtension;
        this.f22855t = instrumentTickerInteractor;
        this.u = wealthRemoteDisclaimersControllerModelExtension;
        this.v = featureToggleInteractor;
        this.f22856w = disclaimerScopesProvider;
        this.f22857x = investTransactionsPaginationInteractor;
        this.f22858y = transactionsScrollingHandler;
        this.z = tradingTransactionsInteractor;
        this.A = te0.w.y0(new bvb.a(this, 12));
        this.B = ta6.a.a(0);
        this.C = ta6.a.a(0);
        this.D = new tzg.f(inputData.f95365a);
        this.E = te0.w.y0(new buf.u(this, stateMapper, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yji.l
    public final void I1() {
        Flow flowI;
        Continuation continuation = null;
        yji.l.a1(this, ybl.l.d(this.f22851p), null, null, new r(this, continuation, 6), 3);
        int i = 7;
        int i2 = 3;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i3 = 2;
        int i5 = 1;
        if (J2()) {
            go.g gVar = new go.g(this.D, 2);
            int i6 = 16;
            ba4.x xVar = new ba4.x(vkm.q.s(new ba4.x(this.B, this.f22858y, 18), new c8i.c(i6), vkm.q.f290100b), this, i6);
            int i21 = 5;
            vkm.f paginationEvents = vkm.q.J(gVar, new q0(xVar, new r(this, continuation, i21), i5), new ba4.x(this.C, this, 17));
            rul.e eVar = this.f22857x;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(paginationEvents, "paginationEvents");
            yji.l.a1(this, vkm.q.Q(paginationEvents, new x18.e(continuation, eVar, i21)), null, null, new r(this, continuation, objArr2 == true ? 1 : 0), 3);
            d4f.p pVar = (d4f.p) this.z;
            yji.l.a1(this, !((jte.d) pVar.e).c(FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c) ? new go.g(Boolean.FALSE, 2) : vkm.q.q(vkm.q.Q(ybl.k.f(pVar.d, null, 1), new cvi.i(continuation, pVar, i))), null, null, new s(this, continuation, i3), 3);
        } else {
            yji.l.a1(this, new q0((j2) ((n0) this.f22854s).v.f22677a, new r(this, continuation, i), i5), null, null, null, 7);
        }
        if (((jte.d) this.v).c(FeatureWealthApi$Toggles.WealthOrdersAndTransactionsRemoteDisclaimers.f95171c)) {
            InvestTransactionsListContract$Disclaimers disclaimers = this.o.f95366b.f95364a;
            fbh.a aVar = this.f22856w;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
            yji.l.a1(this, vkm.q.Q(rd0.e.e(mo3.a.g((disclaimers.f95361a || disclaimers.f95362b || disclaimers.f95363c || disclaimers.d) ? nim.a.v(tzg.m.c(aVar.f133559a, null, null, 3), new f0m.c(disclaimers, aVar)) : zi0.c.i(zhm.f0.f322471a), null, new c2f.m(27), 1), zhm.h0.f322473a, new c9k.k(i2, i5, continuation)), new bw4.s(continuation, this, 11)), null, null, new r(this, continuation, i5), 3);
            return;
        }
        tzg.m mVar = this.f22852q;
        yji.l.a1(this, new q0(xam.a.h(new s(this, continuation, objArr == true ? 1 : 0), nim.a.v(tzg.m.c(mVar, null, null, 3), new c8i.c(19))), new r(this, continuation, i3), i5), null, null, null, 7);
        yji.l.a1(this, new q0(xam.a.h(new s(this, continuation, i5), nim.a.v(tzg.m.c(mVar, null, null, 3), new c8i.c(20))), new r(this, continuation, i2), i5), null, null, null, 7);
        if (!((InvestTransactionsFilter.InvestTransactionsFilterImpl) I2()).f105341a.isEmpty()) {
            Set set = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) I2()).f105341a;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = true;
                flowI = zi0.c.i(Boolean.valueOf(z));
            } else {
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    if (((WealthAccountType) it8.next()) != WealthAccountType.MARGIN) {
                        break;
                    }
                }
                z = true;
                flowI = zi0.c.i(Boolean.valueOf(z));
            }
        } else {
            if (((InvestTransactionsFilter.InvestTransactionsFilterImpl) I2()).f105343c != null || ((InvestTransactionsFilter.InvestTransactionsFilterImpl) I2()).f105342b.isEmpty()) {
                flowI = zi0.c.i(Boolean.FALSE);
                break;
            }
            Set set2 = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) I2()).f105342b;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    if (!cp5.d.C((xi0.b) it9.next())) {
                        flowI = zi0.c.i(Boolean.FALSE);
                        break;
                    }
                }
            }
            Set set3 = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) I2()).f105342b;
            ArrayList arrayList = new ArrayList(zhm.w.t(set3, 10));
            Iterator it10 = set3.iterator();
            while (it10.hasNext()) {
                arrayList.add(((xi0.b) it10.next()).f306286a);
            }
            flowI = vkm.q.q(nim.a.v(((ael.k) this.f22855t).l(zhm.d0.i1(arrayList)), new c8i.c(21)));
        }
        yji.l.a1(this, new q0(flowI, new r(this, continuation, 4), i5), null, null, null, 7);
    }

    public final InvestTransactionsFilter I2() {
        return ((j) ((j2) getState().f22677a).getValue()).f22818a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean J2() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new x(this, continuation, 0), new c8i.c(17));
        n2(new x(this, continuation, 1), new c8i.c(18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.E.getValue();
    }
}
