package qc6;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import pwb.p;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements b {
    public final ua6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sa6.i f244575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f244576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f244577r;

    public j(ua6.a donationsNaviCommandsProvider, sa6.i charityTransactionsPagingInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(donationsNaviCommandsProvider, "donationsNaviCommandsProvider");
        Intrinsics.checkNotNullParameter(charityTransactionsPagingInteractor, "charityTransactionsPagingInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = donationsNaviCommandsProvider;
        this.f244575p = charityTransactionsPagingInteractor;
        this.f244576q = ta6.a.a(0);
        this.f244577r = mra.d.b(this, new a(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new p(this, null, 29), new yi5.b(26));
        l.a1(this, rd0.e.b(this.f244575p.f261324b), null, null, new qc3.c(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244577r;
    }
}
