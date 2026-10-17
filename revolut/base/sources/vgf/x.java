package vgf;

import com.revolut.core.model.account.AccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f289144w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289144w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f289144w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            default:
                x xVar2 = new x(this.f289144w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((k71.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k71.q qVar;
        int i = this.u;
        z zVar = this.f289144w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k71.q qVar2 = (k71.q) pair.f186385a;
                k71.q qVar3 = (k71.q) pair.f186386b;
                AccountId accountId = zVar.f289149b.f91926b;
                if (accountId instanceof AccountId.Joint) {
                    qVar = qVar3;
                } else {
                    if (!(accountId instanceof AccountId.Personal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar = qVar2;
                }
                String str = qVar2.f;
                if (str.length() == 0) {
                    qVar2 = null;
                }
                Pair pair2 = new Pair(str, qVar2);
                String str2 = qVar3.f;
                return new g(qVar, foh.i.q(pair2, new Pair(str2, str2.length() != 0 ? qVar3 : null)));
            default:
                k71.q qVar4 = (k71.q) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str3 = qVar4.f;
                zVar.getClass();
                return new g(qVar4, foh.i.q(new Pair(str3, qVar4.f.length() != 0 ? qVar4 : null)));
        }
    }
}
