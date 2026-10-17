package aui;

import au6.a3;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import prk.o;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements h {
    public final mti.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f9834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f9835q;

    public j(n stateMapper, mti.a airportsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(airportsInteractor, "airportsInteractor");
        this.o = airportsInteractor;
        this.f9834p = new vii.b();
        this.f9835q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, o.w("AsftAirportSelectionScreenModel", "loadAirportsTillFinish", q.Q(this.f9834p, new a3(continuation, this, 2))), null, null, new ap7.k(this, continuation, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f9835q;
    }
}
