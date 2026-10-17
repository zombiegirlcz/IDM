package l62;

import android.os.Parcelable;
import aw0.n6;
import c12.s;
import c12.t;
import c12.u;
import c12.v;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$Step;
import com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.iris.impl.ui.registration.a f192350b;

    public /* synthetic */ g(com.revolut.feature.apm.iris.impl.ui.registration.a aVar, int i) {
        this.f192349a = i;
        this.f192350b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f192349a;
        e eVar = e.f192348a;
        com.revolut.feature.apm.iris.impl.ui.registration.a aVar = this.f192350b;
        c cVar = c.f192346a;
        switch (i) {
            case 0:
                v outputData = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, s.f20349a)) {
                    aVar.C2(cVar);
                } else if (Intrinsics.f(outputData, t.f20351a)) {
                    aVar.C2(d.f192347a);
                } else {
                    if (!(outputData instanceof u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(eVar);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.apm.iris.impl.ui.registration.a aVar2 = this.f192350b;
                IrisRegistrationFlowContract$InputData irisRegistrationFlowContract$InputData = aVar2.o;
                yja.b outputData2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                int i2 = h.f192351a[outputData2.ordinal()];
                int i3 = 3;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    if (irisRegistrationFlowContract$InputData.f62522a.getConflict() instanceof ApmOnboardingConflict.TaxIdMissing) {
                        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.iris_onboarding_tax_id_missing_title, null, null, 14), new TextLocalisedClause(R$string.iris_onboarding_tax_id_missing_subtitle, null, null, 14), null, null, false, 28);
                        aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.iris_onboarding_tax_id_missing_action_add, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.iris_onboarding_tax_id_missing_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                        k9 k9Var = k9.Payments;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        aVar2.f2(new ActionsBottomSheetController(new dii.a(aVar3, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new g(aVar2, i3));
                    } else {
                        oki.h.t2(aVar2, aVar2.f62530r, new IrisRegistrationFlowContract$Step.Terms(irisRegistrationFlowContract$InputData.f62522a.getTerms()), false, null, false, 12);
                    }
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C2(cVar);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.apm.iris.impl.ui.registration.a aVar4 = this.f192350b;
                yki.a aVar5 = aVar4.f62530r;
                m62.f outputData3 = (m62.f) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (Intrinsics.f(outputData3, m62.e.f202973a)) {
                    aVar4.C2(eVar);
                } else if (Intrinsics.f(outputData3, m62.d.f202972a)) {
                    oki.h.t2(aVar4, aVar4.f62530r, IrisRegistrationFlowContract$Step.PendingRegistration.f62526a, false, null, false, 12);
                } else if (Intrinsics.f(outputData3, m62.b.f202970a)) {
                    if (aVar5.c()) {
                        aVar5.e(false);
                    } else {
                        aVar4.C2(cVar);
                    }
                } else {
                    if (!Intrinsics.f(outputData3, m62.c.f202971a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar5);
                }
                return Unit.f186387a;
            default:
                dii.g outputData4 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (outputData4 instanceof dii.e) {
                    aVar.C1(u0.c(TaxResidencyFeatureConfig.TaxResidencyProfile.f89984a));
                    oki.h.D2(aVar.f62530r);
                } else {
                    aVar.C2(cVar);
                }
                return Unit.f186387a;
        }
    }
}
