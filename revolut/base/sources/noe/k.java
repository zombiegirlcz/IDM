package noe;

import com.revolut.data.model.Data;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaxResidencyPrefetchDataScreenContract$InputData f218017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yme.a f218018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f218019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f218020s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, TaxResidencyPrefetchDataScreenContract$InputData inputData, yme.a taxResidencyInteractor, ang.f userInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f218017p = inputData;
        this.f218018q = taxResidencyInteractor;
        this.f218019r = userInteractor;
        this.f218020s = new b(new Data(null, null, false, 7, null), zi0.c.P(inputData.f90099a, false, null, 3), inputData.f90100b ? new Data(null, null, false, 7, null) : zi0.c.P(f0.f322471a, false, null, 3), new Data(null, null, false, 7, null));
    }

    @Override // yji.l
    public final void I1() {
        l2(new n0(14, (Continuation) null, this), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f218020s;
    }
}
