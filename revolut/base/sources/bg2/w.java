package bg2;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentPocketInfo f15083b;

    public /* synthetic */ w(PaymentPocketInfo paymentPocketInfo, int i) {
        this.f15082a = i;
        this.f15083b = paymentPocketInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15082a) {
            case 0:
                return g.a((g) obj2, null, null, null, this.f15083b, null, null, false, null, 8159);
            case 1:
                return eq5.r.a((eq5.r) obj2, null, null, null, null, null, null, null, this.f15083b, null, false, null, null, null, null, null, 1048063);
            default:
                return s56.o.a((s56.o) obj2, null, null, null, null, null, null, null, null, null, this.f15083b, 1023);
        }
    }
}
