package zs2;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.business.referrals.ui.screens.invite_contacts.a f324802w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324802w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f324802w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f324802w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((q) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.FALSE;
            default:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar = this.f324802w;
        switch (i) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new nd8.l(th10, 18));
                return Boolean.FALSE;
            default:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new zlb.l(list, 1));
                aVar.I2();
                return Unit.f186387a;
        }
    }
}
