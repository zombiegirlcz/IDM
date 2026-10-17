package x5k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends s {
    public final String f;

    public q(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_quick_actions_share_link_title, u.c("revolut.me"), null, 12);
        int i = R$string.payments_quick_actions_share_link_subtitle;
        s.Companion.getClass();
        Intrinsics.checkNotNullParameter(username, "username");
        super(textLocalisedClause, new TextLocalisedClause(i, u.c("revolut.me/" + username), null, 12), h5k.a.a(R$drawable.uikit_icn_24_share_android), "PAYMENT_LINK_SHARE");
        this.f = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f, ((q) obj2).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
