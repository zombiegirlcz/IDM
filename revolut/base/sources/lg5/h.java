package lg5;

import aqd.n1;
import jck.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tnb.g0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.features.impl.ui.features.a f195072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.crypto.features.impl.ui.features.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f195072w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f195072w, continuation, 0);
            default:
                return new h(this.f195072w, continuation, 1);
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
                com.revolut.feature.crypto.features.impl.ui.features.a aVar2 = this.f195072w;
                if (i == 0) {
                    o.b(obj2);
                    g0 g0Var = aVar2.f70856q;
                    this.v = 1;
                    obj2 = g0Var.g(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.H2(aVar2.f70858s, new y(((Boolean) obj2).booleanValue(), 25));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.crypto.features.impl.ui.features.a aVar4 = this.f195072w;
                if (i2 == 0) {
                    o.b(obj2);
                    ufm.i iVarD = aVar4.f70855p.d();
                    this.v = 1;
                    obj2 = nim.a.b(iVarD, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar4.H2(aVar4.f70858s, new n1(10, (Boolean) obj2));
                return Unit.f186387a;
        }
    }
}
