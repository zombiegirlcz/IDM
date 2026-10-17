package zd3;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOptions;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zgj.r;
import zjh.q;
import zmj.n;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f321307b;

    public /* synthetic */ h(Data data, int i) {
        this.f321306a = i;
        this.f321307b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Optional optionalA;
        EsimMobilePlanPointsOption esimMobilePlanPointsOption;
        Object next;
        switch (this.f321306a) {
            case 0:
                Data data2 = this.f321307b;
                Intrinsics.h(data2);
                return c.a((c) obj2, null, null, null, null, null, data2, null, 95);
            case 1:
                return c.a((c) obj2, null, null, null, null, null, null, this.f321307b, 63);
            case 2:
                Data data3 = this.f321307b;
                Intrinsics.h(data3);
                return c.a((c) obj2, null, null, data3, null, null, null, null, 123);
            case 3:
                return r.a((r) obj2, null, this.f321307b, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765);
            case 4:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f321307b, null, null, null, 30719);
            case 5:
                return r.a((r) obj2, null, null, null, null, this.f321307b, null, null, null, null, null, null, null, null, null, null, 32751);
            case 6:
                Data data4 = this.f321307b;
                r rVar = (r) obj2;
                try {
                    Object content = data4.getContent();
                    if (content != null) {
                        Optional optional = (Optional) content;
                        Intrinsics.checkNotNullParameter(optional, "<this>");
                        EsimMobilePlanPointsOptions esimMobilePlanPointsOptions = (EsimMobilePlanPointsOptions) optional.orElse(null);
                        if (esimMobilePlanPointsOptions != null) {
                            Iterator it8 = esimMobilePlanPointsOptions.f100309c.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (((EsimMobilePlanPointsOption) next).d) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            esimMobilePlanPointsOption = (EsimMobilePlanPointsOption) next;
                        } else {
                            esimMobilePlanPointsOption = null;
                        }
                        optionalA = u1.a(esimMobilePlanPointsOption);
                    } else {
                        optionalA = null;
                    }
                    data = new Data(optionalA, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                return r.a(rVar, null, null, null, null, null, null, null, null, data4, data, null, null, null, null, null, 31999);
            case 7:
                Data data5 = this.f321307b;
                Intrinsics.h(data5);
                return r.a((r) obj2, null, null, null, null, null, null, null, data5, null, null, null, null, null, null, null, 32639);
            case 8:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f321307b, null, null, 28671);
            case 9:
                return r.a((r) obj2, this.f321307b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766);
            case 10:
                Pair pair = (Pair) obj2;
                hhm.g gVar = (hhm.g) pair.f186385a;
                hhm.g gVar2 = (hhm.g) pair.f186386b;
                efm.r rVarEmpty = efm.r.empty();
                Object obj3 = gVar.f152432a;
                Intrinsics.checkNotNullExpressionValue(obj3, "value(...)");
                Data data6 = (Data) obj3;
                Object obj4 = gVar2.f152432a;
                Intrinsics.checkNotNullExpressionValue(obj4, "value(...)");
                Data data7 = (Data) obj4;
                long j2 = gVar2.f152433b - gVar.f152433b;
                if (data6 != this.f321307b) {
                    if (!data6.getLoading() && data7.getLoading() && data7.getContent() == null) {
                        rVarEmpty = rVarEmpty.delay(300L, TimeUnit.MILLISECONDS);
                    } else if (data6.getContent() != null && !Intrinsics.f(data7.getContent(), data6.getContent()) && data7.getContent() != null && !data7.getLoading() && j2 < 1000) {
                        rVarEmpty = rVarEmpty.delay(1000 - j2, TimeUnit.MILLISECONDS);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(rVarEmpty, "run(...)");
                return rVarEmpty;
            case 11:
                ((zj6.g) obj2).getClass();
                Data linkedAccountsGroupData = this.f321307b;
                Intrinsics.checkNotNullParameter(linkedAccountsGroupData, "linkedAccountsGroupData");
                return new zj6.g(linkedAccountsGroupData);
            case 12:
                ((zj9.f) obj2).getClass();
                Data paymentOptions = this.f321307b;
                Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
                return new zj9.f(paymentOptions);
            case 13:
                return q.c((q) obj2, null, null, null, null, null, null, null, this.f321307b, zi0.c.P(fsl.e.f137725a, false, null, 3), null, null, null, null, 7807);
            case 14:
                return q.c((q) obj2, null, null, this.f321307b, null, null, null, null, null, null, null, null, null, null, 8187);
            case 15:
                return q.c((q) obj2, null, null, null, this.f321307b, null, null, null, null, null, null, null, null, null, 8183);
            case 16:
                return q.c((q) obj2, null, this.f321307b, null, null, null, null, null, null, null, null, null, null, null, 8189);
            case 17:
                return q.c((q) obj2, null, this.f321307b, null, null, null, null, null, null, null, null, null, null, null, 8189);
            case 18:
                return q.c((q) obj2, this.f321307b, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 19:
                ((zk1.i) obj2).getClass();
                Data paymentCode = this.f321307b;
                Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
                return new zk1.i(paymentCode);
            case 20:
                return zkk.j.a((zkk.j) obj2, null, null, this.f321307b, 3);
            case 21:
                ((zmd.d) obj2).getClass();
                Data data8 = this.f321307b;
                Intrinsics.checkNotNullParameter(data8, "data");
                return new zmd.d(data8);
            case 22:
                return n.a((n) obj2, null, null, this.f321307b, null, null, null, null, null, null, null, null, null, 16379);
            case 23:
                return n.a((n) obj2, null, null, null, null, this.f321307b, null, null, null, null, null, null, null, 16367);
            case 24:
                return n.a((n) obj2, null, null, null, this.f321307b, null, null, null, null, null, null, null, null, 16375);
            case 25:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f321307b, 8191);
            case 26:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, this.f321307b, null, null, null, 15359);
            case 27:
                return n.a((n) obj2, null, null, null, null, null, null, this.f321307b, null, null, null, null, null, 16255);
            case 28:
                return n.a((n) obj2, null, null, null, null, null, null, null, null, null, this.f321307b, null, null, 14335);
            default:
                Data data9 = this.f321307b;
                Intrinsics.h(data9);
                return n.a((n) obj2, null, null, null, null, null, null, null, null, null, null, data9, null, 12287);
        }
    }

    public /* synthetic */ h(Data data, com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar) {
        this.f321306a = 6;
        this.f321307b = data;
    }
}
