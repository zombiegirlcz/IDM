package p8f;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okf.m;
import ox5.r;
import x5f.q;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends oki.h implements f {
    public final TacticalAllocationsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f234152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f234153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f234154r;

    public h(TacticalAllocationsControllerContract$InputData inputData, q allocationInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(allocationInteractor, "allocationInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f234152p = allocationInteractor;
        this.f234153q = new vii.b();
        this.f234154r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, vkm.q.Q(this.f234153q, new m(continuation, this, 19)), null, new r(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f234154r;
    }
}
