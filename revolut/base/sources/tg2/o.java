package tg2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends oki.h implements dli.b {
    public final UpiConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oz1.j f271053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f271054q;

    public o(UpiConfirmationScreenContract$InputData inputData, oz1.j pendingActionInteractor, kxk.o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pendingActionInteractor, "pendingActionInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f271053p = pendingActionInteractor;
        this.f271054q = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f271054q, new td1.f(this.o.f63015a, 14));
    }

    public final void I2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(i.f271047a)) {
            B2();
            return;
        }
        Continuation continuation = null;
        if (event.equals(g.f271045a)) {
            l2(new m(this, continuation, 0), new yi5.b(26));
        } else {
            if (!event.equals(h.f271046a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new m(this, continuation, 1), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f271054q;
    }
}
