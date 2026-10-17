package com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog;

import cli.g;
import cli.j;
import cli.n;
import cli.y;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.TrustedMerchantsConfirmDialogContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ljg.c;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements ljg.a {
    public final y o;

    public b(n stateMapper, TrustedMerchantsConfirmDialogContract$InputData inputData) {
        j cVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof TrustedMerchantsConfirmDialogContract$InputData.ApproveConfirmation) {
            cVar = new ljg.b(((TrustedMerchantsConfirmDialogContract$InputData.ApproveConfirmation) inputData).f94427a);
        } else {
            if (!(inputData instanceof TrustedMerchantsConfirmDialogContract$InputData.RemoveConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new c(((TrustedMerchantsConfirmDialogContract$InputData.RemoveConfirmation) inputData).f94428a);
        }
        this.o = d.b(this, cVar, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
