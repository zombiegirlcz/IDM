package po1;

import cli.y;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pij.d1;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends oki.h implements dli.b {
    public final y o;

    public n(EditLabelScreenContract$InputData inputData, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new e(inputData.f61232a), stateMapper, null, false, 12);
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zEquals = event.equals(j.f237881a);
        y yVar = this.o;
        if (zEquals) {
            C2(new f(((e) ((j2) yVar.f22677a).getValue()).f237877a));
        } else if (event instanceof h) {
            H2(yVar, new d1(event, 25));
        } else {
            if (!event.equals(i.f237880a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
