package y44;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends oki.h implements dli.b {
    public final CreditApplicationDocumentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f310784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f310785q;

    public m(CreditApplicationDocumentsScreenContract$InputData inputData, a interactor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f310784p = interactor;
        this.f310785q = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, pyd.c.m(this.f310784p.b()), null, null, new xv4.o(this, continuation, 19), 3);
        l2(new xb4.e(this, continuation, 22), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f310785q;
    }
}
