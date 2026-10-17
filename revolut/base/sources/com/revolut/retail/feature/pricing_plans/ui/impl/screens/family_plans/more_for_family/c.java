package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$ClickParcel;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$JointSavingsAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsAccountAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsSavingsAvailability;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.l;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(MoreForFamilyScreenContract$AvailableOptions options) {
        Clause textLocalisedQuantityClause;
        Clause textLocalisedClause;
        Clause textLocalisedQuantityClause2;
        Intrinsics.checkNotNullParameter(options, "options");
        aim.e eVarB = u.b();
        if (options.f103419a) {
            eVarB.add(b("LIST_ID_JOINT_ACCOUNT", R$drawable.uikit_icn_24_joint, new TextLocalisedClause(R$string.family_plans_more_for_family_item_joint_account_title, null, null, 14), new TextLocalisedClause(R$string.family_plans_more_for_family_item_joint_account_subtitle, null, null, 14), MoreForFamilyScreenContract$ClickParcel.JointAccounts.f103422a));
        }
        MoreForFamilyScreenContract$JointSavingsAvailability moreForFamilyScreenContract$JointSavingsAvailability = options.f103420b;
        boolean z = moreForFamilyScreenContract$JointSavingsAvailability instanceof MoreForFamilyScreenContract$JointSavingsAvailability.CreationAvailable;
        MoreForFamilyScreenContract$JointSavingsAvailability.NotAvailable notAvailable = MoreForFamilyScreenContract$JointSavingsAvailability.NotAvailable.f103430a;
        if (z || (moreForFamilyScreenContract$JointSavingsAvailability instanceof MoreForFamilyScreenContract$JointSavingsAvailability.HasActiveAccounts)) {
            int i = R$drawable.uikit_icn_24_vault;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.family_plans_more_for_family_item_joint_savings_title, null, null, 14);
            if (z) {
                textLocalisedQuantityClause = new TextLocalisedClause(R$string.family_plans_more_for_family_item_joint_savings_subtitle, u.c(((MoreForFamilyScreenContract$JointSavingsAvailability.CreationAvailable) moreForFamilyScreenContract$JointSavingsAvailability).f103427a), null, 12);
            } else {
                if (!(moreForFamilyScreenContract$JointSavingsAvailability instanceof MoreForFamilyScreenContract$JointSavingsAvailability.HasActiveAccounts)) {
                    if (Intrinsics.f(moreForFamilyScreenContract$JointSavingsAvailability, notAvailable)) {
                        throw new IllegalStateException("Not reachable");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = R$plurals.family_plans_more_for_family_item_subtitle_linked_accounts;
                int i3 = ((MoreForFamilyScreenContract$JointSavingsAvailability.HasActiveAccounts) moreForFamilyScreenContract$JointSavingsAvailability).f103428a;
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(i2, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), (Style) null, 24);
            }
            eVarB.add(b("LIST_ID_JOINT_SAVINGS", i, textLocalisedClause2, textLocalisedQuantityClause, new MoreForFamilyScreenContract$ClickParcel.JointSavings(moreForFamilyScreenContract$JointSavingsAvailability)));
        } else if (!Intrinsics.f(moreForFamilyScreenContract$JointSavingsAvailability, notAvailable)) {
            throw new NoWhenBranchMatchedException();
        }
        MoreForFamilyScreenContract$KidsAccountAvailability moreForFamilyScreenContract$KidsAccountAvailability = options.f103421c;
        boolean z3 = moreForFamilyScreenContract$KidsAccountAvailability instanceof MoreForFamilyScreenContract$KidsAccountAvailability.ActiveAccounts;
        if (z3 || (moreForFamilyScreenContract$KidsAccountAvailability instanceof MoreForFamilyScreenContract$KidsAccountAvailability.CreationAvailable)) {
            int i5 = R$drawable.uikit_icn_24_backpack;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.family_plans_more_for_family_item_kids_account_title, null, null, 14);
            if (z3) {
                int i6 = R$plurals.family_plans_more_for_family_item_subtitle_linked_accounts;
                int i21 = ((MoreForFamilyScreenContract$KidsAccountAvailability.ActiveAccounts) moreForFamilyScreenContract$KidsAccountAvailability).f103431a;
                textLocalisedClause = new TextLocalisedQuantityClause(i6, Integer.valueOf(i21), u.c(Integer.valueOf(i21)), (Style) null, 24);
            } else {
                if (!(moreForFamilyScreenContract$KidsAccountAvailability instanceof MoreForFamilyScreenContract$KidsAccountAvailability.CreationAvailable)) {
                    if (moreForFamilyScreenContract$KidsAccountAvailability instanceof MoreForFamilyScreenContract$KidsAccountAvailability.NotAvailable) {
                        throw new IllegalStateException("Not reachable");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.family_plans_more_for_family_item_kids_account_subtitle, null, null, 14);
            }
            eVarB.add(b("LIST_ID_KIDS_ACCOUNT", i5, textLocalisedClause3, textLocalisedClause, new MoreForFamilyScreenContract$ClickParcel.KidsAccount(moreForFamilyScreenContract$KidsAccountAvailability)));
        } else if (!Intrinsics.f(moreForFamilyScreenContract$KidsAccountAvailability, MoreForFamilyScreenContract$KidsAccountAvailability.NotAvailable.f103434a)) {
            throw new NoWhenBranchMatchedException();
        }
        MoreForFamilyScreenContract$KidsSavingsAvailability moreForFamilyScreenContract$KidsSavingsAvailability = options.d;
        boolean z4 = moreForFamilyScreenContract$KidsSavingsAvailability instanceof MoreForFamilyScreenContract$KidsSavingsAvailability.CreationAvailable;
        MoreForFamilyScreenContract$KidsSavingsAvailability.NotAvailable notAvailable2 = MoreForFamilyScreenContract$KidsSavingsAvailability.NotAvailable.f103440a;
        if (z4 || (moreForFamilyScreenContract$KidsSavingsAvailability instanceof MoreForFamilyScreenContract$KidsSavingsAvailability.HasActiveAccounts)) {
            int i22 = R$drawable.uikit_icn_24_savings_vault;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.family_plans_more_for_family_item_kids_savings_title, null, null, 14);
            if (z4) {
                textLocalisedQuantityClause2 = new TextLocalisedClause(R$string.family_plans_more_for_family_item_kids_savings_subtitle, u.c(((MoreForFamilyScreenContract$KidsSavingsAvailability.CreationAvailable) moreForFamilyScreenContract$KidsSavingsAvailability).f103435a), null, 12);
            } else {
                if (!(moreForFamilyScreenContract$KidsSavingsAvailability instanceof MoreForFamilyScreenContract$KidsSavingsAvailability.HasActiveAccounts)) {
                    if (Intrinsics.f(moreForFamilyScreenContract$KidsSavingsAvailability, notAvailable2)) {
                        throw new IllegalStateException("Not reachable");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i32 = R$plurals.family_plans_more_for_family_item_subtitle_linked_accounts;
                int i33 = ((MoreForFamilyScreenContract$KidsSavingsAvailability.HasActiveAccounts) moreForFamilyScreenContract$KidsSavingsAvailability).f103437a;
                textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(i32, Integer.valueOf(i33), u.c(Integer.valueOf(i33)), (Style) null, 24);
            }
            eVarB.add(b("LIST_ID_KIDS_SAVINGS", i22, textLocalisedClause4, textLocalisedQuantityClause2, new MoreForFamilyScreenContract$ClickParcel.KidsSavings(moreForFamilyScreenContract$KidsSavingsAvailability)));
        } else if (!Intrinsics.f(moreForFamilyScreenContract$KidsSavingsAvailability, notAvailable2)) {
            throw new NoWhenBranchMatchedException();
        }
        return u.a(eVarB);
    }

    public static RowDelegate.Model b(String str, int i, TextLocalisedClause textLocalisedClause, Clause clause, MoreForFamilyScreenContract$ClickParcel moreForFamilyScreenContract$ClickParcel) {
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
        yy0.i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, clause, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, moreForFamilyScreenContract$ClickParcel, null, 0, 0, 0, 0, 532675544);
    }
}
