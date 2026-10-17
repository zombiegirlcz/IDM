package a07;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.w2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f150b;

    public /* synthetic */ l(Data data, int i) {
        this.f149a = i;
        this.f150b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Object content;
        a5e.e eVar;
        a5e.d dVar;
        a5e.e eVar2;
        switch (this.f149a) {
            case 0:
                return f.a((f) obj2, null, this.f150b, CertificateBody.profileType);
            case 1:
                return a15.h.a((a15.h) obj2, null, this.f150b, 3);
            case 2:
                return a2f.f.a((a2f.f) obj2, this.f150b, null, null, 6);
            case 3:
                return a2g.g.a((a2g.g) obj2, null, null, false, false, false, this.f150b, CertificateBody.profileType);
            case 4:
                return a2g.g.a((a2g.g) obj2, this.f150b, null, false, false, false, null, 254);
            case 5:
                return a3e.c.a((a3e.c) obj2, this.f150b, null, null, 6);
            case 6:
                a5d.j content2 = ((a5d.d) obj2).f1350a;
                Intrinsics.checkNotNullParameter(content2, "content");
                Data data2 = this.f150b;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new a5d.d(content2, data2);
            case 7:
                Data data3 = this.f150b;
                a5e.f fVar = (a5e.f) obj2;
                try {
                    content = data3.getContent();
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                if (content != null) {
                    w2 w2Var = (w2) content;
                    ArrayList arrayList = w2Var.f173590j;
                    ArrayList arrayList2 = w2Var.k;
                    a5e.d dVar2 = a5e.d.ASSETS;
                    if (arrayList2.isEmpty()) {
                        dVar2 = null;
                    }
                    a5e.d dVar3 = a5e.d.KEY_DRIVERS;
                    if (arrayList.isEmpty()) {
                        dVar3 = null;
                    }
                    a5e.d[] elements = {dVar2, dVar3};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    Data data4 = fVar.f1366a;
                    if (data4 == null || (eVar2 = (a5e.e) data4.getContent()) == null || (dVar = eVar2.d) == null) {
                        dVar = (a5e.d) d0.d0(listL);
                        eVar = new a5e.e(arrayList2, arrayList, listL, dVar);
                    } else {
                        if (!((ArrayList) listL).contains(dVar)) {
                            dVar = null;
                        }
                        if (dVar == null) {
                            dVar = (a5e.d) d0.d0(listL);
                        }
                        eVar = new a5e.e(arrayList2, arrayList, listL, dVar);
                    }
                    return a5e.f.a(fVar, data, null, 2);
                }
                eVar = null;
                data = new Data(eVar, data3.getError(), data3.getLoading());
                return a5e.f.a(fVar, data, null, 2);
            case 8:
                return a5e.f.a((a5e.f) obj2, null, this.f150b, 1);
            case 9:
                return a5g.e.a((a5g.e) obj2, this.f150b, h0.f322473a, null, 9);
            case 10:
                BigDecimal lotQuantity = ((a5i.h) obj2).f1418a;
                Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
                Data priceDetails = this.f150b;
                Intrinsics.checkNotNullParameter(priceDetails, "priceDetails");
                return new a5i.h(lotQuantity, priceDetails);
            case 11:
                ((a7b.k) obj2).getClass();
                Data planAdditionalValueData = this.f150b;
                Intrinsics.checkNotNullParameter(planAdditionalValueData, "planAdditionalValueData");
                return new a7b.k(planAdditionalValueData);
            case 12:
                a7f.c cVar = (a7f.c) obj2;
                Data data5 = cVar.f1861b;
                cVar.getClass();
                return new a7f.c(this.f150b, data5);
            case 13:
                a7f.c cVar2 = (a7f.c) obj2;
                Data data6 = cVar2.f1860a;
                cVar2.getClass();
                return new a7f.c(data6, this.f150b);
            case 14:
                return a82.c.a((a82.c) obj2, this.f150b, false, 2);
            case 15:
                a83.o update = (a83.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a83.o.a(update, null, null, null, null, null, null, this.f150b, null, false, null, null, false, null, null, 65407);
            case 16:
                Data data7 = this.f150b;
                Intrinsics.h(data7);
                return a83.o.a((a83.o) obj2, null, null, null, null, null, data7, null, null, false, null, null, false, null, null, 65503);
            case 17:
                return a83.o.a((a83.o) obj2, null, this.f150b, null, null, null, null, null, null, false, null, null, false, null, null, 65533);
            case 18:
                Data data8 = this.f150b;
                Intrinsics.h(data8);
                return a83.o.a((a83.o) obj2, null, null, null, null, null, null, null, data8, false, null, null, false, null, null, 65023);
            case 19:
                return a83.o.a((a83.o) obj2, null, null, null, null, null, null, null, null, false, this.f150b, null, false, null, null, 63487);
            case 20:
                return a83.o.a((a83.o) obj2, null, null, null, null, null, null, null, null, false, null, this.f150b, false, null, null, 61439);
            case 21:
                return a83.o.a((a83.o) obj2, null, null, this.f150b, null, null, null, null, null, false, null, null, false, null, null, 65531);
            case 22:
                Data data9 = this.f150b;
                Intrinsics.h(data9);
                return a83.o.a((a83.o) obj2, data9, null, null, null, null, null, null, null, false, null, null, false, null, null, 65534);
            case 23:
                return a92.a.a((a92.a) obj2, this.f150b, 0L, 2);
            case 24:
                return a94.r.a((a94.r) obj2, this.f150b, 6);
            case 25:
                return aa7.h.a((aa7.h) obj2, null, this.f150b, 3);
            case 26:
                return aa7.h.a((aa7.h) obj2, this.f150b, null, 5);
            case 27:
                return new ab4.h(this.f150b);
            case 28:
                return abf.i.a((abf.i) obj2, this.f150b, null, 2);
            default:
                adf.b bVar = (adf.b) obj2;
                FiatExchangeOrderQuoteParams orderQuoteParams = bVar.f3327a;
                Clause clause = bVar.f3329c;
                Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                return new adf.b(orderQuoteParams, this.f150b, clause);
        }
    }
}
