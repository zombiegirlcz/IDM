package bb8;

import au6.a3;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements h {
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f14191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f14192q;

    public j(hj8.a juniorProfileInteractor, UpdateNameScreenContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = juniorProfileInteractor;
        this.f14191p = new vii.b();
        this.f14192q = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f76811a, inputData.f76812b, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f14191p, new a3(continuation, this, 14)), null, null, new b74.e(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f14192q;
    }
}
