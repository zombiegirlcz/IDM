package com.revolut.feature.apm.core.ui.impl.ui.breakdown.details;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements h22.a {
    public final y o;

    public a(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(Object obj2) {
        boolean z = obj2 instanceof z3l.b;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            l.j2(this, new BreakdownDetailsController(new BreakdownDetailsContract$InputData.TaxBreakdown((z3l.b) obj2)), bottom_dialog, null, 2);
        } else if (obj2 instanceof ApmQuoteBreakdownItem) {
            l.j2(this, new BreakdownDetailsController(new BreakdownDetailsContract$InputData.ChargesBreakdown((ApmQuoteBreakdownItem) obj2)), bottom_dialog, null, 2);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
