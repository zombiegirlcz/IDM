package yra;

import aw0.f4;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PushToCardTransferAmountScreen f316172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PushToCardTransferAmountScreen pushToCardTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f316172w = pushToCardTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f316172w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f316172w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f316172w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PushToCardTransferAmountScreen pushToCardTransferAmountScreen = this.f316172w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarJ3 = pushToCardTransferAmountScreen.T2();
                String amount = charSequence.toString();
                x xVar = (x) pVarJ3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                xVar.x2(new yj2.b(new t(xVar, amount, 0), xVar, 27));
                break;
            case 1:
                yof.b payload = (yof.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarJ32 = pushToCardTransferAmountScreen.T2();
                Intrinsics.h(payload);
                x xVar2 = (x) pVarJ32;
                xVar2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                xVar2.l2(new yg6.v(xVar2, payload, null, 21), new yi5.b(26));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarJ33 = pushToCardTransferAmountScreen.T2();
                Intrinsics.h(focusData);
                x xVar3 = (x) pVarJ33;
                xVar3.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                xVar3.A.b(focusData);
                break;
        }
        return Unit.f186387a;
    }
}
