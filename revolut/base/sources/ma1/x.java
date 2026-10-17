package ma1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueLineItem;
import efm.d0;
import fa1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import zc1.d;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements da1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa1.u f203913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da1.d f203914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ha1.o f203915c;
    public final ca1.a d;
    public final sa1.c e;
    public final nd1.j f;

    public x(sa1.u uCubePaymentInteractor, da1.d connectionInteractor, ha1.o paymentRepository, ca1.a cardReaderRepository, sa1.c emvTagsLogger, nd1.j litePosPaymentNotificationPublisher) {
        Intrinsics.checkNotNullParameter(uCubePaymentInteractor, "uCubePaymentInteractor");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(emvTagsLogger, "emvTagsLogger");
        Intrinsics.checkNotNullParameter(litePosPaymentNotificationPublisher, "litePosPaymentNotificationPublisher");
        this.f203913a = uCubePaymentInteractor;
        this.f203914b = connectionInteractor;
        this.f203915c = paymentRepository;
        this.d = cardReaderRepository;
        this.e = emvTagsLogger;
        this.f = litePosPaymentNotificationPublisher;
    }

    public final efm.r a(dj0.d totalAmount, dj0.d dVar, ArrayList arrayList, String str) {
        String strA;
        ArrayList arrayList2;
        d.a aVar;
        long j2;
        ArrayList arrayList3;
        fa1.f fVar;
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ha1.f fVar2 = (ha1.f) this.d;
        fVar2.getClass();
        fa1.e eVar = fa1.f.Companion;
        PairingInfo pairingInfoC = fVar2.c();
        if (pairingInfoC == null || (fVar = pairingInfoC.f60573m) == null || (strA = fVar.a()) == null) {
            strA = fa1.f.MANUAL.a();
        }
        eVar.getClass();
        fa1.f captureMode = fa1.e.a(strA);
        ha1.u uVar = (ha1.u) this.f203915c;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        DateTime dateTimeNow = DateTime.now(DateTimeZone.UTC);
        long j3 = totalAmount.f115082a;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
        String str2 = totalAmount.f115083b.f306286a;
        if (arrayList != null) {
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                CatalogueLineItem domain = (CatalogueLineItem) it8.next();
                pd1.d dVar2 = (pd1.d) uVar.d;
                Intrinsics.checkNotNullParameter(domain, "domain");
                String str3 = domain.f60672a;
                Iterator it9 = it8;
                long j5 = domain.f60674c;
                CatalogueLineItem.Quantity quantity = domain.d;
                d.a aVar2 = new d.a(quantity.f60678a, quantity.f60679b.b());
                List list = domain.e;
                if (list != null) {
                    List<CatalogueLineItem.Tax> list2 = list;
                    aVar = aVar2;
                    j2 = j3;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                    for (CatalogueLineItem.Tax tax : list2) {
                        arrayList5.add(new d.b(tax.f60680a, tax.f60681b, tax.f60682c, tax.d));
                    }
                    arrayList3 = arrayList5;
                } else {
                    aVar = aVar2;
                    j2 = j3;
                    arrayList3 = null;
                }
                arrayList4.add(new zc1.d(str3, j5, aVar, arrayList3, domain.f, domain.f60675g, domain.f60676h, domain.i, r0.k(new Pair("color", ((pd1.c) dVar2.f235040b).d(domain.k)), new Pair("item_type", domain.f60673b.b()))));
                it8 = it9;
                j3 = j2;
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        long j16 = j3;
        String strA2 = captureMode.a();
        String string = captureMode == fa1.f.AUTOMATIC ? dateTimeNow.plusMinutes(10).toString() : null;
        String string2 = dateTimeNow.plusDays(7).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        d0<ga1.c> d0VarCreateOrder = uVar.f150389a.createOrder(new ga1.b(j16, lValueOf, str2, str, arrayList2, strA2, string, string2, zhm.u.c("card_present")));
        ha1.j jVar = new ha1.j(20, new ha1.k(4));
        d0VarCreateOrder.getClass();
        ufm.i iVar = new ufm.i(d0VarCreateOrder, jVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        efm.r rVarStartWith = new sfm.b(te0.w.i0(ea1.b.d(iVar, "POST: Creating an order")), new v(1, new li8.n(this, 22, totalAmount, ref$ObjectRef)), 2).doOnError(new v(2, new m9l.d(15))).doAfterTerminate(new la8.j(this, ref$ObjectRef, 10)).onErrorReturn(new v(3, new m9l.d(16))).startWith(new fa1.l(o.g.f133202a, null, fa1.n.INITIALIZING, 26));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }
}
