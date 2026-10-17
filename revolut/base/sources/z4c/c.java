package z4c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolut_x_balances.api.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionsView.Item f319367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f319368b;

    public c() {
        mx0.d dVar = mx0.d.SEMIACCENT;
        this.f319367a = new ActionsView.Item("DEPOSIT_ACTION_ID", dVar, false, null, null, new TextLocalisedClause(R$string.crypto_revx_fiat_pocket_details_deposit_action_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
        this.f319368b = new ActionsView.Item("WITHDRAW_ACTION_ID", dVar, false, null, null, new TextLocalisedClause(R$string.crypto_revx_fiat_pocket_details_withdraw_action_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
    }
}
