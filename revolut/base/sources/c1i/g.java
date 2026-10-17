package c1i;

import c03.u;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_exchange.impl.network.service.FxService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wd6.j;
import z0i.h;
import z0i.i;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FxService f20523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f20524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f20525c;
    public final Type d;
    public final w4l.f e;

    public g(FxService service, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f20523a = service;
        this.f20524b = storage;
        this.f20525c = new ne0.d();
        this.d = new TypeToken<List<? extends h>>() { // from class: com.revolut.feature_exchange.impl.repository.FxOrderRepositoryImpl$exchangeOrderListType$1
        }.getType();
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: c1i.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f20519b;

            {
                this.f20519b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                h hVarA;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<i> fxOrders = this.f20519b.f20523a.getFxOrders();
                        u uVar = new u(16, new c09.a(14));
                        fxOrders.getClass();
                        ufm.i iVar = new ufm.i(fxOrders, uVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.d dVar = this.f20519b.f20525c;
                        dVar.getClass();
                        dVar.f("ORDERS_CONTENT_KEY", value);
                        return Unit.f186387a;
                    default:
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = this.f20519b.f20524b;
                        List<ExchangeOrder> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ExchangeOrder exchangeOrder : list) {
                            Intrinsics.checkNotNullParameter(exchangeOrder, "<this>");
                            if (exchangeOrder instanceof ExchangeOrder.Active) {
                                hVarA = h.a(a1i.b.a(((ExchangeOrder.Active) exchangeOrder).f72129a), u1.g(j.ACTIVE, a1i.c.f638c), null, null, null, null, 15871);
                            } else if (exchangeOrder instanceof ExchangeOrder.Completed) {
                                ExchangeOrder.Completed completed = (ExchangeOrder.Completed) exchangeOrder;
                                h hVarA2 = a1i.b.a(completed.f72131a);
                                String strG = u1.g(j.COMPLETED, a1i.c.f638c);
                                String strValueOf = String.valueOf(completed.f72133c);
                                dj0.d dVar2 = completed.d;
                                jo3.a aVarP = dVar2 != null ? mo3.a.p(dVar2) : null;
                                dj0.d dVar3 = completed.e;
                                hVarA = h.a(hVarA2, strG, strValueOf, aVarP, dVar3 != null ? mo3.a.p(dVar3) : null, null, 8703);
                            } else {
                                if (!(exchangeOrder instanceof ExchangeOrder.Failed)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ExchangeOrder.Failed failed = (ExchangeOrder.Failed) exchangeOrder;
                                hVarA = h.a(a1i.b.a(failed.f72134a), u1.g(j.FAILED, a1i.c.f638c), null, null, null, Integer.valueOf(failed.f72136c.a()), 7679);
                            }
                            arrayList.add(hVarA);
                        }
                        eVar.G(arrayList, "ORDERS_CONTENT_KEY", kii.e.o(h.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        d dVar = new d(this, i);
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: c1i.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f20519b;

            {
                this.f20519b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                h hVarA;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<i> fxOrders = this.f20519b.f20523a.getFxOrders();
                        u uVar = new u(16, new c09.a(14));
                        fxOrders.getClass();
                        ufm.i iVar = new ufm.i(fxOrders, uVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.d dVar2 = this.f20519b.f20525c;
                        dVar2.getClass();
                        dVar2.f("ORDERS_CONTENT_KEY", value);
                        return Unit.f186387a;
                    default:
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = this.f20519b.f20524b;
                        List<ExchangeOrder> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ExchangeOrder exchangeOrder : list) {
                            Intrinsics.checkNotNullParameter(exchangeOrder, "<this>");
                            if (exchangeOrder instanceof ExchangeOrder.Active) {
                                hVarA = h.a(a1i.b.a(((ExchangeOrder.Active) exchangeOrder).f72129a), u1.g(j.ACTIVE, a1i.c.f638c), null, null, null, null, 15871);
                            } else if (exchangeOrder instanceof ExchangeOrder.Completed) {
                                ExchangeOrder.Completed completed = (ExchangeOrder.Completed) exchangeOrder;
                                h hVarA2 = a1i.b.a(completed.f72131a);
                                String strG = u1.g(j.COMPLETED, a1i.c.f638c);
                                String strValueOf = String.valueOf(completed.f72133c);
                                dj0.d dVar22 = completed.d;
                                jo3.a aVarP = dVar22 != null ? mo3.a.p(dVar22) : null;
                                dj0.d dVar3 = completed.e;
                                hVarA = h.a(hVarA2, strG, strValueOf, aVarP, dVar3 != null ? mo3.a.p(dVar3) : null, null, 8703);
                            } else {
                                if (!(exchangeOrder instanceof ExchangeOrder.Failed)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ExchangeOrder.Failed failed = (ExchangeOrder.Failed) exchangeOrder;
                                hVarA = h.a(a1i.b.a(failed.f72134a), u1.g(j.FAILED, a1i.c.f638c), null, null, null, Integer.valueOf(failed.f72136c.a()), 7679);
                            }
                            arrayList.add(hVarA);
                        }
                        eVar.G(arrayList, "ORDERS_CONTENT_KEY", kii.e.o(h.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        d dVar2 = new d(this, i2);
        final int i3 = 2;
        this.e = new w4l.f(function2, dVar, function22, dVar2, new Function2(this) { // from class: c1i.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f20519b;

            {
                this.f20519b = this;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                h hVarA;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<i> fxOrders = this.f20519b.f20523a.getFxOrders();
                        u uVar = new u(16, new c09.a(14));
                        fxOrders.getClass();
                        ufm.i iVar = new ufm.i(fxOrders, uVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.d dVar22 = this.f20519b.f20525c;
                        dVar22.getClass();
                        dVar22.f("ORDERS_CONTENT_KEY", value);
                        return Unit.f186387a;
                    default:
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = this.f20519b.f20524b;
                        List<ExchangeOrder> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (ExchangeOrder exchangeOrder : list) {
                            Intrinsics.checkNotNullParameter(exchangeOrder, "<this>");
                            if (exchangeOrder instanceof ExchangeOrder.Active) {
                                hVarA = h.a(a1i.b.a(((ExchangeOrder.Active) exchangeOrder).f72129a), u1.g(j.ACTIVE, a1i.c.f638c), null, null, null, null, 15871);
                            } else if (exchangeOrder instanceof ExchangeOrder.Completed) {
                                ExchangeOrder.Completed completed = (ExchangeOrder.Completed) exchangeOrder;
                                h hVarA2 = a1i.b.a(completed.f72131a);
                                String strG = u1.g(j.COMPLETED, a1i.c.f638c);
                                String strValueOf = String.valueOf(completed.f72133c);
                                dj0.d dVar222 = completed.d;
                                jo3.a aVarP = dVar222 != null ? mo3.a.p(dVar222) : null;
                                dj0.d dVar3 = completed.e;
                                hVarA = h.a(hVarA2, strG, strValueOf, aVarP, dVar3 != null ? mo3.a.p(dVar3) : null, null, 8703);
                            } else {
                                if (!(exchangeOrder instanceof ExchangeOrder.Failed)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ExchangeOrder.Failed failed = (ExchangeOrder.Failed) exchangeOrder;
                                hVarA = h.a(a1i.b.a(failed.f72134a), u1.g(j.FAILED, a1i.c.f638c), null, null, null, Integer.valueOf(failed.f72136c.a()), 7679);
                            }
                            arrayList.add(hVarA);
                        }
                        eVar.G(arrayList, "ORDERS_CONTENT_KEY", kii.e.o(h.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
