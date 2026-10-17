package jt1;

import aw0.f4;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import jsl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BizumTransferAmountScreen f178289w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(BizumTransferAmountScreen bizumTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178289w = bizumTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f178289w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f178289w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            default:
                m mVar3 = new m(this.f178289w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BizumTransferAmountScreen bizumTransferAmountScreen = this.f178289w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarJ3 = bizumTransferAmountScreen.T2();
                String amount = charSequence.toString();
                z zVar = (z) gVarJ3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                zVar.x2(new jp3.b(new r(zVar, amount, 0), zVar, 11));
                break;
            case 1:
                yof.b payload = (yof.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarJ32 = bizumTransferAmountScreen.T2();
                Intrinsics.h(payload);
                z zVar2 = (z) gVarJ32;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                zVar2.l2(new t0(zVar2, payload, null, 1), new yi5.b(26));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarJ33 = bizumTransferAmountScreen.T2();
                Intrinsics.h(focusData);
                z zVar3 = (z) gVarJ33;
                zVar3.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                zVar3.f178311x.b(focusData);
                break;
        }
        return Unit.f186387a;
    }
}
