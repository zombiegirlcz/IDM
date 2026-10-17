package rhk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f254519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b f254520x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f254520x = bVar;
        this.f254519w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f254520x, this.f254519w, continuation);
            default:
                return new i(this.f254519w, this.f254520x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x xVar = this.f254520x.f103132p;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f254519w, null, null, this, 6);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    String cardId = this.f254519w;
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    String str = "revolut://app/cards/" + cardId + "/activate-card";
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar = this.f254520x;
                    ajk.b bVar2 = bVar.f103137w;
                    rgf.b bVar3 = new rgf.b(bVar, str, 2);
                    this.v = 1;
                    if (igk.k.b(bVar, bVar2, str, bVar3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f254519w = str;
        this.f254520x = bVar;
    }
}
