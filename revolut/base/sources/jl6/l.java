package jl6;

import aii.q;
import cli.y;
import cli.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements z {
    public final y21.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f175610p;

    public l(j mapper, y21.c optOutRepository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.o = optOutRepository;
        this.f175610p = mra.d.b(this, g.f175605a, mapper, null, false, 12);
    }

    public final void I2(f fVar) {
        Continuation continuation = null;
        if (fVar.equals(e.f175604a)) {
            l2(new af3.f((Object) this, true, continuation, 24), new yi5.b(26));
        } else if (fVar.equals(d.f175603a)) {
            l2(new af3.f((Object) this, false, continuation, 24), new yi5.b(26));
        } else {
            if (!fVar.equals(c.f175602a)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(q.f5292a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f175610p;
    }
}
