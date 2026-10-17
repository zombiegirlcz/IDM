package qv4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import om4.x2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends oki.h implements dli.b {
    public final CreditCardStatementHubScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f249532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f249533q;

    public n(CreditCardStatementHubScreenContract$InputData inputData, al4.n creditCardInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f249532p = creditCardInteractor;
        this.f249533q = mra.d.b(this, new g(f.UPCOMING, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.n(nim.a.v(((x2) this.f249532p).s(this.o.f69708a, w4l.i.f294643c), new qsa.p(22)), h0.f322473a), null, null, new qp7.g(this, null, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249533q;
    }
}
