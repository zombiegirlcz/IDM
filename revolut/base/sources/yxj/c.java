package yxj;

import aa0.b0;
import aa0.c0;
import aa0.g0;
import aa0.i1;
import aa0.j0;
import aa0.l0;
import aa0.z;
import ael.h;
import ael.h0;
import ael.q0;
import android.content.Context;
import android.print.PrintManager;
import c4f.u;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import cli.n;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.credit.loan.autopay.impl.network.LoanAutopayService;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerContract$InputData;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$State;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Step;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$State;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import com.revolut.shared.feature.wealth.domain.impl.data.network.BuyBlockService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.IndexesService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.InstrumentDetailsService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.InstrumentStatsService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.InstrumentTickerService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.IpoInstrumentService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.PaperTradingService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.PerformanceParametersService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.PortfolioService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.PortfolioSettingsService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.StockExchangeService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.TradingChartsService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.TradingStatementsService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.config.TradingConfigService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.dividends.DividendsService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountsService;
import dcl.a0;
import dcl.d0;
import dcl.g;
import dcl.i0;
import dcl.k;
import dcl.k0;
import dcl.m;
import dcl.n0;
import dcl.o0;
import dcl.p0;
import dcl.q;
import dcl.r;
import dcl.r0;
import dcl.t;
import dcl.u0;
import dcl.w0;
import fdl.d1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import ne0.j;
import qc0.g1;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rlm.o;
import s56.i;
import t80.e;
import te0.w;
import ulm.b1;
import vc.s;
import vdl.h1;
import vdl.l1;
import vdl.t0;
import vdl.w1;
import vdl.x0;
import vdl.y;
import vdl.y0;
import wli.x;
import ybl.l;
import yma.e0;
import yma.p;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f317710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f317711c;

    public /* synthetic */ c(Object obj2, int i, int i2) {
        this.f317709a = i2;
        this.f317711c = obj2;
        this.f317710b = i;
    }

    private final Object a() {
        zdl.c cVar = (zdl.c) this.f317711c;
        final int i = 0;
        int i2 = this.f317710b;
        switch (i2) {
            case 0:
                return new ne0.d();
            case 1:
                return r6.b.n(rcl.b.Companion);
            case 2:
                return r6.b.n(rcl.b.Companion);
            case 3:
                je0.d mapper = cVar.f321540a.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = cVar.f321542b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = cVar.f321540a.f();
                s.j(storageFactory);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.c(storageFactory, databaseSessionProvider, "invest_buy_block", mapper, 0, 24);
            case 4:
                je0.d mapper2 = cVar.f321540a.b();
                s.j(mapper2);
                yk0.a databaseSessionProvider2 = cVar.f321542b.b();
                s.j(databaseSessionProvider2);
                xe0.f storageFactory2 = cVar.f321540a.f();
                s.j(storageFactory2);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider2, "instruments", mapper2, 5, v.k(new bcl.c(), new bcl.d(), new bcl.e(), new bcl.f()), 32);
            case 5:
                je0.d mapper3 = cVar.f321540a.b();
                s.j(mapper3);
                yk0.a databaseSessionProvider3 = cVar.f321542b.b();
                s.j(databaseSessionProvider3);
                xe0.f storageFactory3 = cVar.f321540a.f();
                s.j(storageFactory3);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                int i3 = 5;
                int i5 = 3;
                int i6 = 4;
                return xe0.f.f(storageFactory3, databaseSessionProvider3, "portfolio", mapper3, 5, v.k(udl.a.d, new exa.a(2, i5, i3), new exa.a(i5, i6, i3), new exa.a(i6, i3, i3)), 32);
            case 6:
                je0.d mapper4 = cVar.f321540a.b();
                s.j(mapper4);
                yk0.a databaseSessionProvider4 = cVar.f321542b.b();
                s.j(databaseSessionProvider4);
                xe0.f storageFactory4 = cVar.f321540a.f();
                s.j(storageFactory4);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                return xe0.f.f(storageFactory4, databaseSessionProvider4, "statements", mapper4, 1, f0.f322471a, 32);
            case 7:
                je0.d mapper5 = cVar.f321540a.b();
                s.j(mapper5);
                yk0.a databaseSessionProvider5 = cVar.f321542b.b();
                s.j(databaseSessionProvider5);
                xe0.f storageFactory5 = cVar.f321540a.f();
                s.j(storageFactory5);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper5, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider5, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory5, "storageFactory");
                return xe0.f.f(storageFactory5, databaseSessionProvider5, "chart_storage", mapper5, 4, v.k(new bcl.a(), new bcl.b(), new exa.a(3, 4, 5)), 32);
            case 8:
                je0.d mapper6 = cVar.f321540a.b();
                s.j(mapper6);
                yk0.a databaseSessionProvider6 = cVar.f321542b.b();
                s.j(databaseSessionProvider6);
                xe0.f storageFactory6 = cVar.f321540a.f();
                s.j(storageFactory6);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper6, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider6, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory6, "storageFactory");
                return xe0.f.f(storageFactory6, databaseSessionProvider6, "stock_exchange_storage", mapper6, 0, null, 56);
            case 9:
                je0.d mapper7 = cVar.f321540a.d();
                s.j(mapper7);
                yk0.a databaseSessionProvider7 = cVar.f321542b.b();
                s.j(databaseSessionProvider7);
                xe0.f storageFactory7 = cVar.f321540a.f();
                s.j(storageFactory7);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper7, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider7, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory7, "storageFactory");
                return xe0.f.f(storageFactory7, databaseSessionProvider7, "indexes_storage", mapper7, 1, f0.f322471a, 32);
            case 10:
                je0.d mapper8 = cVar.f321540a.b();
                s.j(mapper8);
                yk0.a databaseSessionProvider8 = cVar.f321542b.b();
                s.j(databaseSessionProvider8);
                xe0.f storageFactory8 = cVar.f321540a.f();
                s.j(storageFactory8);
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper8, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider8, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory8, "storageFactory");
                return xe0.f.f(storageFactory8, databaseSessionProvider8, "performance_parameters_storage", mapper8, 1, f0.f322471a, 32);
            case 11:
                an0.c cVar2 = cVar.f321542b;
                ee0.a aVar = cVar.f321540a;
                yk0.a databaseSessionProvider9 = cVar2.b();
                s.j(databaseSessionProvider9);
                xe0.f storageFactory9 = aVar.f();
                s.j(storageFactory9);
                me0.a jsonObjectMapperFactory = aVar.e();
                s.j(jsonObjectMapperFactory);
                Json dividendsJson = (Json) cVar.f321570y.get();
                acl.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(databaseSessionProvider9, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory9, "storageFactory");
                Intrinsics.checkNotNullParameter(jsonObjectMapperFactory, "jsonObjectMapperFactory");
                Intrinsics.checkNotNullParameter(dividendsJson, "dividendsJson");
                return xe0.f.f(storageFactory9, databaseSessionProvider9, "dividends_storage", jsonObjectMapperFactory.a(dividendsJson), 1, f0.f322471a, 32);
            case 12:
                cdl.c cVar3 = cVar.f321544c;
                ddl.a jsonProvider = new ddl.a(fe0.d.a());
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = jsonProvider.f113260a;
                s.k(oVar);
                return oVar;
            case 13:
                Context context = cVar.d;
                yk0.a databaseSessionProvider10 = cVar.f321542b.b();
                s.j(databaseSessionProvider10);
                de0.a databaseEncryptionMigratorFactory = ((cl0.a) cVar.e).a();
                s.j(databaseEncryptionMigratorFactory);
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider10, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                WealthDomainDatabase.Companion aVar2 = WealthDomainDatabase.INSTANCE;
                aVar2.getClass();
                WealthDomainDatabase wealthDomainDatabase = (WealthDomainDatabase) aVar2.a(context, databaseSessionProvider10, WealthDomainDatabase.f, databaseEncryptionMigratorFactory);
                s.k(wealthDomainDatabase);
                return wealthDomainDatabase;
            case 14:
                return new ydl.b();
            case 15:
                InstrumentTickerService instrumentTickerService = (InstrumentTickerService) cVar.D.get();
                a0 a0Var = (a0) cVar.E.get();
                d0 d0Var = (d0) cVar.F.get();
                w4l.f fVar = (w4l.f) cVar.H.get();
                qe0.s sVar = (qe0.s) cVar.G.get();
                CoroutineScope coroutineScopeA = cVar.i.a();
                s.j(coroutineScopeA);
                return new y(instrumentTickerService, a0Var, d0Var, fVar, sVar, coroutineScopeA);
            case 16:
                cdl.c cVar4 = cVar.f321544c;
                InstrumentTickerService instrumentTickerService2 = (InstrumentTickerService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", InstrumentTickerService.class, "create(...)");
                s.k(instrumentTickerService2);
                return instrumentTickerService2;
            case 17:
                cdl.c cVar5 = cVar.f321544c;
                Retrofit retrofit = ((nj0.d) cVar.f).f();
                gfl.a wealthNetworkConfiguration = cVar.f321547g.f161039a;
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(wealthNetworkConfiguration, "wealthNetworkConfiguration");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                builderNewBuilder.converterFactories().clear();
                builderNewBuilder.addConverterFactory(GsonConverterFactory.create(zbl.a.a()));
                builderNewBuilder.baseUrl(wealthNetworkConfiguration.getHostUrl());
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 18:
                WealthDomainDatabase db8 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db8, "db");
                a0 a0VarU = db8.u();
                s.k(a0VarU);
                return a0VarU;
            case 19:
                WealthDomainDatabase db10 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db10, "db");
                d0 d0VarV = db10.v();
                s.k(d0VarV);
                return d0VarV;
            case 20:
                d4m.a aVarA = e4m.b.a(cVar.D);
                d4m.a aVarA2 = e4m.b.a(cVar.F);
                b80.c cVarP = cVar.f321548h.p();
                s.j(cVarP);
                final scl.c dodProvider = new scl.c(aVarA, aVarA2, cVarP, (ue0.c) cVar.f321559r.get(), r6.b.n(rcl.b.Companion), (qe0.s) cVar.G.get());
                Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
                final int i21 = 1;
                final int i22 = 2;
                return new w4l.f(w.k0(cVarP, new Function1() { // from class: scl.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit it8 = (Unit) obj2;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                c cVar6 = dodProvider;
                                String str = (String) cVar6.f261763c.T2("INSTRUMENTS_NEXT_PAGE", String.class);
                                efm.d0<Response<d1>> instruments = ((InstrumentTickerService) cVar6.f261761a.get()).getInstruments(str);
                                sc7.g gVar = new sc7.g(new s31.a(cVar6, str, 25), 14);
                                instruments.getClass();
                                ufm.i iVar = new ufm.i(instruments, gVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) dodProvider.d.get("INSTRUMENTS");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "<unused var>");
                                ArrayList arrayListA = dodProvider.a();
                                if (arrayListA.isEmpty()) {
                                    return null;
                                }
                                return arrayListA;
                        }
                    }
                }), new Function1() { // from class: scl.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit it8 = (Unit) obj2;
                        switch (i21) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                c cVar6 = dodProvider;
                                String str = (String) cVar6.f261763c.T2("INSTRUMENTS_NEXT_PAGE", String.class);
                                efm.d0<Response<d1>> instruments = ((InstrumentTickerService) cVar6.f261761a.get()).getInstruments(str);
                                sc7.g gVar = new sc7.g(new s31.a(cVar6, str, 25), 14);
                                instruments.getClass();
                                ufm.i iVar = new ufm.i(instruments, gVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) dodProvider.d.get("INSTRUMENTS");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "<unused var>");
                                ArrayList arrayListA = dodProvider.a();
                                if (arrayListA.isEmpty()) {
                                    return null;
                                }
                                return arrayListA;
                        }
                    }
                }, new s42.f(dodProvider, 27), new Function1() { // from class: scl.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit it8 = (Unit) obj2;
                        switch (i22) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                c cVar6 = dodProvider;
                                String str = (String) cVar6.f261763c.T2("INSTRUMENTS_NEXT_PAGE", String.class);
                                efm.d0<Response<d1>> instruments = ((InstrumentTickerService) cVar6.f261761a.get()).getInstruments(str);
                                sc7.g gVar = new sc7.g(new s31.a(cVar6, str, 25), 14);
                                instruments.getClass();
                                ufm.i iVar = new ufm.i(instruments, gVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            case 1:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) dodProvider.d.get("INSTRUMENTS");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "<unused var>");
                                ArrayList arrayListA = dodProvider.a();
                                if (arrayListA.isEmpty()) {
                                    return null;
                                }
                                return arrayListA;
                        }
                    }
                }, null, null, null, null, 240);
            case 21:
                ze0.a forceReloadStrategyFactory = cVar.f321540a.a();
                s.j(forceReloadStrategyFactory);
                Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
                return ((ze0.c) forceReloadStrategyFactory).b(TimeUnit.MINUTES.toMillis(2L));
            case 22:
                InstrumentDetailsService instrumentDetailsService = (InstrumentDetailsService) cVar.J.get();
                i0 i0Var = (i0) cVar.K.get();
                WealthDomainDatabase db11 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db11, "db");
                dcl.w wVarS = db11.s();
                s.k(wVarS);
                WealthDomainDatabase db12 = (WealthDomainDatabase) cVar.A.get();
                Intrinsics.checkNotNullParameter(db12, "db");
                r rVarQ = db12.q();
                s.k(rVarQ);
                WealthDomainDatabase db13 = (WealthDomainDatabase) cVar.A.get();
                Intrinsics.checkNotNullParameter(db13, "db");
                q qVarP = db13.p();
                s.k(qVarP);
                g gVar = (g) cVar.L.get();
                dcl.a aVar3 = (dcl.a) cVar.M.get();
                dcl.e eVar = (dcl.e) cVar.N.get();
                k kVar = (k) cVar.O.get();
                WealthDomainDatabase db14 = (WealthDomainDatabase) cVar.A.get();
                Intrinsics.checkNotNullParameter(db14, "db");
                p0 p0VarZ = db14.z();
                s.k(p0VarZ);
                r0 r0Var = (r0) cVar.P.get();
                dcl.y yVar = (dcl.y) cVar.Q.get();
                j jVar = (j) cVar.f321554n.get();
                CoroutineScope coroutineScopeA2 = cVar.i.a();
                s.j(coroutineScopeA2);
                b80.c cVarP2 = cVar.f321548h.p();
                s.j(cVarP2);
                return new vdl.o(instrumentDetailsService, i0Var, wVarS, rVarQ, qVarP, gVar, aVar3, eVar, kVar, p0VarZ, r0Var, yVar, jVar, coroutineScopeA2, cVarP2);
            case 23:
                cdl.c cVar6 = cVar.f321544c;
                InstrumentDetailsService instrumentDetailsService2 = (InstrumentDetailsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", InstrumentDetailsService.class, "create(...)");
                s.k(instrumentDetailsService2);
                return instrumentDetailsService2;
            case 24:
                WealthDomainDatabase db15 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db15, "db");
                i0 i0VarO = db15.o();
                s.k(i0VarO);
                return i0VarO;
            case 25:
                WealthDomainDatabase db16 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db16, "db");
                g gVarK = db16.k();
                s.k(gVarK);
                return gVarK;
            case 26:
                WealthDomainDatabase db17 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db17, "db");
                dcl.a aVarG = db17.g();
                s.k(aVarG);
                return aVarG;
            case 27:
                WealthDomainDatabase db18 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db18, "db");
                dcl.e eVarJ = db18.j();
                s.k(eVarJ);
                return eVarJ;
            case 28:
                WealthDomainDatabase db19 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db19, "db");
                k kVarM = db19.m();
                s.k(kVarM);
                return kVarM;
            case 29:
                WealthDomainDatabase db20 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db20, "db");
                r0 r0VarA = db20.A();
                s.k(r0VarA);
                return r0VarA;
            case 30:
                WealthDomainDatabase db21 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db21, "db");
                dcl.y yVarT = db21.t();
                s.k(yVarT);
                return yVarT;
            case 31:
                j jVar2 = (j) cVar.f321554n.get();
                PortfolioSettingsService portfolioSettingsService = (PortfolioSettingsService) cVar.S.get();
                b80.c cVarP3 = cVar.f321548h.p();
                s.j(cVarP3);
                return new t0(jVar2, portfolioSettingsService, cVarP3, (w0) cVar.T.get());
            case 32:
                cdl.c cVar7 = cVar.f321544c;
                PortfolioSettingsService portfolioSettingsService2 = (PortfolioSettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", PortfolioSettingsService.class, "create(...)");
                s.k(portfolioSettingsService2);
                return portfolioSettingsService2;
            case 33:
                WealthDomainDatabase db22 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db22, "db");
                w0 w0VarC = db22.C();
                s.k(w0VarC);
                return w0VarC;
            case 34:
                return new vdl.i0((x4l.c) cVar.W.get());
            case 35:
                k18.c dodProvider2 = new k18.c((PerformanceParametersService) cVar.V.get(), (ue0.c) cVar.f321568x.get(), r6.b.n(rcl.b.Companion));
                Intrinsics.checkNotNullParameter(dodProvider2, "dodProvider");
                Continuation continuation = null;
                return new x4l.c(new pti.d(dodProvider2, continuation, 20), new s78.d(dodProvider2, 29), new s42.f(dodProvider2, 28), new i(dodProvider2, continuation, 24), new pfk.q(dodProvider2, continuation, 25));
            case 36:
                cdl.c cVar8 = cVar.f321544c;
                PerformanceParametersService performanceParametersService = (PerformanceParametersService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", PerformanceParametersService.class, "create(...)");
                s.k(performanceParametersService);
                return performanceParametersService;
            case 37:
                return new ael.b((vdl.d) cVar.f321541a0.get());
            case 38:
                return new vdl.d((BuyBlockService) cVar.Z.get(), (j) cVar.f321554n.get(), (ue0.c) cVar.f321558q.get());
            case 39:
                cdl.c cVar9 = cVar.f321544c;
                BuyBlockService buyBlockService = (BuyBlockService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.Y.get(), "retrofit", BuyBlockService.class, "create(...)");
                s.k(buyBlockService);
                return buyBlockService;
            case 40:
                cdl.c cVar10 = cVar.f321544c;
                ik0.b retrofitFactory = ((nj0.d) cVar.f).m();
                s.j(retrofitFactory);
                Json json = fe0.d.a();
                gfl.a wealthNetworkConfiguration2 = cVar.f321547g.f161039a;
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(wealthNetworkConfiguration2, "wealthNetworkConfiguration");
                Retrofit retrofitA = ik0.b.a(retrofitFactory, null, wealthNetworkConfiguration2.getHostUrl(), p.a.g(b1.Companion, "application/json", json), null, 25);
                s.k(retrofitA);
                return retrofitA;
            case 41:
                e4m.e eVar2 = cVar.f0;
                c4f.k dependency = cVar.f321550j;
                w1 repository = (w1) eVar2.get();
                l tradingConfigInteractor = cVar.k.a();
                s.j(tradingConfigInteractor);
                ybl.f statementFileDownloader = (ybl.f) dependency.f21227j.get();
                s.j(statementFileDownloader);
                gte.a featureToggleInteractor = cVar.f321552l.b();
                s.j(featureToggleInteractor);
                rcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "interactor");
                Intrinsics.checkNotNullParameter(statementFileDownloader, "statementFileDownloader");
                Intrinsics.checkNotNullParameter(dependency, "dependency");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                ((u) dependency.k.get()).getClass();
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(repository, "repository");
                r10.w wVar = new r10.w();
                wVar.f250865a = tradingConfigInteractor;
                wVar.f250866b = repository;
                return new ael.b1(repository, statementFileDownloader, wVar, featureToggleInteractor);
            case 42:
                TradingStatementsService tradingStatementsService = (TradingStatementsService) cVar.c0.get();
                ne0.d dVarN = r6.b.n(rcl.b.Companion);
                ecl.b bVar = (ecl.b) cVar.f321545d0.get();
                ecl.d dVar = (ecl.d) cVar.f321546e0.get();
                ue0.c cVar11 = (ue0.c) cVar.f321563t.get();
                twg.c cVarA = cVar.f321550j.a();
                b80.c cVarP4 = cVar.f321548h.p();
                s.j(cVarP4);
                return new w1(tradingStatementsService, dVarN, bVar, dVar, cVar11, cVarA, cVarP4);
            case 43:
                cdl.c cVar12 = cVar.f321544c;
                TradingStatementsService tradingStatementsService2 = (TradingStatementsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", TradingStatementsService.class, "create(...)");
                s.k(tradingStatementsService2);
                return tradingStatementsService2;
            case 44:
                WealthDomainDatabase db23 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db23, "db");
                ecl.b bVarD = db23.D();
                s.k(bVarD);
                return bVarD;
            case 45:
                WealthDomainDatabase db24 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db24, "db");
                ecl.d dVarE = db24.E();
                s.k(dVarE);
                return dVarE;
            case 46:
                ue0.c cVar13 = (ue0.c) cVar.f321561s.get();
                ne0.d dVarN2 = r6.b.n(rcl.b.Companion);
                b80.c cVarP5 = cVar.f321548h.p();
                s.j(cVarP5);
                return new vdl.p0(cVar13, dVarN2, cVarP5, (u0) cVar.f321549h0.get(), (m) cVar.i0.get(), (PortfolioService) cVar.j0.get(), cVar.f321550j.a(), (x4l.c) cVar.W.get());
            case 47:
                WealthDomainDatabase db25 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db25, "db");
                u0 u0VarB = db25.B();
                s.k(u0VarB);
                return u0VarB;
            case 48:
                WealthDomainDatabase db26 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db26, "db");
                m mVarN = db26.n();
                s.k(mVarN);
                return mVarN;
            case 49:
                cdl.c cVar14 = cVar.f321544c;
                PortfolioService portfolioService = (PortfolioService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", PortfolioService.class, "create(...)");
                s.k(portfolioService);
                return portfolioService;
            case 50:
                return new ael.y((vdl.p0) cVar.f321551k0.get());
            case 51:
                b80.c cVarP6 = cVar.f321548h.p();
                s.j(cVarP6);
                WealthDomainDatabase db27 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db27, "db");
                t tVarR = db27.r();
                s.k(tVarR);
                ue0.c cVar15 = (ue0.c) cVar.u.get();
                TradingChartsService tradingChartsService = (TradingChartsService) cVar.m0.get();
                ne0.d dVarN3 = r6.b.n(rcl.b.Companion);
                qe0.s sVar2 = (qe0.s) cVar.f321555n0.get();
                gte.a aVarB = cVar.f321552l.b();
                s.j(aVarB);
                l80.e eVarH = cVar.f321548h.h();
                s.j(eVarH);
                return new l1(cVarP6, tVarR, cVar15, tradingChartsService, dVarN3, sVar2, aVarB, eVarH);
            case 52:
                cdl.c cVar16 = cVar.f321544c;
                TradingChartsService tradingChartsService2 = (TradingChartsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", TradingChartsService.class, "create(...)");
                s.k(tradingChartsService2);
                return tradingChartsService2;
            case 53:
                ze0.a forceReloadStrategyFactory2 = cVar.f321540a.a();
                s.j(forceReloadStrategyFactory2);
                ue0.c storage = (ue0.c) cVar.u.get();
                rcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(forceReloadStrategyFactory2, "forceReloadStrategyFactory");
                Intrinsics.checkNotNullParameter(storage, "storage");
                return ((ze0.c) forceReloadStrategyFactory2).a(storage, TimeUnit.MINUTES.toMillis(5L));
            case 54:
                e4m.e eVar3 = cVar.m0;
                l70.e eVar4 = cVar.f321548h;
                TradingChartsService tradingChartsService3 = (TradingChartsService) eVar3.get();
                WealthDomainDatabase db28 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db28, "db");
                dcl.o oVarI = db28.i();
                s.k(oVarI);
                ue0.c cVar17 = (ue0.c) cVar.u.get();
                ne0.d dVarN4 = r6.b.n(rcl.b.Companion);
                l80.e eVarH2 = eVar4.h();
                s.j(eVarH2);
                qe0.s sVar3 = (qe0.s) cVar.f321555n0.get();
                gte.a aVarB2 = cVar.f321552l.b();
                s.j(aVarB2);
                b80.c cVarP7 = eVar4.p();
                s.j(cVarP7);
                return new vdl.d1(tradingChartsService3, oVarI, cVar17, dVarN4, eVarH2, sVar3, aVarB2, cVarP7);
            case 55:
                return new ael.k((xbl.c) cVar.I.get(), (ael.e) cVar.q0.get());
            case 56:
                return new ael.g();
            case 57:
                return new ael.d0((xbl.c) cVar.I.get(), (xbl.a) cVar.R.get(), (x0) cVar.f321564t0.get());
            case 58:
                StockExchangeService stockExchangeService = (StockExchangeService) cVar.f321562s0.get();
                l80.e eVarH3 = cVar.f321548h.h();
                s.j(eVarH3);
                return new x0(stockExchangeService, eVarH3, (j) cVar.f321554n.get(), (ue0.c) cVar.v.get());
            case 59:
                cdl.c cVar18 = cVar.f321544c;
                StockExchangeService stockExchangeService2 = (StockExchangeService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", StockExchangeService.class, "create(...)");
                s.k(stockExchangeService2);
                return stockExchangeService2;
            case 60:
                return new h((vdl.r) cVar.f321567w0.get());
            case 61:
                InstrumentStatsService instrumentStatsService = (InstrumentStatsService) cVar.f321565v0.get();
                WealthDomainDatabase db29 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db29, "db");
                k0 k0VarW = db29.w();
                s.k(k0VarW);
                WealthDomainDatabase db30 = (WealthDomainDatabase) cVar.A.get();
                Intrinsics.checkNotNullParameter(db30, "db");
                dcl.i iVarL = db30.l();
                s.k(iVarL);
                WealthDomainDatabase db31 = (WealthDomainDatabase) cVar.A.get();
                Intrinsics.checkNotNullParameter(db31, "db");
                dcl.c cVarH = db31.h();
                s.k(cVarH);
                j jVar3 = (j) cVar.f321554n.get();
                b80.c cVarP8 = cVar.f321548h.p();
                s.j(cVarP8);
                return new vdl.r(instrumentStatsService, k0VarW, iVarL, cVarH, jVar3, cVarP8);
            case 62:
                cdl.c cVar19 = cVar.f321544c;
                InstrumentStatsService instrumentStatsService2 = (InstrumentStatsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.C.get(), "retrofit", InstrumentStatsService.class, "create(...)");
                s.k(instrumentStatsService2);
                return instrumentStatsService2;
            case 63:
                return new ael.q();
            case 64:
                return new ael.w();
            case 65:
                ael.q qVar = (ael.q) cVar.y0.get();
                ael.r rVar = (ael.r) cVar.A0.get();
                ael.w wVar2 = (ael.w) cVar.z0.get();
                ybl.d dVar2 = (ybl.d) cVar.l0.get();
                k9l.a aVarA3 = cVar.f321553m.a();
                s.j(aVarA3);
                return new ael.t(qVar, rVar, wVar2, dVar2, aVarA3, (ybl.b) cVar.f321560r0.get());
            case 66:
                rcl.b.Companion.getClass();
                return new ael.r();
            case 67:
                j jVar4 = (j) cVar.o.get();
                ue0.c cVar20 = (ue0.c) cVar.f321566w.get();
                IndexesService indexesService = (IndexesService) cVar.C0.get();
                b80.c cVarP9 = cVar.f321548h.p();
                s.j(cVarP9);
                return new vdl.h(jVar4, cVar20, indexesService, cVarP9);
            case 68:
                cdl.c cVar21 = cVar.f321544c;
                IndexesService indexesService2 = (IndexesService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.Y.get(), "retrofit", IndexesService.class, "create(...)");
                s.k(indexesService2);
                return indexesService2;
            case 69:
                IpoInstrumentService ipoInstrumentService = (IpoInstrumentService) cVar.E0.get();
                n0 n0Var = (n0) cVar.F0.get();
                o0 o0Var = (o0) cVar.G0.get();
                j jVar5 = (j) cVar.f321554n.get();
                b80.c cVarP10 = cVar.f321548h.p();
                s.j(cVarP10);
                return new vdl.d0(ipoInstrumentService, n0Var, o0Var, jVar5, cVarP10);
            case 70:
                cdl.c cVar22 = cVar.f321544c;
                IpoInstrumentService ipoInstrumentService2 = (IpoInstrumentService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.Y.get(), "retrofit", IpoInstrumentService.class, "create(...)");
                s.k(ipoInstrumentService2);
                return ipoInstrumentService2;
            case 71:
                WealthDomainDatabase db32 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db32, "db");
                n0 n0VarX = db32.x();
                s.k(n0VarX);
                return n0VarX;
            case 72:
                WealthDomainDatabase db33 = (WealthDomainDatabase) cVar.A.get();
                fcl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db33, "db");
                o0 o0VarY = db33.y();
                s.k(o0VarY);
                return o0VarY;
            case 73:
                ue0.c cVar23 = (ue0.c) cVar.z.get();
                j jVar6 = (j) cVar.f321557p.get();
                b80.c cVarP11 = cVar.f321548h.p();
                s.j(cVarP11);
                return new vdl.f(cVar23, jVar6, cVarP11, (DividendsService) cVar.J0.get());
            case 74:
                cdl.c cVar24 = cVar.f321544c;
                DividendsService dividendsService = (DividendsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.I0.get(), "retrofit", DividendsService.class, "create(...)");
                s.k(dividendsService);
                return dividendsService;
            case 75:
                cdl.c cVar25 = cVar.f321544c;
                ik0.b retrofitFactory2 = ((nj0.d) cVar.f).m();
                s.j(retrofitFactory2);
                Json json2 = (Json) cVar.f321570y.get();
                gfl.a wealthNetworkConfiguration3 = cVar.f321547g.f161039a;
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(json2, "json");
                Intrinsics.checkNotNullParameter(wealthNetworkConfiguration3, "wealthNetworkConfiguration");
                Retrofit retrofitA2 = ik0.b.a(retrofitFactory2, null, wealthNetworkConfiguration3.getHostUrl(), p.a.g(b1.Companion, "application/json", json2), null, 25);
                s.k(retrofitA2);
                return retrofitA2;
            default:
                throw new AssertionError(i2);
        }
    }

    private final Object b() {
        zdl.f fVar = (zdl.f) this.f317711c;
        Continuation continuation = null;
        int i = this.f317710b;
        switch (i) {
            case 0:
                e4m.e eVar = fVar.o;
                c4f.k kVar = fVar.e;
                y0 y0Var = (y0) eVar.get();
                d4f.s sVarB = kVar.b();
                zjh.c cVar = new zjh.c(kVar.f21224c.e());
                ybl.b bVarB = fVar.f.b();
                s.j(bVarB);
                CoroutineScope coroutineScope = (CoroutineScope) fVar.f321585p.get();
                vbl.b bVar = (vbl.b) kVar.f21228l.get();
                s.j(bVar);
                return new q0(y0Var, sVarB, cVar, bVarB, coroutineScope, bVar, fVar.a());
            case 1:
                return new y0((x4l.c) fVar.f321583m.get(), (x4l.c) fVar.f321584n.get(), (TradingAccountsService) fVar.f321582l.get());
            case 2:
                scl.j tradingProductDetailsDodProvider = new scl.j((j) fVar.f321579g.get(), (ue0.c) fVar.f321581j.get(), (TradingAccountsService) fVar.f321582l.get());
                Intrinsics.checkNotNullParameter(tradingProductDetailsDodProvider, "tradingProductDetailsDodProvider");
                return new x4l.c(new pti.d(tradingProductDetailsDodProvider, continuation, 21), new scl.e(tradingProductDetailsDodProvider, 1), new scl.h(tradingProductDetailsDodProvider, 0), new i(tradingProductDetailsDodProvider, continuation, 25), new pfk.q(tradingProductDetailsDodProvider, continuation, 26));
            case 3:
                acl.f.Companion.getClass();
                return new ne0.d();
            case 4:
                je0.d mapper = (je0.d) fVar.i.get();
                yk0.a databaseSessionProvider = fVar.f321577b.b();
                s.j(databaseSessionProvider);
                xe0.f fVarF = fVar.f321576a.f();
                s.j(fVarF);
                acl.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                exa.a aVarC = v0.a.c(fVarF, "storageFactory", 1, 2);
                int i2 = 5;
                int i3 = 3;
                exa.a aVar = new exa.a(2, i3, i2);
                int i5 = 4;
                exa.a aVar2 = new exa.a(i3, i5, i2);
                int i6 = 5;
                exa.a aVar3 = new exa.a(i5, i6, i2);
                int i21 = 6;
                return xe0.f.f(fVarF, databaseSessionProvider, "trading_accounts", mapper, 7, v.k(aVarC, aVar, aVar2, aVar3, new exa.a(i6, i21, i2), new exa.a(i21, 7, i6)), 32);
            case 5:
                Json json = (Json) fVar.f321580h.get();
                me0.a factory = fVar.f321576a.e();
                s.j(factory);
                acl.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 6:
                ee0.a aVar4 = fVar.f321576a;
                Json baseJson = fe0.d.a();
                acl.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                return ue0.e.b(baseJson, new a9h.b(22));
            case 7:
                Retrofit retrofit = (Retrofit) fVar.k.get();
                cdl.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(TradingAccountsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TradingAccountsService tradingAccountsService = (TradingAccountsService) objCreate;
                s.k(tradingAccountsService);
                return tradingAccountsService;
            case 8:
                ik0.b retrofitFactory = ((nj0.d) fVar.f321578c).m();
                s.j(retrofitFactory);
                Json json2 = (Json) fVar.f321580h.get();
                gfl.a wealthNetworkConfiguration = fVar.d.f161039a;
                cdl.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(json2, "json");
                Intrinsics.checkNotNullParameter(wealthNetworkConfiguration, "wealthNetworkConfiguration");
                Retrofit retrofitA = ik0.b.a(retrofitFactory, null, wealthNetworkConfiguration.getHostUrl(), p.a.g(b1.Companion, "application/json", json2), null, 25);
                s.k(retrofitA);
                return retrofitA;
            case 9:
                scl.g tradingAccountsDodProvider = new scl.g((j) fVar.f321579g.get(), (ue0.c) fVar.f321581j.get(), (TradingAccountsService) fVar.f321582l.get());
                Intrinsics.checkNotNullParameter(tradingAccountsDodProvider, "tradingAccountsDodProvider");
                return new x4l.c(new pti.s(tradingAccountsDodProvider, continuation, 9), new scl.e(tradingAccountsDodProvider, 0), new s42.f(tradingAccountsDodProvider, 29), new s1k.b(tradingAccountsDodProvider, continuation, 25), new p24.q(tradingAccountsDodProvider, continuation, 29));
            case 10:
                rcl.d.Companion.getClass();
                return rd0.e.a(skm.p0.f264002b);
            case 11:
                e4m.e eVar2 = fVar.f321586q;
                c4f.k kVar2 = fVar.e;
                ybl.k kVar3 = (ybl.k) eVar2.get();
                Map mapA = fVar.a();
                d4f.s sVarB2 = kVar2.b();
                vbl.b bVar2 = (vbl.b) kVar2.f21228l.get();
                s.j(bVar2);
                return new h0(kVar3, mapA, sVarB2, bVar2);
            case 12:
                return new ael.i0(fVar.a(), (ybl.i) fVar.f321587r.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        zgi.a aVar = (zgi.a) this.f317711c;
        int i = this.f317710b;
        if (i == 0) {
            return new xgi.a((sri.m) aVar.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        Context context = aVar.f322125a;
        zgi.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    private final Object d() {
        zla.a aVar = (zla.a) this.f317711c;
        xmg.a aVar2 = aVar.f323203a;
        int i = this.f317710b;
        if (i == 0) {
            ang.f fVarE = aVar2.e();
            yme.a aVarA = aVar.f323204b.a();
            s.j(aVarA);
            return new bma.b(fVarE, aVarA);
        }
        if (i == 1) {
            return new bma.a(aVar2.e());
        }
        if (i == 2) {
            n8b.a aVarA2 = aVar.f323205c.a();
            s.j(aVarA2);
            dci.b bVar = (dci.b) aVar.d.f223714x.get();
            s.j(bVar);
            return new cma.d(aVarA2, bVar, aVar.e.g());
        }
        if (i == 3) {
            return new cma.e();
        }
        if (i == 4) {
            return new dma.a();
        }
        if (i == 5) {
            return new ama.a();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        zma.b bVar = (zma.b) this.f317711c;
        int i = this.f317710b;
        switch (i) {
            case 0:
                hri.b bVar2 = bVar.f323417a;
                return new ifm.b();
            case 1:
                hri.b bVar3 = bVar.f323417a;
                return new iri.j();
            case 2:
                return new cn.e();
            case 3:
                return new um.c();
            case 4:
                bVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 5:
                return new ln.c();
            case 6:
                return new ym.d();
            case 7:
                return new mm.d();
            case 8:
                return new sm.e();
            case 9:
                return new om.c();
            case 10:
                e4m.e eVar = bVar.v;
                lqi.a aVar = bVar.f323420g;
                l70.e eVar2 = bVar.f323418b;
                p pVar = (p) eVar.get();
                t70.g gVarO = eVar2.o();
                s.j(gVarO);
                v60.e eVarA = bVar.f.a();
                s.j(eVarA);
                o3l.e eVar3 = (o3l.e) bVar.f323431w.get();
                e80.i iVar = (e80.i) ((p41.b) aVar).f232802b.get();
                s.j(iVar);
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                c90.c cVarA = ((p41.b) aVar).a();
                s.j(cVarA);
                return new e0(pVar, gVarO, eVarA, eVar3, iVar, bVarN, cVarA, (g3l.a) bVar.f323432x.get());
            case 11:
                ifm.b bVar4 = (ifm.b) bVar.i.get();
                yma.c cVar = (yma.c) bVar.f323430t.get();
                o3l.d dVar = (o3l.d) bVar.u.get();
                ang.f fVarE = bVar.f323419c.e();
                sf0.h hVarB = bVar.d.b();
                s.j(hVarB);
                l80.h hVarV = bVar.f323418b.v();
                s.j(hVarV);
                return new p(bVar4, cVar, dVar, fVarE, hVarB, hVarV, bVar.e.a());
            case 12:
                return new yma.g((o3l.f) bVar.f323429s.get());
            case 13:
                return new o3l.s();
            case 14:
                o3l.f fVar = (o3l.f) bVar.f323429s.get();
                c70.a aVarZ = bVar.f323418b.z();
                s.j(aVarZ);
                return new o3l.j(fVar, aVarZ);
            case 15:
                return new o3l.r();
            case 16:
                return new g3l.g();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        zok.b bVar = (zok.b) this.f317711c;
        int i = this.f317710b;
        if (i == 0) {
            return new bo9.g(bVar.f324068a, bVar.f324069b, bVar.f324070c, bVar.d, bVar.e, bVar.f, bVar.f324071g, bVar.f324072h, 6);
        }
        if (i == 1) {
            return new a51.d(bVar.f324074l, 20);
        }
        if (i == 2) {
            pla.e eVar = (pla.e) ((zok.g) bVar.k.get()).b();
            s.k(eVar);
            return eVar;
        }
        if (i == 3) {
            return new zok.g(bVar.i);
        }
        if (i == 4) {
            return new zok.f();
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        zpc.r rVar = (zpc.r) this.f317711c;
        int i = this.f317710b;
        if (i != 0) {
            if (i == 1) {
                return new nrc.f();
            }
            throw new AssertionError(i);
        }
        n nVar = (n) rVar.e.get();
        TermsViewerContract$InputData termsViewerContract$InputData = rVar.f324287a;
        f01.c cVarG = rVar.d.i.g();
        orc.a aVar = orc.b.Companion;
        ViewController controller = rVar.f324288b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Object systemService = controller.m2().getSystemService("print");
        return new nrc.e(nVar, termsViewerContract$InputData, new prc.c(cVarG, systemService instanceof PrintManager ? (PrintManager) systemService : null, rVar.f324289c));
    }

    private final Object h() {
        int i = this.f317710b;
        if (i == 0) {
            return new arh.a((arh.b) ((zqh.a) this.f317711c).f324491b.get());
        }
        if (i == 1) {
            return new arh.b();
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        qc0.j router;
        Object eVar;
        Object aVar2;
        Object aVar3;
        int i = this.f317709a;
        int i2 = 4;
        int i3 = 2;
        int i5 = 1;
        int i6 = 0;
        int i21 = this.f317710b;
        Object obj2 = this.f317711c;
        switch (i) {
            case 0:
                if (i21 == 0) {
                    d dVar = (d) obj2;
                    return new eyj.f(dVar.f317712a, (jki.p) dVar.f317713b.get());
                }
                if (i21 == 1) {
                    return new eyj.g();
                }
                throw new AssertionError(i21);
            case 1:
                yyk.c cVar = (yyk.c) obj2;
                switch (i21) {
                    case 0:
                        hri.b bVar = cVar.f317978a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar2 = cVar.f317978a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        cVar.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        cVar.getClass();
                        return new xyk.e(new g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())));
                    case 7:
                        e4m.e eVar2 = cVar.W;
                        l70.e eVar3 = cVar.f317980b;
                        qc0.h hVar = (qc0.h) eVar2.get();
                        xyk.b bVar3 = (xyk.b) cVar.f317996q.get();
                        q qVar = new q(new aa0.i(), (xl2.f) cVar.N.get());
                        am2.a aVarA = cVar.f.a();
                        t70.b bVarG = eVar3.g();
                        s.j(bVarG);
                        mm.d dVar2 = (mm.d) cVar.X.get();
                        x xVarD = ((s41.a) cVar.f317985g).d();
                        xl2.f fVar = (xl2.f) cVar.N.get();
                        s70.a aVarM = eVar3.m();
                        s.j(aVarM);
                        return new xyk.d(hVar, bVar3, qVar, aVarA, bVarG, dVar2, xVarD, fVar, aVarM, (yc0.a) cVar.Y.get());
                    case 8:
                        qc0.k kVar = (qc0.k) cVar.f317996q.get();
                        wl2.f fVar2 = (wl2.f) cVar.f317997r.get();
                        ifm.b bVar4 = (ifm.b) cVar.k.get();
                        com.revolut.feature.chooser.a aVar4 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) cVar.f317998s.get(), (qi3.o) cVar.f317999t.get());
                        yc0.k kVar2 = (yc0.k) cVar.u.get();
                        aa0.f0 f0Var = (aa0.f0) cVar.v.get();
                        w80.b bVarJ = cVar.f317980b.j();
                        s.j(bVarJ);
                        z zVar = new z(bVarJ);
                        aa0.b bVar5 = (aa0.b) cVar.f318000w.get();
                        c0 c0Var = (c0) cVar.f318001x.get();
                        aa0.k0 k0Var = (aa0.k0) cVar.f318002y.get();
                        aa0.i0 i0Var = new aa0.i0();
                        b0 b0Var = (b0) cVar.B.get();
                        aa0.h hVar2 = (aa0.h) cVar.C.get();
                        aa0.n nVar = (aa0.n) cVar.D.get();
                        aa0.d dVar3 = (aa0.d) cVar.E.get();
                        aa0.p pVar = (aa0.p) cVar.F.get();
                        aa0.l lVar = (aa0.l) cVar.G.get();
                        aa0.m mVar = (aa0.m) cVar.H.get();
                        aa0.a0 a0Var = (aa0.a0) cVar.I.get();
                        i1 i1Var = (i1) cVar.J.get();
                        l0 l0Var = (l0) cVar.K.get();
                        aa0.e0 e0Var = (aa0.e0) cVar.L.get();
                        j0 j0Var = (j0) cVar.M.get();
                        aa0.j jVar = new aa0.j();
                        aa0.t tVar = new aa0.t();
                        q qVar2 = new q(new aa0.i(), (xl2.f) cVar.N.get());
                        aa0.s sVar = new aa0.s((ad0.a) cVar.O.get(), 1);
                        aa0.f fVar3 = new aa0.f();
                        aa0.g gVar = new aa0.g();
                        aa0.u uVar = new aa0.u();
                        g0 g0Var = new g0();
                        aa0.q qVar3 = new aa0.q((ad0.a) cVar.O.get());
                        aa0.s sVar2 = new aa0.s((ad0.a) cVar.O.get(), 0);
                        aa0.k kVar3 = new aa0.k();
                        aa0.a aVar5 = new aa0.a();
                        aa0.d0 d0Var = new aa0.d0();
                        com.google.firebase.messaging.t tVarA = cVar.a();
                        eli.j jVarA = cVar.e.a();
                        ca0.a aVar6 = new ca0.a();
                        bd0.d dVar4 = (bd0.d) cVar.Q.get();
                        yc0.f fVar4 = (yc0.f) cVar.T.get();
                        ad0.a aVar7 = (ad0.a) cVar.O.get();
                        aa0.o oVar = new aa0.o();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                        builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) cVar.U.get()));
                        builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                        builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                        builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) cVar.z.get()));
                        builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                        builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                        return new qc0.j0(kVar, fVar2, bVar4, aVar4, kVar2, f0Var, zVar, bVar5, c0Var, k0Var, i0Var, b0Var, hVar2, nVar, dVar3, pVar, lVar, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar2, sVar, fVar3, gVar, uVar, g0Var, qVar3, sVar2, kVar3, aVar5, d0Var, tVarA, jVarA, aVar6, dVar4, fVar4, aVar7, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
                    case 9:
                        kyk.v vVar = (kyk.v) cVar.f317982c;
                        hyk.a aVar8 = (hyk.a) vVar.J.get();
                        ybl.d dVarH = vVar.f190988h.h();
                        s.j(dVarH);
                        return new b1e.a(new kge.d(aVar8, dVarH), (xyk.b) cVar.f317996q.get());
                    case 10:
                        x90.c cVar2 = cVar.d;
                        qc0.k state = (qc0.k) cVar.f317996q.get();
                        Intrinsics.checkNotNullParameter(state, "state");
                        s.k(state);
                        return state;
                    case 11:
                        x90.c cVar3 = cVar.d;
                        qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) cVar.f317998s.get());
                        Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                        return modelsProvider;
                    case 12:
                        x90.c cVar4 = cVar.d;
                        l80.e eVarH = cVar.f317980b.h();
                        s.j(eVarH);
                        return wpg.v.l(cVar4, eVarH);
                    case 13:
                        x90.c cVar5 = cVar.d;
                        return new aa0.f0();
                    case 14:
                        x90.c cVar6 = cVar.d;
                        return new aa0.b();
                    case 15:
                        x90.c cVar7 = cVar.d;
                        return new c0();
                    case 16:
                        x90.c cVar8 = cVar.d;
                        return new aa0.k0();
                    case 17:
                        x90.c cVar9 = cVar.d;
                        z80.b bVarS = cVar.f317980b.s();
                        s.j(bVarS);
                        return wpg.v.g(cVar9, bVarS, (aa0.y) cVar.A.get());
                    case 18:
                        return wpg.v.i(cVar.d, (zzl.b) cVar.z.get());
                    case 19:
                        yyk.f.Companion.getClass();
                        return new zzl.c();
                    case 20:
                        x90.c cVar10 = cVar.d;
                        return new aa0.h();
                    case 21:
                        x90.c cVar11 = cVar.d;
                        return new aa0.n();
                    case 22:
                        return wpg.v.h(cVar.d, (aa0.y) cVar.A.get());
                    case 23:
                        x90.c cVar12 = cVar.d;
                        return new aa0.p();
                    case 24:
                        x90.c cVar13 = cVar.d;
                        return new aa0.l();
                    case 25:
                        x90.c cVar14 = cVar.d;
                        return new aa0.m();
                    case 26:
                        x90.c cVar15 = cVar.d;
                        return new aa0.a0();
                    case 27:
                        x90.c cVar16 = cVar.d;
                        return new i1();
                    case 28:
                        x90.c cVar17 = cVar.d;
                        return new l0();
                    case 29:
                        x90.c cVar18 = cVar.d;
                        return new aa0.e0();
                    case 30:
                        x90.c cVar19 = cVar.d;
                        return new j0();
                    case 31:
                        yyk.f.Companion.getClass();
                        return new xl2.f(true, 10);
                    case 32:
                        x90.c cVar20 = cVar.d;
                        return new ad0.b();
                    case 33:
                        return new ym.d();
                    case 34:
                        x90.c cVar21 = cVar.d;
                        return new bd0.e();
                    case 35:
                        return wpg.v.s(cVar.d, (yc0.b0) cVar.S.get());
                    case 36:
                        return wpg.v.u(cVar.d, (qc0.k) cVar.f317996q.get(), new smd.s((la0.c) cVar.R.get()));
                    case 37:
                        return wpg.v.e(cVar.d, (qc0.k) cVar.f317996q.get());
                    case 38:
                        x90.c cVar22 = cVar.d;
                        aa0.w legacyBackendFlowAdapterInteractor = new aa0.w((wl2.f) cVar.f317997r.get(), cVar.f.b());
                        Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                        return legacyBackendFlowAdapterInteractor;
                    case 39:
                        return new mm.d();
                    case 40:
                        return wpg.v.c(cVar.d, (yc0.b0) cVar.S.get());
                    case 41:
                        aVar = new vc0.a((qc0.j) cVar.Z.get(), (qc0.k) cVar.f317996q.get(), (ln.a) cVar.f317995p.get(), (xl2.f) cVar.N.get(), (mm.d) cVar.X.get(), cVar.a());
                        return aVar;
                    case 42:
                        return new vc0.b((ln.a) cVar.f317995p.get());
                    case 43:
                        aVar = new vc0.c((qc0.k) cVar.f317996q.get(), (qc0.j) cVar.Z.get(), (wl2.f) cVar.f317997r.get(), cVar.e.a(), new ca0.a(), cVar.a());
                        return aVar;
                    case 44:
                        x90.c cVar23 = cVar.d;
                        router = (qc0.j) cVar.Z.get();
                        Intrinsics.checkNotNullParameter(router, "router");
                        s.k(router);
                        return router;
                    case 45:
                        return new sm.e();
                    case 46:
                        return new om.c();
                    case 47:
                        return new g3l.g();
                    case 48:
                        return new an.a();
                    case 49:
                        return new d4l.a();
                    case 50:
                        x90.c cVar24 = cVar.d;
                        qc0.h state2 = (qc0.h) cVar.W.get();
                        Intrinsics.checkNotNullParameter(state2, "state");
                        s.k(state2);
                        return state2;
                    case 51:
                        yyk.f.Companion.getClass();
                        return new t80.c(new e.a("TransferOut"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 52:
                        return wpg.v.d(cVar.d, (qc0.k) cVar.f317996q.get(), (la0.c) cVar.R.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
                    case 53:
                        return wpg.v.t(cVar.d, (bd0.d) cVar.Q.get());
                    case 54:
                        x90.c cVar25 = cVar.d;
                        z70.a aVarF = cVar.f317980b.f();
                        s.j(aVarF);
                        return wpg.v.p(cVar25, aVarF);
                    case 55:
                        x90.c cVar26 = cVar.d;
                        return new yc0.w();
                    case 56:
                        x90.c cVar27 = cVar.d;
                        router = (qc0.j) cVar.Z.get();
                        Intrinsics.checkNotNullParameter(router, "router");
                        s.k(router);
                        return router;
                    case 57:
                        x90.c cVar28 = cVar.d;
                        qc0.h state3 = (qc0.h) cVar.W.get();
                        Intrinsics.checkNotNullParameter(state3, "state");
                        s.k(state3);
                        return state3;
                    default:
                        throw new AssertionError(i21);
                }
            case 2:
                yzk.b bVar6 = (yzk.b) obj2;
                switch (i21) {
                    case 0:
                        hri.b bVar7 = bVar6.f318133a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar8 = bVar6.f318133a;
                        return new iri.j();
                    case 2:
                        return new xzk.i();
                    case 3:
                        return new ln.c();
                    case 4:
                        return new cn.e();
                    case 5:
                        return new um.c();
                    case 6:
                        bVar6.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 7:
                        g3l.a aVar9 = (g3l.a) bVar6.f318142p.get();
                        sf0.h hVarB = bVar6.f318135c.b();
                        s.j(hVarB);
                        v60.e eVarA = bVar6.d.a();
                        s.j(eVarA);
                        return new vxk.e(aVar9, hVarB, eVarA, (ln.a) bVar6.f318139l.get());
                    case 8:
                        return new g3l.g();
                    case 9:
                        return new ym.d();
                    case 10:
                        return new mm.d();
                    case 11:
                        return new vxk.b((ln.a) bVar6.f318139l.get(), bVar6.h(), bVar6.a());
                    case 12:
                        return new vxk.b(bVar6.h(), (ln.a) bVar6.f318139l.get(), bVar6.a());
                    case 13:
                        return new sm.e();
                    case 14:
                        return new om.c();
                    case 15:
                        return new xzk.h((ln.a) bVar6.f318139l.get(), (mm.d) bVar6.f318145s.get(), (xzk.c) bVar6.k.get(), (ifm.b) bVar6.i.get(), new zzk.a((zzl.b) bVar6.f318148x.get()));
                    case 16:
                        yzk.d.Companion.getClass();
                        return new zzl.c();
                    case 17:
                        return new xzk.g((xzk.c) bVar6.k.get(), (xzk.b) bVar6.f318149y.get(), new kye.e((hyk.l) ((kyk.v) bVar6.e).F.get()), new zzk.a((zzl.b) bVar6.f318148x.get()));
                    default:
                        throw new AssertionError(i21);
                }
            case 3:
                z09.b bVar9 = (z09.b) obj2;
                if (i21 == 0) {
                    z70.a aVarF2 = bVar9.f318190a.f();
                    s.j(aVarF2);
                    return new a19.f(new a19.c(new a19.a(aVarF2, 0)), (j) bVar9.f318192c.get());
                }
                if (i21 != 1) {
                    throw new AssertionError(i21);
                }
                z09.f.Companion.getClass();
                return new ne0.d();
            case 4:
                aj3.j jVar2 = (aj3.j) obj2;
                PickerScreenContract$InputData pickerScreenContract$InputData = jVar2.f5394b;
                if (i21 == 0) {
                    return new y7a.f0(ImmutableMap.of("ExperienceCountryResidencePickerScreenInteractor", (a8a.d) ((z0g.f) jVar2.f).f.get()), pickerScreenContract$InputData, (jki.p) jVar2.d.get());
                }
                if (i21 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, jVar2.f5395c);
                }
                throw new AssertionError(i21);
            case 5:
                z0g.a aVar10 = (z0g.a) obj2;
                if (i21 == 0) {
                    return new q2g.i((jki.p) aVar10.f318293b.get(), aVar10.f318292a);
                }
                if (i21 == 1) {
                    return new q2g.j();
                }
                throw new AssertionError(i21);
            case 6:
                if (i21 == 0) {
                    return new u3g.d((jki.p) ((z0g.d) obj2).f318339a.get());
                }
                if (i21 == 1) {
                    return new u3g.e();
                }
                throw new AssertionError(i21);
            case 7:
                z0g.n nVar2 = (z0g.n) obj2;
                if (i21 == 0) {
                    return new b3g.d((n) nVar2.f318416b.get());
                }
                if (i21 == 1) {
                    return new b3g.e(nVar2.f318415a);
                }
                throw new AssertionError(i21);
            case 8:
                z0g.q0 q0Var = (z0g.q0) obj2;
                if (i21 == 0) {
                    return new c1g.v((hyf.a) q0Var.d.get());
                }
                if (i21 != 1) {
                    throw new AssertionError(i21);
                }
                xoj.a aVarA2 = q0Var.f318443a.a();
                s.j(aVarA2);
                eub.a aVarA3 = q0Var.f318444b.a();
                s.j(aVarA3);
                gte.a aVarB = q0Var.f318445c.b();
                s.j(aVarB);
                return new c1g.m(aVarA3, aVarB, aVarA2);
            case 9:
                z35.c cVar29 = (z35.c) obj2;
                c21.e eVar4 = cVar29.f319166a;
                if (i21 == 0) {
                    LoanAutopayService loanAutopayService = (LoanAutopayService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar29.f319172l.get(), "retrofit", LoanAutopayService.class, "create(...)");
                    s.k(loanAutopayService);
                    return loanAutopayService;
                }
                if (i21 == 1) {
                    Retrofit retrofitJ = ((c21.b) eVar4).j();
                    s.j(retrofitJ);
                    kg.o oVar2 = (kg.o) cVar29.k.get();
                    return j6.a.B(p.a.x(retrofitJ, "retrofit", oVar2, "gson"), oVar2, "build(...)");
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                kg.o gson = ((c21.b) eVar4).h();
                s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                kg.o oVarB = new kg.p(gson).b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 10:
                z3h.g gVar2 = (z3h.g) obj2;
                ee0.a aVar11 = gVar2.f;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new AssertionError(i21);
                    }
                    Context context = gVar2.f319289q;
                    z3h.i.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return sri.o.c(context, null, null, 14);
                }
                yk0.a dbSessionProvider = gVar2.e.b();
                s.j(dbSessionProvider);
                je0.d mapper = aVar11.d();
                s.j(mapper);
                xe0.f storageFactory = aVar11.f();
                s.j(storageFactory);
                u3h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, dbSessionProvider, "wealth_asset_details_storage", mapper, 2, zhm.u.c(v3h.a.d), 32);
            case 11:
                z52.g gVar3 = (z52.g) obj2;
                uw1.b bVar10 = gVar3.f319425b;
                if (i21 == 0) {
                    return new w52.f();
                }
                if (i21 == 1) {
                    uw1.c cVarD = ((lz1.m) bVar10).d();
                    s.j(cVarD);
                    eVar = new d62.e(cVarD);
                } else if (i21 == 2) {
                    uw1.c cVarD2 = ((lz1.m) bVar10).d();
                    s.j(cVarD2);
                    eVar = new y52.b(cVarD2, ((lz1.m) bVar10).g(), new t12.c());
                } else {
                    if (i21 != 3) {
                        if (i21 != 4) {
                            throw new AssertionError(i21);
                        }
                        Context context2 = gVar3.f319426c;
                        z52.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return sri.o.c(context2, null, null, 14);
                    }
                    sri.m mVar2 = (sri.m) gVar3.f319428h.get();
                    uw1.c cVarD3 = ((lz1.m) bVar10).d();
                    s.j(cVarD3);
                    eVar = new x52.d(mVar2, cVarD3, gVar3.d.b());
                }
                return eVar;
            case 12:
                z52.s sVar3 = (z52.s) obj2;
                a31.a aVar12 = sVar3.f319476c;
                a31.a aVar13 = sVar3.f319475b;
                ecm.q qVar4 = sVar3.f319474a;
                if (i21 == 0) {
                    return new z52.d(aVar13, qVar4);
                }
                if (i21 == 1) {
                    aVar2 = new z52.a(qVar4, aVar13, aVar12, sVar3.f319484q, sVar3.d);
                } else {
                    if (i21 == 2) {
                        z52.h hVar3 = (z52.h) ((z52.d) sVar3.f319483p.get()).b();
                        s.k(hVar3);
                        return hVar3;
                    }
                    if (i21 != 3) {
                        if (i21 != 4) {
                            throw new AssertionError(i21);
                        }
                        z52.g gVar4 = (z52.g) ((z52.a) sVar3.f319485r.get()).b();
                        s.k(gVar4);
                        return gVar4;
                    }
                    aVar2 = new dfb.i(qVar4, sVar3.e, sVar3.f, sVar3.f319477g, sVar3.f319478h, sVar3.i, aVar13, aVar12, sVar3.f319486s, sVar3.f319484q, sVar3.f319479j, sVar3.k, sVar3.f319480l, sVar3.f319481m, sVar3.f319482n, sVar3.o);
                }
                return aVar2;
            case 13:
                if (i21 == 0) {
                    z58.i iVar = (z58.i) obj2;
                    return new l68.i(iVar.f319570a, (n) iVar.f319571b.get());
                }
                if (i21 == 1) {
                    return new l68.j();
                }
                throw new AssertionError(i21);
            case 14:
                z5b.b bVar11 = (z5b.b) obj2;
                a31.a aVar14 = bVar11.i;
                a31.a aVar15 = bVar11.k;
                if (i21 == 0) {
                    aVar3 = new b6b.a(bVar11.f319592a, bVar11.f319593b, bVar11.f319594c, bVar11.d, bVar11.e, bVar11.f, bVar11.f319595g, bVar11.f319596h, aVar14);
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            b6b.h hVar4 = (b6b.h) ((b6b.a) bVar11.f319603r.get()).b();
                            s.k(hVar4);
                            return hVar4;
                        }
                        if (i21 == 3) {
                            return new b6b.f(bVar11.f319604s, aVar15, i6);
                        }
                        if (i21 == 4) {
                            return new a51.d(bVar11.f319604s, i3);
                        }
                        throw new AssertionError(i21);
                    }
                    aVar3 = new b6b.e(bVar11.f319597j, bVar11.f319604s, aVar15, bVar11.f319598l, bVar11.f319599m, bVar11.f319600n, bVar11.o, bVar11.f319601p, bVar11.f319602q, aVar14);
                }
                return aVar3;
            case 15:
                z9h.a aVar16 = (z9h.a) obj2;
                ozg.a dependenciesApi = aVar16.f320384b;
                if (i21 == 0) {
                    return new lah.e(aVar16.f320383a, (AnalyticsProduct) aVar16.e.get());
                }
                if (i21 == 1) {
                    mah.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                    AnalyticsProduct analyticsProductP = dependenciesApi.P();
                    s.k(analyticsProductP);
                    return analyticsProductP;
                }
                if (i21 == 2) {
                    mah.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                    return dependenciesApi.d();
                }
                if (i21 != 3) {
                    throw new AssertionError(i21);
                }
                mah.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                ozg.c cVarE = dependenciesApi.e();
                return cVarE == null ? bch.a.f14446a : cVarE;
            case 16:
                z9h.j jVar3 = (z9h.j) obj2;
                if (i21 == 0) {
                    return new sah.c((RecurringTransferManagementFlowContract$Step) jVar3.d.get(), (RecurringTransferManagementFlowContract$State) jVar3.e.get(), jVar3.f320451a);
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new AssertionError(i21);
                    }
                    sah.d initProvider = new sah.d();
                    tah.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(initProvider, "initProvider");
                    return RecurringTransferManagementFlowContract$State.f95564a;
                }
                sah.d initProvider2 = new sah.d();
                tah.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(initProvider2, "initProvider");
                RecurringTransferManagementFlowContract$Step recurringTransferManagementFlowContract$Step = RecurringTransferManagementFlowContract$Step.DETAILS;
                s.k(recurringTransferManagementFlowContract$Step);
                return recurringTransferManagementFlowContract$Step;
            case 17:
                z9h.k kVar4 = (z9h.k) obj2;
                rzg.a dependenciesApi2 = kVar4.f320455b;
                switch (i21) {
                    case 0:
                        return new com.revolut.feature.wealth.impl.ui.flows.withdraw.b((WithdrawFlowContract$Step) kVar4.e.get(), (WithdrawFlowContract$State) kVar4.f.get(), kVar4.f320454a, (t1h.j) kVar4.f320457g.get(), (t1h.a) kVar4.f320458h.get(), (t1h.k) kVar4.i.get());
                    case 1:
                        com.revolut.feature.wealth.impl.ui.flows.withdraw.a provider = new com.revolut.feature.wealth.impl.ui.flows.withdraw.a(new i90.b());
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return WithdrawFlowContract$Step.Amount.f95569a;
                    case 2:
                        i90.b bVar12 = new i90.b();
                        com.revolut.feature.wealth.impl.ui.flows.withdraw.a provider2 = new com.revolut.feature.wealth.impl.ui.flows.withdraw.a(bVar12);
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return new WithdrawFlowContract$State(bVar12.a());
                    case 3:
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dependenciesApi2, "dependenciesApi");
                        t1h.j jVarF = dependenciesApi2.f();
                        s.k(jVarF);
                        return jVarF;
                    case 4:
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dependenciesApi2, "dependenciesApi");
                        t1h.a aVarE = dependenciesApi2.e();
                        s.k(aVarE);
                        return aVarE;
                    case 5:
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dependenciesApi2, "dependenciesApi");
                        t1h.k kVarB = dependenciesApi2.b();
                        return kVarB == null ? zch.a.f321264a : kVarB;
                    case 6:
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dependenciesApi2, "dependenciesApi");
                        g5f.b bVarD = dependenciesApi2.d();
                        s.k(bVarD);
                        return bVarD;
                    case 7:
                        wah.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dependenciesApi2, "dependenciesApi");
                        t1h.i iVarC = dependenciesApi2.c();
                        s.k(iVarC);
                        return iVarC;
                    default:
                        throw new AssertionError(i21);
                }
            case 18:
                zd9.a aVar17 = (zd9.a) obj2;
                if (i21 == 0) {
                    return new ae9.c();
                }
                if (i21 == 1) {
                    return new ae9.d(aVar17.f321352a, aVar17.f, aVar17.f321353b, aVar17.f321354c, aVar17.d, 0);
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                ae9.a aVar18 = (ae9.a) ((ae9.c) aVar17.e.get()).b();
                s.k(aVar18);
                return aVar18;
            case 19:
                zdl.a aVar19 = (zdl.a) obj2;
                ee0.a aVar20 = aVar19.f321528a;
                switch (i21) {
                    case 0:
                        vdl.h0 repository = (vdl.h0) aVar19.f321533j.get();
                        Intrinsics.checkNotNullParameter(repository, "repository");
                        return new p96.a(i5);
                    case 1:
                        return new vdl.h0((j) aVar19.e.get(), (ue0.c) aVar19.f321531g.get(), (PaperTradingService) aVar19.i.get());
                    case 2:
                        return new ne0.d();
                    case 3:
                        je0.d mapper2 = (je0.d) aVar19.f.get();
                        yk0.a databaseSessionProvider = aVar19.f321529b.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory2 = aVar20.f();
                        s.j(storageFactory2);
                        acl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider, "paper_trading", mapper2, 1, f0.f322471a, 32);
                    case 4:
                        Json json = fe0.d.a();
                        me0.a factory = aVar20.e();
                        s.j(factory);
                        acl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(json, "json");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(json);
                    case 5:
                        Retrofit retrofit = (Retrofit) aVar19.f321532h.get();
                        cdl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(PaperTradingService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        PaperTradingService paperTradingService = (PaperTradingService) objCreate;
                        s.k(paperTradingService);
                        return paperTradingService;
                    case 6:
                        ik0.b retrofitFactory = ((nj0.d) aVar19.f321530c).m();
                        s.j(retrofitFactory);
                        Json json2 = fe0.d.a();
                        gfl.a wealthNetworkConfiguration = aVar19.d.f161039a;
                        cdl.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(json2, "json");
                        Intrinsics.checkNotNullParameter(wealthNetworkConfiguration, "wealthNetworkConfiguration");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, wealthNetworkConfiguration.getHostUrl(), p.a.g(b1.Companion, "application/json", json2), null, 25);
                        s.k(retrofitA);
                        return retrofitA;
                    default:
                        throw new AssertionError(i21);
                }
            case 20:
                zdl.b bVar13 = (zdl.b) obj2;
                ee0.a aVar21 = bVar13.f321534a;
                c4f.k kVar5 = bVar13.f;
                l70.e eVar5 = bVar13.e;
                if (i21 == 0) {
                    je0.d mapper3 = aVar21.b();
                    s.j(mapper3);
                    yk0.a databaseSessionProvider2 = bVar13.f321535b.b();
                    s.j(databaseSessionProvider2);
                    xe0.f storageFactory3 = aVar21.f();
                    s.j(storageFactory3);
                    zdl.k.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper3, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                    int i22 = 7;
                    int i32 = 8;
                    return xe0.f.f(storageFactory3, databaseSessionProvider2, "trading_config", mapper3, 9, v.k(new xdl.a(), xdl.b.d, xdl.c.d, xdl.d.d, new ei7.a(6, i22, i2), new ei7.a(i22, i32, i2), new ei7.a(i32, 9, i2)), 32);
                }
                if (i21 == 1) {
                    return new ael.t0((h1) bVar13.i.get(), kVar5.b(), new zjh.c(kVar5.f21224c.e()));
                }
                if (i21 == 2) {
                    ne0.d dVar5 = new ne0.d();
                    ue0.c cVar30 = (ue0.c) bVar13.f321537g.get();
                    TradingConfigService tradingConfigService = (TradingConfigService) bVar13.f321538h.get();
                    b80.c cVarP = eVar5.p();
                    s.j(cVarP);
                    l80.e eVarH2 = eVar5.h();
                    s.j(eVarH2);
                    return new h1(dVar5, cVar30, tradingConfigService, cVarP, eVarH2);
                }
                if (i21 != 3) {
                    throw new AssertionError(i21);
                }
                Retrofit retrofit3 = ((nj0.d) bVar13.f321536c).f();
                gfl.a wealthNetworkConfiguration2 = bVar13.d.f161039a;
                zdl.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(wealthNetworkConfiguration2, "wealthNetworkConfiguration");
                Object objCreate2 = retrofit3.newBuilder().baseUrl(wealthNetworkConfiguration2.getHostUrl()).build().create(TradingConfigService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                TradingConfigService tradingConfigService2 = (TradingConfigService) objCreate2;
                s.k(tradingConfigService2);
                return tradingConfigService2;
            case 21:
                return a();
            case 22:
                return b();
            case 23:
                return c();
            case 24:
                return d();
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                zrk.c cVar31 = (zrk.c) obj2;
                zdl.c cVar32 = cVar31.d;
                switch (i21) {
                    case 0:
                        return new ifm.b();
                    case 1:
                        return new iri.j();
                    case 2:
                        return new xrk.k();
                    case 3:
                        return new ln.c();
                    case 4:
                        return new xrk.j((ln.a) cVar31.f324762l.get(), (xrk.h) cVar31.f324763m.get(), cVar31.b());
                    case 5:
                        xrk.a aVar22 = (xrk.a) cVar31.k.get();
                        kl.b0 b0VarA = cVar31.a();
                        ybl.b bVarB = cVar32.b();
                        s.j(bVarB);
                        ifm.b bVar14 = (ifm.b) cVar31.i.get();
                        h hVar5 = (h) cVar32.f321569x0.get();
                        s.j(hVar5);
                        l lVarF = cVar31.e.f();
                        sfk.a aVarE2 = cVar31.f.e();
                        s.j(aVarE2);
                        return new xrk.h(aVar22, b0VarA, bVarB, bVar14, hVar5, lVarF, aVarE2);
                    case 6:
                        csk.f fVar5 = (csk.f) cVar31.k.get();
                        qrk.b bVar15 = (qrk.b) ((prk.a) cVar31.f324759g).f239052s.get();
                        s.j(bVar15);
                        ybl.b bVarB2 = cVar32.b();
                        s.j(bVarB2);
                        return new yrk.g(fVar5, bVar15, bVarB2, cVar31.a());
                    default:
                        throw new AssertionError(i21);
                }
        }
    }
}
