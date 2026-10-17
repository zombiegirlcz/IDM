package l5a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarY = eVar.u.y(AccountId.Personal.f51414a);
            this.u = 1;
            obj2 = nim.a.b(iVarY, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        io3.d dVar = (io3.d) obj2;
        String str = dVar.f163145a;
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = dVar.f163147c;
        aVar2.getClass();
        return yji.l.a1(eVar, mo3.a.g(nim.a.v(eVar.v.g(new RetailBackgroundKey.PersonalCurrency(str, xi0.a.a(str2), new EntityInfo(md6.e.CURRENCY, null, null, 6))), new u(0)), null, new l2c.v(13), 1), null, null, new r(eVar, null, 1), 3);
    }
}
