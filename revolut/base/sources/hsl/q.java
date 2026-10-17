package hsl;

import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nil.c f155096a;

    public q(nil.c tradingProjectionsInteractor) {
        Intrinsics.checkNotNullParameter(tradingProjectionsInteractor, "tradingProjectionsInteractor");
        this.f155096a = tradingProjectionsInteractor;
    }

    public final Flow a(String securityRef, LocalDate localDate, sel.a period, Function1 investmentBlock, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(investmentBlock, "investmentBlock");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return c6d.b.i(vkm.q.q(nim.a.v(this.f155096a.b(new dil.a(securityRef, localDate, period), loadingStrategy), new hqk.a(9))), new hm3.b(investmentBlock, this, 23));
    }
}
