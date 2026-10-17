package m37;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private c() {
    }

    public static d a(TextLocalisedClause title, TextLocalisedClause caption) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        return new d(new TextLocalisedClause(R$string.freelancer_tax_profile_payment_breakdown_header_title, u.c(title), null, 12), caption);
    }
}
