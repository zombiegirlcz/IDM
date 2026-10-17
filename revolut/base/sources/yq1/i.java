package yq1;

import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends bji.b implements jki.h {
    public final PagoPABillConfirmationScreenContract$InputData u;
    public final uq1.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f315974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f315975x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, PagoPABillConfirmationScreenContract$InputData inputData, uq1.a pagoPAInteractor, n walletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pagoPAInteractor, "pagoPAInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.u = inputData;
        this.v = pagoPAInteractor;
        this.f315974w = walletInteractor;
        this.f315975x = new c(inputData.f61492a);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.f315975x;
    }
}
