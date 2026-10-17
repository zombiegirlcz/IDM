package o83;

import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public f0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f222921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation continuation) {
        super(1, continuation);
        this.f222921w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f222921w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f0 f0Var;
        AccountId accountId;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        m mVar = this.f222921w;
        if (i == 0) {
            yhm.o.b(obj2);
            f0 f0Var2 = mVar.o.f65498a;
            if (!f0Var2.P()) {
                f0Var = f0Var2;
                accountId = AccountId.Personal.f51414a;
                return mVar.C1(new BridgeDestination(((rae.d) mVar.f222926r).n(accountId, f0Var.f150110a)));
            }
            jhi.b bVarG = mo3.a.g(nim.a.v(mVar.f222927s.h(w4l.j.f294644c), new o69.b(22)), null, new o4a.a(16), 1);
            this.u = f0Var2;
            this.v = 1;
            Object objX = q.x(bVarG, this);
            if (objX == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
            obj2 = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = this.u;
            yhm.o.b(obj2);
        }
        accountId = (AccountId) obj2;
        return mVar.C1(new BridgeDestination(((rae.d) mVar.f222926r).n(accountId, f0Var.f150110a)));
    }
}
