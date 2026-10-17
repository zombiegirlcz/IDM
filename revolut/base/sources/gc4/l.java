package gc4;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements dli.b {
    public final hw3.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HowItWorksScreenContract$InputData f142333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f142334q;

    public l(hw3.c howItWorksInteractor, n stateMapper, HowItWorksScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(howItWorksInteractor, "howItWorksInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = howItWorksInteractor;
        this.f142333p = inputData;
        this.f142334q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new k(this, null, 1), new g4k.e(this, 23));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f142334q;
    }
}
