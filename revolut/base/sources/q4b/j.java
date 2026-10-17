package q4b;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pkf.x;
import q2e.i0;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements c {
    public final o7.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f242128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t2b.f f242129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f242130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f242131s;

    public j(o7.b cfdOpenPositionsDelegate, g inputData, t2b.f marginQuoteProvider, h stateMapper) {
        Intrinsics.checkNotNullParameter(cfdOpenPositionsDelegate, "cfdOpenPositionsDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(marginQuoteProvider, "marginQuoteProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cfdOpenPositionsDelegate;
        this.f242128p = inputData;
        this.f242129q = marginQuoteProvider;
        this.f242130r = new vii.c();
        this.f242131s = mra.d.b(this, new e(null, inputData.e), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f242130r.a(Unit.f186387a, w4l.h.f294642c), new x(continuation, this, 22)), null, new i0(this, continuation, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f242131s;
    }
}
