package k3e;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.store.api.model.StoreCampaignBadge;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static TagViewData a(StoreCampaignBadge storeCampaignBadge) {
        int i;
        int i2;
        Integer numValueOf = null;
        if (storeCampaignBadge != null) {
            t1e.c cVar = storeCampaignBadge.f88436a;
            int[] iArr = c.f180707a;
            switch (iArr[cVar.ordinal()]) {
                case 1:
                case 6:
                    storeCampaignBadge = null;
                case 2:
                case 3:
                case 4:
                case 5:
                    if (storeCampaignBadge != null) {
                        String str = storeCampaignBadge.f88437b;
                        t1e.c cVar2 = storeCampaignBadge.f88436a;
                        if (iArr[cVar2.ordinal()] == 3) {
                            return TagViewData.Companion.f(TagViewData.INSTANCE, str, 4);
                        }
                        TagViewData.Companion companion = TagViewData.INSTANCE;
                        int i3 = iArr[cVar2.ordinal()];
                        if (i3 == 1) {
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cashback);
                        } else if (i3 == 2) {
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_revpoints);
                        } else if (i3 == 4) {
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_price_tag);
                        } else if (i3 == 5) {
                            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_calendar_date);
                        }
                        switch (iArr[cVar2.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                                i = R$attr.uikit_colorWhite_70;
                                break;
                            case 5:
                                i = R$attr.uikit_colorPopoverBackground;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        switch (iArr[cVar2.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                                i2 = R$attr.uikit_colorBlack;
                                break;
                            case 5:
                                i2 = R$attr.uikit_colorOnAccent;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        companion.getClass();
                        return TagViewData.Companion.c(str, i, i2, numValueOf);
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
