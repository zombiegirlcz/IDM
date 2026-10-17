package z2a;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements dli.b {
    public final TransferPersonalisationStyleSelectorContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f319048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f319049q;

    public k(TransferPersonalisationStyleSelectorContract$InputData inputData, d0 personalisationInteractor, yq5.d stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalisationInteractor, "personalisationInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f319048p = personalisationInteractor;
        this.f319049q = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, d0.f(this.f319048p, 1), null, null, new yy6.f(this, null, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f319049q;
    }
}
