package yj8;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements e {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f314439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f314440q;

    public h(j stateMapper, d inputData, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.o = inputData;
        this.f314439p = juniorProfileInteractor;
        this.f314440q = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, hj8.a.a(this.f314439p, this.o.f314436a, w4l.h.f294642c), null, null, new y83.d(this, (Continuation) null, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314440q;
    }
}
