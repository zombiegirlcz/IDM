package yi8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ti8.b f314271b;

    public /* synthetic */ f(ti8.b bVar, int i) {
        this.f314270a = i;
        this.f314271b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f314270a) {
            case 0:
                Intrinsics.checkNotNullParameter((b) obj2, "$this$update");
                return new b(this.f314271b.f271445a);
            default:
                zn8.b update = (zn8.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = this.f314271b.f271445a;
                update.getClass();
                return new zn8.b(paymentLinkCustomAmountBundle);
        }
    }
}
