package wxe;

import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreenContract$InputData;
import e0f.r1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends oki.h implements z {
    public final StoredMethodDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u51.a f300905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.y f300906q;

    public f0(cli.n stateMapper, StoredMethodDetailsScreenContract$InputData inputData, u51.a topUpMethodsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        this.o = inputData;
        this.f300905p = topUpMethodsInteractor;
        this.f300906q = mra.d.b(this, new o(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = this.o;
        yji.l.a1(this, ((r1) this.f300905p).h(storedMethodDetailsScreenContract$InputData.f90818a, storedMethodDetailsScreenContract$InputData.f90819b, w4l.i.f294643c), null, null, new wuh.q(this, (Continuation) null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300906q;
    }
}
