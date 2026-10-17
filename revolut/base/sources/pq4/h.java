package pq4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.credit_card_limit.CreditCardLimitDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(CreditCardLimitDialogScreenContract$InputData inputData, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f69169a, inputData.f69170b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
