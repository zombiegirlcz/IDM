package md8;

import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ConsentTypeId consentTypeId = qVar.o.f204505b;
            if (consentTypeId instanceof ConsentTypeId.DataManagementConsentId) {
                throw new IllegalStateException("This button should not be enabled while id is consent id or name");
            }
            if (!(consentTypeId instanceof ConsentTypeId.ConsentName)) {
                if (!(consentTypeId instanceof ConsentTypeId.ConsentRequestId)) {
                    throw new NoWhenBranchMatchedException();
                }
                kd8.x xVar = qVar.f204516q;
                String str = ((ConsentTypeId.ConsentRequestId) consentTypeId).f76861a;
                this.u = 1;
                Object objB = ((gd8.x) xVar.f182859a).b(str, this);
                if (objB != aVar) {
                    objB = Unit.f186387a;
                }
                if (objB == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        qVar.B2();
        qVar.C2(zc8.c.REJECTED);
        return Unit.f186387a;
    }
}
