package x5k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends s {

    @NotNull
    public static final g Companion = new g();
    public final Clause f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Clause subtitleClause) {
        super(new TextLocalisedClause(R$string.referrals_search_quick_action_title, null, null, 14), subtitleClause, h5k.a.a(R$drawable.uikit_icn_24_envelope), "INVITE_A_FRIEND");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        this.f = subtitleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f, ((h) obj2).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
