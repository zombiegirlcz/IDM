package vqg;

import com.revolut.core.model.account.AccountId;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import yhm.o;
import ypg.p;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f291397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bcb.a f291398x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, bcb.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f291397w = iVar;
        this.f291398x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f291397w, this.f291398x, continuation, 0);
            case 1:
                return new h(this.f291397w, this.f291398x, continuation, 1);
            default:
                return new h(this.f291397w, this.f291398x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    i iVar = this.f291397w;
                    ppg.b bVar = iVar.f291400m;
                    bcb.a aVar2 = this.f291398x;
                    String vaultId = aVar2.d.a();
                    long j2 = aVar2.f14415a;
                    p pVar = (p) bVar;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                    pfm.a aVarA = odd.a.a(pVar.f, vaultId, j2);
                    n nVar = iVar.f291399l;
                    xi0.b bVar2 = aVar2.f14416b;
                    AccountId accountId = aVar2.f;
                    if (accountId == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    pfm.a aVarE = aVarA.e(ue0.e.v(nVar.n0(bVar2, accountId)));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar2 = this.f291397w;
                    h hVar = new h(iVar2, this.f291398x, null, 0);
                    this.v = 1;
                    if (ue8.c.g0(iVar2, hVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    i iVar3 = this.f291397w;
                    h hVar2 = new h(iVar3, this.f291398x, null, 1);
                    this.v = 1;
                    if (q.u(iVar3, hVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
