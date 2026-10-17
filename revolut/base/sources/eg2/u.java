package eg2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData;
import e8e.w;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends oki.h implements l {

    @NotNull
    public static final s Companion = new s();
    public final UpiTransferReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final twg.c f125540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wf2.e f125541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zjh.c f125542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rf2.a f125543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f125544t;
    public final y u;

    public u(UpiTransferReviewScreenContract$InputData inputData, twg.c upiTransferReviewInteractor, wf2.e interactor, zjh.c scheduleScreenProvider, rf2.a dialogProvider, l80.e dateProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(upiTransferReviewInteractor, "upiTransferReviewInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(scheduleScreenProvider, "scheduleScreenProvider");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f125540p = upiTransferReviewInteractor;
        this.f125541q = interactor;
        this.f125542r = scheduleScreenProvider;
        this.f125543s = dialogProvider;
        this.f125544t = dateProvider;
        this.u = mra.d.b(this, new g(inputData.f63007b, inputData.f63006a, inputData.f63008c, inputData.d, null, new Data(null, null, true, 3, null), inputData.k), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new ebg.o(this, null, 5), new yi5.b(26));
    }

    public final void I2() {
        o oVar = (o) ((g) ((j2) this.u.f22677a).getValue()).f.getContent();
        int i = 26;
        Continuation continuation = null;
        if (oVar instanceof m) {
            l2(new w(this, (m) oVar, continuation, 15), new yi5.b(i));
            return;
        }
        if (oVar instanceof n) {
            l2(new e38.c(this, (n) oVar, continuation, 11), new yi5.b(i));
        } else {
            if (oVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Transfer data is invalid, expected non null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "UPI Review Screen", null, illegalArgumentException, h0Var);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
