package yu5;

import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters.FiltersScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends jki.g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FiltersScreenContract$InputData f316894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f316895q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jki.p stateMapper, FiltersScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f316894p = inputData;
        this.f316895q = new g(d0.P0(inputData.f71440a, new m()), inputData.f71441b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f316895q;
    }
}
