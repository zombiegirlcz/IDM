package yra;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f316198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f316198w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f316198w, continuation, 0);
            default:
                return new w(this.f316198w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                x xVar = this.f316198w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    xpa.a aVar2 = xVar.f316203t;
                    CardOwner f81599a = xVar.f316199p.getF81599a();
                    PushToCardTransferData pushToCardTransferDataY2 = xVar.y2();
                    this.v = 1;
                    obj2 = aVar2.Z2(f81599a, pushToCardTransferDataY2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xpa.d dVar = (xpa.d) obj2;
                if (dVar instanceof xpa.c) {
                    xVar.v2(new l(((xpa.c) dVar).f307920a));
                } else if (!Intrinsics.f(dVar, xpa.b.f307919a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    x xVar2 = this.f316198w;
                    xVar2.f316205x.Q();
                    w wVar = new w(xVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(xVar2.X(), "PUSH_TO_CARD_AMOUNT_CTA_BUTTON_TAG", wVar, this) == aVar3) {
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
