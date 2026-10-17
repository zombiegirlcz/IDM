package yu7;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCoverageActivationScreenContract$InputData f316910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou7.c f316911b;

    public m(InsuranceCoverageActivationScreenContract$InputData inputData, ou7.c cardItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardItemMapper, "cardItemMapper");
        this.f316910a = inputData;
        this.f316911b = cardItemMapper;
    }

    public static RowDelegate.Model a(Clause clause, int i) {
        return new RowDelegate.Model(a0.d.n("STEP_ITEM_ID_", i), new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorForeground), 16), false, false, 6), clause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_scheme_insurance_activation_title, null, null, 14);
        int i = R$string.embedded_insurance_scheme_insurance_activation_primary_action_button_text;
        InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = this.f316910a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(insuranceCoverageActivationScreenContract$InputData.f76083c.f75969a), null, 12);
        aim.e eVarB = u.b();
        int i2 = R$string.embedded_insurance_scheme_insurance_activation_steps_log_in;
        SchemeInsurancePortal schemeInsurancePortal = insuranceCoverageActivationScreenContract$InputData.f76083c;
        RowDelegate.Model modelA = a(new TextLocalisedClause(i2, u.c(schemeInsurancePortal.f75969a), null, 12), 1);
        yp0.b.l(modelA, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, null, false, 60);
        eVarB.add(modelA);
        ArrayList arrayListE0 = d0.E0((List) iii.c.f(domainState.f316899a, new ysk.a(8), new ypg.h(16), new y(this, 2)), u.c(a(new TextClause(insuranceCoverageActivationScreenContract$InputData.f76081a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 2)));
        yp0.b.k(arrayListE0, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, 28);
        eVarB.addAll(arrayListE0);
        RowDelegate.Model modelA2 = a(new TextLocalisedClause(R$string.embedded_insurance_scheme_insurance_activation_steps_create_ticket, null, null, 14), 3);
        yp0.b.l(modelA2, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, null, false, 60);
        eVarB.add(modelA2);
        RowDelegate.Model modelA3 = a(new TextLocalisedClause(R$string.embedded_insurance_scheme_insurance_activation_steps_coverage_active_time, u.c(schemeInsurancePortal.f75969a), null, 12), 4);
        yp0.b.l(modelA3, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, null, false, 60);
        eVarB.add(modelA3);
        return new i(u.a(eVarB), textLocalisedClause, textLocalisedClause2);
    }
}
