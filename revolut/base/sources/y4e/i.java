package y4e;

import ael.d0;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.api.navigation.PayoutScenarioDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xv4.o;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f310896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f310897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f310898n;

    public i(e inputData, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.f310896l = inputData;
        this.f310897m = stocksInteractor;
        this.f310898n = pyd.c.a(this, new d(new Data(null, null, false, 7, null)));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, nim.a.v(rd0.e.b(this.f310897m.a(this.f310896l.f310893a, false)), new y4b.b(4)), null, new o(this, (Continuation) null, 22), 3);
    }

    @Override // y4e.b
    public final void Z2() {
        A2(new PayoutScenarioDestination(this.f310896l.f310893a));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f310898n;
    }
}
