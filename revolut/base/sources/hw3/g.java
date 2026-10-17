package hw3;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f156067w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f156067w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f156067w, continuation, 0);
            case 1:
                return new g(this.f156067w, continuation, 1);
            default:
                return new g(this.f156067w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f156067w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    eb5.a aVar2 = iVar.f156074c;
                    this.v = 1;
                    x4l.c cVar = aVar2.f124296a.d;
                    Object obj3 = Unit.f186387a;
                    Object objD = cVar.d(obj3, false, this);
                    if (objD != aVar) {
                        objD = obj3;
                    }
                    if (objD == aVar) {
                        obj3 = objD;
                    }
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                xq3.w wVar = iVar.e;
                this.v = 2;
                Object objD2 = wVar.f308101a.e.d(xr3.b0.f308205a, false, this);
                if (objD2 != aVar) {
                    objD2 = Unit.f186387a;
                }
                if (objD2 != aVar) {
                    objD2 = Unit.f186387a;
                }
                if (objD2 == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    i iVar2 = this.f156067w;
                    xq3.y yVar = iVar2.f156073b;
                    Set setA = xq3.y.a();
                    xq3.j jVar = iVar2.f156072a;
                    this.v = 1;
                    Object objO = skm.e0.o(new wo2.l(setA, jVar, (Continuation) null, 15), this);
                    if (objO != obj4) {
                        objO = Unit.f186387a;
                    }
                    if (objO == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    xq3.j jVar2 = this.f156067w.f156072a;
                    this.v = 1;
                    x4l.c cVar2 = jVar2.f308077a.f308226g;
                    Object obj5 = Unit.f186387a;
                    Object objD3 = cVar2.d(obj5, false, this);
                    if (objD3 != aVar3) {
                        objD3 = obj5;
                    }
                    if (objD3 == aVar3) {
                        obj5 = objD3;
                    }
                    if (obj5 == aVar3) {
                        return aVar3;
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
