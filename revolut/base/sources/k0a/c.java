package k0a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.social.impl.R$string;
import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.g;
import zm3.l;
import zz9.p;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static TextLocalisedClause a(zm3.a contact, p state) {
        int i;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(state, "state");
        if (contact instanceof l) {
            i = (q.K((l) contact) || !state.d) ? R$string.social_payments_chat_empty_state_title_contact_non_revolut : R$string.social_payments_chat_empty_state_title_contact_revolut;
        } else {
            if (!(contact instanceof g) && !(contact instanceof zm3.p)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.social_payments_chat_empty_state_title_contact_non_revolut;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
