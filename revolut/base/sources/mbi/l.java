package mbi;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ID_ROW_MALE", null, new TextLocalisedClause(R$string.gender_male, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        vd0 vd0Var = vd0.RADIO;
        od0.i iVar = domainState.f204222a;
        Object obj2 = iVar.f224257a;
        qd0 qd0Var = obj2 == bj0.b.MALE ? qd0.SELECTED : qd0.UNSELECTED;
        SelectableDelegate.b.C0424b c0424b = SelectableDelegate.b.C0424b.f53319a;
        List listK = v.k(new SelectableDelegate.Model("ID_ROW_MALE", model, qd0Var, c0424b, vd0Var, false, null, null, null, false, 32736), new SelectableDelegate.Model("ID_ROW_FEMALE", new RowDelegate.Model("ID_ROW_FEMALE", null, new TextLocalisedClause(R$string.gender_female, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), obj2 == bj0.b.FEMALE ? qd0.SELECTED : qd0.UNSELECTED, c0424b, vd0Var, false, null, null, null, false, 32736));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new k(listK, iVar.d());
    }
}
