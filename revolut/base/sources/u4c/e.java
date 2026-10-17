package u4c;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pt5.m;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements dli.b {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevXOrdersBreakdownScreenContract$InputData f277315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f277316q;

    public e(m activityExtension, RevXOrdersBreakdownScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(activityExtension, "activityExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = activityExtension;
        this.f277315p = inputData;
        this.f277316q = mra.d.b(this, new c(inputData.f84254a, inputData.f84255b, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.f3(this.f277315p.f84254a), null, new tz6.e(this, (Continuation) null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f277316q;
    }
}
