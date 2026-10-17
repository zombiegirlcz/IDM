package eol;

import cjl.s;
import com.revolut.sso.impl.domain.models.AuthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import okl.n1;
import yhm.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f128001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f128001w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f128001w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        n1 n1Var = this.v.o;
        s sVar = s.GLOBAL;
        f0 f0Var = f0.f322471a;
        h0 h0Var = h0.f322473a;
        AuthAction.OperationBoundAuthentication operationBoundAuthentication = new AuthAction.OperationBoundAuthentication(sVar, this.f128001w, f0Var, null, f0Var, h0Var, h0Var, 16128);
        jkl.i iVar = jkl.i.WEB_AUTHN;
        this.u = 1;
        Object objC = n1.c(n1Var, operationBoundAuthentication, iVar, this);
        return objC == aVar ? aVar : objC;
    }
}
