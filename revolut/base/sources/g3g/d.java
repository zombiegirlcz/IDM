package g3g;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import io3.h;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import myf.v;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import yp0.r;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(String str, int i, String str2, Set set) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(i, null, null, 14), null, null, null, null, false, null, false, true, 96, true, 0, true, set.contains(str), true, f0.f322471a, false, false, 0, false, false, null, 853262320, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static List b(TravelExperiencesBookingContactDetails contactDetails, boolean z, Set focusedInputIds) {
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("INPUTS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.experiences_additional_details_contact_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        if (!z) {
            model = null;
        }
        InputTextDelegate.Model modelA = a("FIRST_NAME_ITEM_ID", R$string.experiences_additional_details_contact_details_first_name, contactDetails.f92758a, focusedInputIds);
        InputTextDelegate.Model modelA2 = a("LAST_NAME_ITEM_ID", R$string.experiences_additional_details_contact_details_last_name, contactDetails.f92759b, focusedInputIds);
        TextClause textClause = new TextClause(contactDetails.f92760c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_additional_details_contact_details_mobile, null, null, 14);
        boolean zContains = focusedInputIds.contains("PHONE_INPUT_ITEM_ID");
        f0 f0Var = f0.f322471a;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("PHONE_INPUT_ITEM_ID", textClause, textLocalisedClause, null, null, null, null, false, null, false, true, 3, true, 0, true, zContains, true, f0Var, false, false, 0, false, false, null, 853262320, 131071);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("EMAIL_INPUT_ITEM_ID", new TextClause(contactDetails.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.experiences_additional_details_contact_details_email, null, null, 14), null, null, null, null, false, null, false, true, 208, true, 0, true, focusedInputIds.contains("EMAIL_INPUT_ITEM_ID"), true, f0Var, false, false, 0, false, false, null, 853262320, 131071);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        i[] elements = {model, modelA, modelA2, model2, model3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static List c(TravelExperienceSelectedLanguage travelExperienceSelectedLanguage) {
        String str;
        InputTextDelegate.Model model = null;
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("LANGUAGE_SELECTOR_ID", (travelExperienceSelectedLanguage == null || (str = travelExperienceSelectedLanguage.f92847b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.experiences_additional_details_tour_language, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        if (travelExperienceSelectedLanguage != null && travelExperienceSelectedLanguage.f92846a != null && !travelExperienceSelectedLanguage.f92848c.isEmpty()) {
            v vVar = travelExperienceSelectedLanguage.d;
            InputTextDelegate.Model modelA2 = r.a(new InputTextDelegate.Model("LANGUAGE_GUIDE_TYPE_SELECTOR_ID", vVar != null ? h.t(vVar) : null, new TextLocalisedClause(R$string.experiences_additional_details_guide_type_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            model = modelA2;
        }
        InputTextDelegate.Model[] elements = {modelA, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
