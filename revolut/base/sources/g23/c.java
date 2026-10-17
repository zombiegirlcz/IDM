package g23;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.core.R$string;
import ft3.j1;
import ft3.q0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements oim.n {
    public /* synthetic */ List u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f139775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f139776x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(4, continuation);
        this.f139776x = dVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        c cVar = new c(this.f139776x, (Continuation) obj5);
        cVar.u = (List) obj2;
        cVar.v = zBooleanValue;
        cVar.f139775w = zBooleanValue2;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        List list = this.u;
        boolean z = this.v;
        boolean z3 = this.f139775w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVar = this.f139776x;
        dVar.getClass();
        l0 l0Var = dVar.f139778l;
        aim.e eVarB = zhm.u.b();
        Object objB = null;
        if (z3) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next2 = it8.next();
                q0 q0Var = ((em4.a) next2).f127606h;
                if ((q0Var != null ? q0Var.getF137852c() : null) == j1.FAMILY_CREDIT_CARD) {
                    objB = next2;
                    break;
                }
            }
            em4.a aVar2 = (em4.a) objB;
            if (aVar2 != null) {
                TextLocalisedClause textLocalisedClause = aVar2.f127604c;
                Clause clauseP = c8g.c.p(aVar2.d);
                int i = R$drawable.uikit_icn_24_credit_card;
                int i2 = R$attr.uikit_colorTeal;
                List list2 = aVar2.f127605g;
                q0 q0Var2 = aVar2.f127606h;
                AnalyticsContext analyticsContext = new AnalyticsContext(aVar2.e);
                l0Var.getClass();
                eVarB.add(l0.a("DISCOVER_ADDITIONAL_CREDIT_CARD_LIST_ID", textLocalisedClause, clauseP, i, i2, list2, q0Var2, analyticsContext));
            }
        } else {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                q0 q0Var3 = ((em4.a) next).f127606h;
                if ((q0Var3 != null ? q0Var3.getF137852c() : null) == j1.CREDIT_CARD) {
                    break;
                }
            }
            em4.a aVar3 = (em4.a) next;
            if (aVar3 != null) {
                TextLocalisedClause textLocalisedClause2 = aVar3.f127604c;
                Clause clauseP2 = c8g.c.p(aVar3.d);
                int i3 = R$drawable.uikit_icn_24_credit_card;
                int i5 = R$attr.uikit_colorTeal;
                List list3 = aVar3.f127605g;
                q0 q0Var4 = aVar3.f127606h;
                AnalyticsContext analyticsContext2 = new AnalyticsContext(aVar3.e);
                l0Var.getClass();
                eVarB.add(l0.a("DISCOVER_CREDIT_CARD_LIST_ID", textLocalisedClause2, clauseP2, i3, i5, list3, q0Var4, analyticsContext2));
            }
            if (((jte.d) dVar.f139779m).c(CreditApplicationApi$Toggles.BalanceTransferAlwaysEntryPoints.f66179c) && z) {
                objB = l0.b(dVar.f139778l, "DISCOVER_BALANCE_TRANSFER_CREDIT_CARD_LIST_ID", new TextLocalisedClause(R$string.credit_card_balance_transfer_entry_point_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_balance_transfer_entry_point_description, zhm.u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorTeal, null, BERTags.FLAGS);
            }
            if (objB != null) {
                eVarB.add(objB);
            }
        }
        return zhm.u.a(eVarB);
    }
}
