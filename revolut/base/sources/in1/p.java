package in1;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function1 {
    public AccountId.Personal u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f162607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation continuation) {
        super(1, continuation);
        this.f162607w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.f162607w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AccountId.Personal accountId;
        s sVar = this.f162607w;
        gn1.b bVar = sVar.f162612r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AccountId.Personal personal = AccountId.Personal.f51414a;
            this.u = personal;
            this.v = 1;
            Object objB = bVar.b(personal, this, null);
            if (objB == aVar) {
                return aVar;
            }
            accountId = personal;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountId = this.u;
            yhm.o.b(obj2);
        }
        io3.d pocket = (io3.d) obj2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        sVar.H2(sVar.f162614t, new n(new hn1.a(accountId, vo9.a.b(bVar.f144902a, pocket, accountId, 4), pocket), 0));
        return Unit.f186387a;
    }
}
