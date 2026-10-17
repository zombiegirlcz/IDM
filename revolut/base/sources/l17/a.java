package l17;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import dj0.d;
import do3.n;
import f01.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f191480a;

    public a(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f191480a = uiKitResources;
    }

    public final String a(n user, d dVar, String paymentLink) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        return this.f191480a.b(dVar != null ? new TextLocalisedClause(R$string.freelancer_sale_payment_link_share_message, v.k(new TextClause(w.I(user), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(paymentLink, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.freelancer_sale_payment_link_share_no_amount_message, v.k(new TextClause(w.I(user), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(paymentLink, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString();
    }
}
