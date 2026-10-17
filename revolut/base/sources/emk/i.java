package emk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f127683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f127684x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127683w = kVar;
        this.f127684x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f127683w, this.f127684x, continuation, 0);
            default:
                return new i(this.f127683w, this.f127684x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x xVar = this.f127683w.f127687p;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f127684x, aVar2, null, this, 4);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar = this.f127683w;
                    ajk.b bVar = kVar.u;
                    String str = this.f127684x;
                    e58.d dVar = new e58.d(kVar, str, 24);
                    this.v = 1;
                    if (igk.k.b(kVar, bVar, str, dVar, this) == aVar3) {
                        return aVar3;
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
