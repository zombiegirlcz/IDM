package s8c;

import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q7c.s;
import vkm.j2;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f260969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j2 f260970m;

    public e(s shippingInteractor) {
        Intrinsics.checkNotNullParameter(shippingInteractor, "shippingInteractor");
        this.f260969l = shippingInteractor;
        this.f260970m = q.c(new d(b.f260967a));
    }

    @Override // yji.n
    public final void H2() {
        c cVar = ((d) this.f260970m.getValue()).f260968a;
        if (cVar instanceof a) {
            V2(new s09.c(this, ((a) cVar).f260966a, null, 22), new yi5.b(29));
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = h.f175850a;
        }
    }
}
