package pnb;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import pkf.x;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements dli.b {
    public final gnb.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f237685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f237686q;

    public h(gnb.b savingsDocumentsInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsDocumentsInteractor;
        this.f237685p = new vii.b();
        this.f237686q = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f237685p, new x(continuation, this, 6)), null, null, new o0(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237686q;
    }
}
