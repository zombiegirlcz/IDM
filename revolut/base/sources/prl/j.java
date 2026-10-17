package prl;

import com.revolut.trading.orders.data.network.services.MonthlyInvestmentsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonthlyInvestmentsService f239333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f239334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f239335c;
    public final x4l.c d;

    public j(MonthlyInvestmentsService monthlyInvestmentsService, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(monthlyInvestmentsService, "monthlyInvestmentsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f239333a = monthlyInvestmentsService;
        this.f239334b = memoryCache;
        this.f239335c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k3c.k(this, continuation, 28), new pp5.d(this, 15), new plb.g(this, 22), new pnb.b(this, continuation, 6), new p24.q(this, continuation, 8));
    }
}
