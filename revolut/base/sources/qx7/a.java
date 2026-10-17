package qx7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C1374a Companion = new C1374a();

    /* JADX INFO: renamed from: qx7.a$a, reason: collision with other inner class name */
    public static final class C1374a {
        private C1374a() {
        }
    }

    public static List a(DOBInputData dateOfBirth) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.pets_onboarding_pet_details_birthday_field_title, null, null, 14);
        TextClause textClause = new TextClause(dateOfBirth.getF76349b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = dateOfBirth.getF76350c() != tz7.b.NONE;
        int i = b.f250030b[dateOfBirth.getF76350c().ordinal()];
        if (i != 1) {
            if (i == 2) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_details_age_birthday_field_error_future_date, null, null, 14);
            } else if (i == 3) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_details_age_birthday_field_error_wrong_format, null, null, 14);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.pets_onboarding_pet_details_age_birthday_field_error_max_past_date, u.c(1990), null, 12);
            }
            textLocalisedClause = textLocalisedClause2;
        } else {
            textLocalisedClause = null;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("DAY_OF_BIRTH_INPUT_TEXT_LIST_ID", textClause, textLocalisedClause3, null, false, textLocalisedClause, null, null, null, null, null, false, null, null, z, false, 2, 0, null, false, false, null, false, null, false, false, false, dateOfBirth.getF76348a(), null, 0, -2228360, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
