package gu2;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ku2.f;
import ku2.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f146683w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146683w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f146683w, continuation, 0);
            default:
                return new a(this.f146683w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        b bVar = this.f146683w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                hu2.a aVar2 = bVar.f146684h;
                this.v = 1;
                Object objA = aVar2.a(this);
                return objA == aVar ? aVar : objA;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    hu2.a aVar4 = bVar.f146684h;
                    this.v = 1;
                    obj2 = aVar4.a(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return (iu2.b) obj2;
                    }
                    o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return new iu2.b("");
                }
                h hVar = bVar.i;
                this.v = 2;
                hVar.getClass();
                p0 p0Var = p0.f264001a;
                obj2 = e0.J(zkm.o.f323119a.e, new f(hVar, null, 0), this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                return (iu2.b) obj2;
        }
    }
}
