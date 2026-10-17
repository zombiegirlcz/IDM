package nol;

import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.sso.impl.ui.phone.change_flow.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.sso.impl.ui.phone.change_flow.b bVar = this.v;
            String str = ((ChangePhoneFlowContract$State) ((j2) bVar.f106660x.f22677a).getValue()).f106645c;
            EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.FullNumber fullNumber = str != null ? new EnterPhoneScreenContract$InputData.Mode.Create.PhoneData.FullNumber(str) : null;
            this.u = 1;
            if (com.revolut.sso.impl.ui.phone.change_flow.b.K2(bVar, fullNumber, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
