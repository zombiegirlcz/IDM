package bec;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.f1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shared.ui.pay_with_any.a f14799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14800x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f14799w = aVar;
        this.f14800x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f14799w, this.f14800x, continuation, 0);
            default:
                return new m0(this.f14799w, this.f14800x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f1 f1Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = this.f14799w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a.I2(aVar2, this.f14800x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                int i2 = j0.f14791a[((i) ((j2) aVar2.v.f22677a).getValue()).f14789j.ordinal()];
                if (i2 == 1) {
                    f1Var = f1.ABOVE_ANCHOR_VIEW;
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1Var = f1.BOTTOM;
                }
                aVar2.X1(new mii.e("CARD_DELETED_CONFIRMATION", new TextLocalisedClause(R$string.revolut_pay_delete_payment_method_confirmation, null, null, 14), f1Var, 12));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar4 = this.f14799w;
                    m0 m0Var = new m0(aVar4, this.f14800x, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, m0Var) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
