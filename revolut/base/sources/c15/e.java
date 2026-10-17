package c15;

import cli.y;
import com.revolut.feature.credit.health.impl.ui.learn_more.LearnMoreScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(f stateMapper, LearnMoreScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f70001a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
