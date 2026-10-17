package xkf;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ do3.n f306670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f306671x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(3, continuation);
        this.f306671x = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(this.f306671x, (Continuation) obj4);
        aVar.v = (a3) obj2;
        aVar.f306670w = (do3.n) obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 a3Var = this.v;
        do3.n nVar = this.f306670w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.f306671x;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = a3Var.I.f273161a;
            if (str == null) {
                return zhm.f0.f322471a;
            }
            efm.d0 d0VarF = ((k61.i) bVar.f306678b).f(str);
            this.v = null;
            this.f306670w = nVar;
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        TransferLinkDetails transferLinkDetails = (TransferLinkDetails) obj2;
        TransferLinkDetails.Active active = transferLinkDetails instanceof TransferLinkDetails.Active ? (TransferLinkDetails.Active) transferLinkDetails : null;
        if (active == null) {
            return zhm.f0.f322471a;
        }
        return zhm.d0.E0(((l7k.b) bVar.f306679c).a(nVar), ((l7k.b) bVar.f306679c).d(active));
    }
}
