package jfc;

import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import com.revolut.feature.acquiring.card_reader.order.api.model.ProductVAT;
import ifc.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ya1.k;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f173856b;

    public /* synthetic */ a(h hVar, int i) {
        this.f173855a = i;
        this.f173856b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ProductVAT vat;
        switch (this.f173855a) {
            case 0:
                ifc.g response = (ifc.g) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List<ifc.c> terminalOrders = response.getTerminalOrders();
                ArrayList arrayList = new ArrayList(w.t(terminalOrders, 10));
                for (ifc.c dto : terminalOrders) {
                    ((hfc.b) this.f173856b.f173865c).getClass();
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    String state = dto.getState();
                    k.Companion.getClass();
                    arrayList.add(new ya1.d((k) u1.t(state, k.UNKNOWN, k.MAPPING)));
                }
                return arrayList;
            case 1:
                ya1.g params = (ya1.g) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (ya1.h) this.f173856b.f173863a.get(h.b(params));
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f173856b.f173863a.get("CARD_READER_ORDERS_INFO_KEY");
            case 3:
                za1.a dto2 = (za1.a) obj2;
                Intrinsics.checkNotNullParameter(dto2, "details");
                ((hfc.b) this.f173856b.f173865c).getClass();
                Intrinsics.checkNotNullParameter(dto2, "dto");
                dj0.d dVarO = mo3.a.o(dto2.getTerminalPrice());
                dj0.d dVarO2 = mo3.a.o(dto2.getDeliveryFee());
                int iB = dto2.getMaxTerminalsPerOrder();
                double dF = dto2.getTransactionFeePercent();
                String strE = dto2.getTermsAndConditionsUrl();
                boolean zC = dto2.getOrderingEnabled();
                if (dto2.getVatCaptureRequired()) {
                    vat = ProductVAT.Unknown.f60582a;
                } else {
                    Double dH = dto2.getVatRate();
                    Intrinsics.h(dH);
                    vat = new ProductVAT.VAT(dH.doubleValue());
                }
                return new CardReaderOrderProductDetails(dVarO, dVarO2, iB, dF, strE, zC, vat);
            case 4:
                f.b dto3 = (f.b) obj2;
                Intrinsics.checkNotNullParameter(dto3, "it");
                ((hfc.b) this.f173856b.f173865c).getClass();
                Intrinsics.checkNotNullParameter(dto3, "dto");
                return new ya1.h(mo3.a.o(dto3.getTerminalPrice()), mo3.a.o(dto3.getDeliveryFee()), mo3.a.o(dto3.getVat()), mo3.a.o(dto3.getSubTotal()), mo3.a.o(dto3.getTotalPrice()));
            default:
                com.revolut.feature.acquiring.card_reader.order.api.model.a params2 = (com.revolut.feature.acquiring.card_reader.order.api.model.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (CardReaderOrderProductDetails) this.f173856b.f173863a.get(h.a(params2));
        }
    }
}
