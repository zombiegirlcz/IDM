package tc7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f269578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f269579b;

    static {
        String[] elements = {"EsimHomeSmall", "EsimHomeMedium", "TransfersSmall", "TransfersMedium", "AnalyticsSmall", "AnalyticsMedium", "NearbyRewardsMedium", "SavingsSmall", "ATMSmall", "ATMMedium", "CashbackLarge", "CardsSmall", "CardsMedium", "AddNewProductDynamic"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f269578a = kotlin.collections.d.y0(elements);
        String[] elements2 = {"TotalWealthSmall", "TotalWealthItems"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f269579b = kotlin.collections.d.y0(elements2);
    }

    private b() {
    }
}
