package ydf;

import ael.k;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import w4l.i;
import wyd.f;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fxk.a f312685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f312686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df0.b f312687c;

    public b(fxk.a tradingHoursInteractor, ybl.b instrumentTickerInteractor, df0.b syncedDateProvider, c executionTimingProvider) {
        Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        Intrinsics.checkNotNullParameter(executionTimingProvider, "executionTimingProvider");
        this.f312685a = tradingHoursInteractor;
        this.f312686b = instrumentTickerInteractor;
        this.f312687c = syncedDateProvider;
    }

    public final Flow a(String securityRef, String exchange, r0 orderType, boolean z) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        List listC = u.c(exchange);
        fxk.a aVar = this.f312685a;
        i iVar = i.f294643c;
        return q.q(nim.a.v(u0.i(aVar.a(listC, iVar), ((k) this.f312686b).o(securityRef, iVar), new f(ta6.a.I(1L, TimeUnit.MINUTES), this, 24)), new wo5.a(exchange, this, orderType, z)));
    }
}
