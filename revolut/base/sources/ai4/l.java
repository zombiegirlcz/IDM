package ai4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements i {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f5192p;

    public l(cli.n stateMapper, SingleSelectorInputDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new e(inputData.f68375a, false, null), stateMapper, null, false, 12);
        this.f5192p = hx7.e.a(this, new ack.f(this, 15));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f5192p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
