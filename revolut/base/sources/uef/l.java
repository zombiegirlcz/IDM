package uef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import u7k.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BeforeAfterScreenContract$InputData f279359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kef.a f279360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f279361r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, BeforeAfterScreenContract$InputData inputData, kef.a interactor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f279359p = inputData;
        this.f279360q = interactor;
        this.f279361r = new e(inputData.f91826a, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f279361r;
    }

    public final void y2() {
        String transactionId = this.f279359p.f91826a.f91803a.f91800a;
        kef.a aVar = this.f279360q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        nef.d dVar = aVar.f183064a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        yji.l.a1(this, rd0.e.b(dVar.f214509h.f(transactionId, true)), null, null, new f0(this, null, 28), 3);
    }
}
