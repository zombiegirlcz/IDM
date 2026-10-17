package b54;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.akahu.b f12430w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12430w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f12430w, continuation, 0);
            case 1:
                return new e(this.f12430w, continuation, 1);
            default:
                return new e(this.f12430w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar = this.f12430w;
                    com.revolut.feature.credit.application.plugins.impl.ui.akahu.a aVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.akahu.a(bVar, null);
                    this.v = 1;
                    if (pu7.a.B(bVar.k, "akahu resume", aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar2 = this.f12430w;
                f fVar = new f(bVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(bVar2.k, "akahu skip", fVar, this);
                return objB == aVar3 ? aVar3 : objB;
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
                com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar3 = this.f12430w;
                f fVar2 = new f(bVar3, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar3.k, "akahu skip", fVar2, this);
                return objB2 == aVar4 ? aVar4 : objB2;
        }
    }
}
