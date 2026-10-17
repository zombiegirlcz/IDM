package trb;

import c1b.h;
import com.revolut.feature.retail.trading.advanced.charts.impl.service.TradingAdvancedChartService;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nfj.i;
import org.jetbrains.annotations.NotNull;
import th6.p;
import tpi.g;
import tq0.j;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();
    public static final Object d = r0.k(new Pair("1m", h.ONE_MINUTE), new Pair("2m", h.TWO_MINUTES), new Pair("5m", h.FIVE_MINUTES), new Pair("10m", h.TEN_MINUTES), new Pair("15m", h.FIFTEEN_MINUTES), new Pair("30m", h.THIRTY_MINUTES), new Pair("1H", h.ONE_HOUR), new Pair("4H", h.FOUR_HOURS), new Pair("1D", h.ONE_DAY), new Pair("4D", h.FOUR_DAYS), new Pair("1w", h.ONE_WEEK), new Pair("5w", h.FIVE_WEEKS));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAdvancedChartService f273775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f273776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f273777c;

    public c(TradingAdvancedChartService service, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f273775a = service;
        this.f273776b = appCoroutineScope;
        this.f273777c = new x4l.c(new p(this, (Continuation) null, 1), new g(7), new j(5), new rp1.c(2, 10, null), new i(3, 23, null));
    }
}
