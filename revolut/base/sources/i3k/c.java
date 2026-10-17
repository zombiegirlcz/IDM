package i3k;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.PaymentVendorsService;
import efm.d0;
import i2i.o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentVendorsService f158230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f158231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f158232c;
    public final w4l.f d;

    public c(PaymentVendorsService service, ue0.c storage, ne0.j cache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f158230a = service;
        this.f158231b = storage;
        this.f158232c = cache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: i3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f158227b;

            {
                this.f158227b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit params = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<h3k.b>> paymentsVendors = this.f158227b.f158230a.getPaymentsVendors();
                        i31.e eVar = new i31.e(6, new o(26));
                        paymentsVendors.getClass();
                        ufm.i iVar = new ufm.i(paymentsVendors, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Unit params2 = (Unit) obj2;
                        List vendors = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vendors, "vendors");
                        this.f158227b.f158232c.f("PAYMENT_VENDORS_MEMORY_KEY", vendors);
                        break;
                    default:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar = this.f158227b.f158231b;
                        List<PaymentVendor> list = domain;
                        int i2 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (PaymentVendor paymentVendor : list) {
                            Intrinsics.checkNotNullParameter(paymentVendor, "<this>");
                            String str = paymentVendor.f64079a;
                            String str2 = paymentVendor.f64080b;
                            String str3 = paymentVendor.f64081c;
                            String str4 = paymentVendor.d;
                            boolean z = paymentVendor.e;
                            ArrayList<PaymentVendorCorridor> arrayList2 = paymentVendor.f;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i2));
                            for (PaymentVendorCorridor paymentVendorCorridor : arrayList2) {
                                arrayList3.add(new j3k.a(paymentVendorCorridor.f64082a.f297794a, paymentVendorCorridor.f64083b.f306286a, paymentVendor.e));
                            }
                            arrayList.add(new j3k.b(str, str2, str3, str4, arrayList3, z));
                            i2 = 10;
                        }
                        cVar.G(arrayList, "PAYMENT_VENDORS_STORAGE_KEY", kii.e.o(j3k.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: i3k.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f158229b;

            {
                this.f158229b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit params = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158229b.f158232c.get("PAYMENT_VENDORS_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        Type type = new TypeToken<List<? extends j3k.b>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.PaymentVendorsRepositoryImpl$paymentVendorsDod$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158229b.f158231b;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("PAYMENT_VENDORS_STORAGE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List<j3k.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (j3k.b bVar : list2) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id10 = bVar.getId();
                            String name = bVar.getName();
                            String logoMono = bVar.getLogoMono();
                            String logoColored = bVar.getLogoColored();
                            boolean z = bVar.getDefault();
                            List<j3k.a> corridors = bVar.getCorridors();
                            ArrayList arrayList2 = new ArrayList(w.t(corridors, 10));
                            for (j3k.a aVar : corridors) {
                                wi0.a aVar2 = wi0.b.Companion;
                                String country = aVar.getCountry();
                                aVar2.getClass();
                                wi0.b bVarA = wi0.a.a(country);
                                xi0.a aVar3 = xi0.b.Companion;
                                String currency = aVar.getCurrency();
                                aVar3.getClass();
                                arrayList2.add(new PaymentVendorCorridor(bVarA, xi0.a.a(currency), bVar.getDefault()));
                            }
                            arrayList.add(new PaymentVendor(id10, name, logoMono, logoColored, arrayList2, z));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: i3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f158227b;

            {
                this.f158227b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit params = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<h3k.b>> paymentsVendors = this.f158227b.f158230a.getPaymentsVendors();
                        i31.e eVar = new i31.e(6, new o(26));
                        paymentsVendors.getClass();
                        ufm.i iVar = new ufm.i(paymentsVendors, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Unit params2 = (Unit) obj2;
                        List vendors = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vendors, "vendors");
                        this.f158227b.f158232c.f("PAYMENT_VENDORS_MEMORY_KEY", vendors);
                        break;
                    default:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar = this.f158227b.f158231b;
                        List<PaymentVendor> list = domain;
                        int i22 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (PaymentVendor paymentVendor : list) {
                            Intrinsics.checkNotNullParameter(paymentVendor, "<this>");
                            String str = paymentVendor.f64079a;
                            String str2 = paymentVendor.f64080b;
                            String str3 = paymentVendor.f64081c;
                            String str4 = paymentVendor.d;
                            boolean z = paymentVendor.e;
                            ArrayList<PaymentVendorCorridor> arrayList2 = paymentVendor.f;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i22));
                            for (PaymentVendorCorridor paymentVendorCorridor : arrayList2) {
                                arrayList3.add(new j3k.a(paymentVendorCorridor.f64082a.f297794a, paymentVendorCorridor.f64083b.f306286a, paymentVendor.e));
                            }
                            arrayList.add(new j3k.b(str, str2, str3, str4, arrayList3, z));
                            i22 = 10;
                        }
                        cVar.G(arrayList, "PAYMENT_VENDORS_STORAGE_KEY", kii.e.o(j3k.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: i3k.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f158229b;

            {
                this.f158229b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit params = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) this.f158229b.f158232c.get("PAYMENT_VENDORS_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        Type type = new TypeToken<List<? extends j3k.b>>() { // from class: com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.repository.PaymentVendorsRepositoryImpl$paymentVendorsDod$4$type$1
                        }.getType();
                        ue0.c cVar = this.f158229b.f158231b;
                        Intrinsics.h(type);
                        List list = (List) cVar.T2("PAYMENT_VENDORS_STORAGE_KEY", type);
                        if (list == null) {
                            return null;
                        }
                        List<j3k.b> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (j3k.b bVar : list2) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id10 = bVar.getId();
                            String name = bVar.getName();
                            String logoMono = bVar.getLogoMono();
                            String logoColored = bVar.getLogoColored();
                            boolean z = bVar.getDefault();
                            List<j3k.a> corridors = bVar.getCorridors();
                            ArrayList arrayList2 = new ArrayList(w.t(corridors, 10));
                            for (j3k.a aVar : corridors) {
                                wi0.a aVar2 = wi0.b.Companion;
                                String country = aVar.getCountry();
                                aVar2.getClass();
                                wi0.b bVarA = wi0.a.a(country);
                                xi0.a aVar3 = xi0.b.Companion;
                                String currency = aVar.getCurrency();
                                aVar3.getClass();
                                arrayList2.add(new PaymentVendorCorridor(bVarA, xi0.a.a(currency), bVar.getDefault()));
                            }
                            arrayList.add(new PaymentVendor(id10, name, logoMono, logoColored, arrayList2, z));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: i3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f158227b;

            {
                this.f158227b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit params = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<List<h3k.b>> paymentsVendors = this.f158227b.f158230a.getPaymentsVendors();
                        i31.e eVar = new i31.e(6, new o(26));
                        paymentsVendors.getClass();
                        ufm.i iVar = new ufm.i(paymentsVendors, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Unit params2 = (Unit) obj2;
                        List vendors = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vendors, "vendors");
                        this.f158227b.f158232c.f("PAYMENT_VENDORS_MEMORY_KEY", vendors);
                        break;
                    default:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar = this.f158227b.f158231b;
                        List<PaymentVendor> list = domain;
                        int i22 = 10;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (PaymentVendor paymentVendor : list) {
                            Intrinsics.checkNotNullParameter(paymentVendor, "<this>");
                            String str = paymentVendor.f64079a;
                            String str2 = paymentVendor.f64080b;
                            String str3 = paymentVendor.f64081c;
                            String str4 = paymentVendor.d;
                            boolean z = paymentVendor.e;
                            ArrayList<PaymentVendorCorridor> arrayList2 = paymentVendor.f;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i22));
                            for (PaymentVendorCorridor paymentVendorCorridor : arrayList2) {
                                arrayList3.add(new j3k.a(paymentVendorCorridor.f64082a.f297794a, paymentVendorCorridor.f64083b.f306286a, paymentVendor.e));
                            }
                            arrayList.add(new j3k.b(str, str2, str3, str4, arrayList3, z));
                            i22 = 10;
                        }
                        cVar.G(arrayList, "PAYMENT_VENDORS_STORAGE_KEY", kii.e.o(j3k.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
