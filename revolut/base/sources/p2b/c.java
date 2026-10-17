package p2b;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static ej0.b a(InstrumentTicker instrumentTicker, bfl.g tradeSide, r0 r0Var) {
        bfl.g gVar;
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        bfl.g gVar2 = bfl.g.BUY;
        ej0.b bVar = ((tradeSide == gVar2 && r0Var == r0.LIMIT) || (tradeSide == (gVar = bfl.g.SELL) && (r0Var == r0.STOP || r0Var == r0.MARKET))) ? instrumentTicker.f105124t : ((tradeSide == gVar && r0Var == r0.LIMIT) || (tradeSide == gVar2 && (r0Var == r0.STOP || r0Var == r0.MARKET))) ? instrumentTicker.u : null;
        if (bVar != null) {
            return bVar;
        }
        ej0.b bVar2 = instrumentTicker.f;
        dj0.d dVar = instrumentTicker.e;
        return bVar2 == null ? new ej0.b(pyd.c.j(dVar), dVar.f115083b) : bVar2;
    }
}
