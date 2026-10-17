package znc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsControllerContract$Input;
import dfl.i0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.q;
import zfd.s;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends oki.h implements dli.b {
    public final RoboTransactionDetailsControllerContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final glc.d f323704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final glc.c f323705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f323706r;

    public n(d initialState, l stateMapper, RoboTransactionDetailsControllerContract$Input input, glc.d roboTradeDetailsProvider, glc.c roboTransactionDetailsParcelHandler) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(roboTradeDetailsProvider, "roboTradeDetailsProvider");
        Intrinsics.checkNotNullParameter(roboTransactionDetailsParcelHandler, "roboTransactionDetailsParcelHandler");
        this.o = input;
        this.f323704p = roboTradeDetailsProvider;
        this.f323705q = roboTransactionDetailsParcelHandler;
        this.f323706r = mra.d.b(this, initialState, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow gVar;
        i0 trade = this.o.f85220a;
        vmc.a aVar = (vmc.a) this.f323704p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(trade, "trade");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        String strG = trade.g();
        if (strG == null) {
            throw new IllegalStateException("Trade has no portfolioId");
        }
        Flow flowA = glc.a.a(aVar.f290554a, strG);
        String orderId = trade.o();
        if (orderId != null) {
            t1j.b bVar = aVar.f290555b;
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            q qVar = (q) bVar.f267380b;
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            gVar = rd0.e.b(((w4l.f) qVar.d).e(orderId, loadingStrategy));
        } else {
            od0.i.Companion.getClass();
            gVar = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        yji.l.a1(this, rd0.e.n(nim.a.v(u0.m(flowA, gVar), new vgk.f(aVar, trade, 15)), h0.f322473a), null, null, new s(this, (Continuation) null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323706r;
    }
}
