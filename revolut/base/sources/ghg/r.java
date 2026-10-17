package ghg;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.youTransactor.uCube.rpc.Constants;
import ggk.h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;
import qua.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f143924b;

    public /* synthetic */ r(Data data, int i) {
        this.f143923a = i;
        this.f143924b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        Data data7;
        Data data8;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f143923a) {
            case 0:
                return g.a((g) obj2, null, null, this.f143924b, null, null, false, false, 123);
            case 1:
                Data data9 = this.f143924b;
                ghk.j jVar = (ghk.j) obj2;
                try {
                    Object content = data9.getContent();
                    data = new Data(content != null ? (PricingPlanSubscription) ((yhm.r) content).f314201a : null, data9.getError(), data9.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data9.getLoading());
                }
                Data data10 = data;
                try {
                    Object content2 = data9.getContent();
                    data2 = new Data(content2 != null ? (List) ((yhm.r) content2).f314202b : null, data9.getError(), data9.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data9.getLoading());
                }
                try {
                    Object content3 = data9.getContent();
                    data3 = new Data(content3 != null ? (h1) ((yhm.r) content3).f314203c : null, data9.getError(), data9.getLoading());
                    break;
                } catch (Throwable th12) {
                    data3 = new Data(null, th12, data9.getLoading());
                }
                return ghk.j.a(jVar, null, null, data2, data10, null, null, data3, false, 179);
            case 2:
                ((gk9.h) obj2).getClass();
                Data content4 = this.f143924b;
                Intrinsics.checkNotNullParameter(content4, "content");
                return new gk9.h(content4);
            case 3:
                return gkk.d.a((gkk.d) obj2, null, null, null, this.f143924b, 15);
            case 4:
                Data data11 = this.f143924b;
                gkk.d dVar = (gkk.d) obj2;
                try {
                    Object content5 = data11.getContent();
                    data4 = new Data(content5 != null ? (ggk.a) ((Pair) content5).f186385a : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th13) {
                    data4 = new Data(null, th13, data11.getLoading());
                }
                Data data12 = data4;
                try {
                    Object content6 = data11.getContent();
                    data5 = new Data(content6 != null ? (InsuranceDocumentsAvailability) ((Pair) content6).f186386b : null, data11.getError(), data11.getLoading());
                    break;
                } catch (Throwable th14) {
                    data5 = new Data(null, th14, data11.getLoading());
                }
                return gkk.d.a(dVar, data12, data5, null, null, 25);
            case 5:
                gmh.d dVar2 = (gmh.d) obj2;
                Data data13 = dVar2.f144855b;
                dVar2.getClass();
                return new gmh.d(this.f143924b, data13);
            case 6:
                gmh.d dVar3 = (gmh.d) obj2;
                Data data14 = dVar3.f144854a;
                dVar3.getClass();
                return new gmh.d(data14, this.f143924b);
            case 7:
                gmk.g savingsType = ((gmk.f) obj2).f144878a;
                Intrinsics.checkNotNullParameter(savingsType, "savingsType");
                Data accounts = this.f143924b;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                return new gmk.f(savingsType, accounts);
            case 8:
                return gna.e.a((gna.e) obj2, this.f143924b, null, 2);
            case 9:
                return gnl.h.a((gnl.h) obj2, null, this.f143924b, 13);
            case 10:
                return go7.f.a((go7.f) obj2, (do3.n) this.f143924b.getContent(), false, 95);
            case 11:
                return gp3.b.a((gp3.b) obj2, this.f143924b, null, null, 30);
            case 12:
                return gp3.b.a((gp3.b) obj2, null, this.f143924b, null, 29);
            case 13:
                ((gpb.g) obj2).getClass();
                Data productData = this.f143924b;
                Intrinsics.checkNotNullParameter(productData, "productData");
                return new gpb.g(productData);
            case 14:
                return gpd.b.a((gpd.b) obj2, this.f143924b, null, 2);
            case 15:
                gq4.i iVar = (gq4.i) obj2;
                CreditCardCancellationDetails details = iVar.f145550a;
                String operationId = iVar.f145551b;
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(operationId, "operationId");
                Data content7 = this.f143924b;
                Intrinsics.checkNotNullParameter(content7, "content");
                return new gq4.i(details, operationId, content7);
            case 16:
                return gq5.e.a((gq5.e) obj2, this.f143924b, null, null, 6);
            case 17:
                Data data15 = this.f143924b;
                Intrinsics.h(data15);
                return gq5.e.a((gq5.e) obj2, null, data15, null, 5);
            case 18:
                ((gqd.d) obj2).getClass();
                Data data16 = this.f143924b;
                Intrinsics.checkNotNullParameter(data16, "data");
                return new gqd.d(data16);
            case 19:
                gs2.i iVar2 = (gs2.i) obj2;
                Data data17 = this.f143924b;
                Intrinsics.h(data17);
                try {
                    Object content8 = data17.getContent();
                    data6 = new Data(content8 != null ? (List) ((Pair) content8).f186385a : null, data17.getError(), data17.getLoading());
                    break;
                } catch (Throwable th15) {
                    data6 = new Data(null, th15, data17.getLoading());
                }
                Data data18 = data6;
                try {
                    Object content9 = data17.getContent();
                    if (content9 != null) {
                        Iterable iterable = (Iterable) ((Pair) content9).f186386b;
                        arrayList2 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (!u.J(((RecurringPaymentWithExtra) obj3).getF81653a())) {
                                arrayList2.add(obj3);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    data7 = new Data(arrayList2, data17.getError(), data17.getLoading());
                    break;
                } catch (Throwable th16) {
                    data7 = new Data(null, th16, data17.getLoading());
                }
                try {
                    Object content10 = data17.getContent();
                    if (content10 != null) {
                        Iterable iterable2 = (Iterable) ((Pair) content10).f186386b;
                        arrayList = new ArrayList();
                        for (Object obj4 : iterable2) {
                            if (u.J(((RecurringPaymentWithExtra) obj4).getF81653a())) {
                                arrayList.add(obj4);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    data8 = new Data(arrayList, data17.getError(), data17.getLoading());
                    break;
                } catch (Throwable th17) {
                    data8 = new Data(null, th17, data17.getLoading());
                }
                return gs2.i.a(iVar2, data7, data18, null, null, data8, null, false, null, Constants.TAG_OS_VERSION);
            case 20:
                Data data19 = this.f143924b;
                Intrinsics.h(data19);
                return gs2.i.a((gs2.i) obj2, null, null, null, null, null, data19, false, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 21:
                Data data20 = this.f143924b;
                Intrinsics.h(data20);
                return gs2.i.a((gs2.i) obj2, null, null, null, data20, null, null, false, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 22:
                Data data21 = this.f143924b;
                Intrinsics.h(data21);
                return gs2.i.a((gs2.i) obj2, null, null, data21, null, null, null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 23:
                ((gtd.b) obj2).getClass();
                Data travelData = this.f143924b;
                Intrinsics.checkNotNullParameter(travelData, "travelData");
                return new gtd.b(travelData);
            case 24:
                ((guj.e) obj2).getClass();
                Data eligibilityCriteria = this.f143924b;
                Intrinsics.checkNotNullParameter(eligibilityCriteria, "eligibilityCriteria");
                return new guj.e(eligibilityCriteria);
            case 25:
                return gvi.h.a((gvi.h) obj2, this.f143924b, null, false, 6);
            case 26:
                Data data22 = this.f143924b;
                Intrinsics.h(data22);
                return gyi.a.a((gyi.a) obj2, null, data22, null, null, null, null, 61);
            case 27:
                return gzg.n.a((gzg.n) obj2, null, null, null, null, false, null, this.f143924b, null, 7679);
            case 28:
                return gzg.n.a((gzg.n) obj2, null, null, null, null, false, this.f143924b, null, null, 7935);
            default:
                h1k.g updateState = (h1k.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return h1k.g.a(updateState, null, null, null, this.f143924b, null, 95);
        }
    }
}
