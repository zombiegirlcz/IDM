package uc5;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u4i.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f278992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.g f278993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f278994c;

    public f(b inputData, thf.g transactionItemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f278992a = inputData;
        this.f278993b = transactionItemMapper;
        this.f278994c = dateProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        StakingPocket stakingPocket = this.f278992a.f278989a;
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.crypto_asset_details_staking_first_reward_info_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), (List) iii.c.f(domainState.f278988a, new u8c.c(26), new u(21), new tch.c(this, 26)), new lw0.a(new TextLocalisedClause(R$string.crypto_asset_details_locked_balance_info_title, null, null, 14), new TextLocalisedClause(R$string.crypto_asset_details_locked_balance_info_description_v2, zhm.u.c(Integer.valueOf(stakingPocket.f88082b.f88087b.f88062c)), null, 12), null, null, false, 28));
    }
}
