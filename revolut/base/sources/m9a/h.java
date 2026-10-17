package m9a;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("INNER_USER_NOT_INTERESTED_ID", null, new TextLocalisedClause(R$string.pix_authorisation_request_reject_modal_reason_user_not_interested, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        vd0 vd0Var = vd0.RADIO;
        List listK = v.k(new SelectableDelegate.Model("USER_NOT_INTERESTED_ID", model, domainState.f203674a == g8a.a.USER_NOT_INTERESTED ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, false, 32744), new SelectableDelegate.Model("USER_DOES_NOT_RECOGNISE_PAYMENT_ID", new RowDelegate.Model("INNER_USER_DOES_NOT_RECOGNISE_PAYMENT_ID", null, new TextLocalisedClause(R$string.pix_authorisation_request_reject_modal_reason_user_does_not_recognise_payment, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), domainState.f203674a == g8a.a.USER_DOES_NOT_RECOGNISE_PAYMENT ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, false, 32744));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new f(listK);
    }
}
