package zt4;

import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a f325081w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325081w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f325081w, continuation, 0);
            case 1:
                return new n(this.f325081w, continuation, 1);
            default:
                return new n(this.f325081w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar = this.f325081w;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m mVar = new m(aVar, continuation, i2);
                this.v = 1;
                Object objB = pu7.a.B(aVar.k, "Cancel boleto", mVar, this);
                return objB == aVar2 ? aVar2 : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m mVar2 = new m(aVar, continuation, 2);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar.k, "reload_boleto_details", mVar2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    m mVar3 = new m(aVar, continuation, 4);
                    this.v = 1;
                    obj2 = pu7.a.B(aVar.k, "Share boleto pdf", mVar3, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    return aVar.C1(u0.b(tqi.g.d(aVar.f69549r, null, (File) ((nii.d) eVar).f216133a, "application/pdf", 9)));
                }
                if (!(eVar instanceof nii.c) && eVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i21 = jli.h.f175850a;
                return Unit.f186387a;
        }
    }
}
