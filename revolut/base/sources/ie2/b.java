package ie2;

import bv4.h;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.swish.impl.domain.a f160623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.revolut.feature.apm.swish.impl.domain.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160623w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f160623w, continuation, 0);
            default:
                return new b(this.f160623w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.apm.swish.impl.domain.a aVar = this.f160623w;
        switch (i) {
            case 0:
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
                ce2.a aVar3 = aVar.f62909b;
                this.v = 1;
                aVar3.getClass();
                h hVar = new h(aVar3, null, 17);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, hVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ufm.i iVar = new ufm.i(aVar.f62910c.f(false), new h35.c(19, new id8.a(5)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                this.v = 1;
                Object objB = nim.a.b(iVar, this);
                return objB == aVar4 ? aVar4 : objB;
        }
    }
}
