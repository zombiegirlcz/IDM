package yr1;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.tapi.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new CellDetailsDelegate.Model("ID_SERVICE_FEE_FIELD", new TextLocalisedClause(R$string.tapi_transfer_fee_breakdown_service_fee_title, null, null, 14), new MoneyClause(domainState.f316106a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_VAT_FIELD", new TextLocalisedClause(R$string.tapi_transfer_fee_breakdown_vat_title, null, null, 14), new MoneyClause(domainState.f316107b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_TOTAL_FIELD", new TextLocalisedClause(R$string.tapi_transfer_fee_breakdown_total_title, null, null, 14), new MoneyClause(domainState.f316108c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new d(listK);
    }
}
