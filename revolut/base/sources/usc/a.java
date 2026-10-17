package usc;

import a12.j;
import a3h.h;
import ahe.m0;
import android.graphics.Bitmap;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import cli.y;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.feature.trading_asset_quotes.impl.data.network.services.FiatExchangeOrderQuoteService;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowImpl;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import e8h.p0;
import ecm.q;
import hx7.e;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kz0.i;
import l80.f;
import tb4.t;
import tji.n;
import tji.o;
import v1.m;
import vge.e2;
import vge.t2;
import vge.v0;
import vkm.d;
import vkm.j2;
import w4l.k;
import xf6.f3;
import yc.g;
import zh9.u0;
import zhm.f0;
import zk0.c;
import zy5.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c, v0, n, zp0.c, vp6.a, g, zje.b, o, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f282889b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f282888a = i;
        this.f282889b = obj2;
    }

    public static d f(a aVar, FiatExchangeOrderQuoteParams params) throws Throwable {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        rcf.a aVar2 = params.f91690b;
        OrderQuoteParams orderQuoteParams = params.f91689a;
        if (aVar2 != rcf.a.TRADING_GIA_CBP) {
            xi0.b bVar = orderQuoteParams.f104783a;
            xi0.b bVar2 = orderQuoteParams.f104784b;
            if (Intrinsics.f(bVar.f306286a, bVar2.f306286a)) {
                e.n(new IllegalArgumentException(j6.a.s("Unsupported mono asset quote. Requested quote FROM: ", orderQuoteParams.f104783a.f306286a, " TO: ", bVar2.f306286a, ".")));
            }
        }
        wcf.a aVar3 = (wcf.a) aVar.f282889b;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return qe0.o.a(aVar3.f296415b, params, 3L, null, false, null, 28);
    }

    public static LocalDate m(LocalDate localDate, c0 c0Var) {
        int i = woc.g.f298917a[c0Var.ordinal()];
        if (i == 1) {
            return localDate;
        }
        if (i == 2) {
            return localDate.minusDays(localDate.getDayOfWeek().getValue() - 1);
        }
        if (i == 3) {
            return localDate.withDayOfMonth(1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // vge.v0
    public akg.n a(ProductId productId, Flow originFlow) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        return nim.a.v(u0.m(new m0(((t2) ((e2) this.f282889b)).n(), 21), originFlow), new eye.d(productId, 2));
    }

    @Override // tji.o
    public n b(long j2) {
        return new ybh.c0((i) ((q) this.f282889b).a(j2));
    }

    @Override // zje.b
    public void c(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        zje.n nVar = (zje.n) this.f282889b;
        nVar.H2(nVar.u, new m(17, transform));
    }

    @Override // a3h.h
    public FixedTabsDelegate d() {
        return (FixedTabsDelegate) this.f282889b;
    }

    @Override // tji.n
    public void dismiss() {
        ((kz0.a) this.f282889b).dismiss();
    }

    @Override // yc.g
    public vc.c e(vc.c cVar) {
        int i;
        t tVar = (t) this.f282889b;
        int i2 = zzbx.f49175a;
        try {
            int i3 = yc.a.f312389p;
            if (cVar != null && (i = cVar.f287572b) != 0 && i != 5 && i != 6 && i != 7) {
                throw new SplitInstallException(-1);
            }
            return vc.c.a(cVar != null ? 1 + cVar.f287571a : 1, 1, 0, 0L, 0L, (ArrayList) tVar.f269456b, new ArrayList());
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e2);
        }
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        rsc.a aVar = (rsc.a) this.f282889b;
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        if (!aVar.f257048b.compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new IOException(p.a.p("Something goes wrong while writing screenshot '", aVar.f257047a, "'"));
        }
    }

    public int h(LocalDate projectedDate, c0 period) {
        Intrinsics.checkNotNullParameter(projectedDate, "projectedDate");
        Intrinsics.checkNotNullParameter(period, "period");
        return (int) hx7.b.y(period).between(m(((f) ((l80.e) this.f282889b)).e(), period), m(projectedDate, period));
    }

    @Override // zje.b
    public Object i() {
        return ((TabCryptoFlowV2Contract$FlowState) ((j2) ((zje.n) this.f282889b).u.f22677a).getValue()).f89811a;
    }

    public akg.n j(wbc.b pagingParams) {
        Intrinsics.checkNotNullParameter(pagingParams, "pagingParams");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        qac.i iVar = (qac.i) this.f282889b;
        Intrinsics.checkNotNullParameter(pagingParams, "pagingParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(iVar.f244025g.a(pagingParams, loadingStrategy), qac.d.f);
    }

    @Override // zp0.c
    public void k(String newIncomeAmountInput, String formattedValue, boolean z) {
        switch (this.f282888a) {
            case 15:
                Intrinsics.checkNotNullParameter(newIncomeAmountInput, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) ((IncomeScreen) this.f282889b).R2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(newIncomeAmountInput, "newIncomeAmountInput");
                y yVar = bVar.f94636t;
                xi0.b bVar2 = (xi0.b) ((xng.h) ((j2) yVar.f22677a).getValue()).f.getContent();
                if (bVar2 != null) {
                    bVar.H2(yVar, new wtl.f(bVar, 24, newIncomeAmountInput, bVar2));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(newIncomeAmountInput, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((SharedCreateAlertRevampedScreen) this.f282889b).Z.onNext(formattedValue);
                break;
        }
    }

    public Flow l(List scopes, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (scopes.isEmpty()) {
            return zi0.c.i(f0.f322471a);
        }
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p0 p0Var = (p0) this.f282889b;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(p0Var.d.b(Unit.f186387a, loadingStrategy), new x5f.m(scopes, 7));
    }

    @Override // tji.n
    public void show() {
        ((kz0.a) this.f282889b).show();
    }

    @Override // zje.b
    public Flow stream() {
        return ((zje.n) this.f282889b).u.B(new zii.c(16));
    }

    public a(dnm.a checkDigit) {
        this.f282888a = 23;
        Intrinsics.checkNotNullParameter(checkDigit, "checkDigit");
        this.f282889b = checkDigit;
    }

    public a(lr.e repository) {
        this.f282888a = 21;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f282889b = repository;
    }

    public a(v7k.f paymentLinkDetailsNotOwnerHeaderMapper, v7k.c paymentLinkDetailsNotOwnerContentMapper) {
        this.f282888a = 1;
        Intrinsics.checkNotNullParameter(paymentLinkDetailsNotOwnerHeaderMapper, "paymentLinkDetailsNotOwnerHeaderMapper");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsNotOwnerContentMapper, "paymentLinkDetailsNotOwnerContentMapper");
        this.f282889b = paymentLinkDetailsNotOwnerContentMapper;
    }

    public a(zzl.b regexMatcher) {
        this.f282888a = 22;
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f282889b = regexMatcher;
    }

    public a(j apmAreaMapper) {
        this.f282888a = 13;
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        this.f282889b = apmAreaMapper;
    }

    public a(l80.e dateProvider) {
        this.f282888a = 8;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f282889b = dateProvider;
    }

    public a(w80.b uiAmountFormatter) {
        this.f282888a = 4;
        Intrinsics.checkNotNullParameter(uiAmountFormatter, "uiAmountFormatter");
        this.f282889b = uiAmountFormatter;
    }

    public a(xh5.a cryptoFeatureEnabledInteractor) {
        this.f282888a = 9;
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f282889b = cryptoFeatureEnabledInteractor;
    }

    public a(yof.k transferReviewMapper) {
        this.f282888a = 18;
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        this.f282889b = transferReviewMapper;
    }

    public a(e8h.j repository) {
        this.f282888a = 11;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f282889b = repository;
    }

    public a(zy5.i resolveStoryHelper, l storyToActionsProvider) {
        this.f282888a = 28;
        Intrinsics.checkNotNullParameter(resolveStoryHelper, "resolveStoryHelper");
        Intrinsics.checkNotNullParameter(storyToActionsProvider, "storyToActionsProvider");
        this.f282889b = storyToActionsProvider;
    }

    public a(FingerprintManagerCompat fingerprintManager) {
        this.f282888a = 3;
        Intrinsics.checkNotNullParameter(fingerprintManager, "fingerprintManager");
        this.f282889b = fingerprintManager;
    }

    public a(on2.b accountSwitchingFeatureChecker) {
        this.f282888a = 14;
        Intrinsics.checkNotNullParameter(accountSwitchingFeatureChecker, "accountSwitchingFeatureChecker");
        this.f282889b = accountSwitchingFeatureChecker;
    }

    public a(qac.i trackingRepository) {
        this.f282888a = 5;
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        this.f282889b = trackingRepository;
    }

    public a(wcf.a fiatExchangeOrderQuoteRepository) {
        this.f282888a = 24;
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteRepository, "fiatExchangeOrderQuoteRepository");
        this.f282889b = fiatExchangeOrderQuoteRepository;
    }

    public a(p0 wealthDisclaimersRepository) {
        this.f282888a = 12;
        Intrinsics.checkNotNullParameter(wealthDisclaimersRepository, "wealthDisclaimersRepository");
        this.f282889b = wealthDisclaimersRepository;
    }

    public a(ne0.d memoryCache) {
        this.f282888a = 17;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f282889b = memoryCache;
    }

    public a(FiatExchangeOrderQuoteService service) {
        this.f282888a = 6;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f282889b = service;
    }

    public a(gp6.a aVar) {
        this.f282888a = 16;
        this.f282889b = aVar;
        e4m.b.b(new f3(this, 5));
    }

    public a(ExternalEntryFlowImpl externalEntryFlowImpl) {
        this.f282888a = 26;
        this.f282889b = new q(externalEntryFlowImpl.m2());
    }

    public a(e2 productAccountRepository) {
        this.f282888a = 2;
        Intrinsics.checkNotNullParameter(productAccountRepository, "productAccountRepository");
        this.f282889b = productAccountRepository;
    }

    public a(InvestmentProjectionsScreen investmentProjectionsScreen) {
        this.f282888a = 27;
        this.f282889b = investmentProjectionsScreen.T;
    }

    public a(BondDetailsController bondDetailsController) {
        this.f282888a = 10;
        this.f282889b = bondDetailsController.P;
    }
}
