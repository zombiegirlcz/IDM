package luc;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {
    public static RowDelegate.Model a(int i, int i2, String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        boolean z = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), textLocalisedClause, null, 0, null, null, null, 0, new tf(new yy0.h(new TextLocalisedClause(i, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(a(R$string.security_hub_hidden_accounts_and_transactions_hidden_accounts_title, R$drawable.uikit_icn_24_wallet, "HIDDEN_ACCOUNTS_CELL_ID"), a(R$string.security_hub_hidden_accounts_and_transactions_hidden_transactions_title, R$drawable.uikit_icn_24_transfers, "HIDDEN_TRANSACTIONS_CELL_ID"), a(R$string.security_hub_hidden_accounts_and_transactions_secret_accounts_title, R$drawable.uikit_icn_24_lock_closed, "SECRET_ACCOUNTS_CELL_ID"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new i(new TextLocalisedClause(R$string.security_hub_home_hidden_accounts_and_transactions_title, null, null, 14), listK);
    }
}
