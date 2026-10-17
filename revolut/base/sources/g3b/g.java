package g3b;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.retail.cfd.impl.network.CfdService;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import do3.q;
import g2e.m0;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f140253g = new TypeToken<d3b.g>() { // from class: com.revolut.feature.retail.cfd.impl.repository.CfdRepositoryImpl$Companion$PORTFOLIO_PERFORMANCE_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdService f140254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f140255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f140256c;
    public final CoroutineScope d;
    public final o e;
    public final x4l.c f;

    public g(CfdService service, ne0.j cache, ue0.c storage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f140254a = service;
        this.f140255b = cache;
        this.f140256c = storage;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        final int i = 0;
        this.e = q.f(new x4l.c(new frk.a(this, continuation, 17), new Function1(this) { // from class: g3b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140249b;

            {
                this.f140249b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (y49.f) this.f140249b.f140255b.get(g.a(portfolioId));
                    default:
                        a params = (a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (TradingOrderExitStrategies) this.f140249b.f140255b.get(t1.X(params));
                }
            }
        }, new Function2(this) { // from class: g3b.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140251b;

            {
                this.f140251b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String portfolioId = (String) obj2;
                        y49.f performance = (y49.f) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        this.f140251b.f140255b.f(g.a(portfolioId), performance);
                        break;
                    default:
                        a params = (a) obj2;
                        TradingOrderExitStrategies exitStrategies = (TradingOrderExitStrategies) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
                        this.f140251b.f140255b.f(t1.X(params), exitStrategies);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, null, 1), new m0(this, continuation, 2)), appCoroutineScope);
        final int i2 = 1;
        this.f = new x4l.c(new frk.a(this, continuation, 16), new Function1(this) { // from class: g3b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140249b;

            {
                this.f140249b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (y49.f) this.f140249b.f140255b.get(g.a(portfolioId));
                    default:
                        a params = (a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (TradingOrderExitStrategies) this.f140249b.f140255b.get(t1.X(params));
                }
            }
        }, new Function2(this) { // from class: g3b.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140251b;

            {
                this.f140251b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String portfolioId = (String) obj2;
                        y49.f performance = (y49.f) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        this.f140251b.f140255b.f(g.a(portfolioId), performance);
                        break;
                    default:
                        a params = (a) obj2;
                        TradingOrderExitStrategies exitStrategies = (TradingOrderExitStrategies) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
                        this.f140251b.f140255b.f(t1.X(params), exitStrategies);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, null, 0), new m0(this, continuation, 1));
    }

    public static String a(String str) {
        return j6.a.q("PORTFOLIO_PERFORMANCE_KEY", str);
    }
}
