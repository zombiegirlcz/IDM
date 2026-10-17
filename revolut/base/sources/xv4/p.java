package xv4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends oki.h implements l {
    public final CreditCardStatementDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f309199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aw4.b f309200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f309201r;

    public p(CreditCardStatementDetailsScreenContract$InputData inputData, cli.n stateMapper, j60.a bottomDialogExtension, aw4.b creditCardStatementDetailsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(creditCardStatementDetailsInteractor, "creditCardStatementDetailsInteractor");
        this.o = inputData;
        this.f309199p = bottomDialogExtension;
        this.f309200q = creditCardStatementDetailsInteractor;
        this.f309201r = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f69722a, false, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new xb4.e(this, null, 12), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f309201r;
    }
}
