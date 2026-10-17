package qqe;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends oki.h implements dli.b {
    public final TeenDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xqe.b f248531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f248532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f248533r;

    public j(l stateMapper, TeenDetailsScreenContract$InputData inputData, xqe.b teenProfileInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        this.o = inputData;
        this.f248531p = teenProfileInteractor;
        this.f248532q = new vii.b();
        this.f248533r = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f248532q, new q7b.j(continuation, this, 20)), null, null, new qp7.g(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f248533r;
    }
}
