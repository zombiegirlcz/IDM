package y7k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a f311559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311559w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f311559w, continuation, 0);
            case 1:
                return new m0(this.f311559w, continuation, 1);
            case 2:
                return new m0(this.f311559w, continuation, 2);
            case 3:
                return new m0(this.f311559w, continuation, 3);
            default:
                return new m0(this.f311559w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = this.f311559w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (aVar.M2(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    int i21 = o0.f311562a[aVar.o.getF102201c().ordinal()];
                    if (i21 == 1) {
                        this.v = 1;
                        if (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.J2(aVar, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.v = 2;
                        if (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.L2(aVar, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    k0 k0Var = new k0(aVar, continuation, i2);
                    this.v = 1;
                    if (aVar.p2(this, k0Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var = new r0(aVar, null);
                    this.v = 1;
                    if (aVar.p2(this, r0Var) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    p8k.a aVar7 = aVar.u;
                    PaymentLinksTransferData transferData = aVar.N2();
                    cli.y yVar = aVar.H;
                    OrderQuote orderQuote = ((r) ((j2) yVar.f22677a).getValue()).f311570c.f311571a;
                    long j2 = ((r) ((j2) yVar.f22677a).getValue()).f311570c.f311572b;
                    p8k.j jVar = (p8k.j) aVar7;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(transferData, "transferData");
                    obj2 = vkm.q.x(vkm.q.Q(jVar.f234180w, new p8k.g(null, jVar, orderQuote, transferData, j2)), this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list = (List) obj2;
                if (list.isEmpty()) {
                    aVar.A.Q();
                    aVar.l2(new m0(aVar, continuation, i3), new yi5.b(26));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unhandled errors when trying to continue Payment Link: " + list);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
