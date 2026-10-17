package com.revolut.feature.tax_residency.impl.flows.tin;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlowContract$Step;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import gmk.j;
import i26.l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;
import y7a.s;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements goe.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TaxNumberInputFlowContract$InputData f90080t;
    public final TaxNumberInputFlowContract$Step u;
    public final TaxNumberInputFlowContract$State v;

    public a(TaxNumberInputFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f90080t = inputData;
        f fVar = inputData.e;
        this.u = fVar == null ? TaxNumberInputFlowContract$Step.TaxResidencyCountryPicker.f90079a : new TaxNumberInputFlowContract$Step.TaxNumberInput(l.k(inputData.f90073c, fVar.f323482a));
        this.v = TaxNumberInputFlowContract$State.f90077a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TaxNumberInputFlowContract$Step step = (TaxNumberInputFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof TaxNumberInputFlowContract$Step.TaxNumberInput;
        TaxNumberInputFlowContract$InputData taxNumberInputFlowContract$InputData = this.f90080t;
        if (!z) {
            if (!(step instanceof TaxNumberInputFlowContract$Step.TaxResidencyCountryPicker)) {
                throw new NoWhenBranchMatchedException();
            }
            PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(new moe.a(taxNumberInputFlowContract$InputData.f90072b, taxNumberInputFlowContract$InputData.f90071a, taxNumberInputFlowContract$InputData.f90073c), null, null, taxNumberInputFlowContract$InputData.f90074g ? s.ARROW : null, false, new TextLocalisedClause(R$string.tax_residency_list_search_country_hint, null, null, 14), "TaxResidencyPickerScreenInteractor", null, null, null, null, true, null, taxNumberInputFlowContract$InputData.i, null, 123730620));
            j jVar = new j(this, 6);
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            pickerScreen.H = jVar;
            return pickerScreen;
        }
        zme.l lVar = ((TaxNumberInputFlowContract$Step.TaxNumberInput) step).f90078a;
        List list = taxNumberInputFlowContract$InputData.f90071a;
        List list2 = taxNumberInputFlowContract$InputData.f90073c;
        b bVar = taxNumberInputFlowContract$InputData.f90072b;
        boolean z3 = taxNumberInputFlowContract$InputData.f;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        if (!taxNumberInputFlowContract$InputData.f90074g) {
            resourceImage = null;
        }
        boolean z4 = taxNumberInputFlowContract$InputData.f90075h;
        AnalyticsProduct analyticsProduct = taxNumberInputFlowContract$InputData.i;
        boolean z6 = taxNumberInputFlowContract$InputData.f90076j;
        f fVar = taxNumberInputFlowContract$InputData.e;
        String str = fVar != null ? fVar.f323483b : null;
        if (str == null) {
            str = "";
        }
        TaxNumberInputScreen taxNumberInputScreen = new TaxNumberInputScreen(new TaxNumberInputScreenContract$InputData(bVar, lVar, z3, resourceImage, z4, analyticsProduct, z6, str));
        a5b.a aVar = new a5b.a((Object) this, (Object) taxNumberInputScreen, (Object) lVar, (Object) list, (Object) list2, 17);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        taxNumberInputScreen.H = aVar;
        return taxNumberInputScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
