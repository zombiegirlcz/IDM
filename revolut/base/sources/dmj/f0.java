package dmj;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f116153b;

    public /* synthetic */ f0(PaymentMethod.Pocket pocket, int i) {
        this.f116152a = i;
        this.f116153b = pocket;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f116152a) {
            case 0:
                a0 update = (a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a0.a(update, null, null, null, null, zi0.c.P(this.f116153b, false, null, 3), null, false, null, 239);
            case 1:
                fjj.k update2 = (fjj.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return fjj.k.a(update2, zi0.c.P(this.f116153b, false, null, 3), null, false, null, null, 30);
            case 2:
                njj.b0 update3 = (njj.b0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return njj.b0.a(update3, null, null, null, zi0.c.P(this.f116153b, false, null, 3), null, null, null, false, null, 503);
            default:
                x1g.i update4 = (x1g.i) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return x1g.i.a(update4, null, null, null, null, false, new Data(this.f116153b, null, false, 6, null), null, null, null, 30719);
        }
    }
}
