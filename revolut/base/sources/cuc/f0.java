package cuc;

import auc.a1;
import auc.t0;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.api.models.WealthProtectionSuggestedAmount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {
    public static WealthProtectionFeatureDetails a(a1 dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        xi0.a aVar = xi0.b.Companion;
        String currency = dto.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        Long minimumAmount = dto.getMinimumAmount();
        dj0.d dVar = minimumAmount != null ? new dj0.d(minimumAmount.longValue(), bVarA) : null;
        t0 suggestedAmount = dto.getSuggestedAmount();
        WealthProtectionSuggestedAmount wealthProtectionSuggestedAmountS = suggestedAmount != null ? boh.f.s(suggestedAmount, bVarA) : null;
        boolean enabled = dto.getEnabled();
        if (!enabled) {
            return new WealthProtectionFeatureDetails.Disabled(dto.getName(), bVarA, dVar, wealthProtectionSuggestedAmountS);
        }
        if (!enabled) {
            throw new NoWhenBranchMatchedException();
        }
        String name = dto.getName();
        auc.e dailyAllowance = dto.getDailyAllowance();
        if (dailyAllowance == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dj0.d dVar2 = new dj0.d(dailyAllowance.getMaxAmount(), bVarA);
        auc.e dailyAllowance2 = dto.getDailyAllowance();
        if (dailyAllowance2 != null) {
            return new WealthProtectionFeatureDetails.Enabled(name, dVar2, new dj0.d(dailyAllowance2.getUsedAmount(), bVarA), dVar, wealthProtectionSuggestedAmountS);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
