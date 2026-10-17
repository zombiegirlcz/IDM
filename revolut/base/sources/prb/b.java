package prb;

import bfl.g;
import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import dfl.q;
import dj0.d;
import k4l.q0;
import k4l.r0;
import k4l.s;
import k4l.y;
import k4l.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f238973a;

    static z a(c cVar, String securityRef, g tradeSide, q value, d dVar, ej0.b bVar, String str, String idempotencyTag, q0 q0Var, TradingAutoTopUp.Pocket pocket, int i) {
        ej0.b bVar2 = (i & 16) != 0 ? null : bVar;
        String str2 = (i & 32) != 0 ? null : str;
        q0 timeInForce = (i & 128) != 0 ? q0.DAY : q0Var;
        TradingAutoTopUp.Pocket pocket2 = (i & 256) != 0 ? null : pocket;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(idempotencyTag, "idempotencyTag");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        return new z(securityRef, tradeSide, r0.MARKET, timeInForce, value, dVar, bVar2, (d) null, (ej0.b) null, (DateTime) null, (y) null, (sel.a) null, pocket2, new s(idempotencyTag), str2, (TradingOrderExitStrategies) null);
    }
}
