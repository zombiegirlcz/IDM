package wgj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.EsimAutoRenewalInfoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(EsimAutoRenewalInfoScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f100903a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
