package oai;

import android.content.Context;
import androidx.work.WorkManager;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add_card_to_google_pay_shared.impl.tapandpay.GooglePayCardActivationService;
import com.revolut.feature.add_card_to_google_pay_shared.impl.tapandpay.GooglePayVerificationService;
import com.revolut.feature.alipay.impl.data.network.AlipayPlusProxyService;
import com.revolut.feature.alipay.impl.data.network.AlipayPlusQrCodeService;
import com.revolut.feature.alipay_plus.mpm.model.APMPMNetworkService;
import com.revolut.feature.payments.profile.impl.data.network.UsernameService;
import com.revolut.feature.payments.profile.impl.data.network.passes.DigitalPassService;
import com.revolut.feature.topup_screen.impl.data.network.service.japan.JapanInboundOpenBankingService;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeContract$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import com.revolut.shared.feature.wealth_advanced_features.domain.impl.data.network.OrderBookService;
import g9g.k1;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f223770c;

    public /* synthetic */ s(Object obj2, int i, int i2) {
        this.f223768a = i2;
        this.f223770c = obj2;
        this.f223769b = i;
    }

    private final Object a() {
        p12.l lVar = (p12.l) this.f223770c;
        int i = this.f223769b;
        switch (i) {
            case 0:
                z80.b bVarS = lVar.f231699a.s();
                vc.s.j(bVarS);
                return new j12.a(bVarS);
            case 1:
                return new j12.b((v02.c) lVar.f231709q.get());
            case 2:
                return new j12.d((v02.a) lVar.f231708p.get());
            case 3:
                gte.a aVarB = lVar.f231700b.b();
                vc.s.j(aVarB);
                return new r12.a(aVarB);
            case 4:
                return new s12.o();
            case 5:
                return new s12.n();
            case 6:
                gte.a aVarB2 = lVar.f231700b.b();
                vc.s.j(aVarB2);
                return new s12.q(aVarB2);
            case 7:
                return new s12.m();
            case 8:
                l80.e eVarH = lVar.f231699a.h();
                vc.s.j(eVarH);
                return new s42.c(eVarH, (a12.q) lVar.f231713w.get());
            case 9:
                return new s12.f(lVar.f231699a.d());
            case 10:
                lx1.i iVarD = ((ey1.e) lVar.f231701c).d();
                vc.s.j(iVarD);
                return new s12.a(iVarD);
            case 11:
                lx1.i iVarD2 = ((ey1.e) lVar.f231701c).d();
                vc.s.j(iVarD2);
                return new s12.c(iVarD2, (a12.t) lVar.f231712t.get());
            case 12:
                wv9.c cVarD = ((s6k.b) lVar.d).d();
                vc.s.j(cVarD);
                return new s12.g(cVarD);
            case 13:
                a12.k kVar = (a12.k) lVar.B.get();
                thf.g gVarE = lVar.e.e();
                vc.s.j(gVarE);
                return new s12.i(kVar, gVarE);
            case 14:
                ox9.a aVar = lVar.f;
                uw1.b bVar = lVar.f231702g;
                xx9.p pVarB = aVar.b();
                vc.s.j(pVarB);
                iz1.n nVar = (iz1.n) ((lz1.m) bVar).G.get();
                vc.s.j(nVar);
                ax1.a aVarE = ((lz1.m) bVar).e();
                vc.s.j(aVarE);
                whf.b bVarA = lVar.e.a();
                vc.s.j(bVarA);
                return new u12.c(pVarB, nVar, aVarE, bVarA);
            case 15:
                kz9.a aVarA = lVar.f231703h.a();
                vc.s.j(aVarA);
                return new u12.a(aVarA);
            case 16:
                return new s12.s();
            case 17:
                p5k.y yVar = new p5k.y();
                k5i.c cVarA = lVar.i.a();
                p5k.y yVar2 = new p5k.y();
                v2k.c cVarA2 = lVar.f231704j.a();
                ite.a aVar2 = lVar.f231700b;
                gte.a aVarB3 = aVar2.b();
                vc.s.j(aVarB3);
                gte.a aVarB4 = aVar2.b();
                vc.s.j(aVarB4);
                g1i.c cVar = new g1i.c(aVarB4, 2);
                gte.a aVarB5 = aVar2.b();
                vc.s.j(aVarB5);
                p5k.f fVar = new p5k.f(yVar2, cVarA2, aVarB3, cVar, new p5k.l(aVarB5));
                j9l.a aVar3 = new j9l.a();
                gte.a aVarB6 = aVar2.b();
                vc.s.j(aVarB6);
                return new q12.g(new p5k.x(yVar, cVarA, fVar, new kgm.i(aVar3, aVarB6), new p5k.p()));
            case 18:
                fk3.a aVarA2 = lVar.k.a();
                vc.s.j(aVarA2);
                l2j.a aVar4 = new l2j.a();
                gte.a aVarB7 = lVar.f231700b.b();
                vc.s.j(aVarB7);
                return new q12.l(aVarA2, aVar4, aVarB7, new qpk.b());
            case 19:
                yw1.b bVarK = ((lz1.m) lVar.f231702g).k();
                vc.s.j(bVarK);
                ax1.a aVarE2 = ((lz1.m) lVar.f231702g).e();
                vc.s.j(aVarE2);
                return new q12.f(bVarK, aVarE2);
            case 20:
                return new q12.d(lVar.f231705l.d(), lVar.f231705l.g());
            case 21:
                sf0.h hVarB = lVar.f231706m.b();
                vc.s.j(hVarB);
                v60.e eVarA = lVar.f231707n.a();
                vc.s.j(eVarA);
                return new q12.a(hVarB, eVarA);
            case 22:
                gte.a aVarB8 = lVar.f231700b.b();
                vc.s.j(aVarB8);
                return new s12.l(aVarB8, lVar.o);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b() {
        p12.x xVar = (p12.x) this.f223770c;
        e12.b extension = xVar.f231816a;
        int i = this.f223769b;
        if (i != 0) {
            if (i == 1) {
                return new m22.g(extension, (cli.n) xVar.f231818c.get());
            }
            if (i == 2) {
                return new m22.h();
            }
            throw new AssertionError(i);
        }
        n22.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        return nVar;
    }

    private final Object c() {
        p12.b0 b0Var = (p12.b0) this.f223770c;
        int i = this.f223769b;
        if (i != 0) {
            if (i == 1) {
                return new g32.b(new l12.g(), new l12.c());
            }
            if (i == 2) {
                return new com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.a(b0Var.f231622a);
            }
            throw new AssertionError(i);
        }
        g32.b extension = (g32.b) b0Var.e.get();
        c32.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    private final Object d() {
        p12.k0 k0Var = (p12.k0) this.f223770c;
        e12.h hVar = k0Var.f231696a;
        int i = this.f223769b;
        if (i == 0) {
            return new q42.j(hVar, (cli.n) k0Var.f231697b.get());
        }
        if (i == 1) {
            return new q42.l(hVar);
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object iVar;
        Object jVar;
        Object fVar;
        Object cVar;
        int i = this.f223768a;
        int i2 = 3;
        Object obj2 = this.f223770c;
        int i3 = this.f223769b;
        switch (i) {
            case 0:
                nng.i iVar2 = (nng.i) obj2;
                i0 i0Var = (i0) iVar2.f217656g;
                NameControllerDescriptor$InputData nameControllerDescriptor$InputData = iVar2.f217654b;
                if (i3 == 0) {
                    cli.n nVar = (cli.n) iVar2.e.get();
                    zzl.b bVar = (zzl.b) iVar2.f217655c.get();
                    gte.a aVarB = i0Var.d.b();
                    vc.s.j(aVarB);
                    iVar = new zng.i(nameControllerDescriptor$InputData, nVar, new r10.v(bVar, agk.b.o(aVarB, nameControllerDescriptor$InputData)));
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return aog.e.a();
                        }
                        if (i3 == 3) {
                            return aog.f.a();
                        }
                        throw new AssertionError(i3);
                    }
                    cog.c cVar2 = new cog.c((zzl.b) iVar2.f217655c.get(), (f0m.a) iVar2.d.get());
                    cog.g gVar = new cog.g();
                    gte.a aVarB2 = i0Var.d.b();
                    vc.s.j(aVarB2);
                    iVar = new zng.l(new cog.a(cVar2, gVar, agk.b.o(aVarB2, nameControllerDescriptor$InputData)));
                }
                return iVar;
            case 1:
                x xVar = (x) obj2;
                PersonalCodeContract$InputData personalCodeContract$InputData = xVar.f223783a;
                if (i3 == 0) {
                    jVar = new wbi.j((cli.n) xVar.f223784b.get(), (zzl.b) xVar.f223785c.get(), personalCodeContract$InputData);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new AssertionError(i3);
                        }
                        xbi.b.Companion.getClass();
                        return new zzl.c();
                    }
                    jVar = new wbi.l(personalCodeContract$InputData);
                }
                return jVar;
            case 2:
                of3.j jVar2 = (of3.j) obj2;
                m8g.b travelHotelsChatWidgetsApi = jVar2.f224727b;
                or5.b cryptoChatWidgetsApi = jVar2.e;
                switch (i3) {
                    case 0:
                        vnh.b screenerApi = jVar2.f224726a;
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screenerApi, "screenerApi");
                        joh.w wVar = (joh.w) screenerApi;
                        fkg.a aVarF = wVar.f();
                        h9h.a aVar = wVar.d;
                        return new tqh.i(aVarF, aVar.p(), aVar.g(), new ooh.d(), new tqh.g(wVar.g(), new uqh.d()));
                    case 1:
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(travelHotelsChatWidgetsApi, "travelHotelsChatWidgetsApi");
                        k1 k1Var = (k1) travelHotelsChatWidgetsApi;
                        q06.l deeplinkRouter = k1Var.f141729a.a();
                        vc.s.j(deeplinkRouter);
                        l80.e dateProvider = k1Var.f141730b.h();
                        vc.s.j(dateProvider);
                        w8g.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
                        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                        return new v8g.h(deeplinkRouter, dateProvider);
                    case 2:
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(travelHotelsChatWidgetsApi, "travelHotelsChatWidgetsApi");
                        q06.l deeplinkRouter2 = ((k1) travelHotelsChatWidgetsApi).f141729a.a();
                        vc.s.j(deeplinkRouter2);
                        u8g.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(deeplinkRouter2, "deeplinkRouter");
                        return new t8g.e(deeplinkRouter2);
                    case 3:
                        m2h.b wealthAssetDetailsUiApi = jVar2.f224728c;
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(wealthAssetDetailsUiApi, "wealthAssetDetailsUiApi");
                        z3h.g gVar2 = (z3h.g) wealthAssetDetailsUiApi;
                        l4h.i historicalChartToTrendViewMapper = new l4h.i();
                        l4h.h historicalChartPresentationMapper = new l4h.h();
                        Intrinsics.checkNotNullParameter(historicalChartToTrendViewMapper, "historicalChartToTrendViewMapper");
                        Intrinsics.checkNotNullParameter(historicalChartPresentationMapper, "historicalChartPresentationMapper");
                        j4h.a historicalChartChatWidgetMapper = new j4h.a();
                        Intrinsics.checkNotNullParameter(historicalChartChatWidgetMapper, "historicalChartChatWidgetMapper");
                        j4h.p pVar = new j4h.p();
                        zhl.k kVarA = gVar2.f319279a.a();
                        ybl.b bVarB = gVar2.f319280b.b();
                        vc.s.j(bVarB);
                        return new j4h.l(pVar, kVarA, bVarB);
                    case 4:
                        khf.b transactionChatWidgetsApi = jVar2.d;
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(transactionChatWidgetsApi, "transactionChatWidgetsApi");
                        ajf.a aVar2 = (ajf.a) transactionChatWidgetsApi;
                        com.revolut.domain.interactors.transactions.a transactionsInteractor = ((bjf.a) aVar2.f5563a).c();
                        vc.s.j(transactionsInteractor);
                        djf.c cVar3 = aVar2.f5564b;
                        thf.g gVarE = cVar3.e();
                        vc.s.j(gVarE);
                        thf.d dVarD = cVar3.d();
                        vc.s.j(dVarD);
                        zhf.d mapper = new zhf.d(gVarE, dVarD);
                        gte.a aVarB3 = aVar2.f5565c.b();
                        vc.s.j(aVarB3);
                        g8i.a transactionDetailsNavigationChecker = new g8i.a(aVarB3, 1);
                        fjf.a transactionsExtraDataApi = aVar2.d;
                        Json json = fe0.d.a();
                        ajf.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(transactionDetailsNavigationChecker, "transactionDetailsNavigationChecker");
                        Intrinsics.checkNotNullParameter(transactionsExtraDataApi, "transactionsExtraDataApi");
                        Intrinsics.checkNotNullParameter(json, "json");
                        return new zhf.g(transactionsInteractor, mapper, transactionDetailsNavigationChecker, transactionsExtraDataApi.a(), json);
                    case 5:
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cryptoChatWidgetsApi, "cryptoChatWidgetsApi");
                        zr5.a rowMapper = new zr5.a();
                        Intrinsics.checkNotNullParameter(rowMapper, "rowMapper");
                        zr5.q mapper2 = new zr5.q();
                        as5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        return new zr5.r(mapper2);
                    case 6:
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cryptoChatWidgetsApi, "cryptoChatWidgetsApi");
                        es5.a aVar3 = (es5.a) cryptoChatWidgetsApi;
                        r9j.a aVar4 = aVar3.f128861a;
                        o9j.b bVar2 = (o9j.b) aVar4.f.get();
                        vc.s.j(bVar2);
                        yr5.q stateMapper = new yr5.q(bVar2);
                        f61.a ratesPlotInteractor = ((n51.a) aVar3.f128862b).b();
                        xv5.c baseCurrencyInteractor = aVar3.f128863c.a();
                        vc.s.j(baseCurrencyInteractor);
                        o9j.b assetDetailsChartMapper = (o9j.b) aVar4.f.get();
                        vc.s.j(assetDetailsChartMapper);
                        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
                        Intrinsics.checkNotNullParameter(ratesPlotInteractor, "ratesPlotInteractor");
                        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
                        Intrinsics.checkNotNullParameter(assetDetailsChartMapper, "assetDetailsChartMapper");
                        return new yr5.n(stateMapper, ratesPlotInteractor, baseCurrencyInteractor, assetDetailsChartMapper);
                    case 7:
                        fd5.b cryptoCardsChatWidgetsApi = jVar2.f;
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cryptoCardsChatWidgetsApi, "cryptoCardsChatWidgetsApi");
                        m93.d dVarF = ((kd5.d) cryptoCardsChatWidgetsApi).f182810a.f();
                        vc.s.j(dVarF);
                        id5.i mapper3 = new id5.i(dVarF);
                        kd5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        return new id5.j(mapper3);
                    case 8:
                        jo9.b paymentsAirWidgetApi = jVar2.f224729g;
                        pf3.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(paymentsAirWidgetApi, "paymentsAirWidgetApi");
                        mo9.b bVar3 = (mo9.b) paymentsAirWidgetApi;
                        no9.a aVar5 = new no9.a((lo9.d) bVar3.f207586r.get());
                        vl3.n nVar2 = bVar3.e;
                        cl3.a aVarD = nVar2.d();
                        vc.s.j(aVarD);
                        b3j.p pVar2 = (b3j.p) bVar3.f;
                        d3j.b bVarE = pVar2.e();
                        jqa.p pVar3 = (jqa.p) bVar3.f207578g;
                        lra.d dVarB = pVar3.b();
                        vc.s.j(dVarB);
                        com.revolut.feature.payments.air.widget.impl.ui.chat.c cVar4 = new com.revolut.feature.payments.air.widget.impl.ui.chat.c(aVarD, bVarE, dVarB);
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar3.f207579h).c();
                        vc.s.j(aVarC);
                        nhf.a aVarA = bVar3.i.a();
                        vc.s.j(aVarA);
                        po9.x xVar2 = new po9.x(aVarC, aVarA);
                        dl3.f fVarC = nVar2.c();
                        vc.s.j(fVarC);
                        m3j.j jVarD = b3j.p.d();
                        m3j.n nVarI = pVar2.i();
                        aqa.a aVarA2 = pVar3.a();
                        vc.s.j(aVarA2);
                        aqa.c cVarC = pVar3.c();
                        vc.s.j(cVarC);
                        thf.g gVarE2 = bVar3.f207580j.e();
                        vc.s.j(gVarE2);
                        w80.b bVarJ = bVar3.k.j();
                        vc.s.j(bVarJ);
                        com.revolut.feature.payments.air.widget.impl.ui.chat.a aVar6 = new com.revolut.feature.payments.air.widget.impl.ui.chat.a(fVarC, jVarD, nVarI, aVarA2, cVarC, gVarE2, bVarJ);
                        mo9.g jsonProvider = new mo9.g();
                        Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                        rlm.o oVar = jsonProvider.f207598a;
                        vc.s.k(oVar);
                        return new com.revolut.feature.payments.air.widget.impl.ui.chat.b(aVar5, cVar4, xVar2, aVar6, oVar);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                if (i3 == 0) {
                    ofc.b bVar4 = (ofc.b) obj2;
                    return new nfc.i(bVar4.f224799a, (jki.p) bVar4.f224800b.get());
                }
                if (i3 == 1) {
                    return new nfc.j();
                }
                throw new AssertionError(i3);
            case 4:
                if (i3 == 0) {
                    og1.a aVar7 = (og1.a) obj2;
                    return new mg1.d(aVar7.f224955a, (cli.n) aVar7.f224956b.get());
                }
                if (i3 == 1) {
                    return new mg1.e();
                }
                throw new AssertionError(i3);
            case 5:
                og1.i iVar3 = (og1.i) obj2;
                if (i3 == 0) {
                    tg1.a aVarA3 = iVar3.f224978a.a();
                    vc.s.j(aVarA3);
                    return new sg1.c(aVarA3, iVar3.f224979b.b());
                }
                if (i3 == 1) {
                    return new ug1.a();
                }
                if (i3 == 2) {
                    return new vg1.a();
                }
                throw new AssertionError(i3);
            case 6:
                og1.j jVar3 = (og1.j) obj2;
                if (i3 == 0) {
                    return new tg1.a((GooglePayCardActivationService) jVar3.e.get(), jVar3.f224984b.c());
                }
                if (i3 == 1) {
                    Retrofit retrofit = (Retrofit) jVar3.d.get();
                    og1.n.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                    Object objCreate = retrofit.create(GooglePayCardActivationService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    GooglePayCardActivationService googlePayCardActivationService = (GooglePayCardActivationService) objCreate;
                    vc.s.k(googlePayCardActivationService);
                    return googlePayCardActivationService;
                }
                if (i3 == 2) {
                    ik0.b retrofitFactory = ((nj0.d) jVar3.f224983a).m();
                    vc.s.j(retrofitFactory);
                    da3.m cardsNetworkConfiguration = new da3.m();
                    og1.n.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                    Intrinsics.checkNotNullParameter(cardsNetworkConfiguration, "cardsNetworkConfiguration");
                    Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, null, null, 28);
                    vc.s.k(retrofitA);
                    return retrofitA;
                }
                if (i3 == 3) {
                    return new wg1.b((xg1.a) jVar3.f224987h.get());
                }
                if (i3 == 4) {
                    return new xg1.a(t2d.c.c(jVar3.f224985c.f271230a), (GooglePayVerificationService) jVar3.f224986g.get());
                }
                if (i3 != 5) {
                    throw new AssertionError(i3);
                }
                Retrofit retrofit3 = (Retrofit) jVar3.d.get();
                og1.n.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(GooglePayVerificationService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                GooglePayVerificationService googlePayVerificationService = (GooglePayVerificationService) objCreate2;
                vc.s.k(googlePayVerificationService);
                return googlePayVerificationService;
            case 7:
                ogl.a aVar8 = (ogl.a) obj2;
                ee0.a aVar9 = aVar8.f225196a;
                if (i3 == 0) {
                    return new ne0.d();
                }
                if (i3 == 1) {
                    je0.d mapper4 = aVar9.b();
                    vc.s.j(mapper4);
                    yk0.a databaseSessionProvider = aVar8.f225197b.b();
                    vc.s.j(databaseSessionProvider);
                    xe0.f storageFactory = aVar9.f();
                    vc.s.j(storageFactory);
                    igl.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper4, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.f(storageFactory, databaseSessionProvider, "order_book_storage", mapper4, 0, null, 56);
                }
                if (i3 == 2) {
                    return new pgl.a((mgl.f) aVar8.f225201j.get());
                }
                if (i3 == 3) {
                    OrderBookService orderBookService = (OrderBookService) aVar8.i.get();
                    ne0.j jVar4 = (ne0.j) aVar8.f.get();
                    ue0.c cVar5 = (ue0.c) aVar8.f225199g.get();
                    CoroutineScope coroutineScopeA = aVar8.e.a();
                    vc.s.j(coroutineScopeA);
                    return new mgl.f(orderBookService, jVar4, cVar5, coroutineScopeA);
                }
                if (i3 == 4) {
                    OrderBookService orderBookService2 = (OrderBookService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar8.f225200h.get(), "retrofit", OrderBookService.class, "create(...)");
                    vc.s.k(orderBookService2);
                    return orderBookService2;
                }
                if (i3 != 5) {
                    throw new AssertionError(i3);
                }
                Retrofit retrofit4 = ((nj0.d) aVar8.f225198c).f();
                gfl.a wealthNetworkConfiguration = aVar8.d.f161039a;
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Intrinsics.checkNotNullParameter(wealthNetworkConfiguration, "wealthNetworkConfiguration");
                Retrofit.Builder builderNewBuilder = retrofit4.newBuilder();
                builderNewBuilder.converterFactories().clear();
                Object value = hgl.a.f152191a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                builderNewBuilder.addConverterFactory(GsonConverterFactory.create((kg.o) value));
                builderNewBuilder.baseUrl(wealthNetworkConfiguration.getHostUrl());
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                vc.s.k(retrofitBuild);
                return retrofitBuild;
            case 8:
                ok1.d dVar = (ok1.d) obj2;
                l70.e eVar = dVar.f225861c;
                nj0.a aVar10 = dVar.d;
                switch (i3) {
                    case 0:
                        gte.a aVarB4 = dVar.f225859a.b();
                        vc.s.j(aVarB4);
                        return new mk1.a(ImmutableSet.of(new nk1.b(aVarB4)));
                    case 1:
                        z70.a aVarF2 = eVar.f();
                        vc.s.j(aVarF2);
                        APMPMNetworkService aPMPMNetworkService = (APMPMNetworkService) dVar.f225865l.get();
                        qk1.g gVar3 = new qk1.g();
                        CoroutineScope coroutineScopeA2 = dVar.e.a();
                        vc.s.j(coroutineScopeA2);
                        sri.m mVarD = ((g8b.a) dVar.f).d();
                        vc.s.j(mVarD);
                        fVar = new qk1.f(aVarF2, aPMPMNetworkService, gVar3, new k7i.i(coroutineScopeA2, mVarD));
                        break;
                    case 2:
                        return new qk1.c(new fnc.s((AlipayPlusProxyService) dVar.f225864j.get()), (CoroutineScope) dVar.k.get());
                    case 3:
                        ik0.b retrofitFactory2 = ((nj0.d) aVar10).m();
                        vc.s.j(retrofitFactory2);
                        Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                        Object objCreate3 = ik0.b.a(retrofitFactory2, null, null, null, null, 31).create(AlipayPlusProxyService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        AlipayPlusProxyService alipayPlusProxyService = (AlipayPlusProxyService) objCreate3;
                        vc.s.k(alipayPlusProxyService);
                        return alipayPlusProxyService;
                    case 4:
                        skm.p0 p0Var = skm.p0.f264001a;
                        return rd0.e.a(elm.f.f127540b);
                    case 5:
                        k18.c cVarA = dVar.a();
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        fVar = new pk1.d(cVarA, eVarH, (CoroutineScope) dVar.o.get());
                        break;
                    case 6:
                        ik0.b retrofitFactory3 = ((nj0.d) aVar10).m();
                        vc.s.j(retrofitFactory3);
                        Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                        Object objCreate4 = ik0.b.a(retrofitFactory3, null, null, null, null, 31).create(AlipayPlusQrCodeService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                        AlipayPlusQrCodeService alipayPlusQrCodeService = (AlipayPlusQrCodeService) objCreate4;
                        vc.s.k(alipayPlusQrCodeService);
                        return alipayPlusQrCodeService;
                    case 7:
                        return rd0.e.a(skm.p0.f264002b);
                    default:
                        throw new AssertionError(i3);
                }
                return fVar;
            case 9:
                ok1.n nVar3 = (ok1.n) obj2;
                a31.a aVar11 = nVar3.d;
                a31.a aVar12 = nVar3.f225891c;
                a31.a aVar13 = nVar3.f225889a;
                if (i3 == 0) {
                    return new anb.c0(aVar13, nVar3.f225890b, aVar12, aVar11, 21);
                }
                if (i3 == 1) {
                    return new ap3.b(aVar13, aVar12, nVar3.e, nVar3.f, aVar11, nVar3.f225892g, nVar3.f225893h, 7);
                }
                throw new AssertionError(i3);
            case 10:
                okg.a aVar14 = (okg.a) obj2;
                djf.c cVar6 = aVar14.f226042b;
                if (i3 == 0) {
                    whf.n nVarB = cVar6.b();
                    vc.s.j(nVarB);
                    cVar = new rkg.c(nVarB);
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar14.f226041a).c();
                            vc.s.j(aVarC2);
                            return new pkg.b(aVarC2);
                        }
                        if (i3 == 3) {
                            return new pkg.b(aVar14.e());
                        }
                        if (i3 != 4) {
                            if (i3 == 5) {
                                return new pkg.j(aVar14.e());
                            }
                            throw new AssertionError(i3);
                        }
                        mhf.f fVar2 = (mhf.f) aVar14.f226044g.f144274c.get();
                        vc.s.j(fVar2);
                        return new pkg.f(fVar2);
                    }
                    rkg.d dVarF2 = aVar14.f();
                    anf.b bVar5 = (anf.b) cVar6.Q.get();
                    vc.s.j(bVar5);
                    cVar = new rkg.h(dVarF2, bVar5);
                }
                return cVar;
            case 11:
                opa.a aVar15 = (opa.a) obj2;
                h30.a aVar16 = aVar15.f227537g;
                switch (i3) {
                    case 0:
                        ifm.b bVarA = aVar15.f227534a.a();
                        vc.s.j(bVarA);
                        return new spa.i(bVarA, e4m.b.a(aVar15.f227538h), e4m.b.a(aVar15.i), e4m.b.a(aVar15.f227539j), e4m.b.a(aVar15.k), e4m.b.a(aVar15.f227540l), e4m.b.a(aVar15.f227541m), e4m.b.a(aVar15.f227542n));
                    case 1:
                        List list = (List) aVar15.f227535b.f310053b0.get();
                        vc.s.j(list);
                        return new qpa.c(list, aVar15.f227536c.g());
                    case 2:
                        th0.d.Companion.getClass();
                        hh0.c cVar7 = (hh0.c) hi0.b.Companion.c();
                        vc.s.k(cVar7);
                        return cVar7;
                    case 3:
                        d1j.a aVar17 = (d1j.a) aVar15.d.d.get();
                        vc.s.j(aVar17);
                        return aVar17;
                    case 4:
                        zm0.c cVarJ = aVar15.e.j();
                        vc.s.j(cVarJ);
                        return cVarJ;
                    case 5:
                        s21.a aVar18 = (s21.a) ((c21.b) aVar15.f).B0.get();
                        vc.s.j(aVar18);
                        return aVar18;
                    case 6:
                        return ((h30.n) aVar16).k();
                    case 7:
                        m30.j jVar5 = (m30.j) ((h30.n) aVar16).Z.get();
                        vc.s.j(jVar5);
                        return jVar5;
                    default:
                        throw new AssertionError(i3);
                }
            case 12:
                ove.g gVar4 = (ove.g) obj2;
                if (i3 == 0) {
                    return new wve.a((dve.a) gVar4.f230069c.get());
                }
                if (i3 == 1) {
                    return new dve.d((JapanInboundOpenBankingService) gVar4.f230068b.get());
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                Retrofit retrofit5 = ((nj0.d) gVar4.f230067a).f();
                ove.h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                Object objCreate5 = retrofit5.create(JapanInboundOpenBankingService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                JapanInboundOpenBankingService japanInboundOpenBankingService = (JapanInboundOpenBankingService) objCreate5;
                vc.s.k(japanInboundOpenBankingService);
                return japanInboundOpenBankingService;
            case 13:
                ow9.e eVar2 = (ow9.e) obj2;
                nj0.a aVar19 = eVar2.f230356x;
                if (i3 == 0) {
                    DigitalPassService digitalPassService = (DigitalPassService) a0.d.f((nj0.d) aVar19, "retrofit", DigitalPassService.class, "create(...)");
                    vc.s.k(digitalPassService);
                    return digitalPassService;
                }
                if (i3 == 1) {
                    return new qw9.f((hw9.d) eVar2.D.get());
                }
                if (i3 == 2) {
                    return new hw9.d((UsernameService) eVar2.B.get(), (ne0.j) eVar2.C.get());
                }
                if (i3 == 3) {
                    UsernameService usernameService = (UsernameService) a0.d.f((nj0.d) aVar19, "retrofit", UsernameService.class, "create(...)");
                    vc.s.k(usernameService);
                    return usernameService;
                }
                if (i3 == 4) {
                    return new ne0.d();
                }
                if (i3 == 5) {
                    return new qw9.e(eVar2.f230343c.e());
                }
                throw new AssertionError(i3);
            case 14:
                ox7.b bVar6 = (ox7.b) obj2;
                switch (i3) {
                    case 0:
                        hri.b bVar7 = bVar6.f230660a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar8 = bVar6.f230660a;
                        return new iri.j();
                    case 2:
                        return new com.revolut.feature.chooser.e();
                    case 3:
                        return new mx7.h((mx7.i) bVar6.k.get(), (com.revolut.feature.chooser.c) bVar6.f230667m.get());
                    case 4:
                        return new mx7.i((rz7.o) bVar6.i.get(), (rz7.e) bVar6.f230665j.get());
                    case 5:
                        return new wx7.k();
                    case 6:
                        return new rx7.n();
                    case 7:
                        return new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) bVar6.f230664h.get(), (qi3.o) bVar6.f230666l.get());
                    case 8:
                        mx7.i iVar4 = (mx7.i) bVar6.k.get();
                        com.revolut.feature.chooser.d dVar2 = (com.revolut.feature.chooser.d) bVar6.f230664h.get();
                        fx7.f fVarB = bVar6.f230662c.b();
                        vc.s.j(fVarB);
                        t70.g gVarO = bVar6.f230661b.o();
                        vc.s.j(gVarO);
                        return new mx7.c(iVar4, dVar2, fVarB, gVarO);
                    case 9:
                        return new qi3.n((com.revolut.feature.chooser.c) bVar6.f230667m.get());
                    case 10:
                        return new ux7.o();
                    case 11:
                        return new px7.i();
                    case 12:
                        return new tx7.c();
                    case 13:
                        return new ln.c();
                    case 14:
                        return new cn.e();
                    case 15:
                        return new um.c();
                    case 16:
                        e4m.e eVar3 = bVar6.v;
                        ex7.a aVar20 = bVar6.f230662c;
                        g3l.a aVar21 = (g3l.a) eVar3.get();
                        fx7.f fVarB2 = aVar20.b();
                        vc.s.j(fVarB2);
                        ang.f fVarE = bVar6.d.e();
                        fx7.a aVarA4 = aVar20.a();
                        vc.s.j(aVarA4);
                        return new d08.b(aVar21, fVarB2, fVarE, aVarA4, (ln.a) bVar6.f230672s.get(), bVar6.a());
                    case 17:
                        return new g3l.g();
                    case 18:
                        return new ym.d();
                    case 19:
                        bVar6.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 20:
                        e4m.e eVar4 = bVar6.z;
                        ex7.a aVar22 = bVar6.f230662c;
                        nx7.d dVar3 = (nx7.d) eVar4.get();
                        fx7.f fVarB3 = aVar22.b();
                        vc.s.j(fVarB3);
                        fx7.a aVarA5 = aVar22.a();
                        vc.s.j(aVarA5);
                        return new nx7.n(dVar3, fVarB3, aVarA5, new a5h.g((rz7.j) bVar6.A.get(), (rz7.h) bVar6.B.get(), (rz7.d) bVar6.C.get(), (rz7.f) bVar6.D.get(), (rz7.b) bVar6.E.get()), (ifm.b) bVar6.f.get(), (rz7.n) bVar6.F.get(), (rz7.j) bVar6.A.get(), (rz7.h) bVar6.B.get(), (rz7.f) bVar6.D.get(), (rz7.b) bVar6.E.get(), (rz7.d) bVar6.C.get(), (rz7.l) bVar6.G.get(), bVar6.a());
                    case 21:
                        wx7.b bVar9 = (wx7.b) bVar6.i.get();
                        ux7.c cVar8 = (ux7.c) bVar6.f230669p.get();
                        rx7.d dVar4 = (rx7.d) bVar6.f230665j.get();
                        px7.b bVar10 = (px7.b) bVar6.f230670q.get();
                        tx7.b bVar11 = (tx7.b) bVar6.f230671r.get();
                        l80.e eVarH2 = bVar6.f230661b.h();
                        vc.s.j(eVarH2);
                        return new nx7.a0(bVar9, cVar8, dVar4, bVar10, bVar11, eVarH2);
                    case 22:
                        return new rz7.r((rz7.k) bVar6.f230669p.get());
                    case 23:
                        return new rz7.p((rz7.i) bVar6.f230669p.get());
                    case 24:
                        rz7.e eVar5 = (rz7.e) bVar6.f230665j.get();
                        rz7.o oVar2 = (rz7.o) bVar6.i.get();
                        fx7.f fVarB4 = bVar6.f230662c.b();
                        vc.s.j(fVarB4);
                        return new rz7.a(eVar5, oVar2, fVarB4);
                    case 25:
                        return new com.revolut.feature.insurance_pet.impl.ui.pet.dob.b((rz7.g) bVar6.f230670q.get());
                    case 26:
                        return new sz7.d((rz7.c) bVar6.f230665j.get());
                    case 27:
                        return new rz7.t((rz7.o) bVar6.i.get());
                    case 28:
                        return new rz7.s((rz7.m) bVar6.f230665j.get());
                    case 29:
                        return new mm.d();
                    case 30:
                        return new sm.e();
                    case 31:
                        return new om.c();
                    case 32:
                        return new wm.a();
                    case 33:
                        ifm.b bVar12 = (ifm.b) bVar6.f.get();
                        nx7.b bVar13 = (nx7.b) bVar6.H.get();
                        ln.a aVar23 = (ln.a) bVar6.f230672s.get();
                        t70.g gVarO2 = bVar6.f230661b.o();
                        vc.s.j(gVarO2);
                        return new nx7.z(bVar12, bVar13, aVar23, gVarO2);
                    default:
                        throw new AssertionError(i3);
                }
            case 15:
                if (i3 == 0) {
                    oxj.a aVar24 = (oxj.a) obj2;
                    return new a2d.m(aVar24.f230850a, aVar24.f230851b, aVar24.f230852c, 21);
                }
                if (i3 == 1) {
                    return new pxj.c();
                }
                throw new AssertionError(i3);
            case 16:
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new qy.b();
                    }
                    throw new AssertionError(i3);
                }
                ey.b bVar14 = (ey.b) obj2;
                ly.c cVar9 = bVar14.f130478b;
                y80.a aVarR = bVar14.f130479c.r();
                vc.s.j(aVarR);
                return new com.revolut.camerakit.revolut.ui.flow.b(cVar9, aVarR);
            case 17:
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new qy.b();
                    }
                    throw new AssertionError(i3);
                }
                ey.b bVar15 = (ey.b) obj2;
                ly.c cVar10 = bVar15.f130478b;
                y80.a aVarR2 = bVar15.f130479c.r();
                vc.s.j(aVarR2);
                return new com.revolut.camerakit.revolut.ui.flow.b(cVar10, aVarR2);
            case 18:
                ozj.b bVar16 = (ozj.b) obj2;
                efk.a aVar25 = bVar16.f231367a;
                switch (i3) {
                    case 0:
                        return new ifm.b();
                    case 1:
                        return new iri.j();
                    case 2:
                        return new ln.c();
                    case 3:
                        return new nzj.q();
                    case 4:
                        ffk.t tVarF = aVar25.f();
                        vc.s.j(tVarF);
                        wsg.n nVarB2 = bVar16.f231368b.b();
                        mt8.d dVarB2 = bVar16.f231369c.b();
                        vc.s.j(dVarB2);
                        return new mzj.h(tVarF, nVarB2, dVarB2, (nzj.d) bVar16.k.get());
                    case 5:
                        ln.a aVar26 = (ln.a) bVar16.f231372j.get();
                        zj2.a aVar27 = new zj2.a();
                        gte.a aVarB5 = bVar16.d.b();
                        vc.s.j(aVarB5);
                        return new nzj.p(aVar26, aVar27, aVarB5);
                    case 6:
                        ifm.b bVar17 = (ifm.b) bVar16.f231371h.get();
                        nzj.d dVar5 = (nzj.d) bVar16.k.get();
                        ffk.t tVarF2 = aVar25.f();
                        vc.s.j(tVarF2);
                        return new nzj.i(bVar17, dVar5, tVarF2, (mzj.a) bVar16.f231373l.get());
                    default:
                        throw new AssertionError(i3);
                }
            case 19:
                ozl.a aVar28 = (ozl.a) obj2;
                if (i3 == 0) {
                    WorkManager workManager = (WorkManager) aVar28.f231386c.get();
                    ih0.b remoteConfig = aVar28.f231385b.f();
                    vc.s.j(remoteConfig);
                    Intrinsics.checkNotNullParameter(workManager, "workManager");
                    Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                    return new nzl.a(workManager, remoteConfig);
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                z70.a contextProvider = aVar28.f231384a.f();
                vc.s.j(contextProvider);
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                WorkManager companion = WorkManager.INSTANCE.getInstance(contextProvider.getContext());
                vc.s.k(companion);
                return companion;
            case 20:
                p05.b bVar18 = (p05.b) obj2;
                if (i3 == 0) {
                    return new q05.a(bVar18.f231474b, bVar18.f231475c, bVar18.d, bVar18.e, bVar18.f, bVar18.f231476g, bVar18.f231473a);
                }
                if (i3 == 1) {
                    return new ava.d(bVar18.f231477h, bVar18.k, bVar18.i, i2);
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                q05.e eVar6 = (q05.e) ((q05.a) bVar18.f231478j.get()).b();
                vc.s.k(eVar6);
                return eVar6;
            case 21:
                p12.d dVar6 = (p12.d) obj2;
                l70.e eVar7 = dVar6.f231629a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new AssertionError(i3);
                    }
                    gte.a aVarB6 = dVar6.f231630b.b();
                    vc.s.j(aVarB6);
                    return new n32.k(aVarB6);
                }
                y80.a aVarR3 = eVar7.r();
                vc.s.j(aVarR3);
                s70.a aVarM = eVar7.m();
                vc.s.j(aVarM);
                return new n12.a(aVarM, aVarR3);
            case 22:
                return a();
            case 23:
                if (i3 == 0) {
                    return new y12.i((cli.n) ((p12.m) obj2).f231725a.get());
                }
                if (i3 == 1) {
                    return new y12.j();
                }
                throw new AssertionError(i3);
            case 24:
                p12.q qVar = (p12.q) obj2;
                if (i3 == 0) {
                    return new d22.g((cli.n) qVar.f231745b.get(), qVar.f231744a, new f22.a());
                }
                if (i3 == 1) {
                    return new d22.h();
                }
                throw new AssertionError(i3);
            case 25:
                p12.v vVar = (p12.v) obj2;
                ite.a aVar29 = vVar.f231777a;
                l70.e eVar8 = vVar.o;
                if (i3 == 0) {
                    gte.a aVarB7 = aVar29.b();
                    vc.s.j(aVarB7);
                    gte.a aVarB8 = aVar29.b();
                    vc.s.j(aVarB8);
                    o12.b bVar19 = new o12.b(aVarB8);
                    gte.a aVarB9 = aVar29.b();
                    vc.s.j(aVarB9);
                    return new n12.b(aVarB7, bVar19, new o12.d(aVarB9));
                }
                if (i3 == 1) {
                    return new u5k.d(vVar.d.a());
                }
                if (i3 == 2) {
                    s70.a aVarM2 = eVar8.m();
                    vc.s.j(aVarM2);
                    y80.a aVarR4 = eVar8.r();
                    vc.s.j(aVarR4);
                    return new pn3.b(aVarM2, aVarR4);
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new AssertionError(i3);
                    }
                    Context context = vVar.I;
                    p12.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return sri.o.c(context, null, null, 14);
                }
                n8b.b bVarB2 = vVar.f231792x.b();
                vc.s.j(bVarB2);
                fk3.a aVarA6 = vVar.G.a();
                vc.s.j(aVarA6);
                z80.b bVarS = eVar8.s();
                vc.s.j(bVarS);
                return new t22.b(bVarB2, aVarA6, bVarS);
            case 26:
                return b();
            case 27:
                return c();
            case 28:
                return d();
            default:
                if (i3 == 0) {
                    return new e32.f((cli.n) ((p12.q0) obj2).f231747a.get());
                }
                if (i3 == 1) {
                    return new e32.g();
                }
                throw new AssertionError(i3);
        }
    }
}
