package hba;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f150631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f150632x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150632x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f150632x, continuation, 0);
                jVar.f150631w = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f150632x, continuation, 1);
                jVar2.f150631w = obj2;
                return jVar2;
            default:
                j jVar3 = new j(this.f150632x, continuation, 2);
                jVar3.f150631w = obj2;
                return jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        PixKey pixKey = (PixKey) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(pixKey, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                PixKey pixKey = (PixKey) this.f150631w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    l lVar = this.f150632x;
                    s8a.c cVar = lVar.f150636r;
                    AccountId accountId = lVar.o.f80677a;
                    this.f150631w = null;
                    this.v = 1;
                    n8a.o oVar = cVar.f260942a;
                    oVar.getClass();
                    Object objF = oVar.f(accountId, pixKey, "accept_alias_migration", new n8a.b(oVar, accountId, null, 0), this);
                    if (objF != aVar) {
                        objF = Unit.f186387a;
                    }
                    if (objF != aVar) {
                        objF = Unit.f186387a;
                    }
                    if (objF == aVar) {
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
                PixKey pixKey2 = (PixKey) this.f150631w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    l lVar2 = this.f150632x;
                    s8a.c cVar2 = lVar2.f150636r;
                    AccountId accountId2 = lVar2.o.f80677a;
                    this.f150631w = null;
                    this.v = 1;
                    if (cVar2.a(accountId2, pixKey2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                PixKey pixKey3 = (PixKey) this.f150631w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    l lVar3 = this.f150632x;
                    s8a.c cVar3 = lVar3.f150636r;
                    AccountId accountId3 = lVar3.o.f80677a;
                    this.f150631w = null;
                    this.v = 1;
                    if (cVar3.a(accountId3, pixKey3, this) == aVar3) {
                        return aVar3;
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
