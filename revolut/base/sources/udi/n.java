package udi;

import iuf.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b f279216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f279216w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(0, this.f279216w, continuation);
            default:
                return new n(1, this.f279216w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ldi.f fVar = this.f279216w.o;
                    wj0.b bVar = new wj0.b("CLOSE_POINTS_POCKET_IDEMPOTENCY_TAG");
                    this.v = 1;
                    Object objB = ((pdi.k) fVar.f194134a).b(bVar, this);
                    if (objB != aVar) {
                        objB = Unit.f186387a;
                    }
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar2 = this.f279216w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    lic.a aVar3 = new lic.a(bVar2, 17);
                    y yVar = new y(bVar2, 26);
                    n nVar = new n(0, bVar2, null);
                    this.v = 1;
                    obj2 = n14.k.V(bVar2, null, aVar3, yVar, nVar, this, 1);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    bVar2.B2();
                }
                return Unit.f186387a;
        }
    }
}
