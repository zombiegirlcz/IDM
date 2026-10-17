package ljd;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.api.model.ShopsEarningRate;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import yv0.g;
import yv0.h;
import yv0.i;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: ljd.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1105b {

        /* JADX INFO: renamed from: ljd.b$b$a */
        public static final class a extends AbstractC1105b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f195652a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: ljd.b$b$b, reason: collision with other inner class name */
        public static final class C1106b extends AbstractC1105b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1106b f195653a = new C1106b();

            private C1106b() {
            }
        }

        private AbstractC1105b() {
        }
    }

    public static yv0.f a(EarningBadge earningBadge, Double d, boolean z) {
        if (!z || earningBadge == null || d == null) {
            return null;
        }
        return new yv0.f(new TextLocalisedClause(R$string.shops_common_revpoints_multiplier, u.c(nub.a.h(d.doubleValue(), null, null, 7)), null, 12), d.f195655b[earningBadge.f83945a.ordinal()] == 1 ? g.a.f317069a : new h(new Color.Solid(R$attr.uikit_colorBlack_90)), new Color.Solid(R$attr.uikit_colorWhite), new yv0.b(new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), true));
    }

    public static i b(AbstractC1105b container, ShopsCampaignOffer campaign, ShopsOutlet outlet, String str, float f, boolean z) {
        c cVar;
        int i;
        TextClause textClause;
        String str2;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(outlet, "outlet");
        ShopsCategory shopsCategory = campaign.f87034r;
        ShopsEarningRate shopsEarningRate = campaign.f87030m;
        EarningBadge earningBadge = campaign.f87031n;
        if (shopsCategory == null || (str2 = shopsCategory.f87040a) == null) {
            cVar = null;
        } else {
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                cVar = cVarArrValues[i2];
                if (a0.z(cVar.name(), str2, true)) {
                    break;
                }
            }
            cVar = null;
        }
        int i3 = cVar == null ? -1 : d.f195654a[cVar.ordinal()];
        int i5 = (i3 == 2 || i3 == 3) ? R$attr.uikit_colorTerracotta : R$attr.uikit_colorBlue;
        switch (cVar != null ? d.f195654a[cVar.ordinal()] : -1) {
            case -1:
                i = R$drawable.uikit_icn_24_lifestyle;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                i = R$drawable.uikit_icn_24_cinema;
                break;
            case 2:
                i = R$drawable.uikit_icn_24_groceries;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_restaurants;
                break;
            case 4:
                i = R$drawable.uikit_icn_24_utilities;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_shopping;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_suitcase;
                break;
            case 7:
                i = R$drawable.uikit_icn_24_spa;
                break;
            case 8:
                i = R$drawable.uikit_icn_24_lifestyle;
                break;
            case 9:
                i = R$drawable.uikit_icn_24_fashion;
                break;
            case 10:
                i = R$drawable.uikit_icn_24_smartphone;
                break;
            case 11:
                i = R$drawable.uikit_icn_24_heart;
                break;
            case 12:
                i = R$drawable.uikit_icn_24_premium;
                break;
            case 13:
                i = R$drawable.uikit_icn_24_merchant;
                break;
            case 14:
                i = R$drawable.uikit_icn_24_basketball;
                break;
            case 15:
                i = R$drawable.uikit_icn_24_entertainment;
                break;
            case 16:
                i = R$drawable.uikit_icn_24_puzzle;
                break;
        }
        int i6 = i;
        co3.a aVar = outlet.d;
        ah0.a aVar2 = new ah0.a(aVar.f25486a, aVar.f25487b);
        ResourceImage resourceImage = new ResourceImage(i6, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        if (container.equals(AbstractC1105b.a.f195652a)) {
            if (f >= 11.0f) {
                textClause = new TextClause(campaign.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            return new i(aVar2, new yv0.b(resourceImage, true), textClause, Intrinsics.f(outlet.f87056a, str), new Color.Solid(i5), new Color.Solid(R$attr.uikit_colorWhite), a(earningBadge, shopsEarningRate != null ? Double.valueOf(shopsEarningRate.f87045a) : null, z), outlet);
        }
        if (!container.equals(AbstractC1105b.C1106b.f195653a)) {
            throw new NoWhenBranchMatchedException();
        }
        yv0.b bVar = new yv0.b(resourceImage, true);
        m70.a.c(t0.f186434a);
        return new i(aVar2, bVar, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new Color.Solid(i5), new Color.Solid(R$attr.uikit_colorWhite), a(earningBadge, shopsEarningRate != null ? Double.valueOf(shopsEarningRate.f87045a) : null, z), outlet);
    }
}
