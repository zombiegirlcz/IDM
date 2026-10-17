package dtf;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.qf;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Map map = domainState.f117444a;
        dj0.d dVar = domainState.f117445b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            TransferReasonNode transferReasonNode = (TransferReasonNode) entry.getKey();
            arrayList.add(new RowDelegate.Model(j6.a.q("AMOUNT_CELL_INPUT_ID_", transferReasonNode.getF92432a()), null, hb9.b.B(transferReasonNode), null, 0, null, null, null, 0, new qf((dj0.d) entry.getValue(), null, false, false, 30), false, null, false, null, null, null, null, null, null, transferReasonNode, null, 0, 0, 0, 0, 532673530));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        boolean zF = Intrinsics.f(domainState.a(), dVar);
        dj0.d dVarH = pyd.c.H(dVar, domainState.a());
        dj0.d.Companion.getClass();
        j jVar2 = dVarH.e(dj0.d.e) ? new j(R$string.transfer_reasons_amount_allocation_breakdown_left, R$attr.uikit_colorGreyTone50) : new j(R$string.transfer_reasons_amount_allocation_breakdown_over, R$attr.uikit_colorRed);
        List listK = v.k(new TextLocalisedClause(R$string.transfer_reasons_amount_allocation_breakdown_format, v.k(new MoneyClause(domainState.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(domainState.f117445b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new TextLocalisedClause(jVar2.f117452a, u.c(new MoneyClause(dVarH.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(jVar2.f117453b), false, null, false, null, 254), 8));
        m70.a.a(t0.f186434a);
        return new h(arrayList, zF, new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
    }
}
