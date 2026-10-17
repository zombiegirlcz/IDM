package c75;

import bw4.s;
import com.revolut.data.model.Data;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import y45.i;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f21880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ky4.e f21881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f21882r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i loanProductInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f21880p = loanProductInteractor;
        this.f21881q = new ky4.e(0);
        this.f21882r = new d(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f21881q, new s(continuation, this, 7)), null, null, new c1i.f(this, continuation, 14), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f21882r;
    }
}
