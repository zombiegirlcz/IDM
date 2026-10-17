package yef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eff.a f312923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f312924q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p stateMapper, FinalChecksScreenContract$InputData inputData, eff.a destinationProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        this.f312923p = destinationProvider;
        this.f312924q = new d(inputData.f91833a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f312924q;
    }
}
