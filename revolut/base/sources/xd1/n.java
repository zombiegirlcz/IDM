package xd1;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((cd1.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cd1.e eVar = (cd1.e) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = eVar.f23150b;
        NumberClause numberClause = i > 0 ? new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6) : null;
        g gVar = eVar.e.k() ? new g(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_new_sale_primary_button_title, null, null, 14), false) : new g(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_new_sale_primary_button_title_with_amount, u.c(new MoneyClause(eVar.e, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12)), null, 12), true);
        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar2 = this.v;
        gVar2.H2(gVar2.A, new x52.a(gVar2, 24, numberClause, gVar));
        return Unit.f186387a;
    }
}
