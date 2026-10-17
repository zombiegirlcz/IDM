package cqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.l;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f108076a;

    public b(dcd.b savingsRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsRateFormatter, "savingsRateFormatter");
        this.f108076a = savingsRateFormatter;
    }

    public static RowDelegate.Model b(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i, mqd.i iVar) {
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
        yy0.i iVar2 = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar2.getClass();
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532675544);
    }

    public final TextLocalisedClause a(SavingsProductData savingsProductData) {
        return new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_savings_description, v.k(this.f108076a.k(savingsProductData, null), savingsProductData.f86683a.f86621h.f86645b.f86648b), null, 12);
    }

    public final ArrayList c(List items) {
        RowDelegate.Model modelB;
        Intrinsics.checkNotNullParameter(items, "items");
        List<mqd.i> list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (mqd.i iVar : list) {
            if (iVar instanceof mqd.g) {
                modelB = b("CREATE_SAVINGS_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_savings_title, null, null, 14), a(((mqd.g) iVar).f207981a), R$drawable.uikit_icn_24_vault, iVar);
            } else if (iVar instanceof mqd.c) {
                modelB = b("CREATE_JOINT_SAVINGS_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_joint_savings_title, null, null, 14), a(((mqd.c) iVar).f207976b), R$drawable.uikit_icn_24_vault, iVar);
            } else if (iVar instanceof mqd.h) {
                modelB = b("CREATE_SUBACCOUNT_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_pockets_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_pockets_description, null, null, 14), R$drawable.uikit_icn_24_wallet, iVar);
            } else if (iVar instanceof mqd.f) {
                modelB = b("CREATE_PERSONAL_SUBACCOUNT_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_pockets_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_pockets_description, null, null, 14), R$drawable.uikit_icn_24_wallet, iVar);
            } else if (iVar instanceof mqd.a) {
                modelB = b("CREATE_INVESTMENT_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_investing_titile, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_pockets_description, null, null, 14), R$drawable.uikit_icn_24_invest, iVar);
            } else if (iVar instanceof mqd.e) {
                modelB = b("CREATE_PERSONAL_JISA_INVESTMENT_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_investing_titile, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_investing_description, null, null, 14), R$drawable.uikit_icn_24_invest, iVar);
            } else if (iVar instanceof mqd.d) {
                modelB = b("CREATE_JOINT_SUBACCOUNT_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_joint_pockets_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_joint_pockets_description, null, null, 14), R$drawable.uikit_icn_24_wallet, iVar);
            } else {
                if (!(iVar instanceof mqd.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                modelB = b("CREATE_JOINT_ID", new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_joint_accounts_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_empty_joint_accounts_description, null, null, 14), R$drawable.uikit_icn_24_joint, iVar);
            }
            arrayList.add(modelB);
        }
        return arrayList;
    }
}
