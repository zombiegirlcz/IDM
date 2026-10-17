package mtc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsControllerContract$InputData;
import h30.q;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends oki.h implements dli.b {
    public final SecondDeviceLoginDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f208815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f208816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f208817r;

    public m(n mapper, SecondDeviceLoginDetailsControllerContract$InputData inputData, q secondDeviceLoginInteractor, b0 secondDeviceLoginDetailsDialogFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(secondDeviceLoginInteractor, "secondDeviceLoginInteractor");
        Intrinsics.checkNotNullParameter(secondDeviceLoginDetailsDialogFactory, "secondDeviceLoginDetailsDialogFactory");
        this.o = inputData;
        this.f208815p = secondDeviceLoginInteractor;
        this.f208816q = secondDeviceLoginDetailsDialogFactory;
        this.f208817r = mra.d.b(this, new d(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String deviceId = this.o.f85357a;
        q qVar = this.f208815p;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        yji.l.a1(this, rd0.e.b(nim.a.w(((kdh.b) qVar.f148941b).j0(true, true), new ik3.a(deviceId, 10))), null, null, new mkk.q(this, null, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f208817r;
    }
}
