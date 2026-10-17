package xd2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.spin.impl.ui.settings.a f304247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Alias f304248x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.apm.spin.impl.ui.settings.a aVar, Alias alias, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304247w = aVar;
        this.f304248x = alias;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f304247w, this.f304248x, continuation, 0);
            default:
                return new s(this.f304247w, this.f304248x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.spin.impl.ui.settings.a aVar2 = this.f304247w;
                    f fVar = aVar2.o;
                    Alias alias = this.f304248x;
                    o oVar = new o(aVar2, alias, 1);
                    this.v = 1;
                    fVar.getClass();
                    Object objY2 = fVar.Y2(this, new wc2.b(fVar, alias, (Function1) oVar, (Continuation) null, 7));
                    if (objY2 != aVar) {
                        objY2 = Unit.f186387a;
                    }
                    if (objY2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.spin.impl.ui.settings.a aVar4 = this.f304247w;
                    f fVar2 = aVar4.o;
                    Alias alias2 = this.f304248x;
                    o oVar2 = new o(aVar4, alias2, 2);
                    this.v = 1;
                    fVar2.getClass();
                    Object objY22 = fVar2.Y2(this, new wc2.b(fVar2, alias2, (Function1) oVar2, (Continuation) null, 8));
                    if (objY22 != aVar3) {
                        objY22 = Unit.f186387a;
                    }
                    if (objY22 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
