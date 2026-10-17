package kxk;

import cli.y;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ip0.v7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends oki.h implements i {

    @NotNull
    public static final m Companion = new m();
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hxk.a f190608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f190609q;

    public n(g input, cli.n stateMapper, hxk.a observeTradingSchedules) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(observeTradingSchedules, "observeTradingSchedules");
        this.o = input;
        this.f190608p = observeTradingSchedules;
        this.f190609q = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow gVar;
        Flow gVar2;
        gxk.g mainAsset = this.o.f190601a;
        hxk.b bVar = (hxk.b) this.f190608p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(mainAsset, "mainAsset");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        if (mainAsset instanceof gxk.f) {
            gxk.f fVar = (gxk.f) mainAsset;
            nel.n nVar = fVar.f147765a;
            if (io3.h.j(nVar.f214597c)) {
                od0.i.Companion.getClass();
                gVar2 = new go.g(zi0.c.P(od0.i.f224256b, false, null, 3), 2);
            } else {
                gVar2 = xam.a.h(new f23.y(bVar, nVar, continuation, 25), ybl.k.h(bVar.f156617b, TradingAccountType.Margin.f105271a, null, 6));
            }
            gVar = xam.a.h(new a9h.a(nVar, bVar, fVar, continuation, 11), gVar2);
        } else {
            if (!(mainAsset instanceof gxk.e)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new go.g(zi0.c.P(new gxk.h(new gxk.a(mainAsset, gxk.b.f147762a), null), false, null, 3), 2);
        }
        yji.l.b1(this, v7.y("MarketHoursControllerModel", "collectTradingSessions", gVar), null, new krc.h(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f190609q;
    }
}
