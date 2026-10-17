package sud;

import aw0.e;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$EarnRateParcel;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$NoTiersParcel;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.feature.staking.impl.earndialog.details.TiersRateDialogController;
import com.revolut.feature.staking.impl.earndialog.flexible.FlexibleEarnRatesDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f265718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f265719b;

    public b(a earnRateBottomSheetProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(earnRateBottomSheetProvider, "earnRateBottomSheetProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f265718a = earnRateBottomSheetProvider;
        this.f265719b = featureToggleInteractor;
    }

    public final BaseBottomSheetController a(TiersRateItemMapper$Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof TiersRateItemMapper$EarnRateParcel) {
            StakingProduct stakingProduct = ((TiersRateItemMapper$EarnRateParcel) parcel).f88100a;
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            return new TiersRateDialogController(new tud.b(stakingProduct));
        }
        if (!(parcel instanceof TiersRateItemMapper$NoTiersParcel)) {
            throw new NoWhenBranchMatchedException();
        }
        TiersRateItemMapper$NoTiersParcel tiersRateItemMapper$NoTiersParcel = (TiersRateItemMapper$NoTiersParcel) parcel;
        wi0.b bVar = tiersRateItemMapper$NoTiersParcel.f88103b;
        StakingProduct stakingProduct2 = tiersRateItemMapper$NoTiersParcel.f88102a;
        if (!((d) this.f265719b).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) || !stakingProduct2.b() || !stakingProduct2.c()) {
            return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.staking_earn_rate_dialog_title, null, null, 14), new TextLocalisedClause(com.bumptech.glide.d.q(bVar) ? R$string.staking_earn_rate_dialog_disclaimer : R$string.staking_earn_rate_dialog_subtitle, null, null, 14), null, null, false, 28), new e(false, null, null, new n6(new TextLocalisedClause(R$string.staking_earn_rate_dialog_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55), this.f265718a.f265717a, null, null, 24));
        }
        Intrinsics.checkNotNullParameter(stakingProduct2, "stakingProduct");
        return new FlexibleEarnRatesDialogController(new uud.b(stakingProduct2, bVar));
    }
}
