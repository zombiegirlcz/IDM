package aye;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends oki.h implements dli.b {
    public final IndiaStoredMethodDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f11147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f11148q;

    public m(IndiaStoredMethodDetailsScreenContract$InputData inputData, g0 indiaStoredMethodDetailInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(indiaStoredMethodDetailInteractor, "indiaStoredMethodDetailInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f11147p = indiaStoredMethodDetailInteractor;
        this.f11148q = mra.d.b(this, new d(new Data(null, null, true, 3, null), inputData.f90822b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String storedMethodId = this.o.f90821a;
        g0 g0Var = this.f11147p;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cve.c cVar = (cve.c) g0Var.f272384b;
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, cVar.d.b(storedMethodId, loadingStrategy), null, null, new avk.i(this, null, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f11148q;
    }
}
