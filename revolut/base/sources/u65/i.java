package u65;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements g {
    public final LoanDocumentsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.b f277492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y45.i f277493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y45.k f277494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ky4.e f277495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f277496t;

    public i(n stateMapper, LoanDocumentsControllerContract$InputData inputData, l35.b loanInteractor, y45.i loanProductInteractor, y45.k loanStatementDocumentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanStatementDocumentInteractor, "loanStatementDocumentInteractor");
        this.o = inputData;
        this.f277492p = loanInteractor;
        this.f277493q = loanProductInteractor;
        this.f277494r = loanStatementDocumentInteractor;
        this.f277495s = new ky4.e(0);
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this.f277496t = mra.d.b(this, new c(data, data2, od0.i.f224256b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f277495s, new tik.b(continuation, this, 23)), null, null, new tz6.e(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f277496t;
    }
}
