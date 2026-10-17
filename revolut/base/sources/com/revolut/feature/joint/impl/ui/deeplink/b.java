package com.revolut.feature.joint.impl.ui.deeplink;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static PromptContentDelegate.Model a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, CdnImage cdnImage, boolean z) {
        return new PromptContentDelegate.Model("JOINT_INVITE_DEEPLINK_PROMPT_ID", textLocalisedClause, textLocalisedClause2, null, new ad(cdnImage, false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, z ? new TextLocalisedClause(R.string.common_action_got_it, null, null, 14) : new TextLocalisedClause(R$string.joint_home_invitation_prompt_action_open_a_joint_account, null, null, 14), !z ? new TextLocalisedClause(R.string.common_action_got_it, null, null, 14) : null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536869320);
    }
}
