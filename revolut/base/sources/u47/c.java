package u47;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import ds6.f0;
import et6.s3;
import gr6.q;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends n implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TaxHubTransactionExportReviewScreenContract$InputData.Outbound f277271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f277272m;

    public c(TaxHubTransactionExportReviewScreenContract$InputData.Outbound inputData, q taxHubTransactionExportInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxHubTransactionExportInteractor, "taxHubTransactionExportInteractor");
        this.f277271l = inputData;
        this.f277272m = taxHubTransactionExportInteractor;
    }

    @Override // u47.g
    public final void P1(LinkedHashSet excludedTransactionIds) {
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        r2().M0(new e(excludedTransactionIds));
    }

    @Override // u47.g
    public final akg.n T() {
        f0 f0Var = f0.OUTBOUND;
        TaxHubTransactionExportReviewScreenContract$InputData.Outbound outbound = this.f277271l;
        return nim.a.v(((s3) this.f277272m).a(f0Var, outbound.f74427a, outbound.f74428b, outbound.f74429c, outbound.d), b.f277270a);
    }
}
