package com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements;

import cli.g;
import cli.k;
import cli.y;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsPeriodChooserController;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements dli.b {
    public final y o;

    public b(StockFinancialsStatementsPeriodChooserController.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.b(this, k.f25028a, new hog.d(inputData, 4), null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
