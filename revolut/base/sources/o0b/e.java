package o0b;

import c1b.h;
import com.revolut.feature.retail.advanced_charts.impl.data.AdvancedChartsService;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mtj.k;
import ne0.j;
import nfj.l1;
import nx2.f;
import nya.b0;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements u0b.a {

    @NotNull
    public static final b Companion = new b();
    public static final Object e = r0.k(new Pair("1m", h.ONE_MINUTE), new Pair("2m", h.TWO_MINUTES), new Pair("5m", h.FIVE_MINUTES), new Pair("10m", h.TEN_MINUTES), new Pair("15m", h.FIFTEEN_MINUTES), new Pair("30m", h.THIRTY_MINUTES), new Pair("1H", h.ONE_HOUR), new Pair("4H", h.FOUR_HOURS), new Pair("12H", h.TWELVE_HOURS), new Pair("1D", h.ONE_DAY), new Pair("2D", h.TWO_DAYS), new Pair("4D", h.FOUR_DAYS), new Pair("1w", h.ONE_WEEK), new Pair("5w", h.FIVE_WEEKS), new Pair("1M", h.ONE_MONTH));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvancedChartsService f221193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f221194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f221195c;
    public final x4l.c d;

    public e(AdvancedChartsService advancedChartsService, j cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(advancedChartsService, "advancedChartsService");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f221193a = advancedChartsService;
        this.f221194b = cache;
        this.f221195c = storage;
        this.d = new x4l.c(new k(this, null, 25), new b0(this, 15), new f(this, 9), new nwc.f(this, null, 11), new l1(this, (Continuation) null, 6));
    }
}
