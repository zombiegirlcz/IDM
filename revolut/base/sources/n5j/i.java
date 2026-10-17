package n5j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralReward;
import com.revolut.feature.referrals.common.data.api.domain.model.common.RewardInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mwa.b f212624a;

    public i(mwa.b inviteCampaignRepository) {
        Intrinsics.checkNotNullParameter(inviteCampaignRepository, "inviteCampaignRepository");
        this.f212624a = inviteCampaignRepository;
    }

    public static final w a(i iVar, ReferralCampaignV4 referralCampaignV4, int i) {
        iVar.getClass();
        RewardInfo rewardInfo = referralCampaignV4.u;
        if (rewardInfo == null) {
            return null;
        }
        TextClause textClause = new TextClause(rewardInfo.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        ReferralReward referralReward = rewardInfo.f81775c;
        return new w(textClause, textLocalisedClause, referralReward != null ? referralReward.f81769a : null);
    }
}
