package jt1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f178301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f178301w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f178301w, continuation, 0);
            case 1:
                return new w(this.f178301w, continuation, 1);
            case 2:
                return new w(this.f178301w, continuation, 2);
            default:
                return new w(this.f178301w, continuation, 3);
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
                z zVar = this.f178301w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b bVar = zVar.f178305p;
                    this.v = 1;
                    BizumTransferAmountContract$InputData bizumTransferAmountContract$InputData = bVar.f61616a;
                    if (bizumTransferAmountContract$InputData instanceof BizumTransferAmountContract$InputData.NewTransfer) {
                        obj2 = bVar.a((BizumTransferAmountContract$InputData.NewTransfer) bizumTransferAmountContract$InputData, this);
                    } else {
                        if (!(bizumTransferAmountContract$InputData instanceof BizumTransferAmountContract$InputData.WithTransferData)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((BizumTransferAmountContract$InputData.WithTransferData) bizumTransferAmountContract$InputData).f61606c;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zVar.x2(new jlh.g((BizumTransferData) obj2, 20));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = this.f178301w;
                    BizumTransferData bizumTransferDataB2 = zVar2.B2();
                    this.v = 1;
                    if (z.A2(zVar2, bizumTransferDataB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                z zVar3 = this.f178301w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = z.y2(zVar3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (BizumTransferReviewInfo) obj2;
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                qt1.a aVar4 = zVar3.f178309t;
                BizumTransferData bizumTransferDataB22 = zVar3.B2();
                this.v = 2;
                obj2 = ((com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b) aVar4).g3(bizumTransferDataB22, this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                return (BizumTransferReviewInfo) obj2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar4 = this.f178301w;
                w wVar = new w(zVar4, null, 2);
                this.v = 1;
                Object objB0 = u0.b0(zVar4.X(), "BIZUM_TRANSFER_AMOUNT_CTA_BUTTON_TAG", wVar, this);
                return objB0 == aVar5 ? aVar5 : objB0;
        }
    }
}
