package i9a;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import ip0.qd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f159615a;
        List listC = u.c(new SelectableDelegate.Model("AGREEMENT_LIST_ID", new RowDelegate.Model("INNER_AGREEMENT_LIST_ID", null, new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_confirmation_modal_agreement, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), domainState.f159615a ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new f(z, listC);
    }
}
