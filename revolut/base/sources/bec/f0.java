package bec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod f14774b;

    public /* synthetic */ f0(PaymentMethod paymentMethod, int i) {
        this.f14773a = i;
        this.f14774b = paymentMethod;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14773a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, this.f14774b, null, 4079);
            default:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i.a(update2, null, null, this.f14774b, null, 3823);
        }
    }
}
