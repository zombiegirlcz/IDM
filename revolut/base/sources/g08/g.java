package g08;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import ip0.c20;
import ip0.y10;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;
import zw7.a0;
import zw7.d0;
import zw7.r0;
import zw7.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    public static y a(int i, int i2) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
        int i3 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("COVERAGE_INFO_LARGE_BUTTON_LISTT_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i3, i3, i3, i3, 496)), new t(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "DEFAULT_LEGACY_DIALOG_DELEGATES_KEY", null, null, null, 3832);
    }

    public final List b(d0 pet) {
        sa saVarA;
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate localDate3;
        Intrinsics.checkNotNullParameter(pet, "pet");
        s0 s0Var = new s0(6);
        Intrinsics.checkNotNullParameter(pet, "pet");
        zw7.s0 s0Var2 = pet.o;
        boolean z = s0Var2 instanceof r0;
        sa saVar = null;
        r0 r0Var = z ? (r0) s0Var2 : null;
        if (r0Var != null) {
            int i = yx7.o.f317593a[r0Var.f325846m.ordinal()];
            if (i == 1) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_profile_cancelled_banner_title, u.c(new TextClause(pet.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                int i2 = com.revolut.feature.insurance_pet.impl.R$string.pets_profile_cancelled_banner_description;
                r0 r0Var2 = z ? (r0) s0Var2 : null;
                saVarA = yx7.n.a(textLocalisedClause, new TextLocalisedClause(i2, u.c(new TimeClause((r0Var2 == null || (localDate = r0Var2.f) == null) ? jli.b.d() : jli.b.b(localDate), TimeClause.Format.DateLong.f57962b, null, null, 8)), null, 12));
            } else if (i == 2) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_profile_cancelled_banner_title, u.c(new TextClause(pet.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                int i3 = com.revolut.feature.insurance_pet.impl.R$string.pets_profile_cancelled_banner_description_overdue_payment;
                r0 r0Var3 = z ? (r0) s0Var2 : null;
                saVarA = yx7.n.a(textLocalisedClause2, new TextLocalisedClause(i3, u.c(new TimeClause((r0Var3 == null || (localDate2 = r0Var3.f) == null) ? jli.b.d() : jli.b.b(localDate2), TimeClause.Format.DateLong.f57962b, null, null, 8)), null, 12));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_profile_cancelled_banner_title, u.c(new TextClause(pet.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                int i5 = com.revolut.feature.insurance_pet.impl.R$string.pets_profile_cancelled_banner_description_address_not_supported;
                r0 r0Var4 = z ? (r0) s0Var2 : null;
                saVarA = yx7.n.a(textLocalisedClause3, new TextLocalisedClause(i5, u.c(new TimeClause((r0Var4 == null || (localDate3 = r0Var4.f) == null) ? jli.b.d() : jli.b.b(localDate3), TimeClause.Format.DateLong.f57962b, null, null, 8)), null, 12));
            }
        } else {
            saVarA = null;
        }
        s0Var.a(saVarA);
        s0Var.a(new ListSubheaderDelegate.Model("COVERAGE_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List listK = v.k(new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_VET_FEE_COVERAGE", new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_vet_fee_coverage_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_THERAPY", new ResourceImage(R$drawable.uikit_icn_24_cleaning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_complementary_therapy_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_BEHAVIOR", new ResourceImage(R$drawable.uikit_icn_24_like_dislike, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_behavioural_treatment_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_MISSING", new ResourceImage(R$drawable.uikit_icn_24_anonymous, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_missing_pet_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_AD", new ResourceImage(R$drawable.uikit_icn_24_newspaper, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_missing_ad_and_reward_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_PASS_AWAY", new ResourceImage(R$drawable.uikit_icn_24_broken_heart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_pass_away_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_CREMATION", new ResourceImage(R$drawable.uikit_icn_24_broken_heart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_cremation_and_burial_title, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_ONLINE_VET", new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_online_vet_support_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_DENTAL_ILL", new ResourceImage(R$drawable.uikit_icn_24_tooth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_dental_illness_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_DENTAL_INJ", new ResourceImage(R$drawable.uikit_icn_24_tooth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_dental_injury_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_LIABILITY", new ResourceImage(R$drawable.uikit_icn_24_services, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_public_liability_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_ABROAD", new ResourceImage(R$drawable.uikit_icn_24_medical_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_medical_care_abroad_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660), new RowDelegate.Model("COVERAGE_ITEM_LIST_ID_TRAVEL", new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_section_coverage_items_travel_title, null, null, 14), null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        s0Var.b((koi.j[]) listK.toArray(new RowDelegate.Model[0]));
        s0Var.a(l.a(pet));
        if ((pet.o instanceof s0.a) && pet.f325772n != a0.INITIALISING) {
            sa saVar2 = new sa("REMOVE_INCOMPLETE_PROFILE_BANNER_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_remove_pet_banner_title, u.c(pet.d), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_remove_pet_banner_description, null, null, 14), u.c(new ActionsView.Item("REMOVE_INCOMPLETE_PROFILE_BANNER_ACTION_ID", mx0.d.NEGATIVE, false, null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_pet_profile_incomplete_remove_pet_banner_remove_button_title, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (c20) null, y10.LIGHT, (Object) null, 160);
            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
            saVar = saVar2;
        }
        s0Var.a(saVar);
        TextDelegate.Model modelA = yx7.t.a();
        int i6 = R$attr.uikit_dp72;
        int i21 = R$attr.uikit_dp0;
        yp0.b.r(modelA, 0, i6, i21, i21, 1);
        s0Var.a(modelA);
        ArrayList arrayList = s0Var.f186433a;
        return v.m(arrayList.toArray(new koi.j[arrayList.size()]));
    }
}
