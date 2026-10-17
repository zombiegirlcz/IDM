package gqf;

import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f145718p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReasonForTransferChooserScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f145718p = new c(inputData.f92191a, inputData.f92192b, inputData.f92193c, inputData.d);
    }

    @Override // jki.g
    public final i r2() {
        return this.f145718p;
    }
}
