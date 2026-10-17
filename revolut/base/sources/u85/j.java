package u85;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import u7k.f0;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements dli.b {
    public final LoanWelcomeControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y45.i f278117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f278118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m35.f f278119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h60.d f278120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ky4.e f278121t;
    public final y u;

    public j(LoanWelcomeControllerContract$InputData inputData, n mapper, y45.i loanProductInteractor, j60.a bottomDialog, m35.f loanDialogMapper, h60.d animationControllerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        this.o = inputData;
        this.f278117p = loanProductInteractor;
        this.f278118q = bottomDialog;
        this.f278119r = loanDialogMapper;
        this.f278120s = animationControllerExtension;
        this.f278121t = new ky4.e(0);
        this.u = mra.d.b(this, new g(new Data(null, null, true, 2, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f278121t, new tik.b(continuation, this, 27)), null, null, new f0(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
