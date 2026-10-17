package pnj;

import bej.n;
import com.revolut.data.model.Data;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import pkf.x;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f237835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f237836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f237837r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, n esimTermsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(esimTermsInteractor, "esimTermsInteractor");
        this.f237835p = esimTermsInteractor;
        this.f237836q = new vii.b();
        this.f237837r = new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f237836q, new x(continuation, this, 8)), null, null, new o0(this, continuation, 24), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f237837r;
    }
}
