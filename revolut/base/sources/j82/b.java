package j82;

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
    public final /* synthetic */ zq.a f172082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h02.c f172083x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(zq.a aVar, h02.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f172082w = aVar;
        this.f172083x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f172082w, this.f172083x, continuation, 0);
            default:
                return new b(this.f172082w, this.f172083x, continuation, 1);
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
        h02.c cVar = this.f172083x;
        zq.a aVar = this.f172082w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    l72.f fVar = (l72.f) aVar.f324336c;
                    String str = cVar.f148180a;
                    this.v = 1;
                    a72.e eVar = new a72.e(fVar.f192509a, str, null, 0);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, eVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l72.f fVar2 = (l72.f) aVar.f324336c;
                    String str2 = cVar.f148180a;
                    this.v = 1;
                    a72.e eVar2 = new a72.e(fVar2.f192509a, str2, null, 1);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, eVar2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
