package bb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.w f14134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Alias f14135x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(r10.w wVar, Alias alias, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f14134w = wVar;
        this.f14135x = alias;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f14134w, this.f14135x, continuation, 0);
            case 1:
                return new b(this.f14134w, this.f14135x, continuation, 1);
            default:
                return new b(this.f14134w, this.f14135x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Alias alias = this.f14135x;
        r10.w wVar = this.f14134w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vw1.b bVar = (vw1.b) wVar.f250865a;
                this.v = 1;
                Object objB = vw1.b.b(bVar, alias, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vw1.b bVar2 = (vw1.b) wVar.f250865a;
                this.v = 1;
                uy1.h hVar = new uy1.h((uy1.j) bVar2, alias, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, hVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vw1.b bVar3 = (vw1.b) wVar.f250865a;
                this.v = 1;
                uy1.h hVar2 = new uy1.h((uy1.j) bVar3, alias, null, 1);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, hVar2, this);
                return objJ2 == aVar3 ? aVar3 : objJ2;
        }
    }
}
