package ajk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import hha.w0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f5589a;

    public d(q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f5589a = deeplinkParser;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final PlanBottomSheetDeeplinkNavigation a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        HashMap map = deeplink.d;
        if (Intrinsics.f(strE, "plan")) {
            String strE2 = deeplink.e(2);
            if (!Intrinsics.f(strE2, "bottom-sheet")) {
                if (Intrinsics.f(strE2, "fe-bottom-sheet")) {
                    String strE3 = deeplink.e(3);
                    switch (strE3.hashCode()) {
                        case -1670879431:
                            if (strE3.equals("crypto-fees")) {
                                String str = (String) map.get("tierCode");
                                return new igk.d(new PricingPlanBottomSheetDescriptor.CryptoExchangeFees(str != null ? cp5.d.I(w0.Companion, str) : null));
                            }
                            break;
                        case -727805318:
                            if (strE3.equals("savings-accounts")) {
                                String strE4 = deeplink.e(4);
                                if (Intrinsics.f(strE4, "mmf")) {
                                    return PlanBottomSheetDeeplinkNavigation.SavingsAccounts.MMF.f102907a;
                                }
                                if (Intrinsics.f(strE4, "savings")) {
                                    return PlanBottomSheetDeeplinkNavigation.SavingsAccounts.Savings.f102908a;
                                }
                            }
                            break;
                        case -334385437:
                            if (strE3.equals("rev-points-cards")) {
                                String strE5 = deeplink.e(4);
                                if (Intrinsics.f(strE5, "credit")) {
                                    return PlanBottomSheetDeeplinkNavigation.RevPointsCards.Credit.f102905a;
                                }
                                if (Intrinsics.f(strE5, "debit")) {
                                    return PlanBottomSheetDeeplinkNavigation.RevPointsCards.Debit.f102906a;
                                }
                            }
                            break;
                        case 1189002411:
                            if (strE3.equals("partners") && deeplink.e(4).length() > 0) {
                                return new igk.d(new PricingPlanBottomSheetDescriptor.PartnerOfferDetail(deeplink.e(4)));
                            }
                            break;
                    }
                }
            } else {
                String strE6 = deeplink.e(3);
                if (strE6.length() != 0) {
                    String str2 = (String) map.get("entryPoint");
                    if (map.isEmpty()) {
                        map = null;
                    }
                    return new igk.d(new PricingPlanBottomSheetDescriptor.BottomSheet(strE6, str2, map != null ? new PricingPlanBottomSheetDescriptor.BottomSheet.Params(map) : null));
                }
            }
        }
        return null;
    }
}
