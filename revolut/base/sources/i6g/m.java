package i6g;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import g4b.a0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends oki.h implements h {
    public final fn2.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f159004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f159005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f159006r;

    public m(n stateMapper, fn2.c locationsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(locationsInteractor, "locationsInteractor");
        this.o = locationsInteractor;
        m70.a.c(t0.f186434a);
        this.f159004p = q.c("");
        this.f159005q = new vii.b();
        this.f159006r = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        int i = 26;
        Continuation continuation = null;
        yji.l.a1(this, q.q(new a0(t1.d(this.f159004p, 300L), i)), null, null, new l(0, this, continuation), 3);
        yji.l.a1(this, q.q(q.Q(this.f159006r.B(new i4h.q(i)), new j(0, this, continuation))), null, null, new l(1, this, continuation), 3);
        yji.l.a1(this, q.Q(this.f159005q, new j(1, this, continuation)), null, null, new l(2, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f159006r;
    }
}
