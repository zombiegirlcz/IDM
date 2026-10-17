package sw2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends oki.h implements i {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w39.b f266076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f266077q;

    public h(cli.n stateMapper, GooglePayOtpLocationMismatchScreenContract$InputData inputData, l93.f revolutCardsInteractor, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.o = revolutCardsInteractor;
        this.f266076p = locationInteractor;
        this.f266077q = mra.d.b(this, new j(new Data(null, null, true, 3, null), inputData.f64500a, inputData.f64501b, inputData.f64502c, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new e(this, null, 1), new su0.c(1, this, h.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 2));
        l2(new g(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f266077q;
    }
}
