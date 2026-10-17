package c5a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gei.a f21495x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, gei.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21494w = fVar;
        this.f21495x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.f21494w, this.f21495x, continuation, 0);
            default:
                return new j0(this.f21494w, this.f21495x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gei.a aVar2 = this.f21495x;
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.f21494w;
                i0 i0Var = new i0(fVar, aVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(fVar.k, "onActionWidgetButtonClicked", i0Var, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = this.f21494w;
                b94.s sVar = new b94.s(fVar2, this.f21495x, null, 28);
                this.v = 1;
                Object objB2 = pu7.a.B(fVar2.k, "onCloseActionWidgetClicked", sVar, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
