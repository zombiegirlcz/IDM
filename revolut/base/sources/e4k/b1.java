package e4k;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122578w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i, com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f122578w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b1(0, this.f122578w, continuation);
            case 1:
                return new b1(1, this.f122578w, continuation);
            case 2:
                return new b1(2, this.f122578w, continuation);
            case 3:
                return new b1(3, this.f122578w, continuation);
            default:
                return new b1(4, this.f122578w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        int i3 = 0;
        Continuation continuation = null;
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar = this.f122578w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    u0 u0Var = new u0(i2, aVar, continuation);
                    this.v = 1;
                    if (aVar.p2(this, u0Var) == aVar2) {
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
                    this.v = 1;
                    obj2 = com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.y2(aVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                hrf.h hVar = (hrf.h) obj2;
                if (hVar.f154817a.isEmpty()) {
                    this.v = 2;
                    Object objB0 = zh9.u0.b0(aVar.X(), "BANK_TRANSFER_SCHEDULE_AMOUNT_CTA_BUTTON_TAG", new u0(i3, aVar, continuation), this);
                    if (objB0 != aVar3) {
                        objB0 = Unit.f186387a;
                    }
                    if (objB0 == aVar3) {
                        return aVar3;
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unhandled errors when trying to schedule Bank Transfer: ", com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.A2(aVar, hVar)));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u0 u0Var2 = new u0(4, aVar, continuation);
                this.v = 1;
                Object objP2 = aVar.p2(this, u0Var2);
                return objP2 == aVar4 ? aVar4 : objP2;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    skd.i iVar = aVar.L;
                    SlotContext slotContext = new SlotContext(akd.s.PAYMENTS_TRANSFER_REVIEW, zhm.y0.b(aVar.f102080p.getF102077a().f132329a));
                    this.v = 1;
                    if (iVar.d(slotContext, false, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    u0 u0Var3 = new u0(5, aVar, continuation);
                    this.v = 1;
                    if (zh9.u0.b0(aVar.X(), "BANK_TRANSFER_PROCEED_AMOUNT_CTA_BUTTON_TAG", u0Var3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
