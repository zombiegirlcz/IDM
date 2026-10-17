package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f18797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(a1 a1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18797w = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f18797w, continuation, 0);
            case 1:
                return new e0(this.f18797w, continuation, 1);
            case 2:
                return new e0(this.f18797w, continuation, 2);
            default:
                return new e0(this.f18797w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB2;
        int i = this.u;
        a1 a1Var = this.f18797w;
        Continuation continuation = null;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a aVar2 = a1Var.f18773q;
                    this.v = 1;
                    TransferRequestApprovalData f92462a = aVar2.f92470a.getF92462a();
                    if (f92462a instanceof TransferRequestApprovalData.MoneyRequestApproval) {
                        obj2 = ((guf.m) aVar2.f92471b).g(((TransferRequestApprovalData.MoneyRequestApproval) f92462a).f92452b, this);
                    } else {
                        if (!(f92462a instanceof TransferRequestApprovalData.GroupBillsApproval)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = null;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                a1Var.x2(new d0((ManualTransferRecipient) obj2, 0));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    b94.s sVar = new b94.s(23, continuation, a1Var);
                    this.v = 1;
                    if (a1Var.p2(this, sVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    q0 q0Var = new q0(a1Var, null);
                    this.v = 1;
                    if (a1Var.p2(this, q0Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ag1.k kVarV0 = a1Var.f18774r.v0(a1Var.C2(), ((c) a1Var.t2()).f18786c.f18791a);
                    this.v = 1;
                    obj2 = vkm.q.x(kVarV0, this);
                    if (obj2 == aVar5) {
                        return aVar5;
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
                List list = (List) obj2;
                if (list.isEmpty()) {
                    a1Var.A.Q();
                    this.v = 2;
                    TransferRequestApprovalData transferRequestApprovalData = ((c) a1Var.t2()).f18784a;
                    if (transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval) {
                        objB2 = a1Var.A2((TransferRequestApprovalData.GroupBillsApproval) transferRequestApprovalData, this);
                        if (objB2 != aVar5) {
                            objB2 = Unit.f186387a;
                        }
                    } else {
                        if (!(transferRequestApprovalData instanceof TransferRequestApprovalData.MoneyRequestApproval)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objB2 = a1Var.B2((TransferRequestApprovalData.MoneyRequestApproval) transferRequestApprovalData, this);
                        if (objB2 != aVar5) {
                            objB2 = Unit.f186387a;
                        }
                    }
                    if (objB2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unhandled errors when trying to continue Manual MoneyRequest: " + list);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
