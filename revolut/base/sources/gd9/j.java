package gd9;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements f {
    public final pre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f143121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f143122q;

    public j(pre.c termsInteractor, mre.c termsNavigationFactory, k stateMapper) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = termsInteractor;
        this.f143121p = termsNavigationFactory;
        od0.i.Companion.getClass();
        this.f143122q = mra.d.b(this, new d(od0.i.f224256b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f143122q;
    }
}
