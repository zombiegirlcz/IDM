package zs2;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.retail.feature.business.referrals.shared.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f324788a;

    public c(vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f324788a = resourceProvider;
    }

    public final ShotDialogDisplayer$Configuration a() {
        return ShotDialogDisplayer$Configuration.Companion.e(ShotDialogDisplayer$Configuration.INSTANCE, "COPIED_TO_CLIPBOARD_ID", new TextLocalisedClause(R$string.business_referrals_invite_contacts_toast_copied, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 44);
    }

    public final PermissionsControllerContract$Explanation.PromptScreen b() {
        vu.f fVar = vu.f.business_referrals_invite_contacts_no_permission_prompt_title;
        n5j.b bVar = (n5j.b) this.f324788a;
        return new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(bVar.b(fVar), null, null, 14), new TextLocalisedClause(bVar.b(vu.f.business_referrals_invite_contacts_no_permission_prompt_subtitle), null, null, 14), new TextLocalisedClause(bVar.b(vu.f.business_referrals_invite_contacts_no_permission_prompt_action), null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30), null);
    }
}
