package d33;

import cli.n;
import cli.y;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements c {
    public final y o;

    public g(n stateMapper, CardPersonalisationGuidelinesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f65184a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
