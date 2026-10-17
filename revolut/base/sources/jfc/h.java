package jfc;

import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import com.revolut.feature.revpro.card_reader.order.impl.data.service.CardReaderOrdersService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ifc.f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements ab1.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f173863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardReaderOrdersService f173864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hfc.a f173865c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    public h(j memoryCache, CardReaderOrdersService service, hfc.a mapper) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f173863a = memoryCache;
        this.f173864b = service;
        this.f173865c = mapper;
        final int i = 3;
        final int i2 = 4;
        this.d = new w4l.f(new Function2(this) { // from class: jfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f173858b;

            {
                this.f173858b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ya1.g params = (ya1.g) obj2;
                        ya1.h domain = (ya1.h) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f173858b.f173863a.f(h.b(params), domain);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h hVar = this.f173858b;
                        d0<ifc.g> cardReaderOrdersInfo = hVar.f173864b.getCardReaderOrdersInfo();
                        jeg.h hVar2 = new jeg.h(new a(hVar, 0), 3);
                        cardReaderOrdersInfo.getClass();
                        ufm.i iVar = new ufm.i(cardReaderOrdersInfo, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f173858b.f173863a.f("CARD_READER_ORDERS_INFO_KEY", domain2);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        com.revolut.feature.acquiring.card_reader.order.api.model.a request = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "params");
                        h hVar3 = this.f173858b;
                        ((hfc.b) hVar3.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        String str = request.f60587a;
                        ifc.h vatSelection = hfc.b.a(request.f60588b);
                        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
                        d0<za1.a> cardReaderOrderInfo = hVar3.f173864b.getCardReaderOrderInfo(str, vatSelection.f160999b, Boolean.valueOf(vatSelection.f160998a));
                        jeg.h hVar4 = new jeg.h(new a(hVar3, 3), 4);
                        cardReaderOrderInfo.getClass();
                        ufm.i iVar2 = new ufm.i(cardReaderOrderInfo, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                        CardReaderOrderProductDetails productDetails = (CardReaderOrderProductDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f173858b.f173863a.f(h.a(params2), productDetails);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        ya1.g model = (ya1.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(model, "params");
                        h hVar5 = this.f173858b;
                        CardReaderOrdersService cardReaderOrdersService = hVar5.f173864b;
                        ((hfc.b) hVar5.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(model, "model");
                        ifc.h hVarA = hfc.b.a(model.f311899c);
                        d0<f.b> prices = cardReaderOrdersService.getPrices(new f.a(model.f311898b, model.f311897a.f306286a, hVarA.f160998a, hVarA.f160999b));
                        jeg.h hVar6 = new jeg.h(new a(hVar5, 4), 5);
                        prices.getClass();
                        ufm.i iVar3 = new ufm.i(prices, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, new a(this, 5), new Function2(this) { // from class: jfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f173858b;

            {
                this.f173858b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ya1.g params = (ya1.g) obj2;
                        ya1.h domain = (ya1.h) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f173858b.f173863a.f(h.b(params), domain);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h hVar = this.f173858b;
                        d0<ifc.g> cardReaderOrdersInfo = hVar.f173864b.getCardReaderOrdersInfo();
                        jeg.h hVar2 = new jeg.h(new a(hVar, 0), 3);
                        cardReaderOrdersInfo.getClass();
                        ufm.i iVar = new ufm.i(cardReaderOrdersInfo, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f173858b.f173863a.f("CARD_READER_ORDERS_INFO_KEY", domain2);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        com.revolut.feature.acquiring.card_reader.order.api.model.a request = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "params");
                        h hVar3 = this.f173858b;
                        ((hfc.b) hVar3.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        String str = request.f60587a;
                        ifc.h vatSelection = hfc.b.a(request.f60588b);
                        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
                        d0<za1.a> cardReaderOrderInfo = hVar3.f173864b.getCardReaderOrderInfo(str, vatSelection.f160999b, Boolean.valueOf(vatSelection.f160998a));
                        jeg.h hVar4 = new jeg.h(new a(hVar3, 3), 4);
                        cardReaderOrderInfo.getClass();
                        ufm.i iVar2 = new ufm.i(cardReaderOrderInfo, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                        CardReaderOrderProductDetails productDetails = (CardReaderOrderProductDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f173858b.f173863a.f(h.a(params2), productDetails);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        ya1.g model = (ya1.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(model, "params");
                        h hVar5 = this.f173858b;
                        CardReaderOrdersService cardReaderOrdersService = hVar5.f173864b;
                        ((hfc.b) hVar5.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(model, "model");
                        ifc.h hVarA = hfc.b.a(model.f311899c);
                        d0<f.b> prices = cardReaderOrdersService.getPrices(new f.a(model.f311898b, model.f311897a.f306286a, hVarA.f160998a, hVarA.f160999b));
                        jeg.h hVar6 = new jeg.h(new a(hVar5, 4), 5);
                        prices.getClass();
                        ufm.i iVar3 = new ufm.i(prices, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 5;
        final int i5 = 0;
        this.e = new w4l.f(new Function2(this) { // from class: jfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f173858b;

            {
                this.f173858b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        ya1.g params = (ya1.g) obj2;
                        ya1.h domain = (ya1.h) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f173858b.f173863a.f(h.b(params), domain);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h hVar = this.f173858b;
                        d0<ifc.g> cardReaderOrdersInfo = hVar.f173864b.getCardReaderOrdersInfo();
                        jeg.h hVar2 = new jeg.h(new a(hVar, 0), 3);
                        cardReaderOrdersInfo.getClass();
                        ufm.i iVar = new ufm.i(cardReaderOrdersInfo, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f173858b.f173863a.f("CARD_READER_ORDERS_INFO_KEY", domain2);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        com.revolut.feature.acquiring.card_reader.order.api.model.a request = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "params");
                        h hVar3 = this.f173858b;
                        ((hfc.b) hVar3.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        String str = request.f60587a;
                        ifc.h vatSelection = hfc.b.a(request.f60588b);
                        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
                        d0<za1.a> cardReaderOrderInfo = hVar3.f173864b.getCardReaderOrderInfo(str, vatSelection.f160999b, Boolean.valueOf(vatSelection.f160998a));
                        jeg.h hVar4 = new jeg.h(new a(hVar3, 3), 4);
                        cardReaderOrderInfo.getClass();
                        ufm.i iVar2 = new ufm.i(cardReaderOrderInfo, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                        CardReaderOrderProductDetails productDetails = (CardReaderOrderProductDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f173858b.f173863a.f(h.a(params2), productDetails);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        ya1.g model = (ya1.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(model, "params");
                        h hVar5 = this.f173858b;
                        CardReaderOrdersService cardReaderOrdersService = hVar5.f173864b;
                        ((hfc.b) hVar5.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(model, "model");
                        ifc.h hVarA = hfc.b.a(model.f311899c);
                        d0<f.b> prices = cardReaderOrdersService.getPrices(new f.a(model.f311898b, model.f311897a.f306286a, hVarA.f160998a, hVarA.f160999b));
                        jeg.h hVar6 = new jeg.h(new a(hVar5, 4), 5);
                        prices.getClass();
                        ufm.i iVar3 = new ufm.i(prices, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, new a(this, 1), new Function2(this) { // from class: jfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f173858b;

            {
                this.f173858b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        ya1.g params = (ya1.g) obj2;
                        ya1.h domain = (ya1.h) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f173858b.f173863a.f(h.b(params), domain);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h hVar = this.f173858b;
                        d0<ifc.g> cardReaderOrdersInfo = hVar.f173864b.getCardReaderOrdersInfo();
                        jeg.h hVar2 = new jeg.h(new a(hVar, 0), 3);
                        cardReaderOrdersInfo.getClass();
                        ufm.i iVar = new ufm.i(cardReaderOrdersInfo, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f173858b.f173863a.f("CARD_READER_ORDERS_INFO_KEY", domain2);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        com.revolut.feature.acquiring.card_reader.order.api.model.a request = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "params");
                        h hVar3 = this.f173858b;
                        ((hfc.b) hVar3.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        String str = request.f60587a;
                        ifc.h vatSelection = hfc.b.a(request.f60588b);
                        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
                        d0<za1.a> cardReaderOrderInfo = hVar3.f173864b.getCardReaderOrderInfo(str, vatSelection.f160999b, Boolean.valueOf(vatSelection.f160998a));
                        jeg.h hVar4 = new jeg.h(new a(hVar3, 3), 4);
                        cardReaderOrderInfo.getClass();
                        ufm.i iVar2 = new ufm.i(cardReaderOrderInfo, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                        CardReaderOrderProductDetails productDetails = (CardReaderOrderProductDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f173858b.f173863a.f(h.a(params2), productDetails);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        ya1.g model = (ya1.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(model, "params");
                        h hVar5 = this.f173858b;
                        CardReaderOrdersService cardReaderOrdersService = hVar5.f173864b;
                        ((hfc.b) hVar5.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(model, "model");
                        ifc.h hVarA = hfc.b.a(model.f311899c);
                        d0<f.b> prices = cardReaderOrdersService.getPrices(new f.a(model.f311898b, model.f311897a.f306286a, hVarA.f160998a, hVarA.f160999b));
                        jeg.h hVar6 = new jeg.h(new a(hVar5, 4), 5);
                        prices.getClass();
                        ufm.i iVar3 = new ufm.i(prices, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i6 = 1;
        Function2 function2 = new Function2(this) { // from class: jfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f173858b;

            {
                this.f173858b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        ya1.g params = (ya1.g) obj2;
                        ya1.h domain = (ya1.h) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f173858b.f173863a.f(h.b(params), domain);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h hVar = this.f173858b;
                        d0<ifc.g> cardReaderOrdersInfo = hVar.f173864b.getCardReaderOrdersInfo();
                        jeg.h hVar2 = new jeg.h(new a(hVar, 0), 3);
                        cardReaderOrdersInfo.getClass();
                        ufm.i iVar = new ufm.i(cardReaderOrdersInfo, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f173858b.f173863a.f("CARD_READER_ORDERS_INFO_KEY", domain2);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        com.revolut.feature.acquiring.card_reader.order.api.model.a request = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "params");
                        h hVar3 = this.f173858b;
                        ((hfc.b) hVar3.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        String str = request.f60587a;
                        ifc.h vatSelection = hfc.b.a(request.f60588b);
                        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
                        d0<za1.a> cardReaderOrderInfo = hVar3.f173864b.getCardReaderOrderInfo(str, vatSelection.f160999b, Boolean.valueOf(vatSelection.f160998a));
                        jeg.h hVar4 = new jeg.h(new a(hVar3, 3), 4);
                        cardReaderOrderInfo.getClass();
                        ufm.i iVar2 = new ufm.i(cardReaderOrderInfo, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                        CardReaderOrderProductDetails productDetails = (CardReaderOrderProductDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f173858b.f173863a.f(h.a(params2), productDetails);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        ya1.g model = (ya1.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(model, "params");
                        h hVar5 = this.f173858b;
                        CardReaderOrdersService cardReaderOrdersService = hVar5.f173864b;
                        ((hfc.b) hVar5.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(model, "model");
                        ifc.h hVarA = hfc.b.a(model.f311899c);
                        d0<f.b> prices = cardReaderOrdersService.getPrices(new f.a(model.f311898b, model.f311897a.f306286a, hVarA.f160998a, hVarA.f160999b));
                        jeg.h hVar6 = new jeg.h(new a(hVar5, 4), 5);
                        prices.getClass();
                        ufm.i iVar3 = new ufm.i(prices, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        };
        final int i21 = 2;
        this.f = new w4l.f(function2, new a(this, i21), new Function2(this) { // from class: jfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f173858b;

            {
                this.f173858b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        ya1.g params = (ya1.g) obj2;
                        ya1.h domain = (ya1.h) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f173858b.f173863a.f(h.b(params), domain);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        h hVar = this.f173858b;
                        d0<ifc.g> cardReaderOrdersInfo = hVar.f173864b.getCardReaderOrdersInfo();
                        jeg.h hVar2 = new jeg.h(new a(hVar, 0), 3);
                        cardReaderOrdersInfo.getClass();
                        ufm.i iVar = new ufm.i(cardReaderOrdersInfo, hVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f173858b.f173863a.f("CARD_READER_ORDERS_INFO_KEY", domain2);
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        com.revolut.feature.acquiring.card_reader.order.api.model.a request = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "params");
                        h hVar3 = this.f173858b;
                        ((hfc.b) hVar3.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        String str = request.f60587a;
                        ifc.h vatSelection = hfc.b.a(request.f60588b);
                        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
                        d0<za1.a> cardReaderOrderInfo = hVar3.f173864b.getCardReaderOrderInfo(str, vatSelection.f160999b, Boolean.valueOf(vatSelection.f160998a));
                        jeg.h hVar4 = new jeg.h(new a(hVar3, 3), 4);
                        cardReaderOrderInfo.getClass();
                        ufm.i iVar2 = new ufm.i(cardReaderOrderInfo, hVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                        CardReaderOrderProductDetails productDetails = (CardReaderOrderProductDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                        this.f173858b.f173863a.f(h.a(params2), productDetails);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        ya1.g model = (ya1.g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(model, "params");
                        h hVar5 = this.f173858b;
                        CardReaderOrdersService cardReaderOrdersService = hVar5.f173864b;
                        ((hfc.b) hVar5.f173865c).getClass();
                        Intrinsics.checkNotNullParameter(model, "model");
                        ifc.h hVarA = hfc.b.a(model.f311899c);
                        d0<f.b> prices = cardReaderOrdersService.getPrices(new f.a(model.f311898b, model.f311897a.f306286a, hVarA.f160998a, hVarA.f160999b));
                        jeg.h hVar6 = new jeg.h(new a(hVar5, 4), 5);
                        prices.getClass();
                        ufm.i iVar3 = new ufm.i(prices, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String a(com.revolut.feature.acquiring.card_reader.order.api.model.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return j6.a.s("CARD_READER_PRODUCT_DETAILS_KEYProductDetailsRequest(currencyCode=", aVar.f60587a, ", vatSelection=", i.a(aVar.f60588b), ")");
    }

    public static String b(ya1.g gVar) {
        String str = gVar.f311897a.f306286a;
        int i = gVar.f311898b;
        return v0.a.i(v0.a.k(i, "CARD_READER_ORDER_PRICES_KEYRequest(currencyCode=", str, ", numberOfTerminals=", ", vatSelection="), i.a(gVar.f311899c), ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ya1.a r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jfc.d
            if (r0 == 0) goto L13
            r0 = r6
            jfc.d r0 = (jfc.d) r0
            int r1 = r0.f173859w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173859w = r1
            goto L18
        L13:
            jfc.d r0 = new jfc.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f173859w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            jfc.e r6 = new jfc.e
            r2 = 0
            r6.<init>(r4, r5, r2)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            r0.f173859w = r3
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            ifc.b$b r6 = (ifc.b.C0918b) r6
            ya1.b r5 = new ya1.b
            java.lang.String r6 = r6.getOrderId()
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jfc.h.c(ya1.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ya1.e r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jfc.f
            if (r0 == 0) goto L13
            r0 = r6
            jfc.f r0 = (jfc.f) r0
            int r1 = r0.f173861w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173861w = r1
            goto L18
        L13:
            jfc.f r0 = new jfc.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f173861w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L8b
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            jfc.g r6 = new jfc.g     // Catch: java.lang.Exception -> L8b
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: java.lang.Exception -> L8b
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Exception -> L8b
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Exception -> L8b
            r0.f173861w = r3     // Catch: java.lang.Exception -> L8b
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)     // Catch: java.lang.Exception -> L8b
            if (r6 != r1) goto L45
            return r1
        L45:
            ifc.d$b r6 = (ifc.d.b) r6     // Catch: java.lang.Exception -> L8b
            hfc.a r5 = r4.f173865c     // Catch: java.lang.Exception -> L8b
            hfc.b r5 = (hfc.b) r5     // Catch: java.lang.Exception -> L8b
            r5.getClass()     // Catch: java.lang.Exception -> L8b
            ya1.f$a$b r5 = ya1.f.a.b.f311894a     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "dto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = r6.getResult()     // Catch: java.lang.Exception -> L8b
            int r0 = r6.hashCode()     // Catch: java.lang.Exception -> L8b
            r1 = -1149187101(0xffffffffbb80cbe3, float:-0.003930555)
            if (r0 == r1) goto L7f
            r1 = 86317810(0x5251af2, float:7.763212E-36)
            if (r0 == r1) goto L73
            r1 = 2066319421(0x7b29883d, float:8.802614E35)
            if (r0 == r1) goto L6d
            goto L87
        L6d:
            java.lang.String r0 = "FAILED"
            r6.equals(r0)     // Catch: java.lang.Exception -> L8b
            return r5
        L73:
            java.lang.String r0 = "INSUFFICIENT_FUNDS"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L8b
            if (r6 != 0) goto L7c
            goto L87
        L7c:
            ya1.f$a$c r5 = ya1.f.a.c.f311895a     // Catch: java.lang.Exception -> L8b
            return r5
        L7f:
            java.lang.String r0 = "SUCCESS"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L8b
            if (r6 != 0) goto L88
        L87:
            return r5
        L88:
            ya1.f$a$d r5 = ya1.f.a.d.f311896a     // Catch: java.lang.Exception -> L8b
            return r5
        L8b:
            ya1.f$a$a r5 = ya1.f.a.C1734a.f311893a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jfc.h.d(ya1.e, gim.c):java.lang.Object");
    }
}
