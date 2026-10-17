package gs4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ql4.q0;
import ql4.t;
import tof.a3;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cm4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f146320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f146321b;

    public h(thf.m transactionTextResourcesMapper, f creditCardInstalmentIconMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentIconMapper, "creditCardInstalmentIconMapper");
        this.f146320a = transactionTextResourcesMapper;
        this.f146321b = creditCardInstalmentIconMapper;
    }

    public static RowDelegate.Model b(ql4.i iVar, Clause clause, a aVar, cm4.e eVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ql4.m mVar;
        String str = iVar.f247128b;
        ql4.l lVar = iVar.i;
        String strQ = j6.a.q("id_credit_card_instalment_item_", str);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(aVar.f146305a, aVar.f146306b, aVar.f146307c, false, null, false, 56);
        TimeClause timeClause = new TimeClause(iVar.f247129c.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12);
        dj0.d dVar = iVar.k;
        t tVar = iVar.f247131h;
        if (tVar != t.ACTIVE || dVar == null || !dVar.f(dj0.d.e)) {
            dVar = iVar.f;
        }
        MoneyClause moneyClauseB = sx4.f.b(1, (lVar == null || !((mVar = lVar.f247146a) == ql4.m.MAX_TDPD_EXCEEDED || mVar == ql4.m.FACILITY_TERMINATION)) ? null : new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, dVar.l());
        dj0.d dVar2 = iVar.f247130g;
        int i = g.f146318b[tVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ql4.m mVar2 = lVar != null ? lVar.f247146a : null;
                int i2 = mVar2 == null ? -1 : g.f146319c[mVar2.ordinal()];
                if (i2 == -1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_plan_state_cancelled, null, null, 14);
                } else if (i2 != 1) {
                    if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_plan_state_cancelled, null, null, 14);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_plan_state_refinanced, null, null, 14);
                }
            } else if (i == 3) {
                textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_plan_state_repaid, null, null, 14);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = null;
            }
            textLocalisedClause2 = textLocalisedClause;
        } else if (dVar2.f(dj0.d.e)) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_instalment_hub_item_left, u.c(sx4.f.b(3, null, null, pyd.c.i0(dVar2))), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_plan_state_repaid, null, null, 14);
            textLocalisedClause2 = textLocalisedClause;
        }
        return new RowDelegate.Model(strQ, image40, clause, null, 0, timeClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, textLocalisedClause2, null, false, 124), false, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532675544);
    }

    public final Clause a(ql4.h hVar) {
        List list = hVar.f247124a;
        if (list.size() != 1) {
            return new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_hub_item_transaction, Integer.valueOf(list.size()), v1.c.v(list), (Style) null, 24);
        }
        a3 a3Var = (a3) d0.b0(list);
        Object obj2 = hVar.f247125b;
        k71.q qVarA = obj2 instanceof k71.q ? (k71.q) obj2 : null;
        if (qVarA == null) {
            k71.q.Companion.getClass();
            qVarA = k71.p.a();
        }
        Map map = qVarA.f181795b;
        Map map2 = qVarA.d;
        Map map3 = qVarA.e;
        r61.c cVar = qVarA.f181799j;
        do3.n nVar = qVarA.f181794a;
        return new TextClause(((bnf.r) this.f146320a).p(a3Var, map, map2, map3, cVar, nVar != null ? nVar.f116408a : null, qVarA.f181806s, qVarA.u), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
    }

    public final RowDelegate.Model c(ql4.i model) {
        Intrinsics.checkNotNullParameter(model, "model");
        q0 q0Var = model.f247132j;
        ql4.h hVar = model.f247134m;
        String str = model.f247128b;
        String str2 = model.f247127a;
        int i = g.f146317a[q0Var.ordinal()];
        f fVar = this.f146321b;
        switch (i) {
            case 1:
                return b(model, new TextLocalisedClause(R$string.credit_card_instalment_plan_statement_financing, null, null, 14), fVar.b(model), new cm4.d(str2, str));
            case 2:
            case 3:
            case 4:
                return b(model, a(hVar), fVar.b(model), new cm4.b(str2, str));
            case 5:
                List transactions = v.l(d0.d0(hVar.f247124a));
                Object obj2 = hVar.f247125b;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return b(model, a(new ql4.h(transactions, obj2)), fVar.b(model), new cm4.c(str2, str));
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
