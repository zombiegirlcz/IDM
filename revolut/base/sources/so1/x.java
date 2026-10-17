package so1;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a f264695w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264695w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f264695w, continuation, 0);
            default:
                return new x(this.f264695w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar = this.f264695w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    int i5 = 0;
                    t tVar = new t(aVar, i5);
                    u uVar = new u(aVar, i5);
                    w wVar = new w(aVar, continuation, i2);
                    this.v = 1;
                    obj2 = n14.k.P(aVar.X(), null, tVar, uVar, wVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.c) {
                    Throwable th10 = ((nii.c) eVar).f216123a;
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BPAY_REVIEW", null, th10, h0Var);
                    return Unit.f186387a;
                }
                if (!(eVar instanceof nii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ro1.c cVar = (ro1.c) ((nii.d) eVar).f216133a;
                if (cVar == null) {
                    return null;
                }
                aVar.C2(new g(cVar));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    t tVar2 = new t(aVar, i2);
                    u uVar2 = new u(aVar, i2);
                    w wVar2 = new w(aVar, continuation, 3);
                    this.v = 1;
                    obj2 = n14.k.P(aVar.X(), null, tVar2, uVar2, wVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar2 = (nii.e) obj2;
                if (eVar2 instanceof nii.c) {
                    Throwable th11 = ((nii.c) eVar2).f216123a;
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BPAY_REVIEW", null, th11, h0Var2);
                    return Unit.f186387a;
                }
                if (!(eVar2 instanceof nii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ro1.c cVar2 = (ro1.c) ((nii.d) eVar2).f216133a;
                if (cVar2 == null) {
                    return null;
                }
                aVar.C2(new g(cVar2));
                return Unit.f186387a;
        }
    }
}
