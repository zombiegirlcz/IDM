package de4;

import cli.k;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetContract$InputData;
import cv3.t;
import cv3.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final ConfirmationBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f113290p;

    public g(ConfirmationBottomSheetContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f113290p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof a)) {
            if (!(event instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        } else {
            t tVar = u.Companion;
            String str = this.o.f67996a.f;
            Boolean bool = Boolean.TRUE;
            tVar.getClass();
            C2(new d(t.b(bool, str)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f113290p;
    }
}
