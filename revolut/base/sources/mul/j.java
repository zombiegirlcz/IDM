package mul;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import java.util.UUID;
import jid.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends oki.h implements dli.b {
    public final SecurityAssetBalanceBreakdownScreenDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f209058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.c f209059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UUID f209060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f209061s;

    public j(m stateMapper, b saveStateDelegate, SecurityAssetBalanceBreakdownScreenDescriptor$InputData inputData, z breakdownContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(breakdownContentProvider, "breakdownContentProvider");
        this.o = inputData;
        this.f209058p = breakdownContentProvider;
        this.f209059q = new vii.c();
        this.f209060r = inputData.f91731b;
        this.f209061s = mra.d.b(this, new h(inputData.f91730a, new Data(null, null, true, 3, null), false), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f209059q.a(Unit.f186387a, w4l.h.f294642c), new mk0.f(continuation, this, 10)), null, null, new mkk.q(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f209061s;
    }
}
