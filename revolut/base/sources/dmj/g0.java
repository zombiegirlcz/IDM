package dmj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f116156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dj0.d f116157c;

    public /* synthetic */ g0(PaymentMethod.Pocket pocket, dj0.d dVar, int i) {
        this.f116155a = i;
        this.f116156b = pocket;
        this.f116157c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f116155a) {
            case 0:
                a0 update = (a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a0.a(update, null, null, null, null, zi0.c.P(PaymentMethod.Pocket.a(this.f116156b, this.f116157c), false, null, 3), null, false, null, 239);
            default:
                njj.b0 update2 = (njj.b0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return njj.b0.a(update2, null, null, null, zi0.c.P(PaymentMethod.Pocket.a(this.f116156b, this.f116157c), false, null, 3), null, null, null, false, null, 503);
        }
    }
}
