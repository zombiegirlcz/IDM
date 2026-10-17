package njj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EsimDataPlan f216589a;

    public q0(EsimDataPlan esimDataPlan) {
        this.f216589a = esimDataPlan;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) rVar.f314201a;
        dej.a aVar = (dej.a) rVar.f314202b;
        Boolean bool = (Boolean) rVar.f314203c;
        bool.booleanValue();
        return new vf0.h(this.f216589a, pocket, aVar, bool);
    }
}
