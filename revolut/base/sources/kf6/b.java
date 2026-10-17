package kf6;

import com.revolut.feature.external_accounts.impl.data.open_banking.payment_fees.OutboundPaymentBreakdownService;
import do3.q;
import iz1.g;
import k3c.l;
import k7c.x;
import kd8.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qe0.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundPaymentBreakdownService f183287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f183288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f183289c;

    public b(OutboundPaymentBreakdownService service, a mapper, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f183287a = service;
        this.f183288b = appCoroutineScope;
        Continuation continuation = null;
        this.f183289c = q.f(new x4l.c(new x(this, continuation, 7), new kcd.a(23), new f(11), new g(2, 17, continuation), new l(3, 10, continuation)), appCoroutineScope);
    }
}
