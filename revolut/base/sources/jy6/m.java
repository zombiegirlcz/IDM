package jy6;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ly6.d;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends oki.h implements dli.b {
    public final ly6.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f179347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f179348q;

    public m(ly6.f remindersExtension, p stateMapper) {
        Intrinsics.checkNotNullParameter(remindersExtension, "remindersExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = remindersExtension;
        this.f179347p = new vii.b();
        this.f179348q = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f179347p, new l(continuation, this, 0)), null, null, new jv.o(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f179348q;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d.a) {
            B2();
            return null;
        }
        if (!(event instanceof ly6.e)) {
            return super.o2(event);
        }
        H2(this.f179348q, new ax9.j(event, 3));
        return null;
    }
}
