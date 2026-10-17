package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.ManageTaxRatesFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate.NewTaxRateScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.TaxRatesScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import za9.c;
import zd1.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ManageTaxRatesFlowContract$Step.TaxRates f60749t = ManageTaxRatesFlowContract$Step.TaxRates.f60748a;
    public final EmptyFlowState u = EmptyFlowState.f98428a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ManageTaxRatesFlowContract$Step step = (ManageTaxRatesFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ManageTaxRatesFlowContract$Step.TaxRates) {
            TaxRatesScreen taxRatesScreen = new TaxRatesScreen();
            c cVar = new c(this, 10);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            taxRatesScreen.H = cVar;
            return taxRatesScreen;
        }
        if (step instanceof ManageTaxRatesFlowContract$Step.AddTaxRate) {
            return new NewTaxRateScreen();
        }
        if (step instanceof ManageTaxRatesFlowContract$Step.EditTaxRate) {
            return new EditTaxRateScreen(new EditTaxRateScreenContract$InputData(((ManageTaxRatesFlowContract$Step.EditTaxRate) step).f60747a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f60749t;
    }
}
