package pp8;

import cli.y;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements dli.b {
    public final ChallengeEditFrequencyDatePickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f238300p;

    public j(k stateMapper, ChallengeEditFrequencyDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f238300p = mra.d.b(this, new d(inputData.f77372a), stateMapper, null, false, 12);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof e;
        y yVar = this.f238300p;
        if (z) {
            H2(yVar, new pp5.d(event, 2));
        } else if (event instanceof f) {
            H2(yVar, new pp5.d(this, 3));
        } else {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new i(((d) ((j2) yVar.f22677a).getValue()).f238295a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f238300p;
    }
}
