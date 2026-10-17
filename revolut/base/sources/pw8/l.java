package pw8;

import cli.y;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$InputData;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$State;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends oki.h implements k {
    public final IntroductionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f240353p;

    public l(com.revolut.feature.kyc.impl.introduction.a stateMapper, IntroductionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f240353p = mra.d.b(this, new IntroductionScreenContract$State(false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f240353p;
    }
}
