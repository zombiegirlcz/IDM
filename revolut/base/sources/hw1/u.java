package hw1;

import cli.y;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends oki.h implements s {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BrebTransferNavigation$InputData.NewContact f156049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yu1.a f156050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f156051r;

    public u(g newContactAction, BrebTransferNavigation$InputData.NewContact inputData, yu1.a resolver, v stateMapper) {
        Intrinsics.checkNotNullParameter(newContactAction, "newContactAction");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = newContactAction;
        this.f156049p = inputData;
        this.f156050q = resolver;
        this.f156051r = mra.d.b(this, new m(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f156051r, new hs4.l(this, 27));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f156051r;
    }
}
