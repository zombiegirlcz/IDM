package vp8;

import cli.y;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker.ChallengeEditFrequencyPickerScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements i {
    public final y o;

    public j(l stateMapper, ChallengeEditFrequencyPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f77381a), stateMapper, null, false, 12);
    }

    public final void I2(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof f;
        y yVar = this.o;
        if (!z) {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new h(((d) ((j2) yVar.f22677a).getValue()).f291139a));
        } else {
            Object obj2 = ((f) event).f291141a.f;
            if (obj2 instanceof dp8.d) {
                H2(yVar, new sx4.b(obj2, 10));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
