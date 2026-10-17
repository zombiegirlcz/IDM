package tlg;

import cli.n;
import cli.y;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends oki.h implements dli.b {
    public final SendChecksAddressVerificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hlg.b f272097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f272098q;

    public h(n stateMapper, SendChecksAddressVerificationScreenContract$InputData inputData, hlg.b sendChecksInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sendChecksInteractor, "sendChecksInteractor");
        this.o = inputData;
        this.f272097p = sendChecksInteractor;
        this.f272098q = mra.d.b(this, new d(inputData.f94593b, inputData.f94592a.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272098q;
    }
}
