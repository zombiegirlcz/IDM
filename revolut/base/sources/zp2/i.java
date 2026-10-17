package zp2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import up2.u;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements dli.b {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f324167p;

    public i(n stateMapper, SwitchOutObligatedProductsScreenContract$InputData inputData, u switchOutDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(switchOutDialogProvider, "switchOutDialogProvider");
        this.o = switchOutDialogProvider;
        this.f324167p = mra.d.b(this, new d(inputData.f64071a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f324167p;
    }
}
