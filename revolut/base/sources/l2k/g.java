package l2k;

import com.revolut.data.network.models.transfer.mapper.TransferReasonEmbeddedDtoMapperKt;
import com.revolut.data.network.models.transfer.mapper.TransferReasonsValuesDtoMapperKt;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.retail.feature.payments.bank_transfer.impl.data.network.BankTransferService;
import com.youTransactor.uCube.rpc.Constants;
import d9.t0;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import k7c.n;
import k8d.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kq2.m;
import kq2.o;
import m2k.b0;
import m2k.l;
import m2k.p;
import m2k.q;
import m2k.r;
import m2k.x;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements q2k.f {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f191822g = n9l.b.SEC_3.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferService f191823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f191824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rga.c f191825c;
    public final w4l.f d;
    public final qe0.f e;
    public final w4l.f f;

    public g(BankTransferService bankTransferService, j additionalInformationConfigMemoryCache, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(bankTransferService, "bankTransferService");
        Intrinsics.checkNotNullParameter(additionalInformationConfigMemoryCache, "additionalInformationConfigMemoryCache");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f191823a = bankTransferService;
        this.f191824b = additionalInformationConfigMemoryCache;
        this.f191825c = priceQuoteTraceIdHolder;
        final int i = 0;
        this.d = new w4l.f(new Function2(this) { // from class: l2k.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191814b;

            {
                this.f191814b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                xi0.b bVar;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f191814b;
                        String strB = gVar.f191825c.b("payments_bank_transfer_price_quote");
                        String str = strB == null ? null : strB;
                        BankTransferService bankTransferService2 = gVar.f191823a;
                        Pair pair = params.f191810a;
                        dj0.d dVar = params.f191812c;
                        String strD = cp5.d.d(pair);
                        long j2 = params.f191811b;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        String str2 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
                        String str3 = params.d;
                        String str4 = params.e;
                        String str5 = params.f;
                        d0<m2k.j> transferExchangeRate = bankTransferService2.getTransferExchangeRate(strD, str, j2, lValueOf, str2, str3, str4, str5 == null ? null : str5, null);
                        l2d.b bVar2 = new l2d.b(new n(str, 27), 7);
                        transferExchangeRate.getClass();
                        i iVar = new i(transferExchangeRate, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        a params2 = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<m2k.a> additionalInformationConfig = this.f191814b.f191823a.getAdditionalInformationConfig(params2.f191807a, params2.f191808b, params2.f191809c, params2.d);
                        l2d.b bVar3 = new l2d.b(new l2d.a(5), 9);
                        additionalInformationConfig.getClass();
                        i iVar2 = new i(additionalInformationConfig, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return ue0.e.F(iVar2, new krf.a());
                    default:
                        a params3 = (a) obj2;
                        krf.a config = (krf.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f191814b.f191824b.f(nz8.d.b(params3), config);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, null, null, 254);
        final int i2 = 0;
        this.e = new qe0.f(new Function1(this) { // from class: l2k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191816b;

            {
                this.f191816b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                xi0.b bVar;
                switch (i2) {
                    case 0:
                        b params = (b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f191816b;
                        String strB = gVar.f191825c.b("payments_bank_transfer_price_quote");
                        String str = strB == null ? null : strB;
                        BankTransferService bankTransferService2 = gVar.f191823a;
                        Pair pair = params.f191810a;
                        dj0.d dVar = params.f191812c;
                        String strD = cp5.d.d(pair);
                        long j2 = params.f191811b;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        String str2 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
                        String str3 = params.d;
                        String str4 = params.e;
                        String str5 = params.f;
                        d0<m2k.j> transferExchangeRate = bankTransferService2.getTransferExchangeRate(strD, str, j2, lValueOf, str2, str3, str4, str5 == null ? null : str5, null);
                        l2d.b bVar2 = new l2d.b(new n(str, 28), 8);
                        transferExchangeRate.getClass();
                        i iVar = new i(transferExchangeRate, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (krf.a) this.f191816b.f191824b.get(nz8.d.b(params2));
                }
            }
        }, new t(19), new l2d.a(3), new l2d.a(4));
        final int i3 = 1;
        Function2 function2 = new Function2(this) { // from class: l2k.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191814b;

            {
                this.f191814b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                xi0.b bVar;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f191814b;
                        String strB = gVar.f191825c.b("payments_bank_transfer_price_quote");
                        String str = strB == null ? null : strB;
                        BankTransferService bankTransferService2 = gVar.f191823a;
                        Pair pair = params.f191810a;
                        dj0.d dVar = params.f191812c;
                        String strD = cp5.d.d(pair);
                        long j2 = params.f191811b;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        String str2 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
                        String str3 = params.d;
                        String str4 = params.e;
                        String str5 = params.f;
                        d0<m2k.j> transferExchangeRate = bankTransferService2.getTransferExchangeRate(strD, str, j2, lValueOf, str2, str3, str4, str5 == null ? null : str5, null);
                        l2d.b bVar2 = new l2d.b(new n(str, 27), 7);
                        transferExchangeRate.getClass();
                        i iVar = new i(transferExchangeRate, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        a params2 = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<m2k.a> additionalInformationConfig = this.f191814b.f191823a.getAdditionalInformationConfig(params2.f191807a, params2.f191808b, params2.f191809c, params2.d);
                        l2d.b bVar3 = new l2d.b(new l2d.a(5), 9);
                        additionalInformationConfig.getClass();
                        i iVar2 = new i(additionalInformationConfig, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return ue0.e.F(iVar2, new krf.a());
                    default:
                        a params3 = (a) obj2;
                        krf.a config = (krf.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f191814b.f191824b.f(nz8.d.b(params3), config);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: l2k.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191816b;

            {
                this.f191816b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                xi0.b bVar;
                switch (i3) {
                    case 0:
                        b params = (b) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f191816b;
                        String strB = gVar.f191825c.b("payments_bank_transfer_price_quote");
                        String str = strB == null ? null : strB;
                        BankTransferService bankTransferService2 = gVar.f191823a;
                        Pair pair = params.f191810a;
                        dj0.d dVar = params.f191812c;
                        String strD = cp5.d.d(pair);
                        long j2 = params.f191811b;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        String str2 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
                        String str3 = params.d;
                        String str4 = params.e;
                        String str5 = params.f;
                        d0<m2k.j> transferExchangeRate = bankTransferService2.getTransferExchangeRate(strD, str, j2, lValueOf, str2, str3, str4, str5 == null ? null : str5, null);
                        l2d.b bVar2 = new l2d.b(new n(str, 28), 8);
                        transferExchangeRate.getClass();
                        i iVar = new i(transferExchangeRate, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        a params2 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (krf.a) this.f191816b.f191824b.get(nz8.d.b(params2));
                }
            }
        };
        final int i5 = 2;
        this.f = new w4l.f(function2, function1, new Function2(this) { // from class: l2k.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f191814b;

            {
                this.f191814b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                xi0.b bVar;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f191814b;
                        String strB = gVar.f191825c.b("payments_bank_transfer_price_quote");
                        String str = strB == null ? null : strB;
                        BankTransferService bankTransferService2 = gVar.f191823a;
                        Pair pair = params.f191810a;
                        dj0.d dVar = params.f191812c;
                        String strD = cp5.d.d(pair);
                        long j2 = params.f191811b;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        String str2 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
                        String str3 = params.d;
                        String str4 = params.e;
                        String str5 = params.f;
                        d0<m2k.j> transferExchangeRate = bankTransferService2.getTransferExchangeRate(strD, str, j2, lValueOf, str2, str3, str4, str5 == null ? null : str5, null);
                        l2d.b bVar2 = new l2d.b(new n(str, 27), 7);
                        transferExchangeRate.getClass();
                        i iVar = new i(transferExchangeRate, bVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        a params2 = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        d0<m2k.a> additionalInformationConfig = this.f191814b.f191823a.getAdditionalInformationConfig(params2.f191807a, params2.f191808b, params2.f191809c, params2.d);
                        l2d.b bVar3 = new l2d.b(new l2d.a(5), 9);
                        additionalInformationConfig.getClass();
                        i iVar2 = new i(additionalInformationConfig, bVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return ue0.e.F(iVar2, new krf.a());
                    default:
                        a params3 = (a) obj2;
                        krf.a config = (krf.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f191814b.f191824b.f(nz8.d.b(params3), config);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ufm.n b(String beneficiaryId, t0 fundingSourceId, xi0.b sourceCurrency, xi0.b targetCurrency, long j2, String str, prf.f fVar, UltimateDebtor ultimateDebtor, m mVar, TransferAppSource transferAppSource, rtf.c cVar, kq2.c cVar2, Integer num, o oVar, Map map, String str2, kq2.g gVar, String str3, String str4) {
        p oVar2;
        Map mapC;
        b0 b0Var;
        m2k.t tVar;
        String key;
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(fundingSourceId, "fundingSourceId");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        wj0.b bVar = new wj0.b("payments_bank_transfer");
        Intrinsics.checkNotNullParameter(fundingSourceId, "<this>");
        if (fundingSourceId instanceof c2k.a) {
            oVar2 = new l(((c2k.a) fundingSourceId).f20820b);
        } else if (fundingSourceId instanceof c2k.b) {
            oVar2 = new m2k.m(((c2k.b) fundingSourceId).f20821b);
        } else if (fundingSourceId instanceof c2k.c) {
            oVar2 = new m2k.n(((c2k.c) fundingSourceId).f20822b);
        } else {
            if (!(fundingSourceId instanceof c2k.d)) {
                throw new NoWhenBranchMatchedException();
            }
            oVar2 = new m2k.o(((c2k.d) fundingSourceId).f20823b);
        }
        String str5 = sourceCurrency.f306286a;
        String str6 = targetCurrency.f306286a;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String str7 = fVar.f239009a;
            Iterable<prf.e> iterable = (Iterable) fVar.f239010b;
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            for (prf.e eVar : iterable) {
                arrayList.add(new x(eVar.f239007a, eVar.f239008b));
            }
            mapC = q0.c(new Pair(str7, arrayList));
        } else {
            mapC = null;
        }
        if (ultimateDebtor != null) {
            Intrinsics.checkNotNullParameter(ultimateDebtor, "<this>");
            b0Var = new b0(oo3.a.d(ultimateDebtor.f64086b), ultimateDebtor.f64085a);
        } else {
            b0Var = null;
        }
        if (mVar != null) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            tVar = n2k.a.f211581a[mVar.ordinal()] == 1 ? m2k.t.STANDARD : null;
        } else {
            tVar = null;
        }
        if (transferAppSource != null) {
            Intrinsics.checkNotNullParameter(transferAppSource, "<this>");
            key = transferAppSource.getKey();
        } else {
            key = null;
        }
        String strB = transferAppSource != null ? q11.a.b(transferAppSource) : null;
        krf.c cVarI = mra.d.i(cVar);
        ibl.d embeddedDto = cVarI != null ? TransferReasonEmbeddedDtoMapperKt.toEmbeddedDto(cVarI) : null;
        TransferReasonsValues transferReasonsValuesK = mra.d.k(cVar);
        d0<List<r>> d0VarTransfer = this.f191823a.transfer(new q(beneficiaryId, oVar2, str5, str6, j2, str, mapC, b0Var, tVar, key, strB, embeddedDto, transferReasonsValuesK != null ? TransferReasonsValuesDtoMapperKt.toDto(transferReasonsValuesK) : null, cVar2 != null ? n2k.b.c(cVar2) : null, map, oVar, gVar == kq2.g.SIX ? "SIX" : null, str3, str4, num), bVar, str2);
        l2d.b bVar2 = new l2d.b(new l2d.a(7), 6);
        d0VarTransfer.getClass();
        i iVar = new i(d0VarTransfer, bVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.n c(final String beneficiaryId, final xi0.b sourceCurrency, final xi0.b targetCurrency, final long j2, final long j3, final String str, final kq2.c cVar, final String str2) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        i iVar = new i(new ufm.c(new Callable() { // from class: l2k.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g gVar = this.f191817a;
                String strB = gVar.f191825c.b("payments_bank_transfer_price_quote");
                String str3 = strB != null ? strB : null;
                BankTransferService bankTransferService = gVar.f191823a;
                String str4 = sourceCurrency.f306286a;
                String str5 = targetCurrency.f306286a;
                String str6 = str;
                String str7 = str6 == null ? null : str6;
                kq2.c cVar2 = cVar;
                return bankTransferService.getTransferAvailableTypes(str3, beneficiaryId, str4, str5, j2, j3, str7, cVar2 != null ? n2k.b.c(cVar2) : null, str2);
            }
        }, 0), new l2d.b(new l2d.a(6), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }
}
