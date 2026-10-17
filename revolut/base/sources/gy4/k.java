package gy4;

import cli.y;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetControllerContract$InputData;
import gvi.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {
    public final PickerBottomSheetControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f147829p;

    public k(PickerBottomSheetControllerContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f147829p = mra.d.b(this, new d((j) inputData.f69842c.get(inputData.d)), stateMapper, null, false, 12);
    }

    public final void I2(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof f;
        y yVar = this.f147829p;
        if (z) {
            H2(yVar, new s(this, (f) event, 4));
        } else {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new h(((d) ((j2) yVar.f22677a).getValue()).f147821a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f147829p;
    }
}
