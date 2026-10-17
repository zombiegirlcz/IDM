package d22;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$InputData;
import cq6.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements dli.b {
    public final f22.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f110707p;

    public g(n stateMapper, ApmAliasClaimStatusNavigation$InputData inputData, f22.a apmAliasClaimInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmAliasClaimInteractor, "apmAliasClaimInteractor");
        this.o = apmAliasClaimInteractor;
        this.f110707p = mra.d.b(this, new d(new Data(null, null, true, 3, null), inputData.f62238a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 8), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110707p;
    }
}
