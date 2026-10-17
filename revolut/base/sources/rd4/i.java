package rd4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro.ManualUnderwritingIntroScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f253341p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ManualUnderwritingIntroScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f253341p = new d(inputData.f67956a, inputData.f67957b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f253341p;
    }
}
