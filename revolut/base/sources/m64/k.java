package m64;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {
    public final RequestConsentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pw3.a f203007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f203008q;

    public k(RequestConsentScreenContract$InputData inputData, pw3.a coBorrowerConsentInitiatorInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(coBorrowerConsentInitiatorInteractor, "coBorrowerConsentInitiatorInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f203007p = coBorrowerConsentInitiatorInteractor;
        this.f203008q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(iu3.a aVar) {
        int i = h.f203004a[aVar.ordinal()];
        if (i == 1) {
            C2(e.f203000a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new j(this, null, 0), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203008q;
    }
}
