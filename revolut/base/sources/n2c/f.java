package n2c;

import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import n1j.t;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {
    public static List a(SpareChangeRefund spareChangeRefund) {
        List listK = v.k(new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.rev_points_spare_change_refund_cell_details_points_reversal, null, null, 14), (Image) null, 0, false, 30), v1.c.g(0, qvb.a.c(spareChangeRefund.f84091c), null, null, 5), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("CELL_DELEGATE_REFUND_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.rev_points_spare_change_refund_cell_details_refund_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(spareChangeRefund.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f211514a, new t(9), new n0c.v(14), new mig.a(this, 19));
        Data data = domainState.f211514a;
        return new cii.b((aw0.e) iii.c.f(data, new t(10), new n0c.v(15), new mig.a(20)), list, (m) iii.c.f(data, new t(8), new n0c.v(13), new mig.a(this, 18)));
    }
}
