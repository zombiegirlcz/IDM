package r10;

import com.ironz.binaryprefs.exception.FileOperationException;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$Input;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dej.o3;
import ecm.k0;
import j9k.a0;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import joh.x;
import joh.y;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import uw1.f;
import z0h.s1;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements ak.a, knc.a, Converter, zp0.c, xph.a, xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f250811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f250812b;

    public /* synthetic */ a(Object obj2, Object obj3) {
        this.f250811a = obj2;
        this.f250812b = obj3;
    }

    public static k0 b0() {
        return new k0();
    }

    @Override // ak.a
    public boolean B() {
        try {
            ((Future) this.f250811a).get();
            return true;
        } catch (Exception e) {
            ((mj.a) this.f250812b).a(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.E(java.lang.String, gim.c):java.lang.Object");
    }

    public boolean J() {
        return !((o8b.c) ((n8b.a) this.f250812b)).g() || ((jla.h) this.f250811a).d(f.UPI.getCode(), null) == bla.c.ENABLED;
    }

    public hd.e M(AccountWrapper sourceBalance, AccountWrapper targetBalance, OrderQuote orderQuote, OrderMode orderMode) {
        dj0.d dVarO;
        Intrinsics.checkNotNullParameter(sourceBalance, "sourceBalance");
        Intrinsics.checkNotNullParameter(targetBalance, "targetBalance");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        h6i.r rVar = (h6i.r) this.f250812b;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        Charges charges = orderQuote.f104755g;
        s6i.a aVar = (charges.f104731a.f104723b.isEmpty() || (orderMode instanceof OrderMode.Threshold)) ? null : new s6i.a(a.a.L(charges.f104731a.f104722a), h6i.q.a(orderQuote));
        if (!((jte.d) ((gte.a) this.f250811a)).c(PaymentsToggles$PaymentsChargesMigration.f79158c)) {
            return aVar == null ? rVar.a(orderQuote, sourceBalance, targetBalance) : aVar;
        }
        s6i.c cVarA = rVar.a(orderQuote, sourceBalance, targetBalance);
        if (aVar == null || cVarA == null) {
            return aVar == null ? cVarA : aVar;
        }
        try {
            dVarO = pyd.c.O((dj0.d) aVar.f151343a, (dj0.d) cVarA.f151343a);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            dVarO = null;
        }
        if (dVarO == null) {
            return null;
        }
        s6i.d dVar = (s6i.d) aVar.f151344b;
        s6i.d dVar2 = (s6i.d) cVarA.f151344b;
        if (dVar == dVar2) {
            return new s6i.b(dVarO, dVar2);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Fee and tax expense modes don't match: " + dVar + " != " + dVar2);
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
        return null;
    }

    public ZonedDateTime O() {
        ZonedDateTime zonedDateTimePlusMonths = ((l80.f) ((l80.e) this.f250812b)).k().plusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusMonths, "plusMonths(...)");
        Intrinsics.checkNotNullParameter(zonedDateTimePlusMonths, "<this>");
        Intrinsics.checkNotNullParameter(zonedDateTimePlusMonths, "<this>");
        ZonedDateTime zonedDateTimeWithDayOfMonth = zonedDateTimePlusMonths.withDayOfMonth(zonedDateTimePlusMonths.toLocalDate().lengthOfMonth());
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeWithDayOfMonth, "withDayOfMonth(...)");
        Intrinsics.checkNotNullParameter(zonedDateTimeWithDayOfMonth, "<this>");
        ZonedDateTime zonedDateTimeWith = zonedDateTimeWithDayOfMonth.with((TemporalAdjuster) LocalTime.MAX);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
        return zonedDateTimeWith;
    }

    public LocalDate S(List marketClosedEvents, bfl.e stockExchange) {
        nvl.j jVar = (nvl.j) this.f250811a;
        Intrinsics.checkNotNullParameter(marketClosedEvents, "marketClosedEvents");
        Intrinsics.checkNotNullParameter(stockExchange, "stockExchange");
        ZonedDateTime zonedDateTimeK = ((l80.f) ((l80.e) this.f250812b)).k();
        List list = marketClosedEvents;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((iel.p) it8.next()).f160803b);
        }
        jVar.getClass();
        if (nvl.j.a(zonedDateTimeK, arrayList) || !zonedDateTimeK.isBefore(jli.b.g(stockExchange.f15028g))) {
            zonedDateTimeK = zonedDateTimeK.plusDays(1L);
            Intrinsics.h(zonedDateTimeK);
            ZonedDateTime zonedDateTimeB = nvl.j.b(zonedDateTimeK, O(), arrayList);
            if (zonedDateTimeB == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Failed to find next available trade day for recurring buy. Fallback to " + zonedDateTimeK + ".");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                zonedDateTimeK = zonedDateTimeB;
            }
        }
        LocalDate localDate = zonedDateTimeK.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(fi6.d r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.V(fi6.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W(java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f250811a
            b6k.f r0 = (b6k.f) r0
            boolean r1 = r10 instanceof b6k.g
            if (r1 == 0) goto L17
            r1 = r10
            b6k.g r1 = (b6k.g) r1
            int r2 = r1.f12852w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f12852w = r2
            goto L1c
        L17:
            b6k.g r1 = new b6k.g
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f12852w
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r10)
            goto Lc1
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            yhm.o.b(r10)
            if (r9 != 0) goto L40
            b6k.e r9 = new b6k.e
            r10 = 0
            r9.<init>(r10, r10)
            return r9
        L40:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4b:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r9.next()
            r5 = r3
            tof.a3 r5 = (tof.a3) r5
            tof.v6 r5 = r5.f
            tof.v6 r6 = tof.v6.PENDING
            if (r5 == r6) goto L62
            tof.v6 r6 = tof.v6.COMPLETED
            if (r5 != r6) goto L4b
        L62:
            r10.add(r3)
            goto L4b
        L66:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r10 = r10.iterator()
        L74:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L93
            java.lang.Object r5 = r10.next()
            r6 = r5
            tof.a3 r6 = (tof.a3) r6
            dj0.d r6 = r6.k
            dj0.d r7 = dj0.d.e
            boolean r6 = r6.f(r7)
            if (r6 == 0) goto L8f
            r9.add(r5)
            goto L74
        L8f:
            r3.add(r5)
            goto L74
        L93:
            ufm.n r10 = r0.a(r3)
            ufm.n r9 = r0.a(r9)
            efm.d0 r9 = te0.w.H0(r10, r9)
            b4b.z r10 = new b4b.z
            r0 = 20
            r10.<init>(r8, r0)
            b0a.h r0 = new b0a.h
            r3 = 18
            r0.<init>(r3, r10)
            ufm.i r10 = new ufm.i
            r3 = 1
            r10.<init>(r9, r0, r3)
            java.lang.String r9 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            r1.f12852w = r4
            java.lang.Object r10 = nim.a.b(r10, r1)
            if (r10 != r2) goto Lc1
            return r2
        Lc1:
            java.lang.String r9 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.W(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r1 == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a0(java.lang.String r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.a0(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // xph.a
    public y b(ViewController viewController, EditScreenerScreenContract$Input editScreenerScreenContract$Input) {
        editScreenerScreenContract$Input.getClass();
        return new y((joh.w) this.f250811a, (x) this.f250812b, editScreenerScreenContract$Input);
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f250811a, ViewController.class);
        vc.s.h((String) this.f250812b, String.class);
        return new jyc.a((String) this.f250812b);
    }

    @Override // ak.a
    public Object c(Object obj2) {
        try {
            return ((Future) this.f250811a).get();
        } catch (Exception e) {
            ((mj.a) this.f250812b).a(e);
            return obj2;
        }
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj2) throws IOException {
        ResponseBody body = (ResponseBody) obj2;
        Intrinsics.checkNotNullParameter(body, "value");
        a31.a aVar = (a31.a) this.f250812b;
        mlm.b loader = (mlm.b) this.f250811a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(body, "body");
        String strString = body.string();
        Intrinsics.checkNotNullExpressionValue(strString, "body.string()");
        return ((Json) ((mlm.j) aVar.f955b)).b(loader, strString);
    }

    @Override // knc.a
    public dmc.w d(ViewController viewController, ProjectionScreenContract$Input projectionScreenContract$Input, s1 s1Var, jlc.e eVar) {
        projectionScreenContract$Input.getClass();
        return new dmc.w((dmc.r) this.f250811a, (dmc.i) this.f250812b, viewController, projectionScreenContract$Input, s1Var, eVar);
    }

    @Override // ak.a
    public void i() {
        try {
            ((Future) this.f250811a).get();
        } catch (Exception e) {
            throw new FileOperationException((Throwable) e);
        }
    }

    public vkm.d j0(xi0.b currency, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return rd0.e.b(pd.b.r(nim.a.w(((wsg.n) this.f250811a).M(w4l.h.f294642c, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.DEFAULT, accountId), new a94.q(11, currency)), new byc.a(this, currency, 9)));
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (z) {
            ((SharedConverterScreen) this.f250811a).Y.onNext(new jgd.k((SharedConverterItem) this.f250812b, formattedValue));
        }
    }

    public Flow k0(List subscriptions, o3 orderType) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new vkm.y(hb9.b.x(nim.a.v(((dfj.k0) this.f250812b).b(w4l.i.f294643c), new g31.e(subscriptions, 22, this, orderType)), d0.P0(subscriptions, new fad.i(orderType, 18))), new a67.c(subscriptions, this, orderType, (Continuation) null, 21));
    }

    public String m0() {
        Lazy lazy = (Lazy) this.f250812b;
        if (((Future) lazy.getValue()).isDone()) {
            try {
                return (String) ((Future) lazy.getValue()).get();
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        return null;
    }

    @Override // ak.a
    public Object q() {
        try {
            return ((Future) this.f250811a).get();
        } catch (Exception e) {
            throw new FileOperationException((Throwable) e);
        }
    }

    public a(mlm.b loader, a31.a serializer) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f250811a = loader;
        this.f250812b = serializer;
    }

    public a(ybl.l configInteractor) {
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f250811a = configInteractor;
        this.f250812b = yhm.j.b(new iv0.p(this, 12));
    }

    public a(a0 transferLinkCurrenciesProvider, j9k.c currencyByUsernameProvider) {
        Intrinsics.checkNotNullParameter(transferLinkCurrenciesProvider, "transferLinkCurrenciesProvider");
        Intrinsics.checkNotNullParameter(currencyByUsernameProvider, "currencyByUsernameProvider");
        this.f250811a = transferLinkCurrenciesProvider;
        this.f250812b = currencyByUsernameProvider;
    }

    public a(ang.f userInteractor, o71.a beneficiaryRepository) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        this.f250811a = userInteractor;
        this.f250812b = beneficiaryRepository;
    }

    public a(b6k.f analyticsSumCalculator, b6k.d analyticsResultMapper) {
        Intrinsics.checkNotNullParameter(analyticsSumCalculator, "analyticsSumCalculator");
        Intrinsics.checkNotNullParameter(analyticsResultMapper, "analyticsResultMapper");
        this.f250811a = analyticsSumCalculator;
        this.f250812b = analyticsResultMapper;
    }

    public a(gte.a featureToggleInteractor, h6i.r moveMoneyAdditionalExpensesProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAdditionalExpensesProvider, "moveMoneyAdditionalExpensesProvider");
        this.f250811a = featureToggleInteractor;
        this.f250812b = moveMoneyAdditionalExpensesProvider;
    }

    public a(l93.f cardsInteractor, hy2.f cardDesignInteractor) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        this.f250811a = cardsInteractor;
        this.f250812b = cardDesignInteractor;
    }

    public a(nvl.j dateCalculator, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateCalculator, "dateCalculator");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f250811a = dateCalculator;
        this.f250812b = dateProvider;
    }

    public a(ppk.f ratesInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f250811a = ratesInteractor;
        this.f250812b = walletInteractor;
    }

    public a(ihe.a productSpaceOrder, ihe.b productSubSpaceOrder) {
        Intrinsics.checkNotNullParameter(productSpaceOrder, "productSpaceOrder");
        Intrinsics.checkNotNullParameter(productSubSpaceOrder, "productSubSpaceOrder");
        this.f250811a = productSpaceOrder;
        this.f250812b = productSubSpaceOrder;
    }

    public a(CreditPluginsService creditPluginsService, y04.b downPaymentSourceConfigDtoMapper, y04.d downPaymentSourceSubmitRequestDtoMapper, mp.p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(downPaymentSourceConfigDtoMapper, "downPaymentSourceConfigDtoMapper");
        Intrinsics.checkNotNullParameter(downPaymentSourceSubmitRequestDtoMapper, "downPaymentSourceSubmitRequestDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        this.f250811a = creditPluginsService;
        this.f250812b = creditApplicationDtoMapper;
    }

    public a(dm0.d deviceIdProvider, ynj.m esimInstallationStateResolver, dfj.k0 esimInstallationStateInteractor) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(esimInstallationStateResolver, "esimInstallationStateResolver");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        this.f250811a = deviceIdProvider;
        this.f250812b = esimInstallationStateInteractor;
    }

    public a(wsg.n walletInteractor, yud.g stakingInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        this.f250811a = walletInteractor;
        this.f250812b = stakingInteractor;
    }

    public a(jyc.h hVar) {
    }
}
