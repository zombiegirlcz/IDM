package yaa;

import cli.y;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import s8a.n;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements dli.b {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aba.a f312002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f312003q;

    public h(i stateMapper, ReviewTrustedAccountScreenContract$InputData inputData, n trustedBeneficiariesInteractor, aba.a reviewTrustedAccountDialogFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(trustedBeneficiariesInteractor, "trustedBeneficiariesInteractor");
        Intrinsics.checkNotNullParameter(reviewTrustedAccountDialogFactory, "reviewTrustedAccountDialogFactory");
        this.o = trustedBeneficiariesInteractor;
        this.f312002p = reviewTrustedAccountDialogFactory;
        this.f312003q = mra.d.b(this, new d(inputData.f80667a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312003q;
    }
}
