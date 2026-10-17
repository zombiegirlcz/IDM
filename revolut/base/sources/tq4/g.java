package tq4;

import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f273526p;

    public g(CreditCardLimitDecreaseAmountScreenContract$InputData inputData, w80.b amountFormatter, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountFormatter;
        dj0.d dVar = inputData.f69193b;
        this.f273526p = mra.d.b(this, new d(null, dVar, inputData.f69194c, inputData.d, dVar.f115083b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f273526p;
    }
}
