package l7j;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import dej.d3;
import dej.f3;
import dej.g3;
import dej.p3;
import dej.t1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f192692b;

    public /* synthetic */ t(Data data, int i) {
        this.f192691a = i;
        this.f192692b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        Object next;
        switch (this.f192691a) {
            case 0:
                Data data = this.f192692b;
                Intrinsics.h(data);
                return g.a((g) obj2, null, null, data, null, 11);
            case 1:
                return g.a((g) obj2, null, this.f192692b, null, null, 13);
            case 2:
                g0 g0Var = ((l85.g) obj2).f192790b;
                Data screenContent = this.f192692b;
                Intrinsics.checkNotNullParameter(screenContent, "screenContent");
                return new l85.g(screenContent, g0Var);
            case 3:
                return l8e.d.a((l8e.d) obj2, this.f192692b, null, 5);
            case 4:
                l8f.b bVar = (l8f.b) obj2;
                String str = bVar.f192976b;
                String recommendedTemplateId = bVar.f192977c;
                Intrinsics.checkNotNullParameter(recommendedTemplateId, "recommendedTemplateId");
                return new l8f.b(this.f192692b, str, recommendedTemplateId);
            case 5:
                Data data2 = this.f192692b;
                Intrinsics.h(data2);
                ((l8k.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                return new l8k.d(data2);
            case 6:
                ((l92.a) obj2).getClass();
                Data data3 = this.f192692b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new l92.a(data3);
            case 7:
                Data data4 = this.f192692b;
                Intrinsics.h(data4);
                return l9j.f.a((l9j.f) obj2, null, data4, null, null, 13);
            case 8:
                Data data5 = this.f192692b;
                Intrinsics.h(data5);
                return lae.g.a((lae.g) obj2, null, data5, 1);
            case 9:
                lb0.p pVar = (lb0.p) obj2;
                FormScreen formScreen = pVar.f193546a;
                Data data6 = this.f192692b;
                List list2 = (List) data6.getContent();
                return lb0.p.a(pVar, FormScreen.J(formScreen, list2 != null ? hx7.a.q(formScreen.f63468b, list2) : formScreen.f63468b, null, null, null, 65533), null, data6, 2);
            case 10:
                lb1.c updateState = (lb1.c) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return lb1.c.a(updateState, null, this.f192692b, null, 5);
            case 11:
                Data data7 = this.f192692b;
                Intrinsics.h(data7);
                return lb1.c.a((lb1.c) obj2, data7, null, null, 6);
            case 12:
                ld4.e update = (ld4.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                Data configurationData = this.f192692b;
                Intrinsics.checkNotNullParameter(configurationData, "configurationData");
                return new ld4.e(configurationData);
            case 13:
                ldc.e eVar = (ldc.e) obj2;
                Quote quote = eVar.f194059a;
                dj0.d totalInRequestedCurrency = eVar.f194060b;
                w6c.j variant = eVar.f194061c;
                Intrinsics.checkNotNullParameter(quote, "quote");
                Intrinsics.checkNotNullParameter(totalInRequestedCurrency, "totalInRequestedCurrency");
                Intrinsics.checkNotNullParameter(variant, "variant");
                Data disclaimerContent = this.f192692b;
                Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
                return new ldc.e(quote, totalInRequestedCurrency, variant, disclaimerContent);
            case 14:
                ((ldg.d) obj2).getClass();
                Data amenities = this.f192692b;
                Intrinsics.checkNotNullParameter(amenities, "amenities");
                return new ldg.d(amenities);
            case 15:
                return ldj.c.a((ldj.c) obj2, null, null, this.f192692b, 3);
            case 16:
                return ldj.c.a((ldj.c) obj2, this.f192692b, null, null, 6);
            case 17:
                return ldk.f.a((ldk.f) obj2, this.f192692b, false, 2);
            case 18:
                ((li2.a) obj2).getClass();
                Data data8 = this.f192692b;
                Intrinsics.checkNotNullParameter(data8, "data");
                return new li2.a(data8);
            case 19:
                return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2, null, null, null, null, null, null, null, this.f192692b, false, 383);
            case 20:
                return lig.g.a((lig.g) obj2, null, this.f192692b, null, null, 13);
            case 21:
                return ljc.g.a((ljc.g) obj2, null, null, this.f192692b, null, null, 55);
            case 22:
                return ljc.g.a((ljc.g) obj2, null, this.f192692b, null, null, null, 59);
            case 23:
                return ljc.g.a((ljc.g) obj2, this.f192692b, null, null, null, null, 61);
            case 24:
                return lk6.i.a((lk6.i) obj2, null, this.f192692b, null, null, null, null, 61);
            case 25:
                Data insuranceDetailsData = this.f192692b;
                Intrinsics.h(insuranceDetailsData);
                dl7.b subtypeInfo = ((lk7.g) obj2).f196276b;
                Intrinsics.checkNotNullParameter(insuranceDetailsData, "insuranceDetailsData");
                Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
                return new lk7.g(insuranceDetailsData, subtypeInfo);
            case 26:
                return lk9.n.a((lk9.n) obj2, this.f192692b, null, 2);
            case 27:
                ((hlb.f) obj2).getClass();
                Data infoSheetData = this.f192692b;
                Intrinsics.checkNotNullParameter(infoSheetData, "infoSheetData");
                return new hlb.f(infoSheetData);
            case 28:
                ((lnc.c) obj2).getClass();
                return new lnc.c(this.f192692b);
            default:
                lnj.f update2 = (lnj.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data9 = this.f192692b;
                p3 p3Var = (p3) data9.getContent();
                String str2 = null;
                if (p3Var != null && (list = p3Var.f113617a) != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            t1 t1Var = ((d3) next).f113523a;
                            Intrinsics.checkNotNullParameter(t1Var, "<this>");
                            g3 g3Var = t1Var.f113663t;
                            if ((g3Var != null ? g3Var.f113541a : null) == f3.ELIGIBLE) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    d3 d3Var = (d3) next;
                    if (d3Var != null) {
                        str2 = d3Var.f113523a.f113650a;
                    }
                }
                return lnj.f.a(update2, data9, str2, false, 4);
        }
    }

    public /* synthetic */ t(Data data, com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar) {
        this.f192691a = 29;
        this.f192692b = data;
    }
}
