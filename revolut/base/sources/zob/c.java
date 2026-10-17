package zob;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;
import rkb.d;
import vlb.e;
import xob.o;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final apb.c f323952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.retail.savings.impl.common.product_info.a f323953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f323954c;
    public final gte.a d;

    public c(apb.c detailsSectionItemsMapper, com.revolut.feature.retail.savings.impl.common.product_info.a extraProductInformationItemMapper, rkb.b extraProductInformationItemMapperRevamp, d generalSectionItemsMapper, k48.a partnerSectionItemsMapper, bpb.a juniorSectionsProvider, e onboardingRevampAvailabilityProvider, gte.a featureToggleInteractor, hqb.a savingsUpgradeBannerFactory) {
        Intrinsics.checkNotNullParameter(detailsSectionItemsMapper, "detailsSectionItemsMapper");
        Intrinsics.checkNotNullParameter(extraProductInformationItemMapper, "extraProductInformationItemMapper");
        Intrinsics.checkNotNullParameter(extraProductInformationItemMapperRevamp, "extraProductInformationItemMapperRevamp");
        Intrinsics.checkNotNullParameter(generalSectionItemsMapper, "generalSectionItemsMapper");
        Intrinsics.checkNotNullParameter(partnerSectionItemsMapper, "partnerSectionItemsMapper");
        Intrinsics.checkNotNullParameter(juniorSectionsProvider, "juniorSectionsProvider");
        Intrinsics.checkNotNullParameter(onboardingRevampAvailabilityProvider, "onboardingRevampAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(savingsUpgradeBannerFactory, "savingsUpgradeBannerFactory");
        this.f323952a = detailsSectionItemsMapper;
        this.f323953b = extraProductInformationItemMapper;
        this.f323954c = onboardingRevampAvailabilityProvider;
        this.d = featureToggleInteractor;
    }

    public static RowDelegate.Model a(SavingsChallenge savingsChallenge) {
        return frg.a.b(new RowDelegate.Model("CHALLENGE_DETAILS_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_entertainment, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.savings_challenge_details_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new rkb.c(savingsChallenge.i), null, 0, 0, 0, 0, 532676600));
    }

    public static CompositeClause b(s sVar) {
        return new CompositeClause(v.k(new TextClause(sVar.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(sVar.getCurrency(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
    }

    public static RowDelegate.Model c(SavingsProductData savingsProductData, xme.e eVar) {
        xme.d dVar = eVar instanceof xme.d ? (xme.d) eVar : null;
        if (dVar == null || !dVar.f307231c) {
            return null;
        }
        boolean z = dVar.f307229a;
        return frg.a.b(new RowDelegate.Model("TAX_EXEMPTION_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cash_blocked, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.savings_details_tax_exemption, null, null, 14), null, 0, z ? new TextLocalisedClause(R$string.savings_details_tax_exemption_tin_progress, null, null, 14) : null, null, null, 0, null, !z, null, false, z ? RowDelegate.Model.b.a.f53266a : RowDelegate.Model.b.c.f53268a, null, null, null, null, null, z ? null : new o(savingsProductData.f86683a.f86619c), null, 0, 0, 0, 0, 532658136));
    }

    public static List d(TextLocalisedClause textLocalisedClause, String str, List list) {
        ArrayList arrayListG = !list.isEmpty() ? yp0.b.g(list, new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : null;
        return arrayListG == null ? list : arrayListG;
    }
}
