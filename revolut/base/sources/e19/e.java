package e19;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseControllerContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OfflineLicenseControllerContract$InputData f121925a;

    public e(OfflineLicenseControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f121925a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LicenseItem licenseItem = this.f121925a.f78046a;
        kj kjVar = new kj(licenseItem.f78043a, new lj(licenseItem.d, "utf-8"), null, Constants.TAG_FC_SPEED_MODE);
        yp0.b.l(kjVar, 0, 0, 0, 0, null, false, 63);
        return new c(u.c(kjVar));
    }
}
