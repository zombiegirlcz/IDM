package bg4;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6c.e f15121b;

    public /* synthetic */ x(w6c.e eVar, int i) {
        this.f15120a = i;
        this.f15121b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        h hVar;
        switch (this.f15120a) {
            case 0:
                w6c.e eVar = this.f15121b;
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data2 = update.f15104a;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        PaymentMethod paymentMethod = ((w6c.c) eVar).f295413a;
                        Intrinsics.i(paymentMethod, "null cannot be cast to non-null type com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket");
                        PaymentMethod.Pocket selectedPocket = (PaymentMethod.Pocket) paymentMethod;
                        az3.a configuration = ((h) content).f15102a;
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
                        hVar = new h(configuration, selectedPocket);
                    } else {
                        hVar = null;
                    }
                    data = new Data(hVar, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return j.a(update, data, null, 2);
            default:
                eac.h update2 = (eac.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                od0.h hVar2 = od0.i.Companion;
                PaymentMethod paymentMethod2 = ((w6c.c) this.f15121b).f295413a;
                hVar2.getClass();
                return eac.h.a(update2, null, null, new Data(od0.h.a(paymentMethod2), null, false, 6, null), null, null, 59);
        }
    }
}
