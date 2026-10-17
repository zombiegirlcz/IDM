package qw6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements dli.b {
    public final y o;

    public i(FreelancerPluginChooserScreenContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f73790a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
