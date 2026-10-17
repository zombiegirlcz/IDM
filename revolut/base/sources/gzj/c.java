package gzj;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.u0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f148140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ czj.d f148141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f148142y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, czj.d dVar2, AccountId accountId, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f148140w = dVar;
        this.f148141x = dVar2;
        this.f148142y = accountId;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f148140w, this.f148141x, this.f148142y, continuation, 0);
            default:
                return new c(this.f148140w, this.f148141x, this.f148142y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                d dVar = this.f148140w;
                if (i == 0) {
                    o.b(obj2);
                    d0 d0VarV0 = dVar.f148147q.v0(this.f148141x, this.f148142y);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarV0, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                u0 u0Var = (u0) obj2;
                r60.b bVar = dVar.f148148r;
                Intrinsics.h(u0Var);
                ((r60.d) bVar).R(u0Var);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    d dVar2 = this.f148140w;
                    c cVar = new c(dVar2, this.f148141x, this.f148142y, null, 0);
                    this.v = 1;
                    if (dVar2.Y2(this, cVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
