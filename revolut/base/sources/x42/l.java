package x42;

import cli.n;
import cli.y;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends oki.h implements g {
    public final TransferSettingsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f302783p;

    public l(TransferSettingsContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        d dVar = new d(inputData.f62451a.f62180a);
        ApmTransferPayerSettings apmTransferPayerSettings = inputData.f62451a;
        this.f302783p = mra.d.b(this, new a(dVar, new e(apmTransferPayerSettings.f62181b), apmTransferPayerSettings.f62182c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f302783p;
    }
}
