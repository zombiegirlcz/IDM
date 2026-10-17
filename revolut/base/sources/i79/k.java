package i79;

import b79.m;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements h {
    public final r69.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f159220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f159221q;

    public k(n stateMapper, r69.a inboxInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inboxInteractor;
        this.f159220p = deeplinkHandler;
        this.f159221q = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        m mVar = (m) ((y69.d) this.o).f311235a;
        l.b1(this, rd0.e.b(mVar.f12964j.f(Unit.f186387a, mVar.i.a("time_based_cache", true))), null, new i13.d(this, (Continuation) null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f159221q;
    }
}
