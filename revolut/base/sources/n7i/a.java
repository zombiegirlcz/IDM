package n7i;

import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.z0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements w5i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f213100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7i.w f213101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7i.h f213102c;
    public final Set d;

    public a(gte.a featureToggleInteractor, r7i.w spotMarginCollateralEligibilityChecker, r7i.h futuresCollateralEligibilityChecker) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(spotMarginCollateralEligibilityChecker, "spotMarginCollateralEligibilityChecker");
        Intrinsics.checkNotNullParameter(futuresCollateralEligibilityChecker, "futuresCollateralEligibilityChecker");
        this.f213100a = featureToggleInteractor;
        this.f213101b = spotMarginCollateralEligibilityChecker;
        this.f213102c = futuresCollateralEligibilityChecker;
        k1j.a[] elements = {k1j.a.REV_POINTS_POCKETS, k1j.a.POCKETS, k1j.a.VAULTS, k1j.a.SAVINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
    }

    public final HashSet a(j8l.a accountType, x5i.d destinationType) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(accountType, "oppositeAccountType");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Set setB = b();
        HashSet hashSet = new HashSet();
        for (Object obj2 : setB) {
            k1j.a group = (k1j.a) obj2;
            j8l.a aVar = j8l.a.SPOT_MARGIN_COLLATERAL;
            r7i.w wVar = this.f213101b;
            if (accountType == aVar) {
                Intrinsics.checkNotNullParameter(group, "group");
                zContains = wVar.f252254b.contains(group);
            } else {
                j8l.a aVar2 = j8l.a.FUTURES_COLLATERAL;
                r7i.h hVar = this.f213102c;
                if (accountType == aVar2) {
                    Intrinsics.checkNotNullParameter(group, "group");
                    zContains = hVar.f252219b.contains(group);
                } else if (group == k1j.a.SPOT_MARGIN_COLLATERAL) {
                    Intrinsics.checkNotNullParameter(accountType, "accountType");
                    zContains = wVar.f252253a.contains(accountType);
                } else if (group == k1j.a.FUTURES_COLLATERAL) {
                    Intrinsics.checkNotNullParameter(accountType, "accountType");
                    zContains = hVar.f252218a.contains(accountType);
                } else {
                    j8l.a aVar3 = j8l.a.REV_POINTS_POCKET;
                    Set set = this.d;
                    zContains = accountType == aVar3 ? set.contains(group) : group == k1j.a.REV_POINTS_POCKETS ? set.contains(yoj.b.y(accountType)) : true;
                }
            }
            if (zContains) {
                hashSet.add(obj2);
            }
        }
        return hashSet;
    }

    public final Set b() {
        k1j.a aVar = k1j.a.POCKETS;
        k1j.a aVar2 = k1j.a.JOINT_ACCOUNT;
        k1j.a aVar3 = k1j.a.JOINT_SAVINGS;
        k1j.a aVar4 = k1j.a.JOINT_VAULTS;
        k1j.a aVar5 = k1j.a.PRO;
        k1j.a aVar6 = k1j.a.PRO_VAULTS;
        k1j.a aVar7 = k1j.a.VAULTS;
        k1j.a aVar8 = k1j.a.SAVINGS;
        k1j.a aVar9 = k1j.a.CRYPTO;
        k1j.a aVar10 = k1j.a.REVOLUT_X_FIAT;
        k1j.a aVar11 = k1j.a.CREDIT_CARDS;
        k1j.a aVar12 = k1j.a.REV_POINTS_POCKETS;
        k1j.a aVar13 = k1j.a.YOUTH_POCKETS;
        k1j.a aVar14 = k1j.a.YOUTH_VAULTS;
        k1j.a aVar15 = k1j.a.YOUTH_SAVINGS;
        k1j.a aVar16 = k1j.a.TRADING_ACCOUNTS;
        k1j.a aVar17 = k1j.a.JOINT_TRADING_ACCOUNTS;
        k1j.a aVar18 = k1j.a.SPOT_MARGIN_COLLATERAL;
        k1j.a aVar19 = k1j.a.FUTURES_COLLATERAL;
        k1j.a aVar20 = k1j.a.TEEN_POCKETS;
        TeenAccountsApi$Toggles$TeenGuardianHub teenAccountsApi$Toggles$TeenGuardianHub = TeenAccountsApi$Toggles$TeenGuardianHub.f90321c;
        jte.d dVar = (jte.d) this.f213100a;
        if (!dVar.c(teenAccountsApi$Toggles$TeenGuardianHub)) {
            aVar20 = null;
        }
        k1j.a aVar21 = k1j.a.TEEN_VAULTS;
        if (!dVar.c(teenAccountsApi$Toggles$TeenGuardianHub)) {
            aVar21 = null;
        }
        return z0.i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, dVar.c(FeatureWealthApi$Toggles.CommoditiesMoveMoney.f95156c) ? k1j.a.COMMODITIES : null);
    }
}
