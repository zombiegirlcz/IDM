package nb3;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    public final PermissionsFlowContract$Explanation.PromptScreen a() {
        return new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.topup_cash_location_access_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_location_access_description, null, null, 14), new TextLocalisedClause(R$string.topup_cash_location_access_go_to_settings, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D025", null, null, null, 30), (TextClause) null, 48);
    }
}
