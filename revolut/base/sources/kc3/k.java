package kc3;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements h {
    public final fk3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f182659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f182660q;

    public k(n stateMapper, fk3.a configurationInteractor, f inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = configurationInteractor;
        this.f182659p = inputData;
        this.f182660q = mra.d.b(this, new e(null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182660q;
    }
}
