package x5k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends s {
    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof f);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    public f(int i) {
        super(new TextLocalisedClause(R$string.payments_quick_actions_edit_revtag_title, null, null, 14), new TextLocalisedClause(R$string.payments_quick_actions_edit_revtag_subtitle, null, null, 14), h5k.a.a(R$drawable.uikit_icn_24_logo_revolut), "EDIT_REV_TAG");
    }
}
