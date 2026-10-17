package i4i;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature_market_data_impl.data.model.OrderQuoteLimitsParams;
import com.revolut.feature_market_data_impl.data.network.OrderQuoteService;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import efm.d0;
import i2l.n0;
import i4h.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n4i.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f158500h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteService f158501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f158502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4i.a f158503c;
    public final ue0.c d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f158504g;

    static {
        Type type = new TypeToken<a4i.a>() { // from class: com.revolut.feature_market_data_impl.data.repositories.OrderQuoteRepositoryImpl$Companion$TYPE_FEE_BREAKDOWN_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f158500h = type;
    }

    public g(OrderQuoteService service, j memoryCache, l4i.a amountConverter, ue0.c storage, lfm.c appCompositeDisposable) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        this.f158501a = service;
        this.f158502b = memoryCache;
        this.f158503c = amountConverter;
        this.d = storage;
        final int i = 3;
        final int i2 = 2;
        final int i3 = 5;
        this.e = new w4l.f(new Function2(this) { // from class: i4i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158494b;

            {
                this.f158494b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<e8l.d> retailFeeBreakdown;
                int i5 = i;
                g gVar = this.f158494b;
                switch (i5) {
                    case 0:
                        OrderQuoteService orderQuoteService = gVar.f158501a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        z3i.b bVar = request.f158498b;
                        String str = request.f158497a;
                        int i6 = e.f158499a[bVar.ordinal()];
                        if (i6 == 1) {
                            retailFeeBreakdown = orderQuoteService.getRetailFeeBreakdown(str);
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            retailFeeBreakdown = orderQuoteService.getCryptoExchangeFeeBreakdown(str);
                        }
                        i31.e eVar = new i31.e(28, new q(9));
                        retailFeeBreakdown.getClass();
                        i iVar = new i(retailFeeBreakdown, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d request2 = (d) obj2;
                        ChargeBreakdown value = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f158502b.f(g.a(request2), value);
                        return Unit.f186387a;
                    case 2:
                        d request3 = (d) obj2;
                        ChargeBreakdown value2 = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = gVar.d;
                        String strB = g.b(request3);
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        dj0.d dVarB = l4i.a.b(value2.f104722a);
                        Amount amount = value2.f104724c;
                        dj0.d dVarB2 = amount != null ? l4i.a.b(amount) : null;
                        jo3.b bVar2 = new jo3.b(dVarB.f115082a, dVarB.f115083b.f306286a);
                        jo3.b bVar3 = dVarB2 != null ? new jo3.b(dVarB2.f115082a, dVarB2.f115083b.f306286a) : null;
                        List<ChargeEntry> list = value2.f104723b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ChargeEntry chargeEntry : list) {
                            dj0.d dVarB3 = l4i.a.b(chargeEntry.e);
                            Amount amount2 = chargeEntry.f;
                            dj0.d dVarB4 = amount2 != null ? l4i.a.b(amount2) : null;
                            Amount amount3 = chargeEntry.f104728g;
                            dj0.d dVarB5 = amount3 != null ? l4i.a.b(amount3) : null;
                            String str2 = chargeEntry.f104725a;
                            String str3 = chargeEntry.f104727c;
                            jo3.b bVar4 = bVar2;
                            jo3.b bVar5 = new jo3.b(dVarB3.f115082a, dVarB3.f115083b.f306286a);
                            String str4 = chargeEntry.f104726b;
                            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                            arrayList.add(new a4i.c(str2, str4, str3, chargeEntryDetails != null ? new a4i.b(chargeEntryDetails.f104729a, chargeEntryDetails.f104730b) : null, bVar5, dVarB4 != null ? new jo3.b(dVarB4.f115082a, dVarB4.f115083b.f306286a) : null, dVarB5 != null ? new jo3.b(dVarB5.f115082a, dVarB5.f115083b.f306286a) : null));
                            bVar2 = bVar4;
                        }
                        cVar.G(new a4i.a(bVar2, bVar3, arrayList), strB, z.d(o0.b(a4i.a.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        OrderQuoteLimitsParams orderQuoteParams = (OrderQuoteLimitsParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                        d0<j59.a> quoteLimits = gVar.f158501a.getQuoteLimits(cp5.d.d(orderQuoteParams.f97104a), orderQuoteParams.f97105b, orderQuoteParams.f97106c, orderQuoteParams.d);
                        i31.e eVar2 = new i31.e(27, new q(8));
                        quoteLimits.getClass();
                        i iVar2 = new i(quoteLimits, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair currencyPair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        d0<h4i.a> limits = gVar.f158501a.getLimits(com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) currencyPair.f186385a).f306286a, "/", ((xi0.b) currencyPair.f186386b).f306286a));
                        f fVar = f.f;
                        h35.c cVar2 = new h35.c(12);
                        limits.getClass();
                        i iVar3 = new i(limits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        OrderQuoteLimitsParams params = (OrderQuoteLimitsParams) obj2;
                        k59.c data = (k59.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        gVar.f158502b.f(g.c(params), data);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: i4i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158496b;

            {
                this.f158496b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (ChargeBreakdown) this.f158496b.f158502b.get(g.a(request));
                    case 1:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        g gVar = this.f158496b;
                        a4i.a aVar = (a4i.a) gVar.d.T2(g.b(request2), g.f158500h);
                        if (aVar == null) {
                            return null;
                        }
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        long amount = aVar.getTotal().getAmount();
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getTotal().getCurrency();
                        aVar2.getClass();
                        dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
                        Amount amountE = aVar.getTotalConverted() != null ? l4i.a.e(new dj0.d(aVar.getTotalConverted().getAmount(), xi0.a.a(aVar.getTotalConverted().getCurrency()))) : null;
                        Amount amountE2 = l4i.a.e(dVar);
                        List<a4i.c> breakdown = aVar.getBreakdown();
                        ArrayList arrayList = new ArrayList(w.t(breakdown, 10));
                        for (a4i.c cVar : breakdown) {
                            long amount2 = cVar.getAmount().getAmount();
                            xi0.a aVar3 = xi0.b.Companion;
                            String currency2 = cVar.getAmount().getCurrency();
                            aVar3.getClass();
                            dj0.d dVar2 = new dj0.d(amount2, xi0.a.a(currency2));
                            dj0.d dVar3 = cVar.getAmountConverted() != null ? new dj0.d(cVar.getAmountConverted().getAmount(), xi0.a.a(cVar.getAmountConverted().getCurrency())) : null;
                            dj0.d dVar4 = cVar.getAmountInBaseCurrency() != null ? new dj0.d(cVar.getAmountInBaseCurrency().getAmount(), xi0.a.a(cVar.getAmountInBaseCurrency().getCurrency())) : null;
                            a4i.b details = cVar.getDetails();
                            arrayList.add(new ChargeEntry(cVar.getTitle(), cVar.getShortDescription(), cVar.getDescription(), details != null ? new ChargeEntryDetails(details.getTitle(), details.getUrl()) : null, l4i.a.e(dVar2), dVar4 != null ? l4i.a.e(dVar4) : null, dVar3 != null ? l4i.a.e(dVar3) : null));
                        }
                        return new ChargeBreakdown(amountE2, arrayList, amountE, 8);
                    default:
                        OrderQuoteLimitsParams it8 = (OrderQuoteLimitsParams) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k59.c) this.f158496b.f158502b.get(g.c(it8));
                }
            }
        }, new Function2(this) { // from class: i4i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158494b;

            {
                this.f158494b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<e8l.d> retailFeeBreakdown;
                int i5 = i3;
                g gVar = this.f158494b;
                switch (i5) {
                    case 0:
                        OrderQuoteService orderQuoteService = gVar.f158501a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        z3i.b bVar = request.f158498b;
                        String str = request.f158497a;
                        int i6 = e.f158499a[bVar.ordinal()];
                        if (i6 == 1) {
                            retailFeeBreakdown = orderQuoteService.getRetailFeeBreakdown(str);
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            retailFeeBreakdown = orderQuoteService.getCryptoExchangeFeeBreakdown(str);
                        }
                        i31.e eVar = new i31.e(28, new q(9));
                        retailFeeBreakdown.getClass();
                        i iVar = new i(retailFeeBreakdown, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d request2 = (d) obj2;
                        ChargeBreakdown value = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f158502b.f(g.a(request2), value);
                        return Unit.f186387a;
                    case 2:
                        d request3 = (d) obj2;
                        ChargeBreakdown value2 = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = gVar.d;
                        String strB = g.b(request3);
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        dj0.d dVarB = l4i.a.b(value2.f104722a);
                        Amount amount = value2.f104724c;
                        dj0.d dVarB2 = amount != null ? l4i.a.b(amount) : null;
                        jo3.b bVar2 = new jo3.b(dVarB.f115082a, dVarB.f115083b.f306286a);
                        jo3.b bVar3 = dVarB2 != null ? new jo3.b(dVarB2.f115082a, dVarB2.f115083b.f306286a) : null;
                        List<ChargeEntry> list = value2.f104723b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ChargeEntry chargeEntry : list) {
                            dj0.d dVarB3 = l4i.a.b(chargeEntry.e);
                            Amount amount2 = chargeEntry.f;
                            dj0.d dVarB4 = amount2 != null ? l4i.a.b(amount2) : null;
                            Amount amount3 = chargeEntry.f104728g;
                            dj0.d dVarB5 = amount3 != null ? l4i.a.b(amount3) : null;
                            String str2 = chargeEntry.f104725a;
                            String str3 = chargeEntry.f104727c;
                            jo3.b bVar4 = bVar2;
                            jo3.b bVar5 = new jo3.b(dVarB3.f115082a, dVarB3.f115083b.f306286a);
                            String str4 = chargeEntry.f104726b;
                            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                            arrayList.add(new a4i.c(str2, str4, str3, chargeEntryDetails != null ? new a4i.b(chargeEntryDetails.f104729a, chargeEntryDetails.f104730b) : null, bVar5, dVarB4 != null ? new jo3.b(dVarB4.f115082a, dVarB4.f115083b.f306286a) : null, dVarB5 != null ? new jo3.b(dVarB5.f115082a, dVarB5.f115083b.f306286a) : null));
                            bVar2 = bVar4;
                        }
                        cVar.G(new a4i.a(bVar2, bVar3, arrayList), strB, z.d(o0.b(a4i.a.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        OrderQuoteLimitsParams orderQuoteParams = (OrderQuoteLimitsParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                        d0<j59.a> quoteLimits = gVar.f158501a.getQuoteLimits(cp5.d.d(orderQuoteParams.f97104a), orderQuoteParams.f97105b, orderQuoteParams.f97106c, orderQuoteParams.d);
                        i31.e eVar2 = new i31.e(27, new q(8));
                        quoteLimits.getClass();
                        i iVar2 = new i(quoteLimits, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair currencyPair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        d0<h4i.a> limits = gVar.f158501a.getLimits(com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) currencyPair.f186385a).f306286a, "/", ((xi0.b) currencyPair.f186386b).f306286a));
                        f fVar = f.f;
                        h35.c cVar2 = new h35.c(12);
                        limits.getClass();
                        i iVar3 = new i(limits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        OrderQuoteLimitsParams params = (OrderQuoteLimitsParams) obj2;
                        k59.c data = (k59.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        gVar.f158502b.f(g.c(params), data);
                        return Unit.f186387a;
                }
            }
        }, new q(10), new n0(8), null, null, null, BERTags.FLAGS);
        final int i5 = 0;
        Function2 function2 = new Function2(this) { // from class: i4i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158494b;

            {
                this.f158494b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<e8l.d> retailFeeBreakdown;
                int i59 = i5;
                g gVar = this.f158494b;
                switch (i59) {
                    case 0:
                        OrderQuoteService orderQuoteService = gVar.f158501a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        z3i.b bVar = request.f158498b;
                        String str = request.f158497a;
                        int i6 = e.f158499a[bVar.ordinal()];
                        if (i6 == 1) {
                            retailFeeBreakdown = orderQuoteService.getRetailFeeBreakdown(str);
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            retailFeeBreakdown = orderQuoteService.getCryptoExchangeFeeBreakdown(str);
                        }
                        i31.e eVar = new i31.e(28, new q(9));
                        retailFeeBreakdown.getClass();
                        i iVar = new i(retailFeeBreakdown, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d request2 = (d) obj2;
                        ChargeBreakdown value = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f158502b.f(g.a(request2), value);
                        return Unit.f186387a;
                    case 2:
                        d request3 = (d) obj2;
                        ChargeBreakdown value2 = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = gVar.d;
                        String strB = g.b(request3);
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        dj0.d dVarB = l4i.a.b(value2.f104722a);
                        Amount amount = value2.f104724c;
                        dj0.d dVarB2 = amount != null ? l4i.a.b(amount) : null;
                        jo3.b bVar2 = new jo3.b(dVarB.f115082a, dVarB.f115083b.f306286a);
                        jo3.b bVar3 = dVarB2 != null ? new jo3.b(dVarB2.f115082a, dVarB2.f115083b.f306286a) : null;
                        List<ChargeEntry> list = value2.f104723b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ChargeEntry chargeEntry : list) {
                            dj0.d dVarB3 = l4i.a.b(chargeEntry.e);
                            Amount amount2 = chargeEntry.f;
                            dj0.d dVarB4 = amount2 != null ? l4i.a.b(amount2) : null;
                            Amount amount3 = chargeEntry.f104728g;
                            dj0.d dVarB5 = amount3 != null ? l4i.a.b(amount3) : null;
                            String str2 = chargeEntry.f104725a;
                            String str3 = chargeEntry.f104727c;
                            jo3.b bVar4 = bVar2;
                            jo3.b bVar5 = new jo3.b(dVarB3.f115082a, dVarB3.f115083b.f306286a);
                            String str4 = chargeEntry.f104726b;
                            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                            arrayList.add(new a4i.c(str2, str4, str3, chargeEntryDetails != null ? new a4i.b(chargeEntryDetails.f104729a, chargeEntryDetails.f104730b) : null, bVar5, dVarB4 != null ? new jo3.b(dVarB4.f115082a, dVarB4.f115083b.f306286a) : null, dVarB5 != null ? new jo3.b(dVarB5.f115082a, dVarB5.f115083b.f306286a) : null));
                            bVar2 = bVar4;
                        }
                        cVar.G(new a4i.a(bVar2, bVar3, arrayList), strB, z.d(o0.b(a4i.a.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        OrderQuoteLimitsParams orderQuoteParams = (OrderQuoteLimitsParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                        d0<j59.a> quoteLimits = gVar.f158501a.getQuoteLimits(cp5.d.d(orderQuoteParams.f97104a), orderQuoteParams.f97105b, orderQuoteParams.f97106c, orderQuoteParams.d);
                        i31.e eVar2 = new i31.e(27, new q(8));
                        quoteLimits.getClass();
                        i iVar2 = new i(quoteLimits, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair currencyPair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        d0<h4i.a> limits = gVar.f158501a.getLimits(com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) currencyPair.f186385a).f306286a, "/", ((xi0.b) currencyPair.f186386b).f306286a));
                        f fVar = f.f;
                        h35.c cVar2 = new h35.c(12);
                        limits.getClass();
                        i iVar3 = new i(limits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        OrderQuoteLimitsParams params = (OrderQuoteLimitsParams) obj2;
                        k59.c data = (k59.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        gVar.f158502b.f(g.c(params), data);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: i4i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158496b;

            {
                this.f158496b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (ChargeBreakdown) this.f158496b.f158502b.get(g.a(request));
                    case 1:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        g gVar = this.f158496b;
                        a4i.a aVar = (a4i.a) gVar.d.T2(g.b(request2), g.f158500h);
                        if (aVar == null) {
                            return null;
                        }
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        long amount = aVar.getTotal().getAmount();
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getTotal().getCurrency();
                        aVar2.getClass();
                        dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
                        Amount amountE = aVar.getTotalConverted() != null ? l4i.a.e(new dj0.d(aVar.getTotalConverted().getAmount(), xi0.a.a(aVar.getTotalConverted().getCurrency()))) : null;
                        Amount amountE2 = l4i.a.e(dVar);
                        List<a4i.c> breakdown = aVar.getBreakdown();
                        ArrayList arrayList = new ArrayList(w.t(breakdown, 10));
                        for (a4i.c cVar : breakdown) {
                            long amount2 = cVar.getAmount().getAmount();
                            xi0.a aVar3 = xi0.b.Companion;
                            String currency2 = cVar.getAmount().getCurrency();
                            aVar3.getClass();
                            dj0.d dVar2 = new dj0.d(amount2, xi0.a.a(currency2));
                            dj0.d dVar3 = cVar.getAmountConverted() != null ? new dj0.d(cVar.getAmountConverted().getAmount(), xi0.a.a(cVar.getAmountConverted().getCurrency())) : null;
                            dj0.d dVar4 = cVar.getAmountInBaseCurrency() != null ? new dj0.d(cVar.getAmountInBaseCurrency().getAmount(), xi0.a.a(cVar.getAmountInBaseCurrency().getCurrency())) : null;
                            a4i.b details = cVar.getDetails();
                            arrayList.add(new ChargeEntry(cVar.getTitle(), cVar.getShortDescription(), cVar.getDescription(), details != null ? new ChargeEntryDetails(details.getTitle(), details.getUrl()) : null, l4i.a.e(dVar2), dVar4 != null ? l4i.a.e(dVar4) : null, dVar3 != null ? l4i.a.e(dVar3) : null));
                        }
                        return new ChargeBreakdown(amountE2, arrayList, amountE, 8);
                    default:
                        OrderQuoteLimitsParams it8 = (OrderQuoteLimitsParams) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k59.c) this.f158496b.f158502b.get(g.c(it8));
                }
            }
        };
        final int i6 = 1;
        Function2 function22 = new Function2(this) { // from class: i4i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158494b;

            {
                this.f158494b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<e8l.d> retailFeeBreakdown;
                int i59 = i6;
                g gVar = this.f158494b;
                switch (i59) {
                    case 0:
                        OrderQuoteService orderQuoteService = gVar.f158501a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        z3i.b bVar = request.f158498b;
                        String str = request.f158497a;
                        int i66 = e.f158499a[bVar.ordinal()];
                        if (i66 == 1) {
                            retailFeeBreakdown = orderQuoteService.getRetailFeeBreakdown(str);
                        } else {
                            if (i66 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            retailFeeBreakdown = orderQuoteService.getCryptoExchangeFeeBreakdown(str);
                        }
                        i31.e eVar = new i31.e(28, new q(9));
                        retailFeeBreakdown.getClass();
                        i iVar = new i(retailFeeBreakdown, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d request2 = (d) obj2;
                        ChargeBreakdown value = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f158502b.f(g.a(request2), value);
                        return Unit.f186387a;
                    case 2:
                        d request3 = (d) obj2;
                        ChargeBreakdown value2 = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = gVar.d;
                        String strB = g.b(request3);
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        dj0.d dVarB = l4i.a.b(value2.f104722a);
                        Amount amount = value2.f104724c;
                        dj0.d dVarB2 = amount != null ? l4i.a.b(amount) : null;
                        jo3.b bVar2 = new jo3.b(dVarB.f115082a, dVarB.f115083b.f306286a);
                        jo3.b bVar3 = dVarB2 != null ? new jo3.b(dVarB2.f115082a, dVarB2.f115083b.f306286a) : null;
                        List<ChargeEntry> list = value2.f104723b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ChargeEntry chargeEntry : list) {
                            dj0.d dVarB3 = l4i.a.b(chargeEntry.e);
                            Amount amount2 = chargeEntry.f;
                            dj0.d dVarB4 = amount2 != null ? l4i.a.b(amount2) : null;
                            Amount amount3 = chargeEntry.f104728g;
                            dj0.d dVarB5 = amount3 != null ? l4i.a.b(amount3) : null;
                            String str2 = chargeEntry.f104725a;
                            String str3 = chargeEntry.f104727c;
                            jo3.b bVar4 = bVar2;
                            jo3.b bVar5 = new jo3.b(dVarB3.f115082a, dVarB3.f115083b.f306286a);
                            String str4 = chargeEntry.f104726b;
                            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                            arrayList.add(new a4i.c(str2, str4, str3, chargeEntryDetails != null ? new a4i.b(chargeEntryDetails.f104729a, chargeEntryDetails.f104730b) : null, bVar5, dVarB4 != null ? new jo3.b(dVarB4.f115082a, dVarB4.f115083b.f306286a) : null, dVarB5 != null ? new jo3.b(dVarB5.f115082a, dVarB5.f115083b.f306286a) : null));
                            bVar2 = bVar4;
                        }
                        cVar.G(new a4i.a(bVar2, bVar3, arrayList), strB, z.d(o0.b(a4i.a.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        OrderQuoteLimitsParams orderQuoteParams = (OrderQuoteLimitsParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                        d0<j59.a> quoteLimits = gVar.f158501a.getQuoteLimits(cp5.d.d(orderQuoteParams.f97104a), orderQuoteParams.f97105b, orderQuoteParams.f97106c, orderQuoteParams.d);
                        i31.e eVar2 = new i31.e(27, new q(8));
                        quoteLimits.getClass();
                        i iVar2 = new i(quoteLimits, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair currencyPair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        d0<h4i.a> limits = gVar.f158501a.getLimits(com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) currencyPair.f186385a).f306286a, "/", ((xi0.b) currencyPair.f186386b).f306286a));
                        f fVar = f.f;
                        h35.c cVar2 = new h35.c(12);
                        limits.getClass();
                        i iVar3 = new i(limits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        OrderQuoteLimitsParams params = (OrderQuoteLimitsParams) obj2;
                        k59.c data = (k59.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        gVar.f158502b.f(g.c(params), data);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: i4i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158496b;

            {
                this.f158496b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (ChargeBreakdown) this.f158496b.f158502b.get(g.a(request));
                    case 1:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        g gVar = this.f158496b;
                        a4i.a aVar = (a4i.a) gVar.d.T2(g.b(request2), g.f158500h);
                        if (aVar == null) {
                            return null;
                        }
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        long amount = aVar.getTotal().getAmount();
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getTotal().getCurrency();
                        aVar2.getClass();
                        dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
                        Amount amountE = aVar.getTotalConverted() != null ? l4i.a.e(new dj0.d(aVar.getTotalConverted().getAmount(), xi0.a.a(aVar.getTotalConverted().getCurrency()))) : null;
                        Amount amountE2 = l4i.a.e(dVar);
                        List<a4i.c> breakdown = aVar.getBreakdown();
                        ArrayList arrayList = new ArrayList(w.t(breakdown, 10));
                        for (a4i.c cVar : breakdown) {
                            long amount2 = cVar.getAmount().getAmount();
                            xi0.a aVar3 = xi0.b.Companion;
                            String currency2 = cVar.getAmount().getCurrency();
                            aVar3.getClass();
                            dj0.d dVar2 = new dj0.d(amount2, xi0.a.a(currency2));
                            dj0.d dVar3 = cVar.getAmountConverted() != null ? new dj0.d(cVar.getAmountConverted().getAmount(), xi0.a.a(cVar.getAmountConverted().getCurrency())) : null;
                            dj0.d dVar4 = cVar.getAmountInBaseCurrency() != null ? new dj0.d(cVar.getAmountInBaseCurrency().getAmount(), xi0.a.a(cVar.getAmountInBaseCurrency().getCurrency())) : null;
                            a4i.b details = cVar.getDetails();
                            arrayList.add(new ChargeEntry(cVar.getTitle(), cVar.getShortDescription(), cVar.getDescription(), details != null ? new ChargeEntryDetails(details.getTitle(), details.getUrl()) : null, l4i.a.e(dVar2), dVar4 != null ? l4i.a.e(dVar4) : null, dVar3 != null ? l4i.a.e(dVar3) : null));
                        }
                        return new ChargeBreakdown(amountE2, arrayList, amountE, 8);
                    default:
                        OrderQuoteLimitsParams it8 = (OrderQuoteLimitsParams) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (k59.c) this.f158496b.f158502b.get(g.c(it8));
                }
            }
        };
        final int i21 = 2;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: i4i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158494b;

            {
                this.f158494b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<e8l.d> retailFeeBreakdown;
                int i59 = i21;
                g gVar = this.f158494b;
                switch (i59) {
                    case 0:
                        OrderQuoteService orderQuoteService = gVar.f158501a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        z3i.b bVar = request.f158498b;
                        String str = request.f158497a;
                        int i66 = e.f158499a[bVar.ordinal()];
                        if (i66 == 1) {
                            retailFeeBreakdown = orderQuoteService.getRetailFeeBreakdown(str);
                        } else {
                            if (i66 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            retailFeeBreakdown = orderQuoteService.getCryptoExchangeFeeBreakdown(str);
                        }
                        i31.e eVar = new i31.e(28, new q(9));
                        retailFeeBreakdown.getClass();
                        i iVar = new i(retailFeeBreakdown, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d request2 = (d) obj2;
                        ChargeBreakdown value = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f158502b.f(g.a(request2), value);
                        return Unit.f186387a;
                    case 2:
                        d request3 = (d) obj2;
                        ChargeBreakdown value2 = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = gVar.d;
                        String strB = g.b(request3);
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        dj0.d dVarB = l4i.a.b(value2.f104722a);
                        Amount amount = value2.f104724c;
                        dj0.d dVarB2 = amount != null ? l4i.a.b(amount) : null;
                        jo3.b bVar2 = new jo3.b(dVarB.f115082a, dVarB.f115083b.f306286a);
                        jo3.b bVar3 = dVarB2 != null ? new jo3.b(dVarB2.f115082a, dVarB2.f115083b.f306286a) : null;
                        List<ChargeEntry> list = value2.f104723b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ChargeEntry chargeEntry : list) {
                            dj0.d dVarB3 = l4i.a.b(chargeEntry.e);
                            Amount amount2 = chargeEntry.f;
                            dj0.d dVarB4 = amount2 != null ? l4i.a.b(amount2) : null;
                            Amount amount3 = chargeEntry.f104728g;
                            dj0.d dVarB5 = amount3 != null ? l4i.a.b(amount3) : null;
                            String str2 = chargeEntry.f104725a;
                            String str3 = chargeEntry.f104727c;
                            jo3.b bVar4 = bVar2;
                            jo3.b bVar5 = new jo3.b(dVarB3.f115082a, dVarB3.f115083b.f306286a);
                            String str4 = chargeEntry.f104726b;
                            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                            arrayList.add(new a4i.c(str2, str4, str3, chargeEntryDetails != null ? new a4i.b(chargeEntryDetails.f104729a, chargeEntryDetails.f104730b) : null, bVar5, dVarB4 != null ? new jo3.b(dVarB4.f115082a, dVarB4.f115083b.f306286a) : null, dVarB5 != null ? new jo3.b(dVarB5.f115082a, dVarB5.f115083b.f306286a) : null));
                            bVar2 = bVar4;
                        }
                        cVar.G(new a4i.a(bVar2, bVar3, arrayList), strB, z.d(o0.b(a4i.a.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        OrderQuoteLimitsParams orderQuoteParams = (OrderQuoteLimitsParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                        d0<j59.a> quoteLimits = gVar.f158501a.getQuoteLimits(cp5.d.d(orderQuoteParams.f97104a), orderQuoteParams.f97105b, orderQuoteParams.f97106c, orderQuoteParams.d);
                        i31.e eVar2 = new i31.e(27, new q(8));
                        quoteLimits.getClass();
                        i iVar2 = new i(quoteLimits, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair currencyPair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        d0<h4i.a> limits = gVar.f158501a.getLimits(com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) currencyPair.f186385a).f306286a, "/", ((xi0.b) currencyPair.f186386b).f306286a));
                        f fVar = f.f;
                        h35.c cVar2 = new h35.c(12);
                        limits.getClass();
                        i iVar3 = new i(limits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        OrderQuoteLimitsParams params = (OrderQuoteLimitsParams) obj2;
                        k59.c data = (k59.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        gVar.f158502b.f(g.c(params), data);
                        return Unit.f186387a;
                }
            }
        }, null, null, appCompositeDisposable, 96);
        final int i22 = 4;
        this.f158504g = new w4l.f(new Function2(this) { // from class: i4i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f158494b;

            {
                this.f158494b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<e8l.d> retailFeeBreakdown;
                int i59 = i22;
                g gVar = this.f158494b;
                switch (i59) {
                    case 0:
                        OrderQuoteService orderQuoteService = gVar.f158501a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        z3i.b bVar = request.f158498b;
                        String str = request.f158497a;
                        int i66 = e.f158499a[bVar.ordinal()];
                        if (i66 == 1) {
                            retailFeeBreakdown = orderQuoteService.getRetailFeeBreakdown(str);
                        } else {
                            if (i66 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            retailFeeBreakdown = orderQuoteService.getCryptoExchangeFeeBreakdown(str);
                        }
                        i31.e eVar = new i31.e(28, new q(9));
                        retailFeeBreakdown.getClass();
                        i iVar = new i(retailFeeBreakdown, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        d request2 = (d) obj2;
                        ChargeBreakdown value = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(value, "value");
                        gVar.f158502b.f(g.a(request2), value);
                        return Unit.f186387a;
                    case 2:
                        d request3 = (d) obj2;
                        ChargeBreakdown value2 = (ChargeBreakdown) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        ue0.c cVar = gVar.d;
                        String strB = g.b(request3);
                        l4i.a amountConverter2 = gVar.f158503c;
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        Intrinsics.checkNotNullParameter(amountConverter2, "amountConverter");
                        dj0.d dVarB = l4i.a.b(value2.f104722a);
                        Amount amount = value2.f104724c;
                        dj0.d dVarB2 = amount != null ? l4i.a.b(amount) : null;
                        jo3.b bVar2 = new jo3.b(dVarB.f115082a, dVarB.f115083b.f306286a);
                        jo3.b bVar3 = dVarB2 != null ? new jo3.b(dVarB2.f115082a, dVarB2.f115083b.f306286a) : null;
                        List<ChargeEntry> list = value2.f104723b;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ChargeEntry chargeEntry : list) {
                            dj0.d dVarB3 = l4i.a.b(chargeEntry.e);
                            Amount amount2 = chargeEntry.f;
                            dj0.d dVarB4 = amount2 != null ? l4i.a.b(amount2) : null;
                            Amount amount3 = chargeEntry.f104728g;
                            dj0.d dVarB5 = amount3 != null ? l4i.a.b(amount3) : null;
                            String str2 = chargeEntry.f104725a;
                            String str3 = chargeEntry.f104727c;
                            jo3.b bVar4 = bVar2;
                            jo3.b bVar5 = new jo3.b(dVarB3.f115082a, dVarB3.f115083b.f306286a);
                            String str4 = chargeEntry.f104726b;
                            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
                            arrayList.add(new a4i.c(str2, str4, str3, chargeEntryDetails != null ? new a4i.b(chargeEntryDetails.f104729a, chargeEntryDetails.f104730b) : null, bVar5, dVarB4 != null ? new jo3.b(dVarB4.f115082a, dVarB4.f115083b.f306286a) : null, dVarB5 != null ? new jo3.b(dVarB5.f115082a, dVarB5.f115083b.f306286a) : null));
                            bVar2 = bVar4;
                        }
                        cVar.G(new a4i.a(bVar2, bVar3, arrayList), strB, z.d(o0.b(a4i.a.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        OrderQuoteLimitsParams orderQuoteParams = (OrderQuoteLimitsParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                        d0<j59.a> quoteLimits = gVar.f158501a.getQuoteLimits(cp5.d.d(orderQuoteParams.f97104a), orderQuoteParams.f97105b, orderQuoteParams.f97106c, orderQuoteParams.d);
                        i31.e eVar2 = new i31.e(27, new q(8));
                        quoteLimits.getClass();
                        i iVar2 = new i(quoteLimits, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair currencyPair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        d0<h4i.a> limits = gVar.f158501a.getLimits(com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) currencyPair.f186385a).f306286a, "/", ((xi0.b) currencyPair.f186386b).f306286a));
                        f fVar = f.f;
                        h35.c cVar2 = new h35.c(12);
                        limits.getClass();
                        i iVar3 = new i(limits, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        OrderQuoteLimitsParams params = (OrderQuoteLimitsParams) obj2;
                        k59.c data = (k59.c) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        gVar.f158502b.f(g.c(params), data);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, null, appCompositeDisposable, 126);
    }

    public static String a(d dVar) {
        String str;
        int i = e.f158499a[dVar.f158498b.ordinal()];
        if (i == 1) {
            str = "/fee-breakdown";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "/crypto-exchange/fee-breakdown";
        }
        return a0.d.s("KEY_FEE_BREAKDOWN_MEMORY_", str, "_", dVar.f158497a);
    }

    public static String b(d dVar) {
        String str;
        int i = e.f158499a[dVar.f158498b.ordinal()];
        if (i == 1) {
            str = "/fee-breakdown";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "/crypto-exchange/fee-breakdown";
        }
        return a0.d.s("KEY_FEE_BREAKDOWN_STORAGE_", str, "_", dVar.f158497a);
    }

    public static String c(OrderQuoteLimitsParams orderQuoteLimitsParams) {
        return ((xi0.b) orderQuoteLimitsParams.f97104a.f186385a).f306286a + '_' + ((xi0.b) orderQuoteLimitsParams.f97104a.f186386b).f306286a + '_' + orderQuoteLimitsParams.f97105b + '_' + orderQuoteLimitsParams.f97106c + '_' + orderQuoteLimitsParams.d;
    }
}
