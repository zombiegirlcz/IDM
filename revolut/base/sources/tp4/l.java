package tp4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ku1.v;
import nii.c0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a f273275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f273276x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f273275w = aVar;
        this.f273276x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f273275w, this.f273276x, continuation, 0);
            case 1:
                return new l(this.f273275w, this.f273276x, continuation, 1);
            default:
                return new l(this.f273275w, this.f273276x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar2 = this.f273275w;
                    lb5.b bVar = aVar2.f69062p;
                    String str = aVar2.o.f69039a;
                    this.v = 1;
                    if (((yb5.e) bVar).f(str, this.f273276x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar4 = this.f273275w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    k kVar = new k(aVar4, 0);
                    aVar4.f69065s.getClass();
                    c0 c0VarB = vt4.b.b();
                    v vVar = new v(25);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar5 = this.f273275w;
                    l lVar = new l(aVar5, this.f273276x, null, 0);
                    this.v = 1;
                    obj2 = n14.k.T(aVar5, c0VarB, kVar, vVar, lVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (hVar instanceof nii.g) {
                    aVar4.B2();
                } else if (!(hVar instanceof nii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar7 = this.f273275w;
                    l lVar2 = new l(aVar7, this.f273276x, null, 1);
                    this.v = 1;
                    if (ue8.c.f0(aVar7, lVar2, this) == aVar6) {
                        return aVar6;
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
