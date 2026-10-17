package z23;

import cli.j;
import cli.n;
import cli.y;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.dialogs.CardPersonalisationDialogsControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import z23.d;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h implements c {
    public final y o;

    public f(n stateMapper, CardPersonalisationDialogsControllerContract$InputData inputData) {
        j jVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof CardPersonalisationDialogsControllerContract$InputData.StartOver) {
            jVar = d.c.f318953a;
        } else if (inputData instanceof CardPersonalisationDialogsControllerContract$InputData.ConfirmExit) {
            jVar = d.a.f318951a;
        } else {
            if (!(inputData instanceof CardPersonalisationDialogsControllerContract$InputData.Skip)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = d.b.f318952a;
        }
        this.o = mra.d.b(this, jVar, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
