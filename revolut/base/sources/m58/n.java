package m58;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.withdraw.b f202868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountId f202869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.joint.impl.ui.withdraw.b bVar, AccountId accountId, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f202868w = bVar;
        this.f202869x = accountId;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f202868w, this.f202869x, continuation, 0);
            default:
                return new n(this.f202868w, this.f202869x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.joint.impl.ui.withdraw.b bVar = this.f202868w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    rea.m mVar = bVar.f76611s;
                    io3.d dVar = (io3.d) ((a) ((j2) bVar.A.f22677a).getValue()).f202849b.getContent();
                    String pocketId = dVar != null ? dVar.f163145a : null;
                    if (pocketId == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                    AccountId accountId = this.f202869x;
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    d0 d0VarZ = mVar.f253579b.z(accountId, pocketId);
                    rbf.c cVar = new rbf.c(new rea.i(mVar, accountId, 1), 27);
                    d0VarZ.getClass();
                    pfm.a aVar2 = new pfm.a(d0VarZ, cVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.joint.impl.ui.withdraw.b.I2(bVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.joint.impl.ui.withdraw.b bVar2 = this.f202868w;
                    n nVar = new n(bVar2, this.f202869x, null, 0);
                    this.v = 1;
                    if (bVar2.p2(this, nVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
