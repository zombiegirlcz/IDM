package r6d;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreenContract$InputData;
import et6.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final l6d.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f251668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PaymentLinkAutoPreviewScreenContract$InputData f251669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f251670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f251671s;

    public g(l6d.a brandingPreviewUrlProvider, t0 brandingSharedInteractor, PaymentLinkAutoPreviewScreenContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(brandingPreviewUrlProvider, "brandingPreviewUrlProvider");
        Intrinsics.checkNotNullParameter(brandingSharedInteractor, "brandingSharedInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = brandingPreviewUrlProvider;
        this.f251668p = brandingSharedInteractor;
        this.f251669q = inputData;
        this.f251670r = new vii.b();
        this.f251671s = mra.d.b(this, new d(inputData.f86073a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new qc8.b(this, null, 23), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f251671s;
    }
}
