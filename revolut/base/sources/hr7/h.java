package hr7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.rejection_reason.RejectionReasonScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements e {
    public final y o;

    public h(n stateMapper, RejectionReasonScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f75693a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
