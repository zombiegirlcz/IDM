package huc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.security_hub.api.R$string;
import mii.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    public static final C0891a Companion = new C0891a();

    /* JADX INFO: renamed from: huc.a$a, reason: collision with other inner class name */
    public static final class C0891a {
        private C0891a() {
        }
    }

    public static k a(TextLocalisedClause textLocalisedClause) {
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.security_hub_transactions_limits_amount_updated, null, null, 14);
        }
        return new k("LIMIT_CHANGE_SUCCESS_SHOT_DIALOG_ID", textLocalisedClause, null, null, null, 28);
    }
}
