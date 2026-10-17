package d3i;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f111166w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111166w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f111166w, continuation, 0);
            case 1:
                return new f(this.f111166w, continuation, 1);
            case 2:
                return new f(this.f111166w, continuation, 2);
            default:
                return new f(this.f111166w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    m mVar = this.f111166w;
                    j2 j2Var = mVar.f2376a;
                    n nVar = mVar.d;
                    Object objO = vkm.q.o(vkm.q.Q(j2Var, new i(null, nVar, 2)), new l(mVar, nVar, null, 0), this);
                    if (objO != obj3) {
                        objO = Unit.f186387a;
                    }
                    if (objO == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    m mVar2 = this.f111166w;
                    j2 j2Var2 = mVar2.f2376a;
                    n nVar2 = mVar2.d;
                    Object objO2 = vkm.q.o(vkm.q.Q(j2Var2, new i(null, nVar2, 3)), new l(mVar2, nVar2, null, 1), this);
                    if (objO2 != obj4) {
                        objO2 = Unit.f186387a;
                    }
                    if (objO2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    m mVar3 = this.f111166w;
                    Object objO3 = vkm.q.o(vkm.q.Q(vkm.q.q(new bbk.z(mVar3.f2376a, 25)), new i(null, mVar3.d, 1)), new j(mVar3, null, 1), this);
                    if (objO3 != obj5) {
                        objO3 = Unit.f186387a;
                    }
                    if (objO3 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    m mVar4 = this.f111166w;
                    Object objO4 = vkm.q.o(vkm.q.Q(vkm.q.q(new bbk.z(mVar4.f2376a, 25)), new i(null, mVar4.d, 0)), new j(mVar4, null, 0), this);
                    if (objO4 != obj6) {
                        objO4 = Unit.f186387a;
                    }
                    if (objO4 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
