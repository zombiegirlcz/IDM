package uni;

import cli.y;
import com.revolut.otp.input.flow.push.OtpPushScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends oki.h implements dli.b {
    public final OtpPushScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xni.f f281443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f281444q;

    public i(OtpPushScreenContract$InputData inputData, xni.f otpPushDisplayControllerModelExtension, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(otpPushDisplayControllerModelExtension, "otpPushDisplayControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f281443p = otpPushDisplayControllerModelExtension;
        this.f281444q = mra.d.b(this, new d("", false, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, (j2) ((xni.g) this.f281443p).f307512m.f22677a, null, null, new uf0.d(this, null, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f281444q;
    }
}
