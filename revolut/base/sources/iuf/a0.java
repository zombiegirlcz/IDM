package iuf;

import buf.d0;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a f168554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f168554w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(0, this.f168554w, continuation);
            case 1:
                return new a0(1, this.f168554w, continuation);
            case 2:
                return new a0(2, this.f168554w, continuation);
            default:
                return new a0(3, this.f168554w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar = this.f168554w;
                kuf.e eVar = aVar.f92491s;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    y yVar = new y(aVar, 0);
                    z zVar = new z(1, aVar, continuation);
                    this.v = 1;
                    obj2 = n14.k.V(aVar, null, null, yVar, zVar, this, 2);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (hVar instanceof nii.f) {
                    ((kuf.f) eVar).Z2(((nii.f) hVar).f216147b, new is2.t(aVar, 13));
                    return Unit.f186387a;
                }
                if (!(hVar instanceof nii.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                nii.g gVar = (nii.g) hVar;
                n1 n1Var = gVar.f216153b;
                Object obj3 = gVar.f216152a;
                if (n1Var == null || obj3 == null) {
                    return null;
                }
                ((kuf.f) eVar).b3(n1Var, new is6.t(aVar, (k71.i) obj3, 13));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar4 = this.f168554w;
                    z zVar2 = new z(2, aVar4, null);
                    this.v = 1;
                    if (aVar4.p2(this, zVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar6 = this.f168554w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d dVar = aVar6.f92488p;
                    this.v = 1;
                    obj2 = ((guf.m) dVar.f168562b).g(dVar.f168561a.f92484a, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar6.H2(aVar6.f92495y, new d0((ManualTransferRecipient) obj2, 1));
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar8 = this.f168554w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    i5k.a aVar9 = aVar8.f92492t;
                    com.revolut.domain.models.moneyrequest.a.c(aVar8.o.f92484a.f60320l);
                    obj2 = aVar9.b3(aVar8.I2().f92457c.f92304a, true, true, false, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Continuation continuation2 = null;
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                aVar8.l2(new a0(0, aVar8, continuation2), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
