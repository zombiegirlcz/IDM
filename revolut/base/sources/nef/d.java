package nef;

import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.feature.transaction.recogniser.impl.services.TransactionRecogniserService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nd.n;
import nd.o;
import nd8.i;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import w4l.f;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserService f214505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f214506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f214507c;
    public final o d;
    public final n e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f214508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f214509h;
    public final f i;

    public d(TransactionRecogniserService service, j memoryCache, ue0.c storage, oef.b recogniserDetailsMapper, o merchantTransactionsMapper, n beforeAfterTransactionsMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(recogniserDetailsMapper, "recogniserDetailsMapper");
        Intrinsics.checkNotNullParameter(merchantTransactionsMapper, "merchantTransactionsMapper");
        Intrinsics.checkNotNullParameter(beforeAfterTransactionsMapper, "beforeAfterTransactionsMapper");
        this.f214505a = service;
        this.f214506b = memoryCache;
        this.f214507c = storage;
        this.d = merchantTransactionsMapper;
        this.e = beforeAfterTransactionsMapper;
        final int i = 0;
        final int i2 = 9;
        final int i3 = 1;
        this.f = new f(new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 6), new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 7), new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 2;
        final int i6 = 3;
        final int i21 = 4;
        this.f214508g = new f(new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 0), new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 1), new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 5;
        final int i32 = 6;
        final int i33 = 7;
        this.f214509h = new f(new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 4), new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 5), new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 8;
        this.i = new f(new Function2(this) { // from class: nef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f214502b;

            {
                this.f214502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String transactionId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d dVar = this.f214502b;
                        d0<lef.f> details = dVar.f214505a.getDetails(transactionId);
                        nd3.a aVar = new nd3.a(new i(dVar, 4), 2);
                        details.getClass();
                        ufm.i iVar = new ufm.i(details, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        String id10 = (String) obj2;
                        TransactionRecogniserDetails domain = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "data");
                        ue0.c cVar = this.f214502b.f214507c;
                        String strB = d.b(id10);
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        RecogniserTransaction recogniserTransaction = domain.f91803a;
                        String str = recogniserTransaction.f91800a;
                        String str2 = recogniserTransaction.f91801b;
                        dj0.d dVar2 = recogniserTransaction.f91802c;
                        cVar.G(new lef.f(str, str2, new lef.d(dVar2.f115082a, dVar2.f115083b.f306286a), oi0.d.R(recogniserTransaction.d), recogniserTransaction.e, recogniserTransaction.f, domain.f91804b, domain.f91805c, domain.d, domain.e, domain.f), strB, z.d(o0.b(lef.f.class)));
                        return Unit.f186387a;
                    case 2:
                        f DataObservableDelegate2 = (f) obj2;
                        pef.a params = (pef.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d dVar3 = this.f214502b;
                        d0<lef.c> merchantTransactions = dVar3.f214505a.getMerchantTransactions(params.f235373a, params.f235374b);
                        nd3.a aVar2 = new nd3.a(new b(dVar3, 2), 3);
                        merchantTransactions.getClass();
                        ufm.i iVar2 = new ufm.i(merchantTransactions, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        pef.a params2 = (pef.a) obj2;
                        gef.b merchantTransactions2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(merchantTransactions2, "merchantTransactions");
                        this.f214502b.f214506b.f(d.c(params2), merchantTransactions2);
                        return Unit.f186387a;
                    case 4:
                        pef.a params3 = (pef.a) obj2;
                        gef.b domain2 = (gef.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "data");
                        ue0.c cVar2 = this.f214502b.f214507c;
                        String strC = d.c(params3);
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        long jR = oi0.d.R(domain2.f143282a);
                        boolean z = domain2.f143283b;
                        ArrayList arrayList = domain2.f143284c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(oef.a.b((RecogniserTransaction) it8.next()));
                        }
                        cVar2.G(new lef.c(jR, arrayList2, z), strC, z.d(o0.b(lef.c.class)));
                        return Unit.f186387a;
                    case 5:
                        f DataObservableDelegate3 = (f) obj2;
                        String transactionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        d dVar4 = this.f214502b;
                        d0<lef.a> beforeAfterTransactions = dVar4.f214505a.getBeforeAfterTransactions(transactionId2);
                        nd3.a aVar3 = new nd3.a(new b(dVar4, 3), 4);
                        beforeAfterTransactions.getClass();
                        ufm.i iVar3 = new ufm.i(beforeAfterTransactions, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        String id11 = (String) obj2;
                        gef.a beforeAfterTransactions2 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(beforeAfterTransactions2, "beforeAfterTransactions");
                        this.f214502b.f214506b.f(d.a(id11), beforeAfterTransactions2);
                        return Unit.f186387a;
                    case 7:
                        String id12 = (String) obj2;
                        gef.a domain3 = (gef.a) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(domain3, "data");
                        ue0.c cVar3 = this.f214502b.f214507c;
                        String strA = d.a(id12);
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        ArrayList arrayList3 = domain3.f143281a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(oef.a.b((RecogniserTransaction) it9.next()));
                        }
                        cVar3.G(new lef.a(arrayList4), strA, z.d(o0.b(lef.a.class)));
                        return Unit.f186387a;
                    case 8:
                        f DataObservableDelegate4 = (f) obj2;
                        pef.b it10 = (pef.b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return this.f214502b.f214505a.updateTransactionNote(it10.f235375a, new lef.b(it10.f235376b));
                    default:
                        String id13 = (String) obj2;
                        TransactionRecogniserDetails details2 = (TransactionRecogniserDetails) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f214502b.f214506b.f(d.b(id13), details2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, null, null, 254);
    }

    public static String a(String str) {
        return j6.a.q("BEFORE_AFTER_KEY_", str);
    }

    public static String b(String str) {
        return j6.a.q("RECOGNISER_DETAILS_KEY_", str);
    }

    public static String c(pef.a aVar) {
        return "MERCHANT_TRANSACTION_KEY_" + aVar.f235373a + aVar.f235374b;
    }
}
