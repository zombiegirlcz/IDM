package wca;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.TokenVerificationRequest;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mll.c0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f296374w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f296374w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f296374w, continuation, 0);
            default:
                return new j(this.f296374w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        l lVar = this.f296374w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation = null;
                if (i3 == 0) {
                    o.b(obj2);
                    s8a.c cVar = lVar.f296376p;
                    TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData = lVar.o;
                    AccountId accountId = tokenVerificationScreenContract$InputData.f80761a;
                    TokenVerificationRequest tokenVerificationRequest = tokenVerificationScreenContract$InputData.f80763c;
                    this.v = 1;
                    n8a.o oVar = cVar.f260942a;
                    oVar.getClass();
                    c0 c0Var = new c0(oVar, tokenVerificationRequest, accountId, continuation, 29);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, c0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                lVar.H2(lVar.f296378r, new wb3.k((String) obj2, 2));
                lVar.l2(new k(lVar, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    j jVar = new j(lVar, null, 0);
                    this.v = 1;
                    if (lVar.p2(this, jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
