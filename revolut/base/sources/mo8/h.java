package mo8;

import cli.y;
import com.revolut.data.model.Data;
import i3g.k;
import kl.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements f {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f207564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1 f207565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f207566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f207567s;

    public h(k stateMapper, e inputData, hj8.a juniorProfileInteractor, t1 juniorSettingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorSettingsInteractor, "juniorSettingsInteractor");
        this.o = inputData;
        this.f207564p = juniorProfileInteractor;
        this.f207565q = juniorSettingsInteractor;
        this.f207566r = new vii.b();
        this.f207567s = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f207566r, new mk0.f(continuation, this, 4)), null, null, new mkk.q(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f207567s;
    }
}
