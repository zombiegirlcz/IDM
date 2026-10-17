package uud;

import aw0.m6;
import aw0.n6;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f283211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttd.a f283212b;

    public e(b inputData, ttd.a stakingInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        this.f283211a = inputData;
        this.f283212b = stakingInterestRateFormatter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = this.f283211a;
        StakingProduct stakingProduct = bVar.f283207a;
        aim.e eVarB = u.b();
        StakingModes.Auto auto = stakingProduct.f88088c.f88072b;
        ttd.a aVar = this.f283212b;
        if (auto != null) {
            eVarB.add(new CellDetailsDelegate.Model("AUTO_EARN_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.crypto_staking_rate_info_dialog_autoEarn, null, null, 14), (Image) null, 0, false, 30), ((wud.b) aVar).b(auto.f88073a, true), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        StakingModes.Manual manual = stakingProduct.f88088c.f88071a;
        if (manual != null) {
            eVarB.add(new CellDetailsDelegate.Model("MANUAL_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.crypto_staking_rate_info_dialog_lockedEarn, null, null, 14), (Image) null, 0, false, 30), ((wud.b) aVar).b(manual.f88076a, true), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, new TextLocalisedClause(com.bumptech.glide.d.q(bVar.f283208b) ? R$string.staking_earn_rate_dialog_disclaimer : R$string.staking_earn_rate_dialog_subtitle, null, null, 14), null, m6.c(n6.Companion, new TextLocalisedClause(R$string.crypto_staking_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, null, 1020), null, null, 53), eVarA, new lw0.a(new TextLocalisedClause(R$string.staking_tier_rates_dialog_title, null, null, 14), new TextLocalisedClause(R$string.crypto_staking_rate_info_dialog_description, null, null, 14), null, null, false, 28));
    }
}
