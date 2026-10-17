package ha1;

import efm.d0;
import fa1.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f150386b;

    public /* synthetic */ r(u uVar, int i) {
        this.f150385a = i;
        this.f150386b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150385a) {
            case 0:
                y paymentAuthorization = (y) obj2;
                Intrinsics.checkNotNullParameter(paymentAuthorization, "paymentAuthorization");
                if (!u.f.contains(paymentAuthorization.f133224b)) {
                    return d0.m(paymentAuthorization);
                }
                return this.f150386b.c(paymentAuthorization.f133223a);
            case 1:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                return ua1.b.a(this.f150386b.e, exception, qa1.k.TERMINAL_NEEDS_UPDATE, new h43.b(11));
            default:
                y paymentAuthorization2 = (y) obj2;
                Intrinsics.checkNotNullParameter(paymentAuthorization2, "paymentAuthorization");
                if (!u.f.contains(paymentAuthorization2.f133224b)) {
                    return d0.m(paymentAuthorization2);
                }
                return this.f150386b.c(paymentAuthorization2.f133223a);
        }
    }
}
