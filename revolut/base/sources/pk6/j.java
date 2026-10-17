package pk6;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements dli.b {
    public final PixBranchSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.a f236932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f236933q;

    public j(PixBranchSelectionScreenContract$InputData inputData, oe6.a externalInstitutionsInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f236932p = externalInstitutionsInteractor;
        this.f236933q = mra.d.b(this, new e(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new pe2.l(this, null, 12), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236933q;
    }
}
