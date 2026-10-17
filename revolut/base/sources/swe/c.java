package swe;

import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import e0f.r1;
import gim.i;
import java.util.Optional;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import prl.e;
import yhm.o;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f266201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f266202x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266202x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f266202x, continuation, 0);
                cVar.f266201w = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f266202x, continuation, 1);
                cVar2.f266201w = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Pair pair = (Pair) this.f266201w;
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
                uwe.a aVar2 = (uwe.a) pair.f186385a;
                e93.c cVar = (e93.c) ((Optional) pair.f186386b).orElse(null);
                this.f266201w = null;
                this.v = 1;
                Object objC = e.c(this.f266202x, aVar2, cVar, this);
                return objC == aVar ? aVar : objC;
            default:
                a aVar3 = (a) this.f266201w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                u51.a aVar5 = (u51.a) this.f266202x.f239325b;
                String str = aVar3.f266196b;
                n nVar = aVar3.f266197c;
                CheckoutContext checkoutContext = new CheckoutContext(aVar3.f266195a, aVar3.e, aVar3.d);
                this.f266201w = null;
                this.v = 1;
                Object objG = ((r1) aVar5).g(str, nVar, checkoutContext, this);
                return objG == aVar4 ? aVar4 : objG;
        }
    }
}
