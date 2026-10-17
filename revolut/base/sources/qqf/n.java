package qqf;

import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f248546p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ReasonForTransferSummaryScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f248546p = new f(inputData.f92214a, inputData.f92215b, inputData.f92216c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f248546p;
    }
}
