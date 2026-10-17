package gf7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.incentive_reward.impl.R$string;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f143354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f143355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CdnImage f143356c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;

    public c(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D325", null, null, null, 30);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.incentive_reward_add_money_prompt_cashback_action_primary, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.incentive_reward_add_money_prompt_cashback_action_secondary, null, null, 14);
        this.f143354a = textLocalisedClause;
        this.f143355b = textLocalisedClause2;
        this.f143356c = cdnImageC;
        this.d = textLocalisedClause3;
        this.e = textLocalisedClause4;
    }
}
