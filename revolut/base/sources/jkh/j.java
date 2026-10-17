package jkh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f175178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kih.a f175179x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, kih.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f175178w = lVar;
        this.f175179x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f175178w, this.f175179x, continuation, 0);
            default:
                return new j(this.f175178w, this.f175179x, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                xi0.b bVar = this.f175179x.f184231a;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                l lVar = this.f175178w;
                if (i == 0) {
                    o.b(obj2);
                    x8h.k kVar = lVar.f175181p;
                    this.v = 1;
                    if (kVar.d(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                lVar.C2(new kih.d(bVar));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar2 = this.f175178w;
                j jVar = new j(lVar2, this.f175179x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(lVar2.k, "save_selected_currency", jVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
