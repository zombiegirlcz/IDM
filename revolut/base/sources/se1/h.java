package se1;

import et6.a1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n1g.p;
import s78.n;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f262088w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f262088w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f262088w, continuation, 0);
            case 1:
                return new h(this.f262088w, continuation, 1);
            default:
                return new h(this.f262088w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f262088w;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = q.x(nz8.d.j(nim.a.v(((a1) ((sfc.e) iVar.f262090q.f214293a).d).a(), new se0.a(22)), null, 3), this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar.x2(new n((List) obj2, 3));
                return Unit.f186387a;
            case 1:
                i iVar2 = this.f262088w;
                nd1.i iVar3 = iVar2.f262090q;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    p pVarD = iVar3.d();
                    this.v = 1;
                    obj2 = q.x(pVarD, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        iVar2.x2(new ar3.a(28, (dj0.d) obj2));
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                iVar2.x2(new ou5.a(19, (xi0.b) obj2));
                this.v = 2;
                obj2 = iVar3.b(this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                iVar2.x2(new ar3.a(28, (dj0.d) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                i iVar4 = this.f262088w;
                if (i3 == 0) {
                    o.b(obj2);
                    nd1.n nVar = iVar4.f262089p;
                    this.v = 1;
                    nVar.f214305a.d.setValue(null);
                    if (Unit.f186387a == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                i.y2(iVar4);
                return Unit.f186387a;
        }
    }
}
