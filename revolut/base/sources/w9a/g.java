package w9a;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends oki.h implements e {
    public final s8a.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f295702p;

    public g(n stateMapper, s8a.f interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = interactor;
        this.f295702p = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.f260949a.d.b(Unit.f186387a, w4l.i.f294643c), null, null, new w50.g(this, (Continuation) null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f295702p;
    }
}
