package fnj;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.esim.impl.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        lw0.a aVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = h.f136692a[domainState.f136689a.ordinal()];
        if (i == 1) {
            aVar = new lw0.a(new TextLocalisedClause(R$string.esim_refund_totalSheet_title, null, null, 14), new TextLocalisedClause(R$string.esim_refund_totalSheet_subtitle, null, null, 14), null, null, false, 28);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new lw0.a(new TextLocalisedClause(R$string.esim_refund_peding_title, null, null, 14), new TextLocalisedClause(R$string.esim_refund_peding_subtitle, null, null, 14), null, null, false, 28);
        }
        return new g(u.c(new um0("ID_CONFIRMATION_BUTTONS", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_help, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.esim_subscription_details_refund_unavailable_accept, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), aVar);
    }
}
