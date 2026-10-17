package wx6;

import aii.m;
import aii.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yx6.c;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements dli.b {
    public final yx6.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f300764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f300765q;

    public j(yx6.e emailMessageExtension, l stateMapper) {
        Intrinsics.checkNotNullParameter(emailMessageExtension, "emailMessageExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = emailMessageExtension;
        this.f300764p = new vii.b();
        this.f300765q = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f300764p, new w2a.q(continuation, this, 24)), null, null, new wuh.q(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300765q;
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof c.a) {
            B2();
            return null;
        }
        if (!(event instanceof yx6.d)) {
            return super.o2(event);
        }
        H2(this.f300765q, new ax9.j(event, 4));
        return null;
    }
}
