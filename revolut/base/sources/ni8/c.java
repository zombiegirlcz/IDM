package ni8;

import aw0.e;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.junior_onboarding.api.provider.OnboardingConfiguration;
import com.revolut.feature.junior_onboarding.impl.R$plurals;
import com.revolut.feature.junior_onboarding.impl.R$string;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.lr;
import java.time.LocalDate;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kp0.w0;
import li8.k;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static j a(String str, String str2, int i, Clause clause, boolean z) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(i, null, null, 14), null, clause, null, null, false, null, z, false, 540673, true, 0, false, false, false, v.k(new oe8.a(), new oe8.b()), false, false, 0, false, false, null, 2128478072, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static /* synthetic */ j b(String str, String str2, int i, TextLocalisedClause textLocalisedClause, int i2) {
        if ((i2 & 8) != 0) {
            textLocalisedClause = null;
        }
        return a(str, str2, i, textLocalisedClause, textLocalisedClause != null);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        OnboardingConfiguration.PersonalDataFormat personalDataFormat;
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2;
        List listK;
        Clause clause;
        TextLocalisedClause textLocalisedClause2;
        Clause textLocalisedQuantityClause;
        com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a domainState = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f77057h;
        String secondLastName = domainState.f77055c;
        String firstLastName = domainState.f77054b;
        String firstName = domainState.f77053a;
        boolean z = domainState.i;
        bj0.b bVar = domainState.e;
        JuniorPersonalDetailsScreenContract$DateOfBirthStatus dobStatus = domainState.d;
        OnboardingConfiguration onboardingConfiguration = (OnboardingConfiguration) data.getContent();
        OnboardingConfiguration.PersonalDataFormat.FirstNameAndLastName firstNameAndLastName = OnboardingConfiguration.PersonalDataFormat.FirstNameAndLastName.f76970a;
        if (onboardingConfiguration == null || (personalDataFormat = onboardingConfiguration.f76969a) == null) {
            personalDataFormat = firstNameAndLastName;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.youth_signup_details_title, null, null, 14);
        m6 m6Var = n6.Companion;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
        Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
        Intrinsics.checkNotNullParameter(dobStatus, "dobStatus");
        e eVar = new e(false, null, null, m6.c(m6Var, textLocalisedClause4, defaultFilledButton, null, "PERSONAL_DETAIL_CREATION_MAIN_ACTION_TAG", d0.F0(firstName).toString().length() >= 1 && d0.F0(firstLastName).toString().length() >= 1 && !((!(dobStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Valid) && !(dobStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.OverRegistrationAge)) || bVar == null || z), null, null, null, 972), null, null, 55);
        aim.e eVarB = u.b();
        if (z) {
            i = 1;
            textLocalisedClause = new TextLocalisedClause(R$string.junior_signup_duplicated_child_error, null, null, 14);
        } else {
            i = 1;
            textLocalisedClause = null;
        }
        if (personalDataFormat.equals(firstNameAndLastName)) {
            j jVarB = b("ID_FIRST_NAME", firstName, R$string.youth_signup_details_firstName_placeholder, textLocalisedClause, 16);
            j jVarB2 = b("ID_FIRST_LAST_NAME", firstLastName, R$string.youth_signup_details_lastName_placeholder, null, 24);
            j[] jVarArr = new j[2];
            jVarArr[0] = jVarB;
            jVarArr[i] = jVarB2;
            listK = v.k(jVarArr);
            i2 = 0;
        } else {
            if (!(personalDataFormat instanceof OnboardingConfiguration.PersonalDataFormat.FirstNameAndSurnames)) {
                throw new NoWhenBranchMatchedException();
            }
            j jVarB3 = b("ID_FIRST_NAME", firstName, R$string.youth_signup_details_names_placeholder, textLocalisedClause, 16);
            j jVarB4 = b("ID_FIRST_LAST_NAME", firstLastName, R$string.youth_signup_details_first_surname_placeholder, null, 24);
            i2 = 0;
            j jVarA = a("ID_SECOND_LAST_NAME", secondLastName, R$string.youth_signup_details_second_surname_placeholder, new TextLocalisedClause(((OnboardingConfiguration.PersonalDataFormat.FirstNameAndSurnames) personalDataFormat).f76971a ? R$string.youth_signup_details_second_surname_hint_optional : R$string.youth_signup_details_second_surname_hint, null, null, 14), false);
            j[] jVarArr2 = new j[3];
            jVarArr2[0] = jVarB3;
            jVarArr2[i] = jVarB4;
            jVarArr2[2] = jVarA;
            listK = v.k(jVarArr2);
        }
        eVarB.addAll(listK);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.youth_signup_details_dateOfBirth_placeholder, null, null, 14);
        LocalDate f77048a = dobStatus.getF77048a();
        TextLocalisedClause textLocalisedClause6 = f77048a != null ? new TextLocalisedClause(R$string.youth_signup_details_dateOfBirth_hint, u.c(new TimeClause(oc.c.F(f77048a), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12) : null;
        lr lrVar = new lr(2);
        boolean z3 = dobStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid;
        if (z3) {
            int i3 = b.f215660a[((JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid) dobStatus).f77044b.ordinal()];
            if (i3 == i) {
                textLocalisedClause2 = new TextLocalisedClause(R.string.inputs_date_error_invalid, null, null, 14);
            } else if (i3 == 2) {
                int i5 = R$plurals.youth_signup_details_dateOfBirth_too_young_message;
                JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) domainState.f.getContent();
                if (juniorPlanConfiguration != null) {
                    i2 = juniorPlanConfiguration.f76899b;
                }
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(i5, Integer.valueOf(i2), (List) null, (Style) null, 28);
                clause = textLocalisedQuantityClause;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.junior_signup_details_birth_date_min_difference_error_message, null, null, 14);
            }
            textLocalisedQuantityClause = textLocalisedClause2;
            clause = textLocalisedQuantityClause;
        } else {
            if (!dobStatus.equals(JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Missing.f77045a) && !(dobStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.OverRegistrationAge) && !(dobStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Valid)) {
                throw new NoWhenBranchMatchedException();
            }
            clause = null;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_DATE_OF_BIRTH", textLocalisedClause6, textLocalisedClause5, null, false, null, false, clause, null, null, null, null, null, false, null, null, z3, false, false, false, lrVar, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2228360, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("ID_GENDER", bVar != null ? w0.k(bVar) : null, new TextLocalisedClause(R$string.junior_signup_details_gender_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelA);
        return new k(textLocalisedClause3, eVar, u.a(eVarB));
    }
}
