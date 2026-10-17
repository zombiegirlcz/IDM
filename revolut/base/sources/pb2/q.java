package pb2;

import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$InputData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b f234617b;

    public /* synthetic */ q(com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar, int i) {
        this.f234616a = i;
        this.f234617b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f234616a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(this.f234617b.J2(it8));
            case 1:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, zi0.c.P(((PayToConfirmationScreenContract$InputData.WithPendingActionData) this.f234617b.o).f62748a, false, null, 3), null, 2);
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(this.f234617b.J2(it9));
        }
    }
}
