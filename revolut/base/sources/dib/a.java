package dib;

import com.revolut.feature.retail.salary_account.impl.work_email.data.WorkEmailService;
import fib.c;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f114964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f114965x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, String str, Continuation continuation, f fVar) {
        super(2, continuation);
        this.u = i;
        this.f114964w = str;
        this.f114965x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(0, this.f114964w, continuation, this.f114965x);
            default:
                return new a(1, this.f114964w, continuation, this.f114965x);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    c cVar = new c(this.f114964w);
                    WorkEmailService workEmailService = (WorkEmailService) this.f114965x.f322835b;
                    this.v = 1;
                    if (workEmailService.verifyWorkEmail(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    fib.f fVar = new fib.f(this.f114964w);
                    WorkEmailService workEmailService2 = (WorkEmailService) this.f114965x.f322835b;
                    this.v = 1;
                    if (workEmailService2.verifyWorkEmailVerificationToken(fVar, this) == aVar2) {
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
