package mb7;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qfe.m;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements i {
    public final r10.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f204179p;

    public k(l stateMapper, r10.d hideableAccountsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(hideableAccountsProvider, "hideableAccountsProvider");
        this.o = hideableAccountsProvider;
        this.f204179p = mra.d.b(this, new d(false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        r10.d dVar = this.o;
        yji.l.b1(this, new ie7.h(((m) dVar.f250818a).a(sfe.a.CACHE_ONLY, qfe.j.f245295a), dVar, 9), null, new jkh.g(this, (Continuation) null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204179p;
    }
}
