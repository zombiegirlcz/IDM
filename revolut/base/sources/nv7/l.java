package nv7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_embedded.impl.data.model.CfacPolicy;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreenContract$InputData;
import gu7.a4;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n8a.r;
import njj.n0;
import wli.x;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends oki.h implements dli.b {
    public final CfacCoverageSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final si7.a f219553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f219554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mu7.c f219555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f219556s;

    public l(n stateMapper, CfacCoverageSelectionScreenContract$InputData inputData, si7.a insuranceInteractor, x deeplinkHandler, mu7.c insuranceDetailsLayoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(insuranceDetailsLayoutInteractor, "insuranceDetailsLayoutInteractor");
        this.o = inputData;
        this.f219553p = insuranceInteractor;
        this.f219554q = deeplinkHandler;
        this.f219555r = insuranceDetailsLayoutInteractor;
        this.f219556s = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, mu7.c.a(this.f219555r, this.o.f76103a, false, 6), null, null, new nn7.d(this, null, 28), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (obj2 instanceof com.revolut.feature.insurance_embedded.impl.data.model.e) {
            CfacPolicy cfacPolicy = ((com.revolut.feature.insurance_embedded.impl.data.model.e) obj2).f75984b;
            l2(new r(this, cfacPolicy.f75902a, cfacPolicy.f75903b, continuation, 24), new yi5.b(26));
        } else if (obj2 instanceof a4) {
            n2(new n0(this, ((a4) obj2).f146714b, continuation, 24), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f219556s;
    }
}
