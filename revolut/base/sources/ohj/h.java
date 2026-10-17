package ohj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements dli.b {
    public final EsimSetupOptionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f225380p;

    public h(n stateMapper, EsimSetupOptionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f225380p = mra.d.b(this, new c(inputData.Z8(), (EsimProfile) d0.d0(inputData.Z8())), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225380p;
    }
}
