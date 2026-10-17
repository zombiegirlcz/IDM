package k7c;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayDeferredPaymentsService;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements y7c.a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f181960g = new TypeToken<List<? extends l7c.b>>() { // from class: com.revolut.feature.revolutpay.impl.data.repository.MerchantInitiatedDeferredPaymentRepositoryImpl$Companion$LIST_OF_DEFERRED_PAYMENT_ENTITY_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayDeferredPaymentsService f181961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f181962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f181963c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    public h(RevolutPayDeferredPaymentsService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f181961a = service;
        this.f181962b = memoryCache;
        this.f181963c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i2 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i2++;
                            }
                        }
                        if (i2 >= 0) {
                            arrayListF1.set(i2, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i3 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i3++;
                            }
                        }
                        if (i3 >= 0) {
                            arrayListF12.set(i3, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        };
        e eVar = new e(this, 2);
        final int i2 = 3;
        Function2 function22 = new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i22 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i22++;
                            }
                        }
                        if (i22 >= 0) {
                            arrayListF1.set(i22, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i3 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i3++;
                            }
                        }
                        if (i3 >= 0) {
                            arrayListF12.set(i3, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        };
        e eVar2 = new e(this, i2);
        final int i3 = 4;
        this.d = new w4l.f(function2, eVar, function22, eVar2, new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i22 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i22++;
                            }
                        }
                        if (i22 >= 0) {
                            arrayListF1.set(i22, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i32 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i32++;
                            }
                        }
                        if (i32 >= 0) {
                            arrayListF12.set(i32, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 5;
        final int i6 = 6;
        final int i21 = 7;
        this.e = new w4l.f(new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i22 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i22++;
                            }
                        }
                        if (i22 >= 0) {
                            arrayListF1.set(i22, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i32 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i32++;
                            }
                        }
                        if (i32 >= 0) {
                            arrayListF12.set(i32, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, 4), new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i22 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i22++;
                            }
                        }
                        if (i22 >= 0) {
                            arrayListF1.set(i22, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i32 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i32++;
                            }
                        }
                        if (i32 >= 0) {
                            arrayListF12.set(i32, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, 5), new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i22 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i22 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i22++;
                            }
                        }
                        if (i22 >= 0) {
                            arrayListF1.set(i22, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i32 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i32++;
                            }
                        }
                        if (i32 >= 0) {
                            arrayListF12.set(i32, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        Function2 function23 = new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i222 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i222 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i222++;
                            }
                        }
                        if (i222 >= 0) {
                            arrayListF1.set(i222, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i32 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i32 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i32++;
                            }
                        }
                        if (i32 >= 0) {
                            arrayListF12.set(i32, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        };
        e eVar3 = new e(this, i22);
        final int i32 = 2;
        this.f = new w4l.f(function23, eVar3, new Function2(this) { // from class: k7c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f181954b;

            {
                this.f181954b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<e7c.h> deferredPayments = this.f181954b.f181961a.getDeferredPayments();
                        k64.a aVar = new k64.a(7, new d(2));
                        deferredPayments.getClass();
                        ufm.i iVar = new ufm.i(deferredPayments, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String paymentId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                        efm.d0<e7c.f> deferredPaymentCheckDebit = this.f181954b.f181961a.getDeferredPaymentCheckDebit(paymentId);
                        k64.a aVar2 = new k64.a(4, new d(0));
                        deferredPaymentCheckDebit.getClass();
                        ufm.i iVar2 = new ufm.i(deferredPaymentCheckDebit, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        String paymentId2 = (String) obj2;
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-" + paymentId2, bool);
                        break;
                    case 3:
                        List payments = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments, "payments");
                        this.f181954b.f181962b.f("DEFERRED_PAYMENT_LIST_CACHE_ID", payments);
                        break;
                    case 4:
                        List payments2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payments2, "payments");
                        this.f181954b.b(payments2);
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String paymentId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                        h hVar = this.f181954b;
                        efm.d0<e7c.g> deferredPayment = hVar.f181961a.getDeferredPayment(paymentId3);
                        k64.a aVar3 = new k64.a(5, new d(1));
                        deferredPayment.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(deferredPayment, aVar3, 1), new k64.a(6, new k79.b(hVar, paymentId3, 3)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 6:
                        r7c.a payment = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        ne0.j jVar = this.f181954b.f181962b;
                        List list = (List) jVar.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                        if (list == null) {
                            list = zhm.f0.f322471a;
                        }
                        int size = list.size();
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        Iterator it9 = arrayListF1.iterator();
                        int i222 = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i222 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it9.next()).f252080a, payment.f252080a)) {
                                i222++;
                            }
                        }
                        if (i222 >= 0) {
                            arrayListF1.set(i222, payment);
                        } else {
                            arrayListF1.add(size, payment);
                        }
                        jVar.f("DEFERRED_PAYMENT_LIST_CACHE_ID", arrayListF1);
                        break;
                    default:
                        r7c.a payment2 = (r7c.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        h hVar2 = this.f181954b;
                        List listA = hVar2.a();
                        if (listA == null) {
                            listA = zhm.f0.f322471a;
                        }
                        int size2 = listA.size();
                        ArrayList arrayListF12 = zhm.d0.f1(listA);
                        Iterator it10 = arrayListF12.iterator();
                        int i322 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                i322 = -1;
                            } else if (!Intrinsics.f(((r7c.a) it10.next()).f252080a, payment2.f252080a)) {
                                i322++;
                            }
                        }
                        if (i322 >= 0) {
                            arrayListF12.set(i322, payment2);
                        } else {
                            arrayListF12.add(size2, payment2);
                        }
                        hVar2.b(arrayListF12);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ArrayList a() {
        Type LIST_OF_DEFERRED_PAYMENT_ENTITY_TYPE = f181960g;
        Intrinsics.checkNotNullExpressionValue(LIST_OF_DEFERRED_PAYMENT_ENTITY_TYPE, "LIST_OF_DEFERRED_PAYMENT_ENTITY_TYPE");
        List list = (List) this.f181963c.T2("DEFERRED_PAYMENT_LIST_STORAGE_ID", LIST_OF_DEFERRED_PAYMENT_ENTITY_TYPE);
        if (list == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
            l7c.b bVar = (l7c.b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String strC = bVar.getId();
            r7c.c cVar = (r7c.c) u1.t(bVar.getType(), r7c.c.UNKNOWN, d7c.c.b());
            r7c.b bVar2 = (r7c.b) u1.t(bVar.getState(), r7c.b.UNKNOWN, d7c.c.a());
            String strH = bVar.getTitle();
            long jA = bVar.getAmount();
            xi0.a aVar = xi0.b.Companion;
            String strB = bVar.getCurrency();
            aVar.getClass();
            dj0.d dVar = new dj0.d(jA, xi0.a.a(strB));
            LocalDate localDate = LocalDate.parse(bVar.getNextDate());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            boolean zF = bVar.getRecurring();
            l7c.c cVarE = bVar.getReceiverInfo();
            Intrinsics.checkNotNullParameter(cVarE, "<this>");
            arrayList.add(new r7c.a(strC, cVar, bVar2, strH, dVar, localDate, zF, new d6c.c(cVarE.getTitle(), (d6c.a) u1.t(cVarE.getCategory(), d6c.a.UNKNOWN, d7c.c.c()), cVarE.getLogoUrl())));
        }
        return arrayList;
    }

    public final void b(List list) {
        String str = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            r7c.a aVar = (r7c.a) it8.next();
            Intrinsics.checkNotNullParameter(aVar, str);
            String str2 = aVar.f252080a;
            String strH = u1.h(aVar.f252081b, d7c.c.b());
            if (strH == null) {
                strH = "UNKNOWN";
            }
            String strH2 = u1.h(aVar.f252082c, d7c.c.a());
            if (strH2 == null) {
                strH2 = "UNKNOWN";
            }
            String str3 = aVar.d;
            dj0.d dVar = aVar.e;
            long j2 = dVar.f115082a;
            String str4 = dVar.f115083b.f306286a;
            String string = aVar.f.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String str5 = strH2;
            boolean z = aVar.f252083g;
            d6c.c cVar = aVar.f252084h;
            Intrinsics.checkNotNullParameter(cVar, str);
            String str6 = "UNKNOWN";
            Iterator it9 = it8;
            String str7 = cVar.f111482a;
            String str8 = str;
            String strH3 = u1.h(cVar.f111483b, d7c.c.c());
            if (strH3 != null) {
                str6 = strH3;
            }
            arrayList.add(new l7c.b(str2, strH, str5, str3, j2, str4, string, z, new l7c.c(str7, str6, cVar.f111484c)));
            it8 = it9;
            str = str8;
        }
        this.f181963c.G(arrayList, "DEFERRED_PAYMENT_LIST_STORAGE_ID", kii.e.o(l7c.b.class, KTypeProjection.INSTANCE, List.class));
    }
}
