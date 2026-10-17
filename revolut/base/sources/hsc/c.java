package hsc;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.sca_prompt.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public final ShotDialogDisplayer$Configuration a() {
        return ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "SCA_PROMPT_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.crypto_sca_prompt_success, null, null, 14), null, null, null, 60);
    }

    public final TextLocalisedClause b(String legalEntityId) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        int i = b.f155029a[msc.a.a(legalEntityId).ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.crypto_sca_prompt_success, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.stocks_sca_prompt_success_rseuab, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_sca_prompt_success_revolut_ltd, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.wealth_sca_prompt_success_revolut_trading_ltd, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
