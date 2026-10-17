package bmk;

import b94.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f16878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f16879x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16878w = qVar;
        this.f16879x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f16878w, this.f16879x, continuation, 0);
            default:
                return new n(this.f16878w, this.f16879x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = this.f16878w.f16888r;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f16879x, aVar2, null, this, 4);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q qVar = this.f16878w;
                    s sVar = new s(qVar, this.f16879x, null, 15);
                    this.v = 1;
                    if (qVar.Y2(this, sVar) == aVar3) {
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
