package eol;

import akl.r;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ col.b f128002w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, col.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f128002w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f128002w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        l lVar = this.v;
        akl.l lVar2 = lVar.f128003p;
        String str = ((rqk.k) lVar.f128007t).f256593p;
        Claim.WebAuthn webAuthn = this.f128002w.f25572a;
        this.u = 1;
        Object objE = ((r) lVar2).e(str, null, webAuthn, null, this);
        return objE == aVar ? aVar : objE;
    }
}
