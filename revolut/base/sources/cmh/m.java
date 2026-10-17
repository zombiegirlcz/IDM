package cmh;

import android.content.Context;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.q;
import yfe.h0;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = this.v;
        ty0.c cVar = nVar.f;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.invest_total_wealth_tile_title, null, null, 14);
        Context context = nVar.e;
        String string = ty0.c.a(cVar, textLocalisedClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((WealthAccount) it8.next()).Q2()) {
                    return nim.a.v(q.s(xam.a.h(new ck7.j(nVar, null, 4), q.q(nim.a.v(nVar.d.e(w4l.h.f294642c), new cmc.c(9)))), new cmc.c(10), q.f290100b), new c1g.o(nVar, list, string, 17));
                }
            }
        }
        String string2 = ty0.c.a(nVar.f, new TextLocalisedClause(R$string.invest_total_wealth_tile_empty_subtitle, null, null, 14), context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        od0.h hVar = od0.i.Companion;
        h0 h0Var = new h0(string, string2);
        hVar.getClass();
        return zi0.c.i(od0.h.a(h0Var));
    }
}
