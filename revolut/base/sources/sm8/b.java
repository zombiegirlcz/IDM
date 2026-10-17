package sm8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_rewards.impl.R$string;
import java.util.List;
import mii.f;
import org.jetbrains.annotations.NotNull;
import rp0.f1;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static f a() {
        return new f("PERK_NOTIFICATION_ID", new TextLocalisedClause(R$string.junior_rewards_reward_details_reminder_sent_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), f1.ABOVE_ANCHOR_VIEW, null, 76);
    }
}
