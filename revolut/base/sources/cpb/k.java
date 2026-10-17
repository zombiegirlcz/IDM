package cpb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.edit_account_name.SavingsAccountEditNameScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import rnb.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements dli.b {
    public final w o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final clb.c f107921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SavingsAccountEditNameScreenContract$InputData f107922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f107923r;

    public k(w savingsVaultInteractor, clb.c savingsErrorHandlingApi, l stateMapper, SavingsAccountEditNameScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = savingsVaultInteractor;
        this.f107921p = savingsErrorHandlingApi;
        this.f107922q = inputData;
        this.f107923r = mra.d.b(this, new e(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.c(this.f107922q.f83375a, w4l.h.f294642c), null, null, new ck7.j(this, null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f107923r;
    }
}
