package eof;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import ip0.y10;
import java.util.List;
import mx0.d;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static sa a(Clause clause, TextLocalisedClause textLocalisedClause) {
        String str = "CryptoDepositTransactionDetails_ReturnDepositBanner_Action_Return";
        sa saVar = new sa("CryptoDepositTransactionDetails_ReturnDepositBanner", (Clause) textLocalisedClause, clause, u.c(new ActionsView.Item(str, d.ACCENT, false, null, null, new TextLocalisedClause(R$string.transaction_details_cryptodeposit_transfer_deposit_reverted_return_deposit_subtitle, null, null, 14), null, null, null, null, false, "CryptoDepositTransactionDetails_ReturnDepositBanner_Action_Return_LoadingTag", null, null, null, 30620)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }
}
