package yn9;

import com.revolut.feature.payment.counterparty.impl.data.network.PaymentCounterpartyService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import wtc.b0;
import yed.g0;
import yi3.d;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCounterpartyService f315271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f315272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f315273c;
    public final x4l.c d;

    public c(PaymentCounterpartyService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f315271a = service;
        this.f315272b = storage;
        this.f315273c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 13), new g0(this, 23), new d(this, 7), new b(this, null, 0), new wa7.j(this, continuation, 20), new b(this, null, 1));
    }
}
