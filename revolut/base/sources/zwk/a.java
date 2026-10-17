package zwk;

import com.revolut.retail.feature.trading_hours.impl.data.network.TradingHoursService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ue0.c;
import y5b.b0;
import y69.e;
import zhm.d0;
import zo2.h;
import zrd.q;
import zt4.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingHoursService f325973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f325974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f325975c;
    public final x4l.c d;

    public a(TradingHoursService service, c storageCache, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f325973a = service;
        this.f325974b = storageCache;
        this.f325975c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 16), new q(this, 14), new h(this, 21), new l(this, continuation, 13), new e(this, continuation, 11));
    }

    public static String a(List list) {
        return j6.a.q("TRADING_SESSIONS_KEY_", d0.k0(list, "_", null, null, 0, null, 62));
    }
}
