package im3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.impl.R$string;
import mii.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static k a(boolean z) {
        return new k("BLOCKED_USER_SUCCESS_TOAST_DIALOG_ID", new TextLocalisedClause(z ? R$string.toast_blocked_user_title : R$string.toast_unblocked_user_title, null, null, 14), null, null, null, 28);
    }
}
