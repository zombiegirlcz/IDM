package a07;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.profile.account.FreelancerAccountScreenContract$InputData;
import et6.i3;
import et6.j3;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends oki.h implements j {
    public final r10.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j3 f159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f160q;

    public r(r10.f taxHubProfileInteractor, j3 freelancerSettingsAvailabilityInteractor, FreelancerAccountScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(taxHubProfileInteractor, "taxHubProfileInteractor");
        Intrinsics.checkNotNullParameter(freelancerSettingsAvailabilityInteractor, "freelancerSettingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = taxHubProfileInteractor;
        this.f159p = freelancerSettingsAvailabilityInteractor;
        this.f160q = mra.d.b(this, new f(inputData.f74035a, inputData.f74036b, inputData.f74037c, inputData.d, inputData.e, inputData.f, inputData.f74038g, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        j3 j3Var = this.f159p;
        j3Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, new v1(new i3(j3Var, null)), null, new m(this, null, 0), 3);
        yji.l.b1(this, new p(this.o.t0(), 0), null, new m(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160q;
    }
}
