package lk7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACInsuranceDetailsScreenContract$InputData f196284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final si7.a f196285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f196286r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jki.p stateMapper, CFACInsuranceDetailsScreenContract$InputData inputData, si7.a insuranceInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f196284p = inputData;
        this.f196285q = insuranceInteractor;
        this.f196286r = new g(new Data(null, null, true, 3, null), inputData.f75122b);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(si7.a.c(this.f196285q, this.f196284p.f75121a)), null, null, new le8.d(this, (Continuation) null, 13), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f196286r;
    }
}
