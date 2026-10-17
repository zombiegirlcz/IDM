package rv7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import rt4.o;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements dli.b {
    public final InsuranceDocumentsLayoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f257729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ij0.a f257730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mu7.c f257731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f257732s;

    public j(n stateMapper, InsuranceDocumentsLayoutScreenContract$InputData inputData, x deeplinkHandler, ij0.a coreNetworkConfiguration, mu7.c insuranceDetailsLayoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(insuranceDetailsLayoutInteractor, "insuranceDetailsLayoutInteractor");
        this.o = inputData;
        this.f257729p = deeplinkHandler;
        this.f257730q = coreNetworkConfiguration;
        this.f257731r = insuranceDetailsLayoutInteractor;
        this.f257732s = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, mu7.c.a(this.f257731r, this.o.f76126a, false, 6), null, null, new o(this, null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f257732s;
    }
}
