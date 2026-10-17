package fw4;

import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f138581p;

    public j(CreditCardDownPaymentScreenContract$InputData inputData, n stateMapper, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = amountFormatter;
        this.f138581p = mra.d.b(this, new d(inputData.f69761a, inputData.f69762b, inputData.f69763c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f138581p;
    }
}
