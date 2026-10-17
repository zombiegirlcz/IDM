package kv2;

import cli.y;
import k7c.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements dli.b {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f189946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f189947q;

    public k(m stateMapper, g inputData, y51.a externalCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        this.o = inputData;
        this.f189946p = externalCardsInteractor;
        this.f189947q = mra.d.b(this, e.f189938a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new l0(this, null, 28), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f189947q;
    }
}
