package w8l;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends oki.h implements f {
    public final u79.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f295658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f295659q;

    public j(k stateMapper, u79.a offboardingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(offboardingInteractor, "offboardingInteractor");
        this.o = offboardingInteractor;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f295658p = z1VarB;
        this.f295659q = mra.d.b(this, new e(new Data(null, null, true, 3, null), h0.f322473a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f295658p, new w2a.q(continuation, this, 9)), new w50.g(this, continuation, 10), null, new u36.g(2, this, j.class, "updateScreenData", "updateScreenData(Lcom/revolut/data/model/Data;)V", 4, 22), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f295659q;
    }
}
