package eh8;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements dli.b {
    public final tg8.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rul.e f125760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f125761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f125762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f125763s;

    public k(tg8.c assetsMigrationInteractor, rul.e juniorGraduationInteractor, ang.f userInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(assetsMigrationInteractor, "assetsMigrationInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = assetsMigrationInteractor;
        this.f125760p = juniorGraduationInteractor;
        this.f125761q = userInteractor;
        this.f125762r = new vii.b();
        this.f125763s = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f125762r, new dz6.n(continuation, this, 9)), null, null, new ea4.d(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f125763s;
    }
}
