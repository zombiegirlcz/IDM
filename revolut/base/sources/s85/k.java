package s85;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.b f260895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y45.i f260896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f260897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ky4.e f260898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f260899t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l35.b loanInteractor, y45.i loanProductInteractor, c loanToggleBackupCardModelExtension, LoanToggleBackupCardScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanToggleBackupCardModelExtension, "loanToggleBackupCardModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f260895p = loanInteractor;
        this.f260896q = loanProductInteractor;
        this.f260897r = loanToggleBackupCardModelExtension;
        this.f260898s = new ky4.e(0);
        this.f260899t = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f70603a);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f260898s, new r3k.c(continuation, this, 27)), null, null, new s56.i(this, continuation, 11), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l2(new s64.a(this, null, 5), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f260899t;
    }
}
