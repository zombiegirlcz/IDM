package azd;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import i0e.t;
import i0e.u;
import i0e.v;
import i0e.w;
import ip0.zj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f11442b != null;
        w wVar = domainState.f11441a;
        if (wVar instanceof u) {
            listC = ((u) wVar).f157390b;
        } else if (wVar instanceof v) {
            listC = ((v) wVar).f157391b;
        } else {
            if (!(wVar instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = ((t) wVar).f157389b;
            List list = listC;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (Intrinsics.f(((koi.j) it8.next()).getF51573a(), "EMPTY_ITEM_LIST_ID")) {
                        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_ITEM_LIST_ID", new TextLocalisedClause(R$string.statement_annual_fee_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.statement_annual_fee_empty_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                        listC = zhm.u.c(model);
                        break;
                    }
                }
            }
        }
        return new g(listC, z);
    }
}
