package x6k;

import do3.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a f303118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f303119x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar, Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        switch (i) {
            case 2:
                this.f303118w = aVar;
                this.f303119x = (i) function1;
                super(1, continuation);
                break;
            default:
                this.f303118w = aVar;
                this.f303119x = (i) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f303119x, this.f303118w, continuation);
            case 1:
                return new g(this.f303118w, this.f303119x, continuation, 1);
            default:
                return new g(this.f303118w, this.f303119x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (this.f303119x.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                this.f303118w.C2(yv9.d.f317153a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ?? r110 = this.f303119x;
                    com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar3 = this.f303118w;
                    g gVar = new g(r110, aVar3, null);
                    this.v = 1;
                    if (q.t(aVar3, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar5 = this.f303118w;
                    g gVar2 = new g(aVar5, this.f303119x, null, 1);
                    this.v = 1;
                    if (aVar5.p2(this, gVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Function1 function1, com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f303119x = (i) function1;
        this.f303118w = aVar;
    }
}
