package b74;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import ip0.iq;
import ip0.kr;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegacyEditConsentPreferencesScreenContract$InputData f12905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f12906b;

    public y(LegacyEditConsentPreferencesScreenContract$InputData inputData, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f12905a = inputData;
        this.f12906b = languageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Clause textLocalisedQuantityClause;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        s domainState = (s) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EditPreferencesConfiguration editPreferencesConfiguration = this.f12905a.f67277a;
        LocalDate f66441a = domainState.f12898a.getF66441a();
        LocalDate localDate = f66441a == null ? (LocalDate) kotlin.ranges.f.j(editPreferencesConfiguration.getE(), editPreferencesConfiguration.getF67267c(), editPreferencesConfiguration.getD()) : f66441a;
        boolean z = f66441a != null;
        zp0.n nVar = zp0.p.Companion;
        Locale localeB = ((s80.b) this.f12906b).b();
        nVar.getClass();
        String strA = zp0.n.a("ddMMyyyy", localeB);
        ConsentRetention selection = editPreferencesConfiguration.getSelection();
        if (selection instanceof ConsentRetention.ActiveFacility) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_consents_active_credit_facility_title, null, null, 14);
        } else {
            if (!(selection instanceof ConsentRetention.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_consents_incomplete_application_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
        ConsentRetention selection2 = editPreferencesConfiguration.getSelection();
        if (selection2 instanceof ConsentRetention.ActiveFacility) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_consents_active_credit_facility_subtitle, null, null, 14);
        } else {
            if (!(selection2 instanceof ConsentRetention.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_consents_incomplete_application_subtitle, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause6 = textLocalisedClause2;
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_consents_preferences_confirm, null, null, 14);
        boolean z3 = domainState.f12899b;
        aim.e eVarB = zhm.u.b();
        if (editPreferencesConfiguration instanceof EditPreferencesConfiguration.ActiveFacility) {
            textLocalisedQuantityClause = new TextLocalisedClause(R$string.credit_consents_active_credit_facility_default_title, null, null, 14);
        } else {
            if (!(editPreferencesConfiguration instanceof EditPreferencesConfiguration.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = R$plurals.credit_consents_incomplete_application_default;
            int i2 = ((EditPreferencesConfiguration.Application) editPreferencesConfiguration).f67266b;
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(i, Integer.valueOf(i2), zhm.u.c(Integer.valueOf(i2)), (Style) null, 24);
        }
        boolean z4 = !z;
        ConsentRetention selection3 = editPreferencesConfiguration.getSelection();
        if (selection3 instanceof ConsentRetention.ActiveFacility) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.credit_consents_active_credit_facility_default_subtitle, null, null, 14);
        } else {
            if (!(selection3 instanceof ConsentRetention.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = null;
        }
        InputChecklistDelegate.a.b bVar = new InputChecklistDelegate.a.b(textLocalisedClause3);
        iq iqVar = iq.RADIO_BUTTON;
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("consent-retention-default", textLocalisedQuantityClause, z4, false, bVar, iqVar, null, null, null, null, 0, 0, 0, 524232);
        ConsentRetention selection4 = editPreferencesConfiguration.getSelection();
        if (selection4 instanceof ConsentRetention.ActiveFacility) {
            textLocalisedClause4 = new TextLocalisedClause(R$string.credit_consents_active_credit_facility_custom, null, null, 14);
        } else {
            if (!(selection4 instanceof ConsentRetention.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause4 = new TextLocalisedClause(R$string.credit_consents_incomplete_application_custom, null, null, 14);
        }
        List listK = zhm.v.k(model, new InputChecklistDelegate.Model("consent-retention-custom", textLocalisedClause4, z, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        if (z) {
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.credit_consents_options_select_date, null, null, 14);
            String str = localDate.format(DateTimeFormatter.ofPattern(strA));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            List listC = zhm.u.c(new InputTextDelegate.Model("consent-retention-date", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, textLocalisedClause8, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, false, false, false, kr.f165065a, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2105356, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB.addAll(listC);
        }
        return new x(zhm.u.a(eVarB), textLocalisedClause5, textLocalisedClause6, textLocalisedClause7, z3);
    }
}
