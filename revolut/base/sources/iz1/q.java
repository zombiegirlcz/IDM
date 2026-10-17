package iz1;

import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements yw1.b {

    @NotNull
    public static final o Companion = new o();
    public static final long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferService f169844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f169845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp.p f169846c;
    public final qe0.o d;
    public final wj0.b e;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f = kotlin.time.c.g(3, pkm.e.SECONDS);
    }

    public q(ApmTransferService service, CoroutineScope appCoroutineScope, mp.p streetModePaymentLocationInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        this.f169844a = service;
        this.f169845b = appCoroutineScope;
        this.f169846c = streetModePaymentLocationInteractor;
        Continuation continuation = null;
        this.d = do3.q.f(new x4l.c(new ghl.l(this, continuation, 18), new iwk.b(17), new iui.b(27), new g(2, 1, continuation), new eci.a(3, 23, continuation)), appCoroutineScope);
        this.e = new wj0.b("payments_apm_transfer");
    }

    public final Object a(t02.g gVar, gim.c cVar) {
        p pVar = new p(this, gVar, null, 0);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, pVar, cVar);
    }
}
