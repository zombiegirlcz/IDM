package b74;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import ip0.ej;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditConsentPreferencesScreenContract$InputData f12895a;

    public m(EditConsentPreferencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f12895a = inputData;
    }

    public static RowDelegate.Model a(int i, Clause clause, String str, boolean z) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), d8l.d.b(z), null, false, null, false, 60), clause, null, 0, null, null, null, 0, null, false, null, z, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862712);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        Clause textLocalisedQuantityClause;
        int i;
        TextLocalisedClause textLocalisedClause2;
        boolean z;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        aim.e eVar;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EditPreferencesConfiguration editPreferencesConfiguration = this.f12895a.f67276a;
        LocalDate f66441a = domainState.f12887a.getF66441a();
        boolean z3 = f66441a != null;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_consents_preferences_v2_title, null, null, 14);
        ConsentRetention selection = editPreferencesConfiguration.getSelection();
        if (selection instanceof ConsentRetention.ActiveFacility) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_consents_preferences_v2_subtitle_active_facility, null, null, 14);
        } else {
            if (!(selection instanceof ConsentRetention.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_consents_preferences_v2_subtitle_application, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause6 = textLocalisedClause;
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_consents_preferences_confirm, null, null, 14);
        boolean z4 = domainState.f12888b;
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        boolean z6 = editPreferencesConfiguration instanceof EditPreferencesConfiguration.ActiveFacility;
        if (z6) {
            textLocalisedQuantityClause = new TextLocalisedClause(R$string.credit_consents_preferences_v2_default_active_facility, null, null, 14);
        } else {
            if (!(editPreferencesConfiguration instanceof EditPreferencesConfiguration.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = R$plurals.credit_consents_incomplete_application_default;
            int i3 = ((EditPreferencesConfiguration.Application) editPreferencesConfiguration).f67266b;
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(i2, Integer.valueOf(i3), zhm.u.c(Integer.valueOf(i3)), (Style) null, 24);
        }
        if (z6) {
            i = R$drawable.uikit_icn_24_calendar_next_event;
        } else {
            if (!(editPreferencesConfiguration instanceof EditPreferencesConfiguration.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_calendar_date;
        }
        eVarB2.add(a(i, textLocalisedQuantityClause, "consent-retention-default", !z3));
        ConsentRetention selection2 = editPreferencesConfiguration.getSelection();
        if (selection2 instanceof ConsentRetention.ActiveFacility) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_consents_active_credit_facility_custom, null, null, 14);
        } else {
            if (!(selection2 instanceof ConsentRetention.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_consents_incomplete_application_custom, null, null, 14);
        }
        eVarB2.add(a(R$drawable.uikit_icn_24_controls, textLocalisedClause2, "consent-retention-custom", z3));
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        if (z6 && !z3) {
            eVarB.add(new ej("consent-retention-active-facility-footer", new c7(new TextLocalisedClause(R$string.credit_consents_preferences_v2_footer_active_facility, null, null, 14), false, null, 6)));
        }
        if (f66441a != null) {
            LocalDate f67267c = editPreferencesConfiguration.getF67267c();
            LocalDate d = editPreferencesConfiguration.getD();
            textLocalisedClause3 = textLocalisedClause5;
            z = z4;
            eVar = eVarB;
            textLocalisedClause4 = textLocalisedClause7;
            g5 g5Var = new g5("consent-retention-date-picker", f66441a, f66441a, true, null, f67267c, d, null, null, null, 0, 0, 1048368);
            yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
            eVar.add(g5Var);
        } else {
            z = z4;
            textLocalisedClause3 = textLocalisedClause5;
            textLocalisedClause4 = textLocalisedClause7;
            eVar = eVarB;
        }
        return new k(zhm.u.a(eVar), textLocalisedClause3, textLocalisedClause6, textLocalisedClause4, z);
    }
}
