package fg8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_deeplink.impl.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static StatusViewConfiguration.Error a() {
        return new StatusViewConfiguration.Error("JUNIOR_CREATION_UNAVAILABLE_DIALOG_ID", new TextLocalisedClause(R$string.junior_deeplink_creation_unavailable_dialog_title, null, null, 14), null, null, null, null, null, 8188);
    }
}
