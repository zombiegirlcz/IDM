package c64;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f21651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f21652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e54.p f21653y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, String str, e54.p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21651w = b0Var;
        this.f21652x = str;
        this.f21653y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f21651w, this.f21652x, this.f21653y, continuation, 0);
            default:
                return new z(this.f21651w, this.f21652x, this.f21653y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = this.f21651w.f21615y;
                    cv3.t tVar = cv3.u.Companion;
                    Long l2 = new Long(((e54.o) this.f21653y).f122757a);
                    tVar.getClass();
                    cv3.u uVarB = cv3.t.b(l2, this.f21652x);
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, uVarB);
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var2 = this.f21651w.f21615y;
                    cv3.t tVar2 = cv3.u.Companion;
                    Long l3 = new Long(((e54.o) this.f21653y).f122757a);
                    tVar2.getClass();
                    cv3.u uVarB2 = cv3.t.b(l3, this.f21652x);
                    this.v = 1;
                    j2Var2.getClass();
                    j2Var2.g(null, uVarB2);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
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
