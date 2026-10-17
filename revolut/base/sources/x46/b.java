package x46;

import com.revolut.feature.defi.rates.impl.data.network.DeFiRatesService;
import do3.q;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;
import wa7.j;
import wqj.g;
import x4l.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements t46.a {

    @NotNull
    public static final a Companion = new a();
    public static final BigDecimal f = new BigDecimal(String.valueOf(-1.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiRatesService f302798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v46.a f302799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f302800c;
    public final ConcurrentHashMap d;
    public final o e;

    public b(DeFiRatesService service, v46.a ratesDao, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(ratesDao, "ratesDao");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f302798a = service;
        this.f302799b = ratesDao;
        this.f302800c = appCoroutineScope;
        this.d = new ConcurrentHashMap();
        Continuation continuation = null;
        this.e = q.f(new c(new g(this, continuation, 4), new x0b.c(this, 17), new x2g.b(this, 5), new wuh.q(this, continuation, 27), new j(this, continuation, 7)), appCoroutineScope);
    }
}
