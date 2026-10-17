package jnj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements f {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f176815p;

    public g(EsimNonRefundableBottomSheetScreenContract$InputData inputData, n stateMapper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f176815p = mra.d.b(this, new d(inputData.f101442a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f176815p;
    }
}
